// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMerakiAuthUsersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMerakiAuthUsersArgs Empty = new GetMerakiAuthUsersArgs();

    /**
     * merakiAuthUserId path parameter. Meraki auth user ID
     * 
     */
    @Import(name="merakiAuthUserId")
    private @Nullable Output<String> merakiAuthUserId;

    /**
     * @return merakiAuthUserId path parameter. Meraki auth user ID
     * 
     */
    public Optional<Output<String>> merakiAuthUserId() {
        return Optional.ofNullable(this.merakiAuthUserId);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    private GetMerakiAuthUsersArgs() {}

    private GetMerakiAuthUsersArgs(GetMerakiAuthUsersArgs $) {
        this.merakiAuthUserId = $.merakiAuthUserId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMerakiAuthUsersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMerakiAuthUsersArgs $;

        public Builder() {
            $ = new GetMerakiAuthUsersArgs();
        }

        public Builder(GetMerakiAuthUsersArgs defaults) {
            $ = new GetMerakiAuthUsersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param merakiAuthUserId merakiAuthUserId path parameter. Meraki auth user ID
         * 
         * @return builder
         * 
         */
        public Builder merakiAuthUserId(@Nullable Output<String> merakiAuthUserId) {
            $.merakiAuthUserId = merakiAuthUserId;
            return this;
        }

        /**
         * @param merakiAuthUserId merakiAuthUserId path parameter. Meraki auth user ID
         * 
         * @return builder
         * 
         */
        public Builder merakiAuthUserId(String merakiAuthUserId) {
            return merakiAuthUserId(Output.of(merakiAuthUserId));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
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

        public GetMerakiAuthUsersArgs build() {
            return $;
        }
    }

}
