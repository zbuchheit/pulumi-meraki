// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.ApplianceFirewallL7FirewallRulesRulesResponseValueObj;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceFirewallL7FirewallRulesRulesResponse {
    /**
     * @return &#39;Deny&#39; traffic specified by this rule
     * 
     */
    private @Nullable String policy;
    /**
     * @return Type of the L7 rule. One of: &#39;application&#39;, &#39;applicationCategory&#39;, &#39;host&#39;, &#39;port&#39;, &#39;ipRange&#39;
     * 
     */
    private @Nullable String type;
    /**
     * @return The &#39;value&#39; of what you want to block. Format of &#39;value&#39; varies depending on type of the rule. The application categories and application ids can be retrieved from the the &#39;MX L7 application categories&#39; endpoint. The countries follow the two-letter ISO 3166-1 alpha-2 format.
     * 
     */
    private @Nullable String value;
    /**
     * @return The &#39;value_list&#39; of what you want to block. Send a list in request
     * 
     */
    private @Nullable List<String> valueLists;
    /**
     * @return The &#39;value_obj&#39; of what you want to block. Send a dict in request
     * 
     */
    private @Nullable ApplianceFirewallL7FirewallRulesRulesResponseValueObj valueObj;

    private ApplianceFirewallL7FirewallRulesRulesResponse() {}
    /**
     * @return &#39;Deny&#39; traffic specified by this rule
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return Type of the L7 rule. One of: &#39;application&#39;, &#39;applicationCategory&#39;, &#39;host&#39;, &#39;port&#39;, &#39;ipRange&#39;
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The &#39;value&#39; of what you want to block. Format of &#39;value&#39; varies depending on type of the rule. The application categories and application ids can be retrieved from the the &#39;MX L7 application categories&#39; endpoint. The countries follow the two-letter ISO 3166-1 alpha-2 format.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    /**
     * @return The &#39;value_list&#39; of what you want to block. Send a list in request
     * 
     */
    public List<String> valueLists() {
        return this.valueLists == null ? List.of() : this.valueLists;
    }
    /**
     * @return The &#39;value_obj&#39; of what you want to block. Send a dict in request
     * 
     */
    public Optional<ApplianceFirewallL7FirewallRulesRulesResponseValueObj> valueObj() {
        return Optional.ofNullable(this.valueObj);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceFirewallL7FirewallRulesRulesResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String policy;
        private @Nullable String type;
        private @Nullable String value;
        private @Nullable List<String> valueLists;
        private @Nullable ApplianceFirewallL7FirewallRulesRulesResponseValueObj valueObj;
        public Builder() {}
        public Builder(ApplianceFirewallL7FirewallRulesRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
    	      this.valueLists = defaults.valueLists;
    	      this.valueObj = defaults.valueObj;
        }

        @CustomType.Setter
        public Builder policy(@Nullable String policy) {

            this.policy = policy;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder valueLists(@Nullable List<String> valueLists) {

            this.valueLists = valueLists;
            return this;
        }
        public Builder valueLists(String... valueLists) {
            return valueLists(List.of(valueLists));
        }
        @CustomType.Setter
        public Builder valueObj(@Nullable ApplianceFirewallL7FirewallRulesRulesResponseValueObj valueObj) {

            this.valueObj = valueObj;
            return this;
        }
        public ApplianceFirewallL7FirewallRulesRulesResponse build() {
            final var _resultValue = new ApplianceFirewallL7FirewallRulesRulesResponse();
            _resultValue.policy = policy;
            _resultValue.type = type;
            _resultValue.value = value;
            _resultValue.valueLists = valueLists;
            _resultValue.valueObj = valueObj;
            return _resultValue;
        }
    }
}