// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class BaseDetailArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Additional property name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Additional property value
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public BaseDetailArgs()
        {
        }
        public static new BaseDetailArgs Empty => new BaseDetailArgs();
    }
}
