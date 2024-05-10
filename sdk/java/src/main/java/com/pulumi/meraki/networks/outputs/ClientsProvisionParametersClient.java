// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientsProvisionParametersClient {
    /**
     * @return The MAC address of the client. Required.
     * 
     */
    private @Nullable String mac;
    /**
     * @return The display name for the client. Optional. Limited to 255 bytes.
     * 
     */
    private @Nullable String name;

    private ClientsProvisionParametersClient() {}
    /**
     * @return The MAC address of the client. Required.
     * 
     */
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }
    /**
     * @return The display name for the client. Optional. Limited to 255 bytes.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientsProvisionParametersClient defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mac;
        private @Nullable String name;
        public Builder() {}
        public Builder(ClientsProvisionParametersClient defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mac = defaults.mac;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder mac(@Nullable String mac) {

            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public ClientsProvisionParametersClient build() {
            final var _resultValue = new ClientsProvisionParametersClient();
            _resultValue.mac = mac;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
