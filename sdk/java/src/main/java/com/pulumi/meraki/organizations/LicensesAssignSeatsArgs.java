// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.inputs.LicensesAssignSeatsParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class LicensesAssignSeatsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicensesAssignSeatsArgs Empty = new LicensesAssignSeatsArgs();

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

    @Import(name="parameters", required=true)
    private Output<LicensesAssignSeatsParametersArgs> parameters;

    public Output<LicensesAssignSeatsParametersArgs> parameters() {
        return this.parameters;
    }

    private LicensesAssignSeatsArgs() {}

    private LicensesAssignSeatsArgs(LicensesAssignSeatsArgs $) {
        this.organizationId = $.organizationId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensesAssignSeatsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensesAssignSeatsArgs $;

        public Builder() {
            $ = new LicensesAssignSeatsArgs();
        }

        public Builder(LicensesAssignSeatsArgs defaults) {
            $ = new LicensesAssignSeatsArgs(Objects.requireNonNull(defaults));
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

        public Builder parameters(Output<LicensesAssignSeatsParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(LicensesAssignSeatsParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public LicensesAssignSeatsArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("LicensesAssignSeatsArgs", "organizationId");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("LicensesAssignSeatsArgs", "parameters");
            }
            return $;
        }
    }

}
