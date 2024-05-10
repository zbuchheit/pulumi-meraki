// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class MqttBrokersParametersGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authentication settings of the MQTT broker
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.MqttBrokersParametersAuthenticationGetArgs>? Authentication { get; set; }

        /// <summary>
        /// Host name/IP address where the MQTT broker runs.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Name of the MQTT broker.
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
        public Input<Inputs.MqttBrokersParametersSecurityGetArgs>? Security { get; set; }

        public MqttBrokersParametersGetArgs()
        {
        }
        public static new MqttBrokersParametersGetArgs Empty => new MqttBrokersParametersGetArgs();
    }
}
