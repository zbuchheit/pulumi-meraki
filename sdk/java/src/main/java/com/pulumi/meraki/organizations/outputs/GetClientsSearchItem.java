// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetClientsSearchItemRecord;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClientsSearchItem {
    private String clientId;
    private String mac;
    private String manufacturer;
    private List<GetClientsSearchItemRecord> records;

    private GetClientsSearchItem() {}
    public String clientId() {
        return this.clientId;
    }
    public String mac() {
        return this.mac;
    }
    public String manufacturer() {
        return this.manufacturer;
    }
    public List<GetClientsSearchItemRecord> records() {
        return this.records;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientsSearchItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        private String mac;
        private String manufacturer;
        private List<GetClientsSearchItemRecord> records;
        public Builder() {}
        public Builder(GetClientsSearchItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.mac = defaults.mac;
    	      this.manufacturer = defaults.manufacturer;
    	      this.records = defaults.records;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItem", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItem", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder manufacturer(String manufacturer) {
            if (manufacturer == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItem", "manufacturer");
            }
            this.manufacturer = manufacturer;
            return this;
        }
        @CustomType.Setter
        public Builder records(List<GetClientsSearchItemRecord> records) {
            if (records == null) {
              throw new MissingRequiredPropertyException("GetClientsSearchItem", "records");
            }
            this.records = records;
            return this;
        }
        public Builder records(GetClientsSearchItemRecord... records) {
            return records(List.of(records));
        }
        public GetClientsSearchItem build() {
            final var _resultValue = new GetClientsSearchItem();
            _resultValue.clientId = clientId;
            _resultValue.mac = mac;
            _resultValue.manufacturer = manufacturer;
            _resultValue.records = records;
            return _resultValue;
        }
    }
}
