// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetCellularGatewayPortForwardingRulesItemRuleResult
    {
        public readonly string Access;
        public readonly string LanIp;
        public readonly string LocalPort;
        public readonly string Name;
        public readonly string Protocol;
        public readonly string PublicPort;
        public readonly string Uplink;

        [OutputConstructor]
        private GetCellularGatewayPortForwardingRulesItemRuleResult(
            string access,

            string lanIp,

            string localPort,

            string name,

            string protocol,

            string publicPort,

            string uplink)
        {
            Access = access;
            LanIp = lanIp;
            LocalPort = localPort;
            Name = name;
            Protocol = protocol;
            PublicPort = publicPort;
            Uplink = uplink;
        }
    }
}
