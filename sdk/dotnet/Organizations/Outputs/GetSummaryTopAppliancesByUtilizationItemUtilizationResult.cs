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
    public sealed class GetSummaryTopAppliancesByUtilizationItemUtilizationResult
    {
        /// <summary>
        /// Average utilization of the appliance
        /// </summary>
        public readonly Outputs.GetSummaryTopAppliancesByUtilizationItemUtilizationAverageResult Average;

        [OutputConstructor]
        private GetSummaryTopAppliancesByUtilizationItemUtilizationResult(Outputs.GetSummaryTopAppliancesByUtilizationItemUtilizationAverageResult average)
        {
            Average = average;
        }
    }
}