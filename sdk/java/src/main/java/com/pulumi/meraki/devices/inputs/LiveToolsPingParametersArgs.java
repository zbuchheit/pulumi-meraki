// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.devices.inputs.LiveToolsPingParametersCallbackArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveToolsPingParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final LiveToolsPingParametersArgs Empty = new LiveToolsPingParametersArgs();

    /**
     * Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    @Import(name="callback")
    private @Nullable Output<LiveToolsPingParametersCallbackArgs> callback;

    /**
     * @return Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    public Optional<Output<LiveToolsPingParametersCallbackArgs>> callback() {
        return Optional.ofNullable(this.callback);
    }

    /**
     * Count parameter to pass to ping. [1..5], default 5
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return Count parameter to pass to ping. [1..5], default 5
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * FQDN, IPv4 or IPv6 address
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return FQDN, IPv4 or IPv6 address
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    private LiveToolsPingParametersArgs() {}

    private LiveToolsPingParametersArgs(LiveToolsPingParametersArgs $) {
        this.callback = $.callback;
        this.count = $.count;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveToolsPingParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveToolsPingParametersArgs $;

        public Builder() {
            $ = new LiveToolsPingParametersArgs();
        }

        public Builder(LiveToolsPingParametersArgs defaults) {
            $ = new LiveToolsPingParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param callback Details for the callback. Please include either an httpServerId OR url and sharedSecret
         * 
         * @return builder
         * 
         */
        public Builder callback(@Nullable Output<LiveToolsPingParametersCallbackArgs> callback) {
            $.callback = callback;
            return this;
        }

        /**
         * @param callback Details for the callback. Please include either an httpServerId OR url and sharedSecret
         * 
         * @return builder
         * 
         */
        public Builder callback(LiveToolsPingParametersCallbackArgs callback) {
            return callback(Output.of(callback));
        }

        /**
         * @param count Count parameter to pass to ping. [1..5], default 5
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Count parameter to pass to ping. [1..5], default 5
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param target FQDN, IPv4 or IPv6 address
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target FQDN, IPv4 or IPv6 address
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        public LiveToolsPingParametersArgs build() {
            return $;
        }
    }

}
