// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSwitchRoutingMulticastRendezvousPointsItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSwitchRoutingMulticastRendezvousPointsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetSwitchRoutingMulticastRendezvousPointsItem item;
    /**
     * @return Array of ResponseSwitchGetNetworkSwitchRoutingMulticastRendezvousPoints
     * 
     */
    private List<GetSwitchRoutingMulticastRendezvousPointsItem> items;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private @Nullable String networkId;
    /**
     * @return rendezvousPointId path parameter. Rendezvous point ID
     * 
     */
    private @Nullable String rendezvousPointId;

    private GetSwitchRoutingMulticastRendezvousPointsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetSwitchRoutingMulticastRendezvousPointsItem item() {
        return this.item;
    }
    /**
     * @return Array of ResponseSwitchGetNetworkSwitchRoutingMulticastRendezvousPoints
     * 
     */
    public List<GetSwitchRoutingMulticastRendezvousPointsItem> items() {
        return this.items;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }
    /**
     * @return rendezvousPointId path parameter. Rendezvous point ID
     * 
     */
    public Optional<String> rendezvousPointId() {
        return Optional.ofNullable(this.rendezvousPointId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchRoutingMulticastRendezvousPointsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetSwitchRoutingMulticastRendezvousPointsItem item;
        private List<GetSwitchRoutingMulticastRendezvousPointsItem> items;
        private @Nullable String networkId;
        private @Nullable String rendezvousPointId;
        public Builder() {}
        public Builder(GetSwitchRoutingMulticastRendezvousPointsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.items = defaults.items;
    	      this.networkId = defaults.networkId;
    	      this.rendezvousPointId = defaults.rendezvousPointId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastRendezvousPointsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetSwitchRoutingMulticastRendezvousPointsItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastRendezvousPointsResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetSwitchRoutingMulticastRendezvousPointsItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastRendezvousPointsResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetSwitchRoutingMulticastRendezvousPointsItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkId(@Nullable String networkId) {

            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder rendezvousPointId(@Nullable String rendezvousPointId) {

            this.rendezvousPointId = rendezvousPointId;
            return this;
        }
        public GetSwitchRoutingMulticastRendezvousPointsResult build() {
            final var _resultValue = new GetSwitchRoutingMulticastRendezvousPointsResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.items = items;
            _resultValue.networkId = networkId;
            _resultValue.rendezvousPointId = rendezvousPointId;
            return _resultValue;
        }
    }
}
