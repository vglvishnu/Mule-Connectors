package org.mule.modules.jira;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.ConnectionStrategy;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.jira.config.JiraConnectionManagement;

import com.atlassian.jira.rest.client.api.IssueRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.input.IssueInput;



@Connector(name="jira", friendlyName="Jira-Test")
public class JiraTestConnector {

	
	@ConnectionStrategy
    private JiraConnectionManagement connectionManagement;
	private JiraRestClient jiraClient ;
	
	
    /**
     * Dummy operation to avoid compilation issues since @Connector need at least one @Processor, @Transformer or @Source
     */
    @Processor
    public void foo() {
        // TODO REMOVE THIS
    }
    @Processor
    public String createIssue(String description) {
    	
    	IssueRestClient issueClient =jiraClient.getIssueClient();
    	IssueInput issueInput;
    	//issueClient.createIssue(issue);
		return "BIZ-1000";
    	
    }
    public JiraConnectionManagement getConnectionManagement() {
        return connectionManagement;
    }

    public void setConnectionManagement(JiraConnectionManagement connectionManagement) {
        this.connectionManagement = connectionManagement;
        this.jiraClient = connectionManagement.getJiraRestClient();
    }

}