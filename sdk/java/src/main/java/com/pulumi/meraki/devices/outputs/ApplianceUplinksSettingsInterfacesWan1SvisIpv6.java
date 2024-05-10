// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.devices.outputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv6Nameservers;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceUplinksSettingsInterfacesWan1SvisIpv6 {
    /**
     * @return Static address that will override the one(s) received by SLAAC.
     * 
     */
    private @Nullable String address;
    /**
     * @return The assignment mode for this SVI. Applies only when PPPoE is disabled.
     * 
     */
    private @Nullable String assignmentMode;
    /**
     * @return Static gateway that will override the one received by autoconf.
     * 
     */
    private @Nullable String gateway;
    /**
     * @return The nameserver settings for this SVI.
     * 
     */
    private @Nullable ApplianceUplinksSettingsInterfacesWan1SvisIpv6Nameservers nameservers;

    private ApplianceUplinksSettingsInterfacesWan1SvisIpv6() {}
    /**
     * @return Static address that will override the one(s) received by SLAAC.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The assignment mode for this SVI. Applies only when PPPoE is disabled.
     * 
     */
    public Optional<String> assignmentMode() {
        return Optional.ofNullable(this.assignmentMode);
    }
    /**
     * @return Static gateway that will override the one received by autoconf.
     * 
     */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    /**
     * @return The nameserver settings for this SVI.
     * 
     */
    public Optional<ApplianceUplinksSettingsInterfacesWan1SvisIpv6Nameservers> nameservers() {
        return Optional.ofNullable(this.nameservers);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceUplinksSettingsInterfacesWan1SvisIpv6 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String assignmentMode;
        private @Nullable String gateway;
        private @Nullable ApplianceUplinksSettingsInterfacesWan1SvisIpv6Nameservers nameservers;
        public Builder() {}
        public Builder(ApplianceUplinksSettingsInterfacesWan1SvisIpv6 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.assignmentMode = defaults.assignmentMode;
    	      this.gateway = defaults.gateway;
    	      this.nameservers = defaults.nameservers;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder assignmentMode(@Nullable String assignmentMode) {

            this.assignmentMode = assignmentMode;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(@Nullable String gateway) {

            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder nameservers(@Nullable ApplianceUplinksSettingsInterfacesWan1SvisIpv6Nameservers nameservers) {

            this.nameservers = nameservers;
            return this;
        }
        public ApplianceUplinksSettingsInterfacesWan1SvisIpv6 build() {
            final var _resultValue = new ApplianceUplinksSettingsInterfacesWan1SvisIpv6();
            _resultValue.address = address;
            _resultValue.assignmentMode = assignmentMode;
            _resultValue.gateway = gateway;
            _resultValue.nameservers = nameservers;
            return _resultValue;
        }
    }
}
