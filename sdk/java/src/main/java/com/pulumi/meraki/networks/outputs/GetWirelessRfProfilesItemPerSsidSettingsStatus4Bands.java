// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWirelessRfProfilesItemPerSsidSettingsStatus4Bands {
    /**
     * @return List of enabled bands. Can include [&#34;2.4&#34;, &#34;5&#34;, &#34;6&#34;, &#34;disabled&#34;
     * 
     */
    private List<String> enableds;

    private GetWirelessRfProfilesItemPerSsidSettingsStatus4Bands() {}
    /**
     * @return List of enabled bands. Can include [&#34;2.4&#34;, &#34;5&#34;, &#34;6&#34;, &#34;disabled&#34;
     * 
     */
    public List<String> enableds() {
        return this.enableds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessRfProfilesItemPerSsidSettingsStatus4Bands defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> enableds;
        public Builder() {}
        public Builder(GetWirelessRfProfilesItemPerSsidSettingsStatus4Bands defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableds = defaults.enableds;
        }

        @CustomType.Setter
        public Builder enableds(List<String> enableds) {
            if (enableds == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesItemPerSsidSettingsStatus4Bands", "enableds");
            }
            this.enableds = enableds;
            return this;
        }
        public Builder enableds(String... enableds) {
            return enableds(List.of(enableds));
        }
        public GetWirelessRfProfilesItemPerSsidSettingsStatus4Bands build() {
            final var _resultValue = new GetWirelessRfProfilesItemPerSsidSettingsStatus4Bands();
            _resultValue.enableds = enableds;
            return _resultValue;
        }
    }
}
