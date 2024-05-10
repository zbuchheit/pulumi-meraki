// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsDeferItemProductsSwitch;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesStagedEventsDeferItemProducts {
    /**
     * @return The Switch network to be updated
     * 
     */
    private @Nullable FirmwareUpgradesStagedEventsDeferItemProductsSwitch switch_;

    private FirmwareUpgradesStagedEventsDeferItemProducts() {}
    /**
     * @return The Switch network to be updated
     * 
     */
    public Optional<FirmwareUpgradesStagedEventsDeferItemProductsSwitch> switch_() {
        return Optional.ofNullable(this.switch_);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesStagedEventsDeferItemProducts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FirmwareUpgradesStagedEventsDeferItemProductsSwitch switch_;
        public Builder() {}
        public Builder(FirmwareUpgradesStagedEventsDeferItemProducts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.switch_ = defaults.switch_;
        }

        @CustomType.Setter("switch")
        public Builder switch_(@Nullable FirmwareUpgradesStagedEventsDeferItemProductsSwitch switch_) {

            this.switch_ = switch_;
            return this;
        }
        public FirmwareUpgradesStagedEventsDeferItemProducts build() {
            final var _resultValue = new FirmwareUpgradesStagedEventsDeferItemProducts();
            _resultValue.switch_ = switch_;
            return _resultValue;
        }
    }
}
