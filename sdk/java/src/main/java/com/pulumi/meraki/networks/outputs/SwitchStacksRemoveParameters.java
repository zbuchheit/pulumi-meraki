// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchStacksRemoveParameters {
    /**
     * @return The serial of the switch to be removed
     * 
     */
    private @Nullable String serial;

    private SwitchStacksRemoveParameters() {}
    /**
     * @return The serial of the switch to be removed
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchStacksRemoveParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String serial;
        public Builder() {}
        public Builder(SwitchStacksRemoveParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serial = defaults.serial;
        }

        @CustomType.Setter
        public Builder serial(@Nullable String serial) {

            this.serial = serial;
            return this;
        }
        public SwitchStacksRemoveParameters build() {
            final var _resultValue = new SwitchStacksRemoveParameters();
            _resultValue.serial = serial;
            return _resultValue;
        }
    }
}
