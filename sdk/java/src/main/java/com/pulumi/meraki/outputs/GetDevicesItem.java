// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.outputs.GetDevicesItemDetail;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDevicesItem {
    /**
     * @return Physical address of the device
     * 
     */
    private String address;
    /**
     * @return Additional device information
     * 
     */
    private List<GetDevicesItemDetail> details;
    /**
     * @return Firmware version of the device
     * 
     */
    private String firmware;
    /**
     * @return IMEI of the device, if applicable
     * 
     */
    private Double imei;
    /**
     * @return LAN IP address of the device
     * 
     */
    private String lanIp;
    /**
     * @return Latitude of the device
     * 
     */
    private Double lat;
    /**
     * @return Longitude of the device
     * 
     */
    private Double lng;
    /**
     * @return MAC address of the device
     * 
     */
    private String mac;
    /**
     * @return Model of the device
     * 
     */
    private String model;
    /**
     * @return Name of the device
     * 
     */
    private String name;
    /**
     * @return ID of the network the device belongs to
     * 
     */
    private String networkId;
    /**
     * @return Notes for the device, limited to 255 characters
     * 
     */
    private String notes;
    /**
     * @return Product type of the device
     * 
     */
    private String productType;
    /**
     * @return Serial number of the device
     * 
     */
    private String serial;
    /**
     * @return List of tags assigned to the device
     * 
     */
    private List<String> tags;

    private GetDevicesItem() {}
    /**
     * @return Physical address of the device
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Additional device information
     * 
     */
    public List<GetDevicesItemDetail> details() {
        return this.details;
    }
    /**
     * @return Firmware version of the device
     * 
     */
    public String firmware() {
        return this.firmware;
    }
    /**
     * @return IMEI of the device, if applicable
     * 
     */
    public Double imei() {
        return this.imei;
    }
    /**
     * @return LAN IP address of the device
     * 
     */
    public String lanIp() {
        return this.lanIp;
    }
    /**
     * @return Latitude of the device
     * 
     */
    public Double lat() {
        return this.lat;
    }
    /**
     * @return Longitude of the device
     * 
     */
    public Double lng() {
        return this.lng;
    }
    /**
     * @return MAC address of the device
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return Model of the device
     * 
     */
    public String model() {
        return this.model;
    }
    /**
     * @return Name of the device
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return ID of the network the device belongs to
     * 
     */
    public String networkId() {
        return this.networkId;
    }
    /**
     * @return Notes for the device, limited to 255 characters
     * 
     */
    public String notes() {
        return this.notes;
    }
    /**
     * @return Product type of the device
     * 
     */
    public String productType() {
        return this.productType;
    }
    /**
     * @return Serial number of the device
     * 
     */
    public String serial() {
        return this.serial;
    }
    /**
     * @return List of tags assigned to the device
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private List<GetDevicesItemDetail> details;
        private String firmware;
        private Double imei;
        private String lanIp;
        private Double lat;
        private Double lng;
        private String mac;
        private String model;
        private String name;
        private String networkId;
        private String notes;
        private String productType;
        private String serial;
        private List<String> tags;
        public Builder() {}
        public Builder(GetDevicesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.details = defaults.details;
    	      this.firmware = defaults.firmware;
    	      this.imei = defaults.imei;
    	      this.lanIp = defaults.lanIp;
    	      this.lat = defaults.lat;
    	      this.lng = defaults.lng;
    	      this.mac = defaults.mac;
    	      this.model = defaults.model;
    	      this.name = defaults.name;
    	      this.networkId = defaults.networkId;
    	      this.notes = defaults.notes;
    	      this.productType = defaults.productType;
    	      this.serial = defaults.serial;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder details(List<GetDevicesItemDetail> details) {
            if (details == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "details");
            }
            this.details = details;
            return this;
        }
        public Builder details(GetDevicesItemDetail... details) {
            return details(List.of(details));
        }
        @CustomType.Setter
        public Builder firmware(String firmware) {
            if (firmware == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "firmware");
            }
            this.firmware = firmware;
            return this;
        }
        @CustomType.Setter
        public Builder imei(Double imei) {
            if (imei == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "imei");
            }
            this.imei = imei;
            return this;
        }
        @CustomType.Setter
        public Builder lanIp(String lanIp) {
            if (lanIp == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "lanIp");
            }
            this.lanIp = lanIp;
            return this;
        }
        @CustomType.Setter
        public Builder lat(Double lat) {
            if (lat == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "lat");
            }
            this.lat = lat;
            return this;
        }
        @CustomType.Setter
        public Builder lng(Double lng) {
            if (lng == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "lng");
            }
            this.lng = lng;
            return this;
        }
        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder model(String model) {
            if (model == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "model");
            }
            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder notes(String notes) {
            if (notes == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "notes");
            }
            this.notes = notes;
            return this;
        }
        @CustomType.Setter
        public Builder productType(String productType) {
            if (productType == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "productType");
            }
            this.productType = productType;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "serial");
            }
            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetDevicesItem", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetDevicesItem build() {
            final var _resultValue = new GetDevicesItem();
            _resultValue.address = address;
            _resultValue.details = details;
            _resultValue.firmware = firmware;
            _resultValue.imei = imei;
            _resultValue.lanIp = lanIp;
            _resultValue.lat = lat;
            _resultValue.lng = lng;
            _resultValue.mac = mac;
            _resultValue.model = model;
            _resultValue.name = name;
            _resultValue.networkId = networkId;
            _resultValue.notes = notes;
            _resultValue.productType = productType;
            _resultValue.serial = serial;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
