// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchPortsMirrorArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchPortsMirrorArgs Empty = new SwitchPortsMirrorArgs();

    /**
     * The port mirror mode. Can be one of (&#39;Destination port&#39;, &#39;Source port&#39; or &#39;Not mirroring traffic&#39;).
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The port mirror mode. Can be one of (&#39;Destination port&#39;, &#39;Source port&#39; or &#39;Not mirroring traffic&#39;).
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    private SwitchPortsMirrorArgs() {}

    private SwitchPortsMirrorArgs(SwitchPortsMirrorArgs $) {
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchPortsMirrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchPortsMirrorArgs $;

        public Builder() {
            $ = new SwitchPortsMirrorArgs();
        }

        public Builder(SwitchPortsMirrorArgs defaults) {
            $ = new SwitchPortsMirrorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode The port mirror mode. Can be one of (&#39;Destination port&#39;, &#39;Source port&#39; or &#39;Not mirroring traffic&#39;).
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The port mirror mode. Can be one of (&#39;Destination port&#39;, &#39;Source port&#39; or &#39;Not mirroring traffic&#39;).
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public SwitchPortsMirrorArgs build() {
            return $;
        }
    }

}
