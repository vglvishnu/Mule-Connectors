
package org.mule.modules.jira.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.jira.JiraTestConnector;


/**
 * A <code>JiraTestConnectorCapabilitiesAdapter</code> is a wrapper around {@link JiraTestConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-10-05T09:48:52-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class JiraTestConnectorCapabilitiesAdapter
    extends JiraTestConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        if (capability == ModuleCapability.CONNECTION_MANAGEMENT_CAPABLE) {
            return true;
        }
        return false;
    }

}
