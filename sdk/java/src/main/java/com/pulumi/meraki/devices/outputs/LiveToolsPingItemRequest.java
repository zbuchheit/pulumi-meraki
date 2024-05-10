// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveToolsPingItemRequest {
    /**
     * @return Number of pings to send
     * 
     */
    private @Nullable Integer count;
    /**
     * @return Device serial number
     * 
     */
    private @Nullable String serial;
    /**
     * @return IP address or FQDN to ping
     * 
     */
    private @Nullable String target;

    private LiveToolsPingItemRequest() {}
    /**
     * @return Number of pings to send
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return Device serial number
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }
    /**
     * @return IP address or FQDN to ping
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveToolsPingItemRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String serial;
        private @Nullable String target;
        public Builder() {}
        public Builder(LiveToolsPingItemRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.serial = defaults.serial;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder count(@Nullable Integer count) {

            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder serial(@Nullable String serial) {

            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable String target) {

            this.target = target;
            return this;
        }
        public LiveToolsPingItemRequest build() {
            final var _resultValue = new LiveToolsPingItemRequest();
            _resultValue.count = count;
            _resultValue.serial = serial;
            _resultValue.target = target;
            return _resultValue;
        }
    }
}
