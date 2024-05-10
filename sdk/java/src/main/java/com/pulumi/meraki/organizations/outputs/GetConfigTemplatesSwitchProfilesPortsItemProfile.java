// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConfigTemplatesSwitchProfilesPortsItemProfile {
    /**
     * @return When enabled, override this port&#39;s configuration with a port profile.
     * 
     */
    private Boolean enabled;
    /**
     * @return When enabled, the ID of the port profile used to override the port&#39;s configuration.
     * 
     */
    private String id;
    /**
     * @return When enabled, the IName of the profile.
     * 
     */
    private String iname;

    private GetConfigTemplatesSwitchProfilesPortsItemProfile() {}
    /**
     * @return When enabled, override this port&#39;s configuration with a port profile.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return When enabled, the ID of the port profile used to override the port&#39;s configuration.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return When enabled, the IName of the profile.
     * 
     */
    public String iname() {
        return this.iname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigTemplatesSwitchProfilesPortsItemProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String id;
        private String iname;
        public Builder() {}
        public Builder(GetConfigTemplatesSwitchProfilesPortsItemProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.iname = defaults.iname;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetConfigTemplatesSwitchProfilesPortsItemProfile", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetConfigTemplatesSwitchProfilesPortsItemProfile", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder iname(String iname) {
            if (iname == null) {
              throw new MissingRequiredPropertyException("GetConfigTemplatesSwitchProfilesPortsItemProfile", "iname");
            }
            this.iname = iname;
            return this;
        }
        public GetConfigTemplatesSwitchProfilesPortsItemProfile build() {
            final var _resultValue = new GetConfigTemplatesSwitchProfilesPortsItemProfile();
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.iname = iname;
            return _resultValue;
        }
    }
}
