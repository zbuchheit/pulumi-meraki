// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.SnmpUserArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnmpArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnmpArgs Empty = new SnmpArgs();

    /**
     * The type of SNMP access. Can be one of &#39;none&#39; (disabled), &#39;community&#39; (V1/V2c), or &#39;users&#39; (V3).
     * 
     */
    @Import(name="access")
    private @Nullable Output<String> access;

    /**
     * @return The type of SNMP access. Can be one of &#39;none&#39; (disabled), &#39;community&#39; (V1/V2c), or &#39;users&#39; (V3).
     * 
     */
    public Optional<Output<String>> access() {
        return Optional.ofNullable(this.access);
    }

    /**
     * SNMP community string if access is &#39;community&#39;.
     * 
     */
    @Import(name="communityString")
    private @Nullable Output<String> communityString;

    /**
     * @return SNMP community string if access is &#39;community&#39;.
     * 
     */
    public Optional<Output<String>> communityString() {
        return Optional.ofNullable(this.communityString);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    /**
     * SNMP settings if access is &#39;users&#39;.
     * 
     */
    @Import(name="users")
    private @Nullable Output<List<SnmpUserArgs>> users;

    /**
     * @return SNMP settings if access is &#39;users&#39;.
     * 
     */
    public Optional<Output<List<SnmpUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private SnmpArgs() {}

    private SnmpArgs(SnmpArgs $) {
        this.access = $.access;
        this.communityString = $.communityString;
        this.networkId = $.networkId;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnmpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnmpArgs $;

        public Builder() {
            $ = new SnmpArgs();
        }

        public Builder(SnmpArgs defaults) {
            $ = new SnmpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param access The type of SNMP access. Can be one of &#39;none&#39; (disabled), &#39;community&#39; (V1/V2c), or &#39;users&#39; (V3).
         * 
         * @return builder
         * 
         */
        public Builder access(@Nullable Output<String> access) {
            $.access = access;
            return this;
        }

        /**
         * @param access The type of SNMP access. Can be one of &#39;none&#39; (disabled), &#39;community&#39; (V1/V2c), or &#39;users&#39; (V3).
         * 
         * @return builder
         * 
         */
        public Builder access(String access) {
            return access(Output.of(access));
        }

        /**
         * @param communityString SNMP community string if access is &#39;community&#39;.
         * 
         * @return builder
         * 
         */
        public Builder communityString(@Nullable Output<String> communityString) {
            $.communityString = communityString;
            return this;
        }

        /**
         * @param communityString SNMP community string if access is &#39;community&#39;.
         * 
         * @return builder
         * 
         */
        public Builder communityString(String communityString) {
            return communityString(Output.of(communityString));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param users SNMP settings if access is &#39;users&#39;.
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<List<SnmpUserArgs>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users SNMP settings if access is &#39;users&#39;.
         * 
         * @return builder
         * 
         */
        public Builder users(List<SnmpUserArgs> users) {
            return users(Output.of(users));
        }

        /**
         * @param users SNMP settings if access is &#39;users&#39;.
         * 
         * @return builder
         * 
         */
        public Builder users(SnmpUserArgs... users) {
            return users(List.of(users));
        }

        public SnmpArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SnmpArgs", "networkId");
            }
            return $;
        }
    }

}