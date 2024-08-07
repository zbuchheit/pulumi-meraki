// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination;
import com.pulumi.meraki.networks.outputs.GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueSource;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValue {
    /**
     * @return Destination of &#39;custom&#39; type traffic filter
     * 
     */
    private GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination destination;
    /**
     * @return Protocol of &#39;custom&#39; type traffic filter. Must be one of: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp6&#39; or &#39;any&#39;
     * 
     */
    private String protocol;
    /**
     * @return Source of &#39;custom&#39; type traffic filter
     * 
     */
    private GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueSource source;

    private GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValue() {}
    /**
     * @return Destination of &#39;custom&#39; type traffic filter
     * 
     */
    public GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination destination() {
        return this.destination;
    }
    /**
     * @return Protocol of &#39;custom&#39; type traffic filter. Must be one of: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp6&#39; or &#39;any&#39;
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Source of &#39;custom&#39; type traffic filter
     * 
     */
    public GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueSource source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination destination;
        private String protocol;
        private GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueSource source;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.protocol = defaults.protocol;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder destination(GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueDestination destination) {
            if (destination == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValue", "destination");
            }
            this.destination = destination;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValue", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder source(GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValueSource source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValue", "source");
            }
            this.source = source;
            return this;
        }
        public GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValue build() {
            final var _resultValue = new GetApplianceTrafficShapingUplinkSelectionItemWanTrafficUplinkPreferenceTrafficFilterValue();
            _resultValue.destination = destination;
            _resultValue.protocol = protocol;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
