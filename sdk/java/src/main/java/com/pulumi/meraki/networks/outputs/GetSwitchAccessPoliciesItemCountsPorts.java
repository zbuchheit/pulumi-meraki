// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSwitchAccessPoliciesItemCountsPorts {
    /**
     * @return Number of ports in the network with this policy. For template networks, this is the number of template ports (not child ports) with this policy.
     * 
     */
    private Integer withThisPolicy;

    private GetSwitchAccessPoliciesItemCountsPorts() {}
    /**
     * @return Number of ports in the network with this policy. For template networks, this is the number of template ports (not child ports) with this policy.
     * 
     */
    public Integer withThisPolicy() {
        return this.withThisPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchAccessPoliciesItemCountsPorts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer withThisPolicy;
        public Builder() {}
        public Builder(GetSwitchAccessPoliciesItemCountsPorts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.withThisPolicy = defaults.withThisPolicy;
        }

        @CustomType.Setter
        public Builder withThisPolicy(Integer withThisPolicy) {
            if (withThisPolicy == null) {
              throw new MissingRequiredPropertyException("GetSwitchAccessPoliciesItemCountsPorts", "withThisPolicy");
            }
            this.withThisPolicy = withThisPolicy;
            return this;
        }
        public GetSwitchAccessPoliciesItemCountsPorts build() {
            final var _resultValue = new GetSwitchAccessPoliciesItemCountsPorts();
            _resultValue.withThisPolicy = withThisPolicy;
            return _resultValue;
        }
    }
}
