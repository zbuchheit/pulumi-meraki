// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetFirmwareUpgradesItemProducts;
import com.pulumi.meraki.networks.outputs.GetFirmwareUpgradesItemUpgradeWindow;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirmwareUpgradesItem {
    /**
     * @return The network devices to be updated
     * 
     */
    private GetFirmwareUpgradesItemProducts products;
    /**
     * @return The timezone for the network
     * 
     */
    private String timezone;
    /**
     * @return Upgrade window for devices in network
     * 
     */
    private GetFirmwareUpgradesItemUpgradeWindow upgradeWindow;

    private GetFirmwareUpgradesItem() {}
    /**
     * @return The network devices to be updated
     * 
     */
    public GetFirmwareUpgradesItemProducts products() {
        return this.products;
    }
    /**
     * @return The timezone for the network
     * 
     */
    public String timezone() {
        return this.timezone;
    }
    /**
     * @return Upgrade window for devices in network
     * 
     */
    public GetFirmwareUpgradesItemUpgradeWindow upgradeWindow() {
        return this.upgradeWindow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetFirmwareUpgradesItemProducts products;
        private String timezone;
        private GetFirmwareUpgradesItemUpgradeWindow upgradeWindow;
        public Builder() {}
        public Builder(GetFirmwareUpgradesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.products = defaults.products;
    	      this.timezone = defaults.timezone;
    	      this.upgradeWindow = defaults.upgradeWindow;
        }

        @CustomType.Setter
        public Builder products(GetFirmwareUpgradesItemProducts products) {
            if (products == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "products");
            }
            this.products = products;
            return this;
        }
        @CustomType.Setter
        public Builder timezone(String timezone) {
            if (timezone == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "timezone");
            }
            this.timezone = timezone;
            return this;
        }
        @CustomType.Setter
        public Builder upgradeWindow(GetFirmwareUpgradesItemUpgradeWindow upgradeWindow) {
            if (upgradeWindow == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "upgradeWindow");
            }
            this.upgradeWindow = upgradeWindow;
            return this;
        }
        public GetFirmwareUpgradesItem build() {
            final var _resultValue = new GetFirmwareUpgradesItem();
            _resultValue.products = products;
            _resultValue.timezone = timezone;
            _resultValue.upgradeWindow = upgradeWindow;
            return _resultValue;
        }
    }
}