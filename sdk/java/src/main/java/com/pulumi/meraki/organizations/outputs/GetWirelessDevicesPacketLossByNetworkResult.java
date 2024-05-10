// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesPacketLossByNetworkItem;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWirelessDevicesPacketLossByNetworkResult {
    /**
     * @return bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
     * 
     */
    private @Nullable List<String> bands;
    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String endingBefore;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseWirelessGetOrganizationWirelessDevicesPacketLossByNetwork
     * 
     */
    private List<GetWirelessDevicesPacketLossByNetworkItem> items;
    /**
     * @return networkIds query parameter. Filter results by network.
     * 
     */
    private @Nullable List<String> networkIds;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private String organizationId;
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    private @Nullable Integer perPage;
    /**
     * @return serials query parameter. Filter results by device.
     * 
     */
    private @Nullable List<String> serials;
    /**
     * @return ssids query parameter. Filter results by SSID number.
     * 
     */
    private @Nullable List<String> ssids;
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String startingAfter;
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
     * 
     */
    private @Nullable String t0;
    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
     * 
     */
    private @Nullable String t1;
    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
     * 
     */
    private @Nullable Double timespan;

    private GetWirelessDevicesPacketLossByNetworkResult() {}
    /**
     * @return bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
     * 
     */
    public List<String> bands() {
        return this.bands == null ? List.of() : this.bands;
    }
    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseWirelessGetOrganizationWirelessDevicesPacketLossByNetwork
     * 
     */
    public List<GetWirelessDevicesPacketLossByNetworkItem> items() {
        return this.items;
    }
    /**
     * @return networkIds query parameter. Filter results by network.
     * 
     */
    public List<String> networkIds() {
        return this.networkIds == null ? List.of() : this.networkIds;
    }
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }
    /**
     * @return serials query parameter. Filter results by device.
     * 
     */
    public List<String> serials() {
        return this.serials == null ? List.of() : this.serials;
    }
    /**
     * @return ssids query parameter. Filter results by SSID number.
     * 
     */
    public List<String> ssids() {
        return this.ssids == null ? List.of() : this.ssids;
    }
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
     * 
     */
    public Optional<String> t0() {
        return Optional.ofNullable(this.t0);
    }
    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
     * 
     */
    public Optional<String> t1() {
        return Optional.ofNullable(this.t1);
    }
    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
     * 
     */
    public Optional<Double> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessDevicesPacketLossByNetworkResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> bands;
        private @Nullable String endingBefore;
        private String id;
        private List<GetWirelessDevicesPacketLossByNetworkItem> items;
        private @Nullable List<String> networkIds;
        private String organizationId;
        private @Nullable Integer perPage;
        private @Nullable List<String> serials;
        private @Nullable List<String> ssids;
        private @Nullable String startingAfter;
        private @Nullable String t0;
        private @Nullable String t1;
        private @Nullable Double timespan;
        public Builder() {}
        public Builder(GetWirelessDevicesPacketLossByNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bands = defaults.bands;
    	      this.endingBefore = defaults.endingBefore;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.networkIds = defaults.networkIds;
    	      this.organizationId = defaults.organizationId;
    	      this.perPage = defaults.perPage;
    	      this.serials = defaults.serials;
    	      this.ssids = defaults.ssids;
    	      this.startingAfter = defaults.startingAfter;
    	      this.t0 = defaults.t0;
    	      this.t1 = defaults.t1;
    	      this.timespan = defaults.timespan;
        }

        @CustomType.Setter
        public Builder bands(@Nullable List<String> bands) {

            this.bands = bands;
            return this;
        }
        public Builder bands(String... bands) {
            return bands(List.of(bands));
        }
        @CustomType.Setter
        public Builder endingBefore(@Nullable String endingBefore) {

            this.endingBefore = endingBefore;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesPacketLossByNetworkResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetWirelessDevicesPacketLossByNetworkItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesPacketLossByNetworkResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetWirelessDevicesPacketLossByNetworkItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkIds(@Nullable List<String> networkIds) {

            this.networkIds = networkIds;
            return this;
        }
        public Builder networkIds(String... networkIds) {
            return networkIds(List.of(networkIds));
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesPacketLossByNetworkResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder perPage(@Nullable Integer perPage) {

            this.perPage = perPage;
            return this;
        }
        @CustomType.Setter
        public Builder serials(@Nullable List<String> serials) {

            this.serials = serials;
            return this;
        }
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }
        @CustomType.Setter
        public Builder ssids(@Nullable List<String> ssids) {

            this.ssids = ssids;
            return this;
        }
        public Builder ssids(String... ssids) {
            return ssids(List.of(ssids));
        }
        @CustomType.Setter
        public Builder startingAfter(@Nullable String startingAfter) {

            this.startingAfter = startingAfter;
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
        public GetWirelessDevicesPacketLossByNetworkResult build() {
            final var _resultValue = new GetWirelessDevicesPacketLossByNetworkResult();
            _resultValue.bands = bands;
            _resultValue.endingBefore = endingBefore;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.networkIds = networkIds;
            _resultValue.organizationId = organizationId;
            _resultValue.perPage = perPage;
            _resultValue.serials = serials;
            _resultValue.ssids = ssids;
            _resultValue.startingAfter = startingAfter;
            _resultValue.t0 = t0;
            _resultValue.t1 = t1;
            _resultValue.timespan = timespan;
            return _resultValue;
        }
    }
}
