// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.NetworksCombineItemResultingNetworkArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworksCombineItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworksCombineItemArgs Empty = new NetworksCombineItemArgs();

    /**
     * Network after the combination
     * 
     */
    @Import(name="resultingNetwork")
    private @Nullable Output<NetworksCombineItemResultingNetworkArgs> resultingNetwork;

    /**
     * @return Network after the combination
     * 
     */
    public Optional<Output<NetworksCombineItemResultingNetworkArgs>> resultingNetwork() {
        return Optional.ofNullable(this.resultingNetwork);
    }

    private NetworksCombineItemArgs() {}

    private NetworksCombineItemArgs(NetworksCombineItemArgs $) {
        this.resultingNetwork = $.resultingNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworksCombineItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworksCombineItemArgs $;

        public Builder() {
            $ = new NetworksCombineItemArgs();
        }

        public Builder(NetworksCombineItemArgs defaults) {
            $ = new NetworksCombineItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resultingNetwork Network after the combination
         * 
         * @return builder
         * 
         */
        public Builder resultingNetwork(@Nullable Output<NetworksCombineItemResultingNetworkArgs> resultingNetwork) {
            $.resultingNetwork = resultingNetwork;
            return this;
        }

        /**
         * @param resultingNetwork Network after the combination
         * 
         * @return builder
         * 
         */
        public Builder resultingNetwork(NetworksCombineItemResultingNetworkArgs resultingNetwork) {
            return resultingNetwork(Output.of(resultingNetwork));
        }

        public NetworksCombineItemArgs build() {
            return $;
        }
    }

}
