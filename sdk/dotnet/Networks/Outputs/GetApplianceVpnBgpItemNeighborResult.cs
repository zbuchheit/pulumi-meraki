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
    public sealed class GetApplianceVpnBgpItemNeighborResult
    {
        public readonly bool AllowTransit;
        public readonly int EbgpHoldTimer;
        public readonly int EbgpMultihop;
        public readonly string Ip;
        public readonly int ReceiveLimit;
        public readonly int RemoteAsNumber;

        [OutputConstructor]
        private GetApplianceVpnBgpItemNeighborResult(
            bool allowTransit,

            int ebgpHoldTimer,

            int ebgpMultihop,

            string ip,

            int receiveLimit,

            int remoteAsNumber)
        {
            AllowTransit = allowTransit;
            EbgpHoldTimer = ebgpHoldTimer;
            EbgpMultihop = ebgpMultihop;
            Ip = ip;
            ReceiveLimit = receiveLimit;
            RemoteAsNumber = remoteAsNumber;
        }
    }
}
