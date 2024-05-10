// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferencePerformanceClassArgs;
import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs Empty = new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs();

    /**
     * Fail over criterion for uplink preference rule. Must be one of: &#39;poorPerformance&#39; or &#39;uplinkDown&#39;
     * 
     */
    @Import(name="failOverCriterion")
    private @Nullable Output<String> failOverCriterion;

    /**
     * @return Fail over criterion for uplink preference rule. Must be one of: &#39;poorPerformance&#39; or &#39;uplinkDown&#39;
     * 
     */
    public Optional<Output<String>> failOverCriterion() {
        return Optional.ofNullable(this.failOverCriterion);
    }

    /**
     * Performance class setting for uplink preference rule
     * 
     */
    @Import(name="performanceClass")
    private @Nullable Output<ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferencePerformanceClassArgs> performanceClass;

    /**
     * @return Performance class setting for uplink preference rule
     * 
     */
    public Optional<Output<ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferencePerformanceClassArgs>> performanceClass() {
        return Optional.ofNullable(this.performanceClass);
    }

    /**
     * Preferred uplink for uplink preference rule. Must be one of: &#39;wan1&#39;, &#39;wan2&#39;, &#39;bestForVoIP&#39;, &#39;loadBalancing&#39; or &#39;defaultUplink&#39;
     * 
     */
    @Import(name="preferredUplink")
    private @Nullable Output<String> preferredUplink;

    /**
     * @return Preferred uplink for uplink preference rule. Must be one of: &#39;wan1&#39;, &#39;wan2&#39;, &#39;bestForVoIP&#39;, &#39;loadBalancing&#39; or &#39;defaultUplink&#39;
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
    private @Nullable Output<List<ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterArgs>> trafficFilters;

    /**
     * @return Traffic filters
     * 
     */
    public Optional<Output<List<ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterArgs>>> trafficFilters() {
        return Optional.ofNullable(this.trafficFilters);
    }

    private ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs() {}

    private ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs(ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs $) {
        this.failOverCriterion = $.failOverCriterion;
        this.performanceClass = $.performanceClass;
        this.preferredUplink = $.preferredUplink;
        this.trafficFilters = $.trafficFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs $;

        public Builder() {
            $ = new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs();
        }

        public Builder(ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs defaults) {
            $ = new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failOverCriterion Fail over criterion for uplink preference rule. Must be one of: &#39;poorPerformance&#39; or &#39;uplinkDown&#39;
         * 
         * @return builder
         * 
         */
        public Builder failOverCriterion(@Nullable Output<String> failOverCriterion) {
            $.failOverCriterion = failOverCriterion;
            return this;
        }

        /**
         * @param failOverCriterion Fail over criterion for uplink preference rule. Must be one of: &#39;poorPerformance&#39; or &#39;uplinkDown&#39;
         * 
         * @return builder
         * 
         */
        public Builder failOverCriterion(String failOverCriterion) {
            return failOverCriterion(Output.of(failOverCriterion));
        }

        /**
         * @param performanceClass Performance class setting for uplink preference rule
         * 
         * @return builder
         * 
         */
        public Builder performanceClass(@Nullable Output<ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferencePerformanceClassArgs> performanceClass) {
            $.performanceClass = performanceClass;
            return this;
        }

        /**
         * @param performanceClass Performance class setting for uplink preference rule
         * 
         * @return builder
         * 
         */
        public Builder performanceClass(ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferencePerformanceClassArgs performanceClass) {
            return performanceClass(Output.of(performanceClass));
        }

        /**
         * @param preferredUplink Preferred uplink for uplink preference rule. Must be one of: &#39;wan1&#39;, &#39;wan2&#39;, &#39;bestForVoIP&#39;, &#39;loadBalancing&#39; or &#39;defaultUplink&#39;
         * 
         * @return builder
         * 
         */
        public Builder preferredUplink(@Nullable Output<String> preferredUplink) {
            $.preferredUplink = preferredUplink;
            return this;
        }

        /**
         * @param preferredUplink Preferred uplink for uplink preference rule. Must be one of: &#39;wan1&#39;, &#39;wan2&#39;, &#39;bestForVoIP&#39;, &#39;loadBalancing&#39; or &#39;defaultUplink&#39;
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
        public Builder trafficFilters(@Nullable Output<List<ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterArgs>> trafficFilters) {
            $.trafficFilters = trafficFilters;
            return this;
        }

        /**
         * @param trafficFilters Traffic filters
         * 
         * @return builder
         * 
         */
        public Builder trafficFilters(List<ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterArgs> trafficFilters) {
            return trafficFilters(Output.of(trafficFilters));
        }

        /**
         * @param trafficFilters Traffic filters
         * 
         * @return builder
         * 
         */
        public Builder trafficFilters(ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterArgs... trafficFilters) {
            return trafficFilters(List.of(trafficFilters));
        }

        public ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs build() {
            return $;
        }
    }

}
