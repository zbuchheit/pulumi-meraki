// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetFirmwareUpgradesStagedEventsItemProductsSwitch;
import java.util.Objects;

@CustomType
public final class GetFirmwareUpgradesStagedEventsItemProducts {
    /**
     * @return The Switch network to be updated
     * 
     */
    private GetFirmwareUpgradesStagedEventsItemProductsSwitch switch_;

    private GetFirmwareUpgradesStagedEventsItemProducts() {}
    /**
     * @return The Switch network to be updated
     * 
     */
    public GetFirmwareUpgradesStagedEventsItemProductsSwitch switch_() {
        return this.switch_;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesStagedEventsItemProducts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetFirmwareUpgradesStagedEventsItemProductsSwitch switch_;
        public Builder() {}
        public Builder(GetFirmwareUpgradesStagedEventsItemProducts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.switch_ = defaults.switch_;
        }

        @CustomType.Setter("switch")
        public Builder switch_(GetFirmwareUpgradesStagedEventsItemProductsSwitch switch_) {
            if (switch_ == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesStagedEventsItemProducts", "switch_");
            }
            this.switch_ = switch_;
            return this;
        }
        public GetFirmwareUpgradesStagedEventsItemProducts build() {
            final var _resultValue = new GetFirmwareUpgradesStagedEventsItemProducts();
            _resultValue.switch_ = switch_;
            return _resultValue;
        }
    }
}