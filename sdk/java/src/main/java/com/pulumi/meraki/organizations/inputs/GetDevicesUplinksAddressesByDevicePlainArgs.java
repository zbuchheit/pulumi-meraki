// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDevicesUplinksAddressesByDevicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDevicesUplinksAddressesByDevicePlainArgs Empty = new GetDevicesUplinksAddressesByDevicePlainArgs();

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
     * networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
     * 
     */
    @Import(name="networkIds")
    private @Nullable List<String> networkIds;

    /**
     * @return networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
     * 
     */
    public Optional<List<String>> networkIds() {
        return Optional.ofNullable(this.networkIds);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
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
     * productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
     * 
     */
    @Import(name="productTypes")
    private @Nullable List<String> productTypes;

    /**
     * @return productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
     * 
     */
    public Optional<List<String>> productTypes() {
        return Optional.ofNullable(this.productTypes);
    }

    /**
     * serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
     * 
     */
    @Import(name="serials")
    private @Nullable List<String> serials;

    /**
     * @return serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
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
     * tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, &#39;tagsFilterType&#39; should also be included (see below). This filter uses multiple exact matches.
     * 
     */
    @Import(name="tags")
    private @Nullable List<String> tags;

    /**
     * @return tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, &#39;tagsFilterType&#39; should also be included (see below). This filter uses multiple exact matches.
     * 
     */
    public Optional<List<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * tagsFilterType query parameter. An optional parameter of value &#39;withAnyTags&#39; or &#39;withAllTags&#39; to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, &#39;withAnyTags&#39; will be selected.
     * 
     */
    @Import(name="tagsFilterType")
    private @Nullable String tagsFilterType;

    /**
     * @return tagsFilterType query parameter. An optional parameter of value &#39;withAnyTags&#39; or &#39;withAllTags&#39; to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, &#39;withAnyTags&#39; will be selected.
     * 
     */
    public Optional<String> tagsFilterType() {
        return Optional.ofNullable(this.tagsFilterType);
    }

    private GetDevicesUplinksAddressesByDevicePlainArgs() {}

    private GetDevicesUplinksAddressesByDevicePlainArgs(GetDevicesUplinksAddressesByDevicePlainArgs $) {
        this.endingBefore = $.endingBefore;
        this.networkIds = $.networkIds;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.productTypes = $.productTypes;
        this.serials = $.serials;
        this.startingAfter = $.startingAfter;
        this.tags = $.tags;
        this.tagsFilterType = $.tagsFilterType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDevicesUplinksAddressesByDevicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDevicesUplinksAddressesByDevicePlainArgs $;

        public Builder() {
            $ = new GetDevicesUplinksAddressesByDevicePlainArgs();
        }

        public Builder(GetDevicesUplinksAddressesByDevicePlainArgs defaults) {
            $ = new GetDevicesUplinksAddressesByDevicePlainArgs(Objects.requireNonNull(defaults));
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
         * @param networkIds networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
         * 
         * @return builder
         * 
         */
        public Builder networkIds(@Nullable List<String> networkIds) {
            $.networkIds = networkIds;
            return this;
        }

        /**
         * @param networkIds networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
         * 
         * @return builder
         * 
         */
        public Builder networkIds(String... networkIds) {
            return networkIds(List.of(networkIds));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
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
         * @param productTypes productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
         * 
         * @return builder
         * 
         */
        public Builder productTypes(@Nullable List<String> productTypes) {
            $.productTypes = productTypes;
            return this;
        }

        /**
         * @param productTypes productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
         * 
         * @return builder
         * 
         */
        public Builder productTypes(String... productTypes) {
            return productTypes(List.of(productTypes));
        }

        /**
         * @param serials serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
         * 
         * @return builder
         * 
         */
        public Builder serials(@Nullable List<String> serials) {
            $.serials = serials;
            return this;
        }

        /**
         * @param serials serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
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
         * @param tags tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, &#39;tagsFilterType&#39; should also be included (see below). This filter uses multiple exact matches.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, &#39;tagsFilterType&#39; should also be included (see below). This filter uses multiple exact matches.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param tagsFilterType tagsFilterType query parameter. An optional parameter of value &#39;withAnyTags&#39; or &#39;withAllTags&#39; to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, &#39;withAnyTags&#39; will be selected.
         * 
         * @return builder
         * 
         */
        public Builder tagsFilterType(@Nullable String tagsFilterType) {
            $.tagsFilterType = tagsFilterType;
            return this;
        }

        public GetDevicesUplinksAddressesByDevicePlainArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetDevicesUplinksAddressesByDevicePlainArgs", "organizationId");
            }
            return $;
        }
    }

}
