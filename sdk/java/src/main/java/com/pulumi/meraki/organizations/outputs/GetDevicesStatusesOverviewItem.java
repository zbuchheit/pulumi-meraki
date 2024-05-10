// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetDevicesStatusesOverviewItemCounts;
import java.util.Objects;

@CustomType
public final class GetDevicesStatusesOverviewItem {
    /**
     * @return counts
     * 
     */
    private GetDevicesStatusesOverviewItemCounts counts;

    private GetDevicesStatusesOverviewItem() {}
    /**
     * @return counts
     * 
     */
    public GetDevicesStatusesOverviewItemCounts counts() {
        return this.counts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesStatusesOverviewItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetDevicesStatusesOverviewItemCounts counts;
        public Builder() {}
        public Builder(GetDevicesStatusesOverviewItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counts = defaults.counts;
        }

        @CustomType.Setter
        public Builder counts(GetDevicesStatusesOverviewItemCounts counts) {
            if (counts == null) {
              throw new MissingRequiredPropertyException("GetDevicesStatusesOverviewItem", "counts");
            }
            this.counts = counts;
            return this;
        }
        public GetDevicesStatusesOverviewItem build() {
            final var _resultValue = new GetDevicesStatusesOverviewItem();
            _resultValue.counts = counts;
            return _resultValue;
        }
    }
}
