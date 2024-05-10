// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class BlinkLedsItemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The duration in seconds. Will be between 5 and 120. Default is 20 seconds
        /// </summary>
        [Input("duration")]
        public Input<int>? Duration { get; set; }

        /// <summary>
        /// The duty cycle as the percent active. Will be between 10 and 90. Default is 50
        /// </summary>
        [Input("duty")]
        public Input<int>? Duty { get; set; }

        /// <summary>
        /// The period in milliseconds. Will be between 100 and 1000. Default is 160 milliseconds
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        public BlinkLedsItemArgs()
        {
        }
        public static new BlinkLedsItemArgs Empty => new BlinkLedsItemArgs();
    }
}
