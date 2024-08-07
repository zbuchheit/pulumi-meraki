// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.ApplianceSingleLanIpv6PrefixAssignment;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceSingleLanIpv6 {
    /**
     * @return Enable IPv6 on single LAN
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Prefix assignments on the single LAN
     * 
     */
    private @Nullable List<ApplianceSingleLanIpv6PrefixAssignment> prefixAssignments;

    private ApplianceSingleLanIpv6() {}
    /**
     * @return Enable IPv6 on single LAN
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Prefix assignments on the single LAN
     * 
     */
    public List<ApplianceSingleLanIpv6PrefixAssignment> prefixAssignments() {
        return this.prefixAssignments == null ? List.of() : this.prefixAssignments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceSingleLanIpv6 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<ApplianceSingleLanIpv6PrefixAssignment> prefixAssignments;
        public Builder() {}
        public Builder(ApplianceSingleLanIpv6 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.prefixAssignments = defaults.prefixAssignments;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder prefixAssignments(@Nullable List<ApplianceSingleLanIpv6PrefixAssignment> prefixAssignments) {

            this.prefixAssignments = prefixAssignments;
            return this;
        }
        public Builder prefixAssignments(ApplianceSingleLanIpv6PrefixAssignment... prefixAssignments) {
            return prefixAssignments(List.of(prefixAssignments));
        }
        public ApplianceSingleLanIpv6 build() {
            final var _resultValue = new ApplianceSingleLanIpv6();
            _resultValue.enabled = enabled;
            _resultValue.prefixAssignments = prefixAssignments;
            return _resultValue;
        }
    }
}
