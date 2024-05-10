// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupPoliciesSchedulingThursdayArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupPoliciesSchedulingThursdayArgs Empty = new GroupPoliciesSchedulingThursdayArgs();

    /**
     * Whether the schedule is active (true) or inactive (false) during the time specified between &#39;from&#39; and &#39;to&#39;. Defaults to true.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Whether the schedule is active (true) or inactive (false) during the time specified between &#39;from&#39; and &#39;to&#39;. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be less than the time specified in &#39;to&#39;. Defaults to &#39;00:00&#39;. Only 30 minute increments are allowed.
     * 
     */
    @Import(name="from")
    private @Nullable Output<String> from;

    /**
     * @return The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be less than the time specified in &#39;to&#39;. Defaults to &#39;00:00&#39;. Only 30 minute increments are allowed.
     * 
     */
    public Optional<Output<String>> from() {
        return Optional.ofNullable(this.from);
    }

    /**
     * The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be greater than the time specified in &#39;from&#39;. Defaults to &#39;24:00&#39;. Only 30 minute increments are allowed.
     * 
     */
    @Import(name="to")
    private @Nullable Output<String> to;

    /**
     * @return The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be greater than the time specified in &#39;from&#39;. Defaults to &#39;24:00&#39;. Only 30 minute increments are allowed.
     * 
     */
    public Optional<Output<String>> to() {
        return Optional.ofNullable(this.to);
    }

    private GroupPoliciesSchedulingThursdayArgs() {}

    private GroupPoliciesSchedulingThursdayArgs(GroupPoliciesSchedulingThursdayArgs $) {
        this.active = $.active;
        this.from = $.from;
        this.to = $.to;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPoliciesSchedulingThursdayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPoliciesSchedulingThursdayArgs $;

        public Builder() {
            $ = new GroupPoliciesSchedulingThursdayArgs();
        }

        public Builder(GroupPoliciesSchedulingThursdayArgs defaults) {
            $ = new GroupPoliciesSchedulingThursdayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Whether the schedule is active (true) or inactive (false) during the time specified between &#39;from&#39; and &#39;to&#39;. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Whether the schedule is active (true) or inactive (false) during the time specified between &#39;from&#39; and &#39;to&#39;. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param from The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be less than the time specified in &#39;to&#39;. Defaults to &#39;00:00&#39;. Only 30 minute increments are allowed.
         * 
         * @return builder
         * 
         */
        public Builder from(@Nullable Output<String> from) {
            $.from = from;
            return this;
        }

        /**
         * @param from The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be less than the time specified in &#39;to&#39;. Defaults to &#39;00:00&#39;. Only 30 minute increments are allowed.
         * 
         * @return builder
         * 
         */
        public Builder from(String from) {
            return from(Output.of(from));
        }

        /**
         * @param to The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be greater than the time specified in &#39;from&#39;. Defaults to &#39;24:00&#39;. Only 30 minute increments are allowed.
         * 
         * @return builder
         * 
         */
        public Builder to(@Nullable Output<String> to) {
            $.to = to;
            return this;
        }

        /**
         * @param to The time, from &#39;00:00&#39; to &#39;24:00&#39;. Must be greater than the time specified in &#39;from&#39;. Defaults to &#39;24:00&#39;. Only 30 minute increments are allowed.
         * 
         * @return builder
         * 
         */
        public Builder to(String to) {
            return to(Output.of(to));
        }

        public GroupPoliciesSchedulingThursdayArgs build() {
            return $;
        }
    }

}
