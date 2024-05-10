// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SmDevicesCheckinItem {
    /**
     * @return The Meraki Ids of the set of devices.
     * 
     */
    private @Nullable List<String> ids;

    private SmDevicesCheckinItem() {}
    /**
     * @return The Meraki Ids of the set of devices.
     * 
     */
    public List<String> ids() {
        return this.ids == null ? List.of() : this.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmDevicesCheckinItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> ids;
        public Builder() {}
        public Builder(SmDevicesCheckinItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ids = defaults.ids;
        }

        @CustomType.Setter
        public Builder ids(@Nullable List<String> ids) {

            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public SmDevicesCheckinItem build() {
            final var _resultValue = new SmDevicesCheckinItem();
            _resultValue.ids = ids;
            return _resultValue;
        }
    }
}
