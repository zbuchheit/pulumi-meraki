// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceTrafficShapingCustomPerformanceClassesParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceTrafficShapingCustomPerformanceClassesParametersArgs Empty = new ApplianceTrafficShapingCustomPerformanceClassesParametersArgs();

    /**
     * Maximum jitter in milliseconds
     * 
     */
    @Import(name="maxJitter")
    private @Nullable Output<Integer> maxJitter;

    /**
     * @return Maximum jitter in milliseconds
     * 
     */
    public Optional<Output<Integer>> maxJitter() {
        return Optional.ofNullable(this.maxJitter);
    }

    /**
     * Maximum latency in milliseconds
     * 
     */
    @Import(name="maxLatency")
    private @Nullable Output<Integer> maxLatency;

    /**
     * @return Maximum latency in milliseconds
     * 
     */
    public Optional<Output<Integer>> maxLatency() {
        return Optional.ofNullable(this.maxLatency);
    }

    /**
     * Maximum percentage of packet loss
     * 
     */
    @Import(name="maxLossPercentage")
    private @Nullable Output<Integer> maxLossPercentage;

    /**
     * @return Maximum percentage of packet loss
     * 
     */
    public Optional<Output<Integer>> maxLossPercentage() {
        return Optional.ofNullable(this.maxLossPercentage);
    }

    /**
     * Name of the custom performance class
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the custom performance class
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ApplianceTrafficShapingCustomPerformanceClassesParametersArgs() {}

    private ApplianceTrafficShapingCustomPerformanceClassesParametersArgs(ApplianceTrafficShapingCustomPerformanceClassesParametersArgs $) {
        this.maxJitter = $.maxJitter;
        this.maxLatency = $.maxLatency;
        this.maxLossPercentage = $.maxLossPercentage;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceTrafficShapingCustomPerformanceClassesParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceTrafficShapingCustomPerformanceClassesParametersArgs $;

        public Builder() {
            $ = new ApplianceTrafficShapingCustomPerformanceClassesParametersArgs();
        }

        public Builder(ApplianceTrafficShapingCustomPerformanceClassesParametersArgs defaults) {
            $ = new ApplianceTrafficShapingCustomPerformanceClassesParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxJitter Maximum jitter in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder maxJitter(@Nullable Output<Integer> maxJitter) {
            $.maxJitter = maxJitter;
            return this;
        }

        /**
         * @param maxJitter Maximum jitter in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder maxJitter(Integer maxJitter) {
            return maxJitter(Output.of(maxJitter));
        }

        /**
         * @param maxLatency Maximum latency in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder maxLatency(@Nullable Output<Integer> maxLatency) {
            $.maxLatency = maxLatency;
            return this;
        }

        /**
         * @param maxLatency Maximum latency in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder maxLatency(Integer maxLatency) {
            return maxLatency(Output.of(maxLatency));
        }

        /**
         * @param maxLossPercentage Maximum percentage of packet loss
         * 
         * @return builder
         * 
         */
        public Builder maxLossPercentage(@Nullable Output<Integer> maxLossPercentage) {
            $.maxLossPercentage = maxLossPercentage;
            return this;
        }

        /**
         * @param maxLossPercentage Maximum percentage of packet loss
         * 
         * @return builder
         * 
         */
        public Builder maxLossPercentage(Integer maxLossPercentage) {
            return maxLossPercentage(Output.of(maxLossPercentage));
        }

        /**
         * @param name Name of the custom performance class
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the custom performance class
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApplianceTrafficShapingCustomPerformanceClassesParametersArgs build() {
            return $;
        }
    }

}
