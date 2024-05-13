// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsApTagsAndVlanId {
    /**
     * @return Array of AP tags
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return Numerical identifier that is assigned to the VLAN
     * 
     */
    private @Nullable Integer vlanId;

    private WirelessSsidsApTagsAndVlanId() {}
    /**
     * @return Array of AP tags
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return Numerical identifier that is assigned to the VLAN
     * 
     */
    public Optional<Integer> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsApTagsAndVlanId defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> tags;
        private @Nullable Integer vlanId;
        public Builder() {}
        public Builder(WirelessSsidsApTagsAndVlanId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder vlanId(@Nullable Integer vlanId) {

            this.vlanId = vlanId;
            return this;
        }
        public WirelessSsidsApTagsAndVlanId build() {
            final var _resultValue = new WirelessSsidsApTagsAndVlanId();
            _resultValue.tags = tags;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}