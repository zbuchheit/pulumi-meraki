// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class UsersArgs extends com.pulumi.resources.ResourceArgs {

    public static final UsersArgs Empty = new UsersArgs();

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
     * userId path parameter. User ID
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return userId path parameter. User ID
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private UsersArgs() {}

    private UsersArgs(UsersArgs $) {
        this.organizationId = $.organizationId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsersArgs $;

        public Builder() {
            $ = new UsersArgs();
        }

        public Builder(UsersArgs defaults) {
            $ = new UsersArgs(Objects.requireNonNull(defaults));
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
         * @param userId userId path parameter. User ID
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId userId path parameter. User ID
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UsersArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("UsersArgs", "organizationId");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("UsersArgs", "userId");
            }
            return $;
        }
    }

}
