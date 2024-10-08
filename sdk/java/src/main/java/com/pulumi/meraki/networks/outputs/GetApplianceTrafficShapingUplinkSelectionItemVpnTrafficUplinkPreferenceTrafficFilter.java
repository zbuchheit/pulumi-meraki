// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValue;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter {
    /**
     * @return Traffic filter type. Must be one of: &#39;applicationCategory&#39;, &#39;application&#39; or &#39;custom&#39;
     * 
     */
    private String type;
    /**
     * @return Value of traffic filter
     * 
     */
    private GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValue value;

    private GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter() {}
    /**
     * @return Traffic filter type. Must be one of: &#39;applicationCategory&#39;, &#39;application&#39; or &#39;custom&#39;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Value of traffic filter
     * 
     */
    public GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValue value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValue value;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValue value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter", "value");
            }
            this.value = value;
            return this;
        }
        public GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter build() {
            final var _resultValue = new GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilter();
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
