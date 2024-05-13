// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.LicensesRenewSeatsItemArgs;
import com.pulumi.meraki.organizations.inputs.LicensesRenewSeatsParametersArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicensesRenewSeatsState extends com.pulumi.resources.ResourceArgs {

    public static final LicensesRenewSeatsState Empty = new LicensesRenewSeatsState();

    @Import(name="item")
    private @Nullable Output<LicensesRenewSeatsItemArgs> item;

    public Optional<Output<LicensesRenewSeatsItemArgs>> item() {
        return Optional.ofNullable(this.item);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    @Import(name="parameters")
    private @Nullable Output<LicensesRenewSeatsParametersArgs> parameters;

    public Optional<Output<LicensesRenewSeatsParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private LicensesRenewSeatsState() {}

    private LicensesRenewSeatsState(LicensesRenewSeatsState $) {
        this.item = $.item;
        this.organizationId = $.organizationId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensesRenewSeatsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensesRenewSeatsState $;

        public Builder() {
            $ = new LicensesRenewSeatsState();
        }

        public Builder(LicensesRenewSeatsState defaults) {
            $ = new LicensesRenewSeatsState(Objects.requireNonNull(defaults));
        }

        public Builder item(@Nullable Output<LicensesRenewSeatsItemArgs> item) {
            $.item = item;
            return this;
        }

        public Builder item(LicensesRenewSeatsItemArgs item) {
            return item(Output.of(item));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
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

        public Builder parameters(@Nullable Output<LicensesRenewSeatsParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(LicensesRenewSeatsParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public LicensesRenewSeatsState build() {
            return $;
        }
    }

}