// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsDeviceTypeGroupPoliciesDeviceTypePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The device policy. Can be one of 'Allowed', 'Blocked' or 'Group policy'
        /// </summary>
        [Input("devicePolicy")]
        public Input<string>? DevicePolicy { get; set; }

        /// <summary>
        /// The device type. Can be one of 'Android', 'BlackBerry', 'Chrome OS', 'iPad', 'iPhone', 'iPod', 'Mac OS X', 'Windows', 'Windows Phone', 'B&amp;N Nook' or 'Other OS'
        /// </summary>
        [Input("deviceType")]
        public Input<string>? DeviceType { get; set; }

        /// <summary>
        /// ID of the group policy object.
        /// </summary>
        [Input("groupPolicyId")]
        public Input<int>? GroupPolicyId { get; set; }

        public WirelessSsidsDeviceTypeGroupPoliciesDeviceTypePolicyGetArgs()
        {
        }
        public static new WirelessSsidsDeviceTypeGroupPoliciesDeviceTypePolicyGetArgs Empty => new WirelessSsidsDeviceTypeGroupPoliciesDeviceTypePolicyGetArgs();
    }
}
