// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSmBypassActivationLockAttemptsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmBypassActivationLockAttemptsPlainArgs Empty = new GetSmBypassActivationLockAttemptsPlainArgs();

    /**
     * attemptId path parameter. Attempt ID
     * 
     */
    @Import(name="attemptId", required=true)
    private String attemptId;

    /**
     * @return attemptId path parameter. Attempt ID
     * 
     */
    public String attemptId() {
        return this.attemptId;
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    private GetSmBypassActivationLockAttemptsPlainArgs() {}

    private GetSmBypassActivationLockAttemptsPlainArgs(GetSmBypassActivationLockAttemptsPlainArgs $) {
        this.attemptId = $.attemptId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmBypassActivationLockAttemptsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmBypassActivationLockAttemptsPlainArgs $;

        public Builder() {
            $ = new GetSmBypassActivationLockAttemptsPlainArgs();
        }

        public Builder(GetSmBypassActivationLockAttemptsPlainArgs defaults) {
            $ = new GetSmBypassActivationLockAttemptsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attemptId attemptId path parameter. Attempt ID
         * 
         * @return builder
         * 
         */
        public Builder attemptId(String attemptId) {
            $.attemptId = attemptId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            $.networkId = networkId;
            return this;
        }

        public GetSmBypassActivationLockAttemptsPlainArgs build() {
            if ($.attemptId == null) {
                throw new MissingRequiredPropertyException("GetSmBypassActivationLockAttemptsPlainArgs", "attemptId");
            }
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSmBypassActivationLockAttemptsPlainArgs", "networkId");
            }
            return $;
        }
    }

}
