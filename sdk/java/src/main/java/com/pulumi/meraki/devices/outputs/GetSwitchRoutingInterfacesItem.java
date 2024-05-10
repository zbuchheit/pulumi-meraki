// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetSwitchRoutingInterfacesItemIpv6;
import com.pulumi.meraki.devices.outputs.GetSwitchRoutingInterfacesItemOspfSettings;
import com.pulumi.meraki.devices.outputs.GetSwitchRoutingInterfacesItemOspfV3;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchRoutingInterfacesItem {
    /**
     * @return IPv4 default gateway
     * 
     */
    private String defaultGateway;
    /**
     * @return The id
     * 
     */
    private String interfaceId;
    /**
     * @return IPv4 address
     * 
     */
    private String interfaceIp;
    /**
     * @return IPv6 addressing
     * 
     */
    private GetSwitchRoutingInterfacesItemIpv6 ipv6;
    /**
     * @return Multicast routing status
     * 
     */
    private String multicastRouting;
    /**
     * @return The name
     * 
     */
    private String name;
    /**
     * @return IPv4 OSPF Settings
     * 
     */
    private GetSwitchRoutingInterfacesItemOspfSettings ospfSettings;
    /**
     * @return IPv6 OSPF Settings
     * 
     */
    private GetSwitchRoutingInterfacesItemOspfV3 ospfV3;
    /**
     * @return IPv4 subnet
     * 
     */
    private String subnet;
    /**
     * @return VLAN id
     * 
     */
    private Integer vlanId;

    private GetSwitchRoutingInterfacesItem() {}
    /**
     * @return IPv4 default gateway
     * 
     */
    public String defaultGateway() {
        return this.defaultGateway;
    }
    /**
     * @return The id
     * 
     */
    public String interfaceId() {
        return this.interfaceId;
    }
    /**
     * @return IPv4 address
     * 
     */
    public String interfaceIp() {
        return this.interfaceIp;
    }
    /**
     * @return IPv6 addressing
     * 
     */
    public GetSwitchRoutingInterfacesItemIpv6 ipv6() {
        return this.ipv6;
    }
    /**
     * @return Multicast routing status
     * 
     */
    public String multicastRouting() {
        return this.multicastRouting;
    }
    /**
     * @return The name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return IPv4 OSPF Settings
     * 
     */
    public GetSwitchRoutingInterfacesItemOspfSettings ospfSettings() {
        return this.ospfSettings;
    }
    /**
     * @return IPv6 OSPF Settings
     * 
     */
    public GetSwitchRoutingInterfacesItemOspfV3 ospfV3() {
        return this.ospfV3;
    }
    /**
     * @return IPv4 subnet
     * 
     */
    public String subnet() {
        return this.subnet;
    }
    /**
     * @return VLAN id
     * 
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchRoutingInterfacesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultGateway;
        private String interfaceId;
        private String interfaceIp;
        private GetSwitchRoutingInterfacesItemIpv6 ipv6;
        private String multicastRouting;
        private String name;
        private GetSwitchRoutingInterfacesItemOspfSettings ospfSettings;
        private GetSwitchRoutingInterfacesItemOspfV3 ospfV3;
        private String subnet;
        private Integer vlanId;
        public Builder() {}
        public Builder(GetSwitchRoutingInterfacesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultGateway = defaults.defaultGateway;
    	      this.interfaceId = defaults.interfaceId;
    	      this.interfaceIp = defaults.interfaceIp;
    	      this.ipv6 = defaults.ipv6;
    	      this.multicastRouting = defaults.multicastRouting;
    	      this.name = defaults.name;
    	      this.ospfSettings = defaults.ospfSettings;
    	      this.ospfV3 = defaults.ospfV3;
    	      this.subnet = defaults.subnet;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder defaultGateway(String defaultGateway) {
            if (defaultGateway == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesItem", "defaultGateway");
            }
            this.defaultGateway = defaultGateway;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceId(String interfaceId) {
            if (interfaceId == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesItem", "interfaceId");
            }
            this.interfaceId = interfaceId;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceIp(String interfaceIp) {
            if (interfaceIp == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesItem", "interfaceIp");
            }
            this.interfaceIp = interfaceIp;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(GetSwitchRoutingInterfacesItemIpv6 ipv6) {
            if (ipv6 == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesItem", "ipv6");
            }
            this.ipv6 = ipv6;
            return this;
        }
        @CustomType.Setter
        public Builder multicastRouting(String multicastRouting) {
            if (multicastRouting == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesItem", "multicastRouting");
            }
            this.multicastRouting = multicastRouting;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ospfSettings(GetSwitchRoutingInterfacesItemOspfSettings ospfSettings) {
            if (ospfSettings == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesItem", "ospfSettings");
            }
            this.ospfSettings = ospfSettings;
            return this;
        }
        @CustomType.Setter
        public Builder ospfV3(GetSwitchRoutingInterfacesItemOspfV3 ospfV3) {
            if (ospfV3 == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesItem", "ospfV3");
            }
            this.ospfV3 = ospfV3;
            return this;
        }
        @CustomType.Setter
        public Builder subnet(String subnet) {
            if (subnet == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesItem", "subnet");
            }
            this.subnet = subnet;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(Integer vlanId) {
            if (vlanId == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesItem", "vlanId");
            }
            this.vlanId = vlanId;
            return this;
        }
        public GetSwitchRoutingInterfacesItem build() {
            final var _resultValue = new GetSwitchRoutingInterfacesItem();
            _resultValue.defaultGateway = defaultGateway;
            _resultValue.interfaceId = interfaceId;
            _resultValue.interfaceIp = interfaceIp;
            _resultValue.ipv6 = ipv6;
            _resultValue.multicastRouting = multicastRouting;
            _resultValue.name = name;
            _resultValue.ospfSettings = ospfSettings;
            _resultValue.ospfV3 = ospfV3;
            _resultValue.subnet = subnet;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}
