// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCameraPermissionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCameraPermissionsArgs Empty = new GetCameraPermissionsArgs();

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
     * permissionScopeId path parameter. Permission scope ID
     * 
     */
    @Import(name="permissionScopeId", required=true)
    private Output<String> permissionScopeId;

    /**
     * @return permissionScopeId path parameter. Permission scope ID
     * 
     */
    public Output<String> permissionScopeId() {
        return this.permissionScopeId;
    }

    private GetCameraPermissionsArgs() {}

    private GetCameraPermissionsArgs(GetCameraPermissionsArgs $) {
        this.organizationId = $.organizationId;
        this.permissionScopeId = $.permissionScopeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCameraPermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCameraPermissionsArgs $;

        public Builder() {
            $ = new GetCameraPermissionsArgs();
        }

        public Builder(GetCameraPermissionsArgs defaults) {
            $ = new GetCameraPermissionsArgs(Objects.requireNonNull(defaults));
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
         * @param permissionScopeId permissionScopeId path parameter. Permission scope ID
         * 
         * @return builder
         * 
         */
        public Builder permissionScopeId(Output<String> permissionScopeId) {
            $.permissionScopeId = permissionScopeId;
            return this;
        }

        /**
         * @param permissionScopeId permissionScopeId path parameter. Permission scope ID
         * 
         * @return builder
         * 
         */
        public Builder permissionScopeId(String permissionScopeId) {
            return permissionScopeId(Output.of(permissionScopeId));
        }

        public GetCameraPermissionsArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetCameraPermissionsArgs", "organizationId");
            }
            if ($.permissionScopeId == null) {
                throw new MissingRequiredPropertyException("GetCameraPermissionsArgs", "permissionScopeId");
            }
            return $;
        }
    }

}
