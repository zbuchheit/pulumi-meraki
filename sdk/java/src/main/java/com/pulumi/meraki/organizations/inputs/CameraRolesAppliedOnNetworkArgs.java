// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CameraRolesAppliedOnNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final CameraRolesAppliedOnNetworkArgs Empty = new CameraRolesAppliedOnNetworkArgs();

    /**
     * Network id.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Network id.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="permissionLevel")
    private @Nullable Output<String> permissionLevel;

    public Optional<Output<String>> permissionLevel() {
        return Optional.ofNullable(this.permissionLevel);
    }

    @Import(name="permissionScope")
    private @Nullable Output<String> permissionScope;

    public Optional<Output<String>> permissionScope() {
        return Optional.ofNullable(this.permissionScope);
    }

    /**
     * Permission scope id
     * 
     */
    @Import(name="permissionScopeId")
    private @Nullable Output<String> permissionScopeId;

    /**
     * @return Permission scope id
     * 
     */
    public Optional<Output<String>> permissionScopeId() {
        return Optional.ofNullable(this.permissionScopeId);
    }

    /**
     * Network tag
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return Network tag
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private CameraRolesAppliedOnNetworkArgs() {}

    private CameraRolesAppliedOnNetworkArgs(CameraRolesAppliedOnNetworkArgs $) {
        this.id = $.id;
        this.permissionLevel = $.permissionLevel;
        this.permissionScope = $.permissionScope;
        this.permissionScopeId = $.permissionScopeId;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CameraRolesAppliedOnNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CameraRolesAppliedOnNetworkArgs $;

        public Builder() {
            $ = new CameraRolesAppliedOnNetworkArgs();
        }

        public Builder(CameraRolesAppliedOnNetworkArgs defaults) {
            $ = new CameraRolesAppliedOnNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Network id.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Network id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder permissionLevel(@Nullable Output<String> permissionLevel) {
            $.permissionLevel = permissionLevel;
            return this;
        }

        public Builder permissionLevel(String permissionLevel) {
            return permissionLevel(Output.of(permissionLevel));
        }

        public Builder permissionScope(@Nullable Output<String> permissionScope) {
            $.permissionScope = permissionScope;
            return this;
        }

        public Builder permissionScope(String permissionScope) {
            return permissionScope(Output.of(permissionScope));
        }

        /**
         * @param permissionScopeId Permission scope id
         * 
         * @return builder
         * 
         */
        public Builder permissionScopeId(@Nullable Output<String> permissionScopeId) {
            $.permissionScopeId = permissionScopeId;
            return this;
        }

        /**
         * @param permissionScopeId Permission scope id
         * 
         * @return builder
         * 
         */
        public Builder permissionScopeId(String permissionScopeId) {
            return permissionScopeId(Output.of(permissionScopeId));
        }

        /**
         * @param tag Network tag
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag Network tag
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public CameraRolesAppliedOnNetworkArgs build() {
            return $;
        }
    }

}
