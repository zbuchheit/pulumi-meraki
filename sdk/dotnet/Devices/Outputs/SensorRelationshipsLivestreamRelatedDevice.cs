// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class SensorRelationshipsLivestreamRelatedDevice
    {
        /// <summary>
        /// The product type of the related device
        /// </summary>
        public readonly string? ProductType;
        /// <summary>
        /// The serial of the related device
        /// </summary>
        public readonly string? Serial;

        [OutputConstructor]
        private SensorRelationshipsLivestreamRelatedDevice(
            string? productType,

            string? serial)
        {
            ProductType = productType;
            Serial = serial;
        }
    }
}
