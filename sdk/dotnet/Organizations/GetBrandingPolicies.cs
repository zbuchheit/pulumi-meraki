// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetBrandingPolicies
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetBrandingPoliciesResult> InvokeAsync(GetBrandingPoliciesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBrandingPoliciesResult>("meraki:organizations/getBrandingPolicies:getBrandingPolicies", args ?? new GetBrandingPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetBrandingPoliciesResult> Invoke(GetBrandingPoliciesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBrandingPoliciesResult>("meraki:organizations/getBrandingPolicies:getBrandingPolicies", args ?? new GetBrandingPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBrandingPoliciesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// brandingPolicyId path parameter. Branding policy ID
        /// </summary>
        [Input("brandingPolicyId")]
        public string? BrandingPolicyId { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public string? OrganizationId { get; set; }

        public GetBrandingPoliciesArgs()
        {
        }
        public static new GetBrandingPoliciesArgs Empty => new GetBrandingPoliciesArgs();
    }

    public sealed class GetBrandingPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// brandingPolicyId path parameter. Branding policy ID
        /// </summary>
        [Input("brandingPolicyId")]
        public Input<string>? BrandingPolicyId { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        public GetBrandingPoliciesInvokeArgs()
        {
        }
        public static new GetBrandingPoliciesInvokeArgs Empty => new GetBrandingPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetBrandingPoliciesResult
    {
        /// <summary>
        /// brandingPolicyId path parameter. Branding policy ID
        /// </summary>
        public readonly string? BrandingPolicyId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetBrandingPoliciesItemResult Item;
        /// <summary>
        /// Array of ResponseOrganizationsGetOrganizationBrandingPolicies
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBrandingPoliciesItemResult> Items;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string? OrganizationId;

        [OutputConstructor]
        private GetBrandingPoliciesResult(
            string? brandingPolicyId,

            string id,

            Outputs.GetBrandingPoliciesItemResult item,

            ImmutableArray<Outputs.GetBrandingPoliciesItemResult> items,

            string? organizationId)
        {
            BrandingPolicyId = brandingPolicyId;
            Id = id;
            Item = item;
            Items = items;
            OrganizationId = organizationId;
        }
    }
}
