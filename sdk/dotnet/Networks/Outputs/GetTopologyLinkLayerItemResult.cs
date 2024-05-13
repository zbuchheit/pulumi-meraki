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
    public sealed class GetTopologyLinkLayerItemResult
    {
        public readonly ImmutableArray<string> Errors;
        public readonly ImmutableArray<Outputs.GetTopologyLinkLayerItemLinkResult> Links;
        public readonly ImmutableArray<Outputs.GetTopologyLinkLayerItemNodeResult> Nodes;

        [OutputConstructor]
        private GetTopologyLinkLayerItemResult(
            ImmutableArray<string> errors,

            ImmutableArray<Outputs.GetTopologyLinkLayerItemLinkResult> links,

            ImmutableArray<Outputs.GetTopologyLinkLayerItemNodeResult> nodes)
        {
            Errors = errors;
            Links = links;
            Nodes = nodes;
        }
    }
}