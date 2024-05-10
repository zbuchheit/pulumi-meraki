// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCellularGatewayConnectivityMonitoringDestinationsItemDestination {
    private Boolean default_;
    private String description;
    private String ip;

    private GetCellularGatewayConnectivityMonitoringDestinationsItemDestination() {}
    public Boolean default_() {
        return this.default_;
    }
    public String description() {
        return this.description;
    }
    public String ip() {
        return this.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCellularGatewayConnectivityMonitoringDestinationsItemDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean default_;
        private String description;
        private String ip;
        public Builder() {}
        public Builder(GetCellularGatewayConnectivityMonitoringDestinationsItemDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.description = defaults.description;
    	      this.ip = defaults.ip;
        }

        @CustomType.Setter("default")
        public Builder default_(Boolean default_) {
            if (default_ == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayConnectivityMonitoringDestinationsItemDestination", "default_");
            }
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayConnectivityMonitoringDestinationsItemDestination", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayConnectivityMonitoringDestinationsItemDestination", "ip");
            }
            this.ip = ip;
            return this;
        }
        public GetCellularGatewayConnectivityMonitoringDestinationsItemDestination build() {
            final var _resultValue = new GetCellularGatewayConnectivityMonitoringDestinationsItemDestination();
            _resultValue.default_ = default_;
            _resultValue.description = description;
            _resultValue.ip = ip;
            return _resultValue;
        }
    }
}
