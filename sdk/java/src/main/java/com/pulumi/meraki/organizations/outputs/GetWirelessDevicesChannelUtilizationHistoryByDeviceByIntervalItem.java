// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemNetwork;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem {
    /**
     * @return Channel utilization broken down by band.
     * 
     */
    private List<GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand> byBands;
    /**
     * @return The end time of the channel utilization interval.
     * 
     */
    private String endTs;
    /**
     * @return The MAC address of the device.
     * 
     */
    private String mac;
    /**
     * @return Network for the given utilization metrics.
     * 
     */
    private GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemNetwork network;
    /**
     * @return The serial number for the device.
     * 
     */
    private String serial;
    /**
     * @return The start time of the channel utilization interval.
     * 
     */
    private String startTs;

    private GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem() {}
    /**
     * @return Channel utilization broken down by band.
     * 
     */
    public List<GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand> byBands() {
        return this.byBands;
    }
    /**
     * @return The end time of the channel utilization interval.
     * 
     */
    public String endTs() {
        return this.endTs;
    }
    /**
     * @return The MAC address of the device.
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return Network for the given utilization metrics.
     * 
     */
    public GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemNetwork network() {
        return this.network;
    }
    /**
     * @return The serial number for the device.
     * 
     */
    public String serial() {
        return this.serial;
    }
    /**
     * @return The start time of the channel utilization interval.
     * 
     */
    public String startTs() {
        return this.startTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand> byBands;
        private String endTs;
        private String mac;
        private GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemNetwork network;
        private String serial;
        private String startTs;
        public Builder() {}
        public Builder(GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byBands = defaults.byBands;
    	      this.endTs = defaults.endTs;
    	      this.mac = defaults.mac;
    	      this.network = defaults.network;
    	      this.serial = defaults.serial;
    	      this.startTs = defaults.startTs;
        }

        @CustomType.Setter
        public Builder byBands(List<GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand> byBands) {
            if (byBands == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem", "byBands");
            }
            this.byBands = byBands;
            return this;
        }
        public Builder byBands(GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemByBand... byBands) {
            return byBands(List.of(byBands));
        }
        @CustomType.Setter
        public Builder endTs(String endTs) {
            if (endTs == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem", "endTs");
            }
            this.endTs = endTs;
            return this;
        }
        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder network(GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItemNetwork network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem", "serial");
            }
            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder startTs(String startTs) {
            if (startTs == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem", "startTs");
            }
            this.startTs = startTs;
            return this;
        }
        public GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem build() {
            final var _resultValue = new GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem();
            _resultValue.byBands = byBands;
            _resultValue.endTs = endTs;
            _resultValue.mac = mac;
            _resultValue.network = network;
            _resultValue.serial = serial;
            _resultValue.startTs = startTs;
            return _resultValue;
        }
    }
}
