// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestinationArgs;
import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueSourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs Empty = new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs();

    /**
     * Destination of &#39;custom&#39; type traffic filter
     * 
     */
    @Import(name="destination")
    private @Nullable Output<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestinationArgs> destination;

    /**
     * @return Destination of &#39;custom&#39; type traffic filter
     * 
     */
    public Optional<Output<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestinationArgs>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * Protocol of &#39;custom&#39; type traffic filter. Must be one of: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp6&#39; or &#39;any&#39;
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Protocol of &#39;custom&#39; type traffic filter. Must be one of: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp6&#39; or &#39;any&#39;
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Source of &#39;custom&#39; type traffic filter
     * 
     */
    @Import(name="source")
    private @Nullable Output<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueSourceArgs> source;

    /**
     * @return Source of &#39;custom&#39; type traffic filter
     * 
     */
    public Optional<Output<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    private ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs() {}

    private ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs $) {
        this.destination = $.destination;
        this.protocol = $.protocol;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs $;

        public Builder() {
            $ = new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs();
        }

        public Builder(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs defaults) {
            $ = new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination Destination of &#39;custom&#39; type traffic filter
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Destination of &#39;custom&#39; type traffic filter
         * 
         * @return builder
         * 
         */
        public Builder destination(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param protocol Protocol of &#39;custom&#39; type traffic filter. Must be one of: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp6&#39; or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Protocol of &#39;custom&#39; type traffic filter. Must be one of: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp6&#39; or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param source Source of &#39;custom&#39; type traffic filter
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Source of &#39;custom&#39; type traffic filter
         * 
         * @return builder
         * 
         */
        public Builder source(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueSourceArgs source) {
            return source(Output.of(source));
        }

        public ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs build() {
            return $;
        }
    }

}
