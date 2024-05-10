// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsSplashSettingsSentryEnrollmentGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enforcedSystems")]
        private InputList<string>? _enforcedSystems;

        /// <summary>
        /// The system types that the Sentry enforces.
        /// </summary>
        public InputList<string> EnforcedSystems
        {
            get => _enforcedSystems ?? (_enforcedSystems = new InputList<string>());
            set => _enforcedSystems = value;
        }

        /// <summary>
        /// The strength of the enforcement of selected system types.
        /// </summary>
        [Input("strength")]
        public Input<string>? Strength { get; set; }

        /// <summary>
        /// Systems Manager network targeted for sentry enrollment.
        /// </summary>
        [Input("systemsManagerNetwork")]
        public Input<Inputs.WirelessSsidsSplashSettingsSentryEnrollmentSystemsManagerNetworkGetArgs>? SystemsManagerNetwork { get; set; }

        public WirelessSsidsSplashSettingsSentryEnrollmentGetArgs()
        {
        }
        public static new WirelessSsidsSplashSettingsSentryEnrollmentGetArgs Empty => new WirelessSsidsSplashSettingsSentryEnrollmentGetArgs();
    }
}
