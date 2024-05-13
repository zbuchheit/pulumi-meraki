// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSwitchAccessPoliciesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchAccessPoliciesArgs Empty = new GetSwitchAccessPoliciesArgs();

    /**
     * accessPolicyNumber path parameter. Access policy number
     * 
     */
    @Import(name="accessPolicyNumber")
    private @Nullable Output<String> accessPolicyNumber;

    /**
     * @return accessPolicyNumber path parameter. Access policy number
     * 
     */
    public Optional<Output<String>> accessPolicyNumber() {
        return Optional.ofNullable(this.accessPolicyNumber);
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

    private GetSwitchAccessPoliciesArgs() {}

    private GetSwitchAccessPoliciesArgs(GetSwitchAccessPoliciesArgs $) {
        this.accessPolicyNumber = $.accessPolicyNumber;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchAccessPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchAccessPoliciesArgs $;

        public Builder() {
            $ = new GetSwitchAccessPoliciesArgs();
        }

        public Builder(GetSwitchAccessPoliciesArgs defaults) {
            $ = new GetSwitchAccessPoliciesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicyNumber accessPolicyNumber path parameter. Access policy number
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyNumber(@Nullable Output<String> accessPolicyNumber) {
            $.accessPolicyNumber = accessPolicyNumber;
            return this;
        }

        /**
         * @param accessPolicyNumber accessPolicyNumber path parameter. Access policy number
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyNumber(String accessPolicyNumber) {
            return accessPolicyNumber(Output.of(accessPolicyNumber));
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

        public GetSwitchAccessPoliciesArgs build() {
            return $;
        }
    }

}