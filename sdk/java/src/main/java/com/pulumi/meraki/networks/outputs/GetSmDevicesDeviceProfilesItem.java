// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSmDevicesDeviceProfilesItem {
    /**
     * @return The Meraki managed device Id.
     * 
     */
    private String deviceId;
    /**
     * @return The numerical Meraki Id of the profile.
     * 
     */
    private String id;
    /**
     * @return A boolean indicating if the profile is encrypted.
     * 
     */
    private Boolean isEncrypted;
    /**
     * @return Whether or not the profile is managed by Meraki.
     * 
     */
    private Boolean isManaged;
    /**
     * @return The name of the profile.
     * 
     */
    private String name;
    /**
     * @return A string containing a JSON object with the profile data.
     * 
     */
    private String profileData;
    /**
     * @return The identifier of the profile.
     * 
     */
    private String profileIdentifier;
    /**
     * @return The verison of the profile.
     * 
     */
    private String version;

    private GetSmDevicesDeviceProfilesItem() {}
    /**
     * @return The Meraki managed device Id.
     * 
     */
    public String deviceId() {
        return this.deviceId;
    }
    /**
     * @return The numerical Meraki Id of the profile.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A boolean indicating if the profile is encrypted.
     * 
     */
    public Boolean isEncrypted() {
        return this.isEncrypted;
    }
    /**
     * @return Whether or not the profile is managed by Meraki.
     * 
     */
    public Boolean isManaged() {
        return this.isManaged;
    }
    /**
     * @return The name of the profile.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A string containing a JSON object with the profile data.
     * 
     */
    public String profileData() {
        return this.profileData;
    }
    /**
     * @return The identifier of the profile.
     * 
     */
    public String profileIdentifier() {
        return this.profileIdentifier;
    }
    /**
     * @return The verison of the profile.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmDevicesDeviceProfilesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deviceId;
        private String id;
        private Boolean isEncrypted;
        private Boolean isManaged;
        private String name;
        private String profileData;
        private String profileIdentifier;
        private String version;
        public Builder() {}
        public Builder(GetSmDevicesDeviceProfilesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceId = defaults.deviceId;
    	      this.id = defaults.id;
    	      this.isEncrypted = defaults.isEncrypted;
    	      this.isManaged = defaults.isManaged;
    	      this.name = defaults.name;
    	      this.profileData = defaults.profileData;
    	      this.profileIdentifier = defaults.profileIdentifier;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder deviceId(String deviceId) {
            if (deviceId == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceProfilesItem", "deviceId");
            }
            this.deviceId = deviceId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceProfilesItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isEncrypted(Boolean isEncrypted) {
            if (isEncrypted == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceProfilesItem", "isEncrypted");
            }
            this.isEncrypted = isEncrypted;
            return this;
        }
        @CustomType.Setter
        public Builder isManaged(Boolean isManaged) {
            if (isManaged == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceProfilesItem", "isManaged");
            }
            this.isManaged = isManaged;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceProfilesItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder profileData(String profileData) {
            if (profileData == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceProfilesItem", "profileData");
            }
            this.profileData = profileData;
            return this;
        }
        @CustomType.Setter
        public Builder profileIdentifier(String profileIdentifier) {
            if (profileIdentifier == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceProfilesItem", "profileIdentifier");
            }
            this.profileIdentifier = profileIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceProfilesItem", "version");
            }
            this.version = version;
            return this;
        }
        public GetSmDevicesDeviceProfilesItem build() {
            final var _resultValue = new GetSmDevicesDeviceProfilesItem();
            _resultValue.deviceId = deviceId;
            _resultValue.id = id;
            _resultValue.isEncrypted = isEncrypted;
            _resultValue.isManaged = isManaged;
            _resultValue.name = name;
            _resultValue.profileData = profileData;
            _resultValue.profileIdentifier = profileIdentifier;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}