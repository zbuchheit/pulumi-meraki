// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.inputs.ApplianceVpnVpnFirewallRulesRuleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceVpnVpnFirewallRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceVpnVpnFirewallRulesArgs Empty = new ApplianceVpnVpnFirewallRulesArgs();

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * An ordered array of the firewall rules (not including the default rule)
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<ApplianceVpnVpnFirewallRulesRuleArgs>> rules;

    /**
     * @return An ordered array of the firewall rules (not including the default rule)
     * 
     */
    public Optional<Output<List<ApplianceVpnVpnFirewallRulesRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Log the special default rule (boolean value - enable only if you&#39;ve configured a syslog server) (optional)
     * 
     */
    @Import(name="syslogDefaultRule")
    private @Nullable Output<Boolean> syslogDefaultRule;

    /**
     * @return Log the special default rule (boolean value - enable only if you&#39;ve configured a syslog server) (optional)
     * 
     */
    public Optional<Output<Boolean>> syslogDefaultRule() {
        return Optional.ofNullable(this.syslogDefaultRule);
    }

    private ApplianceVpnVpnFirewallRulesArgs() {}

    private ApplianceVpnVpnFirewallRulesArgs(ApplianceVpnVpnFirewallRulesArgs $) {
        this.organizationId = $.organizationId;
        this.rules = $.rules;
        this.syslogDefaultRule = $.syslogDefaultRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceVpnVpnFirewallRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceVpnVpnFirewallRulesArgs $;

        public Builder() {
            $ = new ApplianceVpnVpnFirewallRulesArgs();
        }

        public Builder(ApplianceVpnVpnFirewallRulesArgs defaults) {
            $ = new ApplianceVpnVpnFirewallRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param rules An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<ApplianceVpnVpnFirewallRulesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ApplianceVpnVpnFirewallRulesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rules(ApplianceVpnVpnFirewallRulesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param syslogDefaultRule Log the special default rule (boolean value - enable only if you&#39;ve configured a syslog server) (optional)
         * 
         * @return builder
         * 
         */
        public Builder syslogDefaultRule(@Nullable Output<Boolean> syslogDefaultRule) {
            $.syslogDefaultRule = syslogDefaultRule;
            return this;
        }

        /**
         * @param syslogDefaultRule Log the special default rule (boolean value - enable only if you&#39;ve configured a syslog server) (optional)
         * 
         * @return builder
         * 
         */
        public Builder syslogDefaultRule(Boolean syslogDefaultRule) {
            return syslogDefaultRule(Output.of(syslogDefaultRule));
        }

        public ApplianceVpnVpnFirewallRulesArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("ApplianceVpnVpnFirewallRulesArgs", "organizationId");
            }
            return $;
        }
    }

}
