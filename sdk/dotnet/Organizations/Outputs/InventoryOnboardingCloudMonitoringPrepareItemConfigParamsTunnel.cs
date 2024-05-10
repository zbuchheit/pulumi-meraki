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
    public sealed class InventoryOnboardingCloudMonitoringPrepareItemConfigParamsTunnel
    {
        /// <summary>
        /// SSH tunnel URL used to connect to the device
        /// </summary>
        public readonly string? Host;
        public readonly string? Mode;
        /// <summary>
        /// The name of the tunnel we are attempting to connect to
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The port used for the ssh tunnel.
        /// </summary>
        public readonly string? Port;
        /// <summary>
        /// Root certificate information
        /// </summary>
        public readonly Outputs.InventoryOnboardingCloudMonitoringPrepareItemConfigParamsTunnelRootCertificate? RootCertificate;

        [OutputConstructor]
        private InventoryOnboardingCloudMonitoringPrepareItemConfigParamsTunnel(
            string? host,

            string? mode,

            string? name,

            string? port,

            Outputs.InventoryOnboardingCloudMonitoringPrepareItemConfigParamsTunnelRootCertificate? rootCertificate)
        {
            Host = host;
            Mode = mode;
            Name = name;
            Port = port;
            RootCertificate = rootCertificate;
        }
    }
}
