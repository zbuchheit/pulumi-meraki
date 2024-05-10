// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ClientsSplashAuthorizationStatusSsidsStatus8Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// New authorization status for the SSID (true, false).
        /// </summary>
        [Input("isAuthorized")]
        public Input<bool>? IsAuthorized { get; set; }

        public ClientsSplashAuthorizationStatusSsidsStatus8Args()
        {
        }
        public static new ClientsSplashAuthorizationStatusSsidsStatus8Args Empty => new ClientsSplashAuthorizationStatusSsidsStatus8Args();
    }
}
