// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSensorRelationshipsItemRelationshipsLivestreamRelatedDevice;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSensorRelationshipsItemRelationshipsLivestream {
    /**
     * @return An array of the related devices for the role
     * 
     */
    private List<GetSensorRelationshipsItemRelationshipsLivestreamRelatedDevice> relatedDevices;

    private GetSensorRelationshipsItemRelationshipsLivestream() {}
    /**
     * @return An array of the related devices for the role
     * 
     */
    public List<GetSensorRelationshipsItemRelationshipsLivestreamRelatedDevice> relatedDevices() {
        return this.relatedDevices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorRelationshipsItemRelationshipsLivestream defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSensorRelationshipsItemRelationshipsLivestreamRelatedDevice> relatedDevices;
        public Builder() {}
        public Builder(GetSensorRelationshipsItemRelationshipsLivestream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.relatedDevices = defaults.relatedDevices;
        }

        @CustomType.Setter
        public Builder relatedDevices(List<GetSensorRelationshipsItemRelationshipsLivestreamRelatedDevice> relatedDevices) {
            if (relatedDevices == null) {
              throw new MissingRequiredPropertyException("GetSensorRelationshipsItemRelationshipsLivestream", "relatedDevices");
            }
            this.relatedDevices = relatedDevices;
            return this;
        }
        public Builder relatedDevices(GetSensorRelationshipsItemRelationshipsLivestreamRelatedDevice... relatedDevices) {
            return relatedDevices(List.of(relatedDevices));
        }
        public GetSensorRelationshipsItemRelationshipsLivestream build() {
            final var _resultValue = new GetSensorRelationshipsItemRelationshipsLivestream();
            _resultValue.relatedDevices = relatedDevices;
            return _resultValue;
        }
    }
}
