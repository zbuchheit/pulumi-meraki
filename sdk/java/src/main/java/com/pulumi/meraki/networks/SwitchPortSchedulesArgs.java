// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.SwitchPortSchedulesPortScheduleArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchPortSchedulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchPortSchedulesArgs Empty = new SwitchPortSchedulesArgs();

    /**
     * The name for your port schedule. Required
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for your port schedule. Required
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    /**
     * The schedule for switch port scheduling. Schedules are applied to days of the week.
     * When it&#39;s empty, default schedule with all days of a week are configured.
     * Any unspecified day in the schedule is added as a default schedule configuration of the day.
     * 
     */
    @Import(name="portSchedule")
    private @Nullable Output<SwitchPortSchedulesPortScheduleArgs> portSchedule;

    /**
     * @return The schedule for switch port scheduling. Schedules are applied to days of the week.
     * When it&#39;s empty, default schedule with all days of a week are configured.
     * Any unspecified day in the schedule is added as a default schedule configuration of the day.
     * 
     */
    public Optional<Output<SwitchPortSchedulesPortScheduleArgs>> portSchedule() {
        return Optional.ofNullable(this.portSchedule);
    }

    /**
     * portScheduleId path parameter. Port schedule ID
     * 
     */
    @Import(name="portScheduleId")
    private @Nullable Output<String> portScheduleId;

    /**
     * @return portScheduleId path parameter. Port schedule ID
     * 
     */
    public Optional<Output<String>> portScheduleId() {
        return Optional.ofNullable(this.portScheduleId);
    }

    private SwitchPortSchedulesArgs() {}

    private SwitchPortSchedulesArgs(SwitchPortSchedulesArgs $) {
        this.name = $.name;
        this.networkId = $.networkId;
        this.portSchedule = $.portSchedule;
        this.portScheduleId = $.portScheduleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchPortSchedulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchPortSchedulesArgs $;

        public Builder() {
            $ = new SwitchPortSchedulesArgs();
        }

        public Builder(SwitchPortSchedulesArgs defaults) {
            $ = new SwitchPortSchedulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name for your port schedule. Required
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for your port schedule. Required
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param portSchedule The schedule for switch port scheduling. Schedules are applied to days of the week.
         * When it&#39;s empty, default schedule with all days of a week are configured.
         * Any unspecified day in the schedule is added as a default schedule configuration of the day.
         * 
         * @return builder
         * 
         */
        public Builder portSchedule(@Nullable Output<SwitchPortSchedulesPortScheduleArgs> portSchedule) {
            $.portSchedule = portSchedule;
            return this;
        }

        /**
         * @param portSchedule The schedule for switch port scheduling. Schedules are applied to days of the week.
         * When it&#39;s empty, default schedule with all days of a week are configured.
         * Any unspecified day in the schedule is added as a default schedule configuration of the day.
         * 
         * @return builder
         * 
         */
        public Builder portSchedule(SwitchPortSchedulesPortScheduleArgs portSchedule) {
            return portSchedule(Output.of(portSchedule));
        }

        /**
         * @param portScheduleId portScheduleId path parameter. Port schedule ID
         * 
         * @return builder
         * 
         */
        public Builder portScheduleId(@Nullable Output<String> portScheduleId) {
            $.portScheduleId = portScheduleId;
            return this;
        }

        /**
         * @param portScheduleId portScheduleId path parameter. Port schedule ID
         * 
         * @return builder
         * 
         */
        public Builder portScheduleId(String portScheduleId) {
            return portScheduleId(Output.of(portScheduleId));
        }

        public SwitchPortSchedulesArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SwitchPortSchedulesArgs", "networkId");
            }
            return $;
        }
    }

}
