// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetSensorReadingsHistoryItemNoiseResult
    {
        /// <summary>
        /// Ambient noise reading.
        /// </summary>
        public readonly Outputs.GetSensorReadingsHistoryItemNoiseAmbientResult Ambient;

        [OutputConstructor]
        private GetSensorReadingsHistoryItemNoiseResult(Outputs.GetSensorReadingsHistoryItemNoiseAmbientResult ambient)
        {
            Ambient = ambient;
        }
    }
}
