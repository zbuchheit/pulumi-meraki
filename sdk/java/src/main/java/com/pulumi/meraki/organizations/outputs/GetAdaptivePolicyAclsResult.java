// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetAdaptivePolicyAclsItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAdaptivePolicyAclsResult {
    /**
     * @return aclId path parameter. Acl ID
     * 
     */
    private @Nullable String aclId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetAdaptivePolicyAclsItem item;
    /**
     * @return Array of ResponseOrganizationsGetOrganizationAdaptivePolicyAcls
     * 
     */
    private List<GetAdaptivePolicyAclsItem> items;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private @Nullable String organizationId;

    private GetAdaptivePolicyAclsResult() {}
    /**
     * @return aclId path parameter. Acl ID
     * 
     */
    public Optional<String> aclId() {
        return Optional.ofNullable(this.aclId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetAdaptivePolicyAclsItem item() {
        return this.item;
    }
    /**
     * @return Array of ResponseOrganizationsGetOrganizationAdaptivePolicyAcls
     * 
     */
    public List<GetAdaptivePolicyAclsItem> items() {
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

    public static Builder builder(GetAdaptivePolicyAclsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aclId;
        private String id;
        private GetAdaptivePolicyAclsItem item;
        private List<GetAdaptivePolicyAclsItem> items;
        private @Nullable String organizationId;
        public Builder() {}
        public Builder(GetAdaptivePolicyAclsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclId = defaults.aclId;
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.items = defaults.items;
    	      this.organizationId = defaults.organizationId;
        }

        @CustomType.Setter
        public Builder aclId(@Nullable String aclId) {

            this.aclId = aclId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAdaptivePolicyAclsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetAdaptivePolicyAclsItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetAdaptivePolicyAclsResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetAdaptivePolicyAclsItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetAdaptivePolicyAclsResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetAdaptivePolicyAclsItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder organizationId(@Nullable String organizationId) {

            this.organizationId = organizationId;
            return this;
        }
        public GetAdaptivePolicyAclsResult build() {
            final var _resultValue = new GetAdaptivePolicyAclsResult();
            _resultValue.aclId = aclId;
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.items = items;
            _resultValue.organizationId = organizationId;
            return _resultValue;
        }
    }
}
