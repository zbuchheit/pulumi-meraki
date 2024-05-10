// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedStagesJsonGroupArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedStagesJsonArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedStagesJsonArgs Empty = new FirmwareUpgradesStagedStagesJsonArgs();

    /**
     * The Staged Upgrade Group
     * 
     */
    @Import(name="group")
    private @Nullable Output<FirmwareUpgradesStagedStagesJsonGroupArgs> group;

    /**
     * @return The Staged Upgrade Group
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedStagesJsonGroupArgs>> group() {
        return Optional.ofNullable(this.group);
    }

    private FirmwareUpgradesStagedStagesJsonArgs() {}

    private FirmwareUpgradesStagedStagesJsonArgs(FirmwareUpgradesStagedStagesJsonArgs $) {
        this.group = $.group;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedStagesJsonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedStagesJsonArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedStagesJsonArgs();
        }

        public Builder(FirmwareUpgradesStagedStagesJsonArgs defaults) {
            $ = new FirmwareUpgradesStagedStagesJsonArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group The Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<FirmwareUpgradesStagedStagesJsonGroupArgs> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder group(FirmwareUpgradesStagedStagesJsonGroupArgs group) {
            return group(Output.of(group));
        }

        public FirmwareUpgradesStagedStagesJsonArgs build() {
            return $;
        }
    }

}
