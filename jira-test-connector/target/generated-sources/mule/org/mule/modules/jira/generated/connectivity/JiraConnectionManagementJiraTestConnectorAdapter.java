
package org.mule.modules.jira.generated.connectivity;

import javax.annotation.Generated;
import org.mule.api.ConnectionException;
import org.mule.devkit.internal.connection.management.ConnectionManagementConnectionAdapter;
import org.mule.devkit.internal.connection.management.TestableConnection;
import org.mule.modules.jira.config.JiraConnectionManagement;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-10-05T09:48:52-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class JiraConnectionManagementJiraTestConnectorAdapter
    extends JiraConnectionManagement
    implements ConnectionManagementConnectionAdapter<JiraConnectionManagement, ConnectionManagementConfigJiraTestConnectorConnectionKey> , TestableConnection<ConnectionManagementConfigJiraTestConnectorConnectionKey>
{


    @Override
    public JiraConnectionManagement getStrategy() {
        return this;
    }

    @Override
    public void test(ConnectionManagementConfigJiraTestConnectorConnectionKey connectionKey)
        throws ConnectionException
    {
        super.connect(connectionKey.getUsername(), connectionKey.getPassword(), connectionKey.getServerUri());
    }

    @Override
    public void connect(ConnectionManagementConfigJiraTestConnectorConnectionKey connectionKey)
        throws ConnectionException
    {
        super.connect(connectionKey.getUsername(), connectionKey.getPassword(), connectionKey.getServerUri());
    }

    @Override
    public void disconnect() {
        super.disconnect();
    }

    @Override
    public String connectionId() {
        return super.connectionId();
    }

    @Override
    public boolean isConnected() {
        return super.isConnected();
    }

}
