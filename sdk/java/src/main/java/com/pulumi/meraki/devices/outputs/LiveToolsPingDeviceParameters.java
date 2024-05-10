// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.devices.outputs.LiveToolsPingDeviceParametersCallback;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveToolsPingDeviceParameters {
    /**
     * @return Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    private @Nullable LiveToolsPingDeviceParametersCallback callback;
    /**
     * @return Count parameter to pass to ping. [1..5], default 5
     * 
     */
    private @Nullable Integer count;

    private LiveToolsPingDeviceParameters() {}
    /**
     * @return Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    public Optional<LiveToolsPingDeviceParametersCallback> callback() {
        return Optional.ofNullable(this.callback);
    }
    /**
     * @return Count parameter to pass to ping. [1..5], default 5
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveToolsPingDeviceParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LiveToolsPingDeviceParametersCallback callback;
        private @Nullable Integer count;
        public Builder() {}
        public Builder(LiveToolsPingDeviceParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callback = defaults.callback;
    	      this.count = defaults.count;
        }

        @CustomType.Setter
        public Builder callback(@Nullable LiveToolsPingDeviceParametersCallback callback) {

            this.callback = callback;
            return this;
        }
        @CustomType.Setter
        public Builder count(@Nullable Integer count) {

            this.count = count;
            return this;
        }
        public LiveToolsPingDeviceParameters build() {
            final var _resultValue = new LiveToolsPingDeviceParameters();
            _resultValue.callback = callback;
            _resultValue.count = count;
            return _resultValue;
        }
    }
}
