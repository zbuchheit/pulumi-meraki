// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTopologyLinkLayerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTopologyLinkLayerPlainArgs Empty = new GetTopologyLinkLayerPlainArgs();

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

    private GetTopologyLinkLayerPlainArgs() {}

    private GetTopologyLinkLayerPlainArgs(GetTopologyLinkLayerPlainArgs $) {
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTopologyLinkLayerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTopologyLinkLayerPlainArgs $;

        public Builder() {
            $ = new GetTopologyLinkLayerPlainArgs();
        }

        public Builder(GetTopologyLinkLayerPlainArgs defaults) {
            $ = new GetTopologyLinkLayerPlainArgs(Objects.requireNonNull(defaults));
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

        public GetTopologyLinkLayerPlainArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetTopologyLinkLayerPlainArgs", "networkId");
            }
            return $;
        }
    }

}
