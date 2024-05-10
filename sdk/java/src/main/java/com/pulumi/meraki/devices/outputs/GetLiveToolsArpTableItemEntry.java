// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLiveToolsArpTableItemEntry {
    /**
     * @return The IP address of the ARP table entry
     * 
     */
    private String ip;
    /**
     * @return Time of the last update of the ARP table entry
     * 
     */
    private String lastUpdatedAt;
    /**
     * @return The MAC address of the ARP table entry
     * 
     */
    private String mac;
    /**
     * @return The VLAN ID of the ARP table entry
     * 
     */
    private Integer vlanId;

    private GetLiveToolsArpTableItemEntry() {}
    /**
     * @return The IP address of the ARP table entry
     * 
     */
    public String ip() {
        return this.ip;
    }
    /**
     * @return Time of the last update of the ARP table entry
     * 
     */
    public String lastUpdatedAt() {
        return this.lastUpdatedAt;
    }
    /**
     * @return The MAC address of the ARP table entry
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return The VLAN ID of the ARP table entry
     * 
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveToolsArpTableItemEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ip;
        private String lastUpdatedAt;
        private String mac;
        private Integer vlanId;
        public Builder() {}
        public Builder(GetLiveToolsArpTableItemEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.lastUpdatedAt = defaults.lastUpdatedAt;
    	      this.mac = defaults.mac;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsArpTableItemEntry", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            if (lastUpdatedAt == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsArpTableItemEntry", "lastUpdatedAt");
            }
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }
        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsArpTableItemEntry", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(Integer vlanId) {
            if (vlanId == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsArpTableItemEntry", "vlanId");
            }
            this.vlanId = vlanId;
            return this;
        }
        public GetLiveToolsArpTableItemEntry build() {
            final var _resultValue = new GetLiveToolsArpTableItemEntry();
            _resultValue.ip = ip;
            _resultValue.lastUpdatedAt = lastUpdatedAt;
            _resultValue.mac = mac;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}
