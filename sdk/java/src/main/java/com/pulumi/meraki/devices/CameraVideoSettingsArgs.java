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


public final class CameraVideoSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CameraVideoSettingsArgs Empty = new CameraVideoSettingsArgs();

    /**
     * Boolean indicating if external rtsp stream is exposed
     * 
     */
    @Import(name="externalRtspEnabled")
    private @Nullable Output<Boolean> externalRtspEnabled;

    /**
     * @return Boolean indicating if external rtsp stream is exposed
     * 
     */
    public Optional<Output<Boolean>> externalRtspEnabled() {
        return Optional.ofNullable(this.externalRtspEnabled);
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

    private CameraVideoSettingsArgs() {}

    private CameraVideoSettingsArgs(CameraVideoSettingsArgs $) {
        this.externalRtspEnabled = $.externalRtspEnabled;
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CameraVideoSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CameraVideoSettingsArgs $;

        public Builder() {
            $ = new CameraVideoSettingsArgs();
        }

        public Builder(CameraVideoSettingsArgs defaults) {
            $ = new CameraVideoSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalRtspEnabled Boolean indicating if external rtsp stream is exposed
         * 
         * @return builder
         * 
         */
        public Builder externalRtspEnabled(@Nullable Output<Boolean> externalRtspEnabled) {
            $.externalRtspEnabled = externalRtspEnabled;
            return this;
        }

        /**
         * @param externalRtspEnabled Boolean indicating if external rtsp stream is exposed
         * 
         * @return builder
         * 
         */
        public Builder externalRtspEnabled(Boolean externalRtspEnabled) {
            return externalRtspEnabled(Output.of(externalRtspEnabled));
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

        public CameraVideoSettingsArgs build() {
            if ($.serial == null) {
                throw new MissingRequiredPropertyException("CameraVideoSettingsArgs", "serial");
            }
            return $;
        }
    }

}