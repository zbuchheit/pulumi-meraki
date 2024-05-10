// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessRfProfilesPerSsidSettingsStatus8BandsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessRfProfilesPerSsidSettingsStatus8BandsArgs Empty = new WirelessRfProfilesPerSsidSettingsStatus8BandsArgs();

    /**
     * List of enabled bands. Can include [&#34;2.4&#34;, &#34;5&#34;, &#34;6&#34;, &#34;disabled&#34;
     * 
     */
    @Import(name="enableds")
    private @Nullable Output<List<String>> enableds;

    /**
     * @return List of enabled bands. Can include [&#34;2.4&#34;, &#34;5&#34;, &#34;6&#34;, &#34;disabled&#34;
     * 
     */
    public Optional<Output<List<String>>> enableds() {
        return Optional.ofNullable(this.enableds);
    }

    private WirelessRfProfilesPerSsidSettingsStatus8BandsArgs() {}

    private WirelessRfProfilesPerSsidSettingsStatus8BandsArgs(WirelessRfProfilesPerSsidSettingsStatus8BandsArgs $) {
        this.enableds = $.enableds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessRfProfilesPerSsidSettingsStatus8BandsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessRfProfilesPerSsidSettingsStatus8BandsArgs $;

        public Builder() {
            $ = new WirelessRfProfilesPerSsidSettingsStatus8BandsArgs();
        }

        public Builder(WirelessRfProfilesPerSsidSettingsStatus8BandsArgs defaults) {
            $ = new WirelessRfProfilesPerSsidSettingsStatus8BandsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableds List of enabled bands. Can include [&#34;2.4&#34;, &#34;5&#34;, &#34;6&#34;, &#34;disabled&#34;
         * 
         * @return builder
         * 
         */
        public Builder enableds(@Nullable Output<List<String>> enableds) {
            $.enableds = enableds;
            return this;
        }

        /**
         * @param enableds List of enabled bands. Can include [&#34;2.4&#34;, &#34;5&#34;, &#34;6&#34;, &#34;disabled&#34;
         * 
         * @return builder
         * 
         */
        public Builder enableds(List<String> enableds) {
            return enableds(Output.of(enableds));
        }

        /**
         * @param enableds List of enabled bands. Can include [&#34;2.4&#34;, &#34;5&#34;, &#34;6&#34;, &#34;disabled&#34;
         * 
         * @return builder
         * 
         */
        public Builder enableds(String... enableds) {
            return enableds(List.of(enableds));
        }

        public WirelessRfProfilesPerSsidSettingsStatus8BandsArgs build() {
            return $;
        }
    }

}
