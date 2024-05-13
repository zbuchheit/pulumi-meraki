// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.inputs.CameraSenseAudioDetectionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CameraSenseArgs extends com.pulumi.resources.ResourceArgs {

    public static final CameraSenseArgs Empty = new CameraSenseArgs();

    /**
     * The details of the audio detection config.
     * 
     */
    @Import(name="audioDetection")
    private @Nullable Output<CameraSenseAudioDetectionArgs> audioDetection;

    /**
     * @return The details of the audio detection config.
     * 
     */
    public Optional<Output<CameraSenseAudioDetectionArgs>> audioDetection() {
        return Optional.ofNullable(this.audioDetection);
    }

    /**
     * The ID of the object detection model
     * 
     */
    @Import(name="detectionModelId")
    private @Nullable Output<String> detectionModelId;

    /**
     * @return The ID of the object detection model
     * 
     */
    public Optional<Output<String>> detectionModelId() {
        return Optional.ofNullable(this.detectionModelId);
    }

    /**
     * The ID of the MQTT broker to be enabled on the camera. A value of null will disable MQTT on the camera
     * 
     */
    @Import(name="mqttBrokerId")
    private @Nullable Output<String> mqttBrokerId;

    /**
     * @return The ID of the MQTT broker to be enabled on the camera. A value of null will disable MQTT on the camera
     * 
     */
    public Optional<Output<String>> mqttBrokerId() {
        return Optional.ofNullable(this.mqttBrokerId);
    }

    /**
     * Boolean indicating if sense(license) is enabled(true) or disabled(false) on the camera
     * 
     */
    @Import(name="senseEnabled")
    private @Nullable Output<Boolean> senseEnabled;

    /**
     * @return Boolean indicating if sense(license) is enabled(true) or disabled(false) on the camera
     * 
     */
    public Optional<Output<Boolean>> senseEnabled() {
        return Optional.ofNullable(this.senseEnabled);
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

    private CameraSenseArgs() {}

    private CameraSenseArgs(CameraSenseArgs $) {
        this.audioDetection = $.audioDetection;
        this.detectionModelId = $.detectionModelId;
        this.mqttBrokerId = $.mqttBrokerId;
        this.senseEnabled = $.senseEnabled;
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CameraSenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CameraSenseArgs $;

        public Builder() {
            $ = new CameraSenseArgs();
        }

        public Builder(CameraSenseArgs defaults) {
            $ = new CameraSenseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audioDetection The details of the audio detection config.
         * 
         * @return builder
         * 
         */
        public Builder audioDetection(@Nullable Output<CameraSenseAudioDetectionArgs> audioDetection) {
            $.audioDetection = audioDetection;
            return this;
        }

        /**
         * @param audioDetection The details of the audio detection config.
         * 
         * @return builder
         * 
         */
        public Builder audioDetection(CameraSenseAudioDetectionArgs audioDetection) {
            return audioDetection(Output.of(audioDetection));
        }

        /**
         * @param detectionModelId The ID of the object detection model
         * 
         * @return builder
         * 
         */
        public Builder detectionModelId(@Nullable Output<String> detectionModelId) {
            $.detectionModelId = detectionModelId;
            return this;
        }

        /**
         * @param detectionModelId The ID of the object detection model
         * 
         * @return builder
         * 
         */
        public Builder detectionModelId(String detectionModelId) {
            return detectionModelId(Output.of(detectionModelId));
        }

        /**
         * @param mqttBrokerId The ID of the MQTT broker to be enabled on the camera. A value of null will disable MQTT on the camera
         * 
         * @return builder
         * 
         */
        public Builder mqttBrokerId(@Nullable Output<String> mqttBrokerId) {
            $.mqttBrokerId = mqttBrokerId;
            return this;
        }

        /**
         * @param mqttBrokerId The ID of the MQTT broker to be enabled on the camera. A value of null will disable MQTT on the camera
         * 
         * @return builder
         * 
         */
        public Builder mqttBrokerId(String mqttBrokerId) {
            return mqttBrokerId(Output.of(mqttBrokerId));
        }

        /**
         * @param senseEnabled Boolean indicating if sense(license) is enabled(true) or disabled(false) on the camera
         * 
         * @return builder
         * 
         */
        public Builder senseEnabled(@Nullable Output<Boolean> senseEnabled) {
            $.senseEnabled = senseEnabled;
            return this;
        }

        /**
         * @param senseEnabled Boolean indicating if sense(license) is enabled(true) or disabled(false) on the camera
         * 
         * @return builder
         * 
         */
        public Builder senseEnabled(Boolean senseEnabled) {
            return senseEnabled(Output.of(senseEnabled));
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

        public CameraSenseArgs build() {
            if ($.serial == null) {
                throw new MissingRequiredPropertyException("CameraSenseArgs", "serial");
            }
            return $;
        }
    }

}