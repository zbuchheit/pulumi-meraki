// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetInventoryOnboardingCloudMonitoringNetworksItemResult
    {
        /// <summary>
        /// Enrollment string for the network
        /// </summary>
        public readonly string EnrollmentString;
        /// <summary>
        /// Network ID
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// If the network is bound to a config template
        /// </summary>
        public readonly bool IsBoundToConfigTemplate;
        /// <summary>
        /// Network name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Notes for the network
        /// </summary>
        public readonly string Notes;
        /// <summary>
        /// Organization ID
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// List of the product types that the network supports
        /// </summary>
        public readonly ImmutableArray<string> ProductTypes;
        /// <summary>
        /// Network tags
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Timezone of the network
        /// </summary>
        public readonly string TimeZone;
        /// <summary>
        /// URL to the network Dashboard UI
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetInventoryOnboardingCloudMonitoringNetworksItemResult(
            string enrollmentString,

            string id,

            bool isBoundToConfigTemplate,

            string name,

            string notes,

            string organizationId,

            ImmutableArray<string> productTypes,

            ImmutableArray<string> tags,

            string timeZone,

            string url)
        {
            EnrollmentString = enrollmentString;
            Id = id;
            IsBoundToConfigTemplate = isBoundToConfigTemplate;
            Name = name;
            Notes = notes;
            OrganizationId = organizationId;
            ProductTypes = productTypes;
            Tags = tags;
            TimeZone = timeZone;
            Url = url;
        }
    }
}