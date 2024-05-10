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


public final class WirelessSsidsNamedVlansTaggingByApTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsNamedVlansTaggingByApTagArgs Empty = new WirelessSsidsNamedVlansTaggingByApTagArgs();

    /**
     * List of AP tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return List of AP tags.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * VLAN name that will be used to tag traffic.
     * 
     */
    @Import(name="vlanName")
    private @Nullable Output<String> vlanName;

    /**
     * @return VLAN name that will be used to tag traffic.
     * 
     */
    public Optional<Output<String>> vlanName() {
        return Optional.ofNullable(this.vlanName);
    }

    private WirelessSsidsNamedVlansTaggingByApTagArgs() {}

    private WirelessSsidsNamedVlansTaggingByApTagArgs(WirelessSsidsNamedVlansTaggingByApTagArgs $) {
        this.tags = $.tags;
        this.vlanName = $.vlanName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsNamedVlansTaggingByApTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsNamedVlansTaggingByApTagArgs $;

        public Builder() {
            $ = new WirelessSsidsNamedVlansTaggingByApTagArgs();
        }

        public Builder(WirelessSsidsNamedVlansTaggingByApTagArgs defaults) {
            $ = new WirelessSsidsNamedVlansTaggingByApTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tags List of AP tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags List of AP tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags List of AP tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param vlanName VLAN name that will be used to tag traffic.
         * 
         * @return builder
         * 
         */
        public Builder vlanName(@Nullable Output<String> vlanName) {
            $.vlanName = vlanName;
            return this;
        }

        /**
         * @param vlanName VLAN name that will be used to tag traffic.
         * 
         * @return builder
         * 
         */
        public Builder vlanName(String vlanName) {
            return vlanName(Output.of(vlanName));
        }

        public WirelessSsidsNamedVlansTaggingByApTagArgs build() {
            return $;
        }
    }

}
