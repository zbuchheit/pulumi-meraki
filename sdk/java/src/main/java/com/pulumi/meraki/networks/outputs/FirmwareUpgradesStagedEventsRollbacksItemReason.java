// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesStagedEventsRollbacksItemReason {
    /**
     * @return Reason for the rollback
     * 
     */
    private @Nullable String category;
    /**
     * @return Additional comment about the rollback
     * 
     */
    private @Nullable String comment;

    private FirmwareUpgradesStagedEventsRollbacksItemReason() {}
    /**
     * @return Reason for the rollback
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    /**
     * @return Additional comment about the rollback
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesStagedEventsRollbacksItemReason defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String category;
        private @Nullable String comment;
        public Builder() {}
        public Builder(FirmwareUpgradesStagedEventsRollbacksItemReason defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.comment = defaults.comment;
        }

        @CustomType.Setter
        public Builder category(@Nullable String category) {

            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        public FirmwareUpgradesStagedEventsRollbacksItemReason build() {
            final var _resultValue = new FirmwareUpgradesStagedEventsRollbacksItemReason();
            _resultValue.category = category;
            _resultValue.comment = comment;
            return _resultValue;
        }
    }
}
