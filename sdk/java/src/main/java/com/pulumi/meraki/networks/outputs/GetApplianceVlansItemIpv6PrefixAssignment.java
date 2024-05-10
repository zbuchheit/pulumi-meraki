// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceVlansItemIpv6PrefixAssignmentOrigin;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceVlansItemIpv6PrefixAssignment {
    /**
     * @return Auto assign a /64 prefix from the origin to the VLAN
     * 
     */
    private Boolean autonomous;
    /**
     * @return The origin of the prefix
     * 
     */
    private GetApplianceVlansItemIpv6PrefixAssignmentOrigin origin;
    /**
     * @return Manual configuration of the IPv6 Appliance IP
     * 
     */
    private String staticApplianceIp6;
    /**
     * @return Manual configuration of a /64 prefix on the VLAN
     * 
     */
    private String staticPrefix;

    private GetApplianceVlansItemIpv6PrefixAssignment() {}
    /**
     * @return Auto assign a /64 prefix from the origin to the VLAN
     * 
     */
    public Boolean autonomous() {
        return this.autonomous;
    }
    /**
     * @return The origin of the prefix
     * 
     */
    public GetApplianceVlansItemIpv6PrefixAssignmentOrigin origin() {
        return this.origin;
    }
    /**
     * @return Manual configuration of the IPv6 Appliance IP
     * 
     */
    public String staticApplianceIp6() {
        return this.staticApplianceIp6;
    }
    /**
     * @return Manual configuration of a /64 prefix on the VLAN
     * 
     */
    public String staticPrefix() {
        return this.staticPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceVlansItemIpv6PrefixAssignment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autonomous;
        private GetApplianceVlansItemIpv6PrefixAssignmentOrigin origin;
        private String staticApplianceIp6;
        private String staticPrefix;
        public Builder() {}
        public Builder(GetApplianceVlansItemIpv6PrefixAssignment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autonomous = defaults.autonomous;
    	      this.origin = defaults.origin;
    	      this.staticApplianceIp6 = defaults.staticApplianceIp6;
    	      this.staticPrefix = defaults.staticPrefix;
        }

        @CustomType.Setter
        public Builder autonomous(Boolean autonomous) {
            if (autonomous == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItemIpv6PrefixAssignment", "autonomous");
            }
            this.autonomous = autonomous;
            return this;
        }
        @CustomType.Setter
        public Builder origin(GetApplianceVlansItemIpv6PrefixAssignmentOrigin origin) {
            if (origin == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItemIpv6PrefixAssignment", "origin");
            }
            this.origin = origin;
            return this;
        }
        @CustomType.Setter
        public Builder staticApplianceIp6(String staticApplianceIp6) {
            if (staticApplianceIp6 == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItemIpv6PrefixAssignment", "staticApplianceIp6");
            }
            this.staticApplianceIp6 = staticApplianceIp6;
            return this;
        }
        @CustomType.Setter
        public Builder staticPrefix(String staticPrefix) {
            if (staticPrefix == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItemIpv6PrefixAssignment", "staticPrefix");
            }
            this.staticPrefix = staticPrefix;
            return this;
        }
        public GetApplianceVlansItemIpv6PrefixAssignment build() {
            final var _resultValue = new GetApplianceVlansItemIpv6PrefixAssignment();
            _resultValue.autonomous = autonomous;
            _resultValue.origin = origin;
            _resultValue.staticApplianceIp6 = staticApplianceIp6;
            _resultValue.staticPrefix = staticPrefix;
            return _resultValue;
        }
    }
}
