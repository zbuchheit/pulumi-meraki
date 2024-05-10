// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CellularGatewayUplinkBandwidthLimitsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CellularGatewayUplinkBandwidthLimitsArgs Empty = new CellularGatewayUplinkBandwidthLimitsArgs();

    /**
     * The maximum download limit (integer, in Kbps). &#39;null&#39; indicates no limit.
     * 
     */
    @Import(name="limitDown")
    private @Nullable Output<Integer> limitDown;

    /**
     * @return The maximum download limit (integer, in Kbps). &#39;null&#39; indicates no limit.
     * 
     */
    public Optional<Output<Integer>> limitDown() {
        return Optional.ofNullable(this.limitDown);
    }

    /**
     * The maximum upload limit (integer, in Kbps). &#39;null&#39; indicates no limit.
     * 
     */
    @Import(name="limitUp")
    private @Nullable Output<Integer> limitUp;

    /**
     * @return The maximum upload limit (integer, in Kbps). &#39;null&#39; indicates no limit.
     * 
     */
    public Optional<Output<Integer>> limitUp() {
        return Optional.ofNullable(this.limitUp);
    }

    private CellularGatewayUplinkBandwidthLimitsArgs() {}

    private CellularGatewayUplinkBandwidthLimitsArgs(CellularGatewayUplinkBandwidthLimitsArgs $) {
        this.limitDown = $.limitDown;
        this.limitUp = $.limitUp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellularGatewayUplinkBandwidthLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellularGatewayUplinkBandwidthLimitsArgs $;

        public Builder() {
            $ = new CellularGatewayUplinkBandwidthLimitsArgs();
        }

        public Builder(CellularGatewayUplinkBandwidthLimitsArgs defaults) {
            $ = new CellularGatewayUplinkBandwidthLimitsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limitDown The maximum download limit (integer, in Kbps). &#39;null&#39; indicates no limit.
         * 
         * @return builder
         * 
         */
        public Builder limitDown(@Nullable Output<Integer> limitDown) {
            $.limitDown = limitDown;
            return this;
        }

        /**
         * @param limitDown The maximum download limit (integer, in Kbps). &#39;null&#39; indicates no limit.
         * 
         * @return builder
         * 
         */
        public Builder limitDown(Integer limitDown) {
            return limitDown(Output.of(limitDown));
        }

        /**
         * @param limitUp The maximum upload limit (integer, in Kbps). &#39;null&#39; indicates no limit.
         * 
         * @return builder
         * 
         */
        public Builder limitUp(@Nullable Output<Integer> limitUp) {
            $.limitUp = limitUp;
            return this;
        }

        /**
         * @param limitUp The maximum upload limit (integer, in Kbps). &#39;null&#39; indicates no limit.
         * 
         * @return builder
         * 
         */
        public Builder limitUp(Integer limitUp) {
            return limitUp(Output.of(limitUp));
        }

        public CellularGatewayUplinkBandwidthLimitsArgs build() {
            return $;
        }
    }

}
