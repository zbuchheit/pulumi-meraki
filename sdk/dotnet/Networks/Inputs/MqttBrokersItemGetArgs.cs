// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class MqttBrokersItemGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authentication settings of the MQTT broker
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.MqttBrokersItemAuthenticationGetArgs>? Authentication { get; set; }

        /// <summary>
        /// Host name/IP address where the MQTT broker runs.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// ID of the MQTT Broker.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Name of the MQTT Broker.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Host port though which the MQTT broker can be reached.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Security settings of the MQTT broker.
        /// </summary>
        [Input("security")]
        public Input<Inputs.MqttBrokersItemSecurityGetArgs>? Security { get; set; }

        public MqttBrokersItemGetArgs()
        {
        }
        public static new MqttBrokersItemGetArgs Empty => new MqttBrokersItemGetArgs();
    }
}
