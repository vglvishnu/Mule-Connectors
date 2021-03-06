
package org.mule.modules.jira.generated.connectivity;

import javax.annotation.Generated;
import org.mule.devkit.internal.connection.management.ConnectionManagementConnectionKey;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-10-05T09:48:52-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class ConnectionManagementConfigJiraTestConnectorConnectionKey implements ConnectionManagementConnectionKey
{

    /**
     * 
     */
    private String username;
    /**
     * 
     */
    private String password;
    /**
     * 
     */
    private String serverUri;

    public ConnectionManagementConfigJiraTestConnectorConnectionKey(String username, String password, String serverUri) {
        this.username = username;
        this.password = password;
        this.serverUri = serverUri;
    }

    /**
     * Sets username
     * 
     * @param value Value to set
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Retrieves username
     * 
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Sets serverUri
     * 
     * @param value Value to set
     */
    public void setServerUri(String value) {
        this.serverUri = value;
    }

    /**
     * Retrieves serverUri
     * 
     */
    public String getServerUri() {
        return this.serverUri;
    }

    /**
     * Sets password
     * 
     * @param value Value to set
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Retrieves password
     * 
     */
    public String getPassword() {
        return this.password;
    }

    @Override
    public int hashCode() {
        int result = ((this.username!= null)?this.username.hashCode(): 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionManagementConfigJiraTestConnectorConnectionKey)) {
            return false;
        }
        ConnectionManagementConfigJiraTestConnectorConnectionKey that = ((ConnectionManagementConfigJiraTestConnectorConnectionKey) o);
        if (((this.username!= null)?(!this.username.equals(that.username)):(that.username!= null))) {
            return false;
        }
        return true;
    }

}
