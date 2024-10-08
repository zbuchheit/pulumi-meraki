// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLicensingSubscriptionEntitlementsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLicensingSubscriptionEntitlementsArgs Empty = new GetLicensingSubscriptionEntitlementsArgs();

    /**
     * skus query parameter. Filter to entitlements with the specified SKUs
     * 
     */
    @Import(name="skuses")
    private @Nullable Output<List<String>> skuses;

    /**
     * @return skus query parameter. Filter to entitlements with the specified SKUs
     * 
     */
    public Optional<Output<List<String>>> skuses() {
        return Optional.ofNullable(this.skuses);
    }

    private GetLicensingSubscriptionEntitlementsArgs() {}

    private GetLicensingSubscriptionEntitlementsArgs(GetLicensingSubscriptionEntitlementsArgs $) {
        this.skuses = $.skuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLicensingSubscriptionEntitlementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLicensingSubscriptionEntitlementsArgs $;

        public Builder() {
            $ = new GetLicensingSubscriptionEntitlementsArgs();
        }

        public Builder(GetLicensingSubscriptionEntitlementsArgs defaults) {
            $ = new GetLicensingSubscriptionEntitlementsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param skuses skus query parameter. Filter to entitlements with the specified SKUs
         * 
         * @return builder
         * 
         */
        public Builder skuses(@Nullable Output<List<String>> skuses) {
            $.skuses = skuses;
            return this;
        }

        /**
         * @param skuses skus query parameter. Filter to entitlements with the specified SKUs
         * 
         * @return builder
         * 
         */
        public Builder skuses(List<String> skuses) {
            return skuses(Output.of(skuses));
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

        public GetLicensingSubscriptionEntitlementsArgs build() {
            return $;
        }
    }

}
