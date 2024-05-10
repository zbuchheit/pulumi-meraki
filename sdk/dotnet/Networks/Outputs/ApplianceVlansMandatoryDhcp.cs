// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class ApplianceVlansMandatoryDhcp
    {
        /// <summary>
        /// Enable Mandatory DHCP on VLAN.
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private ApplianceVlansMandatoryDhcp(bool? enabled)
        {
            Enabled = enabled;
        }
    }
}
