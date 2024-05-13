// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.administered.outputs.LicensingSubscriptionSubscriptionsBindItemInsufficientEntitlement;
import com.pulumi.meraki.administered.outputs.LicensingSubscriptionSubscriptionsBindItemNetwork;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LicensingSubscriptionSubscriptionsBindItem {
    /**
     * @return Array of errors if failed
     * 
     */
    private @Nullable List<String> errors;
    /**
     * @return A list of entitlements required to successfully bind the networks to the subscription
     * 
     */
    private @Nullable List<LicensingSubscriptionSubscriptionsBindItemInsufficientEntitlement> insufficientEntitlements;
    /**
     * @return Unbound networks
     * 
     */
    private @Nullable List<LicensingSubscriptionSubscriptionsBindItemNetwork> networks;
    /**
     * @return Subscription ID
     * 
     */
    private @Nullable String subscriptionId;

    private LicensingSubscriptionSubscriptionsBindItem() {}
    /**
     * @return Array of errors if failed
     * 
     */
    public List<String> errors() {
        return this.errors == null ? List.of() : this.errors;
    }
    /**
     * @return A list of entitlements required to successfully bind the networks to the subscription
     * 
     */
    public List<LicensingSubscriptionSubscriptionsBindItemInsufficientEntitlement> insufficientEntitlements() {
        return this.insufficientEntitlements == null ? List.of() : this.insufficientEntitlements;
    }
    /**
     * @return Unbound networks
     * 
     */
    public List<LicensingSubscriptionSubscriptionsBindItemNetwork> networks() {
        return this.networks == null ? List.of() : this.networks;
    }
    /**
     * @return Subscription ID
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicensingSubscriptionSubscriptionsBindItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> errors;
        private @Nullable List<LicensingSubscriptionSubscriptionsBindItemInsufficientEntitlement> insufficientEntitlements;
        private @Nullable List<LicensingSubscriptionSubscriptionsBindItemNetwork> networks;
        private @Nullable String subscriptionId;
        public Builder() {}
        public Builder(LicensingSubscriptionSubscriptionsBindItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.insufficientEntitlements = defaults.insufficientEntitlements;
    	      this.networks = defaults.networks;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        @CustomType.Setter
        public Builder errors(@Nullable List<String> errors) {

            this.errors = errors;
            return this;
        }
        public Builder errors(String... errors) {
            return errors(List.of(errors));
        }
        @CustomType.Setter
        public Builder insufficientEntitlements(@Nullable List<LicensingSubscriptionSubscriptionsBindItemInsufficientEntitlement> insufficientEntitlements) {

            this.insufficientEntitlements = insufficientEntitlements;
            return this;
        }
        public Builder insufficientEntitlements(LicensingSubscriptionSubscriptionsBindItemInsufficientEntitlement... insufficientEntitlements) {
            return insufficientEntitlements(List.of(insufficientEntitlements));
        }
        @CustomType.Setter
        public Builder networks(@Nullable List<LicensingSubscriptionSubscriptionsBindItemNetwork> networks) {

            this.networks = networks;
            return this;
        }
        public Builder networks(LicensingSubscriptionSubscriptionsBindItemNetwork... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder subscriptionId(@Nullable String subscriptionId) {

            this.subscriptionId = subscriptionId;
            return this;
        }
        public LicensingSubscriptionSubscriptionsBindItem build() {
            final var _resultValue = new LicensingSubscriptionSubscriptionsBindItem();
            _resultValue.errors = errors;
            _resultValue.insufficientEntitlements = insufficientEntitlements;
            _resultValue.networks = networks;
            _resultValue.subscriptionId = subscriptionId;
            return _resultValue;
        }
    }
}