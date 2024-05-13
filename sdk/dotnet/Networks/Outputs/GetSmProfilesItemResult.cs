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
    public sealed class GetSmProfilesItemResult
    {
        /// <summary>
        /// Description of a profile.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// ID of a profile.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of a profile.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Payloads in the profile.
        /// </summary>
        public readonly ImmutableArray<string> PayloadTypes;
        /// <summary>
        /// Scope of a profile.
        /// </summary>
        public readonly string Scope;
        /// <summary>
        /// Tags of a profile.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetSmProfilesItemResult(
            string description,

            string id,

            string name,

            ImmutableArray<string> payloadTypes,

            string scope,

            ImmutableArray<string> tags)
        {
            Description = description;
            Id = id;
            Name = name;
            PayloadTypes = payloadTypes;
            Scope = scope;
            Tags = tags;
        }
    }
}