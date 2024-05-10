// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetPoliciesByClientItemAssignedSsid;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPoliciesByClientItemAssigned {
    /**
     * @return id of policy
     * 
     */
    private String groupPolicyId;
    /**
     * @return name of policy
     * 
     */
    private String name;
    /**
     * @return ssid
     * 
     */
    private List<GetPoliciesByClientItemAssignedSsid> ssids;
    /**
     * @return type of policy
     * 
     */
    private String type;

    private GetPoliciesByClientItemAssigned() {}
    /**
     * @return id of policy
     * 
     */
    public String groupPolicyId() {
        return this.groupPolicyId;
    }
    /**
     * @return name of policy
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return ssid
     * 
     */
    public List<GetPoliciesByClientItemAssignedSsid> ssids() {
        return this.ssids;
    }
    /**
     * @return type of policy
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoliciesByClientItemAssigned defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String groupPolicyId;
        private String name;
        private List<GetPoliciesByClientItemAssignedSsid> ssids;
        private String type;
        public Builder() {}
        public Builder(GetPoliciesByClientItemAssigned defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupPolicyId = defaults.groupPolicyId;
    	      this.name = defaults.name;
    	      this.ssids = defaults.ssids;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder groupPolicyId(String groupPolicyId) {
            if (groupPolicyId == null) {
              throw new MissingRequiredPropertyException("GetPoliciesByClientItemAssigned", "groupPolicyId");
            }
            this.groupPolicyId = groupPolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPoliciesByClientItemAssigned", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ssids(List<GetPoliciesByClientItemAssignedSsid> ssids) {
            if (ssids == null) {
              throw new MissingRequiredPropertyException("GetPoliciesByClientItemAssigned", "ssids");
            }
            this.ssids = ssids;
            return this;
        }
        public Builder ssids(GetPoliciesByClientItemAssignedSsid... ssids) {
            return ssids(List.of(ssids));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetPoliciesByClientItemAssigned", "type");
            }
            this.type = type;
            return this;
        }
        public GetPoliciesByClientItemAssigned build() {
            final var _resultValue = new GetPoliciesByClientItemAssigned();
            _resultValue.groupPolicyId = groupPolicyId;
            _resultValue.name = name;
            _resultValue.ssids = ssids;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
