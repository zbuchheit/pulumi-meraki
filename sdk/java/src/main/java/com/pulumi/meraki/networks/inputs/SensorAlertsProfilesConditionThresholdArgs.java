// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdApparentPowerArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdCurrentArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdDoorArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdFrequencyArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdHumidityArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdIndoorAirQualityArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdNoiseArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdPm25Args;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdPowerFactorArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdRealPowerArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdTemperatureArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdTvocArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdUpstreamPowerArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdVoltageArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdWaterArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SensorAlertsProfilesConditionThresholdArgs extends com.pulumi.resources.ResourceArgs {

    public static final SensorAlertsProfilesConditionThresholdArgs Empty = new SensorAlertsProfilesConditionThresholdArgs();

    /**
     * Apparent power threshold. &#39;draw&#39; must be provided.
     * 
     */
    @Import(name="apparentPower")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdApparentPowerArgs> apparentPower;

    /**
     * @return Apparent power threshold. &#39;draw&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdApparentPowerArgs>> apparentPower() {
        return Optional.ofNullable(this.apparentPower);
    }

    /**
     * Electrical current threshold. &#39;level&#39; must be provided.
     * 
     */
    @Import(name="current")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdCurrentArgs> current;

    /**
     * @return Electrical current threshold. &#39;level&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdCurrentArgs>> current() {
        return Optional.ofNullable(this.current);
    }

    /**
     * Door open threshold. &#39;open&#39; must be provided and set to true.
     * 
     */
    @Import(name="door")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdDoorArgs> door;

    /**
     * @return Door open threshold. &#39;open&#39; must be provided and set to true.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdDoorArgs>> door() {
        return Optional.ofNullable(this.door);
    }

    /**
     * Electrical frequency threshold. &#39;level&#39; must be provided.
     * 
     */
    @Import(name="frequency")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdFrequencyArgs> frequency;

    /**
     * @return Electrical frequency threshold. &#39;level&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdFrequencyArgs>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * Humidity threshold. One of &#39;relativePercentage&#39; or &#39;quality&#39; must be provided.
     * 
     */
    @Import(name="humidity")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdHumidityArgs> humidity;

    /**
     * @return Humidity threshold. One of &#39;relativePercentage&#39; or &#39;quality&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdHumidityArgs>> humidity() {
        return Optional.ofNullable(this.humidity);
    }

    /**
     * Indoor air quality score threshold. One of &#39;score&#39; or &#39;quality&#39; must be provided.
     * 
     */
    @Import(name="indoorAirQuality")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdIndoorAirQualityArgs> indoorAirQuality;

    /**
     * @return Indoor air quality score threshold. One of &#39;score&#39; or &#39;quality&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdIndoorAirQualityArgs>> indoorAirQuality() {
        return Optional.ofNullable(this.indoorAirQuality);
    }

    /**
     * Noise threshold. &#39;ambient&#39; must be provided.
     * 
     */
    @Import(name="noise")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdNoiseArgs> noise;

    /**
     * @return Noise threshold. &#39;ambient&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdNoiseArgs>> noise() {
        return Optional.ofNullable(this.noise);
    }

    /**
     * PM2.5 concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
     * 
     */
    @Import(name="pm25")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdPm25Args> pm25;

    /**
     * @return PM2.5 concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdPm25Args>> pm25() {
        return Optional.ofNullable(this.pm25);
    }

    /**
     * Power factor threshold. &#39;percentage&#39; must be provided.
     * 
     */
    @Import(name="powerFactor")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdPowerFactorArgs> powerFactor;

    /**
     * @return Power factor threshold. &#39;percentage&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdPowerFactorArgs>> powerFactor() {
        return Optional.ofNullable(this.powerFactor);
    }

    /**
     * Real power threshold. &#39;draw&#39; must be provided.
     * 
     */
    @Import(name="realPower")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdRealPowerArgs> realPower;

    /**
     * @return Real power threshold. &#39;draw&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdRealPowerArgs>> realPower() {
        return Optional.ofNullable(this.realPower);
    }

    /**
     * Temperature threshold. One of &#39;celsius&#39;, &#39;fahrenheit&#39;, or &#39;quality&#39; must be provided.
     * 
     */
    @Import(name="temperature")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdTemperatureArgs> temperature;

    /**
     * @return Temperature threshold. One of &#39;celsius&#39;, &#39;fahrenheit&#39;, or &#39;quality&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdTemperatureArgs>> temperature() {
        return Optional.ofNullable(this.temperature);
    }

    /**
     * TVOC concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
     * 
     */
    @Import(name="tvoc")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdTvocArgs> tvoc;

    /**
     * @return TVOC concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdTvocArgs>> tvoc() {
        return Optional.ofNullable(this.tvoc);
    }

    /**
     * Upstream power threshold. &#39;outageDetected&#39; must be provided and set to true.
     * 
     */
    @Import(name="upstreamPower")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdUpstreamPowerArgs> upstreamPower;

    /**
     * @return Upstream power threshold. &#39;outageDetected&#39; must be provided and set to true.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdUpstreamPowerArgs>> upstreamPower() {
        return Optional.ofNullable(this.upstreamPower);
    }

    /**
     * Voltage threshold. &#39;level&#39; must be provided.
     * 
     */
    @Import(name="voltage")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdVoltageArgs> voltage;

    /**
     * @return Voltage threshold. &#39;level&#39; must be provided.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdVoltageArgs>> voltage() {
        return Optional.ofNullable(this.voltage);
    }

    /**
     * Water detection threshold. &#39;present&#39; must be provided and set to true.
     * 
     */
    @Import(name="water")
    private @Nullable Output<SensorAlertsProfilesConditionThresholdWaterArgs> water;

    /**
     * @return Water detection threshold. &#39;present&#39; must be provided and set to true.
     * 
     */
    public Optional<Output<SensorAlertsProfilesConditionThresholdWaterArgs>> water() {
        return Optional.ofNullable(this.water);
    }

    private SensorAlertsProfilesConditionThresholdArgs() {}

    private SensorAlertsProfilesConditionThresholdArgs(SensorAlertsProfilesConditionThresholdArgs $) {
        this.apparentPower = $.apparentPower;
        this.current = $.current;
        this.door = $.door;
        this.frequency = $.frequency;
        this.humidity = $.humidity;
        this.indoorAirQuality = $.indoorAirQuality;
        this.noise = $.noise;
        this.pm25 = $.pm25;
        this.powerFactor = $.powerFactor;
        this.realPower = $.realPower;
        this.temperature = $.temperature;
        this.tvoc = $.tvoc;
        this.upstreamPower = $.upstreamPower;
        this.voltage = $.voltage;
        this.water = $.water;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensorAlertsProfilesConditionThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensorAlertsProfilesConditionThresholdArgs $;

        public Builder() {
            $ = new SensorAlertsProfilesConditionThresholdArgs();
        }

        public Builder(SensorAlertsProfilesConditionThresholdArgs defaults) {
            $ = new SensorAlertsProfilesConditionThresholdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apparentPower Apparent power threshold. &#39;draw&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder apparentPower(@Nullable Output<SensorAlertsProfilesConditionThresholdApparentPowerArgs> apparentPower) {
            $.apparentPower = apparentPower;
            return this;
        }

        /**
         * @param apparentPower Apparent power threshold. &#39;draw&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder apparentPower(SensorAlertsProfilesConditionThresholdApparentPowerArgs apparentPower) {
            return apparentPower(Output.of(apparentPower));
        }

        /**
         * @param current Electrical current threshold. &#39;level&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder current(@Nullable Output<SensorAlertsProfilesConditionThresholdCurrentArgs> current) {
            $.current = current;
            return this;
        }

        /**
         * @param current Electrical current threshold. &#39;level&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder current(SensorAlertsProfilesConditionThresholdCurrentArgs current) {
            return current(Output.of(current));
        }

        /**
         * @param door Door open threshold. &#39;open&#39; must be provided and set to true.
         * 
         * @return builder
         * 
         */
        public Builder door(@Nullable Output<SensorAlertsProfilesConditionThresholdDoorArgs> door) {
            $.door = door;
            return this;
        }

        /**
         * @param door Door open threshold. &#39;open&#39; must be provided and set to true.
         * 
         * @return builder
         * 
         */
        public Builder door(SensorAlertsProfilesConditionThresholdDoorArgs door) {
            return door(Output.of(door));
        }

        /**
         * @param frequency Electrical frequency threshold. &#39;level&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable Output<SensorAlertsProfilesConditionThresholdFrequencyArgs> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency Electrical frequency threshold. &#39;level&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder frequency(SensorAlertsProfilesConditionThresholdFrequencyArgs frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param humidity Humidity threshold. One of &#39;relativePercentage&#39; or &#39;quality&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder humidity(@Nullable Output<SensorAlertsProfilesConditionThresholdHumidityArgs> humidity) {
            $.humidity = humidity;
            return this;
        }

        /**
         * @param humidity Humidity threshold. One of &#39;relativePercentage&#39; or &#39;quality&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder humidity(SensorAlertsProfilesConditionThresholdHumidityArgs humidity) {
            return humidity(Output.of(humidity));
        }

        /**
         * @param indoorAirQuality Indoor air quality score threshold. One of &#39;score&#39; or &#39;quality&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder indoorAirQuality(@Nullable Output<SensorAlertsProfilesConditionThresholdIndoorAirQualityArgs> indoorAirQuality) {
            $.indoorAirQuality = indoorAirQuality;
            return this;
        }

        /**
         * @param indoorAirQuality Indoor air quality score threshold. One of &#39;score&#39; or &#39;quality&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder indoorAirQuality(SensorAlertsProfilesConditionThresholdIndoorAirQualityArgs indoorAirQuality) {
            return indoorAirQuality(Output.of(indoorAirQuality));
        }

        /**
         * @param noise Noise threshold. &#39;ambient&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder noise(@Nullable Output<SensorAlertsProfilesConditionThresholdNoiseArgs> noise) {
            $.noise = noise;
            return this;
        }

        /**
         * @param noise Noise threshold. &#39;ambient&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder noise(SensorAlertsProfilesConditionThresholdNoiseArgs noise) {
            return noise(Output.of(noise));
        }

        /**
         * @param pm25 PM2.5 concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder pm25(@Nullable Output<SensorAlertsProfilesConditionThresholdPm25Args> pm25) {
            $.pm25 = pm25;
            return this;
        }

        /**
         * @param pm25 PM2.5 concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder pm25(SensorAlertsProfilesConditionThresholdPm25Args pm25) {
            return pm25(Output.of(pm25));
        }

        /**
         * @param powerFactor Power factor threshold. &#39;percentage&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder powerFactor(@Nullable Output<SensorAlertsProfilesConditionThresholdPowerFactorArgs> powerFactor) {
            $.powerFactor = powerFactor;
            return this;
        }

        /**
         * @param powerFactor Power factor threshold. &#39;percentage&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder powerFactor(SensorAlertsProfilesConditionThresholdPowerFactorArgs powerFactor) {
            return powerFactor(Output.of(powerFactor));
        }

        /**
         * @param realPower Real power threshold. &#39;draw&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder realPower(@Nullable Output<SensorAlertsProfilesConditionThresholdRealPowerArgs> realPower) {
            $.realPower = realPower;
            return this;
        }

        /**
         * @param realPower Real power threshold. &#39;draw&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder realPower(SensorAlertsProfilesConditionThresholdRealPowerArgs realPower) {
            return realPower(Output.of(realPower));
        }

        /**
         * @param temperature Temperature threshold. One of &#39;celsius&#39;, &#39;fahrenheit&#39;, or &#39;quality&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder temperature(@Nullable Output<SensorAlertsProfilesConditionThresholdTemperatureArgs> temperature) {
            $.temperature = temperature;
            return this;
        }

        /**
         * @param temperature Temperature threshold. One of &#39;celsius&#39;, &#39;fahrenheit&#39;, or &#39;quality&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder temperature(SensorAlertsProfilesConditionThresholdTemperatureArgs temperature) {
            return temperature(Output.of(temperature));
        }

        /**
         * @param tvoc TVOC concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder tvoc(@Nullable Output<SensorAlertsProfilesConditionThresholdTvocArgs> tvoc) {
            $.tvoc = tvoc;
            return this;
        }

        /**
         * @param tvoc TVOC concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder tvoc(SensorAlertsProfilesConditionThresholdTvocArgs tvoc) {
            return tvoc(Output.of(tvoc));
        }

        /**
         * @param upstreamPower Upstream power threshold. &#39;outageDetected&#39; must be provided and set to true.
         * 
         * @return builder
         * 
         */
        public Builder upstreamPower(@Nullable Output<SensorAlertsProfilesConditionThresholdUpstreamPowerArgs> upstreamPower) {
            $.upstreamPower = upstreamPower;
            return this;
        }

        /**
         * @param upstreamPower Upstream power threshold. &#39;outageDetected&#39; must be provided and set to true.
         * 
         * @return builder
         * 
         */
        public Builder upstreamPower(SensorAlertsProfilesConditionThresholdUpstreamPowerArgs upstreamPower) {
            return upstreamPower(Output.of(upstreamPower));
        }

        /**
         * @param voltage Voltage threshold. &#39;level&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder voltage(@Nullable Output<SensorAlertsProfilesConditionThresholdVoltageArgs> voltage) {
            $.voltage = voltage;
            return this;
        }

        /**
         * @param voltage Voltage threshold. &#39;level&#39; must be provided.
         * 
         * @return builder
         * 
         */
        public Builder voltage(SensorAlertsProfilesConditionThresholdVoltageArgs voltage) {
            return voltage(Output.of(voltage));
        }

        /**
         * @param water Water detection threshold. &#39;present&#39; must be provided and set to true.
         * 
         * @return builder
         * 
         */
        public Builder water(@Nullable Output<SensorAlertsProfilesConditionThresholdWaterArgs> water) {
            $.water = water;
            return this;
        }

        /**
         * @param water Water detection threshold. &#39;present&#39; must be provided and set to true.
         * 
         * @return builder
         * 
         */
        public Builder water(SensorAlertsProfilesConditionThresholdWaterArgs water) {
            return water(Output.of(water));
        }

        public SensorAlertsProfilesConditionThresholdArgs build() {
            return $;
        }
    }

}
