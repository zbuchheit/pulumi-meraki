// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetWirelessSsidsEapOverrideItemEapolKey;
import com.pulumi.meraki.networks.outputs.GetWirelessSsidsEapOverrideItemIdentity;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetWirelessSsidsEapOverrideItem {
    /**
     * @return EAPOL Key settings.
     * 
     */
    private GetWirelessSsidsEapOverrideItemEapolKey eapolKey;
    /**
     * @return EAP settings for identity requests.
     * 
     */
    private GetWirelessSsidsEapOverrideItemIdentity identity;
    /**
     * @return Maximum number of general EAP retries.
     * 
     */
    private Integer maxRetries;
    /**
     * @return General EAP timeout in seconds.
     * 
     */
    private Integer timeout;

    private GetWirelessSsidsEapOverrideItem() {}
    /**
     * @return EAPOL Key settings.
     * 
     */
    public GetWirelessSsidsEapOverrideItemEapolKey eapolKey() {
        return this.eapolKey;
    }
    /**
     * @return EAP settings for identity requests.
     * 
     */
    public GetWirelessSsidsEapOverrideItemIdentity identity() {
        return this.identity;
    }
    /**
     * @return Maximum number of general EAP retries.
     * 
     */
    public Integer maxRetries() {
        return this.maxRetries;
    }
    /**
     * @return General EAP timeout in seconds.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessSsidsEapOverrideItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetWirelessSsidsEapOverrideItemEapolKey eapolKey;
        private GetWirelessSsidsEapOverrideItemIdentity identity;
        private Integer maxRetries;
        private Integer timeout;
        public Builder() {}
        public Builder(GetWirelessSsidsEapOverrideItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eapolKey = defaults.eapolKey;
    	      this.identity = defaults.identity;
    	      this.maxRetries = defaults.maxRetries;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder eapolKey(GetWirelessSsidsEapOverrideItemEapolKey eapolKey) {
            if (eapolKey == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsEapOverrideItem", "eapolKey");
            }
            this.eapolKey = eapolKey;
            return this;
        }
        @CustomType.Setter
        public Builder identity(GetWirelessSsidsEapOverrideItemIdentity identity) {
            if (identity == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsEapOverrideItem", "identity");
            }
            this.identity = identity;
            return this;
        }
        @CustomType.Setter
        public Builder maxRetries(Integer maxRetries) {
            if (maxRetries == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsEapOverrideItem", "maxRetries");
            }
            this.maxRetries = maxRetries;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsEapOverrideItem", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        public GetWirelessSsidsEapOverrideItem build() {
            final var _resultValue = new GetWirelessSsidsEapOverrideItem();
            _resultValue.eapolKey = eapolKey;
            _resultValue.identity = identity;
            _resultValue.maxRetries = maxRetries;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}
