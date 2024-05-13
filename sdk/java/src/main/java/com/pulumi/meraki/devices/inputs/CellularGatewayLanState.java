// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.devices.inputs.CellularGatewayLanFixedIpAssignmentArgs;
import com.pulumi.meraki.devices.inputs.CellularGatewayLanReservedIpRangeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CellularGatewayLanState extends com.pulumi.resources.ResourceArgs {

    public static final CellularGatewayLanState Empty = new CellularGatewayLanState();

    /**
     * Lan IP of the MG
     * 
     */
    @Import(name="deviceLanIp")
    private @Nullable Output<String> deviceLanIp;

    /**
     * @return Lan IP of the MG
     * 
     */
    public Optional<Output<String>> deviceLanIp() {
        return Optional.ofNullable(this.deviceLanIp);
    }

    /**
     * Name of the MG.
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    /**
     * @return Name of the MG.
     * 
     */
    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * Subnet configuration of the MG.
     * 
     */
    @Import(name="deviceSubnet")
    private @Nullable Output<String> deviceSubnet;

    /**
     * @return Subnet configuration of the MG.
     * 
     */
    public Optional<Output<String>> deviceSubnet() {
        return Optional.ofNullable(this.deviceSubnet);
    }

    /**
     * list of all fixed IP assignments for a single MG
     * 
     */
    @Import(name="fixedIpAssignments")
    private @Nullable Output<List<CellularGatewayLanFixedIpAssignmentArgs>> fixedIpAssignments;

    /**
     * @return list of all fixed IP assignments for a single MG
     * 
     */
    public Optional<Output<List<CellularGatewayLanFixedIpAssignmentArgs>>> fixedIpAssignments() {
        return Optional.ofNullable(this.fixedIpAssignments);
    }

    /**
     * list of all reserved IP ranges for a single MG
     * 
     */
    @Import(name="reservedIpRanges")
    private @Nullable Output<List<CellularGatewayLanReservedIpRangeArgs>> reservedIpRanges;

    /**
     * @return list of all reserved IP ranges for a single MG
     * 
     */
    public Optional<Output<List<CellularGatewayLanReservedIpRangeArgs>>> reservedIpRanges() {
        return Optional.ofNullable(this.reservedIpRanges);
    }

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    private CellularGatewayLanState() {}

    private CellularGatewayLanState(CellularGatewayLanState $) {
        this.deviceLanIp = $.deviceLanIp;
        this.deviceName = $.deviceName;
        this.deviceSubnet = $.deviceSubnet;
        this.fixedIpAssignments = $.fixedIpAssignments;
        this.reservedIpRanges = $.reservedIpRanges;
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellularGatewayLanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellularGatewayLanState $;

        public Builder() {
            $ = new CellularGatewayLanState();
        }

        public Builder(CellularGatewayLanState defaults) {
            $ = new CellularGatewayLanState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceLanIp Lan IP of the MG
         * 
         * @return builder
         * 
         */
        public Builder deviceLanIp(@Nullable Output<String> deviceLanIp) {
            $.deviceLanIp = deviceLanIp;
            return this;
        }

        /**
         * @param deviceLanIp Lan IP of the MG
         * 
         * @return builder
         * 
         */
        public Builder deviceLanIp(String deviceLanIp) {
            return deviceLanIp(Output.of(deviceLanIp));
        }

        /**
         * @param deviceName Name of the MG.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName Name of the MG.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param deviceSubnet Subnet configuration of the MG.
         * 
         * @return builder
         * 
         */
        public Builder deviceSubnet(@Nullable Output<String> deviceSubnet) {
            $.deviceSubnet = deviceSubnet;
            return this;
        }

        /**
         * @param deviceSubnet Subnet configuration of the MG.
         * 
         * @return builder
         * 
         */
        public Builder deviceSubnet(String deviceSubnet) {
            return deviceSubnet(Output.of(deviceSubnet));
        }

        /**
         * @param fixedIpAssignments list of all fixed IP assignments for a single MG
         * 
         * @return builder
         * 
         */
        public Builder fixedIpAssignments(@Nullable Output<List<CellularGatewayLanFixedIpAssignmentArgs>> fixedIpAssignments) {
            $.fixedIpAssignments = fixedIpAssignments;
            return this;
        }

        /**
         * @param fixedIpAssignments list of all fixed IP assignments for a single MG
         * 
         * @return builder
         * 
         */
        public Builder fixedIpAssignments(List<CellularGatewayLanFixedIpAssignmentArgs> fixedIpAssignments) {
            return fixedIpAssignments(Output.of(fixedIpAssignments));
        }

        /**
         * @param fixedIpAssignments list of all fixed IP assignments for a single MG
         * 
         * @return builder
         * 
         */
        public Builder fixedIpAssignments(CellularGatewayLanFixedIpAssignmentArgs... fixedIpAssignments) {
            return fixedIpAssignments(List.of(fixedIpAssignments));
        }

        /**
         * @param reservedIpRanges list of all reserved IP ranges for a single MG
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRanges(@Nullable Output<List<CellularGatewayLanReservedIpRangeArgs>> reservedIpRanges) {
            $.reservedIpRanges = reservedIpRanges;
            return this;
        }

        /**
         * @param reservedIpRanges list of all reserved IP ranges for a single MG
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRanges(List<CellularGatewayLanReservedIpRangeArgs> reservedIpRanges) {
            return reservedIpRanges(Output.of(reservedIpRanges));
        }

        /**
         * @param reservedIpRanges list of all reserved IP ranges for a single MG
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRanges(CellularGatewayLanReservedIpRangeArgs... reservedIpRanges) {
            return reservedIpRanges(List.of(reservedIpRanges));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        public CellularGatewayLanState build() {
            return $;
        }
    }

}