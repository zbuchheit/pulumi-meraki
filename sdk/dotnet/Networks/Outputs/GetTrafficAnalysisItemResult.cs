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
    public sealed class GetTrafficAnalysisItemResult
    {
        /// <summary>
        /// The list of items that make up the custom pie chart for traffic reporting.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTrafficAnalysisItemCustomPieChartItemResult> CustomPieChartItems;
        /// <summary>
        /// The traffic analysis mode for the network. Can be one of 'disabled' (do not collect traffic types),
        /// 'basic' (collect generic traffic categories), or 'detailed' (collect destination hostnames).
        /// </summary>
        public readonly string Mode;

        [OutputConstructor]
        private GetTrafficAnalysisItemResult(
            ImmutableArray<Outputs.GetTrafficAnalysisItemCustomPieChartItemResult> customPieChartItems,

            string mode)
        {
            CustomPieChartItems = customPieChartItems;
            Mode = mode;
        }
    }
}
