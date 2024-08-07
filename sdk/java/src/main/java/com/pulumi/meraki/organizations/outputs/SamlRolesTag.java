// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SamlRolesTag {
    /**
     * @return The privilege of the SAML administrator on the tag
     * 
     */
    private @Nullable String access;
    /**
     * @return The name of the tag
     * 
     */
    private @Nullable String tag;

    private SamlRolesTag() {}
    /**
     * @return The privilege of the SAML administrator on the tag
     * 
     */
    public Optional<String> access() {
        return Optional.ofNullable(this.access);
    }
    /**
     * @return The name of the tag
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamlRolesTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String access;
        private @Nullable String tag;
        public Builder() {}
        public Builder(SamlRolesTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder access(@Nullable String access) {

            this.access = access;
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable String tag) {

            this.tag = tag;
            return this;
        }
        public SamlRolesTag build() {
            final var _resultValue = new SamlRolesTag();
            _resultValue.access = access;
            _resultValue.tag = tag;
            return _resultValue;
        }
    }
}
