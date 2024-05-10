// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsLocalRadiusCertificateAuthenticationClientRootCaCertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The contents of the Client CA Certificate. Must be in PEM or DER format.
        /// </summary>
        [Input("contents")]
        public Input<string>? Contents { get; set; }

        public WirelessSsidsLocalRadiusCertificateAuthenticationClientRootCaCertificateArgs()
        {
        }
        public static new WirelessSsidsLocalRadiusCertificateAuthenticationClientRootCaCertificateArgs Empty => new WirelessSsidsLocalRadiusCertificateAuthenticationClientRootCaCertificateArgs();
    }
}
