// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceUplinksSettingsInterfacesWan1SvisIpv4Nameservers {
    /**
     * @return Up to 2 nameserver addresses to use, ordered in priority from highest to lowest priority.
     * 
     */
    private @Nullable List<String> addresses;

    private ApplianceUplinksSettingsInterfacesWan1SvisIpv4Nameservers() {}
    /**
     * @return Up to 2 nameserver addresses to use, ordered in priority from highest to lowest priority.
     * 
     */
    public List<String> addresses() {
        return this.addresses == null ? List.of() : this.addresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceUplinksSettingsInterfacesWan1SvisIpv4Nameservers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> addresses;
        public Builder() {}
        public Builder(ApplianceUplinksSettingsInterfacesWan1SvisIpv4Nameservers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
        }

        @CustomType.Setter
        public Builder addresses(@Nullable List<String> addresses) {

            this.addresses = addresses;
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        public ApplianceUplinksSettingsInterfacesWan1SvisIpv4Nameservers build() {
            final var _resultValue = new ApplianceUplinksSettingsInterfacesWan1SvisIpv4Nameservers();
            _resultValue.addresses = addresses;
            return _resultValue;
        }
    }
}
