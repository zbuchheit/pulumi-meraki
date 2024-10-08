// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.devices.outputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv4;
import com.pulumi.meraki.devices.outputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv6;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceUplinksSettingsInterfacesWan1Svis {
    /**
     * @return IPv4 settings for static/dynamic mode.
     * 
     */
    private @Nullable ApplianceUplinksSettingsInterfacesWan1SvisIpv4 ipv4;
    /**
     * @return IPv6 settings for static/dynamic mode.
     * 
     */
    private @Nullable ApplianceUplinksSettingsInterfacesWan1SvisIpv6 ipv6;

    private ApplianceUplinksSettingsInterfacesWan1Svis() {}
    /**
     * @return IPv4 settings for static/dynamic mode.
     * 
     */
    public Optional<ApplianceUplinksSettingsInterfacesWan1SvisIpv4> ipv4() {
        return Optional.ofNullable(this.ipv4);
    }
    /**
     * @return IPv6 settings for static/dynamic mode.
     * 
     */
    public Optional<ApplianceUplinksSettingsInterfacesWan1SvisIpv6> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceUplinksSettingsInterfacesWan1Svis defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApplianceUplinksSettingsInterfacesWan1SvisIpv4 ipv4;
        private @Nullable ApplianceUplinksSettingsInterfacesWan1SvisIpv6 ipv6;
        public Builder() {}
        public Builder(ApplianceUplinksSettingsInterfacesWan1Svis defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4 = defaults.ipv4;
    	      this.ipv6 = defaults.ipv6;
        }

        @CustomType.Setter
        public Builder ipv4(@Nullable ApplianceUplinksSettingsInterfacesWan1SvisIpv4 ipv4) {

            this.ipv4 = ipv4;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(@Nullable ApplianceUplinksSettingsInterfacesWan1SvisIpv6 ipv6) {

            this.ipv6 = ipv6;
            return this;
        }
        public ApplianceUplinksSettingsInterfacesWan1Svis build() {
            final var _resultValue = new ApplianceUplinksSettingsInterfacesWan1Svis();
            _resultValue.ipv4 = ipv4;
            _resultValue.ipv6 = ipv6;
            return _resultValue;
        }
    }
}
