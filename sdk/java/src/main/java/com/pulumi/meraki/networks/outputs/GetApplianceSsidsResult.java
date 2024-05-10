// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceSsidsItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplianceSsidsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetApplianceSsidsItem item;
    /**
     * @return Array of ResponseApplianceGetNetworkApplianceSsids
     * 
     */
    private List<GetApplianceSsidsItem> items;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private @Nullable String networkId;
    /**
     * @return number path parameter.
     * 
     */
    private @Nullable String number;

    private GetApplianceSsidsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetApplianceSsidsItem item() {
        return this.item;
    }
    /**
     * @return Array of ResponseApplianceGetNetworkApplianceSsids
     * 
     */
    public List<GetApplianceSsidsItem> items() {
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
     * @return number path parameter.
     * 
     */
    public Optional<String> number() {
        return Optional.ofNullable(this.number);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceSsidsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetApplianceSsidsItem item;
        private List<GetApplianceSsidsItem> items;
        private @Nullable String networkId;
        private @Nullable String number;
        public Builder() {}
        public Builder(GetApplianceSsidsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.items = defaults.items;
    	      this.networkId = defaults.networkId;
    	      this.number = defaults.number;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplianceSsidsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetApplianceSsidsItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetApplianceSsidsResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetApplianceSsidsItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetApplianceSsidsResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetApplianceSsidsItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkId(@Nullable String networkId) {

            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder number(@Nullable String number) {

            this.number = number;
            return this;
        }
        public GetApplianceSsidsResult build() {
            final var _resultValue = new GetApplianceSsidsResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.items = items;
            _resultValue.networkId = networkId;
            _resultValue.number = number;
            return _resultValue;
        }
    }
}
