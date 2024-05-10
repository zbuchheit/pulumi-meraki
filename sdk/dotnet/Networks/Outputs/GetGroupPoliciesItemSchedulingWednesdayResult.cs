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
    public sealed class GetGroupPoliciesItemSchedulingWednesdayResult
    {
        /// <summary>
        /// Whether the schedule is active (true) or inactive (false) during the time specified between 'from' and 'to'. Defaults to true.
        /// </summary>
        public readonly bool Active;
        /// <summary>
        /// The time, from '00:00' to '24:00'. Must be less than the time specified in 'to'. Defaults to '00:00'. Only 30 minute increments are allowed.
        /// </summary>
        public readonly string From;
        /// <summary>
        /// The time, from '00:00' to '24:00'. Must be greater than the time specified in 'from'. Defaults to '24:00'. Only 30 minute increments are allowed.
        /// </summary>
        public readonly string To;

        [OutputConstructor]
        private GetGroupPoliciesItemSchedulingWednesdayResult(
            bool active,

            string from,

            string to)
        {
            Active = active;
            From = from;
            To = to;
        }
    }
}
