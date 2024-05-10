// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.devices.outputs.LiveToolsThroughputTestResultSpeeds;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveToolsThroughputTestResult {
    /**
     * @return Shows the speeds (Mbps)
     * 
     */
    private @Nullable LiveToolsThroughputTestResultSpeeds speeds;

    private LiveToolsThroughputTestResult() {}
    /**
     * @return Shows the speeds (Mbps)
     * 
     */
    public Optional<LiveToolsThroughputTestResultSpeeds> speeds() {
        return Optional.ofNullable(this.speeds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveToolsThroughputTestResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LiveToolsThroughputTestResultSpeeds speeds;
        public Builder() {}
        public Builder(LiveToolsThroughputTestResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.speeds = defaults.speeds;
        }

        @CustomType.Setter
        public Builder speeds(@Nullable LiveToolsThroughputTestResultSpeeds speeds) {

            this.speeds = speeds;
            return this;
        }
        public LiveToolsThroughputTestResult build() {
            final var _resultValue = new LiveToolsThroughputTestResult();
            _resultValue.speeds = speeds;
            return _resultValue;
        }
    }
}
