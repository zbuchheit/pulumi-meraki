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
    public sealed class GetSwitchMtuItemOverrideResult
    {
        /// <summary>
        /// MTU size for the switches or switch templates.
        /// </summary>
        public readonly int MtuSize;
        /// <summary>
        /// List of switch template IDs. Applicable only for template network.
        /// </summary>
        public readonly ImmutableArray<string> SwitchProfiles;
        /// <summary>
        /// List of switch serials. Applicable only for switch network.
        /// </summary>
        public readonly ImmutableArray<string> Switches;

        [OutputConstructor]
        private GetSwitchMtuItemOverrideResult(
            int mtuSize,

            ImmutableArray<string> switchProfiles,

            ImmutableArray<string> switches)
        {
            MtuSize = mtuSize;
            SwitchProfiles = switchProfiles;
            Switches = switches;
        }
    }
}
