// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class ApplianceUplinksSettingsInterfacesWan1SvisIpv4NameserversArgs : global::Pulumi.ResourceArgs
    {
        [Input("addresses")]
        private InputList<string>? _addresses;

        /// <summary>
        /// Up to 2 nameserver addresses to use, ordered in priority from highest to lowest priority.
        /// </summary>
        public InputList<string> Addresses
        {
            get => _addresses ?? (_addresses = new InputList<string>());
            set => _addresses = value;
        }

        public ApplianceUplinksSettingsInterfacesWan1SvisIpv4NameserversArgs()
        {
        }
        public static new ApplianceUplinksSettingsInterfacesWan1SvisIpv4NameserversArgs Empty => new ApplianceUplinksSettingsInterfacesWan1SvisIpv4NameserversArgs();
    }
}
