// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetLicensesOverviewArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLicensesOverviewArgs Empty = new GetLicensesOverviewArgs();

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetLicensesOverviewArgs() {}

    private GetLicensesOverviewArgs(GetLicensesOverviewArgs $) {
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLicensesOverviewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLicensesOverviewArgs $;

        public Builder() {
            $ = new GetLicensesOverviewArgs();
        }

        public Builder(GetLicensesOverviewArgs defaults) {
            $ = new GetLicensesOverviewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetLicensesOverviewArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetLicensesOverviewArgs", "organizationId");
            }
            return $;
        }
    }

}
