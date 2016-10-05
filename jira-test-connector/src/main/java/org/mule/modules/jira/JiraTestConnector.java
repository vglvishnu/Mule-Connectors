package org.mule.modules.jira;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.ConnectionStrategy;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.jira.config.ConnectorConfig;

import com.sun.istack.NotNull;

@Connector(name="jira", friendlyName="Jira-Test")
public class JiraTestConnector {

	@NotNull
	@ConnectionStrategy
    ConnectorConfig config;

    /**
     * Dummy operation to avoid compilation issues since @Connector need at least one @Processor, @Transformer or @Source
     */
    @Processor
    public void foo() {
        // TODO REMOVE THIS
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}