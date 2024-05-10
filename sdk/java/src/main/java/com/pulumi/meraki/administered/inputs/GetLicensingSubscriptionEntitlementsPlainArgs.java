// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLicensingSubscriptionEntitlementsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLicensingSubscriptionEntitlementsPlainArgs Empty = new GetLicensingSubscriptionEntitlementsPlainArgs();

    /**
     * skus query parameter. Filter to entitlements with the specified SKUs
     * 
     */
    @Import(name="skuses")
    private @Nullable List<String> skuses;

    /**
     * @return skus query parameter. Filter to entitlements with the specified SKUs
     * 
     */
    public Optional<List<String>> skuses() {
        return Optional.ofNullable(this.skuses);
    }

    private GetLicensingSubscriptionEntitlementsPlainArgs() {}

    private GetLicensingSubscriptionEntitlementsPlainArgs(GetLicensingSubscriptionEntitlementsPlainArgs $) {
        this.skuses = $.skuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLicensingSubscriptionEntitlementsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLicensingSubscriptionEntitlementsPlainArgs $;

        public Builder() {
            $ = new GetLicensingSubscriptionEntitlementsPlainArgs();
        }

        public Builder(GetLicensingSubscriptionEntitlementsPlainArgs defaults) {
            $ = new GetLicensingSubscriptionEntitlementsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param skuses skus query parameter. Filter to entitlements with the specified SKUs
         * 
         * @return builder
         * 
         */
        public Builder skuses(@Nullable List<String> skuses) {
            $.skuses = skuses;
            return this;
        }

        /**
         * @param skuses skus query parameter. Filter to entitlements with the specified SKUs
         * 
         * @return builder
         * 
         */
        public Builder skuses(String... skuses) {
            return skuses(List.of(skuses));
        }

        public GetLicensingSubscriptionEntitlementsPlainArgs build() {
            return $;
        }
    }

}
