// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetSwitchRoutingMulticastItemDefaultSettings {
    /**
     * @return Flood unknown multicast traffic enabled for the entire network
     * 
     */
    private Boolean floodUnknownMulticastTrafficEnabled;
    /**
     * @return IGMP snooping enabled for the entire network
     * 
     */
    private Boolean igmpSnoopingEnabled;

    private GetSwitchRoutingMulticastItemDefaultSettings() {}
    /**
     * @return Flood unknown multicast traffic enabled for the entire network
     * 
     */
    public Boolean floodUnknownMulticastTrafficEnabled() {
        return this.floodUnknownMulticastTrafficEnabled;
    }
    /**
     * @return IGMP snooping enabled for the entire network
     * 
     */
    public Boolean igmpSnoopingEnabled() {
        return this.igmpSnoopingEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchRoutingMulticastItemDefaultSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean floodUnknownMulticastTrafficEnabled;
        private Boolean igmpSnoopingEnabled;
        public Builder() {}
        public Builder(GetSwitchRoutingMulticastItemDefaultSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.floodUnknownMulticastTrafficEnabled = defaults.floodUnknownMulticastTrafficEnabled;
    	      this.igmpSnoopingEnabled = defaults.igmpSnoopingEnabled;
        }

        @CustomType.Setter
        public Builder floodUnknownMulticastTrafficEnabled(Boolean floodUnknownMulticastTrafficEnabled) {
            if (floodUnknownMulticastTrafficEnabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastItemDefaultSettings", "floodUnknownMulticastTrafficEnabled");
            }
            this.floodUnknownMulticastTrafficEnabled = floodUnknownMulticastTrafficEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder igmpSnoopingEnabled(Boolean igmpSnoopingEnabled) {
            if (igmpSnoopingEnabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastItemDefaultSettings", "igmpSnoopingEnabled");
            }
            this.igmpSnoopingEnabled = igmpSnoopingEnabled;
            return this;
        }
        public GetSwitchRoutingMulticastItemDefaultSettings build() {
            final var _resultValue = new GetSwitchRoutingMulticastItemDefaultSettings();
            _resultValue.floodUnknownMulticastTrafficEnabled = floodUnknownMulticastTrafficEnabled;
            _resultValue.igmpSnoopingEnabled = igmpSnoopingEnabled;
            return _resultValue;
        }
    }
}