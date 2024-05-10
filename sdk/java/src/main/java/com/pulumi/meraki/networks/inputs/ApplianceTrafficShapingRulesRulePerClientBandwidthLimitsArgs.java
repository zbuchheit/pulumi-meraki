// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsBandwidthLimitsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs Empty = new ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs();

    /**
     * The bandwidth limits object, specifying the upload (&#39;limitUp&#39;) and download (&#39;limitDown&#39;) speed in Kbps. These are only enforced if &#39;settings&#39; is set to &#39;custom&#39;.
     * 
     */
    @Import(name="bandwidthLimits")
    private @Nullable Output<ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsBandwidthLimitsArgs> bandwidthLimits;

    /**
     * @return The bandwidth limits object, specifying the upload (&#39;limitUp&#39;) and download (&#39;limitDown&#39;) speed in Kbps. These are only enforced if &#39;settings&#39; is set to &#39;custom&#39;.
     * 
     */
    public Optional<Output<ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsBandwidthLimitsArgs>> bandwidthLimits() {
        return Optional.ofNullable(this.bandwidthLimits);
    }

    /**
     * How bandwidth limits are applied by your rule. Can be one of &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<String> settings;

    /**
     * @return How bandwidth limits are applied by your rule. Can be one of &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    public Optional<Output<String>> settings() {
        return Optional.ofNullable(this.settings);
    }

    private ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs() {}

    private ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs(ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs $) {
        this.bandwidthLimits = $.bandwidthLimits;
        this.settings = $.settings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs $;

        public Builder() {
            $ = new ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs();
        }

        public Builder(ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs defaults) {
            $ = new ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthLimits The bandwidth limits object, specifying the upload (&#39;limitUp&#39;) and download (&#39;limitDown&#39;) speed in Kbps. These are only enforced if &#39;settings&#39; is set to &#39;custom&#39;.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimits(@Nullable Output<ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsBandwidthLimitsArgs> bandwidthLimits) {
            $.bandwidthLimits = bandwidthLimits;
            return this;
        }

        /**
         * @param bandwidthLimits The bandwidth limits object, specifying the upload (&#39;limitUp&#39;) and download (&#39;limitDown&#39;) speed in Kbps. These are only enforced if &#39;settings&#39; is set to &#39;custom&#39;.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimits(ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsBandwidthLimitsArgs bandwidthLimits) {
            return bandwidthLimits(Output.of(bandwidthLimits));
        }

        /**
         * @param settings How bandwidth limits are applied by your rule. Can be one of &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<String> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings How bandwidth limits are applied by your rule. Can be one of &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
         * 
         * @return builder
         * 
         */
        public Builder settings(String settings) {
            return settings(Output.of(settings));
        }

        public ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs build() {
            return $;
        }
    }

}
