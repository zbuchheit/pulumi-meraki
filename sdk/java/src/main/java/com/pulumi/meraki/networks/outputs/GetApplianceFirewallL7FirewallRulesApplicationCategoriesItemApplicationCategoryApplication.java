// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication {
    /**
     * @return The id of the application
     * 
     */
    private String id;
    /**
     * @return The name of the application
     * 
     */
    private String name;

    private GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication() {}
    /**
     * @return The id of the application
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the application
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication", "name");
            }
            this.name = name;
            return this;
        }
        public GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication build() {
            final var _resultValue = new GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemApplicationCategoryApplication();
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
