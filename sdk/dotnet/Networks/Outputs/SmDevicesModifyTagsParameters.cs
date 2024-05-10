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
    public sealed class SmDevicesModifyTagsParameters
    {
        /// <summary>
        /// The ids of the devices to be modified.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags of the devices to be modified.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;
        /// <summary>
        /// The serials of the devices to be modified.
        /// </summary>
        public readonly ImmutableArray<string> Serials;
        /// <summary>
        /// The tags to be added, deleted, or updated.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// One of add, delete, or update. Only devices that have been modified will be returned.
        /// </summary>
        public readonly string? UpdateAction;
        /// <summary>
        /// The wifiMacs of the devices to be modified.
        /// </summary>
        public readonly ImmutableArray<string> WifiMacs;

        [OutputConstructor]
        private SmDevicesModifyTagsParameters(
            ImmutableArray<string> ids,

            ImmutableArray<string> scopes,

            ImmutableArray<string> serials,

            ImmutableArray<string> tags,

            string? updateAction,

            ImmutableArray<string> wifiMacs)
        {
            Ids = ids;
            Scopes = scopes;
            Serials = serials;
            Tags = tags;
            UpdateAction = updateAction;
            WifiMacs = wifiMacs;
        }
    }
}
