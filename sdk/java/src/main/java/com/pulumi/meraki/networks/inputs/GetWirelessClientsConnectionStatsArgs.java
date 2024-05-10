// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWirelessClientsConnectionStatsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWirelessClientsConnectionStatsArgs Empty = new GetWirelessClientsConnectionStatsArgs();

    /**
     * apTag query parameter. Filter results by AP Tag
     * 
     */
    @Import(name="apTag")
    private @Nullable Output<String> apTag;

    /**
     * @return apTag query parameter. Filter results by AP Tag
     * 
     */
    public Optional<Output<String>> apTag() {
        return Optional.ofNullable(this.apTag);
    }

    /**
     * band query parameter. Filter results by band (either &#39;2.4&#39;, &#39;5&#39; or &#39;6&#39;). Note that data prior to February 2020 will not have band information.
     * 
     */
    @Import(name="band")
    private @Nullable Output<String> band;

    /**
     * @return band query parameter. Filter results by band (either &#39;2.4&#39;, &#39;5&#39; or &#39;6&#39;). Note that data prior to February 2020 will not have band information.
     * 
     */
    public Optional<Output<String>> band() {
        return Optional.ofNullable(this.band);
    }

    /**
     * clientId path parameter. Client ID
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return clientId path parameter. Client ID
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    /**
     * ssid query parameter. Filter results by SSID
     * 
     */
    @Import(name="ssid")
    private @Nullable Output<Integer> ssid;

    /**
     * @return ssid query parameter. Filter results by SSID
     * 
     */
    public Optional<Output<Integer>> ssid() {
        return Optional.ofNullable(this.ssid);
    }

    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
     * 
     */
    @Import(name="t0")
    private @Nullable Output<String> t0;

    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
     * 
     */
    public Optional<Output<String>> t0() {
        return Optional.ofNullable(this.t0);
    }

    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
     * 
     */
    @Import(name="t1")
    private @Nullable Output<String> t1;

    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
     * 
     */
    public Optional<Output<String>> t1() {
        return Optional.ofNullable(this.t1);
    }

    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
     * 
     */
    @Import(name="timespan")
    private @Nullable Output<Double> timespan;

    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
     * 
     */
    public Optional<Output<Double>> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    /**
     * vlan query parameter. Filter results by VLAN
     * 
     */
    @Import(name="vlan")
    private @Nullable Output<Integer> vlan;

    /**
     * @return vlan query parameter. Filter results by VLAN
     * 
     */
    public Optional<Output<Integer>> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    private GetWirelessClientsConnectionStatsArgs() {}

    private GetWirelessClientsConnectionStatsArgs(GetWirelessClientsConnectionStatsArgs $) {
        this.apTag = $.apTag;
        this.band = $.band;
        this.clientId = $.clientId;
        this.networkId = $.networkId;
        this.ssid = $.ssid;
        this.t0 = $.t0;
        this.t1 = $.t1;
        this.timespan = $.timespan;
        this.vlan = $.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWirelessClientsConnectionStatsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWirelessClientsConnectionStatsArgs $;

        public Builder() {
            $ = new GetWirelessClientsConnectionStatsArgs();
        }

        public Builder(GetWirelessClientsConnectionStatsArgs defaults) {
            $ = new GetWirelessClientsConnectionStatsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apTag apTag query parameter. Filter results by AP Tag
         * 
         * @return builder
         * 
         */
        public Builder apTag(@Nullable Output<String> apTag) {
            $.apTag = apTag;
            return this;
        }

        /**
         * @param apTag apTag query parameter. Filter results by AP Tag
         * 
         * @return builder
         * 
         */
        public Builder apTag(String apTag) {
            return apTag(Output.of(apTag));
        }

        /**
         * @param band band query parameter. Filter results by band (either &#39;2.4&#39;, &#39;5&#39; or &#39;6&#39;). Note that data prior to February 2020 will not have band information.
         * 
         * @return builder
         * 
         */
        public Builder band(@Nullable Output<String> band) {
            $.band = band;
            return this;
        }

        /**
         * @param band band query parameter. Filter results by band (either &#39;2.4&#39;, &#39;5&#39; or &#39;6&#39;). Note that data prior to February 2020 will not have band information.
         * 
         * @return builder
         * 
         */
        public Builder band(String band) {
            return band(Output.of(band));
        }

        /**
         * @param clientId clientId path parameter. Client ID
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId clientId path parameter. Client ID
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param ssid ssid query parameter. Filter results by SSID
         * 
         * @return builder
         * 
         */
        public Builder ssid(@Nullable Output<Integer> ssid) {
            $.ssid = ssid;
            return this;
        }

        /**
         * @param ssid ssid query parameter. Filter results by SSID
         * 
         * @return builder
         * 
         */
        public Builder ssid(Integer ssid) {
            return ssid(Output.of(ssid));
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(@Nullable Output<String> t0) {
            $.t0 = t0;
            return this;
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(String t0) {
            return t0(Output.of(t0));
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(@Nullable Output<String> t1) {
            $.t1 = t1;
            return this;
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(String t1) {
            return t1(Output.of(t1));
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
         * 
         * @return builder
         * 
         */
        public Builder timespan(@Nullable Output<Double> timespan) {
            $.timespan = timespan;
            return this;
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
         * 
         * @return builder
         * 
         */
        public Builder timespan(Double timespan) {
            return timespan(Output.of(timespan));
        }

        /**
         * @param vlan vlan query parameter. Filter results by VLAN
         * 
         * @return builder
         * 
         */
        public Builder vlan(@Nullable Output<Integer> vlan) {
            $.vlan = vlan;
            return this;
        }

        /**
         * @param vlan vlan query parameter. Filter results by VLAN
         * 
         * @return builder
         * 
         */
        public Builder vlan(Integer vlan) {
            return vlan(Output.of(vlan));
        }

        public GetWirelessClientsConnectionStatsArgs build() {
            if ($.clientId == null) {
                throw new MissingRequiredPropertyException("GetWirelessClientsConnectionStatsArgs", "clientId");
            }
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetWirelessClientsConnectionStatsArgs", "networkId");
            }
            return $;
        }
    }

}
