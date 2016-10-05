
package org.mule.modules.jira.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.jira.JiraTestConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>JiraTestConnectorProcessAdapter</code> is a wrapper around {@link JiraTestConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-10-04T11:25:48-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class JiraTestConnectorProcessAdapter
    extends JiraTestConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<JiraTestConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, JiraTestConnectorCapabilitiesAdapter> getProcessTemplate() {
        final JiraTestConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,JiraTestConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, JiraTestConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, JiraTestConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
