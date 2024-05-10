// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CellularGatewayLanReservedIpRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final CellularGatewayLanReservedIpRangeArgs Empty = new CellularGatewayLanReservedIpRangeArgs();

    /**
     * Comment explaining the reserved IP range
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Comment explaining the reserved IP range
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Ending IP included in the reserved range of IPs
     * 
     */
    @Import(name="end")
    private @Nullable Output<String> end;

    /**
     * @return Ending IP included in the reserved range of IPs
     * 
     */
    public Optional<Output<String>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * Starting IP included in the reserved range of IPs
     * 
     */
    @Import(name="start")
    private @Nullable Output<String> start;

    /**
     * @return Starting IP included in the reserved range of IPs
     * 
     */
    public Optional<Output<String>> start() {
        return Optional.ofNullable(this.start);
    }

    private CellularGatewayLanReservedIpRangeArgs() {}

    private CellularGatewayLanReservedIpRangeArgs(CellularGatewayLanReservedIpRangeArgs $) {
        this.comment = $.comment;
        this.end = $.end;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellularGatewayLanReservedIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellularGatewayLanReservedIpRangeArgs $;

        public Builder() {
            $ = new CellularGatewayLanReservedIpRangeArgs();
        }

        public Builder(CellularGatewayLanReservedIpRangeArgs defaults) {
            $ = new CellularGatewayLanReservedIpRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Comment explaining the reserved IP range
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Comment explaining the reserved IP range
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param end Ending IP included in the reserved range of IPs
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<String> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end Ending IP included in the reserved range of IPs
         * 
         * @return builder
         * 
         */
        public Builder end(String end) {
            return end(Output.of(end));
        }

        /**
         * @param start Starting IP included in the reserved range of IPs
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<String> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start Starting IP included in the reserved range of IPs
         * 
         * @return builder
         * 
         */
        public Builder start(String start) {
            return start(Output.of(start));
        }

        public CellularGatewayLanReservedIpRangeArgs build() {
            return $;
        }
    }

}
