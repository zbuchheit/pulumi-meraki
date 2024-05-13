// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingsLocalStatusPageAuthentication {
    /**
     * @return Enables / disables the authentication on Local Status page(s).
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The password used for Local Status Page(s). Set this to null to clear the password.
     * 
     */
    private @Nullable String password;
    /**
     * @return The username used for Local Status Page(s).
     * 
     */
    private @Nullable String username;

    private SettingsLocalStatusPageAuthentication() {}
    /**
     * @return Enables / disables the authentication on Local Status page(s).
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The password used for Local Status Page(s). Set this to null to clear the password.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The username used for Local Status Page(s).
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsLocalStatusPageAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String password;
        private @Nullable String username;
        public Builder() {}
        public Builder(SettingsLocalStatusPageAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public SettingsLocalStatusPageAuthentication build() {
            final var _resultValue = new SettingsLocalStatusPageAuthentication();
            _resultValue.enabled = enabled;
            _resultValue.password = password;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}