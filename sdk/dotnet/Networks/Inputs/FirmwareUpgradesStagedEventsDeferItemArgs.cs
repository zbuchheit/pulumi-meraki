// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsDeferItemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The network devices to be updated
        /// </summary>
        [Input("products")]
        public Input<Inputs.FirmwareUpgradesStagedEventsDeferItemProductsArgs>? Products { get; set; }

        [Input("reasons")]
        private InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemReasonArgs>? _reasons;

        /// <summary>
        /// Reasons for the rollback
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemReasonArgs> Reasons
        {
            get => _reasons ?? (_reasons = new InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemReasonArgs>());
            set => _reasons = value;
        }

        [Input("stages")]
        private InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemStageArgs>? _stages;

        /// <summary>
        /// The ordered stages in the network
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemStageArgs> Stages
        {
            get => _stages ?? (_stages = new InputList<Inputs.FirmwareUpgradesStagedEventsDeferItemStageArgs>());
            set => _stages = value;
        }

        public FirmwareUpgradesStagedEventsDeferItemArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsDeferItemArgs Empty => new FirmwareUpgradesStagedEventsDeferItemArgs();
    }
}