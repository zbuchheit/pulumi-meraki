// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPiiPiiKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPiiPiiKeysArgs Empty = new GetPiiPiiKeysArgs();

    /**
     * bluetoothMac query parameter. The MAC of a Bluetooth client
     * 
     */
    @Import(name="bluetoothMac")
    private @Nullable Output<String> bluetoothMac;

    /**
     * @return bluetoothMac query parameter. The MAC of a Bluetooth client
     * 
     */
    public Optional<Output<String>> bluetoothMac() {
        return Optional.ofNullable(this.bluetoothMac);
    }

    /**
     * email query parameter. The email of a network user account or a Systems Manager device
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return email query parameter. The email of a network user account or a Systems Manager device
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * imei query parameter. The IMEI of a Systems Manager device
     * 
     */
    @Import(name="imei")
    private @Nullable Output<String> imei;

    /**
     * @return imei query parameter. The IMEI of a Systems Manager device
     * 
     */
    public Optional<Output<String>> imei() {
        return Optional.ofNullable(this.imei);
    }

    /**
     * mac query parameter. The MAC of a network client device or a Systems Manager device
     * 
     */
    @Import(name="mac")
    private @Nullable Output<String> mac;

    /**
     * @return mac query parameter. The MAC of a network client device or a Systems Manager device
     * 
     */
    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
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
     * serial query parameter. The serial of a Systems Manager device
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return serial query parameter. The serial of a Systems Manager device
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * username query parameter. The username of a Systems Manager user
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return username query parameter. The username of a Systems Manager user
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private GetPiiPiiKeysArgs() {}

    private GetPiiPiiKeysArgs(GetPiiPiiKeysArgs $) {
        this.bluetoothMac = $.bluetoothMac;
        this.email = $.email;
        this.imei = $.imei;
        this.mac = $.mac;
        this.networkId = $.networkId;
        this.serial = $.serial;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPiiPiiKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPiiPiiKeysArgs $;

        public Builder() {
            $ = new GetPiiPiiKeysArgs();
        }

        public Builder(GetPiiPiiKeysArgs defaults) {
            $ = new GetPiiPiiKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bluetoothMac bluetoothMac query parameter. The MAC of a Bluetooth client
         * 
         * @return builder
         * 
         */
        public Builder bluetoothMac(@Nullable Output<String> bluetoothMac) {
            $.bluetoothMac = bluetoothMac;
            return this;
        }

        /**
         * @param bluetoothMac bluetoothMac query parameter. The MAC of a Bluetooth client
         * 
         * @return builder
         * 
         */
        public Builder bluetoothMac(String bluetoothMac) {
            return bluetoothMac(Output.of(bluetoothMac));
        }

        /**
         * @param email email query parameter. The email of a network user account or a Systems Manager device
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email email query parameter. The email of a network user account or a Systems Manager device
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param imei imei query parameter. The IMEI of a Systems Manager device
         * 
         * @return builder
         * 
         */
        public Builder imei(@Nullable Output<String> imei) {
            $.imei = imei;
            return this;
        }

        /**
         * @param imei imei query parameter. The IMEI of a Systems Manager device
         * 
         * @return builder
         * 
         */
        public Builder imei(String imei) {
            return imei(Output.of(imei));
        }

        /**
         * @param mac mac query parameter. The MAC of a network client device or a Systems Manager device
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac mac query parameter. The MAC of a network client device or a Systems Manager device
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
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
         * @param serial serial query parameter. The serial of a Systems Manager device
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial serial query parameter. The serial of a Systems Manager device
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        /**
         * @param username username query parameter. The username of a Systems Manager user
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username username query parameter. The username of a Systems Manager user
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GetPiiPiiKeysArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetPiiPiiKeysArgs", "networkId");
            }
            return $;
        }
    }

}
