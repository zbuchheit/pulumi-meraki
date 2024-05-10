// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLicensingCotermLicensesItemEdition {
    /**
     * @return The name of the license edition
     * 
     */
    private String edition;
    /**
     * @return The product type of the license edition
     * 
     */
    private String productType;

    private GetLicensingCotermLicensesItemEdition() {}
    /**
     * @return The name of the license edition
     * 
     */
    public String edition() {
        return this.edition;
    }
    /**
     * @return The product type of the license edition
     * 
     */
    public String productType() {
        return this.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensingCotermLicensesItemEdition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String edition;
        private String productType;
        public Builder() {}
        public Builder(GetLicensingCotermLicensesItemEdition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edition = defaults.edition;
    	      this.productType = defaults.productType;
        }

        @CustomType.Setter
        public Builder edition(String edition) {
            if (edition == null) {
              throw new MissingRequiredPropertyException("GetLicensingCotermLicensesItemEdition", "edition");
            }
            this.edition = edition;
            return this;
        }
        @CustomType.Setter
        public Builder productType(String productType) {
            if (productType == null) {
              throw new MissingRequiredPropertyException("GetLicensingCotermLicensesItemEdition", "productType");
            }
            this.productType = productType;
            return this;
        }
        public GetLicensingCotermLicensesItemEdition build() {
            final var _resultValue = new GetLicensingCotermLicensesItemEdition();
            _resultValue.edition = edition;
            _resultValue.productType = productType;
            return _resultValue;
        }
    }
}
