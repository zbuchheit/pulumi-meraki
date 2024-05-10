// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetLiveToolsThroughputTestItemRequest;
import com.pulumi.meraki.devices.outputs.GetLiveToolsThroughputTestItemResult;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLiveToolsThroughputTestItem {
    /**
     * @return Description of the error.
     * 
     */
    private String error;
    /**
     * @return The parameters of the throughput test request
     * 
     */
    private GetLiveToolsThroughputTestItemRequest request;
    /**
     * @return Result of the throughput test request
     * 
     */
    private GetLiveToolsThroughputTestItemResult result;
    /**
     * @return Status of the throughput test request
     * 
     */
    private String status;
    /**
     * @return ID of throughput test job
     * 
     */
    private String throughputTestId;
    /**
     * @return GET this url to check the status of your throughput test request
     * 
     */
    private String url;

    private GetLiveToolsThroughputTestItem() {}
    /**
     * @return Description of the error.
     * 
     */
    public String error() {
        return this.error;
    }
    /**
     * @return The parameters of the throughput test request
     * 
     */
    public GetLiveToolsThroughputTestItemRequest request() {
        return this.request;
    }
    /**
     * @return Result of the throughput test request
     * 
     */
    public GetLiveToolsThroughputTestItemResult result() {
        return this.result;
    }
    /**
     * @return Status of the throughput test request
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return ID of throughput test job
     * 
     */
    public String throughputTestId() {
        return this.throughputTestId;
    }
    /**
     * @return GET this url to check the status of your throughput test request
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveToolsThroughputTestItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String error;
        private GetLiveToolsThroughputTestItemRequest request;
        private GetLiveToolsThroughputTestItemResult result;
        private String status;
        private String throughputTestId;
        private String url;
        public Builder() {}
        public Builder(GetLiveToolsThroughputTestItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.request = defaults.request;
    	      this.result = defaults.result;
    	      this.status = defaults.status;
    	      this.throughputTestId = defaults.throughputTestId;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder error(String error) {
            if (error == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsThroughputTestItem", "error");
            }
            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder request(GetLiveToolsThroughputTestItemRequest request) {
            if (request == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsThroughputTestItem", "request");
            }
            this.request = request;
            return this;
        }
        @CustomType.Setter
        public Builder result(GetLiveToolsThroughputTestItemResult result) {
            if (result == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsThroughputTestItem", "result");
            }
            this.result = result;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsThroughputTestItem", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder throughputTestId(String throughputTestId) {
            if (throughputTestId == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsThroughputTestItem", "throughputTestId");
            }
            this.throughputTestId = throughputTestId;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsThroughputTestItem", "url");
            }
            this.url = url;
            return this;
        }
        public GetLiveToolsThroughputTestItem build() {
            final var _resultValue = new GetLiveToolsThroughputTestItem();
            _resultValue.error = error;
            _resultValue.request = request;
            _resultValue.result = result;
            _resultValue.status = status;
            _resultValue.throughputTestId = throughputTestId;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
