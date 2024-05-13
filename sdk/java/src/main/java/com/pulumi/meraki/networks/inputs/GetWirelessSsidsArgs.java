// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWirelessSsidsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWirelessSsidsArgs Empty = new GetWirelessSsidsArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * number path parameter.
     * 
     */
    @Import(name="number")
    private @Nullable Output<String> number;

    /**
     * @return number path parameter.
     * 
     */
    public Optional<Output<String>> number() {
        return Optional.ofNullable(this.number);
    }

    private GetWirelessSsidsArgs() {}

    private GetWirelessSsidsArgs(GetWirelessSsidsArgs $) {
        this.networkId = $.networkId;
        this.number = $.number;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWirelessSsidsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWirelessSsidsArgs $;

        public Builder() {
            $ = new GetWirelessSsidsArgs();
        }

        public Builder(GetWirelessSsidsArgs defaults) {
            $ = new GetWirelessSsidsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
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
        public Builder number(@Nullable Output<String> number) {
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

        public GetWirelessSsidsArgs build() {
            return $;
        }
    }

}