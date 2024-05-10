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
    public sealed class GetWirelessSettingsItemRegulatoryDomainResult
    {
        /// <summary>
        /// The country code of the regulatory domain.
        /// </summary>
        public readonly string CountryCode;
        /// <summary>
        /// The name of the regulatory domain for this network.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Whether or not the regulatory domain for this network permits Wifi 6E.
        /// </summary>
        public readonly bool Permits6e;

        [OutputConstructor]
        private GetWirelessSettingsItemRegulatoryDomainResult(
            string countryCode,

            string name,

            bool permits6e)
        {
            CountryCode = countryCode;
            Name = name;
            Permits6e = permits6e;
        }
    }
}
