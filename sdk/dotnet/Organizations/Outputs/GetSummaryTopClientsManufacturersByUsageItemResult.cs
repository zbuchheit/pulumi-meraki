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
    public sealed class GetSummaryTopClientsManufacturersByUsageItemResult
    {
        /// <summary>
        /// Clients info
        /// </summary>
        public readonly Outputs.GetSummaryTopClientsManufacturersByUsageItemClientsResult Clients;
        /// <summary>
        /// Name of the manufacturer
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Clients usage
        /// </summary>
        public readonly Outputs.GetSummaryTopClientsManufacturersByUsageItemUsageResult Usage;

        [OutputConstructor]
        private GetSummaryTopClientsManufacturersByUsageItemResult(
            Outputs.GetSummaryTopClientsManufacturersByUsageItemClientsResult clients,

            string name,

            Outputs.GetSummaryTopClientsManufacturersByUsageItemUsageResult usage)
        {
            Clients = clients;
            Name = name;
            Usage = usage;
        }
    }
}