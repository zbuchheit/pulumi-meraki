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
    public sealed class GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferencePerformanceClassResult
    {
        /// <summary>
        /// Name of builtin performance class. Must be present when performanceClass type is 'builtin' and value must be one of: 'VoIP'
        /// </summary>
        public readonly string BuiltinPerformanceClassName;
        /// <summary>
        /// ID of created custom performance class, must be present when performanceClass type is "custom"
        /// </summary>
        public readonly string CustomPerformanceClassId;
        /// <summary>
        /// Type of this performance class. Must be one of: 'builtin' or 'custom'
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferencePerformanceClassResult(
            string builtinPerformanceClassName,

            string customPerformanceClassId,

            string type)
        {
            BuiltinPerformanceClassName = builtinPerformanceClassName;
            CustomPerformanceClassId = customPerformanceClassId;
            Type = type;
        }
    }
}
