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
    public sealed class GetSensorMqttBrokersItemResult
    {
        /// <summary>
        /// Specifies whether the broker is enabled for sensor data. Currently, only a single broker may be enabled for sensor data.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// ID of the MQTT Broker.
        /// </summary>
        public readonly string MqttBrokerId;

        [OutputConstructor]
        private GetSensorMqttBrokersItemResult(
            bool enabled,

            string mqttBrokerId)
        {
            Enabled = enabled;
            MqttBrokerId = mqttBrokerId;
        }
    }
}
