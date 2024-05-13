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
    public sealed class WirelessSsidsDot11r
    {
        /// <summary>
        /// (Optional) Whether 802.11r is adaptive or not.
        /// </summary>
        public readonly bool? Adaptive;
        /// <summary>
        /// Whether 802.11r is enabled or not.
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private WirelessSsidsDot11r(
            bool? adaptive,

            bool? enabled)
        {
            Adaptive = adaptive;
            Enabled = enabled;
        }
    }
}