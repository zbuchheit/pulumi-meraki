// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetFirmwareUpgradesByDeviceItem;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFirmwareUpgradesByDeviceResult {
    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String endingBefore;
    /**
     * @return firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
     * 
     */
    private @Nullable List<String> firmwareUpgradeBatchIds;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseOrganizationsGetOrganizationFirmwareUpgradesByDevice
     * 
     */
    private List<GetFirmwareUpgradesByDeviceItem> items;
    /**
     * @return macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
     * 
     */
    private @Nullable List<String> macs;
    /**
     * @return networkIds query parameter. Optional parameter to filter by network
     * 
     */
    private @Nullable List<String> networkIds;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private String organizationId;
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     * 
     */
    private @Nullable Integer perPage;
    /**
     * @return serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
     * 
     */
    private @Nullable List<String> serials;
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    private @Nullable String startingAfter;
    /**
     * @return upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
     * 
     */
    private @Nullable List<String> upgradestatuses;

    private GetFirmwareUpgradesByDeviceResult() {}
    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }
    /**
     * @return firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
     * 
     */
    public List<String> firmwareUpgradeBatchIds() {
        return this.firmwareUpgradeBatchIds == null ? List.of() : this.firmwareUpgradeBatchIds;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseOrganizationsGetOrganizationFirmwareUpgradesByDevice
     * 
     */
    public List<GetFirmwareUpgradesByDeviceItem> items() {
        return this.items;
    }
    /**
     * @return macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
     * 
     */
    public List<String> macs() {
        return this.macs == null ? List.of() : this.macs;
    }
    /**
     * @return networkIds query parameter. Optional parameter to filter by network
     * 
     */
    public List<String> networkIds() {
        return this.networkIds == null ? List.of() : this.networkIds;
    }
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }
    /**
     * @return serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
     * 
     */
    public List<String> serials() {
        return this.serials == null ? List.of() : this.serials;
    }
    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }
    /**
     * @return upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
     * 
     */
    public List<String> upgradestatuses() {
        return this.upgradestatuses == null ? List.of() : this.upgradestatuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesByDeviceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endingBefore;
        private @Nullable List<String> firmwareUpgradeBatchIds;
        private String id;
        private List<GetFirmwareUpgradesByDeviceItem> items;
        private @Nullable List<String> macs;
        private @Nullable List<String> networkIds;
        private String organizationId;
        private @Nullable Integer perPage;
        private @Nullable List<String> serials;
        private @Nullable String startingAfter;
        private @Nullable List<String> upgradestatuses;
        public Builder() {}
        public Builder(GetFirmwareUpgradesByDeviceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endingBefore = defaults.endingBefore;
    	      this.firmwareUpgradeBatchIds = defaults.firmwareUpgradeBatchIds;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.macs = defaults.macs;
    	      this.networkIds = defaults.networkIds;
    	      this.organizationId = defaults.organizationId;
    	      this.perPage = defaults.perPage;
    	      this.serials = defaults.serials;
    	      this.startingAfter = defaults.startingAfter;
    	      this.upgradestatuses = defaults.upgradestatuses;
        }

        @CustomType.Setter
        public Builder endingBefore(@Nullable String endingBefore) {

            this.endingBefore = endingBefore;
            return this;
        }
        @CustomType.Setter
        public Builder firmwareUpgradeBatchIds(@Nullable List<String> firmwareUpgradeBatchIds) {

            this.firmwareUpgradeBatchIds = firmwareUpgradeBatchIds;
            return this;
        }
        public Builder firmwareUpgradeBatchIds(String... firmwareUpgradeBatchIds) {
            return firmwareUpgradeBatchIds(List.of(firmwareUpgradeBatchIds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesByDeviceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetFirmwareUpgradesByDeviceItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesByDeviceResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetFirmwareUpgradesByDeviceItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder macs(@Nullable List<String> macs) {

            this.macs = macs;
            return this;
        }
        public Builder macs(String... macs) {
            return macs(List.of(macs));
        }
        @CustomType.Setter
        public Builder networkIds(@Nullable List<String> networkIds) {

            this.networkIds = networkIds;
            return this;
        }
        public Builder networkIds(String... networkIds) {
            return networkIds(List.of(networkIds));
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesByDeviceResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder perPage(@Nullable Integer perPage) {

            this.perPage = perPage;
            return this;
        }
        @CustomType.Setter
        public Builder serials(@Nullable List<String> serials) {

            this.serials = serials;
            return this;
        }
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }
        @CustomType.Setter
        public Builder startingAfter(@Nullable String startingAfter) {

            this.startingAfter = startingAfter;
            return this;
        }
        @CustomType.Setter
        public Builder upgradestatuses(@Nullable List<String> upgradestatuses) {

            this.upgradestatuses = upgradestatuses;
            return this;
        }
        public Builder upgradestatuses(String... upgradestatuses) {
            return upgradestatuses(List.of(upgradestatuses));
        }
        public GetFirmwareUpgradesByDeviceResult build() {
            final var _resultValue = new GetFirmwareUpgradesByDeviceResult();
            _resultValue.endingBefore = endingBefore;
            _resultValue.firmwareUpgradeBatchIds = firmwareUpgradeBatchIds;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.macs = macs;
            _resultValue.networkIds = networkIds;
            _resultValue.organizationId = organizationId;
            _resultValue.perPage = perPage;
            _resultValue.serials = serials;
            _resultValue.startingAfter = startingAfter;
            _resultValue.upgradestatuses = upgradestatuses;
            return _resultValue;
        }
    }
}
