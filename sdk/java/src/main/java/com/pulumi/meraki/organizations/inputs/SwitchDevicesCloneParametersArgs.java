// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchDevicesCloneParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchDevicesCloneParametersArgs Empty = new SwitchDevicesCloneParametersArgs();

    /**
     * Serial number of the source switch (must be on a network not bound to a template)
     * 
     */
    @Import(name="sourceSerial")
    private @Nullable Output<String> sourceSerial;

    /**
     * @return Serial number of the source switch (must be on a network not bound to a template)
     * 
     */
    public Optional<Output<String>> sourceSerial() {
        return Optional.ofNullable(this.sourceSerial);
    }

    /**
     * Array of serial numbers of one or more target switches (must be on a network not bound to a template)
     * 
     */
    @Import(name="targetSerials")
    private @Nullable Output<List<String>> targetSerials;

    /**
     * @return Array of serial numbers of one or more target switches (must be on a network not bound to a template)
     * 
     */
    public Optional<Output<List<String>>> targetSerials() {
        return Optional.ofNullable(this.targetSerials);
    }

    private SwitchDevicesCloneParametersArgs() {}

    private SwitchDevicesCloneParametersArgs(SwitchDevicesCloneParametersArgs $) {
        this.sourceSerial = $.sourceSerial;
        this.targetSerials = $.targetSerials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchDevicesCloneParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchDevicesCloneParametersArgs $;

        public Builder() {
            $ = new SwitchDevicesCloneParametersArgs();
        }

        public Builder(SwitchDevicesCloneParametersArgs defaults) {
            $ = new SwitchDevicesCloneParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceSerial Serial number of the source switch (must be on a network not bound to a template)
         * 
         * @return builder
         * 
         */
        public Builder sourceSerial(@Nullable Output<String> sourceSerial) {
            $.sourceSerial = sourceSerial;
            return this;
        }

        /**
         * @param sourceSerial Serial number of the source switch (must be on a network not bound to a template)
         * 
         * @return builder
         * 
         */
        public Builder sourceSerial(String sourceSerial) {
            return sourceSerial(Output.of(sourceSerial));
        }

        /**
         * @param targetSerials Array of serial numbers of one or more target switches (must be on a network not bound to a template)
         * 
         * @return builder
         * 
         */
        public Builder targetSerials(@Nullable Output<List<String>> targetSerials) {
            $.targetSerials = targetSerials;
            return this;
        }

        /**
         * @param targetSerials Array of serial numbers of one or more target switches (must be on a network not bound to a template)
         * 
         * @return builder
         * 
         */
        public Builder targetSerials(List<String> targetSerials) {
            return targetSerials(Output.of(targetSerials));
        }

        /**
         * @param targetSerials Array of serial numbers of one or more target switches (must be on a network not bound to a template)
         * 
         * @return builder
         * 
         */
        public Builder targetSerials(String... targetSerials) {
            return targetSerials(List.of(targetSerials));
        }

        public SwitchDevicesCloneParametersArgs build() {
            return $;
        }
    }

}
