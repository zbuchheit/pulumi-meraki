// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceFirewallCellularFirewallRulesItemRule {
    private String comment;
    private String destCidr;
    private String destPort;
    private String policy;
    private String protocol;
    private String srcCidr;
    private String srcPort;
    private Boolean syslogEnabled;

    private GetApplianceFirewallCellularFirewallRulesItemRule() {}
    public String comment() {
        return this.comment;
    }
    public String destCidr() {
        return this.destCidr;
    }
    public String destPort() {
        return this.destPort;
    }
    public String policy() {
        return this.policy;
    }
    public String protocol() {
        return this.protocol;
    }
    public String srcCidr() {
        return this.srcCidr;
    }
    public String srcPort() {
        return this.srcPort;
    }
    public Boolean syslogEnabled() {
        return this.syslogEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceFirewallCellularFirewallRulesItemRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String destCidr;
        private String destPort;
        private String policy;
        private String protocol;
        private String srcCidr;
        private String srcPort;
        private Boolean syslogEnabled;
        public Builder() {}
        public Builder(GetApplianceFirewallCellularFirewallRulesItemRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.destCidr = defaults.destCidr;
    	      this.destPort = defaults.destPort;
    	      this.policy = defaults.policy;
    	      this.protocol = defaults.protocol;
    	      this.srcCidr = defaults.srcCidr;
    	      this.srcPort = defaults.srcPort;
    	      this.syslogEnabled = defaults.syslogEnabled;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallCellularFirewallRulesItemRule", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder destCidr(String destCidr) {
            if (destCidr == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallCellularFirewallRulesItemRule", "destCidr");
            }
            this.destCidr = destCidr;
            return this;
        }
        @CustomType.Setter
        public Builder destPort(String destPort) {
            if (destPort == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallCellularFirewallRulesItemRule", "destPort");
            }
            this.destPort = destPort;
            return this;
        }
        @CustomType.Setter
        public Builder policy(String policy) {
            if (policy == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallCellularFirewallRulesItemRule", "policy");
            }
            this.policy = policy;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallCellularFirewallRulesItemRule", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder srcCidr(String srcCidr) {
            if (srcCidr == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallCellularFirewallRulesItemRule", "srcCidr");
            }
            this.srcCidr = srcCidr;
            return this;
        }
        @CustomType.Setter
        public Builder srcPort(String srcPort) {
            if (srcPort == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallCellularFirewallRulesItemRule", "srcPort");
            }
            this.srcPort = srcPort;
            return this;
        }
        @CustomType.Setter
        public Builder syslogEnabled(Boolean syslogEnabled) {
            if (syslogEnabled == null) {
              throw new MissingRequiredPropertyException("GetApplianceFirewallCellularFirewallRulesItemRule", "syslogEnabled");
            }
            this.syslogEnabled = syslogEnabled;
            return this;
        }
        public GetApplianceFirewallCellularFirewallRulesItemRule build() {
            final var _resultValue = new GetApplianceFirewallCellularFirewallRulesItemRule();
            _resultValue.comment = comment;
            _resultValue.destCidr = destCidr;
            _resultValue.destPort = destPort;
            _resultValue.policy = policy;
            _resultValue.protocol = protocol;
            _resultValue.srcCidr = srcCidr;
            _resultValue.srcPort = srcPort;
            _resultValue.syslogEnabled = syslogEnabled;
            return _resultValue;
        }
    }
}
