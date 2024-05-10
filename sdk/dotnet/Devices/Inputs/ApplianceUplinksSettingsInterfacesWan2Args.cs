// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class ApplianceUplinksSettingsInterfacesWan2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable or disable the interface.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Configuration options for PPPoE.
        /// </summary>
        [Input("pppoe")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesWan2PppoeArgs>? Pppoe { get; set; }

        /// <summary>
        /// SVI settings by protocol.
        /// </summary>
        [Input("svis")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesWan2SvisArgs>? Svis { get; set; }

        /// <summary>
        /// VLAN tagging settings.
        /// </summary>
        [Input("vlanTagging")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs>? VlanTagging { get; set; }

        public ApplianceUplinksSettingsInterfacesWan2Args()
        {
        }
        public static new ApplianceUplinksSettingsInterfacesWan2Args Empty => new ApplianceUplinksSettingsInterfacesWan2Args();
    }
}
