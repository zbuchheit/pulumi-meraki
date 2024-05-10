// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MqttBrokersItemSecurityTls {
    /**
     * @return Indicates whether the CA certificate is set
     * 
     */
    private @Nullable Boolean hasCaCertificate;
    /**
     * @return Whether the TLS hostname verification is enabled for the MQTT broker.
     * 
     */
    private @Nullable Boolean verifyHostnames;

    private MqttBrokersItemSecurityTls() {}
    /**
     * @return Indicates whether the CA certificate is set
     * 
     */
    public Optional<Boolean> hasCaCertificate() {
        return Optional.ofNullable(this.hasCaCertificate);
    }
    /**
     * @return Whether the TLS hostname verification is enabled for the MQTT broker.
     * 
     */
    public Optional<Boolean> verifyHostnames() {
        return Optional.ofNullable(this.verifyHostnames);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MqttBrokersItemSecurityTls defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean hasCaCertificate;
        private @Nullable Boolean verifyHostnames;
        public Builder() {}
        public Builder(MqttBrokersItemSecurityTls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasCaCertificate = defaults.hasCaCertificate;
    	      this.verifyHostnames = defaults.verifyHostnames;
        }

        @CustomType.Setter
        public Builder hasCaCertificate(@Nullable Boolean hasCaCertificate) {

            this.hasCaCertificate = hasCaCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder verifyHostnames(@Nullable Boolean verifyHostnames) {

            this.verifyHostnames = verifyHostnames;
            return this;
        }
        public MqttBrokersItemSecurityTls build() {
            final var _resultValue = new MqttBrokersItemSecurityTls();
            _resultValue.hasCaCertificate = hasCaCertificate;
            _resultValue.verifyHostnames = verifyHostnames;
            return _resultValue;
        }
    }
}
