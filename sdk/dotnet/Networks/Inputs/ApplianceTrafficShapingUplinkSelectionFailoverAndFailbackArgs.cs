// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingUplinkSelectionFailoverAndFailbackArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Immediate WAN failover and failback
        /// </summary>
        [Input("immediate")]
        public Input<Inputs.ApplianceTrafficShapingUplinkSelectionFailoverAndFailbackImmediateArgs>? Immediate { get; set; }

        public ApplianceTrafficShapingUplinkSelectionFailoverAndFailbackArgs()
        {
        }
        public static new ApplianceTrafficShapingUplinkSelectionFailoverAndFailbackArgs Empty => new ApplianceTrafficShapingUplinkSelectionFailoverAndFailbackArgs();
    }
}