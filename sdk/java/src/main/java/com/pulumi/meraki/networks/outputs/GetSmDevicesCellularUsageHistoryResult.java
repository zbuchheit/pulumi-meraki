// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSmDevicesCellularUsageHistoryItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSmDevicesCellularUsageHistoryResult {
    /**
     * @return deviceId path parameter. Device ID
     * 
     */
    private String deviceId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseSmGetNetworkSmDeviceCellularUsageHistory
     * 
     */
    private List<GetSmDevicesCellularUsageHistoryItem> items;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;

    private GetSmDevicesCellularUsageHistoryResult() {}
    /**
     * @return deviceId path parameter. Device ID
     * 
     */
    public String deviceId() {
        return this.deviceId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseSmGetNetworkSmDeviceCellularUsageHistory
     * 
     */
    public List<GetSmDevicesCellularUsageHistoryItem> items() {
        return this.items;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmDevicesCellularUsageHistoryResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deviceId;
        private String id;
        private List<GetSmDevicesCellularUsageHistoryItem> items;
        private String networkId;
        public Builder() {}
        public Builder(GetSmDevicesCellularUsageHistoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceId = defaults.deviceId;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.networkId = defaults.networkId;
        }

        @CustomType.Setter
        public Builder deviceId(String deviceId) {
            if (deviceId == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesCellularUsageHistoryResult", "deviceId");
            }
            this.deviceId = deviceId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesCellularUsageHistoryResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetSmDevicesCellularUsageHistoryItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesCellularUsageHistoryResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetSmDevicesCellularUsageHistoryItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesCellularUsageHistoryResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        public GetSmDevicesCellularUsageHistoryResult build() {
            final var _resultValue = new GetSmDevicesCellularUsageHistoryResult();
            _resultValue.deviceId = deviceId;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.networkId = networkId;
            return _resultValue;
        }
    }
}