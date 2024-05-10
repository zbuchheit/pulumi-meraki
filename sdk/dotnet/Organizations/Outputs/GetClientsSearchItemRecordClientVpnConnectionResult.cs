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
    public sealed class GetClientsSearchItemRecordClientVpnConnectionResult
    {
        public readonly int ConnectedAt;
        public readonly int DisconnectedAt;
        public readonly string RemoteIp;

        [OutputConstructor]
        private GetClientsSearchItemRecordClientVpnConnectionResult(
            int connectedAt,

            int disconnectedAt,

            string remoteIp)
        {
            ConnectedAt = connectedAt;
            DisconnectedAt = disconnectedAt;
            RemoteIp = remoteIp;
        }
    }
}
