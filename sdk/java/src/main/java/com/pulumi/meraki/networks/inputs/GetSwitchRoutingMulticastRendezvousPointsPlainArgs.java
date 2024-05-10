// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSwitchRoutingMulticastRendezvousPointsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchRoutingMulticastRendezvousPointsPlainArgs Empty = new GetSwitchRoutingMulticastRendezvousPointsPlainArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * rendezvousPointId path parameter. Rendezvous point ID
     * 
     */
    @Import(name="rendezvousPointId")
    private @Nullable String rendezvousPointId;

    /**
     * @return rendezvousPointId path parameter. Rendezvous point ID
     * 
     */
    public Optional<String> rendezvousPointId() {
        return Optional.ofNullable(this.rendezvousPointId);
    }

    private GetSwitchRoutingMulticastRendezvousPointsPlainArgs() {}

    private GetSwitchRoutingMulticastRendezvousPointsPlainArgs(GetSwitchRoutingMulticastRendezvousPointsPlainArgs $) {
        this.networkId = $.networkId;
        this.rendezvousPointId = $.rendezvousPointId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchRoutingMulticastRendezvousPointsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchRoutingMulticastRendezvousPointsPlainArgs $;

        public Builder() {
            $ = new GetSwitchRoutingMulticastRendezvousPointsPlainArgs();
        }

        public Builder(GetSwitchRoutingMulticastRendezvousPointsPlainArgs defaults) {
            $ = new GetSwitchRoutingMulticastRendezvousPointsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable String networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param rendezvousPointId rendezvousPointId path parameter. Rendezvous point ID
         * 
         * @return builder
         * 
         */
        public Builder rendezvousPointId(@Nullable String rendezvousPointId) {
            $.rendezvousPointId = rendezvousPointId;
            return this;
        }

        public GetSwitchRoutingMulticastRendezvousPointsPlainArgs build() {
            return $;
        }
    }

}
