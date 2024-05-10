// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsHotspot20NaiRealmMethodArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The authentication types for the method. These should be formatted as an object with the EAP method category in camelcase as the key and the list of types as the value (nonEapInnerAuthentication: Reserved, PAP, CHAP, MSCHAP, MSCHAPV2; eapInnerAuthentication: EAP-TLS, EAP-SIM, EAP-AKA, EAP-TTLS with MSCHAPv2; credentials: SIM, USIM, NFC Secure Element, Hardware Token, Softoken, Certificate, username/password, none, Reserved, Vendor Specific; tunneledEapMethodCredentials: SIM, USIM, NFC Secure Element, Hardware Token, Softoken, Certificate, username/password, Reserved, Anonymous, Vendor Specific)
        /// </summary>
        [Input("authenticationTypes")]
        public Input<Inputs.WirelessSsidsHotspot20NaiRealmMethodAuthenticationTypesArgs>? AuthenticationTypes { get; set; }

        /// <summary>
        /// ID of method
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public WirelessSsidsHotspot20NaiRealmMethodArgs()
        {
        }
        public static new WirelessSsidsHotspot20NaiRealmMethodArgs Empty => new WirelessSsidsHotspot20NaiRealmMethodArgs();
    }
}
