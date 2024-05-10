// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetPolicyObjectsItem;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyObjectsResult {
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
    private GetPolicyObjectsItem item;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private @Nullable String organizationId;
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 10 5000. Default is 5000.
     * 
     */
    private @Nullable Integer perPage;
    /**
     * @return policyObjectId path parameter. Policy object ID
     * 
     */
    private @Nullable String policyObjectId;
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String startingAfter;

    private GetPolicyObjectsResult() {}
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
    public GetPolicyObjectsItem item() {
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
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 10 5000. Default is 5000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }
    /**
     * @return policyObjectId path parameter. Policy object ID
     * 
     */
    public Optional<String> policyObjectId() {
        return Optional.ofNullable(this.policyObjectId);
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

    public static Builder builder(GetPolicyObjectsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endingBefore;
        private String id;
        private GetPolicyObjectsItem item;
        private @Nullable String organizationId;
        private @Nullable Integer perPage;
        private @Nullable String policyObjectId;
        private @Nullable String startingAfter;
        public Builder() {}
        public Builder(GetPolicyObjectsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endingBefore = defaults.endingBefore;
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.organizationId = defaults.organizationId;
    	      this.perPage = defaults.perPage;
    	      this.policyObjectId = defaults.policyObjectId;
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
              throw new MissingRequiredPropertyException("GetPolicyObjectsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetPolicyObjectsItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsResult", "item");
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
        public Builder policyObjectId(@Nullable String policyObjectId) {

            this.policyObjectId = policyObjectId;
            return this;
        }
        @CustomType.Setter
        public Builder startingAfter(@Nullable String startingAfter) {

            this.startingAfter = startingAfter;
            return this;
        }
        public GetPolicyObjectsResult build() {
            final var _resultValue = new GetPolicyObjectsResult();
            _resultValue.endingBefore = endingBefore;
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.organizationId = organizationId;
            _resultValue.perPage = perPage;
            _resultValue.policyObjectId = policyObjectId;
            _resultValue.startingAfter = startingAfter;
            return _resultValue;
        }
    }
}
