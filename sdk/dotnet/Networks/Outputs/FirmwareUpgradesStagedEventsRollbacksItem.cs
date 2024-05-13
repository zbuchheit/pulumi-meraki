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
    public sealed class FirmwareUpgradesStagedEventsRollbacksItem
    {
        /// <summary>
        /// The network devices to be updated
        /// </summary>
        public readonly Outputs.FirmwareUpgradesStagedEventsRollbacksItemProducts? Products;
        /// <summary>
        /// Reasons for the rollback
        /// </summary>
        public readonly ImmutableArray<Outputs.FirmwareUpgradesStagedEventsRollbacksItemReason> Reasons;
        /// <summary>
        /// The ordered stages in the network
        /// </summary>
        public readonly ImmutableArray<Outputs.FirmwareUpgradesStagedEventsRollbacksItemStage> Stages;

        [OutputConstructor]
        private FirmwareUpgradesStagedEventsRollbacksItem(
            Outputs.FirmwareUpgradesStagedEventsRollbacksItemProducts? products,

            ImmutableArray<Outputs.FirmwareUpgradesStagedEventsRollbacksItemReason> reasons,

            ImmutableArray<Outputs.FirmwareUpgradesStagedEventsRollbacksItemStage> stages)
        {
            Products = products;
            Reasons = reasons;
            Stages = stages;
        }
    }
}