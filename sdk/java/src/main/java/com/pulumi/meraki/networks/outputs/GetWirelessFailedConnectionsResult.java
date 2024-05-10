// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetWirelessFailedConnectionsItem;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWirelessFailedConnectionsResult {
    /**
     * @return apTag query parameter. Filter results by AP Tag
     * 
     */
    private @Nullable String apTag;
    /**
     * @return band query parameter. Filter results by band (either &#39;2.4&#39;, &#39;5&#39; or &#39;6&#39;). Note that data prior to February 2020 will not have band information.
     * 
     */
    private @Nullable String band;
    /**
     * @return clientId query parameter. Filter by client MAC
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseWirelessGetNetworkWirelessFailedConnections
     * 
     */
    private List<GetWirelessFailedConnectionsItem> items;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;
    /**
     * @return serial query parameter. Filter by AP
     * 
     */
    private @Nullable String serial;
    /**
     * @return ssid query parameter. Filter results by SSID
     * 
     */
    private @Nullable Integer ssid;
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
     * 
     */
    private @Nullable String t0;
    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
     * 
     */
    private @Nullable String t1;
    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
     * 
     */
    private @Nullable Double timespan;
    /**
     * @return vlan query parameter. Filter results by VLAN
     * 
     */
    private @Nullable Integer vlan;

    private GetWirelessFailedConnectionsResult() {}
    /**
     * @return apTag query parameter. Filter results by AP Tag
     * 
     */
    public Optional<String> apTag() {
        return Optional.ofNullable(this.apTag);
    }
    /**
     * @return band query parameter. Filter results by band (either &#39;2.4&#39;, &#39;5&#39; or &#39;6&#39;). Note that data prior to February 2020 will not have band information.
     * 
     */
    public Optional<String> band() {
        return Optional.ofNullable(this.band);
    }
    /**
     * @return clientId query parameter. Filter by client MAC
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseWirelessGetNetworkWirelessFailedConnections
     * 
     */
    public List<GetWirelessFailedConnectionsItem> items() {
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
     * @return serial query parameter. Filter by AP
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }
    /**
     * @return ssid query parameter. Filter results by SSID
     * 
     */
    public Optional<Integer> ssid() {
        return Optional.ofNullable(this.ssid);
    }
    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
     * 
     */
    public Optional<String> t0() {
        return Optional.ofNullable(this.t0);
    }
    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
     * 
     */
    public Optional<String> t1() {
        return Optional.ofNullable(this.t1);
    }
    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
     * 
     */
    public Optional<Double> timespan() {
        return Optional.ofNullable(this.timespan);
    }
    /**
     * @return vlan query parameter. Filter results by VLAN
     * 
     */
    public Optional<Integer> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessFailedConnectionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apTag;
        private @Nullable String band;
        private @Nullable String clientId;
        private String id;
        private List<GetWirelessFailedConnectionsItem> items;
        private String networkId;
        private @Nullable String serial;
        private @Nullable Integer ssid;
        private @Nullable String t0;
        private @Nullable String t1;
        private @Nullable Double timespan;
        private @Nullable Integer vlan;
        public Builder() {}
        public Builder(GetWirelessFailedConnectionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apTag = defaults.apTag;
    	      this.band = defaults.band;
    	      this.clientId = defaults.clientId;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.networkId = defaults.networkId;
    	      this.serial = defaults.serial;
    	      this.ssid = defaults.ssid;
    	      this.t0 = defaults.t0;
    	      this.t1 = defaults.t1;
    	      this.timespan = defaults.timespan;
    	      this.vlan = defaults.vlan;
        }

        @CustomType.Setter
        public Builder apTag(@Nullable String apTag) {

            this.apTag = apTag;
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
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWirelessFailedConnectionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetWirelessFailedConnectionsItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetWirelessFailedConnectionsResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetWirelessFailedConnectionsItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetWirelessFailedConnectionsResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder serial(@Nullable String serial) {

            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder ssid(@Nullable Integer ssid) {

            this.ssid = ssid;
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
        @CustomType.Setter
        public Builder vlan(@Nullable Integer vlan) {

            this.vlan = vlan;
            return this;
        }
        public GetWirelessFailedConnectionsResult build() {
            final var _resultValue = new GetWirelessFailedConnectionsResult();
            _resultValue.apTag = apTag;
            _resultValue.band = band;
            _resultValue.clientId = clientId;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.networkId = networkId;
            _resultValue.serial = serial;
            _resultValue.ssid = ssid;
            _resultValue.t0 = t0;
            _resultValue.t1 = t1;
            _resultValue.timespan = timespan;
            _resultValue.vlan = vlan;
            return _resultValue;
        }
    }
}
