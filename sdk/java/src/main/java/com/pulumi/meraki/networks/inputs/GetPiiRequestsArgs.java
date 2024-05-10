// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPiiRequestsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPiiRequestsArgs Empty = new GetPiiRequestsArgs();

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
     * requestId path parameter. Request ID
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return requestId path parameter. Request ID
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    private GetPiiRequestsArgs() {}

    private GetPiiRequestsArgs(GetPiiRequestsArgs $) {
        this.networkId = $.networkId;
        this.requestId = $.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPiiRequestsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPiiRequestsArgs $;

        public Builder() {
            $ = new GetPiiRequestsArgs();
        }

        public Builder(GetPiiRequestsArgs defaults) {
            $ = new GetPiiRequestsArgs(Objects.requireNonNull(defaults));
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
         * @param requestId requestId path parameter. Request ID
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId requestId path parameter. Request ID
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public GetPiiRequestsArgs build() {
            return $;
        }
    }

}
