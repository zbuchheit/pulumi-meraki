// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchPortsCycleParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchPortsCycleParametersArgs Empty = new SwitchPortsCycleParametersArgs();

    /**
     * List of switch ports
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<String>> ports;

    /**
     * @return List of switch ports
     * 
     */
    public Optional<Output<List<String>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    private SwitchPortsCycleParametersArgs() {}

    private SwitchPortsCycleParametersArgs(SwitchPortsCycleParametersArgs $) {
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchPortsCycleParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchPortsCycleParametersArgs $;

        public Builder() {
            $ = new SwitchPortsCycleParametersArgs();
        }

        public Builder(SwitchPortsCycleParametersArgs defaults) {
            $ = new SwitchPortsCycleParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ports List of switch ports
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<String>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports List of switch ports
         * 
         * @return builder
         * 
         */
        public Builder ports(List<String> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports List of switch ports
         * 
         * @return builder
         * 
         */
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }

        public SwitchPortsCycleParametersArgs build() {
            return $;
        }
    }

}
