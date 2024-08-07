// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.ApplianceSettingsDynamicDnsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceSettingsArgs Empty = new ApplianceSettingsArgs();

    /**
     * Client tracking method of a network
     * 
     */
    @Import(name="clientTrackingMethod")
    private @Nullable Output<String> clientTrackingMethod;

    /**
     * @return Client tracking method of a network
     * 
     */
    public Optional<Output<String>> clientTrackingMethod() {
        return Optional.ofNullable(this.clientTrackingMethod);
    }

    /**
     * Deployment mode of a network
     * 
     */
    @Import(name="deploymentMode")
    private @Nullable Output<String> deploymentMode;

    /**
     * @return Deployment mode of a network
     * 
     */
    public Optional<Output<String>> deploymentMode() {
        return Optional.ofNullable(this.deploymentMode);
    }

    /**
     * Dynamic DNS settings for a network
     * 
     */
    @Import(name="dynamicDns")
    private @Nullable Output<ApplianceSettingsDynamicDnsArgs> dynamicDns;

    /**
     * @return Dynamic DNS settings for a network
     * 
     */
    public Optional<Output<ApplianceSettingsDynamicDnsArgs>> dynamicDns() {
        return Optional.ofNullable(this.dynamicDns);
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

    private ApplianceSettingsArgs() {}

    private ApplianceSettingsArgs(ApplianceSettingsArgs $) {
        this.clientTrackingMethod = $.clientTrackingMethod;
        this.deploymentMode = $.deploymentMode;
        this.dynamicDns = $.dynamicDns;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceSettingsArgs $;

        public Builder() {
            $ = new ApplianceSettingsArgs();
        }

        public Builder(ApplianceSettingsArgs defaults) {
            $ = new ApplianceSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientTrackingMethod Client tracking method of a network
         * 
         * @return builder
         * 
         */
        public Builder clientTrackingMethod(@Nullable Output<String> clientTrackingMethod) {
            $.clientTrackingMethod = clientTrackingMethod;
            return this;
        }

        /**
         * @param clientTrackingMethod Client tracking method of a network
         * 
         * @return builder
         * 
         */
        public Builder clientTrackingMethod(String clientTrackingMethod) {
            return clientTrackingMethod(Output.of(clientTrackingMethod));
        }

        /**
         * @param deploymentMode Deployment mode of a network
         * 
         * @return builder
         * 
         */
        public Builder deploymentMode(@Nullable Output<String> deploymentMode) {
            $.deploymentMode = deploymentMode;
            return this;
        }

        /**
         * @param deploymentMode Deployment mode of a network
         * 
         * @return builder
         * 
         */
        public Builder deploymentMode(String deploymentMode) {
            return deploymentMode(Output.of(deploymentMode));
        }

        /**
         * @param dynamicDns Dynamic DNS settings for a network
         * 
         * @return builder
         * 
         */
        public Builder dynamicDns(@Nullable Output<ApplianceSettingsDynamicDnsArgs> dynamicDns) {
            $.dynamicDns = dynamicDns;
            return this;
        }

        /**
         * @param dynamicDns Dynamic DNS settings for a network
         * 
         * @return builder
         * 
         */
        public Builder dynamicDns(ApplianceSettingsDynamicDnsArgs dynamicDns) {
            return dynamicDns(Output.of(dynamicDns));
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

        public ApplianceSettingsArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("ApplianceSettingsArgs", "networkId");
            }
            return $;
        }
    }

}
