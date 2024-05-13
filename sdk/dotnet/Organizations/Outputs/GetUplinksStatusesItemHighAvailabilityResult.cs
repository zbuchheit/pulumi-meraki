// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetUplinksStatusesItemHighAvailabilityResult
    {
        /// <summary>
        /// Indicates whether High Availability is enabled for the device. For devices that do not support HA, this will be 'false'
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The HA role of the device on the network. For devices that do not support HA, this will be 'primary'
        /// </summary>
        public readonly string Role;

        [OutputConstructor]
        private GetUplinksStatusesItemHighAvailabilityResult(
            bool enabled,

            string role)
        {
            Enabled = enabled;
            Role = role;
        }
    }
}