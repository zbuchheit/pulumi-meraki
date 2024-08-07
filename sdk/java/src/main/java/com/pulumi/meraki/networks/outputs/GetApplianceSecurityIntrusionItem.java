// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceSecurityIntrusionItemProtectedNetworks;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceSecurityIntrusionItem {
    /**
     * @return Intrusion detection ruleset
     * 
     */
    private String idsRulesets;
    /**
     * @return Intrusion detection mode
     * 
     */
    private String mode;
    /**
     * @return Networks included in and excluded from the detection engine
     * 
     */
    private GetApplianceSecurityIntrusionItemProtectedNetworks protectedNetworks;

    private GetApplianceSecurityIntrusionItem() {}
    /**
     * @return Intrusion detection ruleset
     * 
     */
    public String idsRulesets() {
        return this.idsRulesets;
    }
    /**
     * @return Intrusion detection mode
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return Networks included in and excluded from the detection engine
     * 
     */
    public GetApplianceSecurityIntrusionItemProtectedNetworks protectedNetworks() {
        return this.protectedNetworks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceSecurityIntrusionItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String idsRulesets;
        private String mode;
        private GetApplianceSecurityIntrusionItemProtectedNetworks protectedNetworks;
        public Builder() {}
        public Builder(GetApplianceSecurityIntrusionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idsRulesets = defaults.idsRulesets;
    	      this.mode = defaults.mode;
    	      this.protectedNetworks = defaults.protectedNetworks;
        }

        @CustomType.Setter
        public Builder idsRulesets(String idsRulesets) {
            if (idsRulesets == null) {
              throw new MissingRequiredPropertyException("GetApplianceSecurityIntrusionItem", "idsRulesets");
            }
            this.idsRulesets = idsRulesets;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetApplianceSecurityIntrusionItem", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder protectedNetworks(GetApplianceSecurityIntrusionItemProtectedNetworks protectedNetworks) {
            if (protectedNetworks == null) {
              throw new MissingRequiredPropertyException("GetApplianceSecurityIntrusionItem", "protectedNetworks");
            }
            this.protectedNetworks = protectedNetworks;
            return this;
        }
        public GetApplianceSecurityIntrusionItem build() {
            final var _resultValue = new GetApplianceSecurityIntrusionItem();
            _resultValue.idsRulesets = idsRulesets;
            _resultValue.mode = mode;
            _resultValue.protectedNetworks = protectedNetworks;
            return _resultValue;
        }
    }
}
