// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.WirelessSsidsLdapCredentials;
import com.pulumi.meraki.networks.outputs.WirelessSsidsLdapServer;
import com.pulumi.meraki.networks.outputs.WirelessSsidsLdapServerCaCertificate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsLdap {
    /**
     * @return The base distinguished name of users on the LDAP server.
     * 
     */
    private @Nullable String baseDistinguishedName;
    /**
     * @return (Optional) The credentials of the user account to be used by the AP to bind to your LDAP server. The LDAP account should have permissions on all your LDAP servers.
     * 
     */
    private @Nullable WirelessSsidsLdapCredentials credentials;
    /**
     * @return The CA certificate used to sign the LDAP server&#39;s key.
     * 
     */
    private @Nullable WirelessSsidsLdapServerCaCertificate serverCaCertificate;
    /**
     * @return The LDAP servers to be used for authentication.
     * 
     */
    private @Nullable List<WirelessSsidsLdapServer> servers;

    private WirelessSsidsLdap() {}
    /**
     * @return The base distinguished name of users on the LDAP server.
     * 
     */
    public Optional<String> baseDistinguishedName() {
        return Optional.ofNullable(this.baseDistinguishedName);
    }
    /**
     * @return (Optional) The credentials of the user account to be used by the AP to bind to your LDAP server. The LDAP account should have permissions on all your LDAP servers.
     * 
     */
    public Optional<WirelessSsidsLdapCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * @return The CA certificate used to sign the LDAP server&#39;s key.
     * 
     */
    public Optional<WirelessSsidsLdapServerCaCertificate> serverCaCertificate() {
        return Optional.ofNullable(this.serverCaCertificate);
    }
    /**
     * @return The LDAP servers to be used for authentication.
     * 
     */
    public List<WirelessSsidsLdapServer> servers() {
        return this.servers == null ? List.of() : this.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsLdap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String baseDistinguishedName;
        private @Nullable WirelessSsidsLdapCredentials credentials;
        private @Nullable WirelessSsidsLdapServerCaCertificate serverCaCertificate;
        private @Nullable List<WirelessSsidsLdapServer> servers;
        public Builder() {}
        public Builder(WirelessSsidsLdap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseDistinguishedName = defaults.baseDistinguishedName;
    	      this.credentials = defaults.credentials;
    	      this.serverCaCertificate = defaults.serverCaCertificate;
    	      this.servers = defaults.servers;
        }

        @CustomType.Setter
        public Builder baseDistinguishedName(@Nullable String baseDistinguishedName) {

            this.baseDistinguishedName = baseDistinguishedName;
            return this;
        }
        @CustomType.Setter
        public Builder credentials(@Nullable WirelessSsidsLdapCredentials credentials) {

            this.credentials = credentials;
            return this;
        }
        @CustomType.Setter
        public Builder serverCaCertificate(@Nullable WirelessSsidsLdapServerCaCertificate serverCaCertificate) {

            this.serverCaCertificate = serverCaCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder servers(@Nullable List<WirelessSsidsLdapServer> servers) {

            this.servers = servers;
            return this;
        }
        public Builder servers(WirelessSsidsLdapServer... servers) {
            return servers(List.of(servers));
        }
        public WirelessSsidsLdap build() {
            final var _resultValue = new WirelessSsidsLdap();
            _resultValue.baseDistinguishedName = baseDistinguishedName;
            _resultValue.credentials = credentials;
            _resultValue.serverCaCertificate = serverCaCertificate;
            _resultValue.servers = servers;
            return _resultValue;
        }
    }
}
