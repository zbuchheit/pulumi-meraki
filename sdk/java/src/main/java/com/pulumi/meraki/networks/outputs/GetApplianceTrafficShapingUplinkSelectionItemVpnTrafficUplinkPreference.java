// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferencePerformanceClass;
import com.pulumi.meraki.networks.outputs.GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreference {
    /**
     * @return Fail over criterion for uplink preference rule. Must be one of: &#39;poorPerformance&#39; or &#39;uplinkDown&#39;
     * 
     */
    private String failOverCriterion;
    /**
     * @return Performance class setting for uplink preference rule
     * 
     */
    private GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferencePerformanceClass performanceClass;
    /**
     * @return Preferred uplink for uplink preference rule. Must be one of: &#39;wan1&#39;, &#39;wan2&#39;, &#39;bestForVoIP&#39;, &#39;loadBalancing&#39; or &#39;defaultUplink&#39;
     * 
     */
    private String preferredUplink;
    /**
     * @return Traffic filters
     * 
     */
    private List<GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter> trafficFilters;

    private GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreference() {}
    /**
     * @return Fail over criterion for uplink preference rule. Must be one of: &#39;poorPerformance&#39; or &#39;uplinkDown&#39;
     * 
     */
    public String failOverCriterion() {
        return this.failOverCriterion;
    }
    /**
     * @return Performance class setting for uplink preference rule
     * 
     */
    public GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferencePerformanceClass performanceClass() {
        return this.performanceClass;
    }
    /**
     * @return Preferred uplink for uplink preference rule. Must be one of: &#39;wan1&#39;, &#39;wan2&#39;, &#39;bestForVoIP&#39;, &#39;loadBalancing&#39; or &#39;defaultUplink&#39;
     * 
     */
    public String preferredUplink() {
        return this.preferredUplink;
    }
    /**
     * @return Traffic filters
     * 
     */
    public List<GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter> trafficFilters() {
        return this.trafficFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String failOverCriterion;
        private GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferencePerformanceClass performanceClass;
        private String preferredUplink;
        private List<GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter> trafficFilters;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failOverCriterion = defaults.failOverCriterion;
    	      this.performanceClass = defaults.performanceClass;
    	      this.preferredUplink = defaults.preferredUplink;
    	      this.trafficFilters = defaults.trafficFilters;
        }

        @CustomType.Setter
        public Builder failOverCriterion(String failOverCriterion) {
            if (failOverCriterion == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreference", "failOverCriterion");
            }
            this.failOverCriterion = failOverCriterion;
            return this;
        }
        @CustomType.Setter
        public Builder performanceClass(GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferencePerformanceClass performanceClass) {
            if (performanceClass == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreference", "performanceClass");
            }
            this.performanceClass = performanceClass;
            return this;
        }
        @CustomType.Setter
        public Builder preferredUplink(String preferredUplink) {
            if (preferredUplink == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreference", "preferredUplink");
            }
            this.preferredUplink = preferredUplink;
            return this;
        }
        @CustomType.Setter
        public Builder trafficFilters(List<GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter> trafficFilters) {
            if (trafficFilters == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreference", "trafficFilters");
            }
            this.trafficFilters = trafficFilters;
            return this;
        }
        public Builder trafficFilters(GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter... trafficFilters) {
            return trafficFilters(List.of(trafficFilters));
        }
        public GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreference build() {
            final var _resultValue = new GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreference();
            _resultValue.failOverCriterion = failOverCriterion;
            _resultValue.performanceClass = performanceClass;
            _resultValue.preferredUplink = preferredUplink;
            _resultValue.trafficFilters = trafficFilters;
            return _resultValue;
        }
    }
}