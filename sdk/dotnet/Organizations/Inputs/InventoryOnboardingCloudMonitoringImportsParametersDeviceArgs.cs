// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class InventoryOnboardingCloudMonitoringImportsParametersDeviceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Import ID from the Import operation
        /// </summary>
        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        /// <summary>
        /// Network Id
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Device UDI certificate
        /// </summary>
        [Input("udi")]
        public Input<string>? Udi { get; set; }

        public InventoryOnboardingCloudMonitoringImportsParametersDeviceArgs()
        {
        }
        public static new InventoryOnboardingCloudMonitoringImportsParametersDeviceArgs Empty => new InventoryOnboardingCloudMonitoringImportsParametersDeviceArgs();
    }
}
