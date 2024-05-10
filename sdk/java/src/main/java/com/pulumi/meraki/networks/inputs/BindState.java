// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.BindItemArgs;
import com.pulumi.meraki.networks.inputs.BindParametersArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BindState extends com.pulumi.resources.ResourceArgs {

    public static final BindState Empty = new BindState();

    @Import(name="item")
    private @Nullable Output<BindItemArgs> item;

    public Optional<Output<BindItemArgs>> item() {
        return Optional.ofNullable(this.item);
    }

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

    @Import(name="parameters")
    private @Nullable Output<BindParametersArgs> parameters;

    public Optional<Output<BindParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private BindState() {}

    private BindState(BindState $) {
        this.item = $.item;
        this.networkId = $.networkId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BindState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BindState $;

        public Builder() {
            $ = new BindState();
        }

        public Builder(BindState defaults) {
            $ = new BindState(Objects.requireNonNull(defaults));
        }

        public Builder item(@Nullable Output<BindItemArgs> item) {
            $.item = item;
            return this;
        }

        public Builder item(BindItemArgs item) {
            return item(Output.of(item));
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

        public Builder parameters(@Nullable Output<BindParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(BindParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public BindState build() {
            return $;
        }
    }

}
