// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceFirewallL7FirewallRulesRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceFirewallL7FirewallRulesState extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceFirewallL7FirewallRulesState Empty = new ApplianceFirewallL7FirewallRulesState();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * An ordered array of the MX L7 firewall rules
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<ApplianceFirewallL7FirewallRulesRuleArgs>> rules;

    /**
     * @return An ordered array of the MX L7 firewall rules
     * 
     */
    public Optional<Output<List<ApplianceFirewallL7FirewallRulesRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private ApplianceFirewallL7FirewallRulesState() {}

    private ApplianceFirewallL7FirewallRulesState(ApplianceFirewallL7FirewallRulesState $) {
        this.networkId = $.networkId;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceFirewallL7FirewallRulesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceFirewallL7FirewallRulesState $;

        public Builder() {
            $ = new ApplianceFirewallL7FirewallRulesState();
        }

        public Builder(ApplianceFirewallL7FirewallRulesState defaults) {
            $ = new ApplianceFirewallL7FirewallRulesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param rules An ordered array of the MX L7 firewall rules
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<ApplianceFirewallL7FirewallRulesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules An ordered array of the MX L7 firewall rules
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ApplianceFirewallL7FirewallRulesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules An ordered array of the MX L7 firewall rules
         * 
         * @return builder
         * 
         */
        public Builder rules(ApplianceFirewallL7FirewallRulesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public ApplianceFirewallL7FirewallRulesState build() {
            return $;
        }
    }

}
