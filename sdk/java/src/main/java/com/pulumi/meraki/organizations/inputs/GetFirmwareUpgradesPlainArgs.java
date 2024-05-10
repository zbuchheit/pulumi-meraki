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


public final class GetFirmwareUpgradesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirmwareUpgradesPlainArgs Empty = new GetFirmwareUpgradesPlainArgs();

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
     * productTypes query parameter. Optional parameter to filter the upgrade by product type.
     * 
     */
    @Import(name="productTypes")
    private @Nullable List<String> productTypes;

    /**
     * @return productTypes query parameter. Optional parameter to filter the upgrade by product type.
     * 
     */
    public Optional<List<String>> productTypes() {
        return Optional.ofNullable(this.productTypes);
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
     * status query parameter. Optional parameter to filter the upgrade by status.
     * 
     */
    @Import(name="statuses")
    private @Nullable List<String> statuses;

    /**
     * @return status query parameter. Optional parameter to filter the upgrade by status.
     * 
     */
    public Optional<List<String>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    private GetFirmwareUpgradesPlainArgs() {}

    private GetFirmwareUpgradesPlainArgs(GetFirmwareUpgradesPlainArgs $) {
        this.endingBefore = $.endingBefore;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.productTypes = $.productTypes;
        this.startingAfter = $.startingAfter;
        this.statuses = $.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirmwareUpgradesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirmwareUpgradesPlainArgs $;

        public Builder() {
            $ = new GetFirmwareUpgradesPlainArgs();
        }

        public Builder(GetFirmwareUpgradesPlainArgs defaults) {
            $ = new GetFirmwareUpgradesPlainArgs(Objects.requireNonNull(defaults));
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
         * @param productTypes productTypes query parameter. Optional parameter to filter the upgrade by product type.
         * 
         * @return builder
         * 
         */
        public Builder productTypes(@Nullable List<String> productTypes) {
            $.productTypes = productTypes;
            return this;
        }

        /**
         * @param productTypes productTypes query parameter. Optional parameter to filter the upgrade by product type.
         * 
         * @return builder
         * 
         */
        public Builder productTypes(String... productTypes) {
            return productTypes(List.of(productTypes));
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
         * @param statuses status query parameter. Optional parameter to filter the upgrade by status.
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable List<String> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses status query parameter. Optional parameter to filter the upgrade by status.
         * 
         * @return builder
         * 
         */
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
        }

        public GetFirmwareUpgradesPlainArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetFirmwareUpgradesPlainArgs", "organizationId");
            }
            return $;
        }
    }

}
