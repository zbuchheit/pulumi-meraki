// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.administered.outputs.GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription;
import com.pulumi.meraki.administered.outputs.GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolations;
import java.util.Objects;

@CustomType
public final class GetLicensingSubscriptionSubscriptionsComplianceStatusesItem {
    /**
     * @return Subscription details
     * 
     */
    private GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription subscription;
    /**
     * @return Violations
     * 
     */
    private GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolations violations;

    private GetLicensingSubscriptionSubscriptionsComplianceStatusesItem() {}
    /**
     * @return Subscription details
     * 
     */
    public GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription subscription() {
        return this.subscription;
    }
    /**
     * @return Violations
     * 
     */
    public GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolations violations() {
        return this.violations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensingSubscriptionSubscriptionsComplianceStatusesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription subscription;
        private GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolations violations;
        public Builder() {}
        public Builder(GetLicensingSubscriptionSubscriptionsComplianceStatusesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
    	      this.violations = defaults.violations;
        }

        @CustomType.Setter
        public Builder subscription(GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription subscription) {
            if (subscription == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsComplianceStatusesItem", "subscription");
            }
            this.subscription = subscription;
            return this;
        }
        @CustomType.Setter
        public Builder violations(GetLicensingSubscriptionSubscriptionsComplianceStatusesItemViolations violations) {
            if (violations == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsComplianceStatusesItem", "violations");
            }
            this.violations = violations;
            return this;
        }
        public GetLicensingSubscriptionSubscriptionsComplianceStatusesItem build() {
            final var _resultValue = new GetLicensingSubscriptionSubscriptionsComplianceStatusesItem();
            _resultValue.subscription = subscription;
            _resultValue.violations = violations;
            return _resultValue;
        }
    }
}
