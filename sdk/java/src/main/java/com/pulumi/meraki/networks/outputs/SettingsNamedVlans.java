// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingsNamedVlans {
    /**
     * @return Enables / disables Named VLANs on the Network.
     * 
     */
    private @Nullable Boolean enabled;

    private SettingsNamedVlans() {}
    /**
     * @return Enables / disables Named VLANs on the Network.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsNamedVlans defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(SettingsNamedVlans defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public SettingsNamedVlans build() {
            final var _resultValue = new SettingsNamedVlans();
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
