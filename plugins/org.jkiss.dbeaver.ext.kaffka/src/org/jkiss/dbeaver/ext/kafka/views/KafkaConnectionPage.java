/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ext.kafka.views;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.jkiss.dbeaver.ext.kafka.Activator;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageAbstract;
import org.jkiss.utils.CommonUtils;

public class KafkaConnectionPage extends ConnectionPageAbstract {
	public static final String DEFAULT_HOST = "localhost"; //$NON-NLS-1$
	private Text hostText;

	private static ImageDescriptor logoImage = Activator.getImageDescriptor("icons/kafka_big.jpg"); //$NON-NLS-1$

	public KafkaConnectionPage() {
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void createControl(Composite composite) {

		setImageDescriptor(logoImage);

		ModifyListener textListener = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				evaluateURL();
			}
		};

		Composite addrGroup = new Composite(composite, SWT.NONE);
		GridLayout gl = new GridLayout(4, false);
		gl.marginHeight = 10;
		gl.marginWidth = 10;
		addrGroup.setLayout(gl);
		GridData gd = new GridData(GridData.FILL_BOTH);
		addrGroup.setLayoutData(gd);

		UIUtils.createToolButton(addrGroup, "Select properties file", new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				loadProperties();
			}
		});

		Label hostLabel = UIUtils.createControlLabel(addrGroup, "bootstrap.servers");
		hostLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

		hostText = new Text(addrGroup, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.grabExcessHorizontalSpace = true;
		hostText.setLayoutData(gd);
		hostText.addModifyListener(textListener);

		Label divLabel = new Label(addrGroup, SWT.SEPARATOR | SWT.SHADOW_OUT | SWT.HORIZONTAL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalSpan = 4;
		divLabel.setLayoutData(gd);

		setControl(addrGroup);
	}

	private void loadProperties() {
		FileDialog fd = new FileDialog(getShell(), SWT.OPEN);
		fd.setText("Select kafka connection properties file");
		fd.setFilterPath(new File(".").getAbsolutePath());
		String[] filterExt = { "*.properties" };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();
		if (selected != null) {
			String selectedFile = fd.getFileName();
			Properties properties = new Properties();
			try {
				properties.load(new FileInputStream(selectedFile));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public boolean isComplete() {
		return hostText != null;
	}

	@Override
	public void loadSettings() {
		DBPDataSourceContainer activeDataSource = site.getActiveDataSource();
		DBPConnectionConfiguration connectionInfo = activeDataSource.getConnectionConfiguration();
		if (connectionInfo.getHostName() == null) {
			connectionInfo.setHostName(DEFAULT_HOST);
		}

		if (hostText != null) {
			hostText.setText(CommonUtils.notEmpty(connectionInfo.getHostName()));
		}

		super.loadSettings();
	}

	@Override
	public void saveSettings(DBPDataSourceContainer dataSource) {
		DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
		if (hostText != null) {
			connectionInfo.getProperties().put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, hostText.getText().trim());
			connectionInfo.setHostName(hostText.getText().trim());
		}

		super.saveSettings(dataSource);
	}

	private void evaluateURL() {
		site.updateButtons();
	}

}
