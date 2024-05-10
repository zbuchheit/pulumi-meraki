// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InventoryClaimItemLicense {
    /**
     * @return The key of the license
     * 
     */
    private @Nullable String key;
    /**
     * @return The mode of the license
     * 
     */
    private @Nullable String mode;

    private InventoryClaimItemLicense() {}
    /**
     * @return The key of the license
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The mode of the license
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryClaimItemLicense defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String mode;
        public Builder() {}
        public Builder(InventoryClaimItemLicense defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        public InventoryClaimItemLicense build() {
            final var _resultValue = new InventoryClaimItemLicense();
            _resultValue.key = key;
            _resultValue.mode = mode;
            return _resultValue;
        }
    }
}
