// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPiiSmDevicesForKeyItem {
    private List<String> n1234s;

    private GetPiiSmDevicesForKeyItem() {}
    public List<String> n1234s() {
        return this.n1234s;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPiiSmDevicesForKeyItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> n1234s;
        public Builder() {}
        public Builder(GetPiiSmDevicesForKeyItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.n1234s = defaults.n1234s;
        }

        @CustomType.Setter
        public Builder n1234s(List<String> n1234s) {
            if (n1234s == null) {
              throw new MissingRequiredPropertyException("GetPiiSmDevicesForKeyItem", "n1234s");
            }
            this.n1234s = n1234s;
            return this;
        }
        public Builder n1234s(String... n1234s) {
            return n1234s(List.of(n1234s));
        }
        public GetPiiSmDevicesForKeyItem build() {
            final var _resultValue = new GetPiiSmDevicesForKeyItem();
            _resultValue.n1234s = n1234s;
            return _resultValue;
        }
    }
}
