// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceFirewallCellularFirewallRulesRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceFirewallCellularFirewallRulesState extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceFirewallCellularFirewallRulesState Empty = new ApplianceFirewallCellularFirewallRulesState();

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
     * An ordered array of the firewall rules (not including the default rule)
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<ApplianceFirewallCellularFirewallRulesRuleArgs>> rules;

    /**
     * @return An ordered array of the firewall rules (not including the default rule)
     * 
     */
    public Optional<Output<List<ApplianceFirewallCellularFirewallRulesRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private ApplianceFirewallCellularFirewallRulesState() {}

    private ApplianceFirewallCellularFirewallRulesState(ApplianceFirewallCellularFirewallRulesState $) {
        this.networkId = $.networkId;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceFirewallCellularFirewallRulesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceFirewallCellularFirewallRulesState $;

        public Builder() {
            $ = new ApplianceFirewallCellularFirewallRulesState();
        }

        public Builder(ApplianceFirewallCellularFirewallRulesState defaults) {
            $ = new ApplianceFirewallCellularFirewallRulesState(Objects.requireNonNull(defaults));
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
         * @param rules An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<ApplianceFirewallCellularFirewallRulesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ApplianceFirewallCellularFirewallRulesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rules(ApplianceFirewallCellularFirewallRulesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public ApplianceFirewallCellularFirewallRulesState build() {
            return $;
        }
    }

}
