// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.inputs.LiveToolsWakeOnLanCallbackArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveToolsWakeOnLanArgs extends com.pulumi.resources.ResourceArgs {

    public static final LiveToolsWakeOnLanArgs Empty = new LiveToolsWakeOnLanArgs();

    /**
     * Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    @Import(name="callback")
    private @Nullable Output<LiveToolsWakeOnLanCallbackArgs> callback;

    /**
     * @return Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    public Optional<Output<LiveToolsWakeOnLanCallbackArgs>> callback() {
        return Optional.ofNullable(this.callback);
    }

    /**
     * The target&#39;s MAC address
     * 
     */
    @Import(name="mac")
    private @Nullable Output<String> mac;

    /**
     * @return The target&#39;s MAC address
     * 
     */
    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
    }

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial", required=true)
    private Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }

    /**
     * The target&#39;s VLAN (1 to 4094)
     * 
     */
    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    /**
     * @return The target&#39;s VLAN (1 to 4094)
     * 
     */
    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    /**
     * ID of the Wake-on-LAN job
     * 
     */
    @Import(name="wakeOnLanId")
    private @Nullable Output<String> wakeOnLanId;

    /**
     * @return ID of the Wake-on-LAN job
     * 
     */
    public Optional<Output<String>> wakeOnLanId() {
        return Optional.ofNullable(this.wakeOnLanId);
    }

    private LiveToolsWakeOnLanArgs() {}

    private LiveToolsWakeOnLanArgs(LiveToolsWakeOnLanArgs $) {
        this.callback = $.callback;
        this.mac = $.mac;
        this.serial = $.serial;
        this.vlanId = $.vlanId;
        this.wakeOnLanId = $.wakeOnLanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveToolsWakeOnLanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveToolsWakeOnLanArgs $;

        public Builder() {
            $ = new LiveToolsWakeOnLanArgs();
        }

        public Builder(LiveToolsWakeOnLanArgs defaults) {
            $ = new LiveToolsWakeOnLanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param callback Details for the callback. Please include either an httpServerId OR url and sharedSecret
         * 
         * @return builder
         * 
         */
        public Builder callback(@Nullable Output<LiveToolsWakeOnLanCallbackArgs> callback) {
            $.callback = callback;
            return this;
        }

        /**
         * @param callback Details for the callback. Please include either an httpServerId OR url and sharedSecret
         * 
         * @return builder
         * 
         */
        public Builder callback(LiveToolsWakeOnLanCallbackArgs callback) {
            return callback(Output.of(callback));
        }

        /**
         * @param mac The target&#39;s MAC address
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac The target&#39;s MAC address
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(Output<String> serial) {
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

        /**
         * @param vlanId The target&#39;s VLAN (1 to 4094)
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId The target&#39;s VLAN (1 to 4094)
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        /**
         * @param wakeOnLanId ID of the Wake-on-LAN job
         * 
         * @return builder
         * 
         */
        public Builder wakeOnLanId(@Nullable Output<String> wakeOnLanId) {
            $.wakeOnLanId = wakeOnLanId;
            return this;
        }

        /**
         * @param wakeOnLanId ID of the Wake-on-LAN job
         * 
         * @return builder
         * 
         */
        public Builder wakeOnLanId(String wakeOnLanId) {
            return wakeOnLanId(Output.of(wakeOnLanId));
        }

        public LiveToolsWakeOnLanArgs build() {
            if ($.serial == null) {
                throw new MissingRequiredPropertyException("LiveToolsWakeOnLanArgs", "serial");
            }
            return $;
        }
    }

}
