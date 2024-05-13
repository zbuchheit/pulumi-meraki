// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetFirmwareUpgradesStagedGroupsItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFirmwareUpgradesStagedGroupsResult {
    /**
     * @return groupId path parameter. Group ID
     * 
     */
    private @Nullable String groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetFirmwareUpgradesStagedGroupsItem item;
    /**
     * @return Array of ResponseNetworksGetNetworkFirmwareUpgradesStagedGroups
     * 
     */
    private List<GetFirmwareUpgradesStagedGroupsItem> items;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private @Nullable String networkId;

    private GetFirmwareUpgradesStagedGroupsResult() {}
    /**
     * @return groupId path parameter. Group ID
     * 
     */
    public Optional<String> groupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetFirmwareUpgradesStagedGroupsItem item() {
        return this.item;
    }
    /**
     * @return Array of ResponseNetworksGetNetworkFirmwareUpgradesStagedGroups
     * 
     */
    public List<GetFirmwareUpgradesStagedGroupsItem> items() {
        return this.items;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesStagedGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String groupId;
        private String id;
        private GetFirmwareUpgradesStagedGroupsItem item;
        private List<GetFirmwareUpgradesStagedGroupsItem> items;
        private @Nullable String networkId;
        public Builder() {}
        public Builder(GetFirmwareUpgradesStagedGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.items = defaults.items;
    	      this.networkId = defaults.networkId;
        }

        @CustomType.Setter
        public Builder groupId(@Nullable String groupId) {

            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesStagedGroupsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetFirmwareUpgradesStagedGroupsItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesStagedGroupsResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetFirmwareUpgradesStagedGroupsItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesStagedGroupsResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetFirmwareUpgradesStagedGroupsItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkId(@Nullable String networkId) {

            this.networkId = networkId;
            return this;
        }
        public GetFirmwareUpgradesStagedGroupsResult build() {
            final var _resultValue = new GetFirmwareUpgradesStagedGroupsResult();
            _resultValue.groupId = groupId;
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.items = items;
            _resultValue.networkId = networkId;
            return _resultValue;
        }
    }
}