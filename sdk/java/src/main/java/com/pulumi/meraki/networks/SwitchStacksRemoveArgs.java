// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.SwitchStacksRemoveParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class SwitchStacksRemoveArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchStacksRemoveArgs Empty = new SwitchStacksRemoveArgs();

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
    private Output<SwitchStacksRemoveParametersArgs> parameters;

    public Output<SwitchStacksRemoveParametersArgs> parameters() {
        return this.parameters;
    }

    /**
     * switchStackId path parameter. Switch stack ID
     * 
     */
    @Import(name="switchStackId", required=true)
    private Output<String> switchStackId;

    /**
     * @return switchStackId path parameter. Switch stack ID
     * 
     */
    public Output<String> switchStackId() {
        return this.switchStackId;
    }

    private SwitchStacksRemoveArgs() {}

    private SwitchStacksRemoveArgs(SwitchStacksRemoveArgs $) {
        this.networkId = $.networkId;
        this.parameters = $.parameters;
        this.switchStackId = $.switchStackId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchStacksRemoveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchStacksRemoveArgs $;

        public Builder() {
            $ = new SwitchStacksRemoveArgs();
        }

        public Builder(SwitchStacksRemoveArgs defaults) {
            $ = new SwitchStacksRemoveArgs(Objects.requireNonNull(defaults));
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

        public Builder parameters(Output<SwitchStacksRemoveParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(SwitchStacksRemoveParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param switchStackId switchStackId path parameter. Switch stack ID
         * 
         * @return builder
         * 
         */
        public Builder switchStackId(Output<String> switchStackId) {
            $.switchStackId = switchStackId;
            return this;
        }

        /**
         * @param switchStackId switchStackId path parameter. Switch stack ID
         * 
         * @return builder
         * 
         */
        public Builder switchStackId(String switchStackId) {
            return switchStackId(Output.of(switchStackId));
        }

        public SwitchStacksRemoveArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SwitchStacksRemoveArgs", "networkId");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("SwitchStacksRemoveArgs", "parameters");
            }
            if ($.switchStackId == null) {
                throw new MissingRequiredPropertyException("SwitchStacksRemoveArgs", "switchStackId");
            }
            return $;
        }
    }

}
