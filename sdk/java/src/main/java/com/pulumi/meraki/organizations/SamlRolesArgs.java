// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.inputs.SamlRolesNetworkArgs;
import com.pulumi.meraki.organizations.inputs.SamlRolesTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SamlRolesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SamlRolesArgs Empty = new SamlRolesArgs();

    /**
     * The list of networks that the SAML administrator has privileges on
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<SamlRolesNetworkArgs>> networks;

    /**
     * @return The list of networks that the SAML administrator has privileges on
     * 
     */
    public Optional<Output<List<SamlRolesNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * The privilege of the SAML administrator on the organization
     * 
     */
    @Import(name="orgAccess")
    private @Nullable Output<String> orgAccess;

    /**
     * @return The privilege of the SAML administrator on the organization
     * 
     */
    public Optional<Output<String>> orgAccess() {
        return Optional.ofNullable(this.orgAccess);
    }

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

    /**
     * The role of the SAML administrator
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role of the SAML administrator
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * samlRoleId path parameter. Saml role ID
     * 
     */
    @Import(name="samlRoleId")
    private @Nullable Output<String> samlRoleId;

    /**
     * @return samlRoleId path parameter. Saml role ID
     * 
     */
    public Optional<Output<String>> samlRoleId() {
        return Optional.ofNullable(this.samlRoleId);
    }

    /**
     * The list of tags that the SAML administrator has privleges on
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<SamlRolesTagArgs>> tags;

    /**
     * @return The list of tags that the SAML administrator has privleges on
     * 
     */
    public Optional<Output<List<SamlRolesTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SamlRolesArgs() {}

    private SamlRolesArgs(SamlRolesArgs $) {
        this.networks = $.networks;
        this.orgAccess = $.orgAccess;
        this.organizationId = $.organizationId;
        this.role = $.role;
        this.samlRoleId = $.samlRoleId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SamlRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SamlRolesArgs $;

        public Builder() {
            $ = new SamlRolesArgs();
        }

        public Builder(SamlRolesArgs defaults) {
            $ = new SamlRolesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networks The list of networks that the SAML administrator has privileges on
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<SamlRolesNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks The list of networks that the SAML administrator has privileges on
         * 
         * @return builder
         * 
         */
        public Builder networks(List<SamlRolesNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks The list of networks that the SAML administrator has privileges on
         * 
         * @return builder
         * 
         */
        public Builder networks(SamlRolesNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param orgAccess The privilege of the SAML administrator on the organization
         * 
         * @return builder
         * 
         */
        public Builder orgAccess(@Nullable Output<String> orgAccess) {
            $.orgAccess = orgAccess;
            return this;
        }

        /**
         * @param orgAccess The privilege of the SAML administrator on the organization
         * 
         * @return builder
         * 
         */
        public Builder orgAccess(String orgAccess) {
            return orgAccess(Output.of(orgAccess));
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

        /**
         * @param role The role of the SAML administrator
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role of the SAML administrator
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param samlRoleId samlRoleId path parameter. Saml role ID
         * 
         * @return builder
         * 
         */
        public Builder samlRoleId(@Nullable Output<String> samlRoleId) {
            $.samlRoleId = samlRoleId;
            return this;
        }

        /**
         * @param samlRoleId samlRoleId path parameter. Saml role ID
         * 
         * @return builder
         * 
         */
        public Builder samlRoleId(String samlRoleId) {
            return samlRoleId(Output.of(samlRoleId));
        }

        /**
         * @param tags The list of tags that the SAML administrator has privleges on
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<SamlRolesTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The list of tags that the SAML administrator has privleges on
         * 
         * @return builder
         * 
         */
        public Builder tags(List<SamlRolesTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The list of tags that the SAML administrator has privleges on
         * 
         * @return builder
         * 
         */
        public Builder tags(SamlRolesTagArgs... tags) {
            return tags(List.of(tags));
        }

        public SamlRolesArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("SamlRolesArgs", "organizationId");
            }
            return $;
        }
    }

}
