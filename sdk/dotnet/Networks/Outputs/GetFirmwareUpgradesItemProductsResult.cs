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
    public sealed class GetFirmwareUpgradesItemProductsResult
    {
        /// <summary>
        /// The network device to be updated
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsApplianceResult Appliance;
        /// <summary>
        /// The network device to be updated
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsCameraResult Camera;
        /// <summary>
        /// The network device to be updated
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsCellularGatewayResult CellularGateway;
        /// <summary>
        /// The network device to be updated
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsSensorResult Sensor;
        /// <summary>
        /// The network device to be updated
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsSwitchResult Switch;
        /// <summary>
        /// The network device to be updated
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsWirelessResult Wireless;

        [OutputConstructor]
        private GetFirmwareUpgradesItemProductsResult(
            Outputs.GetFirmwareUpgradesItemProductsApplianceResult appliance,

            Outputs.GetFirmwareUpgradesItemProductsCameraResult camera,

            Outputs.GetFirmwareUpgradesItemProductsCellularGatewayResult cellularGateway,

            Outputs.GetFirmwareUpgradesItemProductsSensorResult sensor,

            Outputs.GetFirmwareUpgradesItemProductsSwitchResult @switch,

            Outputs.GetFirmwareUpgradesItemProductsWirelessResult wireless)
        {
            Appliance = appliance;
            Camera = camera;
            CellularGateway = cellularGateway;
            Sensor = sensor;
            Switch = @switch;
            Wireless = wireless;
        }
    }
}
