// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.ClientsProvisionItemClient;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientsProvisionItem {
    /**
     * @return The list of clients to provision
     * 
     */
    private @Nullable List<ClientsProvisionItemClient> clients;
    /**
     * @return The name of the client&#39;s policy
     * 
     */
    private @Nullable String devicePolicy;
    /**
     * @return The group policy identifier of the client
     * 
     */
    private @Nullable String groupPolicyId;

    private ClientsProvisionItem() {}
    /**
     * @return The list of clients to provision
     * 
     */
    public List<ClientsProvisionItemClient> clients() {
        return this.clients == null ? List.of() : this.clients;
    }
    /**
     * @return The name of the client&#39;s policy
     * 
     */
    public Optional<String> devicePolicy() {
        return Optional.ofNullable(this.devicePolicy);
    }
    /**
     * @return The group policy identifier of the client
     * 
     */
    public Optional<String> groupPolicyId() {
        return Optional.ofNullable(this.groupPolicyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientsProvisionItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ClientsProvisionItemClient> clients;
        private @Nullable String devicePolicy;
        private @Nullable String groupPolicyId;
        public Builder() {}
        public Builder(ClientsProvisionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clients = defaults.clients;
    	      this.devicePolicy = defaults.devicePolicy;
    	      this.groupPolicyId = defaults.groupPolicyId;
        }

        @CustomType.Setter
        public Builder clients(@Nullable List<ClientsProvisionItemClient> clients) {

            this.clients = clients;
            return this;
        }
        public Builder clients(ClientsProvisionItemClient... clients) {
            return clients(List.of(clients));
        }
        @CustomType.Setter
        public Builder devicePolicy(@Nullable String devicePolicy) {

            this.devicePolicy = devicePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder groupPolicyId(@Nullable String groupPolicyId) {

            this.groupPolicyId = groupPolicyId;
            return this;
        }
        public ClientsProvisionItem build() {
            final var _resultValue = new ClientsProvisionItem();
            _resultValue.clients = clients;
            _resultValue.devicePolicy = devicePolicy;
            _resultValue.groupPolicyId = groupPolicyId;
            return _resultValue;
        }
    }
}
