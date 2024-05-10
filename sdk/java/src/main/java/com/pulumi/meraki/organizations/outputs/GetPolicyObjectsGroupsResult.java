// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetPolicyObjectsGroupsItem;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyObjectsGroupsResult {
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
    private GetPolicyObjectsGroupsItem item;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private @Nullable String organizationId;
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 10 1000. Default is 1000.
     * 
     */
    private @Nullable Integer perPage;
    /**
     * @return policyObjectGroupId path parameter. Policy object group ID
     * 
     */
    private @Nullable String policyObjectGroupId;
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String startingAfter;

    private GetPolicyObjectsGroupsResult() {}
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
    public GetPolicyObjectsGroupsItem item() {
        return this.item;
    }
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 10 1000. Default is 1000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }
    /**
     * @return policyObjectGroupId path parameter. Policy object group ID
     * 
     */
    public Optional<String> policyObjectGroupId() {
        return Optional.ofNullable(this.policyObjectGroupId);
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

    public static Builder builder(GetPolicyObjectsGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endingBefore;
        private String id;
        private GetPolicyObjectsGroupsItem item;
        private @Nullable String organizationId;
        private @Nullable Integer perPage;
        private @Nullable String policyObjectGroupId;
        private @Nullable String startingAfter;
        public Builder() {}
        public Builder(GetPolicyObjectsGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endingBefore = defaults.endingBefore;
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.organizationId = defaults.organizationId;
    	      this.perPage = defaults.perPage;
    	      this.policyObjectGroupId = defaults.policyObjectGroupId;
    	      this.startingAfter = defaults.startingAfter;
        }

        @CustomType.Setter
        public Builder endingBefore(@Nullable String endingBefore) {

            this.endingBefore = endingBefore;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsGroupsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetPolicyObjectsGroupsItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsGroupsResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(@Nullable String organizationId) {

            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder perPage(@Nullable Integer perPage) {

            this.perPage = perPage;
            return this;
        }
        @CustomType.Setter
        public Builder policyObjectGroupId(@Nullable String policyObjectGroupId) {

            this.policyObjectGroupId = policyObjectGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder startingAfter(@Nullable String startingAfter) {

            this.startingAfter = startingAfter;
            return this;
        }
        public GetPolicyObjectsGroupsResult build() {
            final var _resultValue = new GetPolicyObjectsGroupsResult();
            _resultValue.endingBefore = endingBefore;
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.organizationId = organizationId;
            _resultValue.perPage = perPage;
            _resultValue.policyObjectGroupId = policyObjectGroupId;
            _resultValue.startingAfter = startingAfter;
            return _resultValue;
        }
    }
}
