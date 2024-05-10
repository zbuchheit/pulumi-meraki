// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class MqttBrokersItemSecurityTlsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the CA certificate is set
        /// </summary>
        [Input("hasCaCertificate")]
        public Input<bool>? HasCaCertificate { get; set; }

        /// <summary>
        /// Whether the TLS hostname verification is enabled for the MQTT broker.
        /// </summary>
        [Input("verifyHostnames")]
        public Input<bool>? VerifyHostnames { get; set; }

        public MqttBrokersItemSecurityTlsGetArgs()
        {
        }
        public static new MqttBrokersItemSecurityTlsGetArgs Empty => new MqttBrokersItemSecurityTlsGetArgs();
    }
}
