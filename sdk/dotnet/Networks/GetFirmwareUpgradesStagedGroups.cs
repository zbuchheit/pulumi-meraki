// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetFirmwareUpgradesStagedGroups
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetFirmwareUpgradesStagedGroupsResult> InvokeAsync(GetFirmwareUpgradesStagedGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFirmwareUpgradesStagedGroupsResult>("meraki:networks/getFirmwareUpgradesStagedGroups:getFirmwareUpgradesStagedGroups", args ?? new GetFirmwareUpgradesStagedGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetFirmwareUpgradesStagedGroupsResult> Invoke(GetFirmwareUpgradesStagedGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirmwareUpgradesStagedGroupsResult>("meraki:networks/getFirmwareUpgradesStagedGroups:getFirmwareUpgradesStagedGroups", args ?? new GetFirmwareUpgradesStagedGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFirmwareUpgradesStagedGroupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// groupId path parameter. Group ID
        /// </summary>
        [Input("groupId")]
        public string? GroupId { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public string? NetworkId { get; set; }

        public GetFirmwareUpgradesStagedGroupsArgs()
        {
        }
        public static new GetFirmwareUpgradesStagedGroupsArgs Empty => new GetFirmwareUpgradesStagedGroupsArgs();
    }

    public sealed class GetFirmwareUpgradesStagedGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// groupId path parameter. Group ID
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        public GetFirmwareUpgradesStagedGroupsInvokeArgs()
        {
        }
        public static new GetFirmwareUpgradesStagedGroupsInvokeArgs Empty => new GetFirmwareUpgradesStagedGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFirmwareUpgradesStagedGroupsResult
    {
        /// <summary>
        /// groupId path parameter. Group ID
        /// </summary>
        public readonly string? GroupId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetFirmwareUpgradesStagedGroupsItemResult Item;
        /// <summary>
        /// Array of ResponseNetworksGetNetworkFirmwareUpgradesStagedGroups
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirmwareUpgradesStagedGroupsItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string? NetworkId;

        [OutputConstructor]
        private GetFirmwareUpgradesStagedGroupsResult(
            string? groupId,

            string id,

            Outputs.GetFirmwareUpgradesStagedGroupsItemResult item,

            ImmutableArray<Outputs.GetFirmwareUpgradesStagedGroupsItemResult> items,

            string? networkId)
        {
            GroupId = groupId;
            Id = id;
            Item = item;
            Items = items;
            NetworkId = networkId;
        }
    }
}
