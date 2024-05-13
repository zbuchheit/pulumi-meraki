// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.SwitchStpStpBridgePriorityArgs;
import com.pulumi.meraki.networks.inputs.SwitchStpStpBridgePriorityResponseArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchStpState extends com.pulumi.resources.ResourceArgs {

    public static final SwitchStpState Empty = new SwitchStpState();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * The spanning tree protocol status in network
     * 
     */
    @Import(name="rstpEnabled")
    private @Nullable Output<Boolean> rstpEnabled;

    /**
     * @return The spanning tree protocol status in network
     * 
     */
    public Optional<Output<Boolean>> rstpEnabled() {
        return Optional.ofNullable(this.rstpEnabled);
    }

    /**
     * STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
     * 
     */
    @Import(name="stpBridgePriorities")
    private @Nullable Output<List<SwitchStpStpBridgePriorityArgs>> stpBridgePriorities;

    /**
     * @return STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
     * 
     */
    public Optional<Output<List<SwitchStpStpBridgePriorityArgs>>> stpBridgePriorities() {
        return Optional.ofNullable(this.stpBridgePriorities);
    }

    /**
     * STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
     * 
     */
    @Import(name="stpBridgePriorityResponses")
    private @Nullable Output<List<SwitchStpStpBridgePriorityResponseArgs>> stpBridgePriorityResponses;

    /**
     * @return STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
     * 
     */
    public Optional<Output<List<SwitchStpStpBridgePriorityResponseArgs>>> stpBridgePriorityResponses() {
        return Optional.ofNullable(this.stpBridgePriorityResponses);
    }

    private SwitchStpState() {}

    private SwitchStpState(SwitchStpState $) {
        this.networkId = $.networkId;
        this.rstpEnabled = $.rstpEnabled;
        this.stpBridgePriorities = $.stpBridgePriorities;
        this.stpBridgePriorityResponses = $.stpBridgePriorityResponses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchStpState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchStpState $;

        public Builder() {
            $ = new SwitchStpState();
        }

        public Builder(SwitchStpState defaults) {
            $ = new SwitchStpState(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
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
         * @param rstpEnabled The spanning tree protocol status in network
         * 
         * @return builder
         * 
         */
        public Builder rstpEnabled(@Nullable Output<Boolean> rstpEnabled) {
            $.rstpEnabled = rstpEnabled;
            return this;
        }

        /**
         * @param rstpEnabled The spanning tree protocol status in network
         * 
         * @return builder
         * 
         */
        public Builder rstpEnabled(Boolean rstpEnabled) {
            return rstpEnabled(Output.of(rstpEnabled));
        }

        /**
         * @param stpBridgePriorities STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
         * 
         * @return builder
         * 
         */
        public Builder stpBridgePriorities(@Nullable Output<List<SwitchStpStpBridgePriorityArgs>> stpBridgePriorities) {
            $.stpBridgePriorities = stpBridgePriorities;
            return this;
        }

        /**
         * @param stpBridgePriorities STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
         * 
         * @return builder
         * 
         */
        public Builder stpBridgePriorities(List<SwitchStpStpBridgePriorityArgs> stpBridgePriorities) {
            return stpBridgePriorities(Output.of(stpBridgePriorities));
        }

        /**
         * @param stpBridgePriorities STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
         * 
         * @return builder
         * 
         */
        public Builder stpBridgePriorities(SwitchStpStpBridgePriorityArgs... stpBridgePriorities) {
            return stpBridgePriorities(List.of(stpBridgePriorities));
        }

        /**
         * @param stpBridgePriorityResponses STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
         * 
         * @return builder
         * 
         */
        public Builder stpBridgePriorityResponses(@Nullable Output<List<SwitchStpStpBridgePriorityResponseArgs>> stpBridgePriorityResponses) {
            $.stpBridgePriorityResponses = stpBridgePriorityResponses;
            return this;
        }

        /**
         * @param stpBridgePriorityResponses STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
         * 
         * @return builder
         * 
         */
        public Builder stpBridgePriorityResponses(List<SwitchStpStpBridgePriorityResponseArgs> stpBridgePriorityResponses) {
            return stpBridgePriorityResponses(Output.of(stpBridgePriorityResponses));
        }

        /**
         * @param stpBridgePriorityResponses STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
         * 
         * @return builder
         * 
         */
        public Builder stpBridgePriorityResponses(SwitchStpStpBridgePriorityResponseArgs... stpBridgePriorityResponses) {
            return stpBridgePriorityResponses(List.of(stpBridgePriorityResponses));
        }

        public SwitchStpState build() {
            return $;
        }
    }

}