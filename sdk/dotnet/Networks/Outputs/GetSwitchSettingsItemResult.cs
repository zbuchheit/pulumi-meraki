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
    public sealed class GetSwitchSettingsItemResult
    {
        /// <summary>
        /// MAC blocklist
        /// </summary>
        public readonly Outputs.GetSwitchSettingsItemMacBlocklistResult MacBlocklist;
        /// <summary>
        /// Exceptions on a per switch basis to "useCombinedPower"
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchSettingsItemPowerExceptionResult> PowerExceptions;
        /// <summary>
        /// Uplink client sampling
        /// </summary>
        public readonly Outputs.GetSwitchSettingsItemUplinkClientSamplingResult UplinkClientSampling;
        /// <summary>
        /// The use Combined Power as the default behavior of secondary power supplies on supported devices.
        /// </summary>
        public readonly bool UseCombinedPower;
        /// <summary>
        /// Management VLAN
        /// </summary>
        public readonly int Vlan;

        [OutputConstructor]
        private GetSwitchSettingsItemResult(
            Outputs.GetSwitchSettingsItemMacBlocklistResult macBlocklist,

            ImmutableArray<Outputs.GetSwitchSettingsItemPowerExceptionResult> powerExceptions,

            Outputs.GetSwitchSettingsItemUplinkClientSamplingResult uplinkClientSampling,

            bool useCombinedPower,

            int vlan)
        {
            MacBlocklist = macBlocklist;
            PowerExceptions = powerExceptions;
            UplinkClientSampling = uplinkClientSampling;
            UseCombinedPower = useCombinedPower;
            Vlan = vlan;
        }
    }
}
