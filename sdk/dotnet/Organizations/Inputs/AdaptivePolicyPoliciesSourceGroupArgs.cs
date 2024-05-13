// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class AdaptivePolicyPoliciesSourceGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the source adaptive policy group
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the source adaptive policy group
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The SGT of the source adaptive policy group
        /// </summary>
        [Input("sgt")]
        public Input<int>? Sgt { get; set; }

        public AdaptivePolicyPoliciesSourceGroupArgs()
        {
        }
        public static new AdaptivePolicyPoliciesSourceGroupArgs Empty => new AdaptivePolicyPoliciesSourceGroupArgs();
    }
}