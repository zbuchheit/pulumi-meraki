// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AccessList details
        /// </summary>
        [Input("accessList")]
        public Input<Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs>? AccessList { get; set; }

        /// <summary>
        /// VTY AAA authentication
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs>? Authentication { get; set; }

        /// <summary>
        /// VTY AAA authorization
        /// </summary>
        [Input("authorization")]
        public Input<Inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationArgs>? Authorization { get; set; }

        /// <summary>
        /// Ending line VTY number
        /// </summary>
        [Input("endLineNumber")]
        public Input<int>? EndLineNumber { get; set; }

        /// <summary>
        /// SSH rotary number
        /// </summary>
        [Input("rotaryNumber")]
        public Input<int>? RotaryNumber { get; set; }

        /// <summary>
        /// Starting line VTY number
        /// </summary>
        [Input("startLineNumber")]
        public Input<int>? StartLineNumber { get; set; }

        public InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyArgs()
        {
        }
        public static new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyArgs Empty => new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyArgs();
    }
}
