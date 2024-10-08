// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdApparentPower;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdCurrent;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdDoor;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdFrequency;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdHumidity;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdIndoorAirQuality;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdNoise;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdPm25;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdPowerFactor;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdRealPower;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdTemperature;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdTvoc;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdUpstreamPower;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdVoltage;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesConditionThresholdWater;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SensorAlertsProfilesConditionThreshold {
    /**
     * @return Apparent power threshold. &#39;draw&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdApparentPower apparentPower;
    /**
     * @return Electrical current threshold. &#39;level&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdCurrent current;
    /**
     * @return Door open threshold. &#39;open&#39; must be provided and set to true.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdDoor door;
    /**
     * @return Electrical frequency threshold. &#39;level&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdFrequency frequency;
    /**
     * @return Humidity threshold. One of &#39;relativePercentage&#39; or &#39;quality&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdHumidity humidity;
    /**
     * @return Indoor air quality score threshold. One of &#39;score&#39; or &#39;quality&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdIndoorAirQuality indoorAirQuality;
    /**
     * @return Noise threshold. &#39;ambient&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdNoise noise;
    /**
     * @return PM2.5 concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdPm25 pm25;
    /**
     * @return Power factor threshold. &#39;percentage&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdPowerFactor powerFactor;
    /**
     * @return Real power threshold. &#39;draw&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdRealPower realPower;
    /**
     * @return Temperature threshold. One of &#39;celsius&#39;, &#39;fahrenheit&#39;, or &#39;quality&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdTemperature temperature;
    /**
     * @return TVOC concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdTvoc tvoc;
    /**
     * @return Upstream power threshold. &#39;outageDetected&#39; must be provided and set to true.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdUpstreamPower upstreamPower;
    /**
     * @return Voltage threshold. &#39;level&#39; must be provided.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdVoltage voltage;
    /**
     * @return Water detection threshold. &#39;present&#39; must be provided and set to true.
     * 
     */
    private @Nullable SensorAlertsProfilesConditionThresholdWater water;

    private SensorAlertsProfilesConditionThreshold() {}
    /**
     * @return Apparent power threshold. &#39;draw&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdApparentPower> apparentPower() {
        return Optional.ofNullable(this.apparentPower);
    }
    /**
     * @return Electrical current threshold. &#39;level&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdCurrent> current() {
        return Optional.ofNullable(this.current);
    }
    /**
     * @return Door open threshold. &#39;open&#39; must be provided and set to true.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdDoor> door() {
        return Optional.ofNullable(this.door);
    }
    /**
     * @return Electrical frequency threshold. &#39;level&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdFrequency> frequency() {
        return Optional.ofNullable(this.frequency);
    }
    /**
     * @return Humidity threshold. One of &#39;relativePercentage&#39; or &#39;quality&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdHumidity> humidity() {
        return Optional.ofNullable(this.humidity);
    }
    /**
     * @return Indoor air quality score threshold. One of &#39;score&#39; or &#39;quality&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdIndoorAirQuality> indoorAirQuality() {
        return Optional.ofNullable(this.indoorAirQuality);
    }
    /**
     * @return Noise threshold. &#39;ambient&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdNoise> noise() {
        return Optional.ofNullable(this.noise);
    }
    /**
     * @return PM2.5 concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdPm25> pm25() {
        return Optional.ofNullable(this.pm25);
    }
    /**
     * @return Power factor threshold. &#39;percentage&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdPowerFactor> powerFactor() {
        return Optional.ofNullable(this.powerFactor);
    }
    /**
     * @return Real power threshold. &#39;draw&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdRealPower> realPower() {
        return Optional.ofNullable(this.realPower);
    }
    /**
     * @return Temperature threshold. One of &#39;celsius&#39;, &#39;fahrenheit&#39;, or &#39;quality&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdTemperature> temperature() {
        return Optional.ofNullable(this.temperature);
    }
    /**
     * @return TVOC concentration threshold. One of &#39;concentration&#39; or &#39;quality&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdTvoc> tvoc() {
        return Optional.ofNullable(this.tvoc);
    }
    /**
     * @return Upstream power threshold. &#39;outageDetected&#39; must be provided and set to true.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdUpstreamPower> upstreamPower() {
        return Optional.ofNullable(this.upstreamPower);
    }
    /**
     * @return Voltage threshold. &#39;level&#39; must be provided.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdVoltage> voltage() {
        return Optional.ofNullable(this.voltage);
    }
    /**
     * @return Water detection threshold. &#39;present&#39; must be provided and set to true.
     * 
     */
    public Optional<SensorAlertsProfilesConditionThresholdWater> water() {
        return Optional.ofNullable(this.water);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SensorAlertsProfilesConditionThreshold defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SensorAlertsProfilesConditionThresholdApparentPower apparentPower;
        private @Nullable SensorAlertsProfilesConditionThresholdCurrent current;
        private @Nullable SensorAlertsProfilesConditionThresholdDoor door;
        private @Nullable SensorAlertsProfilesConditionThresholdFrequency frequency;
        private @Nullable SensorAlertsProfilesConditionThresholdHumidity humidity;
        private @Nullable SensorAlertsProfilesConditionThresholdIndoorAirQuality indoorAirQuality;
        private @Nullable SensorAlertsProfilesConditionThresholdNoise noise;
        private @Nullable SensorAlertsProfilesConditionThresholdPm25 pm25;
        private @Nullable SensorAlertsProfilesConditionThresholdPowerFactor powerFactor;
        private @Nullable SensorAlertsProfilesConditionThresholdRealPower realPower;
        private @Nullable SensorAlertsProfilesConditionThresholdTemperature temperature;
        private @Nullable SensorAlertsProfilesConditionThresholdTvoc tvoc;
        private @Nullable SensorAlertsProfilesConditionThresholdUpstreamPower upstreamPower;
        private @Nullable SensorAlertsProfilesConditionThresholdVoltage voltage;
        private @Nullable SensorAlertsProfilesConditionThresholdWater water;
        public Builder() {}
        public Builder(SensorAlertsProfilesConditionThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apparentPower = defaults.apparentPower;
    	      this.current = defaults.current;
    	      this.door = defaults.door;
    	      this.frequency = defaults.frequency;
    	      this.humidity = defaults.humidity;
    	      this.indoorAirQuality = defaults.indoorAirQuality;
    	      this.noise = defaults.noise;
    	      this.pm25 = defaults.pm25;
    	      this.powerFactor = defaults.powerFactor;
    	      this.realPower = defaults.realPower;
    	      this.temperature = defaults.temperature;
    	      this.tvoc = defaults.tvoc;
    	      this.upstreamPower = defaults.upstreamPower;
    	      this.voltage = defaults.voltage;
    	      this.water = defaults.water;
        }

        @CustomType.Setter
        public Builder apparentPower(@Nullable SensorAlertsProfilesConditionThresholdApparentPower apparentPower) {

            this.apparentPower = apparentPower;
            return this;
        }
        @CustomType.Setter
        public Builder current(@Nullable SensorAlertsProfilesConditionThresholdCurrent current) {

            this.current = current;
            return this;
        }
        @CustomType.Setter
        public Builder door(@Nullable SensorAlertsProfilesConditionThresholdDoor door) {

            this.door = door;
            return this;
        }
        @CustomType.Setter
        public Builder frequency(@Nullable SensorAlertsProfilesConditionThresholdFrequency frequency) {

            this.frequency = frequency;
            return this;
        }
        @CustomType.Setter
        public Builder humidity(@Nullable SensorAlertsProfilesConditionThresholdHumidity humidity) {

            this.humidity = humidity;
            return this;
        }
        @CustomType.Setter
        public Builder indoorAirQuality(@Nullable SensorAlertsProfilesConditionThresholdIndoorAirQuality indoorAirQuality) {

            this.indoorAirQuality = indoorAirQuality;
            return this;
        }
        @CustomType.Setter
        public Builder noise(@Nullable SensorAlertsProfilesConditionThresholdNoise noise) {

            this.noise = noise;
            return this;
        }
        @CustomType.Setter
        public Builder pm25(@Nullable SensorAlertsProfilesConditionThresholdPm25 pm25) {

            this.pm25 = pm25;
            return this;
        }
        @CustomType.Setter
        public Builder powerFactor(@Nullable SensorAlertsProfilesConditionThresholdPowerFactor powerFactor) {

            this.powerFactor = powerFactor;
            return this;
        }
        @CustomType.Setter
        public Builder realPower(@Nullable SensorAlertsProfilesConditionThresholdRealPower realPower) {

            this.realPower = realPower;
            return this;
        }
        @CustomType.Setter
        public Builder temperature(@Nullable SensorAlertsProfilesConditionThresholdTemperature temperature) {

            this.temperature = temperature;
            return this;
        }
        @CustomType.Setter
        public Builder tvoc(@Nullable SensorAlertsProfilesConditionThresholdTvoc tvoc) {

            this.tvoc = tvoc;
            return this;
        }
        @CustomType.Setter
        public Builder upstreamPower(@Nullable SensorAlertsProfilesConditionThresholdUpstreamPower upstreamPower) {

            this.upstreamPower = upstreamPower;
            return this;
        }
        @CustomType.Setter
        public Builder voltage(@Nullable SensorAlertsProfilesConditionThresholdVoltage voltage) {

            this.voltage = voltage;
            return this;
        }
        @CustomType.Setter
        public Builder water(@Nullable SensorAlertsProfilesConditionThresholdWater water) {

            this.water = water;
            return this;
        }
        public SensorAlertsProfilesConditionThreshold build() {
            final var _resultValue = new SensorAlertsProfilesConditionThreshold();
            _resultValue.apparentPower = apparentPower;
            _resultValue.current = current;
            _resultValue.door = door;
            _resultValue.frequency = frequency;
            _resultValue.humidity = humidity;
            _resultValue.indoorAirQuality = indoorAirQuality;
            _resultValue.noise = noise;
            _resultValue.pm25 = pm25;
            _resultValue.powerFactor = powerFactor;
            _resultValue.realPower = realPower;
            _resultValue.temperature = temperature;
            _resultValue.tvoc = tvoc;
            _resultValue.upstreamPower = upstreamPower;
            _resultValue.voltage = voltage;
            _resultValue.water = water;
            return _resultValue;
        }
    }
}
