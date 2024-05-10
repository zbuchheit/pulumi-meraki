// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSwitchStpArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchStpArgs Empty = new GetSwitchStpArgs();

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

    private GetSwitchStpArgs() {}

    private GetSwitchStpArgs(GetSwitchStpArgs $) {
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchStpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchStpArgs $;

        public Builder() {
            $ = new GetSwitchStpArgs();
        }

        public Builder(GetSwitchStpArgs defaults) {
            $ = new GetSwitchStpArgs(Objects.requireNonNull(defaults));
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

        public GetSwitchStpArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSwitchStpArgs", "networkId");
            }
            return $;
        }
    }

}
