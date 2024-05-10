// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.devices.inputs.LiveToolsPingItemArgs;
import com.pulumi.meraki.devices.inputs.LiveToolsPingParametersArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveToolsPingState extends com.pulumi.resources.ResourceArgs {

    public static final LiveToolsPingState Empty = new LiveToolsPingState();

    @Import(name="item")
    private @Nullable Output<LiveToolsPingItemArgs> item;

    public Optional<Output<LiveToolsPingItemArgs>> item() {
        return Optional.ofNullable(this.item);
    }

    @Import(name="parameters")
    private @Nullable Output<LiveToolsPingParametersArgs> parameters;

    public Optional<Output<LiveToolsPingParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    private LiveToolsPingState() {}

    private LiveToolsPingState(LiveToolsPingState $) {
        this.item = $.item;
        this.parameters = $.parameters;
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveToolsPingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveToolsPingState $;

        public Builder() {
            $ = new LiveToolsPingState();
        }

        public Builder(LiveToolsPingState defaults) {
            $ = new LiveToolsPingState(Objects.requireNonNull(defaults));
        }

        public Builder item(@Nullable Output<LiveToolsPingItemArgs> item) {
            $.item = item;
            return this;
        }

        public Builder item(LiveToolsPingItemArgs item) {
            return item(Output.of(item));
        }

        public Builder parameters(@Nullable Output<LiveToolsPingParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(LiveToolsPingParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        public LiveToolsPingState build() {
            return $;
        }
    }

}
