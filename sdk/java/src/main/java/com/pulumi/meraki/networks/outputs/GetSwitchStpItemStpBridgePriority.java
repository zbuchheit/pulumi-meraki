// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSwitchStpItemStpBridgePriority {
    private Integer stpPriority;
    private List<String> switches;

    private GetSwitchStpItemStpBridgePriority() {}
    public Integer stpPriority() {
        return this.stpPriority;
    }
    public List<String> switches() {
        return this.switches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStpItemStpBridgePriority defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer stpPriority;
        private List<String> switches;
        public Builder() {}
        public Builder(GetSwitchStpItemStpBridgePriority defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stpPriority = defaults.stpPriority;
    	      this.switches = defaults.switches;
        }

        @CustomType.Setter
        public Builder stpPriority(Integer stpPriority) {
            if (stpPriority == null) {
              throw new MissingRequiredPropertyException("GetSwitchStpItemStpBridgePriority", "stpPriority");
            }
            this.stpPriority = stpPriority;
            return this;
        }
        @CustomType.Setter
        public Builder switches(List<String> switches) {
            if (switches == null) {
              throw new MissingRequiredPropertyException("GetSwitchStpItemStpBridgePriority", "switches");
            }
            this.switches = switches;
            return this;
        }
        public Builder switches(String... switches) {
            return switches(List.of(switches));
        }
        public GetSwitchStpItemStpBridgePriority build() {
            final var _resultValue = new GetSwitchStpItemStpBridgePriority();
            _resultValue.stpPriority = stpPriority;
            _resultValue.switches = switches;
            return _resultValue;
        }
    }
}
