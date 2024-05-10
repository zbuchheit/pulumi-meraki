// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.SmSentryPoliciesAssignmentsItemItem;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SmSentryPoliciesAssignmentsItem {
    /**
     * @return Sentry Group Policies for the Organization keyed by Network Id
     * 
     */
    private @Nullable List<SmSentryPoliciesAssignmentsItemItem> items;

    private SmSentryPoliciesAssignmentsItem() {}
    /**
     * @return Sentry Group Policies for the Organization keyed by Network Id
     * 
     */
    public List<SmSentryPoliciesAssignmentsItemItem> items() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmSentryPoliciesAssignmentsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<SmSentryPoliciesAssignmentsItemItem> items;
        public Builder() {}
        public Builder(SmSentryPoliciesAssignmentsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        @CustomType.Setter
        public Builder items(@Nullable List<SmSentryPoliciesAssignmentsItemItem> items) {

            this.items = items;
            return this;
        }
        public Builder items(SmSentryPoliciesAssignmentsItemItem... items) {
            return items(List.of(items));
        }
        public SmSentryPoliciesAssignmentsItem build() {
            final var _resultValue = new SmSentryPoliciesAssignmentsItem();
            _resultValue.items = items;
            return _resultValue;
        }
    }
}
