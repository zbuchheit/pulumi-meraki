// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class LiveToolsThroughputTestResultArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Shows the speeds (Mbps)
        /// </summary>
        [Input("speeds")]
        public Input<Inputs.LiveToolsThroughputTestResultSpeedsArgs>? Speeds { get; set; }

        public LiveToolsThroughputTestResultArgs()
        {
        }
        public static new LiveToolsThroughputTestResultArgs Empty => new LiveToolsThroughputTestResultArgs();
    }
}
