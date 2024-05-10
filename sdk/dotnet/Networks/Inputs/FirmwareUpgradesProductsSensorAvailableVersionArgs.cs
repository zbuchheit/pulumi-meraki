// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesProductsSensorAvailableVersionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the firmware version
        /// </summary>
        [Input("firmware")]
        public Input<string>? Firmware { get; set; }

        /// <summary>
        /// Firmware version identifier
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Release date of the firmware version
        /// </summary>
        [Input("releaseDate")]
        public Input<string>? ReleaseDate { get; set; }

        /// <summary>
        /// Release type of the firmware version
        /// </summary>
        [Input("releaseType")]
        public Input<string>? ReleaseType { get; set; }

        /// <summary>
        /// Firmware version short name
        /// </summary>
        [Input("shortName")]
        public Input<string>? ShortName { get; set; }

        public FirmwareUpgradesProductsSensorAvailableVersionArgs()
        {
        }
        public static new FirmwareUpgradesProductsSensorAvailableVersionArgs Empty => new FirmwareUpgradesProductsSensorAvailableVersionArgs();
    }
}
