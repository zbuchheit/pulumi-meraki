// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.CloneItemApi;
import com.pulumi.meraki.organizations.outputs.CloneItemCloud;
import com.pulumi.meraki.organizations.outputs.CloneItemLicensing;
import com.pulumi.meraki.organizations.outputs.CloneItemManagement;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloneItem {
    /**
     * @return API related settings
     * 
     */
    private @Nullable CloneItemApi api;
    /**
     * @return Data for this organization
     * 
     */
    private @Nullable CloneItemCloud cloud;
    /**
     * @return Organization ID
     * 
     */
    private @Nullable String id;
    /**
     * @return Licensing related settings
     * 
     */
    private @Nullable CloneItemLicensing licensing;
    /**
     * @return Information about the organization&#39;s management system
     * 
     */
    private @Nullable CloneItemManagement management;
    /**
     * @return Organization name
     * 
     */
    private @Nullable String name;
    /**
     * @return Organization URL
     * 
     */
    private @Nullable String url;

    private CloneItem() {}
    /**
     * @return API related settings
     * 
     */
    public Optional<CloneItemApi> api() {
        return Optional.ofNullable(this.api);
    }
    /**
     * @return Data for this organization
     * 
     */
    public Optional<CloneItemCloud> cloud() {
        return Optional.ofNullable(this.cloud);
    }
    /**
     * @return Organization ID
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Licensing related settings
     * 
     */
    public Optional<CloneItemLicensing> licensing() {
        return Optional.ofNullable(this.licensing);
    }
    /**
     * @return Information about the organization&#39;s management system
     * 
     */
    public Optional<CloneItemManagement> management() {
        return Optional.ofNullable(this.management);
    }
    /**
     * @return Organization name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Organization URL
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloneItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CloneItemApi api;
        private @Nullable CloneItemCloud cloud;
        private @Nullable String id;
        private @Nullable CloneItemLicensing licensing;
        private @Nullable CloneItemManagement management;
        private @Nullable String name;
        private @Nullable String url;
        public Builder() {}
        public Builder(CloneItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.cloud = defaults.cloud;
    	      this.id = defaults.id;
    	      this.licensing = defaults.licensing;
    	      this.management = defaults.management;
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder api(@Nullable CloneItemApi api) {

            this.api = api;
            return this;
        }
        @CustomType.Setter
        public Builder cloud(@Nullable CloneItemCloud cloud) {

            this.cloud = cloud;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder licensing(@Nullable CloneItemLicensing licensing) {

            this.licensing = licensing;
            return this;
        }
        @CustomType.Setter
        public Builder management(@Nullable CloneItemManagement management) {

            this.management = management;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public CloneItem build() {
            final var _resultValue = new CloneItem();
            _resultValue.api = api;
            _resultValue.cloud = cloud;
            _resultValue.id = id;
            _resultValue.licensing = licensing;
            _resultValue.management = management;
            _resultValue.name = name;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}