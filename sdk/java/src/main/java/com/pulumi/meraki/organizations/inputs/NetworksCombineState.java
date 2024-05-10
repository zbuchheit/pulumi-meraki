// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.NetworksCombineItemArgs;
import com.pulumi.meraki.organizations.inputs.NetworksCombineParametersArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworksCombineState extends com.pulumi.resources.ResourceArgs {

    public static final NetworksCombineState Empty = new NetworksCombineState();

    @Import(name="item")
    private @Nullable Output<NetworksCombineItemArgs> item;

    public Optional<Output<NetworksCombineItemArgs>> item() {
        return Optional.ofNullable(this.item);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    @Import(name="parameters")
    private @Nullable Output<NetworksCombineParametersArgs> parameters;

    public Optional<Output<NetworksCombineParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private NetworksCombineState() {}

    private NetworksCombineState(NetworksCombineState $) {
        this.item = $.item;
        this.organizationId = $.organizationId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworksCombineState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworksCombineState $;

        public Builder() {
            $ = new NetworksCombineState();
        }

        public Builder(NetworksCombineState defaults) {
            $ = new NetworksCombineState(Objects.requireNonNull(defaults));
        }

        public Builder item(@Nullable Output<NetworksCombineItemArgs> item) {
            $.item = item;
            return this;
        }

        public Builder item(NetworksCombineItemArgs item) {
            return item(Output.of(item));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public Builder parameters(@Nullable Output<NetworksCombineParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(NetworksCombineParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public NetworksCombineState build() {
            return $;
        }
    }

}
