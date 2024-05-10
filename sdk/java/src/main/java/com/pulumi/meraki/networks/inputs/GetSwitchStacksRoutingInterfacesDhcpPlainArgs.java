// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSwitchStacksRoutingInterfacesDhcpPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchStacksRoutingInterfacesDhcpPlainArgs Empty = new GetSwitchStacksRoutingInterfacesDhcpPlainArgs();

    /**
     * interfaceId path parameter. Interface ID
     * 
     */
    @Import(name="interfaceId", required=true)
    private String interfaceId;

    /**
     * @return interfaceId path parameter. Interface ID
     * 
     */
    public String interfaceId() {
        return this.interfaceId;
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    /**
     * switchStackId path parameter. Switch stack ID
     * 
     */
    @Import(name="switchStackId", required=true)
    private String switchStackId;

    /**
     * @return switchStackId path parameter. Switch stack ID
     * 
     */
    public String switchStackId() {
        return this.switchStackId;
    }

    private GetSwitchStacksRoutingInterfacesDhcpPlainArgs() {}

    private GetSwitchStacksRoutingInterfacesDhcpPlainArgs(GetSwitchStacksRoutingInterfacesDhcpPlainArgs $) {
        this.interfaceId = $.interfaceId;
        this.networkId = $.networkId;
        this.switchStackId = $.switchStackId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchStacksRoutingInterfacesDhcpPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchStacksRoutingInterfacesDhcpPlainArgs $;

        public Builder() {
            $ = new GetSwitchStacksRoutingInterfacesDhcpPlainArgs();
        }

        public Builder(GetSwitchStacksRoutingInterfacesDhcpPlainArgs defaults) {
            $ = new GetSwitchStacksRoutingInterfacesDhcpPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interfaceId interfaceId path parameter. Interface ID
         * 
         * @return builder
         * 
         */
        public Builder interfaceId(String interfaceId) {
            $.interfaceId = interfaceId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param switchStackId switchStackId path parameter. Switch stack ID
         * 
         * @return builder
         * 
         */
        public Builder switchStackId(String switchStackId) {
            $.switchStackId = switchStackId;
            return this;
        }

        public GetSwitchStacksRoutingInterfacesDhcpPlainArgs build() {
            if ($.interfaceId == null) {
                throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpPlainArgs", "interfaceId");
            }
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpPlainArgs", "networkId");
            }
            if ($.switchStackId == null) {
                throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpPlainArgs", "switchStackId");
            }
            return $;
        }
    }

}
