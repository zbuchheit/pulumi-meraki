// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWirelessDevicesChannelUtilizationByNetworkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWirelessDevicesChannelUtilizationByNetworkArgs Empty = new GetWirelessDevicesChannelUtilizationByNetworkArgs();

    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="endingBefore")
    private @Nullable Output<String> endingBefore;

    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<Output<String>> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }

    /**
     * interval query parameter. The time interval in seconds for returned data. The valid intervals are: 300, 600, 3600, 7200, 14400, 21600. The default is 3600.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return interval query parameter. The time interval in seconds for returned data. The valid intervals are: 300, 600, 3600, 7200, 14400, 21600. The default is 3600.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * networkIds query parameter. Filter results by network.
     * 
     */
    @Import(name="networkIds")
    private @Nullable Output<List<String>> networkIds;

    /**
     * @return networkIds query parameter. Filter results by network.
     * 
     */
    public Optional<Output<List<String>>> networkIds() {
        return Optional.ofNullable(this.networkIds);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    @Import(name="perPage")
    private @Nullable Output<Integer> perPage;

    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    public Optional<Output<Integer>> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * serials query parameter. Filter results by device.
     * 
     */
    @Import(name="serials")
    private @Nullable Output<List<String>> serials;

    /**
     * @return serials query parameter. Filter results by device.
     * 
     */
    public Optional<Output<List<String>>> serials() {
        return Optional.ofNullable(this.serials);
    }

    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="startingAfter")
    private @Nullable Output<String> startingAfter;

    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<Output<String>> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }

    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
     * 
     */
    @Import(name="t0")
    private @Nullable Output<String> t0;

    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
     * 
     */
    public Optional<Output<String>> t0() {
        return Optional.ofNullable(this.t0);
    }

    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
     * 
     */
    @Import(name="t1")
    private @Nullable Output<String> t1;

    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
     * 
     */
    public Optional<Output<String>> t1() {
        return Optional.ofNullable(this.t1);
    }

    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 90 days. The default is 7 days.
     * 
     */
    @Import(name="timespan")
    private @Nullable Output<Double> timespan;

    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 90 days. The default is 7 days.
     * 
     */
    public Optional<Output<Double>> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    private GetWirelessDevicesChannelUtilizationByNetworkArgs() {}

    private GetWirelessDevicesChannelUtilizationByNetworkArgs(GetWirelessDevicesChannelUtilizationByNetworkArgs $) {
        this.endingBefore = $.endingBefore;
        this.interval = $.interval;
        this.networkIds = $.networkIds;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.serials = $.serials;
        this.startingAfter = $.startingAfter;
        this.t0 = $.t0;
        this.t1 = $.t1;
        this.timespan = $.timespan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWirelessDevicesChannelUtilizationByNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWirelessDevicesChannelUtilizationByNetworkArgs $;

        public Builder() {
            $ = new GetWirelessDevicesChannelUtilizationByNetworkArgs();
        }

        public Builder(GetWirelessDevicesChannelUtilizationByNetworkArgs defaults) {
            $ = new GetWirelessDevicesChannelUtilizationByNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endingBefore endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder endingBefore(@Nullable Output<String> endingBefore) {
            $.endingBefore = endingBefore;
            return this;
        }

        /**
         * @param endingBefore endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder endingBefore(String endingBefore) {
            return endingBefore(Output.of(endingBefore));
        }

        /**
         * @param interval interval query parameter. The time interval in seconds for returned data. The valid intervals are: 300, 600, 3600, 7200, 14400, 21600. The default is 3600.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval interval query parameter. The time interval in seconds for returned data. The valid intervals are: 300, 600, 3600, 7200, 14400, 21600. The default is 3600.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param networkIds networkIds query parameter. Filter results by network.
         * 
         * @return builder
         * 
         */
        public Builder networkIds(@Nullable Output<List<String>> networkIds) {
            $.networkIds = networkIds;
            return this;
        }

        /**
         * @param networkIds networkIds query parameter. Filter results by network.
         * 
         * @return builder
         * 
         */
        public Builder networkIds(List<String> networkIds) {
            return networkIds(Output.of(networkIds));
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
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Output<Integer> perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(Integer perPage) {
            return perPage(Output.of(perPage));
        }

        /**
         * @param serials serials query parameter. Filter results by device.
         * 
         * @return builder
         * 
         */
        public Builder serials(@Nullable Output<List<String>> serials) {
            $.serials = serials;
            return this;
        }

        /**
         * @param serials serials query parameter. Filter results by device.
         * 
         * @return builder
         * 
         */
        public Builder serials(List<String> serials) {
            return serials(Output.of(serials));
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
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(@Nullable Output<String> startingAfter) {
            $.startingAfter = startingAfter;
            return this;
        }

        /**
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(String startingAfter) {
            return startingAfter(Output.of(startingAfter));
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(@Nullable Output<String> t0) {
            $.t0 = t0;
            return this;
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(String t0) {
            return t0(Output.of(t0));
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(@Nullable Output<String> t1) {
            $.t1 = t1;
            return this;
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(String t1) {
            return t1(Output.of(t1));
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 90 days. The default is 7 days.
         * 
         * @return builder
         * 
         */
        public Builder timespan(@Nullable Output<Double> timespan) {
            $.timespan = timespan;
            return this;
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 90 days. The default is 7 days.
         * 
         * @return builder
         * 
         */
        public Builder timespan(Double timespan) {
            return timespan(Output.of(timespan));
        }

        public GetWirelessDevicesChannelUtilizationByNetworkArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationByNetworkArgs", "organizationId");
            }
            return $;
        }
    }

}
