// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class BrandingPoliciesHelpSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The 'Help &gt; API docs' subtab where a detailed description of the Dashboard API is listed. Can be one of
        ///   'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("apiDocsSubtab")]
        public Input<string>? ApiDocsSubtab { get; set; }

        /// <summary>
        /// The 'Help &gt; Cases' Dashboard subtab on which Cisco Meraki support cases for this organization can be managed. Can be one
        ///   of 'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("casesSubtab")]
        public Input<string>? CasesSubtab { get; set; }

        /// <summary>
        /// The 'Product Manuals' section of the 'Help &gt; Get Help' subtab. Can be one of 'default or inherit', 'hide', 'show', or a replacement custom HTML string.
        /// </summary>
        [Input("ciscoMerakiProductDocumentation")]
        public Input<string>? CiscoMerakiProductDocumentation { get; set; }

        /// <summary>
        /// The 'Help &gt; Community' subtab which provides a link to Meraki Community. Can be one of 'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("communitySubtab")]
        public Input<string>? CommunitySubtab { get; set; }

        /// <summary>
        /// The 'Help &gt; Data protection requests' Dashboard subtab on which requests to delete, restrict, or export end-user data can
        ///   be audited. Can be one of 'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("dataProtectionRequestsSubtab")]
        public Input<string>? DataProtectionRequestsSubtab { get; set; }

        /// <summary>
        /// The 'Help &gt; Firewall info' subtab where necessary upstream firewall rules for communication to the Cisco Meraki cloud are
        ///   listed. Can be one of 'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("firewallInfoSubtab")]
        public Input<string>? FirewallInfoSubtab { get; set; }

        /// <summary>
        /// The 'Help &gt; Get Help' subtab on which Cisco Meraki KB, Product Manuals, and Support/Case Information are displayed. Note
        ///   that if this subtab is hidden, branding customizations for the KB on 'Get help', Cisco Meraki product documentation,
        ///   and support contact info will not be visible. Can be one of 'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("getHelpSubtab")]
        public Input<string>? GetHelpSubtab { get; set; }

        /// <summary>
        /// The KB search box which appears on the Help page. Can be one of 'default or inherit', 'hide', 'show', or a replacement custom HTML string.
        /// </summary>
        [Input("getHelpSubtabKnowledgeBaseSearch")]
        public Input<string>? GetHelpSubtabKnowledgeBaseSearch { get; set; }

        /// <summary>
        /// The 'Help &gt; Replacement info' subtab where important information regarding device replacements is detailed. Can be one of
        ///   'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("hardwareReplacementsSubtab")]
        public Input<string>? HardwareReplacementsSubtab { get; set; }

        /// <summary>
        /// The Help tab, under which all support information resides. If this tab is hidden, no other 'Help' branding
        ///   customizations will be visible. Can be one of 'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("helpTab")]
        public Input<string>? HelpTab { get; set; }

        /// <summary>
        /// The 'Help Widget' is a support widget which provides access to live chat, documentation links, Sales contact info,
        ///   and other contact avenues to reach Meraki Support. Can be one of 'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("helpWidget")]
        public Input<string>? HelpWidget { get; set; }

        /// <summary>
        /// The 'Help &gt; New features' subtab where new Dashboard features are detailed. Can be one of 'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("newFeaturesSubtab")]
        public Input<string>? NewFeaturesSubtab { get; set; }

        /// <summary>
        /// The 'SM Forums' subtab which links to community-based support for Cisco Meraki Systems Manager. Only configurable for
        ///   organizations that contain Systems Manager networks. Can be one of 'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("smForums")]
        public Input<string>? SmForums { get; set; }

        /// <summary>
        /// The 'Contact Meraki Support' section of the 'Help &gt; Get Help' subtab. Can be one of 'default or inherit', 'hide', 'show', or a replacement custom HTML string.
        /// </summary>
        [Input("supportContactInfo")]
        public Input<string>? SupportContactInfo { get; set; }

        /// <summary>
        /// The universal search box always visible on Dashboard will, by default, present results from the Meraki KB. This configures
        ///   whether these Meraki KB results should be returned. Can be one of 'default or inherit', 'hide' or 'show'.
        /// </summary>
        [Input("universalSearchKnowledgeBaseSearch")]
        public Input<string>? UniversalSearchKnowledgeBaseSearch { get; set; }

        public BrandingPoliciesHelpSettingsGetArgs()
        {
        }
        public static new BrandingPoliciesHelpSettingsGetArgs Empty => new BrandingPoliciesHelpSettingsGetArgs();
    }
}
