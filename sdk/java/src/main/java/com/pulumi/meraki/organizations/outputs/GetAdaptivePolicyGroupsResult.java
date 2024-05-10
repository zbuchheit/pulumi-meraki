// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetAdaptivePolicyGroupsItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAdaptivePolicyGroupsResult {
    /**
     * @return id path parameter.
     * 
     */
    private @Nullable String id;
    private GetAdaptivePolicyGroupsItem item;
    /**
     * @return Array of ResponseOrganizationsGetOrganizationAdaptivePolicyGroups
     * 
     */
    private List<GetAdaptivePolicyGroupsItem> items;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private @Nullable String organizationId;

    private GetAdaptivePolicyGroupsResult() {}
    /**
     * @return id path parameter.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public GetAdaptivePolicyGroupsItem item() {
        return this.item;
    }
    /**
     * @return Array of ResponseOrganizationsGetOrganizationAdaptivePolicyGroups
     * 
     */
    public List<GetAdaptivePolicyGroupsItem> items() {
        return this.items;
    }
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdaptivePolicyGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private GetAdaptivePolicyGroupsItem item;
        private List<GetAdaptivePolicyGroupsItem> items;
        private @Nullable String organizationId;
        public Builder() {}
        public Builder(GetAdaptivePolicyGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.items = defaults.items;
    	      this.organizationId = defaults.organizationId;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetAdaptivePolicyGroupsItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetAdaptivePolicyGroupsResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetAdaptivePolicyGroupsItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetAdaptivePolicyGroupsResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetAdaptivePolicyGroupsItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder organizationId(@Nullable String organizationId) {

            this.organizationId = organizationId;
            return this;
        }
        public GetAdaptivePolicyGroupsResult build() {
            final var _resultValue = new GetAdaptivePolicyGroupsResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.items = items;
            _resultValue.organizationId = organizationId;
            return _resultValue;
        }
    }
}
