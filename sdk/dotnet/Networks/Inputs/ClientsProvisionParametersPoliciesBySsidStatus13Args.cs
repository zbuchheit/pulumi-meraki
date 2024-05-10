// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ClientsProvisionParametersPoliciesBySsidStatus13Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The policy to apply to the specified client. Can be 'Allowed', 'Blocked', 'Normal' or 'Group policy'. Required.
        /// </summary>
        [Input("devicePolicy")]
        public Input<string>? DevicePolicy { get; set; }

        /// <summary>
        /// The ID of the desired group policy to apply to the client. Required if 'devicePolicy' is set to "Group policy". Otherwise this is ignored.
        /// </summary>
        [Input("groupPolicyId")]
        public Input<string>? GroupPolicyId { get; set; }

        public ClientsProvisionParametersPoliciesBySsidStatus13Args()
        {
        }
        public static new ClientsProvisionParametersPoliciesBySsidStatus13Args Empty => new ClientsProvisionParametersPoliciesBySsidStatus13Args();
    }
}
