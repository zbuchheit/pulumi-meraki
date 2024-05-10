// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.SmDevicesModifyTagsParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class SmDevicesModifyTagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SmDevicesModifyTagsArgs Empty = new SmDevicesModifyTagsArgs();

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
    private Output<SmDevicesModifyTagsParametersArgs> parameters;

    public Output<SmDevicesModifyTagsParametersArgs> parameters() {
        return this.parameters;
    }

    private SmDevicesModifyTagsArgs() {}

    private SmDevicesModifyTagsArgs(SmDevicesModifyTagsArgs $) {
        this.networkId = $.networkId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmDevicesModifyTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmDevicesModifyTagsArgs $;

        public Builder() {
            $ = new SmDevicesModifyTagsArgs();
        }

        public Builder(SmDevicesModifyTagsArgs defaults) {
            $ = new SmDevicesModifyTagsArgs(Objects.requireNonNull(defaults));
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

        public Builder parameters(Output<SmDevicesModifyTagsParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(SmDevicesModifyTagsParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public SmDevicesModifyTagsArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SmDevicesModifyTagsArgs", "networkId");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("SmDevicesModifyTagsArgs", "parameters");
            }
            return $;
        }
    }

}
