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
    public sealed class ApplianceFirewallSettingsSpoofingProtection
    {
        /// <summary>
        /// IP source address spoofing settings
        /// </summary>
        public readonly Outputs.ApplianceFirewallSettingsSpoofingProtectionIpSourceGuard? IpSourceGuard;

        [OutputConstructor]
        private ApplianceFirewallSettingsSpoofingProtection(Outputs.ApplianceFirewallSettingsSpoofingProtectionIpSourceGuard? ipSourceGuard)
        {
            IpSourceGuard = ipSourceGuard;
        }
    }
}
