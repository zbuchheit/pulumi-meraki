// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsRollbacksParametersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("reasons")]
        private InputList<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersReasonGetArgs>? _reasons;

        /// <summary>
        /// The reason for rolling back the staged upgrade
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersReasonGetArgs> Reasons
        {
            get => _reasons ?? (_reasons = new InputList<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersReasonGetArgs>());
            set => _reasons = value;
        }

        [Input("stages")]
        private InputList<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersStageGetArgs>? _stages;

        /// <summary>
        /// All completed or in-progress stages in the network with their new start times. All pending stages will be canceled
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersStageGetArgs> Stages
        {
            get => _stages ?? (_stages = new InputList<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersStageGetArgs>());
            set => _stages = value;
        }

        public FirmwareUpgradesStagedEventsRollbacksParametersGetArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsRollbacksParametersGetArgs Empty => new FirmwareUpgradesStagedEventsRollbacksParametersGetArgs();
    }
}
