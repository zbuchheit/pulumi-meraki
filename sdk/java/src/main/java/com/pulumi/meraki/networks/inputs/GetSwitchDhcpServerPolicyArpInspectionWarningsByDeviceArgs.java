// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs Empty = new GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs();

    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="endingBefore")
    private @Nullable Output<String> endingBefore;

    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<Output<String>> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
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
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    @Import(name="perPage")
    private @Nullable Output<Integer> perPage;

    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    public Optional<Output<Integer>> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="startingAfter")
    private @Nullable Output<String> startingAfter;

    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<Output<String>> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }

    private GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs() {}

    private GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs(GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs $) {
        this.endingBefore = $.endingBefore;
        this.networkId = $.networkId;
        this.perPage = $.perPage;
        this.startingAfter = $.startingAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs $;

        public Builder() {
            $ = new GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs();
        }

        public Builder(GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs defaults) {
            $ = new GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endingBefore endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder endingBefore(@Nullable Output<String> endingBefore) {
            $.endingBefore = endingBefore;
            return this;
        }

        /**
         * @param endingBefore endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder endingBefore(String endingBefore) {
            return endingBefore(Output.of(endingBefore));
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
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Output<Integer> perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(Integer perPage) {
            return perPage(Output.of(perPage));
        }

        /**
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(@Nullable Output<String> startingAfter) {
            $.startingAfter = startingAfter;
            return this;
        }

        /**
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(String startingAfter) {
            return startingAfter(Output.of(startingAfter));
        }

        public GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSwitchDhcpServerPolicyArpInspectionWarningsByDeviceArgs", "networkId");
            }
            return $;
        }
    }

}
