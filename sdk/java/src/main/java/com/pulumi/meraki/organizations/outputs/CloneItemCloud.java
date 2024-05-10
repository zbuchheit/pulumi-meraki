// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.CloneItemCloudRegion;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloneItemCloud {
    /**
     * @return Region info
     * 
     */
    private @Nullable CloneItemCloudRegion region;

    private CloneItemCloud() {}
    /**
     * @return Region info
     * 
     */
    public Optional<CloneItemCloudRegion> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloneItemCloud defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CloneItemCloudRegion region;
        public Builder() {}
        public Builder(CloneItemCloud defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder region(@Nullable CloneItemCloudRegion region) {

            this.region = region;
            return this;
        }
        public CloneItemCloud build() {
            final var _resultValue = new CloneItemCloud();
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
