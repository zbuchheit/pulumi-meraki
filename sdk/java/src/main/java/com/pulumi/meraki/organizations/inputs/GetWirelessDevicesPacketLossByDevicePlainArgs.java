// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWirelessDevicesPacketLossByDevicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWirelessDevicesPacketLossByDevicePlainArgs Empty = new GetWirelessDevicesPacketLossByDevicePlainArgs();

    /**
     * bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
     * 
     */
    @Import(name="bands")
    private @Nullable List<String> bands;

    /**
     * @return bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
     * 
     */
    public Optional<List<String>> bands() {
        return Optional.ofNullable(this.bands);
    }

    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="endingBefore")
    private @Nullable String endingBefore;

    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }

    /**
     * networkIds query parameter. Filter results by network.
     * 
     */
    @Import(name="networkIds")
    private @Nullable List<String> networkIds;

    /**
     * @return networkIds query parameter. Filter results by network.
     * 
     */
    public Optional<List<String>> networkIds() {
        return Optional.ofNullable(this.networkIds);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    @Import(name="perPage")
    private @Nullable Integer perPage;

    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * serials query parameter. Filter results by device.
     * 
     */
    @Import(name="serials")
    private @Nullable List<String> serials;

    /**
     * @return serials query parameter. Filter results by device.
     * 
     */
    public Optional<List<String>> serials() {
        return Optional.ofNullable(this.serials);
    }

    /**
     * ssids query parameter. Filter results by SSID number.
     * 
     */
    @Import(name="ssids")
    private @Nullable List<String> ssids;

    /**
     * @return ssids query parameter. Filter results by SSID number.
     * 
     */
    public Optional<List<String>> ssids() {
        return Optional.ofNullable(this.ssids);
    }

    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="startingAfter")
    private @Nullable String startingAfter;

    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }

    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
     * 
     */
    @Import(name="t0")
    private @Nullable String t0;

    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
     * 
     */
    public Optional<String> t0() {
        return Optional.ofNullable(this.t0);
    }

    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
     * 
     */
    @Import(name="t1")
    private @Nullable String t1;

    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
     * 
     */
    public Optional<String> t1() {
        return Optional.ofNullable(this.t1);
    }

    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
     * 
     */
    @Import(name="timespan")
    private @Nullable Double timespan;

    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
     * 
     */
    public Optional<Double> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    private GetWirelessDevicesPacketLossByDevicePlainArgs() {}

    private GetWirelessDevicesPacketLossByDevicePlainArgs(GetWirelessDevicesPacketLossByDevicePlainArgs $) {
        this.bands = $.bands;
        this.endingBefore = $.endingBefore;
        this.networkIds = $.networkIds;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.serials = $.serials;
        this.ssids = $.ssids;
        this.startingAfter = $.startingAfter;
        this.t0 = $.t0;
        this.t1 = $.t1;
        this.timespan = $.timespan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWirelessDevicesPacketLossByDevicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWirelessDevicesPacketLossByDevicePlainArgs $;

        public Builder() {
            $ = new GetWirelessDevicesPacketLossByDevicePlainArgs();
        }

        public Builder(GetWirelessDevicesPacketLossByDevicePlainArgs defaults) {
            $ = new GetWirelessDevicesPacketLossByDevicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bands bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
         * 
         * @return builder
         * 
         */
        public Builder bands(@Nullable List<String> bands) {
            $.bands = bands;
            return this;
        }

        /**
         * @param bands bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
         * 
         * @return builder
         * 
         */
        public Builder bands(String... bands) {
            return bands(List.of(bands));
        }

        /**
         * @param endingBefore endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder endingBefore(@Nullable String endingBefore) {
            $.endingBefore = endingBefore;
            return this;
        }

        /**
         * @param networkIds networkIds query parameter. Filter results by network.
         * 
         * @return builder
         * 
         */
        public Builder networkIds(@Nullable List<String> networkIds) {
            $.networkIds = networkIds;
            return this;
        }

        /**
         * @param networkIds networkIds query parameter. Filter results by network.
         * 
         * @return builder
         * 
         */
        public Builder networkIds(String... networkIds) {
            return networkIds(List.of(networkIds));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Integer perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param serials serials query parameter. Filter results by device.
         * 
         * @return builder
         * 
         */
        public Builder serials(@Nullable List<String> serials) {
            $.serials = serials;
            return this;
        }

        /**
         * @param serials serials query parameter. Filter results by device.
         * 
         * @return builder
         * 
         */
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }

        /**
         * @param ssids ssids query parameter. Filter results by SSID number.
         * 
         * @return builder
         * 
         */
        public Builder ssids(@Nullable List<String> ssids) {
            $.ssids = ssids;
            return this;
        }

        /**
         * @param ssids ssids query parameter. Filter results by SSID number.
         * 
         * @return builder
         * 
         */
        public Builder ssids(String... ssids) {
            return ssids(List.of(ssids));
        }

        /**
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(@Nullable String startingAfter) {
            $.startingAfter = startingAfter;
            return this;
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(@Nullable String t0) {
            $.t0 = t0;
            return this;
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(@Nullable String t1) {
            $.t1 = t1;
            return this;
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
         * 
         * @return builder
         * 
         */
        public Builder timespan(@Nullable Double timespan) {
            $.timespan = timespan;
            return this;
        }

        public GetWirelessDevicesPacketLossByDevicePlainArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetWirelessDevicesPacketLossByDevicePlainArgs", "organizationId");
            }
            return $;
        }
    }

}
