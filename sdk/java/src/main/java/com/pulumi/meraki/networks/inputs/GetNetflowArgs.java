// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNetflowArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetflowArgs Empty = new GetNetflowArgs();

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

    private GetNetflowArgs() {}

    private GetNetflowArgs(GetNetflowArgs $) {
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetflowArgs $;

        public Builder() {
            $ = new GetNetflowArgs();
        }

        public Builder(GetNetflowArgs defaults) {
            $ = new GetNetflowArgs(Objects.requireNonNull(defaults));
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

        public GetNetflowArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetNetflowArgs", "networkId");
            }
            return $;
        }
    }

}
