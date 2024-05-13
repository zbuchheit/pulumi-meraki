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


public final class GetApiRequestsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiRequestsArgs Empty = new GetApiRequestsArgs();

    /**
     * adminId query parameter. Filter the results by the ID of the admin who made the API requests
     * 
     */
    @Import(name="adminId")
    private @Nullable Output<String> adminId;

    /**
     * @return adminId query parameter. Filter the results by the ID of the admin who made the API requests
     * 
     */
    public Optional<Output<String>> adminId() {
        return Optional.ofNullable(this.adminId);
    }

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
     * method query parameter. Filter the results by the method of the API requests (must be &#39;GET&#39;, &#39;PUT&#39;, &#39;POST&#39; or &#39;DELETE&#39;)
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return method query parameter. Filter the results by the method of the API requests (must be &#39;GET&#39;, &#39;PUT&#39;, &#39;POST&#39; or &#39;DELETE&#39;)
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * operationIds query parameter. Filter the results by one or more operation IDs for the API request
     * 
     */
    @Import(name="operationIds")
    private @Nullable Output<List<String>> operationIds;

    /**
     * @return operationIds query parameter. Filter the results by one or more operation IDs for the API request
     * 
     */
    public Optional<Output<List<String>>> operationIds() {
        return Optional.ofNullable(this.operationIds);
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
     * path query parameter. Filter the results by the path of the API requests
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return path query parameter. Filter the results by the path of the API requests
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     * 
     */
    @Import(name="perPage")
    private @Nullable Output<Integer> perPage;

    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     * 
     */
    public Optional<Output<Integer>> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * responseCode query parameter. Filter the results by the response code of the API requests
     * 
     */
    @Import(name="responseCode")
    private @Nullable Output<Integer> responseCode;

    /**
     * @return responseCode query parameter. Filter the results by the response code of the API requests
     * 
     */
    public Optional<Output<Integer>> responseCode() {
        return Optional.ofNullable(this.responseCode);
    }

    /**
     * sourceIp query parameter. Filter the results by the IP address of the originating API request
     * 
     */
    @Import(name="sourceIp")
    private @Nullable Output<String> sourceIp;

    /**
     * @return sourceIp query parameter. Filter the results by the IP address of the originating API request
     * 
     */
    public Optional<Output<String>> sourceIp() {
        return Optional.ofNullable(this.sourceIp);
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
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     * 
     */
    @Import(name="t0")
    private @Nullable Output<String> t0;

    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     * 
     */
    public Optional<Output<String>> t0() {
        return Optional.ofNullable(this.t0);
    }

    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    @Import(name="t1")
    private @Nullable Output<String> t1;

    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    public Optional<Output<String>> t1() {
        return Optional.ofNullable(this.t1);
    }

    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days.
     * 
     */
    @Import(name="timespan")
    private @Nullable Output<Double> timespan;

    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days.
     * 
     */
    public Optional<Output<Double>> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    /**
     * userAgent query parameter. Filter the results by the user agent string of the API request
     * 
     */
    @Import(name="userAgent")
    private @Nullable Output<String> userAgent;

    /**
     * @return userAgent query parameter. Filter the results by the user agent string of the API request
     * 
     */
    public Optional<Output<String>> userAgent() {
        return Optional.ofNullable(this.userAgent);
    }

    /**
     * version query parameter. Filter the results by the API version of the API request
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return version query parameter. Filter the results by the API version of the API request
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private GetApiRequestsArgs() {}

    private GetApiRequestsArgs(GetApiRequestsArgs $) {
        this.adminId = $.adminId;
        this.endingBefore = $.endingBefore;
        this.method = $.method;
        this.operationIds = $.operationIds;
        this.organizationId = $.organizationId;
        this.path = $.path;
        this.perPage = $.perPage;
        this.responseCode = $.responseCode;
        this.sourceIp = $.sourceIp;
        this.startingAfter = $.startingAfter;
        this.t0 = $.t0;
        this.t1 = $.t1;
        this.timespan = $.timespan;
        this.userAgent = $.userAgent;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiRequestsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiRequestsArgs $;

        public Builder() {
            $ = new GetApiRequestsArgs();
        }

        public Builder(GetApiRequestsArgs defaults) {
            $ = new GetApiRequestsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminId adminId query parameter. Filter the results by the ID of the admin who made the API requests
         * 
         * @return builder
         * 
         */
        public Builder adminId(@Nullable Output<String> adminId) {
            $.adminId = adminId;
            return this;
        }

        /**
         * @param adminId adminId query parameter. Filter the results by the ID of the admin who made the API requests
         * 
         * @return builder
         * 
         */
        public Builder adminId(String adminId) {
            return adminId(Output.of(adminId));
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
         * @param method method query parameter. Filter the results by the method of the API requests (must be &#39;GET&#39;, &#39;PUT&#39;, &#39;POST&#39; or &#39;DELETE&#39;)
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method method query parameter. Filter the results by the method of the API requests (must be &#39;GET&#39;, &#39;PUT&#39;, &#39;POST&#39; or &#39;DELETE&#39;)
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param operationIds operationIds query parameter. Filter the results by one or more operation IDs for the API request
         * 
         * @return builder
         * 
         */
        public Builder operationIds(@Nullable Output<List<String>> operationIds) {
            $.operationIds = operationIds;
            return this;
        }

        /**
         * @param operationIds operationIds query parameter. Filter the results by one or more operation IDs for the API request
         * 
         * @return builder
         * 
         */
        public Builder operationIds(List<String> operationIds) {
            return operationIds(Output.of(operationIds));
        }

        /**
         * @param operationIds operationIds query parameter. Filter the results by one or more operation IDs for the API request
         * 
         * @return builder
         * 
         */
        public Builder operationIds(String... operationIds) {
            return operationIds(List.of(operationIds));
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
         * @param path path query parameter. Filter the results by the path of the API requests
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path path query parameter. Filter the results by the path of the API requests
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Output<Integer> perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
         * 
         * @return builder
         * 
         */
        public Builder perPage(Integer perPage) {
            return perPage(Output.of(perPage));
        }

        /**
         * @param responseCode responseCode query parameter. Filter the results by the response code of the API requests
         * 
         * @return builder
         * 
         */
        public Builder responseCode(@Nullable Output<Integer> responseCode) {
            $.responseCode = responseCode;
            return this;
        }

        /**
         * @param responseCode responseCode query parameter. Filter the results by the response code of the API requests
         * 
         * @return builder
         * 
         */
        public Builder responseCode(Integer responseCode) {
            return responseCode(Output.of(responseCode));
        }

        /**
         * @param sourceIp sourceIp query parameter. Filter the results by the IP address of the originating API request
         * 
         * @return builder
         * 
         */
        public Builder sourceIp(@Nullable Output<String> sourceIp) {
            $.sourceIp = sourceIp;
            return this;
        }

        /**
         * @param sourceIp sourceIp query parameter. Filter the results by the IP address of the originating API request
         * 
         * @return builder
         * 
         */
        public Builder sourceIp(String sourceIp) {
            return sourceIp(Output.of(sourceIp));
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
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(@Nullable Output<String> t0) {
            $.t0 = t0;
            return this;
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(String t0) {
            return t0(Output.of(t0));
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(@Nullable Output<String> t1) {
            $.t1 = t1;
            return this;
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(String t1) {
            return t1(Output.of(t1));
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days.
         * 
         * @return builder
         * 
         */
        public Builder timespan(@Nullable Output<Double> timespan) {
            $.timespan = timespan;
            return this;
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days.
         * 
         * @return builder
         * 
         */
        public Builder timespan(Double timespan) {
            return timespan(Output.of(timespan));
        }

        /**
         * @param userAgent userAgent query parameter. Filter the results by the user agent string of the API request
         * 
         * @return builder
         * 
         */
        public Builder userAgent(@Nullable Output<String> userAgent) {
            $.userAgent = userAgent;
            return this;
        }

        /**
         * @param userAgent userAgent query parameter. Filter the results by the user agent string of the API request
         * 
         * @return builder
         * 
         */
        public Builder userAgent(String userAgent) {
            return userAgent(Output.of(userAgent));
        }

        /**
         * @param version version query parameter. Filter the results by the API version of the API request
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version version query parameter. Filter the results by the API version of the API request
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public GetApiRequestsArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetApiRequestsArgs", "organizationId");
            }
            return $;
        }
    }

}