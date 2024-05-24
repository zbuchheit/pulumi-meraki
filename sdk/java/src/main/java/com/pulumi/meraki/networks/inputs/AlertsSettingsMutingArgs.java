// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.AlertsSettingsMutingByPortSchedulesArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertsSettingsMutingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertsSettingsMutingArgs Empty = new AlertsSettingsMutingArgs();

    /**
     * by_port_schedules
     * 
     */
    @Import(name="byPortSchedules")
    private @Nullable Output<AlertsSettingsMutingByPortSchedulesArgs> byPortSchedules;

    /**
     * @return by_port_schedules
     * 
     */
    public Optional<Output<AlertsSettingsMutingByPortSchedulesArgs>> byPortSchedules() {
        return Optional.ofNullable(this.byPortSchedules);
    }

    private AlertsSettingsMutingArgs() {}

    private AlertsSettingsMutingArgs(AlertsSettingsMutingArgs $) {
        this.byPortSchedules = $.byPortSchedules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertsSettingsMutingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertsSettingsMutingArgs $;

        public Builder() {
            $ = new AlertsSettingsMutingArgs();
        }

        public Builder(AlertsSettingsMutingArgs defaults) {
            $ = new AlertsSettingsMutingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param byPortSchedules by_port_schedules
         * 
         * @return builder
         * 
         */
        public Builder byPortSchedules(@Nullable Output<AlertsSettingsMutingByPortSchedulesArgs> byPortSchedules) {
            $.byPortSchedules = byPortSchedules;
            return this;
        }

        /**
         * @param byPortSchedules by_port_schedules
         * 
         * @return builder
         * 
         */
        public Builder byPortSchedules(AlertsSettingsMutingByPortSchedulesArgs byPortSchedules) {
            return byPortSchedules(Output.of(byPortSchedules));
        }

        public AlertsSettingsMutingArgs build() {
            return $;
        }
    }

}
