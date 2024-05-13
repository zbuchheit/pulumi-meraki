// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCellularGatewaySubnetPoolItemSubnet {
    private String applianceIp;
    private String name;
    private String serial;
    private String subnet;

    private GetCellularGatewaySubnetPoolItemSubnet() {}
    public String applianceIp() {
        return this.applianceIp;
    }
    public String name() {
        return this.name;
    }
    public String serial() {
        return this.serial;
    }
    public String subnet() {
        return this.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCellularGatewaySubnetPoolItemSubnet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applianceIp;
        private String name;
        private String serial;
        private String subnet;
        public Builder() {}
        public Builder(GetCellularGatewaySubnetPoolItemSubnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applianceIp = defaults.applianceIp;
    	      this.name = defaults.name;
    	      this.serial = defaults.serial;
    	      this.subnet = defaults.subnet;
        }

        @CustomType.Setter
        public Builder applianceIp(String applianceIp) {
            if (applianceIp == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewaySubnetPoolItemSubnet", "applianceIp");
            }
            this.applianceIp = applianceIp;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewaySubnetPoolItemSubnet", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewaySubnetPoolItemSubnet", "serial");
            }
            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder subnet(String subnet) {
            if (subnet == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewaySubnetPoolItemSubnet", "subnet");
            }
            this.subnet = subnet;
            return this;
        }
        public GetCellularGatewaySubnetPoolItemSubnet build() {
            final var _resultValue = new GetCellularGatewaySubnetPoolItemSubnet();
            _resultValue.applianceIp = applianceIp;
            _resultValue.name = name;
            _resultValue.serial = serial;
            _resultValue.subnet = subnet;
            return _resultValue;
        }
    }
}