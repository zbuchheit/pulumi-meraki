// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAdaptivePolicyGroupsItemPolicyObject {
    private String id;
    private String name;

    private GetAdaptivePolicyGroupsItemPolicyObject() {}
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdaptivePolicyGroupsItemPolicyObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetAdaptivePolicyGroupsItemPolicyObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAdaptivePolicyGroupsItemPolicyObject", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAdaptivePolicyGroupsItemPolicyObject", "name");
            }
            this.name = name;
            return this;
        }
        public GetAdaptivePolicyGroupsItemPolicyObject build() {
            final var _resultValue = new GetAdaptivePolicyGroupsItemPolicyObject();
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
