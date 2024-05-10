// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTopologyLinkLayerItemLinkEndDevice {
    private String name;
    private String serial;

    private GetTopologyLinkLayerItemLinkEndDevice() {}
    public String name() {
        return this.name;
    }
    public String serial() {
        return this.serial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopologyLinkLayerItemLinkEndDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String serial;
        public Builder() {}
        public Builder(GetTopologyLinkLayerItemLinkEndDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.serial = defaults.serial;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTopologyLinkLayerItemLinkEndDevice", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetTopologyLinkLayerItemLinkEndDevice", "serial");
            }
            this.serial = serial;
            return this;
        }
        public GetTopologyLinkLayerItemLinkEndDevice build() {
            final var _resultValue = new GetTopologyLinkLayerItemLinkEndDevice();
            _resultValue.name = name;
            _resultValue.serial = serial;
            return _resultValue;
        }
    }
}
