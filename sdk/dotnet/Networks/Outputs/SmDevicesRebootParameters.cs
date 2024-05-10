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
    public sealed class SmDevicesRebootParameters
    {
        /// <summary>
        /// The ids of the endpoints to be rebooted.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The KextPaths of the endpoints to be rebooted. Available for macOS 11+
        /// </summary>
        public readonly ImmutableArray<string> KextPaths;
        /// <summary>
        /// Whether or not to notify the user before rebooting the endpoint. Available for macOS 11.3+
        /// </summary>
        public readonly bool? NotifyUser;
        /// <summary>
        /// Whether or not to rebuild the kernel cache when rebooting the endpoint. Available for macOS 11+
        /// </summary>
        public readonly bool? RebuildKernelCache;
        /// <summary>
        /// Whether or not the request requires network tethering. Available for macOS and supervised iOS or tvOS
        /// </summary>
        public readonly bool? RequestRequiresNetworkTether;
        /// <summary>
        /// The scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags of the endpoints to be rebooted.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;
        /// <summary>
        /// The serials of the endpoints to be rebooted.
        /// </summary>
        public readonly ImmutableArray<string> Serials;
        /// <summary>
        /// The wifiMacs of the endpoints to be rebooted.
        /// </summary>
        public readonly ImmutableArray<string> WifiMacs;

        [OutputConstructor]
        private SmDevicesRebootParameters(
            ImmutableArray<string> ids,

            ImmutableArray<string> kextPaths,

            bool? notifyUser,

            bool? rebuildKernelCache,

            bool? requestRequiresNetworkTether,

            ImmutableArray<string> scopes,

            ImmutableArray<string> serials,

            ImmutableArray<string> wifiMacs)
        {
            Ids = ids;
            KextPaths = kextPaths;
            NotifyUser = notifyUser;
            RebuildKernelCache = rebuildKernelCache;
            RequestRequiresNetworkTether = requestRequiresNetworkTether;
            Scopes = scopes;
            Serials = serials;
            WifiMacs = wifiMacs;
        }
    }
}
