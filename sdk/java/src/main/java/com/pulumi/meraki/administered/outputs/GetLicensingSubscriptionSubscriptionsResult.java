// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.administered.outputs.GetLicensingSubscriptionSubscriptionsItem;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLicensingSubscriptionSubscriptionsResult {
    /**
     * @return endDate query parameter. Filter subscriptions by end date, ISO 8601 format. To filter with a range of dates, use &#39;endDate[
     * ]=?&#39; in the request. Accepted options include lt, gt, lte, gte.
     * 
     */
    private @Nullable String endDate;
    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String endingBefore;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseLicensingGetAdministeredLicensingSubscriptionSubscriptions
     * 
     */
    private List<GetLicensingSubscriptionSubscriptionsItem> items;
    /**
     * @return organizationIds query parameter. Organizations to get associated subscriptions for
     * 
     */
    private @Nullable List<String> organizationIds;
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    private @Nullable Integer perPage;
    /**
     * @return productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
     * 
     */
    private @Nullable List<String> productTypes;
    /**
     * @return startDate query parameter. Filter subscriptions by start date, ISO 8601 format. To filter with a range of dates, use &#39;startDate[
     * ]=?&#39; in the request. Accepted options include lt, gt, lte, gte.
     * 
     */
    private @Nullable String startDate;
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String startingAfter;
    /**
     * @return statuses query parameter. List of statuses that returned subscriptions can have
     * 
     */
    private @Nullable List<String> statuses;
    /**
     * @return subscriptionIds query parameter. List of subscription ids to fetch
     * 
     */
    private @Nullable List<String> subscriptionIds;

    private GetLicensingSubscriptionSubscriptionsResult() {}
    /**
     * @return endDate query parameter. Filter subscriptions by end date, ISO 8601 format. To filter with a range of dates, use &#39;endDate[
     * ]=?&#39; in the request. Accepted options include lt, gt, lte, gte.
     * 
     */
    public Optional<String> endDate() {
        return Optional.ofNullable(this.endDate);
    }
    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseLicensingGetAdministeredLicensingSubscriptionSubscriptions
     * 
     */
    public List<GetLicensingSubscriptionSubscriptionsItem> items() {
        return this.items;
    }
    /**
     * @return organizationIds query parameter. Organizations to get associated subscriptions for
     * 
     */
    public List<String> organizationIds() {
        return this.organizationIds == null ? List.of() : this.organizationIds;
    }
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }
    /**
     * @return productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
     * 
     */
    public List<String> productTypes() {
        return this.productTypes == null ? List.of() : this.productTypes;
    }
    /**
     * @return startDate query parameter. Filter subscriptions by start date, ISO 8601 format. To filter with a range of dates, use &#39;startDate[
     * ]=?&#39; in the request. Accepted options include lt, gt, lte, gte.
     * 
     */
    public Optional<String> startDate() {
        return Optional.ofNullable(this.startDate);
    }
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }
    /**
     * @return statuses query parameter. List of statuses that returned subscriptions can have
     * 
     */
    public List<String> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * @return subscriptionIds query parameter. List of subscription ids to fetch
     * 
     */
    public List<String> subscriptionIds() {
        return this.subscriptionIds == null ? List.of() : this.subscriptionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensingSubscriptionSubscriptionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endDate;
        private @Nullable String endingBefore;
        private String id;
        private List<GetLicensingSubscriptionSubscriptionsItem> items;
        private @Nullable List<String> organizationIds;
        private @Nullable Integer perPage;
        private @Nullable List<String> productTypes;
        private @Nullable String startDate;
        private @Nullable String startingAfter;
        private @Nullable List<String> statuses;
        private @Nullable List<String> subscriptionIds;
        public Builder() {}
        public Builder(GetLicensingSubscriptionSubscriptionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.endingBefore = defaults.endingBefore;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.organizationIds = defaults.organizationIds;
    	      this.perPage = defaults.perPage;
    	      this.productTypes = defaults.productTypes;
    	      this.startDate = defaults.startDate;
    	      this.startingAfter = defaults.startingAfter;
    	      this.statuses = defaults.statuses;
    	      this.subscriptionIds = defaults.subscriptionIds;
        }

        @CustomType.Setter
        public Builder endDate(@Nullable String endDate) {

            this.endDate = endDate;
            return this;
        }
        @CustomType.Setter
        public Builder endingBefore(@Nullable String endingBefore) {

            this.endingBefore = endingBefore;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetLicensingSubscriptionSubscriptionsItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetLicensingSubscriptionSubscriptionsResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetLicensingSubscriptionSubscriptionsItem... items) {
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
        public Builder perPage(@Nullable Integer perPage) {

            this.perPage = perPage;
            return this;
        }
        @CustomType.Setter
        public Builder productTypes(@Nullable List<String> productTypes) {

            this.productTypes = productTypes;
            return this;
        }
        public Builder productTypes(String... productTypes) {
            return productTypes(List.of(productTypes));
        }
        @CustomType.Setter
        public Builder startDate(@Nullable String startDate) {

            this.startDate = startDate;
            return this;
        }
        @CustomType.Setter
        public Builder startingAfter(@Nullable String startingAfter) {

            this.startingAfter = startingAfter;
            return this;
        }
        @CustomType.Setter
        public Builder statuses(@Nullable List<String> statuses) {

            this.statuses = statuses;
            return this;
        }
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
        }
        @CustomType.Setter
        public Builder subscriptionIds(@Nullable List<String> subscriptionIds) {

            this.subscriptionIds = subscriptionIds;
            return this;
        }
        public Builder subscriptionIds(String... subscriptionIds) {
            return subscriptionIds(List.of(subscriptionIds));
        }
        public GetLicensingSubscriptionSubscriptionsResult build() {
            final var _resultValue = new GetLicensingSubscriptionSubscriptionsResult();
            _resultValue.endDate = endDate;
            _resultValue.endingBefore = endingBefore;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.organizationIds = organizationIds;
            _resultValue.perPage = perPage;
            _resultValue.productTypes = productTypes;
            _resultValue.startDate = startDate;
            _resultValue.startingAfter = startingAfter;
            _resultValue.statuses = statuses;
            _resultValue.subscriptionIds = subscriptionIds;
            return _resultValue;
        }
    }
}
