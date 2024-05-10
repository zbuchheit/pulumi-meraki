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
    public sealed class GetSensorReadingsHistoryItemHumidityResult
    {
        /// <summary>
        /// Humidity reading in %RH.
        /// </summary>
        public readonly int RelativePercentage;

        [OutputConstructor]
        private GetSensorReadingsHistoryItemHumidityResult(int relativePercentage)
        {
            RelativePercentage = relativePercentage;
        }
    }
}
