// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchAccessControlListsRulesResponse {
    /**
     * @return Description of the rule (optional)
     * 
     */
    private @Nullable String comment;
    /**
     * @return Destination IP address (in IP or CIDR notation)
     * 
     */
    private @Nullable String dstCidr;
    /**
     * @return Destination port
     * 
     */
    private @Nullable String dstPort;
    /**
     * @return IP address version
     * 
     */
    private @Nullable String ipVersion;
    /**
     * @return &#39;allow&#39; or &#39;deny&#39; traffic specified by this rule
     * 
     */
    private @Nullable String policy;
    /**
     * @return The type of protocol
     * 
     */
    private @Nullable String protocol;
    /**
     * @return Source IP address (in IP or CIDR notation)
     * 
     */
    private @Nullable String srcCidr;
    /**
     * @return Source port
     * 
     */
    private @Nullable String srcPort;
    /**
     * @return ncoming traffic VLAN
     * 
     */
    private @Nullable String vlan;

    private SwitchAccessControlListsRulesResponse() {}
    /**
     * @return Description of the rule (optional)
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return Destination IP address (in IP or CIDR notation)
     * 
     */
    public Optional<String> dstCidr() {
        return Optional.ofNullable(this.dstCidr);
    }
    /**
     * @return Destination port
     * 
     */
    public Optional<String> dstPort() {
        return Optional.ofNullable(this.dstPort);
    }
    /**
     * @return IP address version
     * 
     */
    public Optional<String> ipVersion() {
        return Optional.ofNullable(this.ipVersion);
    }
    /**
     * @return &#39;allow&#39; or &#39;deny&#39; traffic specified by this rule
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return The type of protocol
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return Source IP address (in IP or CIDR notation)
     * 
     */
    public Optional<String> srcCidr() {
        return Optional.ofNullable(this.srcCidr);
    }
    /**
     * @return Source port
     * 
     */
    public Optional<String> srcPort() {
        return Optional.ofNullable(this.srcPort);
    }
    /**
     * @return ncoming traffic VLAN
     * 
     */
    public Optional<String> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchAccessControlListsRulesResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private @Nullable String dstCidr;
        private @Nullable String dstPort;
        private @Nullable String ipVersion;
        private @Nullable String policy;
        private @Nullable String protocol;
        private @Nullable String srcCidr;
        private @Nullable String srcPort;
        private @Nullable String vlan;
        public Builder() {}
        public Builder(SwitchAccessControlListsRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.dstCidr = defaults.dstCidr;
    	      this.dstPort = defaults.dstPort;
    	      this.ipVersion = defaults.ipVersion;
    	      this.policy = defaults.policy;
    	      this.protocol = defaults.protocol;
    	      this.srcCidr = defaults.srcCidr;
    	      this.srcPort = defaults.srcPort;
    	      this.vlan = defaults.vlan;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder dstCidr(@Nullable String dstCidr) {

            this.dstCidr = dstCidr;
            return this;
        }
        @CustomType.Setter
        public Builder dstPort(@Nullable String dstPort) {

            this.dstPort = dstPort;
            return this;
        }
        @CustomType.Setter
        public Builder ipVersion(@Nullable String ipVersion) {

            this.ipVersion = ipVersion;
            return this;
        }
        @CustomType.Setter
        public Builder policy(@Nullable String policy) {

            this.policy = policy;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder srcCidr(@Nullable String srcCidr) {

            this.srcCidr = srcCidr;
            return this;
        }
        @CustomType.Setter
        public Builder srcPort(@Nullable String srcPort) {

            this.srcPort = srcPort;
            return this;
        }
        @CustomType.Setter
        public Builder vlan(@Nullable String vlan) {

            this.vlan = vlan;
            return this;
        }
        public SwitchAccessControlListsRulesResponse build() {
            final var _resultValue = new SwitchAccessControlListsRulesResponse();
            _resultValue.comment = comment;
            _resultValue.dstCidr = dstCidr;
            _resultValue.dstPort = dstPort;
            _resultValue.ipVersion = ipVersion;
            _resultValue.policy = policy;
            _resultValue.protocol = protocol;
            _resultValue.srcCidr = srcCidr;
            _resultValue.srcPort = srcPort;
            _resultValue.vlan = vlan;
            return _resultValue;
        }
    }
}
