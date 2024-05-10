// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesStagedEventsStageMilestones {
    /**
     * @return Time that the group was canceled
     * 
     */
    private @Nullable String canceledAt;
    /**
     * @return Finish time for the group
     * 
     */
    private @Nullable String completedAt;
    /**
     * @return Scheduled start time for the group
     * 
     */
    private @Nullable String scheduledFor;
    /**
     * @return Start time for the group
     * 
     */
    private @Nullable String startedAt;

    private FirmwareUpgradesStagedEventsStageMilestones() {}
    /**
     * @return Time that the group was canceled
     * 
     */
    public Optional<String> canceledAt() {
        return Optional.ofNullable(this.canceledAt);
    }
    /**
     * @return Finish time for the group
     * 
     */
    public Optional<String> completedAt() {
        return Optional.ofNullable(this.completedAt);
    }
    /**
     * @return Scheduled start time for the group
     * 
     */
    public Optional<String> scheduledFor() {
        return Optional.ofNullable(this.scheduledFor);
    }
    /**
     * @return Start time for the group
     * 
     */
    public Optional<String> startedAt() {
        return Optional.ofNullable(this.startedAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesStagedEventsStageMilestones defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String canceledAt;
        private @Nullable String completedAt;
        private @Nullable String scheduledFor;
        private @Nullable String startedAt;
        public Builder() {}
        public Builder(FirmwareUpgradesStagedEventsStageMilestones defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canceledAt = defaults.canceledAt;
    	      this.completedAt = defaults.completedAt;
    	      this.scheduledFor = defaults.scheduledFor;
    	      this.startedAt = defaults.startedAt;
        }

        @CustomType.Setter
        public Builder canceledAt(@Nullable String canceledAt) {

            this.canceledAt = canceledAt;
            return this;
        }
        @CustomType.Setter
        public Builder completedAt(@Nullable String completedAt) {

            this.completedAt = completedAt;
            return this;
        }
        @CustomType.Setter
        public Builder scheduledFor(@Nullable String scheduledFor) {

            this.scheduledFor = scheduledFor;
            return this;
        }
        @CustomType.Setter
        public Builder startedAt(@Nullable String startedAt) {

            this.startedAt = startedAt;
            return this;
        }
        public FirmwareUpgradesStagedEventsStageMilestones build() {
            final var _resultValue = new FirmwareUpgradesStagedEventsStageMilestones();
            _resultValue.canceledAt = canceledAt;
            _resultValue.completedAt = completedAt;
            _resultValue.scheduledFor = scheduledFor;
            _resultValue.startedAt = startedAt;
            return _resultValue;
        }
    }
}
