// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsRollbacksParametersReason;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsRollbacksParametersStage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesStagedEventsRollbacksParameters {
    /**
     * @return The reason for rolling back the staged upgrade
     * 
     */
    private @Nullable List<FirmwareUpgradesStagedEventsRollbacksParametersReason> reasons;
    /**
     * @return All completed or in-progress stages in the network with their new start times. All pending stages will be canceled
     * 
     */
    private @Nullable List<FirmwareUpgradesStagedEventsRollbacksParametersStage> stages;

    private FirmwareUpgradesStagedEventsRollbacksParameters() {}
    /**
     * @return The reason for rolling back the staged upgrade
     * 
     */
    public List<FirmwareUpgradesStagedEventsRollbacksParametersReason> reasons() {
        return this.reasons == null ? List.of() : this.reasons;
    }
    /**
     * @return All completed or in-progress stages in the network with their new start times. All pending stages will be canceled
     * 
     */
    public List<FirmwareUpgradesStagedEventsRollbacksParametersStage> stages() {
        return this.stages == null ? List.of() : this.stages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesStagedEventsRollbacksParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<FirmwareUpgradesStagedEventsRollbacksParametersReason> reasons;
        private @Nullable List<FirmwareUpgradesStagedEventsRollbacksParametersStage> stages;
        public Builder() {}
        public Builder(FirmwareUpgradesStagedEventsRollbacksParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reasons = defaults.reasons;
    	      this.stages = defaults.stages;
        }

        @CustomType.Setter
        public Builder reasons(@Nullable List<FirmwareUpgradesStagedEventsRollbacksParametersReason> reasons) {

            this.reasons = reasons;
            return this;
        }
        public Builder reasons(FirmwareUpgradesStagedEventsRollbacksParametersReason... reasons) {
            return reasons(List.of(reasons));
        }
        @CustomType.Setter
        public Builder stages(@Nullable List<FirmwareUpgradesStagedEventsRollbacksParametersStage> stages) {

            this.stages = stages;
            return this;
        }
        public Builder stages(FirmwareUpgradesStagedEventsRollbacksParametersStage... stages) {
            return stages(List.of(stages));
        }
        public FirmwareUpgradesStagedEventsRollbacksParameters build() {
            final var _resultValue = new FirmwareUpgradesStagedEventsRollbacksParameters();
            _resultValue.reasons = reasons;
            _resultValue.stages = stages;
            return _resultValue;
        }
    }
}
