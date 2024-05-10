// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SmBypassActivationLockAttemptsDataStatus38290139892Args extends com.pulumi.resources.ResourceArgs {

    public static final SmBypassActivationLockAttemptsDataStatus38290139892Args Empty = new SmBypassActivationLockAttemptsDataStatus38290139892Args();

    @Import(name="success")
    private @Nullable Output<Boolean> success;

    public Optional<Output<Boolean>> success() {
        return Optional.ofNullable(this.success);
    }

    private SmBypassActivationLockAttemptsDataStatus38290139892Args() {}

    private SmBypassActivationLockAttemptsDataStatus38290139892Args(SmBypassActivationLockAttemptsDataStatus38290139892Args $) {
        this.success = $.success;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmBypassActivationLockAttemptsDataStatus38290139892Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmBypassActivationLockAttemptsDataStatus38290139892Args $;

        public Builder() {
            $ = new SmBypassActivationLockAttemptsDataStatus38290139892Args();
        }

        public Builder(SmBypassActivationLockAttemptsDataStatus38290139892Args defaults) {
            $ = new SmBypassActivationLockAttemptsDataStatus38290139892Args(Objects.requireNonNull(defaults));
        }

        public Builder success(@Nullable Output<Boolean> success) {
            $.success = success;
            return this;
        }

        public Builder success(Boolean success) {
            return success(Output.of(success));
        }

        public SmBypassActivationLockAttemptsDataStatus38290139892Args build() {
            return $;
        }
    }

}
