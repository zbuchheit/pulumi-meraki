// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.administered.outputs.GetLicensingSubscriptionSubscriptionsComplianceStatusesItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetLicensingSubscriptionSubscriptionsComplianceStatusesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseLicensingGetAdministeredLicensingSubscriptionSubscriptionsComplianceStatuses
     * 
     */
    private List<GetLicensingSubscriptionSubscriptionsComplianceStatusesItem> items;
    /**
     * @return organizationIds query parameter. Organizations to get subscription compliance information for
     * 
     */
    private @Nullable List<String> organizationIds;
    /**
     * @return subscriptionIds query parameter. Subscription ids
     * 
     */
    private @Nullable List<String> subscriptionIds;

    private GetLicensingSubscriptionSubscriptionsComplianceStatusesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseLicensingGetAdministeredLicensingSubscriptionSubscriptionsComplianceStatuses
     * 
     */
    public List<GetLicensingSubscriptionSubscriptionsComplianceStatusesItem> items() {
        return this.items;
    }
    /**
     * @return organizationIds query parameter. Organizations to get subscription compliance information for
     * 
     */
    public List<String> organizationIds() {
        return this.organizationIds == null ? List.of() : this.organizationIds;
    }
    /**
     * @return subscriptionIds query parameter. Subscription ids
     * 
     */
    public List<String> subscriptionIds() {
        return this.subscriptionIds == null ? List.of() : this.subscriptionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensingSubscriptionSubscriptionsComplianceStatusesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetLicensingSubscriptionSubscriptionsComplianceStatusesItem> items;
        private @Nullable List<String> organizationIds;
        private @Nullable List<String> subscriptionIds;
        public Builder() {}
        public Builder(GetLicensingSubscriptionSubscriptionsComplianceStatusesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.organizationIds = defaults.organizationIds;
    	      this.subscriptionIds = defaults.subscriptionIds;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsComplianceStatusesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetLicensingSubscriptionSubscriptionsComplianceStatusesItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsComplianceStatusesResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetLicensingSubscriptionSubscriptionsComplianceStatusesItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder organizationIds(@Nullable List<String> organizationIds) {

            this.organizationIds = organizationIds;
            return this;
        }
        public Builder organizationIds(String... organizationIds) {
            return organizationIds(List.of(organizationIds));
        }
        @CustomType.Setter
        public Builder subscriptionIds(@Nullable List<String> subscriptionIds) {

            this.subscriptionIds = subscriptionIds;
            return this;
        }
        public Builder subscriptionIds(String... subscriptionIds) {
            return subscriptionIds(List.of(subscriptionIds));
        }
        public GetLicensingSubscriptionSubscriptionsComplianceStatusesResult build() {
            final var _resultValue = new GetLicensingSubscriptionSubscriptionsComplianceStatusesResult();
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.organizationIds = organizationIds;
            _resultValue.subscriptionIds = subscriptionIds;
            return _resultValue;
        }
    }
}