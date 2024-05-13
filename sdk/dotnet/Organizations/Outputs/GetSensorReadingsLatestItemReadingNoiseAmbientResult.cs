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
    public sealed class GetSensorReadingsLatestItemReadingNoiseAmbientResult
    {
        /// <summary>
        /// Ambient noise reading in adjusted decibels.
        /// </summary>
        public readonly int Level;

        [OutputConstructor]
        private GetSensorReadingsLatestItemReadingNoiseAmbientResult(int level)
        {
            Level = level;
        }
    }
}