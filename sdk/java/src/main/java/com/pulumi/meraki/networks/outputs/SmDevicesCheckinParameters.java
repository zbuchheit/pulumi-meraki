// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SmDevicesCheckinParameters {
    /**
     * @return The ids of the devices to be checked-in.
     * 
     */
    private @Nullable List<String> ids;
    /**
     * @return The scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags of the devices to be checked-in.
     * 
     */
    private @Nullable List<String> scopes;
    /**
     * @return The serials of the devices to be checked-in.
     * 
     */
    private @Nullable List<String> serials;
    /**
     * @return The wifiMacs of the devices to be checked-in.
     * 
     */
    private @Nullable List<String> wifiMacs;

    private SmDevicesCheckinParameters() {}
    /**
     * @return The ids of the devices to be checked-in.
     * 
     */
    public List<String> ids() {
        return this.ids == null ? List.of() : this.ids;
    }
    /**
     * @return The scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags of the devices to be checked-in.
     * 
     */
    public List<String> scopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }
    /**
     * @return The serials of the devices to be checked-in.
     * 
     */
    public List<String> serials() {
        return this.serials == null ? List.of() : this.serials;
    }
    /**
     * @return The wifiMacs of the devices to be checked-in.
     * 
     */
    public List<String> wifiMacs() {
        return this.wifiMacs == null ? List.of() : this.wifiMacs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmDevicesCheckinParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> ids;
        private @Nullable List<String> scopes;
        private @Nullable List<String> serials;
        private @Nullable List<String> wifiMacs;
        public Builder() {}
        public Builder(SmDevicesCheckinParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ids = defaults.ids;
    	      this.scopes = defaults.scopes;
    	      this.serials = defaults.serials;
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
        public Builder wifiMacs(@Nullable List<String> wifiMacs) {

            this.wifiMacs = wifiMacs;
            return this;
        }
        public Builder wifiMacs(String... wifiMacs) {
            return wifiMacs(List.of(wifiMacs));
        }
        public SmDevicesCheckinParameters build() {
            final var _resultValue = new SmDevicesCheckinParameters();
            _resultValue.ids = ids;
            _resultValue.scopes = scopes;
            _resultValue.serials = serials;
            _resultValue.wifiMacs = wifiMacs;
            return _resultValue;
        }
    }
}
