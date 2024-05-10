// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SmBypassActivationLockAttemptsDataStatus2090938209Args extends com.pulumi.resources.ResourceArgs {

    public static final SmBypassActivationLockAttemptsDataStatus2090938209Args Empty = new SmBypassActivationLockAttemptsDataStatus2090938209Args();

    @Import(name="errors")
    private @Nullable Output<List<String>> errors;

    public Optional<Output<List<String>>> errors() {
        return Optional.ofNullable(this.errors);
    }

    @Import(name="success")
    private @Nullable Output<Boolean> success;

    public Optional<Output<Boolean>> success() {
        return Optional.ofNullable(this.success);
    }

    private SmBypassActivationLockAttemptsDataStatus2090938209Args() {}

    private SmBypassActivationLockAttemptsDataStatus2090938209Args(SmBypassActivationLockAttemptsDataStatus2090938209Args $) {
        this.errors = $.errors;
        this.success = $.success;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmBypassActivationLockAttemptsDataStatus2090938209Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmBypassActivationLockAttemptsDataStatus2090938209Args $;

        public Builder() {
            $ = new SmBypassActivationLockAttemptsDataStatus2090938209Args();
        }

        public Builder(SmBypassActivationLockAttemptsDataStatus2090938209Args defaults) {
            $ = new SmBypassActivationLockAttemptsDataStatus2090938209Args(Objects.requireNonNull(defaults));
        }

        public Builder errors(@Nullable Output<List<String>> errors) {
            $.errors = errors;
            return this;
        }

        public Builder errors(List<String> errors) {
            return errors(Output.of(errors));
        }

        public Builder errors(String... errors) {
            return errors(List.of(errors));
        }

        public Builder success(@Nullable Output<Boolean> success) {
            $.success = success;
            return this;
        }

        public Builder success(Boolean success) {
            return success(Output.of(success));
        }

        public SmBypassActivationLockAttemptsDataStatus2090938209Args build() {
            return $;
        }
    }

}
