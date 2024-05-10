// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetWirelessChannelUtilizationHistoryItem;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWirelessChannelUtilizationHistoryResult {
    /**
     * @return apTag query parameter. Filter results by AP tag to return AP channel utilization metrics for devices labeled with the given tag; either :clientId or :deviceSerial must be jointly specified.
     * 
     */
    private @Nullable String apTag;
    /**
     * @return autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the &#39;resolution&#39; parameter. The default setting is false.
     * 
     */
    private @Nullable Boolean autoResolution;
    /**
     * @return band query parameter. Filter results by band (either &#39;2.4&#39;, &#39;5&#39; or &#39;6&#39;).
     * 
     */
    private @Nullable String band;
    /**
     * @return clientId query parameter. Filter results by network client to return per-device, per-band AP channel utilization metrics inner joined by the queried client&#39;s connection history.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return deviceSerial query parameter. Filter results by device to return AP channel utilization metrics for the queried device; either :band or :clientId must be jointly specified.
     * 
     */
    private @Nullable String deviceSerial;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseWirelessGetNetworkWirelessChannelUtilizationHistory
     * 
     */
    private List<GetWirelessChannelUtilizationHistoryItem> items;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;
    /**
     * @return resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 600, 1200, 3600, 14400, 86400. The default is 86400.
     * 
     */
    private @Nullable Integer resolution;
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     * 
     */
    private @Nullable String t0;
    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    private @Nullable String t1;
    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
     * 
     */
    private @Nullable Double timespan;

    private GetWirelessChannelUtilizationHistoryResult() {}
    /**
     * @return apTag query parameter. Filter results by AP tag to return AP channel utilization metrics for devices labeled with the given tag; either :clientId or :deviceSerial must be jointly specified.
     * 
     */
    public Optional<String> apTag() {
        return Optional.ofNullable(this.apTag);
    }
    /**
     * @return autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the &#39;resolution&#39; parameter. The default setting is false.
     * 
     */
    public Optional<Boolean> autoResolution() {
        return Optional.ofNullable(this.autoResolution);
    }
    /**
     * @return band query parameter. Filter results by band (either &#39;2.4&#39;, &#39;5&#39; or &#39;6&#39;).
     * 
     */
    public Optional<String> band() {
        return Optional.ofNullable(this.band);
    }
    /**
     * @return clientId query parameter. Filter results by network client to return per-device, per-band AP channel utilization metrics inner joined by the queried client&#39;s connection history.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return deviceSerial query parameter. Filter results by device to return AP channel utilization metrics for the queried device; either :band or :clientId must be jointly specified.
     * 
     */
    public Optional<String> deviceSerial() {
        return Optional.ofNullable(this.deviceSerial);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseWirelessGetNetworkWirelessChannelUtilizationHistory
     * 
     */
    public List<GetWirelessChannelUtilizationHistoryItem> items() {
        return this.items;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }
    /**
     * @return resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 600, 1200, 3600, 14400, 86400. The default is 86400.
     * 
     */
    public Optional<Integer> resolution() {
        return Optional.ofNullable(this.resolution);
    }
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     * 
     */
    public Optional<String> t0() {
        return Optional.ofNullable(this.t0);
    }
    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    public Optional<String> t1() {
        return Optional.ofNullable(this.t1);
    }
    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
     * 
     */
    public Optional<Double> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessChannelUtilizationHistoryResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apTag;
        private @Nullable Boolean autoResolution;
        private @Nullable String band;
        private @Nullable String clientId;
        private @Nullable String deviceSerial;
        private String id;
        private List<GetWirelessChannelUtilizationHistoryItem> items;
        private String networkId;
        private @Nullable Integer resolution;
        private @Nullable String t0;
        private @Nullable String t1;
        private @Nullable Double timespan;
        public Builder() {}
        public Builder(GetWirelessChannelUtilizationHistoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apTag = defaults.apTag;
    	      this.autoResolution = defaults.autoResolution;
    	      this.band = defaults.band;
    	      this.clientId = defaults.clientId;
    	      this.deviceSerial = defaults.deviceSerial;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.networkId = defaults.networkId;
    	      this.resolution = defaults.resolution;
    	      this.t0 = defaults.t0;
    	      this.t1 = defaults.t1;
    	      this.timespan = defaults.timespan;
        }

        @CustomType.Setter
        public Builder apTag(@Nullable String apTag) {

            this.apTag = apTag;
            return this;
        }
        @CustomType.Setter
        public Builder autoResolution(@Nullable Boolean autoResolution) {

            this.autoResolution = autoResolution;
            return this;
        }
        @CustomType.Setter
        public Builder band(@Nullable String band) {

            this.band = band;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder deviceSerial(@Nullable String deviceSerial) {

            this.deviceSerial = deviceSerial;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWirelessChannelUtilizationHistoryResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetWirelessChannelUtilizationHistoryItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetWirelessChannelUtilizationHistoryResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetWirelessChannelUtilizationHistoryItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetWirelessChannelUtilizationHistoryResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder resolution(@Nullable Integer resolution) {

            this.resolution = resolution;
            return this;
        }
        @CustomType.Setter
        public Builder t0(@Nullable String t0) {

            this.t0 = t0;
            return this;
        }
        @CustomType.Setter
        public Builder t1(@Nullable String t1) {

            this.t1 = t1;
            return this;
        }
        @CustomType.Setter
        public Builder timespan(@Nullable Double timespan) {

            this.timespan = timespan;
            return this;
        }
        public GetWirelessChannelUtilizationHistoryResult build() {
            final var _resultValue = new GetWirelessChannelUtilizationHistoryResult();
            _resultValue.apTag = apTag;
            _resultValue.autoResolution = autoResolution;
            _resultValue.band = band;
            _resultValue.clientId = clientId;
            _resultValue.deviceSerial = deviceSerial;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.networkId = networkId;
            _resultValue.resolution = resolution;
            _resultValue.t0 = t0;
            _resultValue.t1 = t1;
            _resultValue.timespan = timespan;
            return _resultValue;
        }
    }
}
