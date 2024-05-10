// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBluetoothClientsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBluetoothClientsPlainArgs Empty = new GetBluetoothClientsPlainArgs();

    /**
     * bluetoothClientId path parameter. Bluetooth client ID
     * 
     */
    @Import(name="bluetoothClientId", required=true)
    private String bluetoothClientId;

    /**
     * @return bluetoothClientId path parameter. Bluetooth client ID
     * 
     */
    public String bluetoothClientId() {
        return this.bluetoothClientId;
    }

    /**
     * connectivityHistoryTimespan query parameter. The timespan, in seconds, for the connectivityHistory data. By default 1 day, 86400, will be used.
     * 
     */
    @Import(name="connectivityHistoryTimespan")
    private @Nullable Integer connectivityHistoryTimespan;

    /**
     * @return connectivityHistoryTimespan query parameter. The timespan, in seconds, for the connectivityHistory data. By default 1 day, 86400, will be used.
     * 
     */
    public Optional<Integer> connectivityHistoryTimespan() {
        return Optional.ofNullable(this.connectivityHistoryTimespan);
    }

    /**
     * includeConnectivityHistory query parameter. Include the connectivity history for this client
     * 
     */
    @Import(name="includeConnectivityHistory")
    private @Nullable Boolean includeConnectivityHistory;

    /**
     * @return includeConnectivityHistory query parameter. Include the connectivity history for this client
     * 
     */
    public Optional<Boolean> includeConnectivityHistory() {
        return Optional.ofNullable(this.includeConnectivityHistory);
    }

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

    private GetBluetoothClientsPlainArgs() {}

    private GetBluetoothClientsPlainArgs(GetBluetoothClientsPlainArgs $) {
        this.bluetoothClientId = $.bluetoothClientId;
        this.connectivityHistoryTimespan = $.connectivityHistoryTimespan;
        this.includeConnectivityHistory = $.includeConnectivityHistory;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBluetoothClientsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBluetoothClientsPlainArgs $;

        public Builder() {
            $ = new GetBluetoothClientsPlainArgs();
        }

        public Builder(GetBluetoothClientsPlainArgs defaults) {
            $ = new GetBluetoothClientsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bluetoothClientId bluetoothClientId path parameter. Bluetooth client ID
         * 
         * @return builder
         * 
         */
        public Builder bluetoothClientId(String bluetoothClientId) {
            $.bluetoothClientId = bluetoothClientId;
            return this;
        }

        /**
         * @param connectivityHistoryTimespan connectivityHistoryTimespan query parameter. The timespan, in seconds, for the connectivityHistory data. By default 1 day, 86400, will be used.
         * 
         * @return builder
         * 
         */
        public Builder connectivityHistoryTimespan(@Nullable Integer connectivityHistoryTimespan) {
            $.connectivityHistoryTimespan = connectivityHistoryTimespan;
            return this;
        }

        /**
         * @param includeConnectivityHistory includeConnectivityHistory query parameter. Include the connectivity history for this client
         * 
         * @return builder
         * 
         */
        public Builder includeConnectivityHistory(@Nullable Boolean includeConnectivityHistory) {
            $.includeConnectivityHistory = includeConnectivityHistory;
            return this;
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

        public GetBluetoothClientsPlainArgs build() {
            if ($.bluetoothClientId == null) {
                throw new MissingRequiredPropertyException("GetBluetoothClientsPlainArgs", "bluetoothClientId");
            }
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetBluetoothClientsPlainArgs", "networkId");
            }
            return $;
        }
    }

}
