// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.CellularGatewayConnectivityMonitoringDestinationsDestinationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CellularGatewayConnectivityMonitoringDestinationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CellularGatewayConnectivityMonitoringDestinationsArgs Empty = new CellularGatewayConnectivityMonitoringDestinationsArgs();

    /**
     * The list of connectivity monitoring destinations
     * 
     */
    @Import(name="destinations")
    private @Nullable Output<List<CellularGatewayConnectivityMonitoringDestinationsDestinationArgs>> destinations;

    /**
     * @return The list of connectivity monitoring destinations
     * 
     */
    public Optional<Output<List<CellularGatewayConnectivityMonitoringDestinationsDestinationArgs>>> destinations() {
        return Optional.ofNullable(this.destinations);
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

    private CellularGatewayConnectivityMonitoringDestinationsArgs() {}

    private CellularGatewayConnectivityMonitoringDestinationsArgs(CellularGatewayConnectivityMonitoringDestinationsArgs $) {
        this.destinations = $.destinations;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellularGatewayConnectivityMonitoringDestinationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellularGatewayConnectivityMonitoringDestinationsArgs $;

        public Builder() {
            $ = new CellularGatewayConnectivityMonitoringDestinationsArgs();
        }

        public Builder(CellularGatewayConnectivityMonitoringDestinationsArgs defaults) {
            $ = new CellularGatewayConnectivityMonitoringDestinationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinations The list of connectivity monitoring destinations
         * 
         * @return builder
         * 
         */
        public Builder destinations(@Nullable Output<List<CellularGatewayConnectivityMonitoringDestinationsDestinationArgs>> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations The list of connectivity monitoring destinations
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<CellularGatewayConnectivityMonitoringDestinationsDestinationArgs> destinations) {
            return destinations(Output.of(destinations));
        }

        /**
         * @param destinations The list of connectivity monitoring destinations
         * 
         * @return builder
         * 
         */
        public Builder destinations(CellularGatewayConnectivityMonitoringDestinationsDestinationArgs... destinations) {
            return destinations(List.of(destinations));
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

        public CellularGatewayConnectivityMonitoringDestinationsArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("CellularGatewayConnectivityMonitoringDestinationsArgs", "networkId");
            }
            return $;
        }
    }

}
