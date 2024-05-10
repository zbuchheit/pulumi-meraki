// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLicensesItemPermanentlyQueuedLicense {
    /**
     * @return The duration of the individual license
     * 
     */
    private Integer durationInDays;
    /**
     * @return Permanently queued license ID
     * 
     */
    private String id;
    /**
     * @return License key
     * 
     */
    private String licenseKey;
    /**
     * @return License type
     * 
     */
    private String licenseType;
    /**
     * @return Order number
     * 
     */
    private String orderNumber;

    private GetLicensesItemPermanentlyQueuedLicense() {}
    /**
     * @return The duration of the individual license
     * 
     */
    public Integer durationInDays() {
        return this.durationInDays;
    }
    /**
     * @return Permanently queued license ID
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return License key
     * 
     */
    public String licenseKey() {
        return this.licenseKey;
    }
    /**
     * @return License type
     * 
     */
    public String licenseType() {
        return this.licenseType;
    }
    /**
     * @return Order number
     * 
     */
    public String orderNumber() {
        return this.orderNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensesItemPermanentlyQueuedLicense defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer durationInDays;
        private String id;
        private String licenseKey;
        private String licenseType;
        private String orderNumber;
        public Builder() {}
        public Builder(GetLicensesItemPermanentlyQueuedLicense defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInDays = defaults.durationInDays;
    	      this.id = defaults.id;
    	      this.licenseKey = defaults.licenseKey;
    	      this.licenseType = defaults.licenseType;
    	      this.orderNumber = defaults.orderNumber;
        }

        @CustomType.Setter
        public Builder durationInDays(Integer durationInDays) {
            if (durationInDays == null) {
              throw new MissingRequiredPropertyException("GetLicensesItemPermanentlyQueuedLicense", "durationInDays");
            }
            this.durationInDays = durationInDays;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLicensesItemPermanentlyQueuedLicense", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder licenseKey(String licenseKey) {
            if (licenseKey == null) {
              throw new MissingRequiredPropertyException("GetLicensesItemPermanentlyQueuedLicense", "licenseKey");
            }
            this.licenseKey = licenseKey;
            return this;
        }
        @CustomType.Setter
        public Builder licenseType(String licenseType) {
            if (licenseType == null) {
              throw new MissingRequiredPropertyException("GetLicensesItemPermanentlyQueuedLicense", "licenseType");
            }
            this.licenseType = licenseType;
            return this;
        }
        @CustomType.Setter
        public Builder orderNumber(String orderNumber) {
            if (orderNumber == null) {
              throw new MissingRequiredPropertyException("GetLicensesItemPermanentlyQueuedLicense", "orderNumber");
            }
            this.orderNumber = orderNumber;
            return this;
        }
        public GetLicensesItemPermanentlyQueuedLicense build() {
            final var _resultValue = new GetLicensesItemPermanentlyQueuedLicense();
            _resultValue.durationInDays = durationInDays;
            _resultValue.id = id;
            _resultValue.licenseKey = licenseKey;
            _resultValue.licenseType = licenseType;
            _resultValue.orderNumber = orderNumber;
            return _resultValue;
        }
    }
}
