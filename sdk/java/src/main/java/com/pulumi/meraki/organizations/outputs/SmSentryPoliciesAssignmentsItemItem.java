// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.SmSentryPoliciesAssignmentsItemItemPolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SmSentryPoliciesAssignmentsItemItem {
    /**
     * @return The Id of the Network
     * 
     */
    private @Nullable String networkId;
    /**
     * @return Array of Sentry Group Policies for the Network
     * 
     */
    private @Nullable List<SmSentryPoliciesAssignmentsItemItemPolicy> policies;

    private SmSentryPoliciesAssignmentsItemItem() {}
    /**
     * @return The Id of the Network
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }
    /**
     * @return Array of Sentry Group Policies for the Network
     * 
     */
    public List<SmSentryPoliciesAssignmentsItemItemPolicy> policies() {
        return this.policies == null ? List.of() : this.policies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmSentryPoliciesAssignmentsItemItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String networkId;
        private @Nullable List<SmSentryPoliciesAssignmentsItemItemPolicy> policies;
        public Builder() {}
        public Builder(SmSentryPoliciesAssignmentsItemItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkId = defaults.networkId;
    	      this.policies = defaults.policies;
        }

        @CustomType.Setter
        public Builder networkId(@Nullable String networkId) {

            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder policies(@Nullable List<SmSentryPoliciesAssignmentsItemItemPolicy> policies) {

            this.policies = policies;
            return this;
        }
        public Builder policies(SmSentryPoliciesAssignmentsItemItemPolicy... policies) {
            return policies(List.of(policies));
        }
        public SmSentryPoliciesAssignmentsItemItem build() {
            final var _resultValue = new SmSentryPoliciesAssignmentsItemItem();
            _resultValue.networkId = networkId;
            _resultValue.policies = policies;
            return _resultValue;
        }
    }
}