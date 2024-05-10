// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs Empty = new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs();

    /**
     * Name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs() {}

    private InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs $;

        public Builder() {
            $ = new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs();
        }

        public Builder(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs defaults) {
            $ = new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs build() {
            return $;
        }
    }

}
