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


public final class GetDevicesAvailabilitiesChangeHistoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDevicesAvailabilitiesChangeHistoryPlainArgs Empty = new GetDevicesAvailabilitiesChangeHistoryPlainArgs();

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
     * networkIds query parameter. Optional parameter to filter device availabilities history by network IDs
     * 
     */
    @Import(name="networkIds")
    private @Nullable List<String> networkIds;

    /**
     * @return networkIds query parameter. Optional parameter to filter device availabilities history by network IDs
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
     * productTypes query parameter. Optional parameter to filter device availabilities history by device product types
     * 
     */
    @Import(name="productTypes")
    private @Nullable List<String> productTypes;

    /**
     * @return productTypes query parameter. Optional parameter to filter device availabilities history by device product types
     * 
     */
    public Optional<List<String>> productTypes() {
        return Optional.ofNullable(this.productTypes);
    }

    /**
     * serials query parameter. Optional parameter to filter device availabilities history by device serial numbers
     * 
     */
    @Import(name="serials")
    private @Nullable List<String> serials;

    /**
     * @return serials query parameter. Optional parameter to filter device availabilities history by device serial numbers
     * 
     */
    public Optional<List<String>> serials() {
        return Optional.ofNullable(this.serials);
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
     * statuses query parameter. Optional parameter to filter device availabilities history by device statuses
     * 
     */
    @Import(name="statuses")
    private @Nullable List<String> statuses;

    /**
     * @return statuses query parameter. Optional parameter to filter device availabilities history by device statuses
     * 
     */
    public Optional<List<String>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     * 
     */
    @Import(name="t0")
    private @Nullable String t0;

    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     * 
     */
    public Optional<String> t0() {
        return Optional.ofNullable(this.t0);
    }

    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    @Import(name="t1")
    private @Nullable String t1;

    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    public Optional<String> t1() {
        return Optional.ofNullable(this.t1);
    }

    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     * 
     */
    @Import(name="timespan")
    private @Nullable Double timespan;

    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     * 
     */
    public Optional<Double> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    private GetDevicesAvailabilitiesChangeHistoryPlainArgs() {}

    private GetDevicesAvailabilitiesChangeHistoryPlainArgs(GetDevicesAvailabilitiesChangeHistoryPlainArgs $) {
        this.endingBefore = $.endingBefore;
        this.networkIds = $.networkIds;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.productTypes = $.productTypes;
        this.serials = $.serials;
        this.startingAfter = $.startingAfter;
        this.statuses = $.statuses;
        this.t0 = $.t0;
        this.t1 = $.t1;
        this.timespan = $.timespan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDevicesAvailabilitiesChangeHistoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDevicesAvailabilitiesChangeHistoryPlainArgs $;

        public Builder() {
            $ = new GetDevicesAvailabilitiesChangeHistoryPlainArgs();
        }

        public Builder(GetDevicesAvailabilitiesChangeHistoryPlainArgs defaults) {
            $ = new GetDevicesAvailabilitiesChangeHistoryPlainArgs(Objects.requireNonNull(defaults));
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
         * @param networkIds networkIds query parameter. Optional parameter to filter device availabilities history by network IDs
         * 
         * @return builder
         * 
         */
        public Builder networkIds(@Nullable List<String> networkIds) {
            $.networkIds = networkIds;
            return this;
        }

        /**
         * @param networkIds networkIds query parameter. Optional parameter to filter device availabilities history by network IDs
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
         * @param productTypes productTypes query parameter. Optional parameter to filter device availabilities history by device product types
         * 
         * @return builder
         * 
         */
        public Builder productTypes(@Nullable List<String> productTypes) {
            $.productTypes = productTypes;
            return this;
        }

        /**
         * @param productTypes productTypes query parameter. Optional parameter to filter device availabilities history by device product types
         * 
         * @return builder
         * 
         */
        public Builder productTypes(String... productTypes) {
            return productTypes(List.of(productTypes));
        }

        /**
         * @param serials serials query parameter. Optional parameter to filter device availabilities history by device serial numbers
         * 
         * @return builder
         * 
         */
        public Builder serials(@Nullable List<String> serials) {
            $.serials = serials;
            return this;
        }

        /**
         * @param serials serials query parameter. Optional parameter to filter device availabilities history by device serial numbers
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
        public Builder startingAfter(@Nullable String startingAfter) {
            $.startingAfter = startingAfter;
            return this;
        }

        /**
         * @param statuses statuses query parameter. Optional parameter to filter device availabilities history by device statuses
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable List<String> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses statuses query parameter. Optional parameter to filter device availabilities history by device statuses
         * 
         * @return builder
         * 
         */
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(@Nullable String t0) {
            $.t0 = t0;
            return this;
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(@Nullable String t1) {
            $.t1 = t1;
            return this;
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
         * 
         * @return builder
         * 
         */
        public Builder timespan(@Nullable Double timespan) {
            $.timespan = timespan;
            return this;
        }

        public GetDevicesAvailabilitiesChangeHistoryPlainArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesChangeHistoryPlainArgs", "organizationId");
            }
            return $;
        }
    }

}
