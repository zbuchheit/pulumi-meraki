// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCellularGatewayUplinkStatusesItemUplinkSignalStat {
    /**
     * @return Reference Signal Received Power
     * 
     */
    private String rsrp;
    /**
     * @return Reference Signal Received Quality
     * 
     */
    private String rsrq;

    private GetCellularGatewayUplinkStatusesItemUplinkSignalStat() {}
    /**
     * @return Reference Signal Received Power
     * 
     */
    public String rsrp() {
        return this.rsrp;
    }
    /**
     * @return Reference Signal Received Quality
     * 
     */
    public String rsrq() {
        return this.rsrq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCellularGatewayUplinkStatusesItemUplinkSignalStat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String rsrp;
        private String rsrq;
        public Builder() {}
        public Builder(GetCellularGatewayUplinkStatusesItemUplinkSignalStat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rsrp = defaults.rsrp;
    	      this.rsrq = defaults.rsrq;
        }

        @CustomType.Setter
        public Builder rsrp(String rsrp) {
            if (rsrp == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayUplinkStatusesItemUplinkSignalStat", "rsrp");
            }
            this.rsrp = rsrp;
            return this;
        }
        @CustomType.Setter
        public Builder rsrq(String rsrq) {
            if (rsrq == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayUplinkStatusesItemUplinkSignalStat", "rsrq");
            }
            this.rsrq = rsrq;
            return this;
        }
        public GetCellularGatewayUplinkStatusesItemUplinkSignalStat build() {
            final var _resultValue = new GetCellularGatewayUplinkStatusesItemUplinkSignalStat();
            _resultValue.rsrp = rsrp;
            _resultValue.rsrq = rsrq;
            return _resultValue;
        }
    }
}
