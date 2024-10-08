// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SmDevicesModifyTagsParameters {
    /**
     * @return The ids of the devices to be modified.
     * 
     */
    private @Nullable List<String> ids;
    /**
     * @return The scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags of the devices to be modified.
     * 
     */
    private @Nullable List<String> scopes;
    /**
     * @return The serials of the devices to be modified.
     * 
     */
    private @Nullable List<String> serials;
    /**
     * @return The tags to be added, deleted, or updated.
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return One of add, delete, or update. Only devices that have been modified will be returned.
     * 
     */
    private @Nullable String updateAction;
    /**
     * @return The wifiMacs of the devices to be modified.
     * 
     */
    private @Nullable List<String> wifiMacs;

    private SmDevicesModifyTagsParameters() {}
    /**
     * @return The ids of the devices to be modified.
     * 
     */
    public List<String> ids() {
        return this.ids == null ? List.of() : this.ids;
    }
    /**
     * @return The scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags of the devices to be modified.
     * 
     */
    public List<String> scopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }
    /**
     * @return The serials of the devices to be modified.
     * 
     */
    public List<String> serials() {
        return this.serials == null ? List.of() : this.serials;
    }
    /**
     * @return The tags to be added, deleted, or updated.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return One of add, delete, or update. Only devices that have been modified will be returned.
     * 
     */
    public Optional<String> updateAction() {
        return Optional.ofNullable(this.updateAction);
    }
    /**
     * @return The wifiMacs of the devices to be modified.
     * 
     */
    public List<String> wifiMacs() {
        return this.wifiMacs == null ? List.of() : this.wifiMacs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmDevicesModifyTagsParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> ids;
        private @Nullable List<String> scopes;
        private @Nullable List<String> serials;
        private @Nullable List<String> tags;
        private @Nullable String updateAction;
        private @Nullable List<String> wifiMacs;
        public Builder() {}
        public Builder(SmDevicesModifyTagsParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ids = defaults.ids;
    	      this.scopes = defaults.scopes;
    	      this.serials = defaults.serials;
    	      this.tags = defaults.tags;
    	      this.updateAction = defaults.updateAction;
    	      this.wifiMacs = defaults.wifiMacs;
        }

        @CustomType.Setter
        public Builder ids(@Nullable List<String> ids) {

            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder scopes(@Nullable List<String> scopes) {

            this.scopes = scopes;
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        @CustomType.Setter
        public Builder serials(@Nullable List<String> serials) {

            this.serials = serials;
            return this;
        }
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder updateAction(@Nullable String updateAction) {

            this.updateAction = updateAction;
            return this;
        }
        @CustomType.Setter
        public Builder wifiMacs(@Nullable List<String> wifiMacs) {

            this.wifiMacs = wifiMacs;
            return this;
        }
        public Builder wifiMacs(String... wifiMacs) {
            return wifiMacs(List.of(wifiMacs));
        }
        public SmDevicesModifyTagsParameters build() {
            final var _resultValue = new SmDevicesModifyTagsParameters();
            _resultValue.ids = ids;
            _resultValue.scopes = scopes;
            _resultValue.serials = serials;
            _resultValue.tags = tags;
            _resultValue.updateAction = updateAction;
            _resultValue.wifiMacs = wifiMacs;
            return _resultValue;
        }
    }
}
