// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SensorMqttBrokersArgs extends com.pulumi.resources.ResourceArgs {

    public static final SensorMqttBrokersArgs Empty = new SensorMqttBrokersArgs();

    /**
     * Specifies whether the broker is enabled for sensor data. Currently, only a single broker may be enabled for sensor data.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether the broker is enabled for sensor data. Currently, only a single broker may be enabled for sensor data.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * ID of the MQTT Broker.
     * 
     */
    @Import(name="mqttBrokerId", required=true)
    private Output<String> mqttBrokerId;

    /**
     * @return ID of the MQTT Broker.
     * 
     */
    public Output<String> mqttBrokerId() {
        return this.mqttBrokerId;
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    private SensorMqttBrokersArgs() {}

    private SensorMqttBrokersArgs(SensorMqttBrokersArgs $) {
        this.enabled = $.enabled;
        this.mqttBrokerId = $.mqttBrokerId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensorMqttBrokersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensorMqttBrokersArgs $;

        public Builder() {
            $ = new SensorMqttBrokersArgs();
        }

        public Builder(SensorMqttBrokersArgs defaults) {
            $ = new SensorMqttBrokersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Specifies whether the broker is enabled for sensor data. Currently, only a single broker may be enabled for sensor data.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether the broker is enabled for sensor data. Currently, only a single broker may be enabled for sensor data.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param mqttBrokerId ID of the MQTT Broker.
         * 
         * @return builder
         * 
         */
        public Builder mqttBrokerId(Output<String> mqttBrokerId) {
            $.mqttBrokerId = mqttBrokerId;
            return this;
        }

        /**
         * @param mqttBrokerId ID of the MQTT Broker.
         * 
         * @return builder
         * 
         */
        public Builder mqttBrokerId(String mqttBrokerId) {
            return mqttBrokerId(Output.of(mqttBrokerId));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        public SensorMqttBrokersArgs build() {
            if ($.mqttBrokerId == null) {
                throw new MissingRequiredPropertyException("SensorMqttBrokersArgs", "mqttBrokerId");
            }
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SensorMqttBrokersArgs", "networkId");
            }
            return $;
        }
    }

}
