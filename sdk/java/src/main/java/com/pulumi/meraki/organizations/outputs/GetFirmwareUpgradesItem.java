// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetFirmwareUpgradesItemFromVersion;
import com.pulumi.meraki.organizations.outputs.GetFirmwareUpgradesItemNetwork;
import com.pulumi.meraki.organizations.outputs.GetFirmwareUpgradesItemToVersion;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirmwareUpgradesItem {
    /**
     * @return Timestamp when upgrade completed. Null if status pending.
     * 
     */
    private String completedAt;
    /**
     * @return ID of the upgrade&#39;s starting version
     * 
     */
    private GetFirmwareUpgradesItemFromVersion fromVersion;
    /**
     * @return Network of the upgrade
     * 
     */
    private GetFirmwareUpgradesItemNetwork network;
    /**
     * @return product upgraded [wireless, appliance, switch, systemsManager, camera, cellularGateway, sensor]
     * 
     */
    private String productTypes;
    /**
     * @return Status of upgrade event: [Cancelled, Completed]
     * 
     */
    private String status;
    /**
     * @return Scheduled start time
     * 
     */
    private String time;
    /**
     * @return ID of the upgrade&#39;s target version
     * 
     */
    private GetFirmwareUpgradesItemToVersion toVersion;
    /**
     * @return The upgrade batch
     * 
     */
    private String upgradeBatchId;
    /**
     * @return The upgrade
     * 
     */
    private String upgradeId;

    private GetFirmwareUpgradesItem() {}
    /**
     * @return Timestamp when upgrade completed. Null if status pending.
     * 
     */
    public String completedAt() {
        return this.completedAt;
    }
    /**
     * @return ID of the upgrade&#39;s starting version
     * 
     */
    public GetFirmwareUpgradesItemFromVersion fromVersion() {
        return this.fromVersion;
    }
    /**
     * @return Network of the upgrade
     * 
     */
    public GetFirmwareUpgradesItemNetwork network() {
        return this.network;
    }
    /**
     * @return product upgraded [wireless, appliance, switch, systemsManager, camera, cellularGateway, sensor]
     * 
     */
    public String productTypes() {
        return this.productTypes;
    }
    /**
     * @return Status of upgrade event: [Cancelled, Completed]
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Scheduled start time
     * 
     */
    public String time() {
        return this.time;
    }
    /**
     * @return ID of the upgrade&#39;s target version
     * 
     */
    public GetFirmwareUpgradesItemToVersion toVersion() {
        return this.toVersion;
    }
    /**
     * @return The upgrade batch
     * 
     */
    public String upgradeBatchId() {
        return this.upgradeBatchId;
    }
    /**
     * @return The upgrade
     * 
     */
    public String upgradeId() {
        return this.upgradeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String completedAt;
        private GetFirmwareUpgradesItemFromVersion fromVersion;
        private GetFirmwareUpgradesItemNetwork network;
        private String productTypes;
        private String status;
        private String time;
        private GetFirmwareUpgradesItemToVersion toVersion;
        private String upgradeBatchId;
        private String upgradeId;
        public Builder() {}
        public Builder(GetFirmwareUpgradesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completedAt = defaults.completedAt;
    	      this.fromVersion = defaults.fromVersion;
    	      this.network = defaults.network;
    	      this.productTypes = defaults.productTypes;
    	      this.status = defaults.status;
    	      this.time = defaults.time;
    	      this.toVersion = defaults.toVersion;
    	      this.upgradeBatchId = defaults.upgradeBatchId;
    	      this.upgradeId = defaults.upgradeId;
        }

        @CustomType.Setter
        public Builder completedAt(String completedAt) {
            if (completedAt == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "completedAt");
            }
            this.completedAt = completedAt;
            return this;
        }
        @CustomType.Setter
        public Builder fromVersion(GetFirmwareUpgradesItemFromVersion fromVersion) {
            if (fromVersion == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "fromVersion");
            }
            this.fromVersion = fromVersion;
            return this;
        }
        @CustomType.Setter
        public Builder network(GetFirmwareUpgradesItemNetwork network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder productTypes(String productTypes) {
            if (productTypes == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "productTypes");
            }
            this.productTypes = productTypes;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder time(String time) {
            if (time == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "time");
            }
            this.time = time;
            return this;
        }
        @CustomType.Setter
        public Builder toVersion(GetFirmwareUpgradesItemToVersion toVersion) {
            if (toVersion == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "toVersion");
            }
            this.toVersion = toVersion;
            return this;
        }
        @CustomType.Setter
        public Builder upgradeBatchId(String upgradeBatchId) {
            if (upgradeBatchId == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "upgradeBatchId");
            }
            this.upgradeBatchId = upgradeBatchId;
            return this;
        }
        @CustomType.Setter
        public Builder upgradeId(String upgradeId) {
            if (upgradeId == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItem", "upgradeId");
            }
            this.upgradeId = upgradeId;
            return this;
        }
        public GetFirmwareUpgradesItem build() {
            final var _resultValue = new GetFirmwareUpgradesItem();
            _resultValue.completedAt = completedAt;
            _resultValue.fromVersion = fromVersion;
            _resultValue.network = network;
            _resultValue.productTypes = productTypes;
            _resultValue.status = status;
            _resultValue.time = time;
            _resultValue.toVersion = toVersion;
            _resultValue.upgradeBatchId = upgradeBatchId;
            _resultValue.upgradeId = upgradeId;
            return _resultValue;
        }
    }
}
