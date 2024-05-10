// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceTrafficShapingItem;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetApplianceTrafficShapingItem item;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;

    private GetApplianceTrafficShapingResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetApplianceTrafficShapingItem item() {
        return this.item;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetApplianceTrafficShapingItem item;
        private String networkId;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.networkId = defaults.networkId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetApplianceTrafficShapingItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        public GetApplianceTrafficShapingResult build() {
            final var _resultValue = new GetApplianceTrafficShapingResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.networkId = networkId;
            return _resultValue;
        }
    }
}
