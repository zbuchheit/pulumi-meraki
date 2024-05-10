// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClientsSearchItemRecordNetwork {
    private String enrollmentString;
    private String id;
    private Boolean isBoundToConfigTemplate;
    private String name;
    private String notes;
    private String organizationId;
    private List<String> productTypes;
    private List<String> tags;
    private String timeZone;

    private GetClientsSearchItemRecordNetwork() {}
    public String enrollmentString() {
        return this.enrollmentString;
    }
    public String id() {
        return this.id;
    }
    public Boolean isBoundToConfigTemplate() {
        return this.isBoundToConfigTemplate;
    }
    public String name() {
        return this.name;
    }
    public String notes() {
        return this.notes;
    }
    public String organizationId() {
        return this.organizationId;
    }
    public List<String> productTypes() {
        return this.productTypes;
    }
    public List<String> tags() {
        return this.tags;
    }
    public String timeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientsSearchItemRecordNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String enrollmentString;
        private String id;
        private Boolean isBoundToConfigTemplate;
        private String name;
        private String notes;
        private String organizationId;
        private List<String> productTypes;
        private List<String> tags;
        private String timeZone;
        public Builder() {}
        public Builder(GetClientsSearchItemRecordNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enrollmentString = defaults.enrollmentString;
    	      this.id = defaults.id;
    	      this.isBoundToConfigTemplate = defaults.isBoundToConfigTemplate;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.organizationId = defaults.organizationId;
    	      this.productTypes = defaults.productTypes;
    	      this.tags = defaults.tags;
    	      this.timeZone = defaults.timeZone;
        }

        @CustomType.Setter
        public Builder enrollmentString(String enrollmentString) {
            if (enrollmentString == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordNetwork", "enrollmentString");
            }
            this.enrollmentString = enrollmentString;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordNetwork", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isBoundToConfigTemplate(Boolean isBoundToConfigTemplate) {
            if (isBoundToConfigTemplate == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordNetwork", "isBoundToConfigTemplate");
            }
            this.isBoundToConfigTemplate = isBoundToConfigTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordNetwork", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notes(String notes) {
            if (notes == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordNetwork", "notes");
            }
            this.notes = notes;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordNetwork", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder productTypes(List<String> productTypes) {
            if (productTypes == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordNetwork", "productTypes");
            }
            this.productTypes = productTypes;
            return this;
        }
        public Builder productTypes(String... productTypes) {
            return productTypes(List.of(productTypes));
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordNetwork", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder timeZone(String timeZone) {
            if (timeZone == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItemRecordNetwork", "timeZone");
            }
            this.timeZone = timeZone;
            return this;
        }
        public GetClientsSearchItemRecordNetwork build() {
            final var _resultValue = new GetClientsSearchItemRecordNetwork();
            _resultValue.enrollmentString = enrollmentString;
            _resultValue.id = id;
            _resultValue.isBoundToConfigTemplate = isBoundToConfigTemplate;
            _resultValue.name = name;
            _resultValue.notes = notes;
            _resultValue.organizationId = organizationId;
            _resultValue.productTypes = productTypes;
            _resultValue.tags = tags;
            _resultValue.timeZone = timeZone;
            return _resultValue;
        }
    }
}
