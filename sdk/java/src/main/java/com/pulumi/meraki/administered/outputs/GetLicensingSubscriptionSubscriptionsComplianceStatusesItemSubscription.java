// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription {
    /**
     * @return Subscription&#39;s ID
     * 
     */
    private String id;
    /**
     * @return Friendly name to identify the subscription
     * 
     */
    private String name;
    /**
     * @return One of the following: &#34;inactive&#34; | &#34;active&#34; | &#34;out*of*compliance&#34; | &#34;expired&#34; | &#34;canceled&#34;
     * 
     */
    private String status;

    private GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription() {}
    /**
     * @return Subscription&#39;s ID
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Friendly name to identify the subscription
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return One of the following: &#34;inactive&#34; | &#34;active&#34; | &#34;out*of*compliance&#34; | &#34;expired&#34; | &#34;canceled&#34;
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String status;
        public Builder() {}
        public Builder(GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription", "status");
            }
            this.status = status;
            return this;
        }
        public GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription build() {
            final var _resultValue = new GetLicensingSubscriptionSubscriptionsComplianceStatusesItemSubscription();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
