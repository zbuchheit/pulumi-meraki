// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.devices.inputs.LiveToolsArpTableCallbackArgs;
import com.pulumi.meraki.devices.inputs.LiveToolsArpTableEntryArgs;
import com.pulumi.meraki.devices.inputs.LiveToolsArpTableRequestArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveToolsArpTableState extends com.pulumi.resources.ResourceArgs {

    public static final LiveToolsArpTableState Empty = new LiveToolsArpTableState();

    /**
     * Id of the ARP table request. Used to check the status of the request.
     * 
     */
    @Import(name="arpTableId")
    private @Nullable Output<String> arpTableId;

    /**
     * @return Id of the ARP table request. Used to check the status of the request.
     * 
     */
    public Optional<Output<String>> arpTableId() {
        return Optional.ofNullable(this.arpTableId);
    }

    /**
     * Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    @Import(name="callback")
    private @Nullable Output<LiveToolsArpTableCallbackArgs> callback;

    /**
     * @return Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    public Optional<Output<LiveToolsArpTableCallbackArgs>> callback() {
        return Optional.ofNullable(this.callback);
    }

    /**
     * The ARP table entries
     * 
     */
    @Import(name="entries")
    private @Nullable Output<List<LiveToolsArpTableEntryArgs>> entries;

    /**
     * @return The ARP table entries
     * 
     */
    public Optional<Output<List<LiveToolsArpTableEntryArgs>>> entries() {
        return Optional.ofNullable(this.entries);
    }

    /**
     * An error message for a failed execution
     * 
     */
    @Import(name="error")
    private @Nullable Output<String> error;

    /**
     * @return An error message for a failed execution
     * 
     */
    public Optional<Output<String>> error() {
        return Optional.ofNullable(this.error);
    }

    /**
     * ARP table request parameters
     * 
     */
    @Import(name="request")
    private @Nullable Output<LiveToolsArpTableRequestArgs> request;

    /**
     * @return ARP table request parameters
     * 
     */
    public Optional<Output<LiveToolsArpTableRequestArgs>> request() {
        return Optional.ofNullable(this.request);
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
     * Status of the ARP table request.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the ARP table request.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * GET this url to check the status of your ARP table request.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return GET this url to check the status of your ARP table request.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private LiveToolsArpTableState() {}

    private LiveToolsArpTableState(LiveToolsArpTableState $) {
        this.arpTableId = $.arpTableId;
        this.callback = $.callback;
        this.entries = $.entries;
        this.error = $.error;
        this.request = $.request;
        this.serial = $.serial;
        this.status = $.status;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveToolsArpTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveToolsArpTableState $;

        public Builder() {
            $ = new LiveToolsArpTableState();
        }

        public Builder(LiveToolsArpTableState defaults) {
            $ = new LiveToolsArpTableState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arpTableId Id of the ARP table request. Used to check the status of the request.
         * 
         * @return builder
         * 
         */
        public Builder arpTableId(@Nullable Output<String> arpTableId) {
            $.arpTableId = arpTableId;
            return this;
        }

        /**
         * @param arpTableId Id of the ARP table request. Used to check the status of the request.
         * 
         * @return builder
         * 
         */
        public Builder arpTableId(String arpTableId) {
            return arpTableId(Output.of(arpTableId));
        }

        /**
         * @param callback Details for the callback. Please include either an httpServerId OR url and sharedSecret
         * 
         * @return builder
         * 
         */
        public Builder callback(@Nullable Output<LiveToolsArpTableCallbackArgs> callback) {
            $.callback = callback;
            return this;
        }

        /**
         * @param callback Details for the callback. Please include either an httpServerId OR url and sharedSecret
         * 
         * @return builder
         * 
         */
        public Builder callback(LiveToolsArpTableCallbackArgs callback) {
            return callback(Output.of(callback));
        }

        /**
         * @param entries The ARP table entries
         * 
         * @return builder
         * 
         */
        public Builder entries(@Nullable Output<List<LiveToolsArpTableEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        /**
         * @param entries The ARP table entries
         * 
         * @return builder
         * 
         */
        public Builder entries(List<LiveToolsArpTableEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        /**
         * @param entries The ARP table entries
         * 
         * @return builder
         * 
         */
        public Builder entries(LiveToolsArpTableEntryArgs... entries) {
            return entries(List.of(entries));
        }

        /**
         * @param error An error message for a failed execution
         * 
         * @return builder
         * 
         */
        public Builder error(@Nullable Output<String> error) {
            $.error = error;
            return this;
        }

        /**
         * @param error An error message for a failed execution
         * 
         * @return builder
         * 
         */
        public Builder error(String error) {
            return error(Output.of(error));
        }

        /**
         * @param request ARP table request parameters
         * 
         * @return builder
         * 
         */
        public Builder request(@Nullable Output<LiveToolsArpTableRequestArgs> request) {
            $.request = request;
            return this;
        }

        /**
         * @param request ARP table request parameters
         * 
         * @return builder
         * 
         */
        public Builder request(LiveToolsArpTableRequestArgs request) {
            return request(Output.of(request));
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
         * @param status Status of the ARP table request.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the ARP table request.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param url GET this url to check the status of your ARP table request.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url GET this url to check the status of your ARP table request.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public LiveToolsArpTableState build() {
            return $;
        }
    }

}
