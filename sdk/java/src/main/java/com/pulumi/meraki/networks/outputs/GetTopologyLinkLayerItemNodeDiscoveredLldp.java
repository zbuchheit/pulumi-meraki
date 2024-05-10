// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTopologyLinkLayerItemNodeDiscoveredLldp {
    private String chassisId;
    private String managementAddress;
    private List<String> systemCapabilities;
    private String systemDescription;
    private String systemName;

    private GetTopologyLinkLayerItemNodeDiscoveredLldp() {}
    public String chassisId() {
        return this.chassisId;
    }
    public String managementAddress() {
        return this.managementAddress;
    }
    public List<String> systemCapabilities() {
        return this.systemCapabilities;
    }
    public String systemDescription() {
        return this.systemDescription;
    }
    public String systemName() {
        return this.systemName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopologyLinkLayerItemNodeDiscoveredLldp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String chassisId;
        private String managementAddress;
        private List<String> systemCapabilities;
        private String systemDescription;
        private String systemName;
        public Builder() {}
        public Builder(GetTopologyLinkLayerItemNodeDiscoveredLldp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chassisId = defaults.chassisId;
    	      this.managementAddress = defaults.managementAddress;
    	      this.systemCapabilities = defaults.systemCapabilities;
    	      this.systemDescription = defaults.systemDescription;
    	      this.systemName = defaults.systemName;
        }

        @CustomType.Setter
        public Builder chassisId(String chassisId) {
            if (chassisId == null) {
              throw new MissingRequiredPropertyException("GetTopologyLinkLayerItemNodeDiscoveredLldp", "chassisId");
            }
            this.chassisId = chassisId;
            return this;
        }
        @CustomType.Setter
        public Builder managementAddress(String managementAddress) {
            if (managementAddress == null) {
              throw new MissingRequiredPropertyException("GetTopologyLinkLayerItemNodeDiscoveredLldp", "managementAddress");
            }
            this.managementAddress = managementAddress;
            return this;
        }
        @CustomType.Setter
        public Builder systemCapabilities(List<String> systemCapabilities) {
            if (systemCapabilities == null) {
              throw new MissingRequiredPropertyException("GetTopologyLinkLayerItemNodeDiscoveredLldp", "systemCapabilities");
            }
            this.systemCapabilities = systemCapabilities;
            return this;
        }
        public Builder systemCapabilities(String... systemCapabilities) {
            return systemCapabilities(List.of(systemCapabilities));
        }
        @CustomType.Setter
        public Builder systemDescription(String systemDescription) {
            if (systemDescription == null) {
              throw new MissingRequiredPropertyException("GetTopologyLinkLayerItemNodeDiscoveredLldp", "systemDescription");
            }
            this.systemDescription = systemDescription;
            return this;
        }
        @CustomType.Setter
        public Builder systemName(String systemName) {
            if (systemName == null) {
              throw new MissingRequiredPropertyException("GetTopologyLinkLayerItemNodeDiscoveredLldp", "systemName");
            }
            this.systemName = systemName;
            return this;
        }
        public GetTopologyLinkLayerItemNodeDiscoveredLldp build() {
            final var _resultValue = new GetTopologyLinkLayerItemNodeDiscoveredLldp();
            _resultValue.chassisId = chassisId;
            _resultValue.managementAddress = managementAddress;
            _resultValue.systemCapabilities = systemCapabilities;
            _resultValue.systemDescription = systemDescription;
            _resultValue.systemName = systemName;
            return _resultValue;
        }
    }
}
