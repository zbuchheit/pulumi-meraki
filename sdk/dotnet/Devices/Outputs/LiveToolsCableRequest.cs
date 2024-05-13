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
    public sealed class LiveToolsCableRequest
    {
        /// <summary>
        /// A list of ports for which to perform the cable test.
        /// </summary>
        public readonly ImmutableArray<string> Ports;
        /// <summary>
        /// Device serial number
        /// </summary>
        public readonly string? Serial;

        [OutputConstructor]
        private LiveToolsCableRequest(
            ImmutableArray<string> ports,

            string? serial)
        {
            Ports = ports;
            Serial = serial;
        }
    }
}