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
    /// $ pulumi import meraki:networks/wirelessRfProfiles:WirelessRfProfiles example "network_id,rf_profile_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/wirelessRfProfiles:WirelessRfProfiles")]
    public partial class WirelessRfProfiles : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Settings that will be enabled if selectionType is set to 'ap'.
        /// </summary>
        [Output("apBandSettings")]
        public Output<Outputs.WirelessRfProfilesApBandSettings> ApBandSettings { get; private set; } = null!;

        /// <summary>
        /// Band selection can be set to either 'ssid' or 'ap'. This param is required on creation.
        /// </summary>
        [Output("bandSelectionType")]
        public Output<string> BandSelectionType { get; private set; } = null!;

        /// <summary>
        /// Steers client to best available access point. Can be either true or false. Defaults to true.
        /// </summary>
        [Output("clientBalancingEnabled")]
        public Output<bool> ClientBalancingEnabled { get; private set; } = null!;

        /// <summary>
        /// Settings related to 5Ghz band
        /// </summary>
        [Output("fiveGhzSettings")]
        public Output<Outputs.WirelessRfProfilesFiveGhzSettings> FiveGhzSettings { get; private set; } = null!;

        /// <summary>
        /// Flex radio settings.
        /// </summary>
        [Output("flexRadios")]
        public Output<Outputs.WirelessRfProfilesFlexRadios> FlexRadios { get; private set; } = null!;

        /// <summary>
        /// Minimum bitrate can be set to either 'band' or 'ssid'. Defaults to band.
        /// </summary>
        [Output("minBitrateType")]
        public Output<string> MinBitrateType { get; private set; } = null!;

        /// <summary>
        /// The name of the new profile. Must be unique. This param is required on creation.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The network ID of the RF Profile
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// Per-SSID radio settings by number.
        /// </summary>
        [Output("perSsidSettings")]
        public Output<Outputs.WirelessRfProfilesPerSsidSettings> PerSsidSettings { get; private set; } = null!;

        /// <summary>
        /// rfProfileId path parameter. Rf profile ID
        /// </summary>
        [Output("rfProfileId")]
        public Output<string?> RfProfileId { get; private set; } = null!;

        /// <summary>
        /// Settings related to 6Ghz band. Only applicable to networks with 6Ghz capable APs
        /// </summary>
        [Output("sixGhzSettings")]
        public Output<Outputs.WirelessRfProfilesSixGhzSettings> SixGhzSettings { get; private set; } = null!;

        /// <summary>
        /// Settings related to radio transmission.
        /// </summary>
        [Output("transmission")]
        public Output<Outputs.WirelessRfProfilesTransmission> Transmission { get; private set; } = null!;

        /// <summary>
        /// Settings related to 2.4Ghz band
        /// </summary>
        [Output("twoFourGhzSettings")]
        public Output<Outputs.WirelessRfProfilesTwoFourGhzSettings> TwoFourGhzSettings { get; private set; } = null!;


        /// <summary>
        /// Create a WirelessRfProfiles resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WirelessRfProfiles(string name, WirelessRfProfilesArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/wirelessRfProfiles:WirelessRfProfiles", name, args ?? new WirelessRfProfilesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WirelessRfProfiles(string name, Input<string> id, WirelessRfProfilesState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/wirelessRfProfiles:WirelessRfProfiles", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WirelessRfProfiles resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WirelessRfProfiles Get(string name, Input<string> id, WirelessRfProfilesState? state = null, CustomResourceOptions? options = null)
        {
            return new WirelessRfProfiles(name, id, state, options);
        }
    }

    public sealed class WirelessRfProfilesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings that will be enabled if selectionType is set to 'ap'.
        /// </summary>
        [Input("apBandSettings")]
        public Input<Inputs.WirelessRfProfilesApBandSettingsArgs>? ApBandSettings { get; set; }

        /// <summary>
        /// Band selection can be set to either 'ssid' or 'ap'. This param is required on creation.
        /// </summary>
        [Input("bandSelectionType")]
        public Input<string>? BandSelectionType { get; set; }

        /// <summary>
        /// Steers client to best available access point. Can be either true or false. Defaults to true.
        /// </summary>
        [Input("clientBalancingEnabled")]
        public Input<bool>? ClientBalancingEnabled { get; set; }

        /// <summary>
        /// Settings related to 5Ghz band
        /// </summary>
        [Input("fiveGhzSettings")]
        public Input<Inputs.WirelessRfProfilesFiveGhzSettingsArgs>? FiveGhzSettings { get; set; }

        /// <summary>
        /// Flex radio settings.
        /// </summary>
        [Input("flexRadios")]
        public Input<Inputs.WirelessRfProfilesFlexRadiosArgs>? FlexRadios { get; set; }

        /// <summary>
        /// Minimum bitrate can be set to either 'band' or 'ssid'. Defaults to band.
        /// </summary>
        [Input("minBitrateType")]
        public Input<string>? MinBitrateType { get; set; }

        /// <summary>
        /// The name of the new profile. Must be unique. This param is required on creation.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The network ID of the RF Profile
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// Per-SSID radio settings by number.
        /// </summary>
        [Input("perSsidSettings")]
        public Input<Inputs.WirelessRfProfilesPerSsidSettingsArgs>? PerSsidSettings { get; set; }

        /// <summary>
        /// rfProfileId path parameter. Rf profile ID
        /// </summary>
        [Input("rfProfileId")]
        public Input<string>? RfProfileId { get; set; }

        /// <summary>
        /// Settings related to 6Ghz band. Only applicable to networks with 6Ghz capable APs
        /// </summary>
        [Input("sixGhzSettings")]
        public Input<Inputs.WirelessRfProfilesSixGhzSettingsArgs>? SixGhzSettings { get; set; }

        /// <summary>
        /// Settings related to radio transmission.
        /// </summary>
        [Input("transmission")]
        public Input<Inputs.WirelessRfProfilesTransmissionArgs>? Transmission { get; set; }

        /// <summary>
        /// Settings related to 2.4Ghz band
        /// </summary>
        [Input("twoFourGhzSettings")]
        public Input<Inputs.WirelessRfProfilesTwoFourGhzSettingsArgs>? TwoFourGhzSettings { get; set; }

        public WirelessRfProfilesArgs()
        {
        }
        public static new WirelessRfProfilesArgs Empty => new WirelessRfProfilesArgs();
    }

    public sealed class WirelessRfProfilesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings that will be enabled if selectionType is set to 'ap'.
        /// </summary>
        [Input("apBandSettings")]
        public Input<Inputs.WirelessRfProfilesApBandSettingsGetArgs>? ApBandSettings { get; set; }

        /// <summary>
        /// Band selection can be set to either 'ssid' or 'ap'. This param is required on creation.
        /// </summary>
        [Input("bandSelectionType")]
        public Input<string>? BandSelectionType { get; set; }

        /// <summary>
        /// Steers client to best available access point. Can be either true or false. Defaults to true.
        /// </summary>
        [Input("clientBalancingEnabled")]
        public Input<bool>? ClientBalancingEnabled { get; set; }

        /// <summary>
        /// Settings related to 5Ghz band
        /// </summary>
        [Input("fiveGhzSettings")]
        public Input<Inputs.WirelessRfProfilesFiveGhzSettingsGetArgs>? FiveGhzSettings { get; set; }

        /// <summary>
        /// Flex radio settings.
        /// </summary>
        [Input("flexRadios")]
        public Input<Inputs.WirelessRfProfilesFlexRadiosGetArgs>? FlexRadios { get; set; }

        /// <summary>
        /// Minimum bitrate can be set to either 'band' or 'ssid'. Defaults to band.
        /// </summary>
        [Input("minBitrateType")]
        public Input<string>? MinBitrateType { get; set; }

        /// <summary>
        /// The name of the new profile. Must be unique. This param is required on creation.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The network ID of the RF Profile
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Per-SSID radio settings by number.
        /// </summary>
        [Input("perSsidSettings")]
        public Input<Inputs.WirelessRfProfilesPerSsidSettingsGetArgs>? PerSsidSettings { get; set; }

        /// <summary>
        /// rfProfileId path parameter. Rf profile ID
        /// </summary>
        [Input("rfProfileId")]
        public Input<string>? RfProfileId { get; set; }

        /// <summary>
        /// Settings related to 6Ghz band. Only applicable to networks with 6Ghz capable APs
        /// </summary>
        [Input("sixGhzSettings")]
        public Input<Inputs.WirelessRfProfilesSixGhzSettingsGetArgs>? SixGhzSettings { get; set; }

        /// <summary>
        /// Settings related to radio transmission.
        /// </summary>
        [Input("transmission")]
        public Input<Inputs.WirelessRfProfilesTransmissionGetArgs>? Transmission { get; set; }

        /// <summary>
        /// Settings related to 2.4Ghz band
        /// </summary>
        [Input("twoFourGhzSettings")]
        public Input<Inputs.WirelessRfProfilesTwoFourGhzSettingsGetArgs>? TwoFourGhzSettings { get; set; }

        public WirelessRfProfilesState()
        {
        }
        public static new WirelessRfProfilesState Empty => new WirelessRfProfilesState();
    }
}