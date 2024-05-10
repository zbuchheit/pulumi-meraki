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
    public sealed class GetSummaryTopNetworksByStatusItemDevicesResult
    {
        /// <summary>
        /// URLs by product type
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSummaryTopNetworksByStatusItemDevicesByProductTypeResult> ByProductTypes;

        [OutputConstructor]
        private GetSummaryTopNetworksByStatusItemDevicesResult(ImmutableArray<Outputs.GetSummaryTopNetworksByStatusItemDevicesByProductTypeResult> byProductTypes)
        {
            ByProductTypes = byProductTypes;
        }
    }
}
