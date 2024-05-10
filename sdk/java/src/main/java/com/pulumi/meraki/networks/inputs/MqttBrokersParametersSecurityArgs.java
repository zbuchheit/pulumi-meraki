// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.MqttBrokersParametersSecurityTlsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MqttBrokersParametersSecurityArgs extends com.pulumi.resources.ResourceArgs {

    public static final MqttBrokersParametersSecurityArgs Empty = new MqttBrokersParametersSecurityArgs();

    /**
     * Security protocol of the MQTT broker.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Security protocol of the MQTT broker.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * TLS settings of the MQTT broker.
     * 
     */
    @Import(name="tls")
    private @Nullable Output<MqttBrokersParametersSecurityTlsArgs> tls;

    /**
     * @return TLS settings of the MQTT broker.
     * 
     */
    public Optional<Output<MqttBrokersParametersSecurityTlsArgs>> tls() {
        return Optional.ofNullable(this.tls);
    }

    private MqttBrokersParametersSecurityArgs() {}

    private MqttBrokersParametersSecurityArgs(MqttBrokersParametersSecurityArgs $) {
        this.mode = $.mode;
        this.tls = $.tls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MqttBrokersParametersSecurityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MqttBrokersParametersSecurityArgs $;

        public Builder() {
            $ = new MqttBrokersParametersSecurityArgs();
        }

        public Builder(MqttBrokersParametersSecurityArgs defaults) {
            $ = new MqttBrokersParametersSecurityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode Security protocol of the MQTT broker.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Security protocol of the MQTT broker.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param tls TLS settings of the MQTT broker.
         * 
         * @return builder
         * 
         */
        public Builder tls(@Nullable Output<MqttBrokersParametersSecurityTlsArgs> tls) {
            $.tls = tls;
            return this;
        }

        /**
         * @param tls TLS settings of the MQTT broker.
         * 
         * @return builder
         * 
         */
        public Builder tls(MqttBrokersParametersSecurityTlsArgs tls) {
            return tls(Output.of(tls));
        }

        public MqttBrokersParametersSecurityArgs build() {
            return $;
        }
    }

}
