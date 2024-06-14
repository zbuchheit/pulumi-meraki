// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SensorAlertsProfilesConditionsResponseThresholdDoorArgs extends com.pulumi.resources.ResourceArgs {

    public static final SensorAlertsProfilesConditionsResponseThresholdDoorArgs Empty = new SensorAlertsProfilesConditionsResponseThresholdDoorArgs();

    /**
     * Alerting threshold for a door open event. Must be set to true.
     * 
     */
    @Import(name="open")
    private @Nullable Output<Boolean> open;

    /**
     * @return Alerting threshold for a door open event. Must be set to true.
     * 
     */
    public Optional<Output<Boolean>> open() {
        return Optional.ofNullable(this.open);
    }

    private SensorAlertsProfilesConditionsResponseThresholdDoorArgs() {}

    private SensorAlertsProfilesConditionsResponseThresholdDoorArgs(SensorAlertsProfilesConditionsResponseThresholdDoorArgs $) {
        this.open = $.open;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensorAlertsProfilesConditionsResponseThresholdDoorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensorAlertsProfilesConditionsResponseThresholdDoorArgs $;

        public Builder() {
            $ = new SensorAlertsProfilesConditionsResponseThresholdDoorArgs();
        }

        public Builder(SensorAlertsProfilesConditionsResponseThresholdDoorArgs defaults) {
            $ = new SensorAlertsProfilesConditionsResponseThresholdDoorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param open Alerting threshold for a door open event. Must be set to true.
         * 
         * @return builder
         * 
         */
        public Builder open(@Nullable Output<Boolean> open) {
            $.open = open;
            return this;
        }

        /**
         * @param open Alerting threshold for a door open event. Must be set to true.
         * 
         * @return builder
         * 
         */
        public Builder open(Boolean open) {
            return open(Output.of(open));
        }

        public SensorAlertsProfilesConditionsResponseThresholdDoorArgs build() {
            return $;
        }
    }

}