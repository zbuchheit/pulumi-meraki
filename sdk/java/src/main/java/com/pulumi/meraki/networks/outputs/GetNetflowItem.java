// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetflowItem {
    /**
     * @return The IPv4 address of the NetFlow collector.
     * 
     */
    private String collectorIp;
    /**
     * @return The port that the NetFlow collector will be listening on.
     * 
     */
    private Integer collectorPort;
    /**
     * @return The port that the Encrypted Traffic Analytics collector will be listening on.
     * 
     */
    private Integer etaDstPort;
    /**
     * @return Boolean indicating whether Encrypted Traffic Analytics is enabled (true) or disabled (false).
     * 
     */
    private Boolean etaEnabled;
    /**
     * @return Boolean indicating whether NetFlow traffic reporting is enabled (true) or disabled (false).
     * 
     */
    private Boolean reportingEnabled;

    private GetNetflowItem() {}
    /**
     * @return The IPv4 address of the NetFlow collector.
     * 
     */
    public String collectorIp() {
        return this.collectorIp;
    }
    /**
     * @return The port that the NetFlow collector will be listening on.
     * 
     */
    public Integer collectorPort() {
        return this.collectorPort;
    }
    /**
     * @return The port that the Encrypted Traffic Analytics collector will be listening on.
     * 
     */
    public Integer etaDstPort() {
        return this.etaDstPort;
    }
    /**
     * @return Boolean indicating whether Encrypted Traffic Analytics is enabled (true) or disabled (false).
     * 
     */
    public Boolean etaEnabled() {
        return this.etaEnabled;
    }
    /**
     * @return Boolean indicating whether NetFlow traffic reporting is enabled (true) or disabled (false).
     * 
     */
    public Boolean reportingEnabled() {
        return this.reportingEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetflowItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String collectorIp;
        private Integer collectorPort;
        private Integer etaDstPort;
        private Boolean etaEnabled;
        private Boolean reportingEnabled;
        public Builder() {}
        public Builder(GetNetflowItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectorIp = defaults.collectorIp;
    	      this.collectorPort = defaults.collectorPort;
    	      this.etaDstPort = defaults.etaDstPort;
    	      this.etaEnabled = defaults.etaEnabled;
    	      this.reportingEnabled = defaults.reportingEnabled;
        }

        @CustomType.Setter
        public Builder collectorIp(String collectorIp) {
            if (collectorIp == null) {
              throw new MissingRequiredPropertyException("GetNetflowItem", "collectorIp");
            }
            this.collectorIp = collectorIp;
            return this;
        }
        @CustomType.Setter
        public Builder collectorPort(Integer collectorPort) {
            if (collectorPort == null) {
              throw new MissingRequiredPropertyException("GetNetflowItem", "collectorPort");
            }
            this.collectorPort = collectorPort;
            return this;
        }
        @CustomType.Setter
        public Builder etaDstPort(Integer etaDstPort) {
            if (etaDstPort == null) {
              throw new MissingRequiredPropertyException("GetNetflowItem", "etaDstPort");
            }
            this.etaDstPort = etaDstPort;
            return this;
        }
        @CustomType.Setter
        public Builder etaEnabled(Boolean etaEnabled) {
            if (etaEnabled == null) {
              throw new MissingRequiredPropertyException("GetNetflowItem", "etaEnabled");
            }
            this.etaEnabled = etaEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder reportingEnabled(Boolean reportingEnabled) {
            if (reportingEnabled == null) {
              throw new MissingRequiredPropertyException("GetNetflowItem", "reportingEnabled");
            }
            this.reportingEnabled = reportingEnabled;
            return this;
        }
        public GetNetflowItem build() {
            final var _resultValue = new GetNetflowItem();
            _resultValue.collectorIp = collectorIp;
            _resultValue.collectorPort = collectorPort;
            _resultValue.etaDstPort = etaDstPort;
            _resultValue.etaEnabled = etaEnabled;
            _resultValue.reportingEnabled = reportingEnabled;
            return _resultValue;
        }
    }
}
