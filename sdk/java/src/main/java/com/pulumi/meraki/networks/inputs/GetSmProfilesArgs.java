// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSmProfilesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmProfilesArgs Empty = new GetSmProfilesArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    /**
     * payloadTypes query parameter. Filter by payload types
     * 
     */
    @Import(name="payloadTypes")
    private @Nullable Output<List<String>> payloadTypes;

    /**
     * @return payloadTypes query parameter. Filter by payload types
     * 
     */
    public Optional<Output<List<String>>> payloadTypes() {
        return Optional.ofNullable(this.payloadTypes);
    }

    private GetSmProfilesArgs() {}

    private GetSmProfilesArgs(GetSmProfilesArgs $) {
        this.networkId = $.networkId;
        this.payloadTypes = $.payloadTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmProfilesArgs $;

        public Builder() {
            $ = new GetSmProfilesArgs();
        }

        public Builder(GetSmProfilesArgs defaults) {
            $ = new GetSmProfilesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
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
         * @param payloadTypes payloadTypes query parameter. Filter by payload types
         * 
         * @return builder
         * 
         */
        public Builder payloadTypes(@Nullable Output<List<String>> payloadTypes) {
            $.payloadTypes = payloadTypes;
            return this;
        }

        /**
         * @param payloadTypes payloadTypes query parameter. Filter by payload types
         * 
         * @return builder
         * 
         */
        public Builder payloadTypes(List<String> payloadTypes) {
            return payloadTypes(Output.of(payloadTypes));
        }

        /**
         * @param payloadTypes payloadTypes query parameter. Filter by payload types
         * 
         * @return builder
         * 
         */
        public Builder payloadTypes(String... payloadTypes) {
            return payloadTypes(List.of(payloadTypes));
        }

        public GetSmProfilesArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSmProfilesArgs", "networkId");
            }
            return $;
        }
    }

}