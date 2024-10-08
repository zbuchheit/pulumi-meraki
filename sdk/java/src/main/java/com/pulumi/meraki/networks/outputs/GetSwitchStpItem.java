// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSwitchStpItemStpBridgePriority;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSwitchStpItem {
    private Boolean rstpEnabled;
    private List<GetSwitchStpItemStpBridgePriority> stpBridgePriorities;

    private GetSwitchStpItem() {}
    public Boolean rstpEnabled() {
        return this.rstpEnabled;
    }
    public List<GetSwitchStpItemStpBridgePriority> stpBridgePriorities() {
        return this.stpBridgePriorities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStpItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean rstpEnabled;
        private List<GetSwitchStpItemStpBridgePriority> stpBridgePriorities;
        public Builder() {}
        public Builder(GetSwitchStpItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rstpEnabled = defaults.rstpEnabled;
    	      this.stpBridgePriorities = defaults.stpBridgePriorities;
        }

        @CustomType.Setter
        public Builder rstpEnabled(Boolean rstpEnabled) {
            if (rstpEnabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchStpItem", "rstpEnabled");
            }
            this.rstpEnabled = rstpEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder stpBridgePriorities(List<GetSwitchStpItemStpBridgePriority> stpBridgePriorities) {
            if (stpBridgePriorities == null) {
              throw new MissingRequiredPropertyException("GetSwitchStpItem", "stpBridgePriorities");
            }
            this.stpBridgePriorities = stpBridgePriorities;
            return this;
        }
        public Builder stpBridgePriorities(GetSwitchStpItemStpBridgePriority... stpBridgePriorities) {
            return stpBridgePriorities(List.of(stpBridgePriorities));
        }
        public GetSwitchStpItem build() {
            final var _resultValue = new GetSwitchStpItem();
            _resultValue.rstpEnabled = rstpEnabled;
            _resultValue.stpBridgePriorities = stpBridgePriorities;
            return _resultValue;
        }
    }
}
