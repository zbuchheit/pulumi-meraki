// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingVpnExclusionsItemMajorApplicationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Application's Meraki ID.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Application's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ApplianceTrafficShapingVpnExclusionsItemMajorApplicationGetArgs()
        {
        }
        public static new ApplianceTrafficShapingVpnExclusionsItemMajorApplicationGetArgs Empty => new ApplianceTrafficShapingVpnExclusionsItemMajorApplicationGetArgs();
    }
}
