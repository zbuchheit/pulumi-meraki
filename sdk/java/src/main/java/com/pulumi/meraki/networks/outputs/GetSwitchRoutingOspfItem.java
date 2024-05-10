// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSwitchRoutingOspfItemArea;
import com.pulumi.meraki.networks.outputs.GetSwitchRoutingOspfItemMd5AuthenticationKey;
import com.pulumi.meraki.networks.outputs.GetSwitchRoutingOspfItemV3;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSwitchRoutingOspfItem {
    private List<GetSwitchRoutingOspfItemArea> areas;
    private Integer deadTimerInSeconds;
    private Boolean enabled;
    private Integer helloTimerInSeconds;
    private Boolean md5AuthenticationEnabled;
    private GetSwitchRoutingOspfItemMd5AuthenticationKey md5AuthenticationKey;
    private GetSwitchRoutingOspfItemV3 v3;

    private GetSwitchRoutingOspfItem() {}
    public List<GetSwitchRoutingOspfItemArea> areas() {
        return this.areas;
    }
    public Integer deadTimerInSeconds() {
        return this.deadTimerInSeconds;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public Integer helloTimerInSeconds() {
        return this.helloTimerInSeconds;
    }
    public Boolean md5AuthenticationEnabled() {
        return this.md5AuthenticationEnabled;
    }
    public GetSwitchRoutingOspfItemMd5AuthenticationKey md5AuthenticationKey() {
        return this.md5AuthenticationKey;
    }
    public GetSwitchRoutingOspfItemV3 v3() {
        return this.v3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchRoutingOspfItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSwitchRoutingOspfItemArea> areas;
        private Integer deadTimerInSeconds;
        private Boolean enabled;
        private Integer helloTimerInSeconds;
        private Boolean md5AuthenticationEnabled;
        private GetSwitchRoutingOspfItemMd5AuthenticationKey md5AuthenticationKey;
        private GetSwitchRoutingOspfItemV3 v3;
        public Builder() {}
        public Builder(GetSwitchRoutingOspfItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.areas = defaults.areas;
    	      this.deadTimerInSeconds = defaults.deadTimerInSeconds;
    	      this.enabled = defaults.enabled;
    	      this.helloTimerInSeconds = defaults.helloTimerInSeconds;
    	      this.md5AuthenticationEnabled = defaults.md5AuthenticationEnabled;
    	      this.md5AuthenticationKey = defaults.md5AuthenticationKey;
    	      this.v3 = defaults.v3;
        }

        @CustomType.Setter
        public Builder areas(List<GetSwitchRoutingOspfItemArea> areas) {
            if (areas == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingOspfItem", "areas");
            }
            this.areas = areas;
            return this;
        }
        public Builder areas(GetSwitchRoutingOspfItemArea... areas) {
            return areas(List.of(areas));
        }
        @CustomType.Setter
        public Builder deadTimerInSeconds(Integer deadTimerInSeconds) {
            if (deadTimerInSeconds == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingOspfItem", "deadTimerInSeconds");
            }
            this.deadTimerInSeconds = deadTimerInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingOspfItem", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder helloTimerInSeconds(Integer helloTimerInSeconds) {
            if (helloTimerInSeconds == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingOspfItem", "helloTimerInSeconds");
            }
            this.helloTimerInSeconds = helloTimerInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder md5AuthenticationEnabled(Boolean md5AuthenticationEnabled) {
            if (md5AuthenticationEnabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingOspfItem", "md5AuthenticationEnabled");
            }
            this.md5AuthenticationEnabled = md5AuthenticationEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder md5AuthenticationKey(GetSwitchRoutingOspfItemMd5AuthenticationKey md5AuthenticationKey) {
            if (md5AuthenticationKey == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingOspfItem", "md5AuthenticationKey");
            }
            this.md5AuthenticationKey = md5AuthenticationKey;
            return this;
        }
        @CustomType.Setter
        public Builder v3(GetSwitchRoutingOspfItemV3 v3) {
            if (v3 == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingOspfItem", "v3");
            }
            this.v3 = v3;
            return this;
        }
        public GetSwitchRoutingOspfItem build() {
            final var _resultValue = new GetSwitchRoutingOspfItem();
            _resultValue.areas = areas;
            _resultValue.deadTimerInSeconds = deadTimerInSeconds;
            _resultValue.enabled = enabled;
            _resultValue.helloTimerInSeconds = helloTimerInSeconds;
            _resultValue.md5AuthenticationEnabled = md5AuthenticationEnabled;
            _resultValue.md5AuthenticationKey = md5AuthenticationKey;
            _resultValue.v3 = v3;
            return _resultValue;
        }
    }
}
