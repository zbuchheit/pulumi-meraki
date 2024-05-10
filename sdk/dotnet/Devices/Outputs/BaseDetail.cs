// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class BaseDetail
    {
        /// <summary>
        /// Additional property name
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Additional property value
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private BaseDetail(
            string? name,

            string? value)
        {
            Name = name;
            Value = value;
        }
    }
}
