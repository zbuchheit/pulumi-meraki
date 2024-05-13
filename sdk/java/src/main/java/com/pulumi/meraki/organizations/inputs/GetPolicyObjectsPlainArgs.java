// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyObjectsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyObjectsPlainArgs Empty = new GetPolicyObjectsPlainArgs();

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
    @Import(name="organizationId")
    private @Nullable String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 10 5000. Default is 5000.
     * 
     */
    @Import(name="perPage")
    private @Nullable Integer perPage;

    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 10 5000. Default is 5000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * policyObjectId path parameter. Policy object ID
     * 
     */
    @Import(name="policyObjectId")
    private @Nullable String policyObjectId;

    /**
     * @return policyObjectId path parameter. Policy object ID
     * 
     */
    public Optional<String> policyObjectId() {
        return Optional.ofNullable(this.policyObjectId);
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

    private GetPolicyObjectsPlainArgs() {}

    private GetPolicyObjectsPlainArgs(GetPolicyObjectsPlainArgs $) {
        this.endingBefore = $.endingBefore;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.policyObjectId = $.policyObjectId;
        this.startingAfter = $.startingAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyObjectsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyObjectsPlainArgs $;

        public Builder() {
            $ = new GetPolicyObjectsPlainArgs();
        }

        public Builder(GetPolicyObjectsPlainArgs defaults) {
            $ = new GetPolicyObjectsPlainArgs(Objects.requireNonNull(defaults));
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
        public Builder organizationId(@Nullable String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 10 5000. Default is 5000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Integer perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param policyObjectId policyObjectId path parameter. Policy object ID
         * 
         * @return builder
         * 
         */
        public Builder policyObjectId(@Nullable String policyObjectId) {
            $.policyObjectId = policyObjectId;
            return this;
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

        public GetPolicyObjectsPlainArgs build() {
            return $;
        }
    }

}