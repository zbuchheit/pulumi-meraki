// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdaptivePolicyPoliciesAclArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdaptivePolicyPoliciesAclArgs Empty = new AdaptivePolicyPoliciesAclArgs();

    /**
     * The ID of the adaptive policy ACL
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the adaptive policy ACL
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the adaptive policy ACL
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the adaptive policy ACL
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AdaptivePolicyPoliciesAclArgs() {}

    private AdaptivePolicyPoliciesAclArgs(AdaptivePolicyPoliciesAclArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdaptivePolicyPoliciesAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdaptivePolicyPoliciesAclArgs $;

        public Builder() {
            $ = new AdaptivePolicyPoliciesAclArgs();
        }

        public Builder(AdaptivePolicyPoliciesAclArgs defaults) {
            $ = new AdaptivePolicyPoliciesAclArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the adaptive policy ACL
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the adaptive policy ACL
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the adaptive policy ACL
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the adaptive policy ACL
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AdaptivePolicyPoliciesAclArgs build() {
            return $;
        }
    }

}