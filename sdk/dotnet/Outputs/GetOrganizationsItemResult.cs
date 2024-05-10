// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Outputs
{

    [OutputType]
    public sealed class GetOrganizationsItemResult
    {
        /// <summary>
        /// API related settings
        /// </summary>
        public readonly Outputs.GetOrganizationsItemApiResult Api;
        /// <summary>
        /// Data for this organization
        /// </summary>
        public readonly Outputs.GetOrganizationsItemCloudResult Cloud;
        /// <summary>
        /// Organization ID
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Licensing related settings
        /// </summary>
        public readonly Outputs.GetOrganizationsItemLicensingResult Licensing;
        /// <summary>
        /// Information about the organization's management system
        /// </summary>
        public readonly Outputs.GetOrganizationsItemManagementResult Management;
        /// <summary>
        /// Organization name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Organization URL
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetOrganizationsItemResult(
            Outputs.GetOrganizationsItemApiResult api,

            Outputs.GetOrganizationsItemCloudResult cloud,

            string id,

            Outputs.GetOrganizationsItemLicensingResult licensing,

            Outputs.GetOrganizationsItemManagementResult management,

            string name,

            string url)
        {
            Api = api;
            Cloud = cloud;
            Id = id;
            Licensing = licensing;
            Management = management;
            Name = name;
            Url = url;
        }
    }
}
