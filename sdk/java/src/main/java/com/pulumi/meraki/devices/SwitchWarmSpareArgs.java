// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchWarmSpareArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchWarmSpareArgs Empty = new SwitchWarmSpareArgs();

    /**
     * Enable or disable warm spare for a switch
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable or disable warm spare for a switch
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial", required=true)
    private Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }

    /**
     * Serial number of the warm spare switch
     * 
     */
    @Import(name="spareSerial")
    private @Nullable Output<String> spareSerial;

    /**
     * @return Serial number of the warm spare switch
     * 
     */
    public Optional<Output<String>> spareSerial() {
        return Optional.ofNullable(this.spareSerial);
    }

    private SwitchWarmSpareArgs() {}

    private SwitchWarmSpareArgs(SwitchWarmSpareArgs $) {
        this.enabled = $.enabled;
        this.serial = $.serial;
        this.spareSerial = $.spareSerial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchWarmSpareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchWarmSpareArgs $;

        public Builder() {
            $ = new SwitchWarmSpareArgs();
        }

        public Builder(SwitchWarmSpareArgs defaults) {
            $ = new SwitchWarmSpareArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable or disable warm spare for a switch
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable or disable warm spare for a switch
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(Output<String> serial) {
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

        /**
         * @param spareSerial Serial number of the warm spare switch
         * 
         * @return builder
         * 
         */
        public Builder spareSerial(@Nullable Output<String> spareSerial) {
            $.spareSerial = spareSerial;
            return this;
        }

        /**
         * @param spareSerial Serial number of the warm spare switch
         * 
         * @return builder
         * 
         */
        public Builder spareSerial(String spareSerial) {
            return spareSerial(Output.of(spareSerial));
        }

        public SwitchWarmSpareArgs build() {
            if ($.serial == null) {
                throw new MissingRequiredPropertyException("SwitchWarmSpareArgs", "serial");
            }
            return $;
        }
    }

}
