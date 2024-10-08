// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessDevicesEthernetStatusesItemPortLinkNegotiation {
    /**
     * @return The duplex mode of the port. Can be &#39;full&#39; or &#39;half&#39;
     * 
     */
    private String duplex;
    /**
     * @return The speed of the port
     * 
     */
    private Integer speed;

    private GetWirelessDevicesEthernetStatusesItemPortLinkNegotiation() {}
    /**
     * @return The duplex mode of the port. Can be &#39;full&#39; or &#39;half&#39;
     * 
     */
    public String duplex() {
        return this.duplex;
    }
    /**
     * @return The speed of the port
     * 
     */
    public Integer speed() {
        return this.speed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessDevicesEthernetStatusesItemPortLinkNegotiation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String duplex;
        private Integer speed;
        public Builder() {}
        public Builder(GetWirelessDevicesEthernetStatusesItemPortLinkNegotiation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duplex = defaults.duplex;
    	      this.speed = defaults.speed;
        }

        @CustomType.Setter
        public Builder duplex(String duplex) {
            if (duplex == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesEthernetStatusesItemPortLinkNegotiation", "duplex");
            }
            this.duplex = duplex;
            return this;
        }
        @CustomType.Setter
        public Builder speed(Integer speed) {
            if (speed == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesEthernetStatusesItemPortLinkNegotiation", "speed");
            }
            this.speed = speed;
            return this;
        }
        public GetWirelessDevicesEthernetStatusesItemPortLinkNegotiation build() {
            final var _resultValue = new GetWirelessDevicesEthernetStatusesItemPortLinkNegotiation();
            _resultValue.duplex = duplex;
            _resultValue.speed = speed;
            return _resultValue;
        }
    }
}
