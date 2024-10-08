// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs Empty = new GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs();

    /**
     * The maximum download limit (integer, in Kbps).
     * 
     */
    @Import(name="limitDown")
    private @Nullable Output<Integer> limitDown;

    /**
     * @return The maximum download limit (integer, in Kbps).
     * 
     */
    public Optional<Output<Integer>> limitDown() {
        return Optional.ofNullable(this.limitDown);
    }

    /**
     * The maximum upload limit (integer, in Kbps).
     * 
     */
    @Import(name="limitUp")
    private @Nullable Output<Integer> limitUp;

    /**
     * @return The maximum upload limit (integer, in Kbps).
     * 
     */
    public Optional<Output<Integer>> limitUp() {
        return Optional.ofNullable(this.limitUp);
    }

    private GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs() {}

    private GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs(GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs $) {
        this.limitDown = $.limitDown;
        this.limitUp = $.limitUp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs $;

        public Builder() {
            $ = new GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs();
        }

        public Builder(GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs defaults) {
            $ = new GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limitDown The maximum download limit (integer, in Kbps).
         * 
         * @return builder
         * 
         */
        public Builder limitDown(@Nullable Output<Integer> limitDown) {
            $.limitDown = limitDown;
            return this;
        }

        /**
         * @param limitDown The maximum download limit (integer, in Kbps).
         * 
         * @return builder
         * 
         */
        public Builder limitDown(Integer limitDown) {
            return limitDown(Output.of(limitDown));
        }

        /**
         * @param limitUp The maximum upload limit (integer, in Kbps).
         * 
         * @return builder
         * 
         */
        public Builder limitUp(@Nullable Output<Integer> limitUp) {
            $.limitUp = limitUp;
            return this;
        }

        /**
         * @param limitUp The maximum upload limit (integer, in Kbps).
         * 
         * @return builder
         * 
         */
        public Builder limitUp(Integer limitUp) {
            return limitUp(Output.of(limitUp));
        }

        public GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimitsBandwidthLimitsArgs build() {
            return $;
        }
    }

}
