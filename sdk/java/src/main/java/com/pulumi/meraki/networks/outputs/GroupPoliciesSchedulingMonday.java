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
public final class GroupPoliciesSchedulingMonday {
    /**
     * @return Whether the schedule is active (true) or inactive (false) during the time specified between &#39;from&#39; and &#39;to&#39;. Defaults to true.
     * 
     */
    private @Nullable Boolean active;
    /**
     * @return The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be less than the time specified in &#39;to&#39;. Defaults to &#39;00:00&#39;. Only 30 minute increments are allowed.
     * 
     */
    private @Nullable String from;
    /**
     * @return The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be greater than the time specified in &#39;from&#39;. Defaults to &#39;24:00&#39;. Only 30 minute increments are allowed.
     * 
     */
    private @Nullable String to;

    private GroupPoliciesSchedulingMonday() {}
    /**
     * @return Whether the schedule is active (true) or inactive (false) during the time specified between &#39;from&#39; and &#39;to&#39;. Defaults to true.
     * 
     */
    public Optional<Boolean> active() {
        return Optional.ofNullable(this.active);
    }
    /**
     * @return The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be less than the time specified in &#39;to&#39;. Defaults to &#39;00:00&#39;. Only 30 minute increments are allowed.
     * 
     */
    public Optional<String> from() {
        return Optional.ofNullable(this.from);
    }
    /**
     * @return The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be greater than the time specified in &#39;from&#39;. Defaults to &#39;24:00&#39;. Only 30 minute increments are allowed.
     * 
     */
    public Optional<String> to() {
        return Optional.ofNullable(this.to);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPoliciesSchedulingMonday defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean active;
        private @Nullable String from;
        private @Nullable String to;
        public Builder() {}
        public Builder(GroupPoliciesSchedulingMonday defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        @CustomType.Setter
        public Builder active(@Nullable Boolean active) {

            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder from(@Nullable String from) {

            this.from = from;
            return this;
        }
        @CustomType.Setter
        public Builder to(@Nullable String to) {

            this.to = to;
            return this;
        }
        public GroupPoliciesSchedulingMonday build() {
            final var _resultValue = new GroupPoliciesSchedulingMonday();
            _resultValue.active = active;
            _resultValue.from = from;
            _resultValue.to = to;
            return _resultValue;
        }
    }
}
