// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesRecipientsArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesScheduleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SensorAlertsProfilesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SensorAlertsProfilesArgs Empty = new SensorAlertsProfilesArgs();

    /**
     * List of conditions that will cause the profile to send an alert.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<SensorAlertsProfilesConditionArgs>> conditions;

    /**
     * @return List of conditions that will cause the profile to send an alert.
     * 
     */
    public Optional<Output<List<SensorAlertsProfilesConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * Name of the sensor alert profile.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the sensor alert profile.
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
     * List of recipients that will receive the alert.
     * 
     */
    @Import(name="recipients")
    private @Nullable Output<SensorAlertsProfilesRecipientsArgs> recipients;

    /**
     * @return List of recipients that will receive the alert.
     * 
     */
    public Optional<Output<SensorAlertsProfilesRecipientsArgs>> recipients() {
        return Optional.ofNullable(this.recipients);
    }

    /**
     * The sensor schedule to use with the alert profile.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<SensorAlertsProfilesScheduleArgs> schedule;

    /**
     * @return The sensor schedule to use with the alert profile.
     * 
     */
    public Optional<Output<SensorAlertsProfilesScheduleArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * List of device serials assigned to this sensor alert profile.
     * 
     */
    @Import(name="serials")
    private @Nullable Output<List<String>> serials;

    /**
     * @return List of device serials assigned to this sensor alert profile.
     * 
     */
    public Optional<Output<List<String>>> serials() {
        return Optional.ofNullable(this.serials);
    }

    private SensorAlertsProfilesArgs() {}

    private SensorAlertsProfilesArgs(SensorAlertsProfilesArgs $) {
        this.conditions = $.conditions;
        this.name = $.name;
        this.networkId = $.networkId;
        this.recipients = $.recipients;
        this.schedule = $.schedule;
        this.serials = $.serials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensorAlertsProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensorAlertsProfilesArgs $;

        public Builder() {
            $ = new SensorAlertsProfilesArgs();
        }

        public Builder(SensorAlertsProfilesArgs defaults) {
            $ = new SensorAlertsProfilesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions List of conditions that will cause the profile to send an alert.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<SensorAlertsProfilesConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions List of conditions that will cause the profile to send an alert.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<SensorAlertsProfilesConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions List of conditions that will cause the profile to send an alert.
         * 
         * @return builder
         * 
         */
        public Builder conditions(SensorAlertsProfilesConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param name Name of the sensor alert profile.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the sensor alert profile.
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
         * @param recipients List of recipients that will receive the alert.
         * 
         * @return builder
         * 
         */
        public Builder recipients(@Nullable Output<SensorAlertsProfilesRecipientsArgs> recipients) {
            $.recipients = recipients;
            return this;
        }

        /**
         * @param recipients List of recipients that will receive the alert.
         * 
         * @return builder
         * 
         */
        public Builder recipients(SensorAlertsProfilesRecipientsArgs recipients) {
            return recipients(Output.of(recipients));
        }

        /**
         * @param schedule The sensor schedule to use with the alert profile.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<SensorAlertsProfilesScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule The sensor schedule to use with the alert profile.
         * 
         * @return builder
         * 
         */
        public Builder schedule(SensorAlertsProfilesScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param serials List of device serials assigned to this sensor alert profile.
         * 
         * @return builder
         * 
         */
        public Builder serials(@Nullable Output<List<String>> serials) {
            $.serials = serials;
            return this;
        }

        /**
         * @param serials List of device serials assigned to this sensor alert profile.
         * 
         * @return builder
         * 
         */
        public Builder serials(List<String> serials) {
            return serials(Output.of(serials));
        }

        /**
         * @param serials List of device serials assigned to this sensor alert profile.
         * 
         * @return builder
         * 
         */
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }

        public SensorAlertsProfilesArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SensorAlertsProfilesArgs", "networkId");
            }
            return $;
        }
    }

}
