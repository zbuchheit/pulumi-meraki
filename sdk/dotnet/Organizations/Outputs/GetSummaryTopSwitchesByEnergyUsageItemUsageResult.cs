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
    public sealed class GetSummaryTopSwitchesByEnergyUsageItemUsageResult
    {
        /// <summary>
        /// Total energy usage of the switch
        /// </summary>
        public readonly double Total;

        [OutputConstructor]
        private GetSummaryTopSwitchesByEnergyUsageItemUsageResult(double total)
        {
            Total = total;
        }
    }
}
