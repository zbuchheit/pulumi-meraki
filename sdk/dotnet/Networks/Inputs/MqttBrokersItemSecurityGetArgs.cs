// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class MqttBrokersItemSecurityGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Security protocol of the MQTT broker.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// TLS settings of the MQTT broker.
        /// </summary>
        [Input("tls")]
        public Input<Inputs.MqttBrokersItemSecurityTlsGetArgs>? Tls { get; set; }

        public MqttBrokersItemSecurityGetArgs()
        {
        }
        public static new MqttBrokersItemSecurityGetArgs Empty => new MqttBrokersItemSecurityGetArgs();
    }
}
