// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SmDevicesMoveParametersArgs : global::Pulumi.ResourceArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// The ids of the devices to be moved.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The new network to which the devices will be moved.
        /// </summary>
        [Input("newNetwork")]
        public Input<string>? NewNetwork { get; set; }

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// The scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags of the devices to be moved.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        [Input("serials")]
        private InputList<string>? _serials;

        /// <summary>
        /// The serials of the devices to be moved.
        /// </summary>
        public InputList<string> Serials
        {
            get => _serials ?? (_serials = new InputList<string>());
            set => _serials = value;
        }

        [Input("wifiMacs")]
        private InputList<string>? _wifiMacs;

        /// <summary>
        /// The wifiMacs of the devices to be moved.
        /// </summary>
        public InputList<string> WifiMacs
        {
            get => _wifiMacs ?? (_wifiMacs = new InputList<string>());
            set => _wifiMacs = value;
        }

        public SmDevicesMoveParametersArgs()
        {
        }
        public static new SmDevicesMoveParametersArgs Empty => new SmDevicesMoveParametersArgs();
    }
}