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
    public sealed class SmDevicesShutdownParameters
    {
        /// <summary>
        /// The ids of the endpoints to be shutdown.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags of the endpoints to be shutdown.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;
        /// <summary>
        /// The serials of the endpoints to be shutdown.
        /// </summary>
        public readonly ImmutableArray<string> Serials;
        /// <summary>
        /// The wifiMacs of the endpoints to be shutdown.
        /// </summary>
        public readonly ImmutableArray<string> WifiMacs;

        [OutputConstructor]
        private SmDevicesShutdownParameters(
            ImmutableArray<string> ids,

            ImmutableArray<string> scopes,

            ImmutableArray<string> serials,

            ImmutableArray<string> wifiMacs)
        {
            Ids = ids;
            Scopes = scopes;
            Serials = serials;
            WifiMacs = wifiMacs;
        }
    }
}
