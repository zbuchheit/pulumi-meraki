// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.CloneItemManagementDetail;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CloneItemManagement {
    /**
     * @return Details related to organization management, possibly empty. Details may be named &#39;MSP ID&#39;, &#39;IP restriction mode for API&#39;, or &#39;IP restriction mode for dashboard&#39;, if the organization admin has configured any.
     * 
     */
    private @Nullable List<CloneItemManagementDetail> details;

    private CloneItemManagement() {}
    /**
     * @return Details related to organization management, possibly empty. Details may be named &#39;MSP ID&#39;, &#39;IP restriction mode for API&#39;, or &#39;IP restriction mode for dashboard&#39;, if the organization admin has configured any.
     * 
     */
    public List<CloneItemManagementDetail> details() {
        return this.details == null ? List.of() : this.details;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloneItemManagement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<CloneItemManagementDetail> details;
        public Builder() {}
        public Builder(CloneItemManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
        }

        @CustomType.Setter
        public Builder details(@Nullable List<CloneItemManagementDetail> details) {

            this.details = details;
            return this;
        }
        public Builder details(CloneItemManagementDetail... details) {
            return details(List.of(details));
        }
        public CloneItemManagement build() {
            final var _resultValue = new CloneItemManagement();
            _resultValue.details = details;
            return _resultValue;
        }
    }
}
