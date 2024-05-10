// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCameraPermissionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCameraPermissionsPlainArgs Empty = new GetCameraPermissionsPlainArgs();

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
     * permissionScopeId path parameter. Permission scope ID
     * 
     */
    @Import(name="permissionScopeId", required=true)
    private String permissionScopeId;

    /**
     * @return permissionScopeId path parameter. Permission scope ID
     * 
     */
    public String permissionScopeId() {
        return this.permissionScopeId;
    }

    private GetCameraPermissionsPlainArgs() {}

    private GetCameraPermissionsPlainArgs(GetCameraPermissionsPlainArgs $) {
        this.organizationId = $.organizationId;
        this.permissionScopeId = $.permissionScopeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCameraPermissionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCameraPermissionsPlainArgs $;

        public Builder() {
            $ = new GetCameraPermissionsPlainArgs();
        }

        public Builder(GetCameraPermissionsPlainArgs defaults) {
            $ = new GetCameraPermissionsPlainArgs(Objects.requireNonNull(defaults));
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
         * @param permissionScopeId permissionScopeId path parameter. Permission scope ID
         * 
         * @return builder
         * 
         */
        public Builder permissionScopeId(String permissionScopeId) {
            $.permissionScopeId = permissionScopeId;
            return this;
        }

        public GetCameraPermissionsPlainArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetCameraPermissionsPlainArgs", "organizationId");
            }
            if ($.permissionScopeId == null) {
                throw new MissingRequiredPropertyException("GetCameraPermissionsPlainArgs", "permissionScopeId");
            }
            return $;
        }
    }

}
