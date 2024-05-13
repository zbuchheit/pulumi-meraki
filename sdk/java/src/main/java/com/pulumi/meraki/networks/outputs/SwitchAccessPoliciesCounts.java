// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.SwitchAccessPoliciesCountsPorts;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchAccessPoliciesCounts {
    /**
     * @return Counts associated with ports
     * 
     */
    private @Nullable SwitchAccessPoliciesCountsPorts ports;

    private SwitchAccessPoliciesCounts() {}
    /**
     * @return Counts associated with ports
     * 
     */
    public Optional<SwitchAccessPoliciesCountsPorts> ports() {
        return Optional.ofNullable(this.ports);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchAccessPoliciesCounts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SwitchAccessPoliciesCountsPorts ports;
        public Builder() {}
        public Builder(SwitchAccessPoliciesCounts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ports = defaults.ports;
        }

        @CustomType.Setter
        public Builder ports(@Nullable SwitchAccessPoliciesCountsPorts ports) {

            this.ports = ports;
            return this;
        }
        public SwitchAccessPoliciesCounts build() {
            final var _resultValue = new SwitchAccessPoliciesCounts();
            _resultValue.ports = ports;
            return _resultValue;
        }
    }
}