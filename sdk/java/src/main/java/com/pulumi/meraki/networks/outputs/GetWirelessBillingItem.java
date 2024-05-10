// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetWirelessBillingItemPlan;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWirelessBillingItem {
    /**
     * @return The currency code of this node group&#39;s billing plans
     * 
     */
    private String currency;
    /**
     * @return Array of billing plans in the node group. (Can configure a maximum of 5)
     * 
     */
    private List<GetWirelessBillingItemPlan> plans;

    private GetWirelessBillingItem() {}
    /**
     * @return The currency code of this node group&#39;s billing plans
     * 
     */
    public String currency() {
        return this.currency;
    }
    /**
     * @return Array of billing plans in the node group. (Can configure a maximum of 5)
     * 
     */
    public List<GetWirelessBillingItemPlan> plans() {
        return this.plans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessBillingItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String currency;
        private List<GetWirelessBillingItemPlan> plans;
        public Builder() {}
        public Builder(GetWirelessBillingItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currency = defaults.currency;
    	      this.plans = defaults.plans;
        }

        @CustomType.Setter
        public Builder currency(String currency) {
            if (currency == null) {
              throw new MissingRequiredPropertyException("GetWirelessBillingItem", "currency");
            }
            this.currency = currency;
            return this;
        }
        @CustomType.Setter
        public Builder plans(List<GetWirelessBillingItemPlan> plans) {
            if (plans == null) {
              throw new MissingRequiredPropertyException("GetWirelessBillingItem", "plans");
            }
            this.plans = plans;
            return this;
        }
        public Builder plans(GetWirelessBillingItemPlan... plans) {
            return plans(List.of(plans));
        }
        public GetWirelessBillingItem build() {
            final var _resultValue = new GetWirelessBillingItem();
            _resultValue.currency = currency;
            _resultValue.plans = plans;
            return _resultValue;
        }
    }
}
