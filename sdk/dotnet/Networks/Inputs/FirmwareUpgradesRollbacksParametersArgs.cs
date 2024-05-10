// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesRollbacksParametersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Product type to rollback (if the network is a combined network)
        /// </summary>
        [Input("product")]
        public Input<string>? Product { get; set; }

        [Input("reasons")]
        private InputList<Inputs.FirmwareUpgradesRollbacksParametersReasonArgs>? _reasons;

        /// <summary>
        /// Reasons for the rollback
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesRollbacksParametersReasonArgs> Reasons
        {
            get => _reasons ?? (_reasons = new InputList<Inputs.FirmwareUpgradesRollbacksParametersReasonArgs>());
            set => _reasons = value;
        }

        /// <summary>
        /// Scheduled time for the rollback
        /// </summary>
        [Input("time")]
        public Input<string>? Time { get; set; }

        /// <summary>
        /// Version to downgrade to (if the network has firmware flexibility)
        /// </summary>
        [Input("toVersion")]
        public Input<Inputs.FirmwareUpgradesRollbacksParametersToVersionArgs>? ToVersion { get; set; }

        public FirmwareUpgradesRollbacksParametersArgs()
        {
        }
        public static new FirmwareUpgradesRollbacksParametersArgs Empty => new FirmwareUpgradesRollbacksParametersArgs();
    }
}
