// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.devices.inputs.LiveToolsThroughputTestCallbackArgs;
import com.pulumi.meraki.devices.inputs.LiveToolsThroughputTestRequestArgs;
import com.pulumi.meraki.devices.inputs.LiveToolsThroughputTestResultArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveToolsThroughputTestState extends com.pulumi.resources.ResourceArgs {

    public static final LiveToolsThroughputTestState Empty = new LiveToolsThroughputTestState();

    /**
     * Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    @Import(name="callback")
    private @Nullable Output<LiveToolsThroughputTestCallbackArgs> callback;

    /**
     * @return Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    public Optional<Output<LiveToolsThroughputTestCallbackArgs>> callback() {
        return Optional.ofNullable(this.callback);
    }

    /**
     * Description of the error.
     * 
     */
    @Import(name="error")
    private @Nullable Output<String> error;

    /**
     * @return Description of the error.
     * 
     */
    public Optional<Output<String>> error() {
        return Optional.ofNullable(this.error);
    }

    /**
     * The parameters of the throughput test request
     * 
     */
    @Import(name="request")
    private @Nullable Output<LiveToolsThroughputTestRequestArgs> request;

    /**
     * @return The parameters of the throughput test request
     * 
     */
    public Optional<Output<LiveToolsThroughputTestRequestArgs>> request() {
        return Optional.ofNullable(this.request);
    }

    /**
     * Result of the throughput test request
     * 
     */
    @Import(name="result")
    private @Nullable Output<LiveToolsThroughputTestResultArgs> result;

    /**
     * @return Result of the throughput test request
     * 
     */
    public Optional<Output<LiveToolsThroughputTestResultArgs>> result() {
        return Optional.ofNullable(this.result);
    }

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * Status of the throughput test request
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the throughput test request
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * ID of throughput test job
     * 
     */
    @Import(name="throughputTestId")
    private @Nullable Output<String> throughputTestId;

    /**
     * @return ID of throughput test job
     * 
     */
    public Optional<Output<String>> throughputTestId() {
        return Optional.ofNullable(this.throughputTestId);
    }

    /**
     * GET this url to check the status of your throughput test request
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return GET this url to check the status of your throughput test request
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private LiveToolsThroughputTestState() {}

    private LiveToolsThroughputTestState(LiveToolsThroughputTestState $) {
        this.callback = $.callback;
        this.error = $.error;
        this.request = $.request;
        this.result = $.result;
        this.serial = $.serial;
        this.status = $.status;
        this.throughputTestId = $.throughputTestId;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveToolsThroughputTestState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveToolsThroughputTestState $;

        public Builder() {
            $ = new LiveToolsThroughputTestState();
        }

        public Builder(LiveToolsThroughputTestState defaults) {
            $ = new LiveToolsThroughputTestState(Objects.requireNonNull(defaults));
        }

        /**
         * @param callback Details for the callback. Please include either an httpServerId OR url and sharedSecret
         * 
         * @return builder
         * 
         */
        public Builder callback(@Nullable Output<LiveToolsThroughputTestCallbackArgs> callback) {
            $.callback = callback;
            return this;
        }

        /**
         * @param callback Details for the callback. Please include either an httpServerId OR url and sharedSecret
         * 
         * @return builder
         * 
         */
        public Builder callback(LiveToolsThroughputTestCallbackArgs callback) {
            return callback(Output.of(callback));
        }

        /**
         * @param error Description of the error.
         * 
         * @return builder
         * 
         */
        public Builder error(@Nullable Output<String> error) {
            $.error = error;
            return this;
        }

        /**
         * @param error Description of the error.
         * 
         * @return builder
         * 
         */
        public Builder error(String error) {
            return error(Output.of(error));
        }

        /**
         * @param request The parameters of the throughput test request
         * 
         * @return builder
         * 
         */
        public Builder request(@Nullable Output<LiveToolsThroughputTestRequestArgs> request) {
            $.request = request;
            return this;
        }

        /**
         * @param request The parameters of the throughput test request
         * 
         * @return builder
         * 
         */
        public Builder request(LiveToolsThroughputTestRequestArgs request) {
            return request(Output.of(request));
        }

        /**
         * @param result Result of the throughput test request
         * 
         * @return builder
         * 
         */
        public Builder result(@Nullable Output<LiveToolsThroughputTestResultArgs> result) {
            $.result = result;
            return this;
        }

        /**
         * @param result Result of the throughput test request
         * 
         * @return builder
         * 
         */
        public Builder result(LiveToolsThroughputTestResultArgs result) {
            return result(Output.of(result));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        /**
         * @param status Status of the throughput test request
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the throughput test request
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param throughputTestId ID of throughput test job
         * 
         * @return builder
         * 
         */
        public Builder throughputTestId(@Nullable Output<String> throughputTestId) {
            $.throughputTestId = throughputTestId;
            return this;
        }

        /**
         * @param throughputTestId ID of throughput test job
         * 
         * @return builder
         * 
         */
        public Builder throughputTestId(String throughputTestId) {
            return throughputTestId(Output.of(throughputTestId));
        }

        /**
         * @param url GET this url to check the status of your throughput test request
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url GET this url to check the status of your throughput test request
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public LiveToolsThroughputTestState build() {
            return $;
        }
    }

}
