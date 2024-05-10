// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.ClaimItemLicense;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ClaimItem {
    /**
     * @return The licenses claimed
     * 
     */
    private @Nullable List<ClaimItemLicense> licenses;
    /**
     * @return The numbers of the orders claimed
     * 
     */
    private @Nullable List<String> orders;
    /**
     * @return The serials of the devices claimed
     * 
     */
    private @Nullable List<String> serials;

    private ClaimItem() {}
    /**
     * @return The licenses claimed
     * 
     */
    public List<ClaimItemLicense> licenses() {
        return this.licenses == null ? List.of() : this.licenses;
    }
    /**
     * @return The numbers of the orders claimed
     * 
     */
    public List<String> orders() {
        return this.orders == null ? List.of() : this.orders;
    }
    /**
     * @return The serials of the devices claimed
     * 
     */
    public List<String> serials() {
        return this.serials == null ? List.of() : this.serials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClaimItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ClaimItemLicense> licenses;
        private @Nullable List<String> orders;
        private @Nullable List<String> serials;
        public Builder() {}
        public Builder(ClaimItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.licenses = defaults.licenses;
    	      this.orders = defaults.orders;
    	      this.serials = defaults.serials;
        }

        @CustomType.Setter
        public Builder licenses(@Nullable List<ClaimItemLicense> licenses) {

            this.licenses = licenses;
            return this;
        }
        public Builder licenses(ClaimItemLicense... licenses) {
            return licenses(List.of(licenses));
        }
        @CustomType.Setter
        public Builder orders(@Nullable List<String> orders) {

            this.orders = orders;
            return this;
        }
        public Builder orders(String... orders) {
            return orders(List.of(orders));
        }
        @CustomType.Setter
        public Builder serials(@Nullable List<String> serials) {

            this.serials = serials;
            return this;
        }
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }
        public ClaimItem build() {
            final var _resultValue = new ClaimItem();
            _resultValue.licenses = licenses;
            _resultValue.orders = orders;
            _resultValue.serials = serials;
            return _resultValue;
        }
    }
}
