package org.mule.modules.jira.config;

import org.mule.api.annotations.components.ConnectionManagement;
import org.mule.api.annotations.TestConnectivity;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.param.ConnectionKey;
import org.mule.api.annotations.param.Default;
import org.mule.api.context.MuleContextAware;

import com.atlassian.jira.rest.client.api.AuthenticationHandler;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClientFactory;
import com.atlassian.jira.rest.client.auth.BasicHttpAuthenticationHandler;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;

import java.net.URI;
import java.net.URISyntaxException;

import org.mule.api.ConnectionException;
import org.mule.api.ConnectionExceptionCode;
import org.mule.api.MuleContext;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Password;

@ConnectionManagement(friendlyName = "Configuration")
public class JiraConnectionManagement implements MuleContextAware {
	



	public boolean isUseSSL() {
		return useSSL;
	}

	public void setUseSSL(boolean useSSL) {
		this.useSSL = useSSL;
	}

	@Configurable
    @Default("true")
    @FriendlyName("Use SSL")
    private boolean useSSL;
	
	/**
     * Connect
     *
     * @param username A username
     * @param password A password
     * @throws ConnectionException
     */
	
	private JiraRestClientFactory factory ;
	private JiraRestClient jiraClient;
	
    @Connect
    @TestConnectivity
    public void connect(@ConnectionKey String username, @Password String password,String serverUri)
        throws ConnectionException {
        /*
         * CODE FOR ESTABLISHING A CONNECTION GOES IN HERE
         */
    	
    	factory  = new AsynchronousJiraRestClientFactory();
    	try {
			jiraClient = factory.createWithBasicHttpAuthentication(new URI(serverUri), username, password);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ConnectionException(ConnectionExceptionCode.CANNOT_REACH, null, "Bad credentials", e);
		}	
//    	AuthenticationHandler basicAuthHandler = new BasicHttpAuthenticationHandler(username,password);
//    	jiraClient = factory.create(serverUri, basicAuthHandler);
    }

    /**
     * Disconnect
     */
    @Disconnect
    public void disconnect() {
        /*
         * CODE FOR CLOSING A CONNECTION GOES IN HERE
         */
    	if (jiraClient  != null) {
    		
    		jiraClient = null;
    	}
    }

    /**
     * Are we connected
     */
    @ValidateConnection
    public boolean isConnected() {
        //TODO: Change it to reflect that we are connected.
        return jiraClient != null;
    }

    /**
     * Are we connected
     */
    @ConnectionIdentifier
    public String connectionId() {
        return "001";
    }

	@Override
	public void setMuleContext(MuleContext arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public JiraRestClient getJiraRestClient(){
		
		return this.jiraClient;
	}

}