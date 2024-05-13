// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.ActionBatchesActionArgs;
import com.pulumi.meraki.organizations.inputs.ActionBatchesCallbackArgs;
import com.pulumi.meraki.organizations.inputs.ActionBatchesStatusArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionBatchesState extends com.pulumi.resources.ResourceArgs {

    public static final ActionBatchesState Empty = new ActionBatchesState();

    /**
     * actionBatchId path parameter. Action batch ID
     * 
     */
    @Import(name="actionBatchId")
    private @Nullable Output<String> actionBatchId;

    /**
     * @return actionBatchId path parameter. Action batch ID
     * 
     */
    public Optional<Output<String>> actionBatchId() {
        return Optional.ofNullable(this.actionBatchId);
    }

    /**
     * A set of changes made as part of this action (\n\nmore details\n\n)
     * 
     */
    @Import(name="actions")
    private @Nullable Output<List<ActionBatchesActionArgs>> actions;

    /**
     * @return A set of changes made as part of this action (\n\nmore details\n\n)
     * 
     */
    public Optional<Output<List<ActionBatchesActionArgs>>> actions() {
        return Optional.ofNullable(this.actions);
    }

    /**
     * Information for callback used to send back results
     * 
     */
    @Import(name="callback")
    private @Nullable Output<ActionBatchesCallbackArgs> callback;

    /**
     * @return Information for callback used to send back results
     * 
     */
    public Optional<Output<ActionBatchesCallbackArgs>> callback() {
        return Optional.ofNullable(this.callback);
    }

    /**
     * Flag describing whether the action should be previewed before executing or not
     * 
     */
    @Import(name="confirmed")
    private @Nullable Output<Boolean> confirmed;

    /**
     * @return Flag describing whether the action should be previewed before executing or not
     * 
     */
    public Optional<Output<Boolean>> confirmed() {
        return Optional.ofNullable(this.confirmed);
    }

    /**
     * ID of the organization this action batch belongs to
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return ID of the organization this action batch belongs to
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * Status of action batch
     * 
     */
    @Import(name="status")
    private @Nullable Output<ActionBatchesStatusArgs> status;

    /**
     * @return Status of action batch
     * 
     */
    public Optional<Output<ActionBatchesStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Flag describing whether actions should run synchronously or asynchronously
     * 
     */
    @Import(name="synchronous")
    private @Nullable Output<Boolean> synchronous;

    /**
     * @return Flag describing whether actions should run synchronously or asynchronously
     * 
     */
    public Optional<Output<Boolean>> synchronous() {
        return Optional.ofNullable(this.synchronous);
    }

    private ActionBatchesState() {}

    private ActionBatchesState(ActionBatchesState $) {
        this.actionBatchId = $.actionBatchId;
        this.actions = $.actions;
        this.callback = $.callback;
        this.confirmed = $.confirmed;
        this.organizationId = $.organizationId;
        this.status = $.status;
        this.synchronous = $.synchronous;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionBatchesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionBatchesState $;

        public Builder() {
            $ = new ActionBatchesState();
        }

        public Builder(ActionBatchesState defaults) {
            $ = new ActionBatchesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionBatchId actionBatchId path parameter. Action batch ID
         * 
         * @return builder
         * 
         */
        public Builder actionBatchId(@Nullable Output<String> actionBatchId) {
            $.actionBatchId = actionBatchId;
            return this;
        }

        /**
         * @param actionBatchId actionBatchId path parameter. Action batch ID
         * 
         * @return builder
         * 
         */
        public Builder actionBatchId(String actionBatchId) {
            return actionBatchId(Output.of(actionBatchId));
        }

        /**
         * @param actions A set of changes made as part of this action (\n\nmore details\n\n)
         * 
         * @return builder
         * 
         */
        public Builder actions(@Nullable Output<List<ActionBatchesActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions A set of changes made as part of this action (\n\nmore details\n\n)
         * 
         * @return builder
         * 
         */
        public Builder actions(List<ActionBatchesActionArgs> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions A set of changes made as part of this action (\n\nmore details\n\n)
         * 
         * @return builder
         * 
         */
        public Builder actions(ActionBatchesActionArgs... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param callback Information for callback used to send back results
         * 
         * @return builder
         * 
         */
        public Builder callback(@Nullable Output<ActionBatchesCallbackArgs> callback) {
            $.callback = callback;
            return this;
        }

        /**
         * @param callback Information for callback used to send back results
         * 
         * @return builder
         * 
         */
        public Builder callback(ActionBatchesCallbackArgs callback) {
            return callback(Output.of(callback));
        }

        /**
         * @param confirmed Flag describing whether the action should be previewed before executing or not
         * 
         * @return builder
         * 
         */
        public Builder confirmed(@Nullable Output<Boolean> confirmed) {
            $.confirmed = confirmed;
            return this;
        }

        /**
         * @param confirmed Flag describing whether the action should be previewed before executing or not
         * 
         * @return builder
         * 
         */
        public Builder confirmed(Boolean confirmed) {
            return confirmed(Output.of(confirmed));
        }

        /**
         * @param organizationId ID of the organization this action batch belongs to
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId ID of the organization this action batch belongs to
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param status Status of action batch
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<ActionBatchesStatusArgs> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of action batch
         * 
         * @return builder
         * 
         */
        public Builder status(ActionBatchesStatusArgs status) {
            return status(Output.of(status));
        }

        /**
         * @param synchronous Flag describing whether actions should run synchronously or asynchronously
         * 
         * @return builder
         * 
         */
        public Builder synchronous(@Nullable Output<Boolean> synchronous) {
            $.synchronous = synchronous;
            return this;
        }

        /**
         * @param synchronous Flag describing whether actions should run synchronously or asynchronously
         * 
         * @return builder
         * 
         */
        public Builder synchronous(Boolean synchronous) {
            return synchronous(Output.of(synchronous));
        }

        public ActionBatchesState build() {
            return $;
        }
    }

}