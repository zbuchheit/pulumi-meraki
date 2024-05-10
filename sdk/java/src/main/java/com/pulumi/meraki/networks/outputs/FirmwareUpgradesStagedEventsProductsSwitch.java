// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsProductsSwitchNextUpgrade;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesStagedEventsProductsSwitch {
    /**
     * @return Details of the next firmware upgrade
     * 
     */
    private @Nullable FirmwareUpgradesStagedEventsProductsSwitchNextUpgrade nextUpgrade;

    private FirmwareUpgradesStagedEventsProductsSwitch() {}
    /**
     * @return Details of the next firmware upgrade
     * 
     */
    public Optional<FirmwareUpgradesStagedEventsProductsSwitchNextUpgrade> nextUpgrade() {
        return Optional.ofNullable(this.nextUpgrade);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesStagedEventsProductsSwitch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FirmwareUpgradesStagedEventsProductsSwitchNextUpgrade nextUpgrade;
        public Builder() {}
        public Builder(FirmwareUpgradesStagedEventsProductsSwitch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextUpgrade = defaults.nextUpgrade;
        }

        @CustomType.Setter
        public Builder nextUpgrade(@Nullable FirmwareUpgradesStagedEventsProductsSwitchNextUpgrade nextUpgrade) {

            this.nextUpgrade = nextUpgrade;
            return this;
        }
        public FirmwareUpgradesStagedEventsProductsSwitch build() {
            final var _resultValue = new FirmwareUpgradesStagedEventsProductsSwitch();
            _resultValue.nextUpgrade = nextUpgrade;
            return _resultValue;
        }
    }
}
