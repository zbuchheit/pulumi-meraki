// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSmDevicesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmDevicesPlainArgs Empty = new GetSmDevicesPlainArgs();

    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="endingBefore")
    private @Nullable String endingBefore;

    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }

    /**
     * fields query parameter. Additional fields that will be displayed for each device.
     * The default fields are: id, name, tags, ssid, wifiMac, osName, systemModel, uuid, and serialNumber. The additional fields are: ip,
     * systemType, availableDeviceCapacity, kioskAppName, biosVersion, lastConnected, missingAppsCount, userSuppliedAddress, location, lastUser,
     * ownerEmail, ownerUsername, osBuild, publicIp, phoneNumber, diskInfoJson, deviceCapacity, isManaged, hadMdm, isSupervised, meid, imei, iccid,
     * simCarrierNetwork, cellularDataUsed, isHotspotEnabled, createdAt, batteryEstCharge, quarantined, avName, avRunning, asName, fwName,
     * isRooted, loginRequired, screenLockEnabled, screenLockDelay, autoLoginDisabled, autoTags, hasMdm, hasDesktopAgent, diskEncryptionEnabled,
     * hardwareEncryptionCaps, passCodeLock, usesHardwareKeystore, androidSecurityPatchVersion, cellular, and url.
     * 
     */
    @Import(name="fields")
    private @Nullable List<String> fields;

    /**
     * @return fields query parameter. Additional fields that will be displayed for each device.
     * The default fields are: id, name, tags, ssid, wifiMac, osName, systemModel, uuid, and serialNumber. The additional fields are: ip,
     * systemType, availableDeviceCapacity, kioskAppName, biosVersion, lastConnected, missingAppsCount, userSuppliedAddress, location, lastUser,
     * ownerEmail, ownerUsername, osBuild, publicIp, phoneNumber, diskInfoJson, deviceCapacity, isManaged, hadMdm, isSupervised, meid, imei, iccid,
     * simCarrierNetwork, cellularDataUsed, isHotspotEnabled, createdAt, batteryEstCharge, quarantined, avName, avRunning, asName, fwName,
     * isRooted, loginRequired, screenLockEnabled, screenLockDelay, autoLoginDisabled, autoTags, hasMdm, hasDesktopAgent, diskEncryptionEnabled,
     * hardwareEncryptionCaps, passCodeLock, usesHardwareKeystore, androidSecurityPatchVersion, cellular, and url.
     * 
     */
    public Optional<List<String>> fields() {
        return Optional.ofNullable(this.fields);
    }

    /**
     * ids query parameter. Filter devices by id(s).
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return ids query parameter. Filter devices by id(s).
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    @Import(name="perPage")
    private @Nullable Integer perPage;

    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * scope query parameter. Specify a scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags.
     * 
     */
    @Import(name="scopes")
    private @Nullable List<String> scopes;

    /**
     * @return scope query parameter. Specify a scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags.
     * 
     */
    public Optional<List<String>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * serials query parameter. Filter devices by serial(s).
     * 
     */
    @Import(name="serials")
    private @Nullable List<String> serials;

    /**
     * @return serials query parameter. Filter devices by serial(s).
     * 
     */
    public Optional<List<String>> serials() {
        return Optional.ofNullable(this.serials);
    }

    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="startingAfter")
    private @Nullable String startingAfter;

    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }

    /**
     * systemTypes query parameter. Filter devices by system type(s).
     * 
     */
    @Import(name="systemTypes")
    private @Nullable List<String> systemTypes;

    /**
     * @return systemTypes query parameter. Filter devices by system type(s).
     * 
     */
    public Optional<List<String>> systemTypes() {
        return Optional.ofNullable(this.systemTypes);
    }

    /**
     * uuids query parameter. Filter devices by uuid(s).
     * 
     */
    @Import(name="uuids")
    private @Nullable List<String> uuids;

    /**
     * @return uuids query parameter. Filter devices by uuid(s).
     * 
     */
    public Optional<List<String>> uuids() {
        return Optional.ofNullable(this.uuids);
    }

    /**
     * wifiMacs query parameter. Filter devices by wifi mac(s).
     * 
     */
    @Import(name="wifiMacs")
    private @Nullable List<String> wifiMacs;

    /**
     * @return wifiMacs query parameter. Filter devices by wifi mac(s).
     * 
     */
    public Optional<List<String>> wifiMacs() {
        return Optional.ofNullable(this.wifiMacs);
    }

    private GetSmDevicesPlainArgs() {}

    private GetSmDevicesPlainArgs(GetSmDevicesPlainArgs $) {
        this.endingBefore = $.endingBefore;
        this.fields = $.fields;
        this.ids = $.ids;
        this.networkId = $.networkId;
        this.perPage = $.perPage;
        this.scopes = $.scopes;
        this.serials = $.serials;
        this.startingAfter = $.startingAfter;
        this.systemTypes = $.systemTypes;
        this.uuids = $.uuids;
        this.wifiMacs = $.wifiMacs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmDevicesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmDevicesPlainArgs $;

        public Builder() {
            $ = new GetSmDevicesPlainArgs();
        }

        public Builder(GetSmDevicesPlainArgs defaults) {
            $ = new GetSmDevicesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endingBefore endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder endingBefore(@Nullable String endingBefore) {
            $.endingBefore = endingBefore;
            return this;
        }

        /**
         * @param fields fields query parameter. Additional fields that will be displayed for each device.
         * The default fields are: id, name, tags, ssid, wifiMac, osName, systemModel, uuid, and serialNumber. The additional fields are: ip,
         * systemType, availableDeviceCapacity, kioskAppName, biosVersion, lastConnected, missingAppsCount, userSuppliedAddress, location, lastUser,
         * ownerEmail, ownerUsername, osBuild, publicIp, phoneNumber, diskInfoJson, deviceCapacity, isManaged, hadMdm, isSupervised, meid, imei, iccid,
         * simCarrierNetwork, cellularDataUsed, isHotspotEnabled, createdAt, batteryEstCharge, quarantined, avName, avRunning, asName, fwName,
         * isRooted, loginRequired, screenLockEnabled, screenLockDelay, autoLoginDisabled, autoTags, hasMdm, hasDesktopAgent, diskEncryptionEnabled,
         * hardwareEncryptionCaps, passCodeLock, usesHardwareKeystore, androidSecurityPatchVersion, cellular, and url.
         * 
         * @return builder
         * 
         */
        public Builder fields(@Nullable List<String> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields fields query parameter. Additional fields that will be displayed for each device.
         * The default fields are: id, name, tags, ssid, wifiMac, osName, systemModel, uuid, and serialNumber. The additional fields are: ip,
         * systemType, availableDeviceCapacity, kioskAppName, biosVersion, lastConnected, missingAppsCount, userSuppliedAddress, location, lastUser,
         * ownerEmail, ownerUsername, osBuild, publicIp, phoneNumber, diskInfoJson, deviceCapacity, isManaged, hadMdm, isSupervised, meid, imei, iccid,
         * simCarrierNetwork, cellularDataUsed, isHotspotEnabled, createdAt, batteryEstCharge, quarantined, avName, avRunning, asName, fwName,
         * isRooted, loginRequired, screenLockEnabled, screenLockDelay, autoLoginDisabled, autoTags, hasMdm, hasDesktopAgent, diskEncryptionEnabled,
         * hardwareEncryptionCaps, passCodeLock, usesHardwareKeystore, androidSecurityPatchVersion, cellular, and url.
         * 
         * @return builder
         * 
         */
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }

        /**
         * @param ids ids query parameter. Filter devices by id(s).
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids ids query parameter. Filter devices by id(s).
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Integer perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param scopes scope query parameter. Specify a scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable List<String> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes scope query parameter. Specify a scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        /**
         * @param serials serials query parameter. Filter devices by serial(s).
         * 
         * @return builder
         * 
         */
        public Builder serials(@Nullable List<String> serials) {
            $.serials = serials;
            return this;
        }

        /**
         * @param serials serials query parameter. Filter devices by serial(s).
         * 
         * @return builder
         * 
         */
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }

        /**
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(@Nullable String startingAfter) {
            $.startingAfter = startingAfter;
            return this;
        }

        /**
         * @param systemTypes systemTypes query parameter. Filter devices by system type(s).
         * 
         * @return builder
         * 
         */
        public Builder systemTypes(@Nullable List<String> systemTypes) {
            $.systemTypes = systemTypes;
            return this;
        }

        /**
         * @param systemTypes systemTypes query parameter. Filter devices by system type(s).
         * 
         * @return builder
         * 
         */
        public Builder systemTypes(String... systemTypes) {
            return systemTypes(List.of(systemTypes));
        }

        /**
         * @param uuids uuids query parameter. Filter devices by uuid(s).
         * 
         * @return builder
         * 
         */
        public Builder uuids(@Nullable List<String> uuids) {
            $.uuids = uuids;
            return this;
        }

        /**
         * @param uuids uuids query parameter. Filter devices by uuid(s).
         * 
         * @return builder
         * 
         */
        public Builder uuids(String... uuids) {
            return uuids(List.of(uuids));
        }

        /**
         * @param wifiMacs wifiMacs query parameter. Filter devices by wifi mac(s).
         * 
         * @return builder
         * 
         */
        public Builder wifiMacs(@Nullable List<String> wifiMacs) {
            $.wifiMacs = wifiMacs;
            return this;
        }

        /**
         * @param wifiMacs wifiMacs query parameter. Filter devices by wifi mac(s).
         * 
         * @return builder
         * 
         */
        public Builder wifiMacs(String... wifiMacs) {
            return wifiMacs(List.of(wifiMacs));
        }

        public GetSmDevicesPlainArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSmDevicesPlainArgs", "networkId");
            }
            return $;
        }
    }

}
