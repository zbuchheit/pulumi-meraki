// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsOauthArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedDomains")]
        private InputList<string>? _allowedDomains;

        /// <summary>
        /// (Optional) The list of domains allowed access to the network.
        /// </summary>
        public InputList<string> AllowedDomains
        {
            get => _allowedDomains ?? (_allowedDomains = new InputList<string>());
            set => _allowedDomains = value;
        }

        public WirelessSsidsOauthArgs()
        {
        }
        public static new WirelessSsidsOauthArgs Empty => new WirelessSsidsOauthArgs();
    }
}
