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
    public sealed class GetSummaryTopClientsManufacturersByUsageItemClientsCountsResult
    {
        /// <summary>
        /// Total counts of clients
        /// </summary>
        public readonly int Total;

        [OutputConstructor]
        private GetSummaryTopClientsManufacturersByUsageItemClientsCountsResult(int total)
        {
            Total = total;
        }
    }
}
