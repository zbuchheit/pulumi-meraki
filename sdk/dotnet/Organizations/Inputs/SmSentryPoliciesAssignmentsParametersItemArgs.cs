// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class SmSentryPoliciesAssignmentsParametersItemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Id of the Network
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        [Input("policies")]
        private InputList<Inputs.SmSentryPoliciesAssignmentsParametersItemPolicyArgs>? _policies;

        /// <summary>
        /// Array of Sentry Group Policies for the Network
        /// </summary>
        public InputList<Inputs.SmSentryPoliciesAssignmentsParametersItemPolicyArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.SmSentryPoliciesAssignmentsParametersItemPolicyArgs>());
            set => _policies = value;
        }

        public SmSentryPoliciesAssignmentsParametersItemArgs()
        {
        }
        public static new SmSentryPoliciesAssignmentsParametersItemArgs Empty => new SmSentryPoliciesAssignmentsParametersItemArgs();
    }
}
