// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebhooksPayloadTemplatesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebhooksPayloadTemplatesArgs Empty = new GetWebhooksPayloadTemplatesArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * payloadTemplateId path parameter. Payload template ID
     * 
     */
    @Import(name="payloadTemplateId")
    private @Nullable Output<String> payloadTemplateId;

    /**
     * @return payloadTemplateId path parameter. Payload template ID
     * 
     */
    public Optional<Output<String>> payloadTemplateId() {
        return Optional.ofNullable(this.payloadTemplateId);
    }

    private GetWebhooksPayloadTemplatesArgs() {}

    private GetWebhooksPayloadTemplatesArgs(GetWebhooksPayloadTemplatesArgs $) {
        this.networkId = $.networkId;
        this.payloadTemplateId = $.payloadTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebhooksPayloadTemplatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebhooksPayloadTemplatesArgs $;

        public Builder() {
            $ = new GetWebhooksPayloadTemplatesArgs();
        }

        public Builder(GetWebhooksPayloadTemplatesArgs defaults) {
            $ = new GetWebhooksPayloadTemplatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param payloadTemplateId payloadTemplateId path parameter. Payload template ID
         * 
         * @return builder
         * 
         */
        public Builder payloadTemplateId(@Nullable Output<String> payloadTemplateId) {
            $.payloadTemplateId = payloadTemplateId;
            return this;
        }

        /**
         * @param payloadTemplateId payloadTemplateId path parameter. Payload template ID
         * 
         * @return builder
         * 
         */
        public Builder payloadTemplateId(String payloadTemplateId) {
            return payloadTemplateId(Output.of(payloadTemplateId));
        }

        public GetWebhooksPayloadTemplatesArgs build() {
            return $;
        }
    }

}
