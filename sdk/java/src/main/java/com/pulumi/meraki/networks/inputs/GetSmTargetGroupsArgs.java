// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSmTargetGroupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmTargetGroupsArgs Empty = new GetSmTargetGroupsArgs();

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
     * targetGroupId path parameter. Target group ID
     * 
     */
    @Import(name="targetGroupId")
    private @Nullable Output<String> targetGroupId;

    /**
     * @return targetGroupId path parameter. Target group ID
     * 
     */
    public Optional<Output<String>> targetGroupId() {
        return Optional.ofNullable(this.targetGroupId);
    }

    /**
     * withDetails query parameter. Boolean indicating if the the ids of the devices or users scoped by the target group should be included in the response
     * 
     */
    @Import(name="withDetails")
    private @Nullable Output<Boolean> withDetails;

    /**
     * @return withDetails query parameter. Boolean indicating if the the ids of the devices or users scoped by the target group should be included in the response
     * 
     */
    public Optional<Output<Boolean>> withDetails() {
        return Optional.ofNullable(this.withDetails);
    }

    private GetSmTargetGroupsArgs() {}

    private GetSmTargetGroupsArgs(GetSmTargetGroupsArgs $) {
        this.networkId = $.networkId;
        this.targetGroupId = $.targetGroupId;
        this.withDetails = $.withDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmTargetGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmTargetGroupsArgs $;

        public Builder() {
            $ = new GetSmTargetGroupsArgs();
        }

        public Builder(GetSmTargetGroupsArgs defaults) {
            $ = new GetSmTargetGroupsArgs(Objects.requireNonNull(defaults));
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
         * @param targetGroupId targetGroupId path parameter. Target group ID
         * 
         * @return builder
         * 
         */
        public Builder targetGroupId(@Nullable Output<String> targetGroupId) {
            $.targetGroupId = targetGroupId;
            return this;
        }

        /**
         * @param targetGroupId targetGroupId path parameter. Target group ID
         * 
         * @return builder
         * 
         */
        public Builder targetGroupId(String targetGroupId) {
            return targetGroupId(Output.of(targetGroupId));
        }

        /**
         * @param withDetails withDetails query parameter. Boolean indicating if the the ids of the devices or users scoped by the target group should be included in the response
         * 
         * @return builder
         * 
         */
        public Builder withDetails(@Nullable Output<Boolean> withDetails) {
            $.withDetails = withDetails;
            return this;
        }

        /**
         * @param withDetails withDetails query parameter. Boolean indicating if the the ids of the devices or users scoped by the target group should be included in the response
         * 
         * @return builder
         * 
         */
        public Builder withDetails(Boolean withDetails) {
            return withDetails(Output.of(withDetails));
        }

        public GetSmTargetGroupsArgs build() {
            return $;
        }
    }

}
