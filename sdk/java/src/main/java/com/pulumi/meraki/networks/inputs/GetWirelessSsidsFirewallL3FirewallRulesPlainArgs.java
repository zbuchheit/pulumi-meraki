// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetWirelessSsidsFirewallL3FirewallRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWirelessSsidsFirewallL3FirewallRulesPlainArgs Empty = new GetWirelessSsidsFirewallL3FirewallRulesPlainArgs();

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

    /**
     * number path parameter.
     * 
     */
    @Import(name="number", required=true)
    private String number;

    /**
     * @return number path parameter.
     * 
     */
    public String number() {
        return this.number;
    }

    private GetWirelessSsidsFirewallL3FirewallRulesPlainArgs() {}

    private GetWirelessSsidsFirewallL3FirewallRulesPlainArgs(GetWirelessSsidsFirewallL3FirewallRulesPlainArgs $) {
        this.networkId = $.networkId;
        this.number = $.number;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWirelessSsidsFirewallL3FirewallRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWirelessSsidsFirewallL3FirewallRulesPlainArgs $;

        public Builder() {
            $ = new GetWirelessSsidsFirewallL3FirewallRulesPlainArgs();
        }

        public Builder(GetWirelessSsidsFirewallL3FirewallRulesPlainArgs defaults) {
            $ = new GetWirelessSsidsFirewallL3FirewallRulesPlainArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param number number path parameter.
         * 
         * @return builder
         * 
         */
        public Builder number(String number) {
            $.number = number;
            return this;
        }

        public GetWirelessSsidsFirewallL3FirewallRulesPlainArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetWirelessSsidsFirewallL3FirewallRulesPlainArgs", "networkId");
            }
            if ($.number == null) {
                throw new MissingRequiredPropertyException("GetWirelessSsidsFirewallL3FirewallRulesPlainArgs", "number");
            }
            return $;
        }
    }

}
