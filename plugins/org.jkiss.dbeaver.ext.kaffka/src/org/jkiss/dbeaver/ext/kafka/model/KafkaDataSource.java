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
package org.jkiss.dbeaver.ext.kafka.model;

import org.eclipse.core.runtime.IAdaptable;
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.DBPDataSourceInfo;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.impl.AbstractExecutionContext;
import org.jkiss.dbeaver.model.meta.Association;
import org.jkiss.dbeaver.model.qm.QMUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.sql.SQLDataSource;
import org.jkiss.dbeaver.model.sql.SQLDialect;
import org.jkiss.dbeaver.model.struct.DBSInstance;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
import org.jkiss.wmi.service.WMIService;

import java.util.Collection;
import java.util.Collections;

/**
 * KafkaDataSource
 */
public class KafkaDataSource implements DBPDataSource, DBSInstance, DBCExecutionContext {
    private final DBPDataSourceContainer container;
//    private WMINamespace rootNamespace;
    private final SQLDialect dialect;
    private final long id;

    public KafkaDataSource(DBPDataSourceContainer container) throws DBException {
        this.container = container;
        this.dialect = null;
        this.id = AbstractExecutionContext.generateContextId();

        //QMUtils.getDefaultHandler().handleContextOpen(this, false);
    }


    public DBPDataSourceContainer getContainer() {
        return container;
    }

    public DBPDataSourceInfo getInfo() {
        return new KafkaDataSourceInfo();
    }

    public Object getDataSourceFeature(String featureId) {
        return null;
    }

    public void initialize(DBRProgressMonitor monitor) throws DBException {
        //TODO: initialize here kafka admin

    }

    public DBSInstance getDefaultInstance() {
        return this;
    }

    public Collection<? extends DBSInstance> getAvailableInstances() {
        return Collections.singletonList(this);
    }

    public DBCExecutionContext getDefaultContext(boolean meta) {
        return this;
    }

    public DBCExecutionContext[] getAllContexts() {
        return new DBCExecutionContext[0];
    }

    public DBCExecutionContext openIsolatedContext(DBRProgressMonitor monitor, String purpose) throws DBException {
        return this;
    }

    public void shutdown(DBRProgressMonitor monitor) {
        this.close();
    }

    public String getDescription() {
        return null;
    }

    public DBSObject getParentObject() {
        return container;
    }

    public long getContextId() {
        return 0;
    }

    public String getContextName() {
        return null;
    }

    public DBPDataSource getDataSource() {
        return null;
    }

    public DBSInstance getOwnerInstance() {
        return null;
    }

    public boolean isConnected() {
        return false;
    }

    public DBCSession openSession(DBRProgressMonitor monitor, DBCExecutionPurpose purpose, String task) {
        return null;
    }

    public void checkContextAlive(DBRProgressMonitor monitor) throws DBException {

    }

    public InvalidateResult invalidateContext(DBRProgressMonitor monitor, boolean closeOnFailure) throws DBException {
        return null;
    }

    public String getName() {
        return null;
    }

    public boolean isPersisted() {
        return false;
    }

    public void close() {

    }
}
