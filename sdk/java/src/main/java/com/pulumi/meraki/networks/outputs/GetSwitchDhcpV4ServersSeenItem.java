// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSwitchDhcpV4ServersSeenItemDevice;
import com.pulumi.meraki.networks.outputs.GetSwitchDhcpV4ServersSeenItemIpv4;
import com.pulumi.meraki.networks.outputs.GetSwitchDhcpV4ServersSeenItemLastAck;
import com.pulumi.meraki.networks.outputs.GetSwitchDhcpV4ServersSeenItemLastPacket;
import com.pulumi.meraki.networks.outputs.GetSwitchDhcpV4ServersSeenItemSeenBy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSwitchDhcpV4ServersSeenItem {
    /**
     * @return Client id of the server if available.
     * 
     */
    private String clientId;
    /**
     * @return Attributes of the server when it&#39;s a device.
     * 
     */
    private GetSwitchDhcpV4ServersSeenItemDevice device;
    /**
     * @return IPv4 attributes of the server.
     * 
     */
    private GetSwitchDhcpV4ServersSeenItemIpv4 ipv4;
    /**
     * @return Whether the server is allowed or blocked. Always true for configured servers.
     * 
     */
    private Boolean isAllowed;
    /**
     * @return Whether the server is configured.
     * 
     */
    private Boolean isConfigured;
    /**
     * @return Attributes of the server&#39;s last ack.
     * 
     */
    private GetSwitchDhcpV4ServersSeenItemLastAck lastAck;
    /**
     * @return Last packet the server received.
     * 
     */
    private GetSwitchDhcpV4ServersSeenItemLastPacket lastPacket;
    /**
     * @return Last time the server was seen.
     * 
     */
    private String lastSeenAt;
    /**
     * @return Mac address of the server.
     * 
     */
    private String mac;
    /**
     * @return Devices that saw the server.
     * 
     */
    private List<GetSwitchDhcpV4ServersSeenItemSeenBy> seenBies;
    /**
     * @return server type. Can be a &#39;device&#39;, &#39;stack&#39;, or &#39;discovered&#39; (i.e client).
     * 
     */
    private String type;
    /**
     * @return Vlan id of the server.
     * 
     */
    private Integer vlan;

    private GetSwitchDhcpV4ServersSeenItem() {}
    /**
     * @return Client id of the server if available.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return Attributes of the server when it&#39;s a device.
     * 
     */
    public GetSwitchDhcpV4ServersSeenItemDevice device() {
        return this.device;
    }
    /**
     * @return IPv4 attributes of the server.
     * 
     */
    public GetSwitchDhcpV4ServersSeenItemIpv4 ipv4() {
        return this.ipv4;
    }
    /**
     * @return Whether the server is allowed or blocked. Always true for configured servers.
     * 
     */
    public Boolean isAllowed() {
        return this.isAllowed;
    }
    /**
     * @return Whether the server is configured.
     * 
     */
    public Boolean isConfigured() {
        return this.isConfigured;
    }
    /**
     * @return Attributes of the server&#39;s last ack.
     * 
     */
    public GetSwitchDhcpV4ServersSeenItemLastAck lastAck() {
        return this.lastAck;
    }
    /**
     * @return Last packet the server received.
     * 
     */
    public GetSwitchDhcpV4ServersSeenItemLastPacket lastPacket() {
        return this.lastPacket;
    }
    /**
     * @return Last time the server was seen.
     * 
     */
    public String lastSeenAt() {
        return this.lastSeenAt;
    }
    /**
     * @return Mac address of the server.
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return Devices that saw the server.
     * 
     */
    public List<GetSwitchDhcpV4ServersSeenItemSeenBy> seenBies() {
        return this.seenBies;
    }
    /**
     * @return server type. Can be a &#39;device&#39;, &#39;stack&#39;, or &#39;discovered&#39; (i.e client).
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Vlan id of the server.
     * 
     */
    public Integer vlan() {
        return this.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchDhcpV4ServersSeenItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        private GetSwitchDhcpV4ServersSeenItemDevice device;
        private GetSwitchDhcpV4ServersSeenItemIpv4 ipv4;
        private Boolean isAllowed;
        private Boolean isConfigured;
        private GetSwitchDhcpV4ServersSeenItemLastAck lastAck;
        private GetSwitchDhcpV4ServersSeenItemLastPacket lastPacket;
        private String lastSeenAt;
        private String mac;
        private List<GetSwitchDhcpV4ServersSeenItemSeenBy> seenBies;
        private String type;
        private Integer vlan;
        public Builder() {}
        public Builder(GetSwitchDhcpV4ServersSeenItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.device = defaults.device;
    	      this.ipv4 = defaults.ipv4;
    	      this.isAllowed = defaults.isAllowed;
    	      this.isConfigured = defaults.isConfigured;
    	      this.lastAck = defaults.lastAck;
    	      this.lastPacket = defaults.lastPacket;
    	      this.lastSeenAt = defaults.lastSeenAt;
    	      this.mac = defaults.mac;
    	      this.seenBies = defaults.seenBies;
    	      this.type = defaults.type;
    	      this.vlan = defaults.vlan;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder device(GetSwitchDhcpV4ServersSeenItemDevice device) {
            if (device == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "device");
            }
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4(GetSwitchDhcpV4ServersSeenItemIpv4 ipv4) {
            if (ipv4 == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "ipv4");
            }
            this.ipv4 = ipv4;
            return this;
        }
        @CustomType.Setter
        public Builder isAllowed(Boolean isAllowed) {
            if (isAllowed == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "isAllowed");
            }
            this.isAllowed = isAllowed;
            return this;
        }
        @CustomType.Setter
        public Builder isConfigured(Boolean isConfigured) {
            if (isConfigured == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "isConfigured");
            }
            this.isConfigured = isConfigured;
            return this;
        }
        @CustomType.Setter
        public Builder lastAck(GetSwitchDhcpV4ServersSeenItemLastAck lastAck) {
            if (lastAck == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "lastAck");
            }
            this.lastAck = lastAck;
            return this;
        }
        @CustomType.Setter
        public Builder lastPacket(GetSwitchDhcpV4ServersSeenItemLastPacket lastPacket) {
            if (lastPacket == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "lastPacket");
            }
            this.lastPacket = lastPacket;
            return this;
        }
        @CustomType.Setter
        public Builder lastSeenAt(String lastSeenAt) {
            if (lastSeenAt == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "lastSeenAt");
            }
            this.lastSeenAt = lastSeenAt;
            return this;
        }
        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder seenBies(List<GetSwitchDhcpV4ServersSeenItemSeenBy> seenBies) {
            if (seenBies == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "seenBies");
            }
            this.seenBies = seenBies;
            return this;
        }
        public Builder seenBies(GetSwitchDhcpV4ServersSeenItemSeenBy... seenBies) {
            return seenBies(List.of(seenBies));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder vlan(Integer vlan) {
            if (vlan == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItem", "vlan");
            }
            this.vlan = vlan;
            return this;
        }
        public GetSwitchDhcpV4ServersSeenItem build() {
            final var _resultValue = new GetSwitchDhcpV4ServersSeenItem();
            _resultValue.clientId = clientId;
            _resultValue.device = device;
            _resultValue.ipv4 = ipv4;
            _resultValue.isAllowed = isAllowed;
            _resultValue.isConfigured = isConfigured;
            _resultValue.lastAck = lastAck;
            _resultValue.lastPacket = lastPacket;
            _resultValue.lastSeenAt = lastSeenAt;
            _resultValue.mac = mac;
            _resultValue.seenBies = seenBies;
            _resultValue.type = type;
            _resultValue.vlan = vlan;
            return _resultValue;
        }
    }
}