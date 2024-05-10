// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class ApplianceUplinksSettingsInterfacesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// WAN 1 settings.
        /// </summary>
        [Input("wan1")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesWan1Args>? Wan1 { get; set; }

        /// <summary>
        /// WAN 2 settings.
        /// </summary>
        [Input("wan2")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesWan2Args>? Wan2 { get; set; }

        public ApplianceUplinksSettingsInterfacesArgs()
        {
        }
        public static new ApplianceUplinksSettingsInterfacesArgs Empty => new ApplianceUplinksSettingsInterfacesArgs();
    }
}
