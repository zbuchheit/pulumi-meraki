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
    public sealed class GetSummaryTopSsidsByUsageItemResult
    {
        /// <summary>
        /// Clients info of the SSID
        /// </summary>
        public readonly Outputs.GetSummaryTopSsidsByUsageItemClientsResult Clients;
        /// <summary>
        /// Name of the SSID
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Date usage of the SSID, in megabytes
        /// </summary>
        public readonly Outputs.GetSummaryTopSsidsByUsageItemUsageResult Usage;

        [OutputConstructor]
        private GetSummaryTopSsidsByUsageItemResult(
            Outputs.GetSummaryTopSsidsByUsageItemClientsResult clients,

            string name,

            Outputs.GetSummaryTopSsidsByUsageItemUsageResult usage)
        {
            Clients = clients;
            Name = name;
            Usage = usage;
        }
    }
}
