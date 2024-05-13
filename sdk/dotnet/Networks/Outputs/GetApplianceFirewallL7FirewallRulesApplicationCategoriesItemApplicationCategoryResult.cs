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
    public sealed class GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryResult
    {
        /// <summary>
        /// Details of the associated applications
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplicationResult> Applications;
        /// <summary>
        /// The id of the category
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the category
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryResult(
            ImmutableArray<Outputs.GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplicationResult> applications,

            string id,

            string name)
        {
            Applications = applications;
            Id = id;
            Name = name;
        }
    }
}