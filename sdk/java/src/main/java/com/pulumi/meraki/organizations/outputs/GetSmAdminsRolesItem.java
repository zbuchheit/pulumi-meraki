// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSmAdminsRolesItem {
    /**
     * @return The name of the limited access role
     * 
     */
    private String name;
    /**
     * @return The Id of the limited access role
     * 
     */
    private String roleId;
    /**
     * @return The scope of the limited access role
     * 
     */
    private String scope;
    /**
     * @return The tags of the limited access role
     * 
     */
    private List<String> tags;

    private GetSmAdminsRolesItem() {}
    /**
     * @return The name of the limited access role
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Id of the limited access role
     * 
     */
    public String roleId() {
        return this.roleId;
    }
    /**
     * @return The scope of the limited access role
     * 
     */
    public String scope() {
        return this.scope;
    }
    /**
     * @return The tags of the limited access role
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmAdminsRolesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String roleId;
        private String scope;
        private List<String> tags;
        public Builder() {}
        public Builder(GetSmAdminsRolesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.roleId = defaults.roleId;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSmAdminsRolesItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder roleId(String roleId) {
            if (roleId == null) {
              throw new MissingRequiredPropertyException("GetSmAdminsRolesItem", "roleId");
            }
            this.roleId = roleId;
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            if (scope == null) {
              throw new MissingRequiredPropertyException("GetSmAdminsRolesItem", "scope");
            }
            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetSmAdminsRolesItem", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetSmAdminsRolesItem build() {
            final var _resultValue = new GetSmAdminsRolesItem();
            _resultValue.name = name;
            _resultValue.roleId = roleId;
            _resultValue.scope = scope;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}