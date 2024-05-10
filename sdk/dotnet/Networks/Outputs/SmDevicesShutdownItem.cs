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
    public sealed class SmDevicesShutdownItem
    {
        /// <summary>
        /// The Meraki Ids of the set of endpoints.
        /// </summary>
        public readonly ImmutableArray<string> Ids;

        [OutputConstructor]
        private SmDevicesShutdownItem(ImmutableArray<string> ids)
        {
            Ids = ids;
        }
    }
}
