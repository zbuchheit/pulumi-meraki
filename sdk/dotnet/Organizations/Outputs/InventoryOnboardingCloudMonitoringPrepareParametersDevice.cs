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
    public sealed class InventoryOnboardingCloudMonitoringPrepareParametersDevice
    {
        /// <summary>
        /// Device SUDI certificate
        /// </summary>
        public readonly string? Sudi;
        /// <summary>
        /// TLS Related Parameters
        /// </summary>
        public readonly Outputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceTunnel? Tunnel;
        /// <summary>
        /// User parameters
        /// </summary>
        public readonly Outputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceUser? User;
        /// <summary>
        /// VTY Related Parameters
        /// </summary>
        public readonly Outputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVty? Vty;

        [OutputConstructor]
        private InventoryOnboardingCloudMonitoringPrepareParametersDevice(
            string? sudi,

            Outputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceTunnel? tunnel,

            Outputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceUser? user,

            Outputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVty? vty)
        {
            Sudi = sudi;
            Tunnel = tunnel;
            User = user;
            Vty = vty;
        }
    }
}
