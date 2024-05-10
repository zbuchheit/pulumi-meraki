// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetApplianceUplinksSettingsItemInterfacesWan1VlanTaggingResult
    {
        /// <summary>
        /// Whether VLAN tagging is enabled.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The ID of the VLAN to use for VLAN tagging.
        /// </summary>
        public readonly int VlanId;

        [OutputConstructor]
        private GetApplianceUplinksSettingsItemInterfacesWan1VlanTaggingResult(
            bool enabled,

            int vlanId)
        {
            Enabled = enabled;
            VlanId = vlanId;
        }
    }
}
