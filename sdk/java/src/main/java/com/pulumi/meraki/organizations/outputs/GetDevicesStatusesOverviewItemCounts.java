// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetDevicesStatusesOverviewItemCountsByStatus;
import java.util.Objects;

@CustomType
public final class GetDevicesStatusesOverviewItemCounts {
    /**
     * @return byStatus
     * 
     */
    private GetDevicesStatusesOverviewItemCountsByStatus byStatus;

    private GetDevicesStatusesOverviewItemCounts() {}
    /**
     * @return byStatus
     * 
     */
    public GetDevicesStatusesOverviewItemCountsByStatus byStatus() {
        return this.byStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesStatusesOverviewItemCounts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetDevicesStatusesOverviewItemCountsByStatus byStatus;
        public Builder() {}
        public Builder(GetDevicesStatusesOverviewItemCounts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byStatus = defaults.byStatus;
        }

        @CustomType.Setter
        public Builder byStatus(GetDevicesStatusesOverviewItemCountsByStatus byStatus) {
            if (byStatus == null) {
              throw new MissingRequiredPropertyException("GetDevicesStatusesOverviewItemCounts", "byStatus");
            }
            this.byStatus = byStatus;
            return this;
        }
        public GetDevicesStatusesOverviewItemCounts build() {
            final var _resultValue = new GetDevicesStatusesOverviewItemCounts();
            _resultValue.byStatus = byStatus;
            return _resultValue;
        }
    }
}