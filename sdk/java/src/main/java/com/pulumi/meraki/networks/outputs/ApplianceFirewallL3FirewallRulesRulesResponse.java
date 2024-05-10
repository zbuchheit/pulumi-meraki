// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceFirewallL3FirewallRulesRulesResponse {
    /**
     * @return Description of the rule (optional)
     * 
     */
    private @Nullable String comment;
    /**
     * @return Comma-separated list of destination IP address(es) (in IP or CIDR notation), fully-qualified domain names (FQDN) or &#39;any&#39;
     * 
     */
    private @Nullable String destCidr;
    /**
     * @return Comma-separated list of destination port(s) (integer in the range 1-65535), or &#39;any&#39;
     * 
     */
    private @Nullable String destPort;
    /**
     * @return &#39;allow&#39; or &#39;deny&#39; traffic specified by this rule
     * 
     */
    private @Nullable String policy;
    /**
     * @return The type of protocol (must be &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp&#39;, &#39;icmp6&#39; or &#39;any&#39;)
     * 
     */
    private @Nullable String protocol;
    /**
     * @return Comma-separated list of source IP address(es) (in IP or CIDR notation), or &#39;any&#39; (note: FQDN not supported for source addresses)
     * 
     */
    private @Nullable String srcCidr;
    /**
     * @return Comma-separated list of source port(s) (integer in the range 1-65535), or &#39;any&#39;
     * 
     */
    private @Nullable String srcPort;
    /**
     * @return Log this rule to syslog (true or false, boolean value) - only applicable if a syslog has been configured (optional)
     * 
     */
    private @Nullable Boolean syslogEnabled;

    private ApplianceFirewallL3FirewallRulesRulesResponse() {}
    /**
     * @return Description of the rule (optional)
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return Comma-separated list of destination IP address(es) (in IP or CIDR notation), fully-qualified domain names (FQDN) or &#39;any&#39;
     * 
     */
    public Optional<String> destCidr() {
        return Optional.ofNullable(this.destCidr);
    }
    /**
     * @return Comma-separated list of destination port(s) (integer in the range 1-65535), or &#39;any&#39;
     * 
     */
    public Optional<String> destPort() {
        return Optional.ofNullable(this.destPort);
    }
    /**
     * @return &#39;allow&#39; or &#39;deny&#39; traffic specified by this rule
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return The type of protocol (must be &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp&#39;, &#39;icmp6&#39; or &#39;any&#39;)
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return Comma-separated list of source IP address(es) (in IP or CIDR notation), or &#39;any&#39; (note: FQDN not supported for source addresses)
     * 
     */
    public Optional<String> srcCidr() {
        return Optional.ofNullable(this.srcCidr);
    }
    /**
     * @return Comma-separated list of source port(s) (integer in the range 1-65535), or &#39;any&#39;
     * 
     */
    public Optional<String> srcPort() {
        return Optional.ofNullable(this.srcPort);
    }
    /**
     * @return Log this rule to syslog (true or false, boolean value) - only applicable if a syslog has been configured (optional)
     * 
     */
    public Optional<Boolean> syslogEnabled() {
        return Optional.ofNullable(this.syslogEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceFirewallL3FirewallRulesRulesResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private @Nullable String destCidr;
        private @Nullable String destPort;
        private @Nullable String policy;
        private @Nullable String protocol;
        private @Nullable String srcCidr;
        private @Nullable String srcPort;
        private @Nullable Boolean syslogEnabled;
        public Builder() {}
        public Builder(ApplianceFirewallL3FirewallRulesRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.destCidr = defaults.destCidr;
    	      this.destPort = defaults.destPort;
    	      this.policy = defaults.policy;
    	      this.protocol = defaults.protocol;
    	      this.srcCidr = defaults.srcCidr;
    	      this.srcPort = defaults.srcPort;
    	      this.syslogEnabled = defaults.syslogEnabled;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder destCidr(@Nullable String destCidr) {

            this.destCidr = destCidr;
            return this;
        }
        @CustomType.Setter
        public Builder destPort(@Nullable String destPort) {

            this.destPort = destPort;
            return this;
        }
        @CustomType.Setter
        public Builder policy(@Nullable String policy) {

            this.policy = policy;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder srcCidr(@Nullable String srcCidr) {

            this.srcCidr = srcCidr;
            return this;
        }
        @CustomType.Setter
        public Builder srcPort(@Nullable String srcPort) {

            this.srcPort = srcPort;
            return this;
        }
        @CustomType.Setter
        public Builder syslogEnabled(@Nullable Boolean syslogEnabled) {

            this.syslogEnabled = syslogEnabled;
            return this;
        }
        public ApplianceFirewallL3FirewallRulesRulesResponse build() {
            final var _resultValue = new ApplianceFirewallL3FirewallRulesRulesResponse();
            _resultValue.comment = comment;
            _resultValue.destCidr = destCidr;
            _resultValue.destPort = destPort;
            _resultValue.policy = policy;
            _resultValue.protocol = protocol;
            _resultValue.srcCidr = srcCidr;
            _resultValue.srcPort = srcPort;
            _resultValue.syslogEnabled = syslogEnabled;
            return _resultValue;
        }
    }
}
