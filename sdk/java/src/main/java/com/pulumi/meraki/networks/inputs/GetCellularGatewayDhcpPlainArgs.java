// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCellularGatewayDhcpPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCellularGatewayDhcpPlainArgs Empty = new GetCellularGatewayDhcpPlainArgs();

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

    private GetCellularGatewayDhcpPlainArgs() {}

    private GetCellularGatewayDhcpPlainArgs(GetCellularGatewayDhcpPlainArgs $) {
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCellularGatewayDhcpPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCellularGatewayDhcpPlainArgs $;

        public Builder() {
            $ = new GetCellularGatewayDhcpPlainArgs();
        }

        public Builder(GetCellularGatewayDhcpPlainArgs defaults) {
            $ = new GetCellularGatewayDhcpPlainArgs(Objects.requireNonNull(defaults));
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

        public GetCellularGatewayDhcpPlainArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetCellularGatewayDhcpPlainArgs", "networkId");
            }
            return $;
        }
    }

}
