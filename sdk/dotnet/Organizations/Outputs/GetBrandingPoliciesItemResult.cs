// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetBrandingPoliciesItemResult
    {
        /// <summary>
        /// Settings for describing which kinds of admins this policy applies to.
        /// </summary>
        public readonly Outputs.GetBrandingPoliciesItemAdminSettingsResult AdminSettings;
        /// <summary>
        /// Properties describing the custom logo attached to the branding policy.
        /// </summary>
        public readonly Outputs.GetBrandingPoliciesItemCustomLogoResult CustomLogo;
        /// <summary>
        /// Boolean indicating whether this policy is enabled.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Settings for describing the modifications to various Help page features. Each property in this object accepts one of
        ///   'default or inherit' (do not modify functionality), 'hide' (remove the section from Dashboard), or 'show' (always show
        ///   the section on Dashboard). Some properties in this object also accept custom HTML used to replace the section on
        ///   Dashboard; see the documentation for each property to see the allowed values.
        /// </summary>
        public readonly Outputs.GetBrandingPoliciesItemHelpSettingsResult HelpSettings;
        /// <summary>
        /// Name of the Dashboard branding policy.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetBrandingPoliciesItemResult(
            Outputs.GetBrandingPoliciesItemAdminSettingsResult adminSettings,

            Outputs.GetBrandingPoliciesItemCustomLogoResult customLogo,

            bool enabled,

            Outputs.GetBrandingPoliciesItemHelpSettingsResult helpSettings,

            string name)
        {
            AdminSettings = adminSettings;
            CustomLogo = customLogo;
            Enabled = enabled;
            HelpSettings = helpSettings;
            Name = name;
        }
    }
}