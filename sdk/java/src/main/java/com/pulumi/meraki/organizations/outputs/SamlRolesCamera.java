// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SamlRolesCamera {
    /**
     * @return Camera access ability
     * 
     */
    private @Nullable String access;
    /**
     * @return Whether or not SAML administrator has org-wide access
     * 
     */
    private @Nullable Boolean orgWide;

    private SamlRolesCamera() {}
    /**
     * @return Camera access ability
     * 
     */
    public Optional<String> access() {
        return Optional.ofNullable(this.access);
    }
    /**
     * @return Whether or not SAML administrator has org-wide access
     * 
     */
    public Optional<Boolean> orgWide() {
        return Optional.ofNullable(this.orgWide);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamlRolesCamera defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String access;
        private @Nullable Boolean orgWide;
        public Builder() {}
        public Builder(SamlRolesCamera defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.orgWide = defaults.orgWide;
        }

        @CustomType.Setter
        public Builder access(@Nullable String access) {

            this.access = access;
            return this;
        }
        @CustomType.Setter
        public Builder orgWide(@Nullable Boolean orgWide) {

            this.orgWide = orgWide;
            return this;
        }
        public SamlRolesCamera build() {
            final var _resultValue = new SamlRolesCamera();
            _resultValue.access = access;
            _resultValue.orgWide = orgWide;
            return _resultValue;
        }
    }
}
