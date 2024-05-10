// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs Empty = new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs();

    /**
     * Preferred uplink for uplink preference rule. Must be one of: &#39;wan1&#39; or &#39;wan2&#39;
     * 
     */
    @Import(name="preferredUplink")
    private @Nullable Output<String> preferredUplink;

    /**
     * @return Preferred uplink for uplink preference rule. Must be one of: &#39;wan1&#39; or &#39;wan2&#39;
     * 
     */
    public Optional<Output<String>> preferredUplink() {
        return Optional.ofNullable(this.preferredUplink);
    }

    /**
     * Traffic filters
     * 
     */
    @Import(name="trafficFilters")
    private @Nullable Output<List<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs>> trafficFilters;

    /**
     * @return Traffic filters
     * 
     */
    public Optional<Output<List<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs>>> trafficFilters() {
        return Optional.ofNullable(this.trafficFilters);
    }

    private ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs() {}

    private ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs $) {
        this.preferredUplink = $.preferredUplink;
        this.trafficFilters = $.trafficFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs $;

        public Builder() {
            $ = new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs();
        }

        public Builder(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs defaults) {
            $ = new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param preferredUplink Preferred uplink for uplink preference rule. Must be one of: &#39;wan1&#39; or &#39;wan2&#39;
         * 
         * @return builder
         * 
         */
        public Builder preferredUplink(@Nullable Output<String> preferredUplink) {
            $.preferredUplink = preferredUplink;
            return this;
        }

        /**
         * @param preferredUplink Preferred uplink for uplink preference rule. Must be one of: &#39;wan1&#39; or &#39;wan2&#39;
         * 
         * @return builder
         * 
         */
        public Builder preferredUplink(String preferredUplink) {
            return preferredUplink(Output.of(preferredUplink));
        }

        /**
         * @param trafficFilters Traffic filters
         * 
         * @return builder
         * 
         */
        public Builder trafficFilters(@Nullable Output<List<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs>> trafficFilters) {
            $.trafficFilters = trafficFilters;
            return this;
        }

        /**
         * @param trafficFilters Traffic filters
         * 
         * @return builder
         * 
         */
        public Builder trafficFilters(List<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs> trafficFilters) {
            return trafficFilters(Output.of(trafficFilters));
        }

        /**
         * @param trafficFilters Traffic filters
         * 
         * @return builder
         * 
         */
        public Builder trafficFilters(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs... trafficFilters) {
            return trafficFilters(List.of(trafficFilters));
        }

        public ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs build() {
            return $;
        }
    }

}
