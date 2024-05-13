// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetTrafficShapingApplicationCategoriesItemApplicationCategory;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTrafficShapingApplicationCategoriesItem {
    private List<GetTrafficShapingApplicationCategoriesItemApplicationCategory> applicationCategories;

    private GetTrafficShapingApplicationCategoriesItem() {}
    public List<GetTrafficShapingApplicationCategoriesItemApplicationCategory> applicationCategories() {
        return this.applicationCategories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficShapingApplicationCategoriesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTrafficShapingApplicationCategoriesItemApplicationCategory> applicationCategories;
        public Builder() {}
        public Builder(GetTrafficShapingApplicationCategoriesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationCategories = defaults.applicationCategories;
        }

        @CustomType.Setter
        public Builder applicationCategories(List<GetTrafficShapingApplicationCategoriesItemApplicationCategory> applicationCategories) {
            if (applicationCategories == null) {
              throw new MissingRequiredPropertyException("GetTrafficShapingApplicationCategoriesItem", "applicationCategories");
            }
            this.applicationCategories = applicationCategories;
            return this;
        }
        public Builder applicationCategories(GetTrafficShapingApplicationCategoriesItemApplicationCategory... applicationCategories) {
            return applicationCategories(List.of(applicationCategories));
        }
        public GetTrafficShapingApplicationCategoriesItem build() {
            final var _resultValue = new GetTrafficShapingApplicationCategoriesItem();
            _resultValue.applicationCategories = applicationCategories;
            return _resultValue;
        }
    }
}