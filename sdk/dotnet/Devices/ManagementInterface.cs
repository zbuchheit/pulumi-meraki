// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:devices/managementInterface:ManagementInterface example "serial"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:devices/managementInterface:ManagementInterface")]
    public partial class ManagementInterface : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Dynamic DNS hostnames.
        /// </summary>
        [Output("ddnsHostnames")]
        public Output<Outputs.ManagementInterfaceDdnsHostnames> DdnsHostnames { get; private set; } = null!;

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;

        /// <summary>
        /// WAN 1 settings
        /// </summary>
        [Output("wan1")]
        public Output<Outputs.ManagementInterfaceWan1> Wan1 { get; private set; } = null!;

        /// <summary>
        /// WAN 2 settings (only for MX devices)
        /// </summary>
        [Output("wan2")]
        public Output<Outputs.ManagementInterfaceWan2> Wan2 { get; private set; } = null!;


        /// <summary>
        /// Create a ManagementInterface resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagementInterface(string name, ManagementInterfaceArgs args, CustomResourceOptions? options = null)
            : base("meraki:devices/managementInterface:ManagementInterface", name, args ?? new ManagementInterfaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagementInterface(string name, Input<string> id, ManagementInterfaceState? state = null, CustomResourceOptions? options = null)
            : base("meraki:devices/managementInterface:ManagementInterface", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-meraki",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ManagementInterface resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagementInterface Get(string name, Input<string> id, ManagementInterfaceState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagementInterface(name, id, state, options);
        }
    }

    public sealed class ManagementInterfaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public Input<string> Serial { get; set; } = null!;

        /// <summary>
        /// WAN 1 settings
        /// </summary>
        [Input("wan1")]
        public Input<Inputs.ManagementInterfaceWan1Args>? Wan1 { get; set; }

        /// <summary>
        /// WAN 2 settings (only for MX devices)
        /// </summary>
        [Input("wan2")]
        public Input<Inputs.ManagementInterfaceWan2Args>? Wan2 { get; set; }

        public ManagementInterfaceArgs()
        {
        }
        public static new ManagementInterfaceArgs Empty => new ManagementInterfaceArgs();
    }

    public sealed class ManagementInterfaceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Dynamic DNS hostnames.
        /// </summary>
        [Input("ddnsHostnames")]
        public Input<Inputs.ManagementInterfaceDdnsHostnamesGetArgs>? DdnsHostnames { get; set; }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        /// <summary>
        /// WAN 1 settings
        /// </summary>
        [Input("wan1")]
        public Input<Inputs.ManagementInterfaceWan1GetArgs>? Wan1 { get; set; }

        /// <summary>
        /// WAN 2 settings (only for MX devices)
        /// </summary>
        [Input("wan2")]
        public Input<Inputs.ManagementInterfaceWan2GetArgs>? Wan2 { get; set; }

        public ManagementInterfaceState()
        {
        }
        public static new ManagementInterfaceState Empty => new ManagementInterfaceState();
    }
}
