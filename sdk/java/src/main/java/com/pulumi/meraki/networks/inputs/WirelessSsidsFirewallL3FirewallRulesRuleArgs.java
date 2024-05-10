// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsFirewallL3FirewallRulesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsFirewallL3FirewallRulesRuleArgs Empty = new WirelessSsidsFirewallL3FirewallRulesRuleArgs();

    /**
     * Description of the rule (optional)
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Description of the rule (optional)
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Comma-separated list of destination IP address(es) (in IP or CIDR notation), fully-qualified domain names (FQDN) or &#39;any&#39;
     * 
     */
    @Import(name="destCidr")
    private @Nullable Output<String> destCidr;

    /**
     * @return Comma-separated list of destination IP address(es) (in IP or CIDR notation), fully-qualified domain names (FQDN) or &#39;any&#39;
     * 
     */
    public Optional<Output<String>> destCidr() {
        return Optional.ofNullable(this.destCidr);
    }

    /**
     * Comma-separated list of destination port(s) (integer in the range 1-65535), or &#39;any&#39;
     * 
     */
    @Import(name="destPort")
    private @Nullable Output<String> destPort;

    /**
     * @return Comma-separated list of destination port(s) (integer in the range 1-65535), or &#39;any&#39;
     * 
     */
    public Optional<Output<String>> destPort() {
        return Optional.ofNullable(this.destPort);
    }

    /**
     * &#39;allow&#39; or &#39;deny&#39; traffic specified by this rule
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return &#39;allow&#39; or &#39;deny&#39; traffic specified by this rule
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * The type of protocol (must be &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp&#39;, &#39;icmp6&#39; or &#39;any&#39;)
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The type of protocol (must be &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp&#39;, &#39;icmp6&#39; or &#39;any&#39;)
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private WirelessSsidsFirewallL3FirewallRulesRuleArgs() {}

    private WirelessSsidsFirewallL3FirewallRulesRuleArgs(WirelessSsidsFirewallL3FirewallRulesRuleArgs $) {
        this.comment = $.comment;
        this.destCidr = $.destCidr;
        this.destPort = $.destPort;
        this.policy = $.policy;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsFirewallL3FirewallRulesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsFirewallL3FirewallRulesRuleArgs $;

        public Builder() {
            $ = new WirelessSsidsFirewallL3FirewallRulesRuleArgs();
        }

        public Builder(WirelessSsidsFirewallL3FirewallRulesRuleArgs defaults) {
            $ = new WirelessSsidsFirewallL3FirewallRulesRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Description of the rule (optional)
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Description of the rule (optional)
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param destCidr Comma-separated list of destination IP address(es) (in IP or CIDR notation), fully-qualified domain names (FQDN) or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder destCidr(@Nullable Output<String> destCidr) {
            $.destCidr = destCidr;
            return this;
        }

        /**
         * @param destCidr Comma-separated list of destination IP address(es) (in IP or CIDR notation), fully-qualified domain names (FQDN) or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder destCidr(String destCidr) {
            return destCidr(Output.of(destCidr));
        }

        /**
         * @param destPort Comma-separated list of destination port(s) (integer in the range 1-65535), or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder destPort(@Nullable Output<String> destPort) {
            $.destPort = destPort;
            return this;
        }

        /**
         * @param destPort Comma-separated list of destination port(s) (integer in the range 1-65535), or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder destPort(String destPort) {
            return destPort(Output.of(destPort));
        }

        /**
         * @param policy &#39;allow&#39; or &#39;deny&#39; traffic specified by this rule
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy &#39;allow&#39; or &#39;deny&#39; traffic specified by this rule
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param protocol The type of protocol (must be &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp&#39;, &#39;icmp6&#39; or &#39;any&#39;)
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The type of protocol (must be &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp&#39;, &#39;icmp6&#39; or &#39;any&#39;)
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public WirelessSsidsFirewallL3FirewallRulesRuleArgs build() {
            return $;
        }
    }

}
