// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSwitchPortSchedulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchPortSchedulesPlainArgs Empty = new GetSwitchPortSchedulesPlainArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    private GetSwitchPortSchedulesPlainArgs() {}

    private GetSwitchPortSchedulesPlainArgs(GetSwitchPortSchedulesPlainArgs $) {
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchPortSchedulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchPortSchedulesPlainArgs $;

        public Builder() {
            $ = new GetSwitchPortSchedulesPlainArgs();
        }

        public Builder(GetSwitchPortSchedulesPlainArgs defaults) {
            $ = new GetSwitchPortSchedulesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            $.networkId = networkId;
            return this;
        }

        public GetSwitchPortSchedulesPlainArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSwitchPortSchedulesPlainArgs", "networkId");
            }
            return $;
        }
    }

}