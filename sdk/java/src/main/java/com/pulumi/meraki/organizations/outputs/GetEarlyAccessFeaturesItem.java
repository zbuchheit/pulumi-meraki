// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetEarlyAccessFeaturesItemDescriptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEarlyAccessFeaturesItem {
    /**
     * @return Descriptions of the early access feature
     * 
     */
    private GetEarlyAccessFeaturesItemDescriptions descriptions;
    /**
     * @return Link to the documentation of this early access feature
     * 
     */
    private String documentationLink;
    /**
     * @return If this early access feature can only be opted in for the entire organization
     * 
     */
    private Boolean isOrgScopedOnly;
    /**
     * @return Name of the early access feature
     * 
     */
    private String name;
    /**
     * @return Short name of the early access feature
     * 
     */
    private String shortName;
    /**
     * @return Link to get support for this early access feature
     * 
     */
    private String supportLink;
    /**
     * @return Topic of the early access feature
     * 
     */
    private String topic;

    private GetEarlyAccessFeaturesItem() {}
    /**
     * @return Descriptions of the early access feature
     * 
     */
    public GetEarlyAccessFeaturesItemDescriptions descriptions() {
        return this.descriptions;
    }
    /**
     * @return Link to the documentation of this early access feature
     * 
     */
    public String documentationLink() {
        return this.documentationLink;
    }
    /**
     * @return If this early access feature can only be opted in for the entire organization
     * 
     */
    public Boolean isOrgScopedOnly() {
        return this.isOrgScopedOnly;
    }
    /**
     * @return Name of the early access feature
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Short name of the early access feature
     * 
     */
    public String shortName() {
        return this.shortName;
    }
    /**
     * @return Link to get support for this early access feature
     * 
     */
    public String supportLink() {
        return this.supportLink;
    }
    /**
     * @return Topic of the early access feature
     * 
     */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEarlyAccessFeaturesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetEarlyAccessFeaturesItemDescriptions descriptions;
        private String documentationLink;
        private Boolean isOrgScopedOnly;
        private String name;
        private String shortName;
        private String supportLink;
        private String topic;
        public Builder() {}
        public Builder(GetEarlyAccessFeaturesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.descriptions = defaults.descriptions;
    	      this.documentationLink = defaults.documentationLink;
    	      this.isOrgScopedOnly = defaults.isOrgScopedOnly;
    	      this.name = defaults.name;
    	      this.shortName = defaults.shortName;
    	      this.supportLink = defaults.supportLink;
    	      this.topic = defaults.topic;
        }

        @CustomType.Setter
        public Builder descriptions(GetEarlyAccessFeaturesItemDescriptions descriptions) {
            if (descriptions == null) {
              throw new MissingRequiredPropertyException("GetEarlyAccessFeaturesItem", "descriptions");
            }
            this.descriptions = descriptions;
            return this;
        }
        @CustomType.Setter
        public Builder documentationLink(String documentationLink) {
            if (documentationLink == null) {
              throw new MissingRequiredPropertyException("GetEarlyAccessFeaturesItem", "documentationLink");
            }
            this.documentationLink = documentationLink;
            return this;
        }
        @CustomType.Setter
        public Builder isOrgScopedOnly(Boolean isOrgScopedOnly) {
            if (isOrgScopedOnly == null) {
              throw new MissingRequiredPropertyException("GetEarlyAccessFeaturesItem", "isOrgScopedOnly");
            }
            this.isOrgScopedOnly = isOrgScopedOnly;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetEarlyAccessFeaturesItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder shortName(String shortName) {
            if (shortName == null) {
              throw new MissingRequiredPropertyException("GetEarlyAccessFeaturesItem", "shortName");
            }
            this.shortName = shortName;
            return this;
        }
        @CustomType.Setter
        public Builder supportLink(String supportLink) {
            if (supportLink == null) {
              throw new MissingRequiredPropertyException("GetEarlyAccessFeaturesItem", "supportLink");
            }
            this.supportLink = supportLink;
            return this;
        }
        @CustomType.Setter
        public Builder topic(String topic) {
            if (topic == null) {
              throw new MissingRequiredPropertyException("GetEarlyAccessFeaturesItem", "topic");
            }
            this.topic = topic;
            return this;
        }
        public GetEarlyAccessFeaturesItem build() {
            final var _resultValue = new GetEarlyAccessFeaturesItem();
            _resultValue.descriptions = descriptions;
            _resultValue.documentationLink = documentationLink;
            _resultValue.isOrgScopedOnly = isOrgScopedOnly;
            _resultValue.name = name;
            _resultValue.shortName = shortName;
            _resultValue.supportLink = supportLink;
            _resultValue.topic = topic;
            return _resultValue;
        }
    }
}
