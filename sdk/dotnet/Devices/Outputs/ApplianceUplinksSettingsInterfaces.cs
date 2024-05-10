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
    public sealed class ApplianceUplinksSettingsInterfaces
    {
        /// <summary>
        /// WAN 1 settings.
        /// </summary>
        public readonly Outputs.ApplianceUplinksSettingsInterfacesWan1? Wan1;
        /// <summary>
        /// WAN 2 settings.
        /// </summary>
        public readonly Outputs.ApplianceUplinksSettingsInterfacesWan2? Wan2;

        [OutputConstructor]
        private ApplianceUplinksSettingsInterfaces(
            Outputs.ApplianceUplinksSettingsInterfacesWan1? wan1,

            Outputs.ApplianceUplinksSettingsInterfacesWan2? wan2)
        {
            Wan1 = wan1;
            Wan2 = wan2;
        }
    }
}
