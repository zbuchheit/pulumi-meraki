// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsHotspot20NaiRealmMethodAuthenticationTypes {
    private @Nullable List<String> credentials;
    private @Nullable List<String> eapinnerAuthentications;
    private @Nullable List<String> nonEapinnerAuthentications;
    private @Nullable List<String> tunneledEapMethodCredentials;

    private WirelessSsidsHotspot20NaiRealmMethodAuthenticationTypes() {}
    public List<String> credentials() {
        return this.credentials == null ? List.of() : this.credentials;
    }
    public List<String> eapinnerAuthentications() {
        return this.eapinnerAuthentications == null ? List.of() : this.eapinnerAuthentications;
    }
    public List<String> nonEapinnerAuthentications() {
        return this.nonEapinnerAuthentications == null ? List.of() : this.nonEapinnerAuthentications;
    }
    public List<String> tunneledEapMethodCredentials() {
        return this.tunneledEapMethodCredentials == null ? List.of() : this.tunneledEapMethodCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsHotspot20NaiRealmMethodAuthenticationTypes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> credentials;
        private @Nullable List<String> eapinnerAuthentications;
        private @Nullable List<String> nonEapinnerAuthentications;
        private @Nullable List<String> tunneledEapMethodCredentials;
        public Builder() {}
        public Builder(WirelessSsidsHotspot20NaiRealmMethodAuthenticationTypes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.eapinnerAuthentications = defaults.eapinnerAuthentications;
    	      this.nonEapinnerAuthentications = defaults.nonEapinnerAuthentications;
    	      this.tunneledEapMethodCredentials = defaults.tunneledEapMethodCredentials;
        }

        @CustomType.Setter
        public Builder credentials(@Nullable List<String> credentials) {

            this.credentials = credentials;
            return this;
        }
        public Builder credentials(String... credentials) {
            return credentials(List.of(credentials));
        }
        @CustomType.Setter
        public Builder eapinnerAuthentications(@Nullable List<String> eapinnerAuthentications) {

            this.eapinnerAuthentications = eapinnerAuthentications;
            return this;
        }
        public Builder eapinnerAuthentications(String... eapinnerAuthentications) {
            return eapinnerAuthentications(List.of(eapinnerAuthentications));
        }
        @CustomType.Setter
        public Builder nonEapinnerAuthentications(@Nullable List<String> nonEapinnerAuthentications) {

            this.nonEapinnerAuthentications = nonEapinnerAuthentications;
            return this;
        }
        public Builder nonEapinnerAuthentications(String... nonEapinnerAuthentications) {
            return nonEapinnerAuthentications(List.of(nonEapinnerAuthentications));
        }
        @CustomType.Setter
        public Builder tunneledEapMethodCredentials(@Nullable List<String> tunneledEapMethodCredentials) {

            this.tunneledEapMethodCredentials = tunneledEapMethodCredentials;
            return this;
        }
        public Builder tunneledEapMethodCredentials(String... tunneledEapMethodCredentials) {
            return tunneledEapMethodCredentials(List.of(tunneledEapMethodCredentials));
        }
        public WirelessSsidsHotspot20NaiRealmMethodAuthenticationTypes build() {
            final var _resultValue = new WirelessSsidsHotspot20NaiRealmMethodAuthenticationTypes();
            _resultValue.credentials = credentials;
            _resultValue.eapinnerAuthentications = eapinnerAuthentications;
            _resultValue.nonEapinnerAuthentications = nonEapinnerAuthentications;
            _resultValue.tunneledEapMethodCredentials = tunneledEapMethodCredentials;
            return _resultValue;
        }
    }
}
