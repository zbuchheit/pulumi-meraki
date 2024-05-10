// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class AdaptivePolicyPoliciesAclGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the adaptive policy ACL
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the adaptive policy ACL
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AdaptivePolicyPoliciesAclGetArgs()
        {
        }
        public static new AdaptivePolicyPoliciesAclGetArgs Empty => new AdaptivePolicyPoliciesAclGetArgs();
    }
}
