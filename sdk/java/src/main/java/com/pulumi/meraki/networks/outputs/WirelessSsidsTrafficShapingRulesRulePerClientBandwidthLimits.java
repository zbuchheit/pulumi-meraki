// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.WirelessSsidsTrafficShapingRulesRulePerClientBandwidthLimitsBandwidthLimits;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsTrafficShapingRulesRulePerClientBandwidthLimits {
    /**
     * @return The bandwidth limits object, specifying the upload (&#39;limitUp&#39;) and download (&#39;limitDown&#39;) speed in Kbps. These are only enforced if &#39;settings&#39; is set to &#39;custom&#39;.
     * 
     */
    private @Nullable WirelessSsidsTrafficShapingRulesRulePerClientBandwidthLimitsBandwidthLimits bandwidthLimits;
    /**
     * @return How bandwidth limits are applied by your rule. Can be one of &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    private @Nullable String settings;

    private WirelessSsidsTrafficShapingRulesRulePerClientBandwidthLimits() {}
    /**
     * @return The bandwidth limits object, specifying the upload (&#39;limitUp&#39;) and download (&#39;limitDown&#39;) speed in Kbps. These are only enforced if &#39;settings&#39; is set to &#39;custom&#39;.
     * 
     */
    public Optional<WirelessSsidsTrafficShapingRulesRulePerClientBandwidthLimitsBandwidthLimits> bandwidthLimits() {
        return Optional.ofNullable(this.bandwidthLimits);
    }
    /**
     * @return How bandwidth limits are applied by your rule. Can be one of &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    public Optional<String> settings() {
        return Optional.ofNullable(this.settings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsTrafficShapingRulesRulePerClientBandwidthLimits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WirelessSsidsTrafficShapingRulesRulePerClientBandwidthLimitsBandwidthLimits bandwidthLimits;
        private @Nullable String settings;
        public Builder() {}
        public Builder(WirelessSsidsTrafficShapingRulesRulePerClientBandwidthLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthLimits = defaults.bandwidthLimits;
    	      this.settings = defaults.settings;
        }

        @CustomType.Setter
        public Builder bandwidthLimits(@Nullable WirelessSsidsTrafficShapingRulesRulePerClientBandwidthLimitsBandwidthLimits bandwidthLimits) {

            this.bandwidthLimits = bandwidthLimits;
            return this;
        }
        @CustomType.Setter
        public Builder settings(@Nullable String settings) {

            this.settings = settings;
            return this;
        }
        public WirelessSsidsTrafficShapingRulesRulePerClientBandwidthLimits build() {
            final var _resultValue = new WirelessSsidsTrafficShapingRulesRulePerClientBandwidthLimits();
            _resultValue.bandwidthLimits = bandwidthLimits;
            _resultValue.settings = settings;
            return _resultValue;
        }
    }
}
