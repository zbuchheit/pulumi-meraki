// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedStagesGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedStagesGroupArgs Empty = new FirmwareUpgradesStagedStagesGroupArgs();

    /**
     * Description of the Staged Upgrade Group
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the Staged Upgrade Group
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Id of the Staged Upgrade Group
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Id of the Staged Upgrade Group
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the Staged Upgrade Group
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Staged Upgrade Group
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FirmwareUpgradesStagedStagesGroupArgs() {}

    private FirmwareUpgradesStagedStagesGroupArgs(FirmwareUpgradesStagedStagesGroupArgs $) {
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedStagesGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedStagesGroupArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedStagesGroupArgs();
        }

        public Builder(FirmwareUpgradesStagedStagesGroupArgs defaults) {
            $ = new FirmwareUpgradesStagedStagesGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param id Id of the Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Id of the Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Name of the Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FirmwareUpgradesStagedStagesGroupArgs build() {
            return $;
        }
    }

}