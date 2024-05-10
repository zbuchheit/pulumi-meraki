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
    public sealed class WebhooksPayloadTemplatesHeader
    {
        /// <summary>
        /// The name of the header attribute
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The value returned in the header attribute, in liquid template
        /// </summary>
        public readonly string? Template;

        [OutputConstructor]
        private WebhooksPayloadTemplatesHeader(
            string? name,

            string? template)
        {
            Name = name;
            Template = template;
        }
    }
}
