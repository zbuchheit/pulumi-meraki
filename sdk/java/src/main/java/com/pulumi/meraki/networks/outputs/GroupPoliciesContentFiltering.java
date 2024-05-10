// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.GroupPoliciesContentFilteringAllowedUrlPatterns;
import com.pulumi.meraki.networks.outputs.GroupPoliciesContentFilteringBlockedUrlCategories;
import com.pulumi.meraki.networks.outputs.GroupPoliciesContentFilteringBlockedUrlPatterns;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupPoliciesContentFiltering {
    /**
     * @return Settings for allowed URL patterns
     * 
     */
    private @Nullable GroupPoliciesContentFilteringAllowedUrlPatterns allowedUrlPatterns;
    /**
     * @return Settings for blocked URL categories
     * 
     */
    private @Nullable GroupPoliciesContentFilteringBlockedUrlCategories blockedUrlCategories;
    /**
     * @return Settings for blocked URL patterns
     * 
     */
    private @Nullable GroupPoliciesContentFilteringBlockedUrlPatterns blockedUrlPatterns;

    private GroupPoliciesContentFiltering() {}
    /**
     * @return Settings for allowed URL patterns
     * 
     */
    public Optional<GroupPoliciesContentFilteringAllowedUrlPatterns> allowedUrlPatterns() {
        return Optional.ofNullable(this.allowedUrlPatterns);
    }
    /**
     * @return Settings for blocked URL categories
     * 
     */
    public Optional<GroupPoliciesContentFilteringBlockedUrlCategories> blockedUrlCategories() {
        return Optional.ofNullable(this.blockedUrlCategories);
    }
    /**
     * @return Settings for blocked URL patterns
     * 
     */
    public Optional<GroupPoliciesContentFilteringBlockedUrlPatterns> blockedUrlPatterns() {
        return Optional.ofNullable(this.blockedUrlPatterns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPoliciesContentFiltering defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GroupPoliciesContentFilteringAllowedUrlPatterns allowedUrlPatterns;
        private @Nullable GroupPoliciesContentFilteringBlockedUrlCategories blockedUrlCategories;
        private @Nullable GroupPoliciesContentFilteringBlockedUrlPatterns blockedUrlPatterns;
        public Builder() {}
        public Builder(GroupPoliciesContentFiltering defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedUrlPatterns = defaults.allowedUrlPatterns;
    	      this.blockedUrlCategories = defaults.blockedUrlCategories;
    	      this.blockedUrlPatterns = defaults.blockedUrlPatterns;
        }

        @CustomType.Setter
        public Builder allowedUrlPatterns(@Nullable GroupPoliciesContentFilteringAllowedUrlPatterns allowedUrlPatterns) {

            this.allowedUrlPatterns = allowedUrlPatterns;
            return this;
        }
        @CustomType.Setter
        public Builder blockedUrlCategories(@Nullable GroupPoliciesContentFilteringBlockedUrlCategories blockedUrlCategories) {

            this.blockedUrlCategories = blockedUrlCategories;
            return this;
        }
        @CustomType.Setter
        public Builder blockedUrlPatterns(@Nullable GroupPoliciesContentFilteringBlockedUrlPatterns blockedUrlPatterns) {

            this.blockedUrlPatterns = blockedUrlPatterns;
            return this;
        }
        public GroupPoliciesContentFiltering build() {
            final var _resultValue = new GroupPoliciesContentFiltering();
            _resultValue.allowedUrlPatterns = allowedUrlPatterns;
            _resultValue.blockedUrlCategories = blockedUrlCategories;
            _resultValue.blockedUrlPatterns = blockedUrlPatterns;
            return _resultValue;
        }
    }
}
