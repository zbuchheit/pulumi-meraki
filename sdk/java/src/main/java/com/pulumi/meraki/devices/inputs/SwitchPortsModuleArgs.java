// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchPortsModuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchPortsModuleArgs Empty = new SwitchPortsModuleArgs();

    /**
     * The model of the expansion module.
     * 
     */
    @Import(name="model")
    private @Nullable Output<String> model;

    /**
     * @return The model of the expansion module.
     * 
     */
    public Optional<Output<String>> model() {
        return Optional.ofNullable(this.model);
    }

    private SwitchPortsModuleArgs() {}

    private SwitchPortsModuleArgs(SwitchPortsModuleArgs $) {
        this.model = $.model;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchPortsModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchPortsModuleArgs $;

        public Builder() {
            $ = new SwitchPortsModuleArgs();
        }

        public Builder(SwitchPortsModuleArgs defaults) {
            $ = new SwitchPortsModuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param model The model of the expansion module.
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable Output<String> model) {
            $.model = model;
            return this;
        }

        /**
         * @param model The model of the expansion module.
         * 
         * @return builder
         * 
         */
        public Builder model(String model) {
            return model(Output.of(model));
        }

        public SwitchPortsModuleArgs build() {
            return $;
        }
    }

}
