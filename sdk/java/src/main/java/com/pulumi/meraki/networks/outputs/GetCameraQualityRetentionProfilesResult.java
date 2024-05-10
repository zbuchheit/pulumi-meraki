// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetCameraQualityRetentionProfilesItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCameraQualityRetentionProfilesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetCameraQualityRetentionProfilesItem item;
    /**
     * @return Array of ResponseCameraGetNetworkCameraQualityRetentionProfiles
     * 
     */
    private List<GetCameraQualityRetentionProfilesItem> items;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private @Nullable String networkId;
    /**
     * @return qualityRetentionProfileId path parameter. Quality retention profile ID
     * 
     */
    private @Nullable String qualityRetentionProfileId;

    private GetCameraQualityRetentionProfilesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetCameraQualityRetentionProfilesItem item() {
        return this.item;
    }
    /**
     * @return Array of ResponseCameraGetNetworkCameraQualityRetentionProfiles
     * 
     */
    public List<GetCameraQualityRetentionProfilesItem> items() {
        return this.items;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }
    /**
     * @return qualityRetentionProfileId path parameter. Quality retention profile ID
     * 
     */
    public Optional<String> qualityRetentionProfileId() {
        return Optional.ofNullable(this.qualityRetentionProfileId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCameraQualityRetentionProfilesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetCameraQualityRetentionProfilesItem item;
        private List<GetCameraQualityRetentionProfilesItem> items;
        private @Nullable String networkId;
        private @Nullable String qualityRetentionProfileId;
        public Builder() {}
        public Builder(GetCameraQualityRetentionProfilesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.items = defaults.items;
    	      this.networkId = defaults.networkId;
    	      this.qualityRetentionProfileId = defaults.qualityRetentionProfileId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityRetentionProfilesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetCameraQualityRetentionProfilesItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityRetentionProfilesResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetCameraQualityRetentionProfilesItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityRetentionProfilesResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetCameraQualityRetentionProfilesItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkId(@Nullable String networkId) {

            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder qualityRetentionProfileId(@Nullable String qualityRetentionProfileId) {

            this.qualityRetentionProfileId = qualityRetentionProfileId;
            return this;
        }
        public GetCameraQualityRetentionProfilesResult build() {
            final var _resultValue = new GetCameraQualityRetentionProfilesResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.items = items;
            _resultValue.networkId = networkId;
            _resultValue.qualityRetentionProfileId = qualityRetentionProfileId;
            return _resultValue;
        }
    }
}
