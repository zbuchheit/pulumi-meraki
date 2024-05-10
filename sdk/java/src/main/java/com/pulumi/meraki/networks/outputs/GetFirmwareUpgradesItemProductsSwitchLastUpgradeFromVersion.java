// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirmwareUpgradesItemProductsSwitchLastUpgradeFromVersion {
    /**
     * @return Name of the firmware version
     * 
     */
    private String firmware;
    /**
     * @return Firmware version identifier
     * 
     */
    private String id;
    /**
     * @return Release date of the firmware version
     * 
     */
    private String releaseDate;
    /**
     * @return Release type of the firmware version
     * 
     */
    private String releaseType;
    /**
     * @return Firmware version short name
     * 
     */
    private String shortName;

    private GetFirmwareUpgradesItemProductsSwitchLastUpgradeFromVersion() {}
    /**
     * @return Name of the firmware version
     * 
     */
    public String firmware() {
        return this.firmware;
    }
    /**
     * @return Firmware version identifier
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Release date of the firmware version
     * 
     */
    public String releaseDate() {
        return this.releaseDate;
    }
    /**
     * @return Release type of the firmware version
     * 
     */
    public String releaseType() {
        return this.releaseType;
    }
    /**
     * @return Firmware version short name
     * 
     */
    public String shortName() {
        return this.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesItemProductsSwitchLastUpgradeFromVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String firmware;
        private String id;
        private String releaseDate;
        private String releaseType;
        private String shortName;
        public Builder() {}
        public Builder(GetFirmwareUpgradesItemProductsSwitchLastUpgradeFromVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firmware = defaults.firmware;
    	      this.id = defaults.id;
    	      this.releaseDate = defaults.releaseDate;
    	      this.releaseType = defaults.releaseType;
    	      this.shortName = defaults.shortName;
        }

        @CustomType.Setter
        public Builder firmware(String firmware) {
            if (firmware == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsSwitchLastUpgradeFromVersion", "firmware");
            }
            this.firmware = firmware;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsSwitchLastUpgradeFromVersion", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder releaseDate(String releaseDate) {
            if (releaseDate == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsSwitchLastUpgradeFromVersion", "releaseDate");
            }
            this.releaseDate = releaseDate;
            return this;
        }
        @CustomType.Setter
        public Builder releaseType(String releaseType) {
            if (releaseType == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsSwitchLastUpgradeFromVersion", "releaseType");
            }
            this.releaseType = releaseType;
            return this;
        }
        @CustomType.Setter
        public Builder shortName(String shortName) {
            if (shortName == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsSwitchLastUpgradeFromVersion", "shortName");
            }
            this.shortName = shortName;
            return this;
        }
        public GetFirmwareUpgradesItemProductsSwitchLastUpgradeFromVersion build() {
            final var _resultValue = new GetFirmwareUpgradesItemProductsSwitchLastUpgradeFromVersion();
            _resultValue.firmware = firmware;
            _resultValue.id = id;
            _resultValue.releaseDate = releaseDate;
            _resultValue.releaseType = releaseType;
            _resultValue.shortName = shortName;
            return _resultValue;
        }
    }
}
