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
    public sealed class TrafficAnalysisCustomPieChartItem
    {
        /// <summary>
        /// The name of the custom pie chart item.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The signature type for the custom pie chart item. Can be one of 'host', 'port' or 'ipRange'.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// The value of the custom pie chart item. Valid syntax depends on the signature type of the chart item
        /// (see sample request/response for more details).
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private TrafficAnalysisCustomPieChartItem(
            string? name,

            string? type,

            string? value)
        {
            Name = name;
            Type = type;
            Value = value;
        }
    }
}
