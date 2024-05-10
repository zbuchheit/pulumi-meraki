// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.CellularGatewayUplinkBandwidthLimitsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CellularGatewayUplinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final CellularGatewayUplinkArgs Empty = new CellularGatewayUplinkArgs();

    /**
     * The bandwidth settings for the &#39;cellular&#39; uplink
     * 
     */
    @Import(name="bandwidthLimits")
    private @Nullable Output<CellularGatewayUplinkBandwidthLimitsArgs> bandwidthLimits;

    /**
     * @return The bandwidth settings for the &#39;cellular&#39; uplink
     * 
     */
    public Optional<Output<CellularGatewayUplinkBandwidthLimitsArgs>> bandwidthLimits() {
        return Optional.ofNullable(this.bandwidthLimits);
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

    private CellularGatewayUplinkArgs() {}

    private CellularGatewayUplinkArgs(CellularGatewayUplinkArgs $) {
        this.bandwidthLimits = $.bandwidthLimits;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellularGatewayUplinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellularGatewayUplinkArgs $;

        public Builder() {
            $ = new CellularGatewayUplinkArgs();
        }

        public Builder(CellularGatewayUplinkArgs defaults) {
            $ = new CellularGatewayUplinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthLimits The bandwidth settings for the &#39;cellular&#39; uplink
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimits(@Nullable Output<CellularGatewayUplinkBandwidthLimitsArgs> bandwidthLimits) {
            $.bandwidthLimits = bandwidthLimits;
            return this;
        }

        /**
         * @param bandwidthLimits The bandwidth settings for the &#39;cellular&#39; uplink
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimits(CellularGatewayUplinkBandwidthLimitsArgs bandwidthLimits) {
            return bandwidthLimits(Output.of(bandwidthLimits));
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

        public CellularGatewayUplinkArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("CellularGatewayUplinkArgs", "networkId");
            }
            return $;
        }
    }

}
