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
    public sealed class GroupPoliciesContentFiltering
    {
        /// <summary>
        /// Settings for allowed URL patterns
        /// </summary>
        public readonly Outputs.GroupPoliciesContentFilteringAllowedUrlPatterns? AllowedUrlPatterns;
        /// <summary>
        /// Settings for blocked URL categories
        /// </summary>
        public readonly Outputs.GroupPoliciesContentFilteringBlockedUrlCategories? BlockedUrlCategories;
        /// <summary>
        /// Settings for blocked URL patterns
        /// </summary>
        public readonly Outputs.GroupPoliciesContentFilteringBlockedUrlPatterns? BlockedUrlPatterns;

        [OutputConstructor]
        private GroupPoliciesContentFiltering(
            Outputs.GroupPoliciesContentFilteringAllowedUrlPatterns? allowedUrlPatterns,

            Outputs.GroupPoliciesContentFilteringBlockedUrlCategories? blockedUrlCategories,

            Outputs.GroupPoliciesContentFilteringBlockedUrlPatterns? blockedUrlPatterns)
        {
            AllowedUrlPatterns = allowedUrlPatterns;
            BlockedUrlCategories = blockedUrlCategories;
            BlockedUrlPatterns = blockedUrlPatterns;
        }
    }
}
