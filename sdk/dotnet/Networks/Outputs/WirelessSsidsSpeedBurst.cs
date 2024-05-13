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
    public sealed class WirelessSsidsSpeedBurst
    {
        /// <summary>
        /// Boolean indicating whether or not to allow users to temporarily exceed the bandwidth limit for short periods while still keeping them under the bandwidth limit over time.
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private WirelessSsidsSpeedBurst(bool? enabled)
        {
            Enabled = enabled;
        }
    }
}