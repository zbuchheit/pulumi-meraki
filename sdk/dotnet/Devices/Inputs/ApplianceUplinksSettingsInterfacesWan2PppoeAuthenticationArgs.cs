// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether PPPoE authentication is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for PPPoE authentication. This parameter is not returned.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Username for PPPoE authentication.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs()
        {
        }
        public static new ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs Empty => new ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs();
    }
}
