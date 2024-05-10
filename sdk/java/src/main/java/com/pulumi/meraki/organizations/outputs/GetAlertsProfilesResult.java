// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetAlertsProfilesItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAlertsProfilesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseOrganizationsGetOrganizationAlertsProfiles
     * 
     */
    private List<GetAlertsProfilesItem> items;
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    private String organizationId;

    private GetAlertsProfilesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseOrganizationsGetOrganizationAlertsProfiles
     * 
     */
    public List<GetAlertsProfilesItem> items() {
        return this.items;
    }
    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertsProfilesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetAlertsProfilesItem> items;
        private String organizationId;
        public Builder() {}
        public Builder(GetAlertsProfilesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.organizationId = defaults.organizationId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAlertsProfilesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetAlertsProfilesItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetAlertsProfilesResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetAlertsProfilesItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetAlertsProfilesResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        public GetAlertsProfilesResult build() {
            final var _resultValue = new GetAlertsProfilesResult();
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.organizationId = organizationId;
            return _resultValue;
        }
    }
}
