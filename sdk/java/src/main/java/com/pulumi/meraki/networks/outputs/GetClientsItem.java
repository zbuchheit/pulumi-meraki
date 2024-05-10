// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetClientsItemCdp;
import com.pulumi.meraki.networks.outputs.GetClientsItemClientVpnConnection;
import com.pulumi.meraki.networks.outputs.GetClientsItemLldp;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClientsItem {
    /**
     * @return The Cisco discover protocol settings for the client
     * 
     */
    private List<GetClientsItemCdp> cdps;
    /**
     * @return VPN connections associated with the client
     * 
     */
    private List<GetClientsItemClientVpnConnection> clientVpnConnections;
    /**
     * @return Short description of the client
     * 
     */
    private String description;
    /**
     * @return Timestamp client was first seen in the network
     * 
     */
    private Integer firstSeen;
    /**
     * @return The ID of the client
     * 
     */
    private String id;
    /**
     * @return The IP address of the client
     * 
     */
    private String ip;
    /**
     * @return The IPv6 address of the client
     * 
     */
    private String ip6;
    /**
     * @return Timestamp client was last seen in the network
     * 
     */
    private Integer lastSeen;
    /**
     * @return The link layer discover protocol settings for the client
     * 
     */
    private List<GetClientsItemLldp> lldps;
    /**
     * @return The MAC address of the client
     * 
     */
    private String mac;
    /**
     * @return Manufacturer of the client
     * 
     */
    private String manufacturer;
    /**
     * @return The operating system of the client
     * 
     */
    private String os;
    /**
     * @return The MAC address of the node that the device was last connected to
     * 
     */
    private String recentDeviceMac;
    /**
     * @return Status of SM for the client
     * 
     */
    private Boolean smInstalled;
    /**
     * @return The name of the SSID that the client is connected to
     * 
     */
    private String ssid;
    /**
     * @return The connection status of the client
     * 
     */
    private String status;
    /**
     * @return The switch port that the client is connected to
     * 
     */
    private String switchport;
    /**
     * @return The username of the user of the client
     * 
     */
    private String user;
    /**
     * @return The name of the VLAN that the client is connected to
     * 
     */
    private String vlan;
    /**
     * @return Wireless capabilities of the client
     * 
     */
    private String wirelessCapabilities;

    private GetClientsItem() {}
    /**
     * @return The Cisco discover protocol settings for the client
     * 
     */
    public List<GetClientsItemCdp> cdps() {
        return this.cdps;
    }
    /**
     * @return VPN connections associated with the client
     * 
     */
    public List<GetClientsItemClientVpnConnection> clientVpnConnections() {
        return this.clientVpnConnections;
    }
    /**
     * @return Short description of the client
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Timestamp client was first seen in the network
     * 
     */
    public Integer firstSeen() {
        return this.firstSeen;
    }
    /**
     * @return The ID of the client
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The IP address of the client
     * 
     */
    public String ip() {
        return this.ip;
    }
    /**
     * @return The IPv6 address of the client
     * 
     */
    public String ip6() {
        return this.ip6;
    }
    /**
     * @return Timestamp client was last seen in the network
     * 
     */
    public Integer lastSeen() {
        return this.lastSeen;
    }
    /**
     * @return The link layer discover protocol settings for the client
     * 
     */
    public List<GetClientsItemLldp> lldps() {
        return this.lldps;
    }
    /**
     * @return The MAC address of the client
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return Manufacturer of the client
     * 
     */
    public String manufacturer() {
        return this.manufacturer;
    }
    /**
     * @return The operating system of the client
     * 
     */
    public String os() {
        return this.os;
    }
    /**
     * @return The MAC address of the node that the device was last connected to
     * 
     */
    public String recentDeviceMac() {
        return this.recentDeviceMac;
    }
    /**
     * @return Status of SM for the client
     * 
     */
    public Boolean smInstalled() {
        return this.smInstalled;
    }
    /**
     * @return The name of the SSID that the client is connected to
     * 
     */
    public String ssid() {
        return this.ssid;
    }
    /**
     * @return The connection status of the client
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The switch port that the client is connected to
     * 
     */
    public String switchport() {
        return this.switchport;
    }
    /**
     * @return The username of the user of the client
     * 
     */
    public String user() {
        return this.user;
    }
    /**
     * @return The name of the VLAN that the client is connected to
     * 
     */
    public String vlan() {
        return this.vlan;
    }
    /**
     * @return Wireless capabilities of the client
     * 
     */
    public String wirelessCapabilities() {
        return this.wirelessCapabilities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetClientsItemCdp> cdps;
        private List<GetClientsItemClientVpnConnection> clientVpnConnections;
        private String description;
        private Integer firstSeen;
        private String id;
        private String ip;
        private String ip6;
        private Integer lastSeen;
        private List<GetClientsItemLldp> lldps;
        private String mac;
        private String manufacturer;
        private String os;
        private String recentDeviceMac;
        private Boolean smInstalled;
        private String ssid;
        private String status;
        private String switchport;
        private String user;
        private String vlan;
        private String wirelessCapabilities;
        public Builder() {}
        public Builder(GetClientsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdps = defaults.cdps;
    	      this.clientVpnConnections = defaults.clientVpnConnections;
    	      this.description = defaults.description;
    	      this.firstSeen = defaults.firstSeen;
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.ip6 = defaults.ip6;
    	      this.lastSeen = defaults.lastSeen;
    	      this.lldps = defaults.lldps;
    	      this.mac = defaults.mac;
    	      this.manufacturer = defaults.manufacturer;
    	      this.os = defaults.os;
    	      this.recentDeviceMac = defaults.recentDeviceMac;
    	      this.smInstalled = defaults.smInstalled;
    	      this.ssid = defaults.ssid;
    	      this.status = defaults.status;
    	      this.switchport = defaults.switchport;
    	      this.user = defaults.user;
    	      this.vlan = defaults.vlan;
    	      this.wirelessCapabilities = defaults.wirelessCapabilities;
        }

        @CustomType.Setter
        public Builder cdps(List<GetClientsItemCdp> cdps) {
            if (cdps == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "cdps");
            }
            this.cdps = cdps;
            return this;
        }
        public Builder cdps(GetClientsItemCdp... cdps) {
            return cdps(List.of(cdps));
        }
        @CustomType.Setter
        public Builder clientVpnConnections(List<GetClientsItemClientVpnConnection> clientVpnConnections) {
            if (clientVpnConnections == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "clientVpnConnections");
            }
            this.clientVpnConnections = clientVpnConnections;
            return this;
        }
        public Builder clientVpnConnections(GetClientsItemClientVpnConnection... clientVpnConnections) {
            return clientVpnConnections(List.of(clientVpnConnections));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder firstSeen(Integer firstSeen) {
            if (firstSeen == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "firstSeen");
            }
            this.firstSeen = firstSeen;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder ip6(String ip6) {
            if (ip6 == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "ip6");
            }
            this.ip6 = ip6;
            return this;
        }
        @CustomType.Setter
        public Builder lastSeen(Integer lastSeen) {
            if (lastSeen == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "lastSeen");
            }
            this.lastSeen = lastSeen;
            return this;
        }
        @CustomType.Setter
        public Builder lldps(List<GetClientsItemLldp> lldps) {
            if (lldps == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "lldps");
            }
            this.lldps = lldps;
            return this;
        }
        public Builder lldps(GetClientsItemLldp... lldps) {
            return lldps(List.of(lldps));
        }
        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder manufacturer(String manufacturer) {
            if (manufacturer == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "manufacturer");
            }
            this.manufacturer = manufacturer;
            return this;
        }
        @CustomType.Setter
        public Builder os(String os) {
            if (os == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "os");
            }
            this.os = os;
            return this;
        }
        @CustomType.Setter
        public Builder recentDeviceMac(String recentDeviceMac) {
            if (recentDeviceMac == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "recentDeviceMac");
            }
            this.recentDeviceMac = recentDeviceMac;
            return this;
        }
        @CustomType.Setter
        public Builder smInstalled(Boolean smInstalled) {
            if (smInstalled == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "smInstalled");
            }
            this.smInstalled = smInstalled;
            return this;
        }
        @CustomType.Setter
        public Builder ssid(String ssid) {
            if (ssid == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "ssid");
            }
            this.ssid = ssid;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder switchport(String switchport) {
            if (switchport == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "switchport");
            }
            this.switchport = switchport;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "user");
            }
            this.user = user;
            return this;
        }
        @CustomType.Setter
        public Builder vlan(String vlan) {
            if (vlan == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "vlan");
            }
            this.vlan = vlan;
            return this;
        }
        @CustomType.Setter
        public Builder wirelessCapabilities(String wirelessCapabilities) {
            if (wirelessCapabilities == null) {
              throw new MissingRequiredPropertyException("GetClientsItem", "wirelessCapabilities");
            }
            this.wirelessCapabilities = wirelessCapabilities;
            return this;
        }
        public GetClientsItem build() {
            final var _resultValue = new GetClientsItem();
            _resultValue.cdps = cdps;
            _resultValue.clientVpnConnections = clientVpnConnections;
            _resultValue.description = description;
            _resultValue.firstSeen = firstSeen;
            _resultValue.id = id;
            _resultValue.ip = ip;
            _resultValue.ip6 = ip6;
            _resultValue.lastSeen = lastSeen;
            _resultValue.lldps = lldps;
            _resultValue.mac = mac;
            _resultValue.manufacturer = manufacturer;
            _resultValue.os = os;
            _resultValue.recentDeviceMac = recentDeviceMac;
            _resultValue.smInstalled = smInstalled;
            _resultValue.ssid = ssid;
            _resultValue.status = status;
            _resultValue.switchport = switchport;
            _resultValue.user = user;
            _resultValue.vlan = vlan;
            _resultValue.wirelessCapabilities = wirelessCapabilities;
            return _resultValue;
        }
    }
}
