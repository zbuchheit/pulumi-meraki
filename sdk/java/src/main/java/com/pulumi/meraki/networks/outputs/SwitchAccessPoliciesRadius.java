// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.SwitchAccessPoliciesRadiusCriticalAuth;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchAccessPoliciesRadius {
    /**
     * @return Critical auth settings for when authentication is rejected by the RADIUS server
     * 
     */
    private @Nullable SwitchAccessPoliciesRadiusCriticalAuth criticalAuth;
    /**
     * @return VLAN that clients will be placed on when RADIUS authentication fails. Will be null if hostMode is Multi-Auth
     * 
     */
    private @Nullable Integer failedAuthVlanId;
    /**
     * @return Re-authentication period in seconds. Will be null if hostMode is Multi-Auth
     * 
     */
    private @Nullable Integer reAuthenticationInterval;

    private SwitchAccessPoliciesRadius() {}
    /**
     * @return Critical auth settings for when authentication is rejected by the RADIUS server
     * 
     */
    public Optional<SwitchAccessPoliciesRadiusCriticalAuth> criticalAuth() {
        return Optional.ofNullable(this.criticalAuth);
    }
    /**
     * @return VLAN that clients will be placed on when RADIUS authentication fails. Will be null if hostMode is Multi-Auth
     * 
     */
    public Optional<Integer> failedAuthVlanId() {
        return Optional.ofNullable(this.failedAuthVlanId);
    }
    /**
     * @return Re-authentication period in seconds. Will be null if hostMode is Multi-Auth
     * 
     */
    public Optional<Integer> reAuthenticationInterval() {
        return Optional.ofNullable(this.reAuthenticationInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchAccessPoliciesRadius defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SwitchAccessPoliciesRadiusCriticalAuth criticalAuth;
        private @Nullable Integer failedAuthVlanId;
        private @Nullable Integer reAuthenticationInterval;
        public Builder() {}
        public Builder(SwitchAccessPoliciesRadius defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criticalAuth = defaults.criticalAuth;
    	      this.failedAuthVlanId = defaults.failedAuthVlanId;
    	      this.reAuthenticationInterval = defaults.reAuthenticationInterval;
        }

        @CustomType.Setter
        public Builder criticalAuth(@Nullable SwitchAccessPoliciesRadiusCriticalAuth criticalAuth) {

            this.criticalAuth = criticalAuth;
            return this;
        }
        @CustomType.Setter
        public Builder failedAuthVlanId(@Nullable Integer failedAuthVlanId) {

            this.failedAuthVlanId = failedAuthVlanId;
            return this;
        }
        @CustomType.Setter
        public Builder reAuthenticationInterval(@Nullable Integer reAuthenticationInterval) {

            this.reAuthenticationInterval = reAuthenticationInterval;
            return this;
        }
        public SwitchAccessPoliciesRadius build() {
            final var _resultValue = new SwitchAccessPoliciesRadius();
            _resultValue.criticalAuth = criticalAuth;
            _resultValue.failedAuthVlanId = failedAuthVlanId;
            _resultValue.reAuthenticationInterval = reAuthenticationInterval;
            return _resultValue;
        }
    }
}
