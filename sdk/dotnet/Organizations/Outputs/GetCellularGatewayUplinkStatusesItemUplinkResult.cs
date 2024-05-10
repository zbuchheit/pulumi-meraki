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
    public sealed class GetCellularGatewayUplinkStatusesItemUplinkResult
    {
        /// <summary>
        /// Access Point Name
        /// </summary>
        public readonly string Apn;
        /// <summary>
        /// Connection Type
        /// </summary>
        public readonly string ConnectionType;
        /// <summary>
        /// Primary DNS IP
        /// </summary>
        public readonly string Dns1;
        /// <summary>
        /// Secondary DNS IP
        /// </summary>
        public readonly string Dns2;
        /// <summary>
        /// Gateway IP
        /// </summary>
        public readonly string Gateway;
        /// <summary>
        /// Integrated Circuit Card Identification Number
        /// </summary>
        public readonly string Iccid;
        /// <summary>
        /// Uplink interface
        /// </summary>
        public readonly string Interface;
        /// <summary>
        /// Uplink IP
        /// </summary>
        public readonly string Ip;
        /// <summary>
        /// Uplink model
        /// </summary>
        public readonly string Model;
        /// <summary>
        /// Network Provider
        /// </summary>
        public readonly string Provider;
        /// <summary>
        /// Public IP
        /// </summary>
        public readonly string PublicIp;
        /// <summary>
        /// Tower Signal Status
        /// </summary>
        public readonly Outputs.GetCellularGatewayUplinkStatusesItemUplinkSignalStatResult SignalStat;
        /// <summary>
        /// Signal Type
        /// </summary>
        public readonly string SignalType;
        /// <summary>
        /// Uplink status
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetCellularGatewayUplinkStatusesItemUplinkResult(
            string apn,

            string connectionType,

            string dns1,

            string dns2,

            string gateway,

            string iccid,

            string @interface,

            string ip,

            string model,

            string provider,

            string publicIp,

            Outputs.GetCellularGatewayUplinkStatusesItemUplinkSignalStatResult signalStat,

            string signalType,

            string status)
        {
            Apn = apn;
            ConnectionType = connectionType;
            Dns1 = dns1;
            Dns2 = dns2;
            Gateway = gateway;
            Iccid = iccid;
            Interface = @interface;
            Ip = ip;
            Model = model;
            Provider = provider;
            PublicIp = publicIp;
            SignalStat = signalStat;
            SignalType = signalType;
            Status = status;
        }
    }
}
