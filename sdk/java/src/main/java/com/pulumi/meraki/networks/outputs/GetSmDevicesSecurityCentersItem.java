// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSmDevicesSecurityCentersItem {
    /**
     * @return The Meraki managed application Id for this record on a particular device.
     * 
     */
    private String appId;
    /**
     * @return The size of the software bundle.
     * 
     */
    private Integer bundleSize;
    /**
     * @return When the Meraki record for the software was created.
     * 
     */
    private String createdAt;
    /**
     * @return The Meraki managed device Id.
     * 
     */
    private String deviceId;
    /**
     * @return The size of the data stored in the application.
     * 
     */
    private Integer dynamicSize;
    /**
     * @return The Meraki software Id.
     * 
     */
    private String id;
    /**
     * @return Software bundle identifier.
     * 
     */
    private String identifier;
    /**
     * @return When the Software was installed on the device.
     * 
     */
    private String installedAt;
    /**
     * @return A boolean indicating whether or not an iOS redemption code was used.
     * 
     */
    private Boolean iosRedemptionCode;
    /**
     * @return A boolean indicating whether or not the software is managed by Meraki.
     * 
     */
    private Boolean isManaged;
    /**
     * @return The itunes numerical identifier.
     * 
     */
    private String itunesId;
    /**
     * @return The license key associated with this software installation.
     * 
     */
    private String licenseKey;
    /**
     * @return The name of the software.
     * 
     */
    private String name;
    /**
     * @return The path on the device where the software record is located.
     * 
     */
    private String path;
    /**
     * @return The redemption code used for this software.
     * 
     */
    private Integer redemptionCode;
    /**
     * @return Short version notation for the software.
     * 
     */
    private String shortVersion;
    /**
     * @return The management status of the software.
     * 
     */
    private String status;
    /**
     * @return A boolean indicating this software record should be installed on the associated device.
     * 
     */
    private Boolean toInstall;
    /**
     * @return A boolean indicating this software record should be uninstalled on the associated device.
     * 
     */
    private Boolean toUninstall;
    /**
     * @return When the record was uninstalled from the device.
     * 
     */
    private String uninstalledAt;
    /**
     * @return When the record was last updated by Meraki.
     * 
     */
    private String updatedAt;
    /**
     * @return The vendor of the software.
     * 
     */
    private String vendor;
    /**
     * @return Full version notation for the software.
     * 
     */
    private String version;

    private GetSmDevicesSecurityCentersItem() {}
    /**
     * @return The Meraki managed application Id for this record on a particular device.
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return The size of the software bundle.
     * 
     */
    public Integer bundleSize() {
        return this.bundleSize;
    }
    /**
     * @return When the Meraki record for the software was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The Meraki managed device Id.
     * 
     */
    public String deviceId() {
        return this.deviceId;
    }
    /**
     * @return The size of the data stored in the application.
     * 
     */
    public Integer dynamicSize() {
        return this.dynamicSize;
    }
    /**
     * @return The Meraki software Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Software bundle identifier.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return When the Software was installed on the device.
     * 
     */
    public String installedAt() {
        return this.installedAt;
    }
    /**
     * @return A boolean indicating whether or not an iOS redemption code was used.
     * 
     */
    public Boolean iosRedemptionCode() {
        return this.iosRedemptionCode;
    }
    /**
     * @return A boolean indicating whether or not the software is managed by Meraki.
     * 
     */
    public Boolean isManaged() {
        return this.isManaged;
    }
    /**
     * @return The itunes numerical identifier.
     * 
     */
    public String itunesId() {
        return this.itunesId;
    }
    /**
     * @return The license key associated with this software installation.
     * 
     */
    public String licenseKey() {
        return this.licenseKey;
    }
    /**
     * @return The name of the software.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The path on the device where the software record is located.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The redemption code used for this software.
     * 
     */
    public Integer redemptionCode() {
        return this.redemptionCode;
    }
    /**
     * @return Short version notation for the software.
     * 
     */
    public String shortVersion() {
        return this.shortVersion;
    }
    /**
     * @return The management status of the software.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A boolean indicating this software record should be installed on the associated device.
     * 
     */
    public Boolean toInstall() {
        return this.toInstall;
    }
    /**
     * @return A boolean indicating this software record should be uninstalled on the associated device.
     * 
     */
    public Boolean toUninstall() {
        return this.toUninstall;
    }
    /**
     * @return When the record was uninstalled from the device.
     * 
     */
    public String uninstalledAt() {
        return this.uninstalledAt;
    }
    /**
     * @return When the record was last updated by Meraki.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }
    /**
     * @return The vendor of the software.
     * 
     */
    public String vendor() {
        return this.vendor;
    }
    /**
     * @return Full version notation for the software.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmDevicesSecurityCentersItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appId;
        private Integer bundleSize;
        private String createdAt;
        private String deviceId;
        private Integer dynamicSize;
        private String id;
        private String identifier;
        private String installedAt;
        private Boolean iosRedemptionCode;
        private Boolean isManaged;
        private String itunesId;
        private String licenseKey;
        private String name;
        private String path;
        private Integer redemptionCode;
        private String shortVersion;
        private String status;
        private Boolean toInstall;
        private Boolean toUninstall;
        private String uninstalledAt;
        private String updatedAt;
        private String vendor;
        private String version;
        public Builder() {}
        public Builder(GetSmDevicesSecurityCentersItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.bundleSize = defaults.bundleSize;
    	      this.createdAt = defaults.createdAt;
    	      this.deviceId = defaults.deviceId;
    	      this.dynamicSize = defaults.dynamicSize;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.installedAt = defaults.installedAt;
    	      this.iosRedemptionCode = defaults.iosRedemptionCode;
    	      this.isManaged = defaults.isManaged;
    	      this.itunesId = defaults.itunesId;
    	      this.licenseKey = defaults.licenseKey;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.redemptionCode = defaults.redemptionCode;
    	      this.shortVersion = defaults.shortVersion;
    	      this.status = defaults.status;
    	      this.toInstall = defaults.toInstall;
    	      this.toUninstall = defaults.toUninstall;
    	      this.uninstalledAt = defaults.uninstalledAt;
    	      this.updatedAt = defaults.updatedAt;
    	      this.vendor = defaults.vendor;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder appId(String appId) {
            if (appId == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "appId");
            }
            this.appId = appId;
            return this;
        }
        @CustomType.Setter
        public Builder bundleSize(Integer bundleSize) {
            if (bundleSize == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "bundleSize");
            }
            this.bundleSize = bundleSize;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder deviceId(String deviceId) {
            if (deviceId == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "deviceId");
            }
            this.deviceId = deviceId;
            return this;
        }
        @CustomType.Setter
        public Builder dynamicSize(Integer dynamicSize) {
            if (dynamicSize == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "dynamicSize");
            }
            this.dynamicSize = dynamicSize;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder installedAt(String installedAt) {
            if (installedAt == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "installedAt");
            }
            this.installedAt = installedAt;
            return this;
        }
        @CustomType.Setter
        public Builder iosRedemptionCode(Boolean iosRedemptionCode) {
            if (iosRedemptionCode == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "iosRedemptionCode");
            }
            this.iosRedemptionCode = iosRedemptionCode;
            return this;
        }
        @CustomType.Setter
        public Builder isManaged(Boolean isManaged) {
            if (isManaged == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "isManaged");
            }
            this.isManaged = isManaged;
            return this;
        }
        @CustomType.Setter
        public Builder itunesId(String itunesId) {
            if (itunesId == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "itunesId");
            }
            this.itunesId = itunesId;
            return this;
        }
        @CustomType.Setter
        public Builder licenseKey(String licenseKey) {
            if (licenseKey == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "licenseKey");
            }
            this.licenseKey = licenseKey;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder redemptionCode(Integer redemptionCode) {
            if (redemptionCode == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "redemptionCode");
            }
            this.redemptionCode = redemptionCode;
            return this;
        }
        @CustomType.Setter
        public Builder shortVersion(String shortVersion) {
            if (shortVersion == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "shortVersion");
            }
            this.shortVersion = shortVersion;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder toInstall(Boolean toInstall) {
            if (toInstall == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "toInstall");
            }
            this.toInstall = toInstall;
            return this;
        }
        @CustomType.Setter
        public Builder toUninstall(Boolean toUninstall) {
            if (toUninstall == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "toUninstall");
            }
            this.toUninstall = toUninstall;
            return this;
        }
        @CustomType.Setter
        public Builder uninstalledAt(String uninstalledAt) {
            if (uninstalledAt == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "uninstalledAt");
            }
            this.uninstalledAt = uninstalledAt;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        @CustomType.Setter
        public Builder vendor(String vendor) {
            if (vendor == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "vendor");
            }
            this.vendor = vendor;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesSecurityCentersItem", "version");
            }
            this.version = version;
            return this;
        }
        public GetSmDevicesSecurityCentersItem build() {
            final var _resultValue = new GetSmDevicesSecurityCentersItem();
            _resultValue.appId = appId;
            _resultValue.bundleSize = bundleSize;
            _resultValue.createdAt = createdAt;
            _resultValue.deviceId = deviceId;
            _resultValue.dynamicSize = dynamicSize;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.installedAt = installedAt;
            _resultValue.iosRedemptionCode = iosRedemptionCode;
            _resultValue.isManaged = isManaged;
            _resultValue.itunesId = itunesId;
            _resultValue.licenseKey = licenseKey;
            _resultValue.name = name;
            _resultValue.path = path;
            _resultValue.redemptionCode = redemptionCode;
            _resultValue.shortVersion = shortVersion;
            _resultValue.status = status;
            _resultValue.toInstall = toInstall;
            _resultValue.toUninstall = toUninstall;
            _resultValue.uninstalledAt = uninstalledAt;
            _resultValue.updatedAt = updatedAt;
            _resultValue.vendor = vendor;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
