// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsEapOverrideEapolKey {
    /**
     * @return Maximum number of EAPOL key retries.
     * 
     */
    private @Nullable Integer retries;
    /**
     * @return EAPOL Key timeout in milliseconds.
     * 
     */
    private @Nullable Integer timeoutInMs;

    private WirelessSsidsEapOverrideEapolKey() {}
    /**
     * @return Maximum number of EAPOL key retries.
     * 
     */
    public Optional<Integer> retries() {
        return Optional.ofNullable(this.retries);
    }
    /**
     * @return EAPOL Key timeout in milliseconds.
     * 
     */
    public Optional<Integer> timeoutInMs() {
        return Optional.ofNullable(this.timeoutInMs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsEapOverrideEapolKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer retries;
        private @Nullable Integer timeoutInMs;
        public Builder() {}
        public Builder(WirelessSsidsEapOverrideEapolKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retries = defaults.retries;
    	      this.timeoutInMs = defaults.timeoutInMs;
        }

        @CustomType.Setter
        public Builder retries(@Nullable Integer retries) {

            this.retries = retries;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutInMs(@Nullable Integer timeoutInMs) {

            this.timeoutInMs = timeoutInMs;
            return this;
        }
        public WirelessSsidsEapOverrideEapolKey build() {
            final var _resultValue = new WirelessSsidsEapOverrideEapolKey();
            _resultValue.retries = retries;
            _resultValue.timeoutInMs = timeoutInMs;
            return _resultValue;
        }
    }
}