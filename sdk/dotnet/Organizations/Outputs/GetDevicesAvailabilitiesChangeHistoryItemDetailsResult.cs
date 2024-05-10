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
    public sealed class GetDevicesAvailabilitiesChangeHistoryItemDetailsResult
    {
        /// <summary>
        /// Details about the new status
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDevicesAvailabilitiesChangeHistoryItemDetailsNewsResult> News;
        /// <summary>
        /// Details about the old status
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDevicesAvailabilitiesChangeHistoryItemDetailsOldResult> Olds;

        [OutputConstructor]
        private GetDevicesAvailabilitiesChangeHistoryItemDetailsResult(
            ImmutableArray<Outputs.GetDevicesAvailabilitiesChangeHistoryItemDetailsNewsResult> news,

            ImmutableArray<Outputs.GetDevicesAvailabilitiesChangeHistoryItemDetailsOldResult> olds)
        {
            News = news;
            Olds = olds;
        }
    }
}
