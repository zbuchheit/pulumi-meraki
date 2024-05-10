// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.inputs.AlertsProfilesAlertConditionArgs;
import com.pulumi.meraki.organizations.inputs.AlertsProfilesRecipientsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertsProfilesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertsProfilesArgs Empty = new AlertsProfilesArgs();

    /**
     * The conditions that determine if the alert triggers
     * 
     */
    @Import(name="alertCondition")
    private @Nullable Output<AlertsProfilesAlertConditionArgs> alertCondition;

    /**
     * @return The conditions that determine if the alert triggers
     * 
     */
    public Optional<Output<AlertsProfilesAlertConditionArgs>> alertCondition() {
        return Optional.ofNullable(this.alertCondition);
    }

    /**
     * alertConfigId path parameter. Alert config ID
     * 
     */
    @Import(name="alertConfigId")
    private @Nullable Output<String> alertConfigId;

    /**
     * @return alertConfigId path parameter. Alert config ID
     * 
     */
    public Optional<Output<String>> alertConfigId() {
        return Optional.ofNullable(this.alertConfigId);
    }

    /**
     * User supplied description of the alert
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User supplied description of the alert
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Is the alert config enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is the alert config enabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Networks with these tags will be monitored for the alert
     * 
     */
    @Import(name="networkTags")
    private @Nullable Output<List<String>> networkTags;

    /**
     * @return Networks with these tags will be monitored for the alert
     * 
     */
    public Optional<Output<List<String>>> networkTags() {
        return Optional.ofNullable(this.networkTags);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * List of recipients that will recieve the alert.
     * 
     */
    @Import(name="recipients")
    private @Nullable Output<AlertsProfilesRecipientsArgs> recipients;

    /**
     * @return List of recipients that will recieve the alert.
     * 
     */
    public Optional<Output<AlertsProfilesRecipientsArgs>> recipients() {
        return Optional.ofNullable(this.recipients);
    }

    /**
     * The alert type
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The alert type
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AlertsProfilesArgs() {}

    private AlertsProfilesArgs(AlertsProfilesArgs $) {
        this.alertCondition = $.alertCondition;
        this.alertConfigId = $.alertConfigId;
        this.description = $.description;
        this.enabled = $.enabled;
        this.networkTags = $.networkTags;
        this.organizationId = $.organizationId;
        this.recipients = $.recipients;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertsProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertsProfilesArgs $;

        public Builder() {
            $ = new AlertsProfilesArgs();
        }

        public Builder(AlertsProfilesArgs defaults) {
            $ = new AlertsProfilesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertCondition The conditions that determine if the alert triggers
         * 
         * @return builder
         * 
         */
        public Builder alertCondition(@Nullable Output<AlertsProfilesAlertConditionArgs> alertCondition) {
            $.alertCondition = alertCondition;
            return this;
        }

        /**
         * @param alertCondition The conditions that determine if the alert triggers
         * 
         * @return builder
         * 
         */
        public Builder alertCondition(AlertsProfilesAlertConditionArgs alertCondition) {
            return alertCondition(Output.of(alertCondition));
        }

        /**
         * @param alertConfigId alertConfigId path parameter. Alert config ID
         * 
         * @return builder
         * 
         */
        public Builder alertConfigId(@Nullable Output<String> alertConfigId) {
            $.alertConfigId = alertConfigId;
            return this;
        }

        /**
         * @param alertConfigId alertConfigId path parameter. Alert config ID
         * 
         * @return builder
         * 
         */
        public Builder alertConfigId(String alertConfigId) {
            return alertConfigId(Output.of(alertConfigId));
        }

        /**
         * @param description User supplied description of the alert
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User supplied description of the alert
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Is the alert config enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the alert config enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param networkTags Networks with these tags will be monitored for the alert
         * 
         * @return builder
         * 
         */
        public Builder networkTags(@Nullable Output<List<String>> networkTags) {
            $.networkTags = networkTags;
            return this;
        }

        /**
         * @param networkTags Networks with these tags will be monitored for the alert
         * 
         * @return builder
         * 
         */
        public Builder networkTags(List<String> networkTags) {
            return networkTags(Output.of(networkTags));
        }

        /**
         * @param networkTags Networks with these tags will be monitored for the alert
         * 
         * @return builder
         * 
         */
        public Builder networkTags(String... networkTags) {
            return networkTags(List.of(networkTags));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param recipients List of recipients that will recieve the alert.
         * 
         * @return builder
         * 
         */
        public Builder recipients(@Nullable Output<AlertsProfilesRecipientsArgs> recipients) {
            $.recipients = recipients;
            return this;
        }

        /**
         * @param recipients List of recipients that will recieve the alert.
         * 
         * @return builder
         * 
         */
        public Builder recipients(AlertsProfilesRecipientsArgs recipients) {
            return recipients(Output.of(recipients));
        }

        /**
         * @param type The alert type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The alert type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AlertsProfilesArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("AlertsProfilesArgs", "organizationId");
            }
            return $;
        }
    }

}
