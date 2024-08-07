// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdminsTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdminsTagArgs Empty = new AdminsTagArgs();

    /**
     * Access level for the tag
     * 
     */
    @Import(name="access")
    private @Nullable Output<String> access;

    /**
     * @return Access level for the tag
     * 
     */
    public Optional<Output<String>> access() {
        return Optional.ofNullable(this.access);
    }

    /**
     * Tag value
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return Tag value
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private AdminsTagArgs() {}

    private AdminsTagArgs(AdminsTagArgs $) {
        this.access = $.access;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdminsTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdminsTagArgs $;

        public Builder() {
            $ = new AdminsTagArgs();
        }

        public Builder(AdminsTagArgs defaults) {
            $ = new AdminsTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param access Access level for the tag
         * 
         * @return builder
         * 
         */
        public Builder access(@Nullable Output<String> access) {
            $.access = access;
            return this;
        }

        /**
         * @param access Access level for the tag
         * 
         * @return builder
         * 
         */
        public Builder access(String access) {
            return access(Output.of(access));
        }

        /**
         * @param tag Tag value
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag Tag value
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public AdminsTagArgs build() {
            return $;
        }
    }

}
