// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/switchSettings:SwitchSettings example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/switchSettings:SwitchSettings")]
    public partial class SwitchSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// MAC blocklist
        /// </summary>
        [Output("macBlocklist")]
        public Output<Outputs.SwitchSettingsMacBlocklist> MacBlocklist { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// Exceptions on a per switch basis to "useCombinedPower"
        /// </summary>
        [Output("powerExceptions")]
        public Output<ImmutableArray<Outputs.SwitchSettingsPowerException>> PowerExceptions { get; private set; } = null!;

        /// <summary>
        /// Uplink client sampling
        /// </summary>
        [Output("uplinkClientSampling")]
        public Output<Outputs.SwitchSettingsUplinkClientSampling> UplinkClientSampling { get; private set; } = null!;

        /// <summary>
        /// The use Combined Power as the default behavior of secondary power supplies on supported devices.
        /// </summary>
        [Output("useCombinedPower")]
        public Output<bool> UseCombinedPower { get; private set; } = null!;

        /// <summary>
        /// Management VLAN
        /// </summary>
        [Output("vlan")]
        public Output<int> Vlan { get; private set; } = null!;


        /// <summary>
        /// Create a SwitchSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SwitchSettings(string name, SwitchSettingsArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/switchSettings:SwitchSettings", name, args ?? new SwitchSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SwitchSettings(string name, Input<string> id, SwitchSettingsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/switchSettings:SwitchSettings", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-meraki",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SwitchSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SwitchSettings Get(string name, Input<string> id, SwitchSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new SwitchSettings(name, id, state, options);
        }
    }

    public sealed class SwitchSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// MAC blocklist
        /// </summary>
        [Input("macBlocklist")]
        public Input<Inputs.SwitchSettingsMacBlocklistArgs>? MacBlocklist { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        [Input("powerExceptions")]
        private InputList<Inputs.SwitchSettingsPowerExceptionArgs>? _powerExceptions;

        /// <summary>
        /// Exceptions on a per switch basis to "useCombinedPower"
        /// </summary>
        public InputList<Inputs.SwitchSettingsPowerExceptionArgs> PowerExceptions
        {
            get => _powerExceptions ?? (_powerExceptions = new InputList<Inputs.SwitchSettingsPowerExceptionArgs>());
            set => _powerExceptions = value;
        }

        /// <summary>
        /// Uplink client sampling
        /// </summary>
        [Input("uplinkClientSampling")]
        public Input<Inputs.SwitchSettingsUplinkClientSamplingArgs>? UplinkClientSampling { get; set; }

        /// <summary>
        /// The use Combined Power as the default behavior of secondary power supplies on supported devices.
        /// </summary>
        [Input("useCombinedPower")]
        public Input<bool>? UseCombinedPower { get; set; }

        /// <summary>
        /// Management VLAN
        /// </summary>
        [Input("vlan")]
        public Input<int>? Vlan { get; set; }

        public SwitchSettingsArgs()
        {
        }
        public static new SwitchSettingsArgs Empty => new SwitchSettingsArgs();
    }

    public sealed class SwitchSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// MAC blocklist
        /// </summary>
        [Input("macBlocklist")]
        public Input<Inputs.SwitchSettingsMacBlocklistGetArgs>? MacBlocklist { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        [Input("powerExceptions")]
        private InputList<Inputs.SwitchSettingsPowerExceptionGetArgs>? _powerExceptions;

        /// <summary>
        /// Exceptions on a per switch basis to "useCombinedPower"
        /// </summary>
        public InputList<Inputs.SwitchSettingsPowerExceptionGetArgs> PowerExceptions
        {
            get => _powerExceptions ?? (_powerExceptions = new InputList<Inputs.SwitchSettingsPowerExceptionGetArgs>());
            set => _powerExceptions = value;
        }

        /// <summary>
        /// Uplink client sampling
        /// </summary>
        [Input("uplinkClientSampling")]
        public Input<Inputs.SwitchSettingsUplinkClientSamplingGetArgs>? UplinkClientSampling { get; set; }

        /// <summary>
        /// The use Combined Power as the default behavior of secondary power supplies on supported devices.
        /// </summary>
        [Input("useCombinedPower")]
        public Input<bool>? UseCombinedPower { get; set; }

        /// <summary>
        /// Management VLAN
        /// </summary>
        [Input("vlan")]
        public Input<int>? Vlan { get; set; }

        public SwitchSettingsState()
        {
        }
        public static new SwitchSettingsState Empty => new SwitchSettingsState();
    }
}
