// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetLiveToolsPingDeviceItemCallback;
import com.pulumi.meraki.devices.outputs.GetLiveToolsPingDeviceItemRequest;
import com.pulumi.meraki.devices.outputs.GetLiveToolsPingDeviceItemResults;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLiveToolsPingDeviceItem {
    /**
     * @return Information for callback used to send back results
     * 
     */
    private GetLiveToolsPingDeviceItemCallback callback;
    /**
     * @return Id to check the status of your ping request.
     * 
     */
    private String pingId;
    /**
     * @return Ping request parameters
     * 
     */
    private GetLiveToolsPingDeviceItemRequest request;
    /**
     * @return Results of the ping request.
     * 
     */
    private GetLiveToolsPingDeviceItemResults results;
    /**
     * @return Status of the ping request.
     * 
     */
    private String status;
    /**
     * @return GET this url to check the status of your ping request.
     * 
     */
    private String url;

    private GetLiveToolsPingDeviceItem() {}
    /**
     * @return Information for callback used to send back results
     * 
     */
    public GetLiveToolsPingDeviceItemCallback callback() {
        return this.callback;
    }
    /**
     * @return Id to check the status of your ping request.
     * 
     */
    public String pingId() {
        return this.pingId;
    }
    /**
     * @return Ping request parameters
     * 
     */
    public GetLiveToolsPingDeviceItemRequest request() {
        return this.request;
    }
    /**
     * @return Results of the ping request.
     * 
     */
    public GetLiveToolsPingDeviceItemResults results() {
        return this.results;
    }
    /**
     * @return Status of the ping request.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return GET this url to check the status of your ping request.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveToolsPingDeviceItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetLiveToolsPingDeviceItemCallback callback;
        private String pingId;
        private GetLiveToolsPingDeviceItemRequest request;
        private GetLiveToolsPingDeviceItemResults results;
        private String status;
        private String url;
        public Builder() {}
        public Builder(GetLiveToolsPingDeviceItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callback = defaults.callback;
    	      this.pingId = defaults.pingId;
    	      this.request = defaults.request;
    	      this.results = defaults.results;
    	      this.status = defaults.status;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder callback(GetLiveToolsPingDeviceItemCallback callback) {
            if (callback == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItem", "callback");
            }
            this.callback = callback;
            return this;
        }
        @CustomType.Setter
        public Builder pingId(String pingId) {
            if (pingId == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItem", "pingId");
            }
            this.pingId = pingId;
            return this;
        }
        @CustomType.Setter
        public Builder request(GetLiveToolsPingDeviceItemRequest request) {
            if (request == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItem", "request");
            }
            this.request = request;
            return this;
        }
        @CustomType.Setter
        public Builder results(GetLiveToolsPingDeviceItemResults results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItem", "results");
            }
            this.results = results;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItem", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItem", "url");
            }
            this.url = url;
            return this;
        }
        public GetLiveToolsPingDeviceItem build() {
            final var _resultValue = new GetLiveToolsPingDeviceItem();
            _resultValue.callback = callback;
            _resultValue.pingId = pingId;
            _resultValue.request = request;
            _resultValue.results = results;
            _resultValue.status = status;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}