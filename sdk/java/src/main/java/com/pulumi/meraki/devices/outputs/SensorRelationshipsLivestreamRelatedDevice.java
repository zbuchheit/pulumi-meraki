// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SensorRelationshipsLivestreamRelatedDevice {
    /**
     * @return The product type of the related device
     * 
     */
    private @Nullable String productType;
    /**
     * @return The serial of the related device
     * 
     */
    private @Nullable String serial;

    private SensorRelationshipsLivestreamRelatedDevice() {}
    /**
     * @return The product type of the related device
     * 
     */
    public Optional<String> productType() {
        return Optional.ofNullable(this.productType);
    }
    /**
     * @return The serial of the related device
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SensorRelationshipsLivestreamRelatedDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String productType;
        private @Nullable String serial;
        public Builder() {}
        public Builder(SensorRelationshipsLivestreamRelatedDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.productType = defaults.productType;
    	      this.serial = defaults.serial;
        }

        @CustomType.Setter
        public Builder productType(@Nullable String productType) {

            this.productType = productType;
            return this;
        }
        @CustomType.Setter
        public Builder serial(@Nullable String serial) {

            this.serial = serial;
            return this;
        }
        public SensorRelationshipsLivestreamRelatedDevice build() {
            final var _resultValue = new SensorRelationshipsLivestreamRelatedDevice();
            _resultValue.productType = productType;
            _resultValue.serial = serial;
            return _resultValue;
        }
    }
}
