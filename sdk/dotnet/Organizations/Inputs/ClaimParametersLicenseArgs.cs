// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class ClaimParametersLicenseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The key of the license
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Either 'renew' or 'addDevices'. 'addDevices' will increase the license limit, while 'renew' will extend the amount of time until expiration. Defaults to 'addDevices'. All licenses must be claimed with the same mode, and at most one renewal can be claimed at a time. This parameter is legacy and does not apply to organizations with per-device licensing enabled.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        public ClaimParametersLicenseArgs()
        {
        }
        public static new ClaimParametersLicenseArgs Empty => new ClaimParametersLicenseArgs();
    }
}
