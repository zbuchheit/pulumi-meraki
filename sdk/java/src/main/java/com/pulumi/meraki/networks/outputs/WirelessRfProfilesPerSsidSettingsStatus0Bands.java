// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WirelessRfProfilesPerSsidSettingsStatus0Bands {
    /**
     * @return List of enabled bands. Can include [&#34;2.4&#34;, &#34;5&#34;, &#34;6&#34;, &#34;disabled&#34;
     * 
     */
    private @Nullable List<String> enableds;

    private WirelessRfProfilesPerSsidSettingsStatus0Bands() {}
    /**
     * @return List of enabled bands. Can include [&#34;2.4&#34;, &#34;5&#34;, &#34;6&#34;, &#34;disabled&#34;
     * 
     */
    public List<String> enableds() {
        return this.enableds == null ? List.of() : this.enableds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessRfProfilesPerSsidSettingsStatus0Bands defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> enableds;
        public Builder() {}
        public Builder(WirelessRfProfilesPerSsidSettingsStatus0Bands defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableds = defaults.enableds;
        }

        @CustomType.Setter
        public Builder enableds(@Nullable List<String> enableds) {

            this.enableds = enableds;
            return this;
        }
        public Builder enableds(String... enableds) {
            return enableds(List.of(enableds));
        }
        public WirelessRfProfilesPerSsidSettingsStatus0Bands build() {
            final var _resultValue = new WirelessRfProfilesPerSsidSettingsStatus0Bands();
            _resultValue.enableds = enableds;
            return _resultValue;
        }
    }
}
