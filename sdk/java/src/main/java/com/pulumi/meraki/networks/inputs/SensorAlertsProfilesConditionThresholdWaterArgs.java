// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SensorAlertsProfilesConditionThresholdWaterArgs extends com.pulumi.resources.ResourceArgs {

    public static final SensorAlertsProfilesConditionThresholdWaterArgs Empty = new SensorAlertsProfilesConditionThresholdWaterArgs();

    /**
     * Alerting threshold for a water detection event. Must be set to true.
     * 
     */
    @Import(name="present")
    private @Nullable Output<Boolean> present;

    /**
     * @return Alerting threshold for a water detection event. Must be set to true.
     * 
     */
    public Optional<Output<Boolean>> present() {
        return Optional.ofNullable(this.present);
    }

    private SensorAlertsProfilesConditionThresholdWaterArgs() {}

    private SensorAlertsProfilesConditionThresholdWaterArgs(SensorAlertsProfilesConditionThresholdWaterArgs $) {
        this.present = $.present;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensorAlertsProfilesConditionThresholdWaterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensorAlertsProfilesConditionThresholdWaterArgs $;

        public Builder() {
            $ = new SensorAlertsProfilesConditionThresholdWaterArgs();
        }

        public Builder(SensorAlertsProfilesConditionThresholdWaterArgs defaults) {
            $ = new SensorAlertsProfilesConditionThresholdWaterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param present Alerting threshold for a water detection event. Must be set to true.
         * 
         * @return builder
         * 
         */
        public Builder present(@Nullable Output<Boolean> present) {
            $.present = present;
            return this;
        }

        /**
         * @param present Alerting threshold for a water detection event. Must be set to true.
         * 
         * @return builder
         * 
         */
        public Builder present(Boolean present) {
            return present(Output.of(present));
        }

        public SensorAlertsProfilesConditionThresholdWaterArgs build() {
            return $;
        }
    }

}
