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
    public sealed class CellularGatewaySubnetPoolSubnet
    {
        public readonly string? ApplianceIp;
        public readonly string? Name;
        public readonly string? Serial;
        public readonly string? Subnet;

        [OutputConstructor]
        private CellularGatewaySubnetPoolSubnet(
            string? applianceIp,

            string? name,

            string? serial,

            string? subnet)
        {
            ApplianceIp = applianceIp;
            Name = name;
            Serial = serial;
            Subnet = subnet;
        }
    }
}
