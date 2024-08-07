// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlertsHistoryItemDestinationsSms {
    /**
     * @return time when the alert was sent to the user(s) for this channel
     * 
     */
    private String sentAt;

    private GetAlertsHistoryItemDestinationsSms() {}
    /**
     * @return time when the alert was sent to the user(s) for this channel
     * 
     */
    public String sentAt() {
        return this.sentAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertsHistoryItemDestinationsSms defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String sentAt;
        public Builder() {}
        public Builder(GetAlertsHistoryItemDestinationsSms defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sentAt = defaults.sentAt;
        }

        @CustomType.Setter
        public Builder sentAt(String sentAt) {
            if (sentAt == null) {
              throw new MissingRequiredPropertyException("GetAlertsHistoryItemDestinationsSms", "sentAt");
            }
            this.sentAt = sentAt;
            return this;
        }
        public GetAlertsHistoryItemDestinationsSms build() {
            final var _resultValue = new GetAlertsHistoryItemDestinationsSms();
            _resultValue.sentAt = sentAt;
            return _resultValue;
        }
    }
}
