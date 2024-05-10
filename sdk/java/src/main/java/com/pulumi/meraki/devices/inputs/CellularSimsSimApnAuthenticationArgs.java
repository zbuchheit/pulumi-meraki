// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CellularSimsSimApnAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CellularSimsSimApnAuthenticationArgs Empty = new CellularSimsSimApnAuthenticationArgs();

    /**
     * APN password, if type is set (if APN password is not supplied, the password is left unchanged).
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return APN password, if type is set (if APN password is not supplied, the password is left unchanged).
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * APN auth type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return APN auth type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * APN username, if type is set.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return APN username, if type is set.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private CellularSimsSimApnAuthenticationArgs() {}

    private CellularSimsSimApnAuthenticationArgs(CellularSimsSimApnAuthenticationArgs $) {
        this.password = $.password;
        this.type = $.type;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellularSimsSimApnAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellularSimsSimApnAuthenticationArgs $;

        public Builder() {
            $ = new CellularSimsSimApnAuthenticationArgs();
        }

        public Builder(CellularSimsSimApnAuthenticationArgs defaults) {
            $ = new CellularSimsSimApnAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password APN password, if type is set (if APN password is not supplied, the password is left unchanged).
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password APN password, if type is set (if APN password is not supplied, the password is left unchanged).
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param type APN auth type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type APN auth type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param username APN username, if type is set.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username APN username, if type is set.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public CellularSimsSimApnAuthenticationArgs build() {
            return $;
        }
    }

}
