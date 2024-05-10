// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.WirelessSsidsVpnConcentratorArgs;
import com.pulumi.meraki.networks.inputs.WirelessSsidsVpnFailoverArgs;
import com.pulumi.meraki.networks.inputs.WirelessSsidsVpnSplitTunnelArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsVpnArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsVpnArgs Empty = new WirelessSsidsVpnArgs();

    /**
     * The VPN concentrator settings for this SSID.
     * 
     */
    @Import(name="concentrator")
    private @Nullable Output<WirelessSsidsVpnConcentratorArgs> concentrator;

    /**
     * @return The VPN concentrator settings for this SSID.
     * 
     */
    public Optional<Output<WirelessSsidsVpnConcentratorArgs>> concentrator() {
        return Optional.ofNullable(this.concentrator);
    }

    /**
     * Secondary VPN concentrator settings. This is only used when two VPN concentrators are configured on the SSID.
     * 
     */
    @Import(name="failover")
    private @Nullable Output<WirelessSsidsVpnFailoverArgs> failover;

    /**
     * @return Secondary VPN concentrator settings. This is only used when two VPN concentrators are configured on the SSID.
     * 
     */
    public Optional<Output<WirelessSsidsVpnFailoverArgs>> failover() {
        return Optional.ofNullable(this.failover);
    }

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

    /**
     * number path parameter.
     * 
     */
    @Import(name="number", required=true)
    private Output<String> number;

    /**
     * @return number path parameter.
     * 
     */
    public Output<String> number() {
        return this.number;
    }

    /**
     * The VPN split tunnel settings for this SSID.
     * 
     */
    @Import(name="splitTunnel")
    private @Nullable Output<WirelessSsidsVpnSplitTunnelArgs> splitTunnel;

    /**
     * @return The VPN split tunnel settings for this SSID.
     * 
     */
    public Optional<Output<WirelessSsidsVpnSplitTunnelArgs>> splitTunnel() {
        return Optional.ofNullable(this.splitTunnel);
    }

    private WirelessSsidsVpnArgs() {}

    private WirelessSsidsVpnArgs(WirelessSsidsVpnArgs $) {
        this.concentrator = $.concentrator;
        this.failover = $.failover;
        this.networkId = $.networkId;
        this.number = $.number;
        this.splitTunnel = $.splitTunnel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsVpnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsVpnArgs $;

        public Builder() {
            $ = new WirelessSsidsVpnArgs();
        }

        public Builder(WirelessSsidsVpnArgs defaults) {
            $ = new WirelessSsidsVpnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param concentrator The VPN concentrator settings for this SSID.
         * 
         * @return builder
         * 
         */
        public Builder concentrator(@Nullable Output<WirelessSsidsVpnConcentratorArgs> concentrator) {
            $.concentrator = concentrator;
            return this;
        }

        /**
         * @param concentrator The VPN concentrator settings for this SSID.
         * 
         * @return builder
         * 
         */
        public Builder concentrator(WirelessSsidsVpnConcentratorArgs concentrator) {
            return concentrator(Output.of(concentrator));
        }

        /**
         * @param failover Secondary VPN concentrator settings. This is only used when two VPN concentrators are configured on the SSID.
         * 
         * @return builder
         * 
         */
        public Builder failover(@Nullable Output<WirelessSsidsVpnFailoverArgs> failover) {
            $.failover = failover;
            return this;
        }

        /**
         * @param failover Secondary VPN concentrator settings. This is only used when two VPN concentrators are configured on the SSID.
         * 
         * @return builder
         * 
         */
        public Builder failover(WirelessSsidsVpnFailoverArgs failover) {
            return failover(Output.of(failover));
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

        /**
         * @param number number path parameter.
         * 
         * @return builder
         * 
         */
        public Builder number(Output<String> number) {
            $.number = number;
            return this;
        }

        /**
         * @param number number path parameter.
         * 
         * @return builder
         * 
         */
        public Builder number(String number) {
            return number(Output.of(number));
        }

        /**
         * @param splitTunnel The VPN split tunnel settings for this SSID.
         * 
         * @return builder
         * 
         */
        public Builder splitTunnel(@Nullable Output<WirelessSsidsVpnSplitTunnelArgs> splitTunnel) {
            $.splitTunnel = splitTunnel;
            return this;
        }

        /**
         * @param splitTunnel The VPN split tunnel settings for this SSID.
         * 
         * @return builder
         * 
         */
        public Builder splitTunnel(WirelessSsidsVpnSplitTunnelArgs splitTunnel) {
            return splitTunnel(Output.of(splitTunnel));
        }

        public WirelessSsidsVpnArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("WirelessSsidsVpnArgs", "networkId");
            }
            if ($.number == null) {
                throw new MissingRequiredPropertyException("WirelessSsidsVpnArgs", "number");
            }
            return $;
        }
    }

}
