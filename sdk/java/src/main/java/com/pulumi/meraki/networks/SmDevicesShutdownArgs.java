// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.SmDevicesShutdownParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class SmDevicesShutdownArgs extends com.pulumi.resources.ResourceArgs {

    public static final SmDevicesShutdownArgs Empty = new SmDevicesShutdownArgs();

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
    private Output<SmDevicesShutdownParametersArgs> parameters;

    public Output<SmDevicesShutdownParametersArgs> parameters() {
        return this.parameters;
    }

    private SmDevicesShutdownArgs() {}

    private SmDevicesShutdownArgs(SmDevicesShutdownArgs $) {
        this.networkId = $.networkId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmDevicesShutdownArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmDevicesShutdownArgs $;

        public Builder() {
            $ = new SmDevicesShutdownArgs();
        }

        public Builder(SmDevicesShutdownArgs defaults) {
            $ = new SmDevicesShutdownArgs(Objects.requireNonNull(defaults));
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

        public Builder parameters(Output<SmDevicesShutdownParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(SmDevicesShutdownParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public SmDevicesShutdownArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SmDevicesShutdownArgs", "networkId");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("SmDevicesShutdownArgs", "parameters");
            }
            return $;
        }
    }

}