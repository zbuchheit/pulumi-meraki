// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.BindParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class BindArgs extends com.pulumi.resources.ResourceArgs {

    public static final BindArgs Empty = new BindArgs();

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

    @Import(name="parameters", required=true)
    private Output<BindParametersArgs> parameters;

    public Output<BindParametersArgs> parameters() {
        return this.parameters;
    }

    private BindArgs() {}

    private BindArgs(BindArgs $) {
        this.networkId = $.networkId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BindArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BindArgs $;

        public Builder() {
            $ = new BindArgs();
        }

        public Builder(BindArgs defaults) {
            $ = new BindArgs(Objects.requireNonNull(defaults));
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

        public Builder parameters(Output<BindParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(BindParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public BindArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("BindArgs", "networkId");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("BindArgs", "parameters");
            }
            return $;
        }
    }

}
