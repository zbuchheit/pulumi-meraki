// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.AlertsSettingsAlertArgs;
import com.pulumi.meraki.networks.inputs.AlertsSettingsDefaultDestinationsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertsSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertsSettingsArgs Empty = new AlertsSettingsArgs();

    /**
     * Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
     * 
     */
    @Import(name="alerts")
    private @Nullable Output<List<AlertsSettingsAlertArgs>> alerts;

    /**
     * @return Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
     * 
     */
    public Optional<Output<List<AlertsSettingsAlertArgs>>> alerts() {
        return Optional.ofNullable(this.alerts);
    }

    /**
     * The network-wide destinations for all alerts on the network.
     * 
     */
    @Import(name="defaultDestinations")
    private @Nullable Output<AlertsSettingsDefaultDestinationsArgs> defaultDestinations;

    /**
     * @return The network-wide destinations for all alerts on the network.
     * 
     */
    public Optional<Output<AlertsSettingsDefaultDestinationsArgs>> defaultDestinations() {
        return Optional.ofNullable(this.defaultDestinations);
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

    private AlertsSettingsArgs() {}

    private AlertsSettingsArgs(AlertsSettingsArgs $) {
        this.alerts = $.alerts;
        this.defaultDestinations = $.defaultDestinations;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertsSettingsArgs $;

        public Builder() {
            $ = new AlertsSettingsArgs();
        }

        public Builder(AlertsSettingsArgs defaults) {
            $ = new AlertsSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alerts Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
         * 
         * @return builder
         * 
         */
        public Builder alerts(@Nullable Output<List<AlertsSettingsAlertArgs>> alerts) {
            $.alerts = alerts;
            return this;
        }

        /**
         * @param alerts Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
         * 
         * @return builder
         * 
         */
        public Builder alerts(List<AlertsSettingsAlertArgs> alerts) {
            return alerts(Output.of(alerts));
        }

        /**
         * @param alerts Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
         * 
         * @return builder
         * 
         */
        public Builder alerts(AlertsSettingsAlertArgs... alerts) {
            return alerts(List.of(alerts));
        }

        /**
         * @param defaultDestinations The network-wide destinations for all alerts on the network.
         * 
         * @return builder
         * 
         */
        public Builder defaultDestinations(@Nullable Output<AlertsSettingsDefaultDestinationsArgs> defaultDestinations) {
            $.defaultDestinations = defaultDestinations;
            return this;
        }

        /**
         * @param defaultDestinations The network-wide destinations for all alerts on the network.
         * 
         * @return builder
         * 
         */
        public Builder defaultDestinations(AlertsSettingsDefaultDestinationsArgs defaultDestinations) {
            return defaultDestinations(Output.of(defaultDestinations));
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

        public AlertsSettingsArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("AlertsSettingsArgs", "networkId");
            }
            return $;
        }
    }

}
