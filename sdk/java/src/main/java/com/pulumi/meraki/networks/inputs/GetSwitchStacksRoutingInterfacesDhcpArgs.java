// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSwitchStacksRoutingInterfacesDhcpArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchStacksRoutingInterfacesDhcpArgs Empty = new GetSwitchStacksRoutingInterfacesDhcpArgs();

    /**
     * interfaceId path parameter. Interface ID
     * 
     */
    @Import(name="interfaceId", required=true)
    private Output<String> interfaceId;

    /**
     * @return interfaceId path parameter. Interface ID
     * 
     */
    public Output<String> interfaceId() {
        return this.interfaceId;
    }

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

    private GetSwitchStacksRoutingInterfacesDhcpArgs() {}

    private GetSwitchStacksRoutingInterfacesDhcpArgs(GetSwitchStacksRoutingInterfacesDhcpArgs $) {
        this.interfaceId = $.interfaceId;
        this.networkId = $.networkId;
        this.switchStackId = $.switchStackId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchStacksRoutingInterfacesDhcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchStacksRoutingInterfacesDhcpArgs $;

        public Builder() {
            $ = new GetSwitchStacksRoutingInterfacesDhcpArgs();
        }

        public Builder(GetSwitchStacksRoutingInterfacesDhcpArgs defaults) {
            $ = new GetSwitchStacksRoutingInterfacesDhcpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interfaceId interfaceId path parameter. Interface ID
         * 
         * @return builder
         * 
         */
        public Builder interfaceId(Output<String> interfaceId) {
            $.interfaceId = interfaceId;
            return this;
        }

        /**
         * @param interfaceId interfaceId path parameter. Interface ID
         * 
         * @return builder
         * 
         */
        public Builder interfaceId(String interfaceId) {
            return interfaceId(Output.of(interfaceId));
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

        public GetSwitchStacksRoutingInterfacesDhcpArgs build() {
            if ($.interfaceId == null) {
                throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpArgs", "interfaceId");
            }
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpArgs", "networkId");
            }
            if ($.switchStackId == null) {
                throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpArgs", "switchStackId");
            }
            return $;
        }
    }

}
