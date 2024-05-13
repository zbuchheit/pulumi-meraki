// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceRfProfilesItemPerSsidSettingsStatus1;
import com.pulumi.meraki.networks.outputs.GetApplianceRfProfilesItemPerSsidSettingsStatus2;
import com.pulumi.meraki.networks.outputs.GetApplianceRfProfilesItemPerSsidSettingsStatus3;
import com.pulumi.meraki.networks.outputs.GetApplianceRfProfilesItemPerSsidSettingsStatus4;
import java.util.Objects;

@CustomType
public final class GetApplianceRfProfilesItemPerSsidSettings {
    /**
     * @return Settings for SSID 1.
     * 
     */
    private GetApplianceRfProfilesItemPerSsidSettingsStatus1 status1;
    /**
     * @return Settings for SSID 2.
     * 
     */
    private GetApplianceRfProfilesItemPerSsidSettingsStatus2 status2;
    /**
     * @return Settings for SSID 3.
     * 
     */
    private GetApplianceRfProfilesItemPerSsidSettingsStatus3 status3;
    /**
     * @return Settings for SSID 4.
     * 
     */
    private GetApplianceRfProfilesItemPerSsidSettingsStatus4 status4;

    private GetApplianceRfProfilesItemPerSsidSettings() {}
    /**
     * @return Settings for SSID 1.
     * 
     */
    public GetApplianceRfProfilesItemPerSsidSettingsStatus1 status1() {
        return this.status1;
    }
    /**
     * @return Settings for SSID 2.
     * 
     */
    public GetApplianceRfProfilesItemPerSsidSettingsStatus2 status2() {
        return this.status2;
    }
    /**
     * @return Settings for SSID 3.
     * 
     */
    public GetApplianceRfProfilesItemPerSsidSettingsStatus3 status3() {
        return this.status3;
    }
    /**
     * @return Settings for SSID 4.
     * 
     */
    public GetApplianceRfProfilesItemPerSsidSettingsStatus4 status4() {
        return this.status4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceRfProfilesItemPerSsidSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetApplianceRfProfilesItemPerSsidSettingsStatus1 status1;
        private GetApplianceRfProfilesItemPerSsidSettingsStatus2 status2;
        private GetApplianceRfProfilesItemPerSsidSettingsStatus3 status3;
        private GetApplianceRfProfilesItemPerSsidSettingsStatus4 status4;
        public Builder() {}
        public Builder(GetApplianceRfProfilesItemPerSsidSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status1 = defaults.status1;
    	      this.status2 = defaults.status2;
    	      this.status3 = defaults.status3;
    	      this.status4 = defaults.status4;
        }

        @CustomType.Setter
        public Builder status1(GetApplianceRfProfilesItemPerSsidSettingsStatus1 status1) {
            if (status1 == null) {
              throw new MissingRequiredPropertyException("GetApplianceRfProfilesItemPerSsidSettings", "status1");
            }
            this.status1 = status1;
            return this;
        }
        @CustomType.Setter
        public Builder status2(GetApplianceRfProfilesItemPerSsidSettingsStatus2 status2) {
            if (status2 == null) {
              throw new MissingRequiredPropertyException("GetApplianceRfProfilesItemPerSsidSettings", "status2");
            }
            this.status2 = status2;
            return this;
        }
        @CustomType.Setter
        public Builder status3(GetApplianceRfProfilesItemPerSsidSettingsStatus3 status3) {
            if (status3 == null) {
              throw new MissingRequiredPropertyException("GetApplianceRfProfilesItemPerSsidSettings", "status3");
            }
            this.status3 = status3;
            return this;
        }
        @CustomType.Setter
        public Builder status4(GetApplianceRfProfilesItemPerSsidSettingsStatus4 status4) {
            if (status4 == null) {
              throw new MissingRequiredPropertyException("GetApplianceRfProfilesItemPerSsidSettings", "status4");
            }
            this.status4 = status4;
            return this;
        }
        public GetApplianceRfProfilesItemPerSsidSettings build() {
            final var _resultValue = new GetApplianceRfProfilesItemPerSsidSettings();
            _resultValue.status1 = status1;
            _resultValue.status2 = status2;
            _resultValue.status3 = status3;
            _resultValue.status4 = status4;
            return _resultValue;
        }
    }
}