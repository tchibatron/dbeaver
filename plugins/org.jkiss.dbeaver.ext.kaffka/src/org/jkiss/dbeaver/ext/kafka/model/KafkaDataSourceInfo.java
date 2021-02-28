package org.jkiss.dbeaver.ext.kafka.model;

import org.jkiss.dbeaver.model.DBPDataSourceInfo;
import org.jkiss.dbeaver.model.DBPTransactionIsolation;

import java.util.Collection;

public class KafkaDataSourceInfo implements DBPDataSourceInfo {
    public boolean isReadOnlyData() {
        return false;
    }

    public boolean isReadOnlyMetaData() {
        return false;
    }

    public String getDatabaseProductName() {
        return null;
    }

    public String getDatabaseProductVersion() {
        return null;
    }

    public Version getDatabaseVersion() {
        return null;
    }

    public String getDriverName() {
        return null;
    }

    public String getDriverVersion() {
        return null;
    }

    public String getSchemaTerm() {
        return null;
    }

    public String getProcedureTerm() {
        return null;
    }

    public String getCatalogTerm() {
        return null;
    }

    public boolean supportsTransactions() {
        return false;
    }

    public boolean supportsSavepoints() {
        return false;
    }

    public boolean supportsReferentialIntegrity() {
        return false;
    }

    public boolean supportsIndexes() {
        return false;
    }

    public boolean supportsStoredCode() {
        return false;
    }

    public Collection<DBPTransactionIsolation> getSupportedTransactionsIsolation() {
        return null;
    }

    public boolean supportsBatchUpdates() {
        return false;
    }

    public boolean supportsResultSetLimit() {
        return false;
    }

    public boolean supportsResultSetScroll() {
        return false;
    }

    public boolean isDynamicMetadata() {
        return false;
    }

    public boolean supportsMultipleResults() {
        return false;
    }

    public boolean isMultipleResultsFetchBroken() {
        return false;
    }
}
