// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSummaryTopDevicesByUsagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSummaryTopDevicesByUsagePlainArgs Empty = new GetSummaryTopDevicesByUsagePlainArgs();

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
     * t0 query parameter. The beginning of the timespan for the data.
     * 
     */
    @Import(name="t0")
    private @Nullable String t0;

    /**
     * @return t0 query parameter. The beginning of the timespan for the data.
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
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 8 hours and be less than or equal to 31 days. The default is 1 day.
     * 
     */
    @Import(name="timespan")
    private @Nullable Double timespan;

    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 8 hours and be less than or equal to 31 days. The default is 1 day.
     * 
     */
    public Optional<Double> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    private GetSummaryTopDevicesByUsagePlainArgs() {}

    private GetSummaryTopDevicesByUsagePlainArgs(GetSummaryTopDevicesByUsagePlainArgs $) {
        this.organizationId = $.organizationId;
        this.t0 = $.t0;
        this.t1 = $.t1;
        this.timespan = $.timespan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSummaryTopDevicesByUsagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSummaryTopDevicesByUsagePlainArgs $;

        public Builder() {
            $ = new GetSummaryTopDevicesByUsagePlainArgs();
        }

        public Builder(GetSummaryTopDevicesByUsagePlainArgs defaults) {
            $ = new GetSummaryTopDevicesByUsagePlainArgs(Objects.requireNonNull(defaults));
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
         * @param t0 t0 query parameter. The beginning of the timespan for the data.
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
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 8 hours and be less than or equal to 31 days. The default is 1 day.
         * 
         * @return builder
         * 
         */
        public Builder timespan(@Nullable Double timespan) {
            $.timespan = timespan;
            return this;
        }

        public GetSummaryTopDevicesByUsagePlainArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetSummaryTopDevicesByUsagePlainArgs", "organizationId");
            }
            return $;
        }
    }

}
