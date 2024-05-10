// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetSwitchAccessPoliciesItemResult
    {
        /// <summary>
        /// Access Type of the policy. Automatically 'Hybrid authentication' when hostMode is 'Multi-Domain'.
        /// </summary>
        public readonly string AccessPolicyType;
        /// <summary>
        /// Counts associated with the access policy
        /// </summary>
        public readonly Outputs.GetSwitchAccessPoliciesItemCountsResult Counts;
        /// <summary>
        /// 802.1x Settings
        /// </summary>
        public readonly Outputs.GetSwitchAccessPoliciesItemDot1xResult Dot1x;
        /// <summary>
        /// If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
        /// </summary>
        public readonly bool GuestPortBouncing;
        /// <summary>
        /// ID for the guest VLAN allow unauthorized devices access to limited network resources
        /// </summary>
        public readonly int GuestVlanId;
        /// <summary>
        /// Choose the Host Mode for the access policy.
        /// </summary>
        public readonly string HostMode;
        /// <summary>
        /// Enabling this option will make switches execute 802.1X and MAC-bypass authentication simultaneously so that clients authenticate faster. Only required when accessPolicyType is 'Hybrid Authentication.
        /// </summary>
        public readonly bool IncreaseAccessSpeed;
        /// <summary>
        /// Name of the access policy
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Object for RADIUS Settings
        /// </summary>
        public readonly Outputs.GetSwitchAccessPoliciesItemRadiusResult Radius;
        /// <summary>
        /// Enable to send start, interim-update and stop messages to a configured RADIUS accounting server for tracking connected clients
        /// </summary>
        public readonly bool RadiusAccountingEnabled;
        /// <summary>
        /// List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchAccessPoliciesItemRadiusAccountingServerResult> RadiusAccountingServers;
        /// <summary>
        /// Change of authentication for RADIUS re-authentication and disconnection
        /// </summary>
        public readonly bool RadiusCoaSupportEnabled;
        /// <summary>
        /// Acceptable values are *''* for None, or *'11'* for Group Policies ACL
        /// </summary>
        public readonly string RadiusGroupAttribute;
        /// <summary>
        /// List of RADIUS servers to require connecting devices to authenticate against before granting network access
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchAccessPoliciesItemRadiusServerResult> RadiusServers;
        /// <summary>
        /// If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
        /// </summary>
        public readonly bool RadiusTestingEnabled;
        /// <summary>
        /// Enable to restrict access for clients to a response_objectific set of IP addresses or hostnames prior to authentication
        /// </summary>
        public readonly bool UrlRedirectWalledGardenEnabled;
        /// <summary>
        /// IP address ranges, in CIDR notation, to restrict access for clients to a specific set of IP addresses or hostnames prior to authentication
        /// </summary>
        public readonly ImmutableArray<string> UrlRedirectWalledGardenRanges;
        /// <summary>
        /// CDP/LLDP capable voice clients will be able to use this VLAN. Automatically true when hostMode is 'Multi-Domain'.
        /// </summary>
        public readonly bool VoiceVlanClients;

        [OutputConstructor]
        private GetSwitchAccessPoliciesItemResult(
            string accessPolicyType,

            Outputs.GetSwitchAccessPoliciesItemCountsResult counts,

            Outputs.GetSwitchAccessPoliciesItemDot1xResult dot1x,

            bool guestPortBouncing,

            int guestVlanId,

            string hostMode,

            bool increaseAccessSpeed,

            string name,

            Outputs.GetSwitchAccessPoliciesItemRadiusResult radius,

            bool radiusAccountingEnabled,

            ImmutableArray<Outputs.GetSwitchAccessPoliciesItemRadiusAccountingServerResult> radiusAccountingServers,

            bool radiusCoaSupportEnabled,

            string radiusGroupAttribute,

            ImmutableArray<Outputs.GetSwitchAccessPoliciesItemRadiusServerResult> radiusServers,

            bool radiusTestingEnabled,

            bool urlRedirectWalledGardenEnabled,

            ImmutableArray<string> urlRedirectWalledGardenRanges,

            bool voiceVlanClients)
        {
            AccessPolicyType = accessPolicyType;
            Counts = counts;
            Dot1x = dot1x;
            GuestPortBouncing = guestPortBouncing;
            GuestVlanId = guestVlanId;
            HostMode = hostMode;
            IncreaseAccessSpeed = increaseAccessSpeed;
            Name = name;
            Radius = radius;
            RadiusAccountingEnabled = radiusAccountingEnabled;
            RadiusAccountingServers = radiusAccountingServers;
            RadiusCoaSupportEnabled = radiusCoaSupportEnabled;
            RadiusGroupAttribute = radiusGroupAttribute;
            RadiusServers = radiusServers;
            RadiusTestingEnabled = radiusTestingEnabled;
            UrlRedirectWalledGardenEnabled = urlRedirectWalledGardenEnabled;
            UrlRedirectWalledGardenRanges = urlRedirectWalledGardenRanges;
            VoiceVlanClients = voiceVlanClients;
        }
    }
}
