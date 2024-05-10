// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetInventoryOnboardingCloudMonitoringNetworksItem;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInventoryOnboardingCloudMonitoringNetworksResult {
    /**
     * @return deviceType query parameter. Device Type switch or wireless controller
     * 
     */
    private String deviceType;
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
     * @return Array of ResponseOrganizationsGetOrganizationInventoryOnboardingCloudMonitoringNetworks
     * 
     */
    private List<GetInventoryOnboardingCloudMonitoringNetworksItem> items;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private String organizationId;
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 100000. Default is 1000.
     * 
     */
    private @Nullable Integer perPage;
    /**
     * @return search query parameter. Optional parameter to search on network name
     * 
     */
    private @Nullable String search;
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String startingAfter;

    private GetInventoryOnboardingCloudMonitoringNetworksResult() {}
    /**
     * @return deviceType query parameter. Device Type switch or wireless controller
     * 
     */
    public String deviceType() {
        return this.deviceType;
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
     * @return Array of ResponseOrganizationsGetOrganizationInventoryOnboardingCloudMonitoringNetworks
     * 
     */
    public List<GetInventoryOnboardingCloudMonitoringNetworksItem> items() {
        return this.items;
    }
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 100000. Default is 1000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }
    /**
     * @return search query parameter. Optional parameter to search on network name
     * 
     */
    public Optional<String> search() {
        return Optional.ofNullable(this.search);
    }
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInventoryOnboardingCloudMonitoringNetworksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deviceType;
        private @Nullable String endingBefore;
        private String id;
        private List<GetInventoryOnboardingCloudMonitoringNetworksItem> items;
        private String organizationId;
        private @Nullable Integer perPage;
        private @Nullable String search;
        private @Nullable String startingAfter;
        public Builder() {}
        public Builder(GetInventoryOnboardingCloudMonitoringNetworksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceType = defaults.deviceType;
    	      this.endingBefore = defaults.endingBefore;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.organizationId = defaults.organizationId;
    	      this.perPage = defaults.perPage;
    	      this.search = defaults.search;
    	      this.startingAfter = defaults.startingAfter;
        }

        @CustomType.Setter
        public Builder deviceType(String deviceType) {
            if (deviceType == null) {
              throw new MissingRequiredPropertyException("GetInventoryOnboardingCloudMonitoringNetworksResult", "deviceType");
            }
            this.deviceType = deviceType;
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
              throw new MissingRequiredPropertyException("GetInventoryOnboardingCloudMonitoringNetworksResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetInventoryOnboardingCloudMonitoringNetworksItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetInventoryOnboardingCloudMonitoringNetworksResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetInventoryOnboardingCloudMonitoringNetworksItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetInventoryOnboardingCloudMonitoringNetworksResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder perPage(@Nullable Integer perPage) {

            this.perPage = perPage;
            return this;
        }
        @CustomType.Setter
        public Builder search(@Nullable String search) {

            this.search = search;
            return this;
        }
        @CustomType.Setter
        public Builder startingAfter(@Nullable String startingAfter) {

            this.startingAfter = startingAfter;
            return this;
        }
        public GetInventoryOnboardingCloudMonitoringNetworksResult build() {
            final var _resultValue = new GetInventoryOnboardingCloudMonitoringNetworksResult();
            _resultValue.deviceType = deviceType;
            _resultValue.endingBefore = endingBefore;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.organizationId = organizationId;
            _resultValue.perPage = perPage;
            _resultValue.search = search;
            _resultValue.startingAfter = startingAfter;
            return _resultValue;
        }
    }
}
