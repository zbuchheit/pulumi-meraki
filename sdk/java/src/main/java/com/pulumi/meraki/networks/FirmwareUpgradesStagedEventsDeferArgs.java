// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FirmwareUpgradesStagedEventsDeferArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedEventsDeferArgs Empty = new FirmwareUpgradesStagedEventsDeferArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    private FirmwareUpgradesStagedEventsDeferArgs() {}

    private FirmwareUpgradesStagedEventsDeferArgs(FirmwareUpgradesStagedEventsDeferArgs $) {
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedEventsDeferArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedEventsDeferArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedEventsDeferArgs();
        }

        public Builder(FirmwareUpgradesStagedEventsDeferArgs defaults) {
            $ = new FirmwareUpgradesStagedEventsDeferArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        public FirmwareUpgradesStagedEventsDeferArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("FirmwareUpgradesStagedEventsDeferArgs", "networkId");
            }
            return $;
        }
    }

}
