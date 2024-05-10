// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.administered.outputs.GetIdentitiesMeItemAuthentication;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIdentitiesMeItem {
    /**
     * @return Authentication info
     * 
     */
    private GetIdentitiesMeItemAuthentication authentication;
    /**
     * @return User email
     * 
     */
    private String email;
    /**
     * @return Last seen active on Dashboard UI
     * 
     */
    private String lastUsedDashboardAt;
    /**
     * @return Username
     * 
     */
    private String name;

    private GetIdentitiesMeItem() {}
    /**
     * @return Authentication info
     * 
     */
    public GetIdentitiesMeItemAuthentication authentication() {
        return this.authentication;
    }
    /**
     * @return User email
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return Last seen active on Dashboard UI
     * 
     */
    public String lastUsedDashboardAt() {
        return this.lastUsedDashboardAt;
    }
    /**
     * @return Username
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIdentitiesMeItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetIdentitiesMeItemAuthentication authentication;
        private String email;
        private String lastUsedDashboardAt;
        private String name;
        public Builder() {}
        public Builder(GetIdentitiesMeItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.email = defaults.email;
    	      this.lastUsedDashboardAt = defaults.lastUsedDashboardAt;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder authentication(GetIdentitiesMeItemAuthentication authentication) {
            if (authentication == null) {
              throw new MissingRequiredPropertyException("GetIdentitiesMeItem", "authentication");
            }
            this.authentication = authentication;
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetIdentitiesMeItem", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder lastUsedDashboardAt(String lastUsedDashboardAt) {
            if (lastUsedDashboardAt == null) {
              throw new MissingRequiredPropertyException("GetIdentitiesMeItem", "lastUsedDashboardAt");
            }
            this.lastUsedDashboardAt = lastUsedDashboardAt;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIdentitiesMeItem", "name");
            }
            this.name = name;
            return this;
        }
        public GetIdentitiesMeItem build() {
            final var _resultValue = new GetIdentitiesMeItem();
            _resultValue.authentication = authentication;
            _resultValue.email = email;
            _resultValue.lastUsedDashboardAt = lastUsedDashboardAt;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
