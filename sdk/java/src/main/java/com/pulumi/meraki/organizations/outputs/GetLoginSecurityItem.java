// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetLoginSecurityItemApiAuthentication;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLoginSecurityItem {
    /**
     * @return Number of consecutive failed login attempts after which users&#39; accounts will be locked.
     * 
     */
    private Integer accountLockoutAttempts;
    /**
     * @return Details for indicating whether organization will restrict access to API (but not Dashboard) to certain IP addresses.
     * 
     */
    private GetLoginSecurityItemApiAuthentication apiAuthentication;
    /**
     * @return Boolean indicating whether users&#39; Dashboard accounts will be locked out after a specified number of consecutive failed login attempts.
     * 
     */
    private Boolean enforceAccountLockout;
    /**
     * @return Boolean indicating whether users, when setting a new password, are forced to choose a new password that is different from any past passwords.
     * 
     */
    private Boolean enforceDifferentPasswords;
    /**
     * @return Boolean indicating whether users will be logged out after being idle for the specified number of minutes.
     * 
     */
    private Boolean enforceIdleTimeout;
    /**
     * @return Boolean indicating whether organization will restrict access to Dashboard (including the API) from certain IP addresses.
     * 
     */
    private Boolean enforceLoginIpRanges;
    /**
     * @return Boolean indicating whether users are forced to change their password every X number of days.
     * 
     */
    private Boolean enforcePasswordExpiration;
    /**
     * @return Boolean indicating whether users will be forced to choose strong passwords for their accounts. Strong passwords are at least 8 characters that contain 3 of the following: number, uppercase letter, lowercase letter, and symbol
     * 
     */
    private Boolean enforceStrongPasswords;
    /**
     * @return Boolean indicating whether users in this organization will be required to use an extra verification code when logging in to Dashboard. This code will be sent to their mobile phone via SMS, or can be generated by the authenticator application.
     * 
     */
    private Boolean enforceTwoFactorAuth;
    /**
     * @return Number of minutes users can remain idle before being logged out of their accounts.
     * 
     */
    private Integer idleTimeoutMinutes;
    /**
     * @return List of acceptable IP ranges. Entries can be single IP addresses, IP address ranges, and CIDR subnets.
     * 
     */
    private List<String> loginIpRanges;
    /**
     * @return Number of recent passwords that new password must be distinct from.
     * 
     */
    private Integer numDifferentPasswords;
    /**
     * @return Number of days after which users will be forced to change their password.
     * 
     */
    private Integer passwordExpirationDays;

    private GetLoginSecurityItem() {}
    /**
     * @return Number of consecutive failed login attempts after which users&#39; accounts will be locked.
     * 
     */
    public Integer accountLockoutAttempts() {
        return this.accountLockoutAttempts;
    }
    /**
     * @return Details for indicating whether organization will restrict access to API (but not Dashboard) to certain IP addresses.
     * 
     */
    public GetLoginSecurityItemApiAuthentication apiAuthentication() {
        return this.apiAuthentication;
    }
    /**
     * @return Boolean indicating whether users&#39; Dashboard accounts will be locked out after a specified number of consecutive failed login attempts.
     * 
     */
    public Boolean enforceAccountLockout() {
        return this.enforceAccountLockout;
    }
    /**
     * @return Boolean indicating whether users, when setting a new password, are forced to choose a new password that is different from any past passwords.
     * 
     */
    public Boolean enforceDifferentPasswords() {
        return this.enforceDifferentPasswords;
    }
    /**
     * @return Boolean indicating whether users will be logged out after being idle for the specified number of minutes.
     * 
     */
    public Boolean enforceIdleTimeout() {
        return this.enforceIdleTimeout;
    }
    /**
     * @return Boolean indicating whether organization will restrict access to Dashboard (including the API) from certain IP addresses.
     * 
     */
    public Boolean enforceLoginIpRanges() {
        return this.enforceLoginIpRanges;
    }
    /**
     * @return Boolean indicating whether users are forced to change their password every X number of days.
     * 
     */
    public Boolean enforcePasswordExpiration() {
        return this.enforcePasswordExpiration;
    }
    /**
     * @return Boolean indicating whether users will be forced to choose strong passwords for their accounts. Strong passwords are at least 8 characters that contain 3 of the following: number, uppercase letter, lowercase letter, and symbol
     * 
     */
    public Boolean enforceStrongPasswords() {
        return this.enforceStrongPasswords;
    }
    /**
     * @return Boolean indicating whether users in this organization will be required to use an extra verification code when logging in to Dashboard. This code will be sent to their mobile phone via SMS, or can be generated by the authenticator application.
     * 
     */
    public Boolean enforceTwoFactorAuth() {
        return this.enforceTwoFactorAuth;
    }
    /**
     * @return Number of minutes users can remain idle before being logged out of their accounts.
     * 
     */
    public Integer idleTimeoutMinutes() {
        return this.idleTimeoutMinutes;
    }
    /**
     * @return List of acceptable IP ranges. Entries can be single IP addresses, IP address ranges, and CIDR subnets.
     * 
     */
    public List<String> loginIpRanges() {
        return this.loginIpRanges;
    }
    /**
     * @return Number of recent passwords that new password must be distinct from.
     * 
     */
    public Integer numDifferentPasswords() {
        return this.numDifferentPasswords;
    }
    /**
     * @return Number of days after which users will be forced to change their password.
     * 
     */
    public Integer passwordExpirationDays() {
        return this.passwordExpirationDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoginSecurityItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer accountLockoutAttempts;
        private GetLoginSecurityItemApiAuthentication apiAuthentication;
        private Boolean enforceAccountLockout;
        private Boolean enforceDifferentPasswords;
        private Boolean enforceIdleTimeout;
        private Boolean enforceLoginIpRanges;
        private Boolean enforcePasswordExpiration;
        private Boolean enforceStrongPasswords;
        private Boolean enforceTwoFactorAuth;
        private Integer idleTimeoutMinutes;
        private List<String> loginIpRanges;
        private Integer numDifferentPasswords;
        private Integer passwordExpirationDays;
        public Builder() {}
        public Builder(GetLoginSecurityItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountLockoutAttempts = defaults.accountLockoutAttempts;
    	      this.apiAuthentication = defaults.apiAuthentication;
    	      this.enforceAccountLockout = defaults.enforceAccountLockout;
    	      this.enforceDifferentPasswords = defaults.enforceDifferentPasswords;
    	      this.enforceIdleTimeout = defaults.enforceIdleTimeout;
    	      this.enforceLoginIpRanges = defaults.enforceLoginIpRanges;
    	      this.enforcePasswordExpiration = defaults.enforcePasswordExpiration;
    	      this.enforceStrongPasswords = defaults.enforceStrongPasswords;
    	      this.enforceTwoFactorAuth = defaults.enforceTwoFactorAuth;
    	      this.idleTimeoutMinutes = defaults.idleTimeoutMinutes;
    	      this.loginIpRanges = defaults.loginIpRanges;
    	      this.numDifferentPasswords = defaults.numDifferentPasswords;
    	      this.passwordExpirationDays = defaults.passwordExpirationDays;
        }

        @CustomType.Setter
        public Builder accountLockoutAttempts(Integer accountLockoutAttempts) {
            if (accountLockoutAttempts == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "accountLockoutAttempts");
            }
            this.accountLockoutAttempts = accountLockoutAttempts;
            return this;
        }
        @CustomType.Setter
        public Builder apiAuthentication(GetLoginSecurityItemApiAuthentication apiAuthentication) {
            if (apiAuthentication == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "apiAuthentication");
            }
            this.apiAuthentication = apiAuthentication;
            return this;
        }
        @CustomType.Setter
        public Builder enforceAccountLockout(Boolean enforceAccountLockout) {
            if (enforceAccountLockout == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "enforceAccountLockout");
            }
            this.enforceAccountLockout = enforceAccountLockout;
            return this;
        }
        @CustomType.Setter
        public Builder enforceDifferentPasswords(Boolean enforceDifferentPasswords) {
            if (enforceDifferentPasswords == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "enforceDifferentPasswords");
            }
            this.enforceDifferentPasswords = enforceDifferentPasswords;
            return this;
        }
        @CustomType.Setter
        public Builder enforceIdleTimeout(Boolean enforceIdleTimeout) {
            if (enforceIdleTimeout == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "enforceIdleTimeout");
            }
            this.enforceIdleTimeout = enforceIdleTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder enforceLoginIpRanges(Boolean enforceLoginIpRanges) {
            if (enforceLoginIpRanges == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "enforceLoginIpRanges");
            }
            this.enforceLoginIpRanges = enforceLoginIpRanges;
            return this;
        }
        @CustomType.Setter
        public Builder enforcePasswordExpiration(Boolean enforcePasswordExpiration) {
            if (enforcePasswordExpiration == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "enforcePasswordExpiration");
            }
            this.enforcePasswordExpiration = enforcePasswordExpiration;
            return this;
        }
        @CustomType.Setter
        public Builder enforceStrongPasswords(Boolean enforceStrongPasswords) {
            if (enforceStrongPasswords == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "enforceStrongPasswords");
            }
            this.enforceStrongPasswords = enforceStrongPasswords;
            return this;
        }
        @CustomType.Setter
        public Builder enforceTwoFactorAuth(Boolean enforceTwoFactorAuth) {
            if (enforceTwoFactorAuth == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "enforceTwoFactorAuth");
            }
            this.enforceTwoFactorAuth = enforceTwoFactorAuth;
            return this;
        }
        @CustomType.Setter
        public Builder idleTimeoutMinutes(Integer idleTimeoutMinutes) {
            if (idleTimeoutMinutes == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "idleTimeoutMinutes");
            }
            this.idleTimeoutMinutes = idleTimeoutMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder loginIpRanges(List<String> loginIpRanges) {
            if (loginIpRanges == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "loginIpRanges");
            }
            this.loginIpRanges = loginIpRanges;
            return this;
        }
        public Builder loginIpRanges(String... loginIpRanges) {
            return loginIpRanges(List.of(loginIpRanges));
        }
        @CustomType.Setter
        public Builder numDifferentPasswords(Integer numDifferentPasswords) {
            if (numDifferentPasswords == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "numDifferentPasswords");
            }
            this.numDifferentPasswords = numDifferentPasswords;
            return this;
        }
        @CustomType.Setter
        public Builder passwordExpirationDays(Integer passwordExpirationDays) {
            if (passwordExpirationDays == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItem", "passwordExpirationDays");
            }
            this.passwordExpirationDays = passwordExpirationDays;
            return this;
        }
        public GetLoginSecurityItem build() {
            final var _resultValue = new GetLoginSecurityItem();
            _resultValue.accountLockoutAttempts = accountLockoutAttempts;
            _resultValue.apiAuthentication = apiAuthentication;
            _resultValue.enforceAccountLockout = enforceAccountLockout;
            _resultValue.enforceDifferentPasswords = enforceDifferentPasswords;
            _resultValue.enforceIdleTimeout = enforceIdleTimeout;
            _resultValue.enforceLoginIpRanges = enforceLoginIpRanges;
            _resultValue.enforcePasswordExpiration = enforcePasswordExpiration;
            _resultValue.enforceStrongPasswords = enforceStrongPasswords;
            _resultValue.enforceTwoFactorAuth = enforceTwoFactorAuth;
            _resultValue.idleTimeoutMinutes = idleTimeoutMinutes;
            _resultValue.loginIpRanges = loginIpRanges;
            _resultValue.numDifferentPasswords = numDifferentPasswords;
            _resultValue.passwordExpirationDays = passwordExpirationDays;
            return _resultValue;
        }
    }
}
