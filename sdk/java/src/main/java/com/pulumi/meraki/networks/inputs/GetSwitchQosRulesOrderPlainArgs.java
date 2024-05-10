// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSwitchQosRulesOrderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchQosRulesOrderPlainArgs Empty = new GetSwitchQosRulesOrderPlainArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * qosRuleId path parameter. Qos rule ID
     * 
     */
    @Import(name="qosRuleId")
    private @Nullable String qosRuleId;

    /**
     * @return qosRuleId path parameter. Qos rule ID
     * 
     */
    public Optional<String> qosRuleId() {
        return Optional.ofNullable(this.qosRuleId);
    }

    private GetSwitchQosRulesOrderPlainArgs() {}

    private GetSwitchQosRulesOrderPlainArgs(GetSwitchQosRulesOrderPlainArgs $) {
        this.networkId = $.networkId;
        this.qosRuleId = $.qosRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchQosRulesOrderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchQosRulesOrderPlainArgs $;

        public Builder() {
            $ = new GetSwitchQosRulesOrderPlainArgs();
        }

        public Builder(GetSwitchQosRulesOrderPlainArgs defaults) {
            $ = new GetSwitchQosRulesOrderPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable String networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param qosRuleId qosRuleId path parameter. Qos rule ID
         * 
         * @return builder
         * 
         */
        public Builder qosRuleId(@Nullable String qosRuleId) {
            $.qosRuleId = qosRuleId;
            return this;
        }

        public GetSwitchQosRulesOrderPlainArgs build() {
            return $;
        }
    }

}
