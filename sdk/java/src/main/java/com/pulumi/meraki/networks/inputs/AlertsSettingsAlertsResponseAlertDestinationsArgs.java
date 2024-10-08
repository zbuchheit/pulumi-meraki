// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertsSettingsAlertsResponseAlertDestinationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertsSettingsAlertsResponseAlertDestinationsArgs Empty = new AlertsSettingsAlertsResponseAlertDestinationsArgs();

    /**
     * If true, then all network admins will receive emails for this alert
     * 
     */
    @Import(name="allAdmins")
    private @Nullable Output<Boolean> allAdmins;

    /**
     * @return If true, then all network admins will receive emails for this alert
     * 
     */
    public Optional<Output<Boolean>> allAdmins() {
        return Optional.ofNullable(this.allAdmins);
    }

    /**
     * A list of emails that will receive information about the alert
     * 
     */
    @Import(name="emails")
    private @Nullable Output<List<String>> emails;

    /**
     * @return A list of emails that will receive information about the alert
     * 
     */
    public Optional<Output<List<String>>> emails() {
        return Optional.ofNullable(this.emails);
    }

    /**
     * A list of HTTP server IDs to send a Webhook to for this alert
     * 
     */
    @Import(name="httpServerIds")
    private @Nullable Output<List<String>> httpServerIds;

    /**
     * @return A list of HTTP server IDs to send a Webhook to for this alert
     * 
     */
    public Optional<Output<List<String>>> httpServerIds() {
        return Optional.ofNullable(this.httpServerIds);
    }

    /**
     * If true, then an SNMP trap will be sent for this alert if there is an SNMP trap server configured for this network
     * 
     */
    @Import(name="snmp")
    private @Nullable Output<Boolean> snmp;

    /**
     * @return If true, then an SNMP trap will be sent for this alert if there is an SNMP trap server configured for this network
     * 
     */
    public Optional<Output<Boolean>> snmp() {
        return Optional.ofNullable(this.snmp);
    }

    private AlertsSettingsAlertsResponseAlertDestinationsArgs() {}

    private AlertsSettingsAlertsResponseAlertDestinationsArgs(AlertsSettingsAlertsResponseAlertDestinationsArgs $) {
        this.allAdmins = $.allAdmins;
        this.emails = $.emails;
        this.httpServerIds = $.httpServerIds;
        this.snmp = $.snmp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertsSettingsAlertsResponseAlertDestinationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertsSettingsAlertsResponseAlertDestinationsArgs $;

        public Builder() {
            $ = new AlertsSettingsAlertsResponseAlertDestinationsArgs();
        }

        public Builder(AlertsSettingsAlertsResponseAlertDestinationsArgs defaults) {
            $ = new AlertsSettingsAlertsResponseAlertDestinationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allAdmins If true, then all network admins will receive emails for this alert
         * 
         * @return builder
         * 
         */
        public Builder allAdmins(@Nullable Output<Boolean> allAdmins) {
            $.allAdmins = allAdmins;
            return this;
        }

        /**
         * @param allAdmins If true, then all network admins will receive emails for this alert
         * 
         * @return builder
         * 
         */
        public Builder allAdmins(Boolean allAdmins) {
            return allAdmins(Output.of(allAdmins));
        }

        /**
         * @param emails A list of emails that will receive information about the alert
         * 
         * @return builder
         * 
         */
        public Builder emails(@Nullable Output<List<String>> emails) {
            $.emails = emails;
            return this;
        }

        /**
         * @param emails A list of emails that will receive information about the alert
         * 
         * @return builder
         * 
         */
        public Builder emails(List<String> emails) {
            return emails(Output.of(emails));
        }

        /**
         * @param emails A list of emails that will receive information about the alert
         * 
         * @return builder
         * 
         */
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }

        /**
         * @param httpServerIds A list of HTTP server IDs to send a Webhook to for this alert
         * 
         * @return builder
         * 
         */
        public Builder httpServerIds(@Nullable Output<List<String>> httpServerIds) {
            $.httpServerIds = httpServerIds;
            return this;
        }

        /**
         * @param httpServerIds A list of HTTP server IDs to send a Webhook to for this alert
         * 
         * @return builder
         * 
         */
        public Builder httpServerIds(List<String> httpServerIds) {
            return httpServerIds(Output.of(httpServerIds));
        }

        /**
         * @param httpServerIds A list of HTTP server IDs to send a Webhook to for this alert
         * 
         * @return builder
         * 
         */
        public Builder httpServerIds(String... httpServerIds) {
            return httpServerIds(List.of(httpServerIds));
        }

        /**
         * @param snmp If true, then an SNMP trap will be sent for this alert if there is an SNMP trap server configured for this network
         * 
         * @return builder
         * 
         */
        public Builder snmp(@Nullable Output<Boolean> snmp) {
            $.snmp = snmp;
            return this;
        }

        /**
         * @param snmp If true, then an SNMP trap will be sent for this alert if there is an SNMP trap server configured for this network
         * 
         * @return builder
         * 
         */
        public Builder snmp(Boolean snmp) {
            return snmp(Output.of(snmp));
        }

        public AlertsSettingsAlertsResponseAlertDestinationsArgs build() {
            return $;
        }
    }

}
