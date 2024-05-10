// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesStagedEventsRollbacksParametersStageGroup {
    /**
     * @return ID of the Staged Upgrade Group
     * 
     */
    private @Nullable String id;

    private FirmwareUpgradesStagedEventsRollbacksParametersStageGroup() {}
    /**
     * @return ID of the Staged Upgrade Group
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesStagedEventsRollbacksParametersStageGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        public Builder() {}
        public Builder(FirmwareUpgradesStagedEventsRollbacksParametersStageGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        public FirmwareUpgradesStagedEventsRollbacksParametersStageGroup build() {
            final var _resultValue = new FirmwareUpgradesStagedEventsRollbacksParametersStageGroup();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
