// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SmTargetGroupsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SmTargetGroupsArgs Empty = new SmTargetGroupsArgs();

    /**
     * The name of this target group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of this target group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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

    /**
     * The scope of the target group.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of the target group.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
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

    private SmTargetGroupsArgs() {}

    private SmTargetGroupsArgs(SmTargetGroupsArgs $) {
        this.name = $.name;
        this.networkId = $.networkId;
        this.scope = $.scope;
        this.targetGroupId = $.targetGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmTargetGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmTargetGroupsArgs $;

        public Builder() {
            $ = new SmTargetGroupsArgs();
        }

        public Builder(SmTargetGroupsArgs defaults) {
            $ = new SmTargetGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this target group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this target group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        /**
         * @param scope The scope of the target group.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of the target group.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
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

        public SmTargetGroupsArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SmTargetGroupsArgs", "networkId");
            }
            return $;
        }
    }

}
