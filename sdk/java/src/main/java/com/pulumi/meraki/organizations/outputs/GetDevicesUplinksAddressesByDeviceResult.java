// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetDevicesUplinksAddressesByDeviceItem;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDevicesUplinksAddressesByDeviceResult {
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
     * @return Array of ResponseOrganizationsGetOrganizationDevicesUplinksAddressesByDevice
     * 
     */
    private List<GetDevicesUplinksAddressesByDeviceItem> items;
    /**
     * @return networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
     * 
     */
    private @Nullable List<String> networkIds;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private String organizationId;
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    private @Nullable Integer perPage;
    /**
     * @return productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
     * 
     */
    private @Nullable List<String> productTypes;
    /**
     * @return serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
     * 
     */
    private @Nullable List<String> serials;
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String startingAfter;
    /**
     * @return tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, &#39;tagsFilterType&#39; should also be included (see below). This filter uses multiple exact matches.
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return tagsFilterType query parameter. An optional parameter of value &#39;withAnyTags&#39; or &#39;withAllTags&#39; to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, &#39;withAnyTags&#39; will be selected.
     * 
     */
    private @Nullable String tagsFilterType;

    private GetDevicesUplinksAddressesByDeviceResult() {}
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
     * @return Array of ResponseOrganizationsGetOrganizationDevicesUplinksAddressesByDevice
     * 
     */
    public List<GetDevicesUplinksAddressesByDeviceItem> items() {
        return this.items;
    }
    /**
     * @return networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
     * 
     */
    public List<String> networkIds() {
        return this.networkIds == null ? List.of() : this.networkIds;
    }
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }
    /**
     * @return productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
     * 
     */
    public List<String> productTypes() {
        return this.productTypes == null ? List.of() : this.productTypes;
    }
    /**
     * @return serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
     * 
     */
    public List<String> serials() {
        return this.serials == null ? List.of() : this.serials;
    }
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }
    /**
     * @return tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, &#39;tagsFilterType&#39; should also be included (see below). This filter uses multiple exact matches.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return tagsFilterType query parameter. An optional parameter of value &#39;withAnyTags&#39; or &#39;withAllTags&#39; to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, &#39;withAnyTags&#39; will be selected.
     * 
     */
    public Optional<String> tagsFilterType() {
        return Optional.ofNullable(this.tagsFilterType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesUplinksAddressesByDeviceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endingBefore;
        private String id;
        private List<GetDevicesUplinksAddressesByDeviceItem> items;
        private @Nullable List<String> networkIds;
        private String organizationId;
        private @Nullable Integer perPage;
        private @Nullable List<String> productTypes;
        private @Nullable List<String> serials;
        private @Nullable String startingAfter;
        private @Nullable List<String> tags;
        private @Nullable String tagsFilterType;
        public Builder() {}
        public Builder(GetDevicesUplinksAddressesByDeviceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endingBefore = defaults.endingBefore;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.networkIds = defaults.networkIds;
    	      this.organizationId = defaults.organizationId;
    	      this.perPage = defaults.perPage;
    	      this.productTypes = defaults.productTypes;
    	      this.serials = defaults.serials;
    	      this.startingAfter = defaults.startingAfter;
    	      this.tags = defaults.tags;
    	      this.tagsFilterType = defaults.tagsFilterType;
        }

        @CustomType.Setter
        public Builder endingBefore(@Nullable String endingBefore) {

            this.endingBefore = endingBefore;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDevicesUplinksAddressesByDeviceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetDevicesUplinksAddressesByDeviceItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetDevicesUplinksAddressesByDeviceResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetDevicesUplinksAddressesByDeviceItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkIds(@Nullable List<String> networkIds) {

            this.networkIds = networkIds;
            return this;
        }
        public Builder networkIds(String... networkIds) {
            return networkIds(List.of(networkIds));
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetDevicesUplinksAddressesByDeviceResult", "organizationId");
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
        public Builder productTypes(@Nullable List<String> productTypes) {

            this.productTypes = productTypes;
            return this;
        }
        public Builder productTypes(String... productTypes) {
            return productTypes(List.of(productTypes));
        }
        @CustomType.Setter
        public Builder serials(@Nullable List<String> serials) {

            this.serials = serials;
            return this;
        }
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }
        @CustomType.Setter
        public Builder startingAfter(@Nullable String startingAfter) {

            this.startingAfter = startingAfter;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder tagsFilterType(@Nullable String tagsFilterType) {

            this.tagsFilterType = tagsFilterType;
            return this;
        }
        public GetDevicesUplinksAddressesByDeviceResult build() {
            final var _resultValue = new GetDevicesUplinksAddressesByDeviceResult();
            _resultValue.endingBefore = endingBefore;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.networkIds = networkIds;
            _resultValue.organizationId = organizationId;
            _resultValue.perPage = perPage;
            _resultValue.productTypes = productTypes;
            _resultValue.serials = serials;
            _resultValue.startingAfter = startingAfter;
            _resultValue.tags = tags;
            _resultValue.tagsFilterType = tagsFilterType;
            return _resultValue;
        }
    }
}
