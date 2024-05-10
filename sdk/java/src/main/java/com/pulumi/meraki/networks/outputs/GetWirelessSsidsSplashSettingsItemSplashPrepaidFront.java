// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessSsidsSplashSettingsItemSplashPrepaidFront {
    /**
     * @return The extension of the prepaid front image file.
     * 
     */
    private String extension;
    /**
     * @return The MD5 value of the prepaid front image file.
     * 
     */
    private String md5;

    private GetWirelessSsidsSplashSettingsItemSplashPrepaidFront() {}
    /**
     * @return The extension of the prepaid front image file.
     * 
     */
    public String extension() {
        return this.extension;
    }
    /**
     * @return The MD5 value of the prepaid front image file.
     * 
     */
    public String md5() {
        return this.md5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessSsidsSplashSettingsItemSplashPrepaidFront defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String extension;
        private String md5;
        public Builder() {}
        public Builder(GetWirelessSsidsSplashSettingsItemSplashPrepaidFront defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extension = defaults.extension;
    	      this.md5 = defaults.md5;
        }

        @CustomType.Setter
        public Builder extension(String extension) {
            if (extension == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsSplashSettingsItemSplashPrepaidFront", "extension");
            }
            this.extension = extension;
            return this;
        }
        @CustomType.Setter
        public Builder md5(String md5) {
            if (md5 == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsSplashSettingsItemSplashPrepaidFront", "md5");
            }
            this.md5 = md5;
            return this;
        }
        public GetWirelessSsidsSplashSettingsItemSplashPrepaidFront build() {
            final var _resultValue = new GetWirelessSsidsSplashSettingsItemSplashPrepaidFront();
            _resultValue.extension = extension;
            _resultValue.md5 = md5;
            return _resultValue;
        }
    }
}
