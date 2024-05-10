// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceVpnBgpNeighborAuthentication {
    /**
     * @return Password to configure MD5 authentication between BGP peers.
     * 
     */
    private @Nullable String password;

    private ApplianceVpnBgpNeighborAuthentication() {}
    /**
     * @return Password to configure MD5 authentication between BGP peers.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceVpnBgpNeighborAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String password;
        public Builder() {}
        public Builder(ApplianceVpnBgpNeighborAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
        }

        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        public ApplianceVpnBgpNeighborAuthentication build() {
            final var _resultValue = new ApplianceVpnBgpNeighborAuthentication();
            _resultValue.password = password;
            return _resultValue;
        }
    }
}
