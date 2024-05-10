// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesRollbacksItemReasonArgs;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesRollbacksItemToVersionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesRollbacksItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesRollbacksItemArgs Empty = new FirmwareUpgradesRollbacksItemArgs();

    /**
     * Product type to rollback (if the network is a combined network)
     * 
     */
    @Import(name="product")
    private @Nullable Output<String> product;

    /**
     * @return Product type to rollback (if the network is a combined network)
     * 
     */
    public Optional<Output<String>> product() {
        return Optional.ofNullable(this.product);
    }

    /**
     * Reasons for the rollback
     * 
     */
    @Import(name="reasons")
    private @Nullable Output<List<FirmwareUpgradesRollbacksItemReasonArgs>> reasons;

    /**
     * @return Reasons for the rollback
     * 
     */
    public Optional<Output<List<FirmwareUpgradesRollbacksItemReasonArgs>>> reasons() {
        return Optional.ofNullable(this.reasons);
    }

    /**
     * Status of the rollback
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the rollback
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Scheduled time for the rollback
     * 
     */
    @Import(name="time")
    private @Nullable Output<String> time;

    /**
     * @return Scheduled time for the rollback
     * 
     */
    public Optional<Output<String>> time() {
        return Optional.ofNullable(this.time);
    }

    /**
     * Version to downgrade to (if the network has firmware flexibility)
     * 
     */
    @Import(name="toVersion")
    private @Nullable Output<FirmwareUpgradesRollbacksItemToVersionArgs> toVersion;

    /**
     * @return Version to downgrade to (if the network has firmware flexibility)
     * 
     */
    public Optional<Output<FirmwareUpgradesRollbacksItemToVersionArgs>> toVersion() {
        return Optional.ofNullable(this.toVersion);
    }

    /**
     * Batch ID of the firmware rollback
     * 
     */
    @Import(name="upgradeBatchId")
    private @Nullable Output<String> upgradeBatchId;

    /**
     * @return Batch ID of the firmware rollback
     * 
     */
    public Optional<Output<String>> upgradeBatchId() {
        return Optional.ofNullable(this.upgradeBatchId);
    }

    private FirmwareUpgradesRollbacksItemArgs() {}

    private FirmwareUpgradesRollbacksItemArgs(FirmwareUpgradesRollbacksItemArgs $) {
        this.product = $.product;
        this.reasons = $.reasons;
        this.status = $.status;
        this.time = $.time;
        this.toVersion = $.toVersion;
        this.upgradeBatchId = $.upgradeBatchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesRollbacksItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesRollbacksItemArgs $;

        public Builder() {
            $ = new FirmwareUpgradesRollbacksItemArgs();
        }

        public Builder(FirmwareUpgradesRollbacksItemArgs defaults) {
            $ = new FirmwareUpgradesRollbacksItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param product Product type to rollback (if the network is a combined network)
         * 
         * @return builder
         * 
         */
        public Builder product(@Nullable Output<String> product) {
            $.product = product;
            return this;
        }

        /**
         * @param product Product type to rollback (if the network is a combined network)
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            return product(Output.of(product));
        }

        /**
         * @param reasons Reasons for the rollback
         * 
         * @return builder
         * 
         */
        public Builder reasons(@Nullable Output<List<FirmwareUpgradesRollbacksItemReasonArgs>> reasons) {
            $.reasons = reasons;
            return this;
        }

        /**
         * @param reasons Reasons for the rollback
         * 
         * @return builder
         * 
         */
        public Builder reasons(List<FirmwareUpgradesRollbacksItemReasonArgs> reasons) {
            return reasons(Output.of(reasons));
        }

        /**
         * @param reasons Reasons for the rollback
         * 
         * @return builder
         * 
         */
        public Builder reasons(FirmwareUpgradesRollbacksItemReasonArgs... reasons) {
            return reasons(List.of(reasons));
        }

        /**
         * @param status Status of the rollback
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the rollback
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param time Scheduled time for the rollback
         * 
         * @return builder
         * 
         */
        public Builder time(@Nullable Output<String> time) {
            $.time = time;
            return this;
        }

        /**
         * @param time Scheduled time for the rollback
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            return time(Output.of(time));
        }

        /**
         * @param toVersion Version to downgrade to (if the network has firmware flexibility)
         * 
         * @return builder
         * 
         */
        public Builder toVersion(@Nullable Output<FirmwareUpgradesRollbacksItemToVersionArgs> toVersion) {
            $.toVersion = toVersion;
            return this;
        }

        /**
         * @param toVersion Version to downgrade to (if the network has firmware flexibility)
         * 
         * @return builder
         * 
         */
        public Builder toVersion(FirmwareUpgradesRollbacksItemToVersionArgs toVersion) {
            return toVersion(Output.of(toVersion));
        }

        /**
         * @param upgradeBatchId Batch ID of the firmware rollback
         * 
         * @return builder
         * 
         */
        public Builder upgradeBatchId(@Nullable Output<String> upgradeBatchId) {
            $.upgradeBatchId = upgradeBatchId;
            return this;
        }

        /**
         * @param upgradeBatchId Batch ID of the firmware rollback
         * 
         * @return builder
         * 
         */
        public Builder upgradeBatchId(String upgradeBatchId) {
            return upgradeBatchId(Output.of(upgradeBatchId));
        }

        public FirmwareUpgradesRollbacksItemArgs build() {
            return $;
        }
    }

}
