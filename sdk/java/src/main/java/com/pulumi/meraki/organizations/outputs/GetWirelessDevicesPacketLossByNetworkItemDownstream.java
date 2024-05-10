// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetWirelessDevicesPacketLossByNetworkItemDownstream {
    /**
     * @return Percentage of lost packets.
     * 
     */
    private Double lossPercentage;
    /**
     * @return Total packets sent by an AP that did not reach the client.
     * 
     */
    private Integer lost;
    /**
     * @return Total packets received by a client.
     * 
     */
    private Integer total;

    private GetWirelessDevicesPacketLossByNetworkItemDownstream() {}
    /**
     * @return Percentage of lost packets.
     * 
     */
    public Double lossPercentage() {
        return this.lossPercentage;
    }
    /**
     * @return Total packets sent by an AP that did not reach the client.
     * 
     */
    public Integer lost() {
        return this.lost;
    }
    /**
     * @return Total packets received by a client.
     * 
     */
    public Integer total() {
        return this.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessDevicesPacketLossByNetworkItemDownstream defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double lossPercentage;
        private Integer lost;
        private Integer total;
        public Builder() {}
        public Builder(GetWirelessDevicesPacketLossByNetworkItemDownstream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lossPercentage = defaults.lossPercentage;
    	      this.lost = defaults.lost;
    	      this.total = defaults.total;
        }

        @CustomType.Setter
        public Builder lossPercentage(Double lossPercentage) {
            if (lossPercentage == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesPacketLossByNetworkItemDownstream", "lossPercentage");
            }
            this.lossPercentage = lossPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder lost(Integer lost) {
            if (lost == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesPacketLossByNetworkItemDownstream", "lost");
            }
            this.lost = lost;
            return this;
        }
        @CustomType.Setter
        public Builder total(Integer total) {
            if (total == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesPacketLossByNetworkItemDownstream", "total");
            }
            this.total = total;
            return this;
        }
        public GetWirelessDevicesPacketLossByNetworkItemDownstream build() {
            final var _resultValue = new GetWirelessDevicesPacketLossByNetworkItemDownstream();
            _resultValue.lossPercentage = lossPercentage;
            _resultValue.lost = lost;
            _resultValue.total = total;
            return _resultValue;
        }
    }
}
