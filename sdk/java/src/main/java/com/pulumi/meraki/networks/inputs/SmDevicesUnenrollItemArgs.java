// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SmDevicesUnenrollItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final SmDevicesUnenrollItemArgs Empty = new SmDevicesUnenrollItemArgs();

    /**
     * Boolean indicating whether the operation was completed successfully.
     * 
     */
    @Import(name="success")
    private @Nullable Output<Boolean> success;

    /**
     * @return Boolean indicating whether the operation was completed successfully.
     * 
     */
    public Optional<Output<Boolean>> success() {
        return Optional.ofNullable(this.success);
    }

    private SmDevicesUnenrollItemArgs() {}

    private SmDevicesUnenrollItemArgs(SmDevicesUnenrollItemArgs $) {
        this.success = $.success;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmDevicesUnenrollItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmDevicesUnenrollItemArgs $;

        public Builder() {
            $ = new SmDevicesUnenrollItemArgs();
        }

        public Builder(SmDevicesUnenrollItemArgs defaults) {
            $ = new SmDevicesUnenrollItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param success Boolean indicating whether the operation was completed successfully.
         * 
         * @return builder
         * 
         */
        public Builder success(@Nullable Output<Boolean> success) {
            $.success = success;
            return this;
        }

        /**
         * @param success Boolean indicating whether the operation was completed successfully.
         * 
         * @return builder
         * 
         */
        public Builder success(Boolean success) {
            return success(Output.of(success));
        }

        public SmDevicesUnenrollItemArgs build() {
            return $;
        }
    }

}
