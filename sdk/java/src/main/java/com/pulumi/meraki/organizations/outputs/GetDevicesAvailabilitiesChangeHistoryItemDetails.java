// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetDevicesAvailabilitiesChangeHistoryItemDetailsNews;
import com.pulumi.meraki.organizations.outputs.GetDevicesAvailabilitiesChangeHistoryItemDetailsOld;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDevicesAvailabilitiesChangeHistoryItemDetails {
    /**
     * @return Details about the new status
     * 
     */
    private List<GetDevicesAvailabilitiesChangeHistoryItemDetailsNews> news;
    /**
     * @return Details about the old status
     * 
     */
    private List<GetDevicesAvailabilitiesChangeHistoryItemDetailsOld> olds;

    private GetDevicesAvailabilitiesChangeHistoryItemDetails() {}
    /**
     * @return Details about the new status
     * 
     */
    public List<GetDevicesAvailabilitiesChangeHistoryItemDetailsNews> news() {
        return this.news;
    }
    /**
     * @return Details about the old status
     * 
     */
    public List<GetDevicesAvailabilitiesChangeHistoryItemDetailsOld> olds() {
        return this.olds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesAvailabilitiesChangeHistoryItemDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDevicesAvailabilitiesChangeHistoryItemDetailsNews> news;
        private List<GetDevicesAvailabilitiesChangeHistoryItemDetailsOld> olds;
        public Builder() {}
        public Builder(GetDevicesAvailabilitiesChangeHistoryItemDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.news = defaults.news;
    	      this.olds = defaults.olds;
        }

        @CustomType.Setter
        public Builder news(List<GetDevicesAvailabilitiesChangeHistoryItemDetailsNews> news) {
            if (news == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesChangeHistoryItemDetails", "news");
            }
            this.news = news;
            return this;
        }
        public Builder news(GetDevicesAvailabilitiesChangeHistoryItemDetailsNews... news) {
            return news(List.of(news));
        }
        @CustomType.Setter
        public Builder olds(List<GetDevicesAvailabilitiesChangeHistoryItemDetailsOld> olds) {
            if (olds == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesChangeHistoryItemDetails", "olds");
            }
            this.olds = olds;
            return this;
        }
        public Builder olds(GetDevicesAvailabilitiesChangeHistoryItemDetailsOld... olds) {
            return olds(List.of(olds));
        }
        public GetDevicesAvailabilitiesChangeHistoryItemDetails build() {
            final var _resultValue = new GetDevicesAvailabilitiesChangeHistoryItemDetails();
            _resultValue.news = news;
            _resultValue.olds = olds;
            return _resultValue;
        }
    }
}
