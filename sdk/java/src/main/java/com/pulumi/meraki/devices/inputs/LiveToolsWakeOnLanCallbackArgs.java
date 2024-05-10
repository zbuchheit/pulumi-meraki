// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.devices.inputs.LiveToolsWakeOnLanCallbackHttpServerArgs;
import com.pulumi.meraki.devices.inputs.LiveToolsWakeOnLanCallbackPayloadTemplateArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveToolsWakeOnLanCallbackArgs extends com.pulumi.resources.ResourceArgs {

    public static final LiveToolsWakeOnLanCallbackArgs Empty = new LiveToolsWakeOnLanCallbackArgs();

    /**
     * The webhook receiver used for the callback webhook.
     * 
     */
    @Import(name="httpServer")
    private @Nullable Output<LiveToolsWakeOnLanCallbackHttpServerArgs> httpServer;

    /**
     * @return The webhook receiver used for the callback webhook.
     * 
     */
    public Optional<Output<LiveToolsWakeOnLanCallbackHttpServerArgs>> httpServer() {
        return Optional.ofNullable(this.httpServer);
    }

    /**
     * The payload template of the webhook used for the callback
     * 
     */
    @Import(name="payloadTemplate")
    private @Nullable Output<LiveToolsWakeOnLanCallbackPayloadTemplateArgs> payloadTemplate;

    /**
     * @return The payload template of the webhook used for the callback
     * 
     */
    public Optional<Output<LiveToolsWakeOnLanCallbackPayloadTemplateArgs>> payloadTemplate() {
        return Optional.ofNullable(this.payloadTemplate);
    }

    /**
     * A shared secret that will be included in the requests sent to the callback URL. It can be used to verify that the request was sent by Meraki. If using this field, please also specify an url.
     * 
     */
    @Import(name="sharedSecret")
    private @Nullable Output<String> sharedSecret;

    /**
     * @return A shared secret that will be included in the requests sent to the callback URL. It can be used to verify that the request was sent by Meraki. If using this field, please also specify an url.
     * 
     */
    public Optional<Output<String>> sharedSecret() {
        return Optional.ofNullable(this.sharedSecret);
    }

    /**
     * The callback URL for the webhook target. If using this field, please also specify a sharedSecret.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The callback URL for the webhook target. If using this field, please also specify a sharedSecret.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private LiveToolsWakeOnLanCallbackArgs() {}

    private LiveToolsWakeOnLanCallbackArgs(LiveToolsWakeOnLanCallbackArgs $) {
        this.httpServer = $.httpServer;
        this.payloadTemplate = $.payloadTemplate;
        this.sharedSecret = $.sharedSecret;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveToolsWakeOnLanCallbackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveToolsWakeOnLanCallbackArgs $;

        public Builder() {
            $ = new LiveToolsWakeOnLanCallbackArgs();
        }

        public Builder(LiveToolsWakeOnLanCallbackArgs defaults) {
            $ = new LiveToolsWakeOnLanCallbackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpServer The webhook receiver used for the callback webhook.
         * 
         * @return builder
         * 
         */
        public Builder httpServer(@Nullable Output<LiveToolsWakeOnLanCallbackHttpServerArgs> httpServer) {
            $.httpServer = httpServer;
            return this;
        }

        /**
         * @param httpServer The webhook receiver used for the callback webhook.
         * 
         * @return builder
         * 
         */
        public Builder httpServer(LiveToolsWakeOnLanCallbackHttpServerArgs httpServer) {
            return httpServer(Output.of(httpServer));
        }

        /**
         * @param payloadTemplate The payload template of the webhook used for the callback
         * 
         * @return builder
         * 
         */
        public Builder payloadTemplate(@Nullable Output<LiveToolsWakeOnLanCallbackPayloadTemplateArgs> payloadTemplate) {
            $.payloadTemplate = payloadTemplate;
            return this;
        }

        /**
         * @param payloadTemplate The payload template of the webhook used for the callback
         * 
         * @return builder
         * 
         */
        public Builder payloadTemplate(LiveToolsWakeOnLanCallbackPayloadTemplateArgs payloadTemplate) {
            return payloadTemplate(Output.of(payloadTemplate));
        }

        /**
         * @param sharedSecret A shared secret that will be included in the requests sent to the callback URL. It can be used to verify that the request was sent by Meraki. If using this field, please also specify an url.
         * 
         * @return builder
         * 
         */
        public Builder sharedSecret(@Nullable Output<String> sharedSecret) {
            $.sharedSecret = sharedSecret;
            return this;
        }

        /**
         * @param sharedSecret A shared secret that will be included in the requests sent to the callback URL. It can be used to verify that the request was sent by Meraki. If using this field, please also specify an url.
         * 
         * @return builder
         * 
         */
        public Builder sharedSecret(String sharedSecret) {
            return sharedSecret(Output.of(sharedSecret));
        }

        /**
         * @param url The callback URL for the webhook target. If using this field, please also specify a sharedSecret.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The callback URL for the webhook target. If using this field, please also specify a sharedSecret.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public LiveToolsWakeOnLanCallbackArgs build() {
            return $;
        }
    }

}
