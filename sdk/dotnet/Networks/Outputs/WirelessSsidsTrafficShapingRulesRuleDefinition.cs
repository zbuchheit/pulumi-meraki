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
    public sealed class WirelessSsidsTrafficShapingRulesRuleDefinition
    {
        /// <summary>
        /// The type of definition. Can be one of 'application', 'applicationCategory', 'host', 'port', 'ipRange' or 'localNet'.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// If "type" is 'host', 'port', 'ipRange' or 'localNet', then "value" must be a string, matching either
        /// a hostname (e.g. "somesite.com"), a port (e.g. 8080), or an IP range ("192.1.0.0",
        /// "192.1.0.0/16", or "10.1.0.0/16:80"). 'localNet' also supports CIDR notation, excluding
        /// custom ports.
        ///  If "type" is 'application' or 'applicationCategory', then "value" must be an object
        /// with the structure { "id": "meraki:layer7/..." }, where "id" is the application category or
        /// application ID (for a list of IDs for your network, use the trafficShaping/applicationCategories
        /// endpoint).
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private WirelessSsidsTrafficShapingRulesRuleDefinition(
            string? type,

            string? value)
        {
            Type = type;
            Value = value;
        }
    }
}
