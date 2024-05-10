// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTrafficAnalysisItemCustomPieChartItem {
    /**
     * @return The name of the custom pie chart item.
     * 
     */
    private String name;
    /**
     * @return The signature type for the custom pie chart item. Can be one of &#39;host&#39;, &#39;port&#39; or &#39;ipRange&#39;.
     * 
     */
    private String type;
    /**
     * @return The value of the custom pie chart item. Valid syntax depends on the signature type of the chart item
     * (see sample request/response for more details).
     * 
     */
    private String value;

    private GetTrafficAnalysisItemCustomPieChartItem() {}
    /**
     * @return The name of the custom pie chart item.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The signature type for the custom pie chart item. Can be one of &#39;host&#39;, &#39;port&#39; or &#39;ipRange&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The value of the custom pie chart item. Valid syntax depends on the signature type of the chart item
     * (see sample request/response for more details).
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficAnalysisItemCustomPieChartItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        private String value;
        public Builder() {}
        public Builder(GetTrafficAnalysisItemCustomPieChartItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTrafficAnalysisItemCustomPieChartItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetTrafficAnalysisItemCustomPieChartItem", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetTrafficAnalysisItemCustomPieChartItem", "value");
            }
            this.value = value;
            return this;
        }
        public GetTrafficAnalysisItemCustomPieChartItem build() {
            final var _resultValue = new GetTrafficAnalysisItemCustomPieChartItem();
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
