// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceFirewallL3FirewallRulesItemRule;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplianceFirewallL3FirewallRulesItem {
    private List<GetApplianceFirewallL3FirewallRulesItemRule> rules;

    private GetApplianceFirewallL3FirewallRulesItem() {}
    public List<GetApplianceFirewallL3FirewallRulesItemRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceFirewallL3FirewallRulesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetApplianceFirewallL3FirewallRulesItemRule> rules;
        public Builder() {}
        public Builder(GetApplianceFirewallL3FirewallRulesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder rules(List<GetApplianceFirewallL3FirewallRulesItemRule> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallL3FirewallRulesItem", "rules");
            }
            this.rules = rules;
            return this;
        }
        public Builder rules(GetApplianceFirewallL3FirewallRulesItemRule... rules) {
            return rules(List.of(rules));
        }
        public GetApplianceFirewallL3FirewallRulesItem build() {
            final var _resultValue = new GetApplianceFirewallL3FirewallRulesItem();
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}
