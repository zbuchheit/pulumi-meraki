// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAdaptivePolicyAclsItemRule {
    /**
     * @return Destination port
     * 
     */
    private String dstPort;
    /**
     * @return &#39;allow&#39; or &#39;deny&#39; traffic specified by this rule
     * 
     */
    private String policy;
    /**
     * @return The type of protocol
     * 
     */
    private String protocol;
    /**
     * @return Source port
     * 
     */
    private String srcPort;

    private GetAdaptivePolicyAclsItemRule() {}
    /**
     * @return Destination port
     * 
     */
    public String dstPort() {
        return this.dstPort;
    }
    /**
     * @return &#39;allow&#39; or &#39;deny&#39; traffic specified by this rule
     * 
     */
    public String policy() {
        return this.policy;
    }
    /**
     * @return The type of protocol
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Source port
     * 
     */
    public String srcPort() {
        return this.srcPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdaptivePolicyAclsItemRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dstPort;
        private String policy;
        private String protocol;
        private String srcPort;
        public Builder() {}
        public Builder(GetAdaptivePolicyAclsItemRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dstPort = defaults.dstPort;
    	      this.policy = defaults.policy;
    	      this.protocol = defaults.protocol;
    	      this.srcPort = defaults.srcPort;
        }

        @CustomType.Setter
        public Builder dstPort(String dstPort) {
            if (dstPort == null) {
              throw new MissingRequiredPropertyException("GetAdaptivePolicyAclsItemRule", "dstPort");
            }
            this.dstPort = dstPort;
            return this;
        }
        @CustomType.Setter
        public Builder policy(String policy) {
            if (policy == null) {
              throw new MissingRequiredPropertyException("GetAdaptivePolicyAclsItemRule", "policy");
            }
            this.policy = policy;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetAdaptivePolicyAclsItemRule", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder srcPort(String srcPort) {
            if (srcPort == null) {
              throw new MissingRequiredPropertyException("GetAdaptivePolicyAclsItemRule", "srcPort");
            }
            this.srcPort = srcPort;
            return this;
        }
        public GetAdaptivePolicyAclsItemRule build() {
            final var _resultValue = new GetAdaptivePolicyAclsItemRule();
            _resultValue.dstPort = dstPort;
            _resultValue.policy = policy;
            _resultValue.protocol = protocol;
            _resultValue.srcPort = srcPort;
            return _resultValue;
        }
    }
}
