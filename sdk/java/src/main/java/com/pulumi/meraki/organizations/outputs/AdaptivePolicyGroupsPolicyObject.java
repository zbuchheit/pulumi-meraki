// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AdaptivePolicyGroupsPolicyObject {
    /**
     * @return The ID of the policy object
     * 
     */
    private @Nullable String id;
    /**
     * @return The name of the policy object
     * 
     */
    private @Nullable String name;

    private AdaptivePolicyGroupsPolicyObject() {}
    /**
     * @return The ID of the policy object
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the policy object
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdaptivePolicyGroupsPolicyObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        public Builder() {}
        public Builder(AdaptivePolicyGroupsPolicyObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public AdaptivePolicyGroupsPolicyObject build() {
            final var _resultValue = new AdaptivePolicyGroupsPolicyObject();
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
