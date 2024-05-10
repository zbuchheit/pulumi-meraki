// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceFirewallInboundFirewallRulesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceFirewallInboundFirewallRulesRuleArgs Empty = new ApplianceFirewallInboundFirewallRulesRuleArgs();

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

    /**
     * Comma-separated list of source IP address(es) (in IP or CIDR notation), or &#39;any&#39; (note: FQDN not supported for source addresses)
     * 
     */
    @Import(name="srcCidr")
    private @Nullable Output<String> srcCidr;

    /**
     * @return Comma-separated list of source IP address(es) (in IP or CIDR notation), or &#39;any&#39; (note: FQDN not supported for source addresses)
     * 
     */
    public Optional<Output<String>> srcCidr() {
        return Optional.ofNullable(this.srcCidr);
    }

    /**
     * Comma-separated list of source port(s) (integer in the range 1-65535), or &#39;any&#39;
     * 
     */
    @Import(name="srcPort")
    private @Nullable Output<String> srcPort;

    /**
     * @return Comma-separated list of source port(s) (integer in the range 1-65535), or &#39;any&#39;
     * 
     */
    public Optional<Output<String>> srcPort() {
        return Optional.ofNullable(this.srcPort);
    }

    /**
     * Log this rule to syslog (true or false, boolean value) - only applicable if a syslog has been configured (optional)
     * 
     */
    @Import(name="syslogEnabled")
    private @Nullable Output<Boolean> syslogEnabled;

    /**
     * @return Log this rule to syslog (true or false, boolean value) - only applicable if a syslog has been configured (optional)
     * 
     */
    public Optional<Output<Boolean>> syslogEnabled() {
        return Optional.ofNullable(this.syslogEnabled);
    }

    private ApplianceFirewallInboundFirewallRulesRuleArgs() {}

    private ApplianceFirewallInboundFirewallRulesRuleArgs(ApplianceFirewallInboundFirewallRulesRuleArgs $) {
        this.comment = $.comment;
        this.destCidr = $.destCidr;
        this.destPort = $.destPort;
        this.policy = $.policy;
        this.protocol = $.protocol;
        this.srcCidr = $.srcCidr;
        this.srcPort = $.srcPort;
        this.syslogEnabled = $.syslogEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceFirewallInboundFirewallRulesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceFirewallInboundFirewallRulesRuleArgs $;

        public Builder() {
            $ = new ApplianceFirewallInboundFirewallRulesRuleArgs();
        }

        public Builder(ApplianceFirewallInboundFirewallRulesRuleArgs defaults) {
            $ = new ApplianceFirewallInboundFirewallRulesRuleArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param srcCidr Comma-separated list of source IP address(es) (in IP or CIDR notation), or &#39;any&#39; (note: FQDN not supported for source addresses)
         * 
         * @return builder
         * 
         */
        public Builder srcCidr(@Nullable Output<String> srcCidr) {
            $.srcCidr = srcCidr;
            return this;
        }

        /**
         * @param srcCidr Comma-separated list of source IP address(es) (in IP or CIDR notation), or &#39;any&#39; (note: FQDN not supported for source addresses)
         * 
         * @return builder
         * 
         */
        public Builder srcCidr(String srcCidr) {
            return srcCidr(Output.of(srcCidr));
        }

        /**
         * @param srcPort Comma-separated list of source port(s) (integer in the range 1-65535), or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder srcPort(@Nullable Output<String> srcPort) {
            $.srcPort = srcPort;
            return this;
        }

        /**
         * @param srcPort Comma-separated list of source port(s) (integer in the range 1-65535), or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder srcPort(String srcPort) {
            return srcPort(Output.of(srcPort));
        }

        /**
         * @param syslogEnabled Log this rule to syslog (true or false, boolean value) - only applicable if a syslog has been configured (optional)
         * 
         * @return builder
         * 
         */
        public Builder syslogEnabled(@Nullable Output<Boolean> syslogEnabled) {
            $.syslogEnabled = syslogEnabled;
            return this;
        }

        /**
         * @param syslogEnabled Log this rule to syslog (true or false, boolean value) - only applicable if a syslog has been configured (optional)
         * 
         * @return builder
         * 
         */
        public Builder syslogEnabled(Boolean syslogEnabled) {
            return syslogEnabled(Output.of(syslogEnabled));
        }

        public ApplianceFirewallInboundFirewallRulesRuleArgs build() {
            return $;
        }
    }

}
