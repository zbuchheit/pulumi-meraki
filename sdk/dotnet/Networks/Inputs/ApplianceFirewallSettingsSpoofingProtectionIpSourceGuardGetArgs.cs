// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceFirewallSettingsSpoofingProtectionIpSourceGuardGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Mode of protection
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        public ApplianceFirewallSettingsSpoofingProtectionIpSourceGuardGetArgs()
        {
        }
        public static new ApplianceFirewallSettingsSpoofingProtectionIpSourceGuardGetArgs Empty => new ApplianceFirewallSettingsSpoofingProtectionIpSourceGuardGetArgs();
    }
}