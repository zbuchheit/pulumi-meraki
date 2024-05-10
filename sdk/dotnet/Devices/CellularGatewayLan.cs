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
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Meraki = Pulumi.Meraki;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Meraki.Devices.CellularGatewayLan("example", new()
    ///     {
    ///         FixedIpAssignments = new[]
    ///         {
    ///             new Meraki.Devices.Inputs.CellularGatewayLanFixedIpAssignmentArgs
    ///             {
    ///                 Ip = "192.168.0.10",
    ///                 Mac = "0b:00:00:00:00:ac",
    ///                 Name = "server 1",
    ///             },
    ///         },
    ///         ReservedIpRanges = new[]
    ///         {
    ///             new Meraki.Devices.Inputs.CellularGatewayLanReservedIpRangeArgs
    ///             {
    ///                 Comment = "A reserved IP range",
    ///                 End = "192.168.1.1",
    ///                 Start = "192.168.1.0",
    ///             },
    ///         },
    ///         Serial = "string",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiDevicesCellularGatewayLanExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:devices/cellularGatewayLan:CellularGatewayLan example "serial"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:devices/cellularGatewayLan:CellularGatewayLan")]
    public partial class CellularGatewayLan : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Lan IP of the MG
        /// </summary>
        [Output("deviceLanIp")]
        public Output<string> DeviceLanIp { get; private set; } = null!;

        /// <summary>
        /// Name of the MG.
        /// </summary>
        [Output("deviceName")]
        public Output<string> DeviceName { get; private set; } = null!;

        /// <summary>
        /// Subnet configuration of the MG.
        /// </summary>
        [Output("deviceSubnet")]
        public Output<string> DeviceSubnet { get; private set; } = null!;

        /// <summary>
        /// list of all fixed IP assignments for a single MG
        /// </summary>
        [Output("fixedIpAssignments")]
        public Output<ImmutableArray<Outputs.CellularGatewayLanFixedIpAssignment>> FixedIpAssignments { get; private set; } = null!;

        /// <summary>
        /// list of all reserved IP ranges for a single MG
        /// </summary>
        [Output("reservedIpRanges")]
        public Output<ImmutableArray<Outputs.CellularGatewayLanReservedIpRange>> ReservedIpRanges { get; private set; } = null!;

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;


        /// <summary>
        /// Create a CellularGatewayLan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CellularGatewayLan(string name, CellularGatewayLanArgs args, CustomResourceOptions? options = null)
            : base("meraki:devices/cellularGatewayLan:CellularGatewayLan", name, args ?? new CellularGatewayLanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CellularGatewayLan(string name, Input<string> id, CellularGatewayLanState? state = null, CustomResourceOptions? options = null)
            : base("meraki:devices/cellularGatewayLan:CellularGatewayLan", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CellularGatewayLan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CellularGatewayLan Get(string name, Input<string> id, CellularGatewayLanState? state = null, CustomResourceOptions? options = null)
        {
            return new CellularGatewayLan(name, id, state, options);
        }
    }

    public sealed class CellularGatewayLanArgs : global::Pulumi.ResourceArgs
    {
        [Input("fixedIpAssignments")]
        private InputList<Inputs.CellularGatewayLanFixedIpAssignmentArgs>? _fixedIpAssignments;

        /// <summary>
        /// list of all fixed IP assignments for a single MG
        /// </summary>
        public InputList<Inputs.CellularGatewayLanFixedIpAssignmentArgs> FixedIpAssignments
        {
            get => _fixedIpAssignments ?? (_fixedIpAssignments = new InputList<Inputs.CellularGatewayLanFixedIpAssignmentArgs>());
            set => _fixedIpAssignments = value;
        }

        [Input("reservedIpRanges")]
        private InputList<Inputs.CellularGatewayLanReservedIpRangeArgs>? _reservedIpRanges;

        /// <summary>
        /// list of all reserved IP ranges for a single MG
        /// </summary>
        public InputList<Inputs.CellularGatewayLanReservedIpRangeArgs> ReservedIpRanges
        {
            get => _reservedIpRanges ?? (_reservedIpRanges = new InputList<Inputs.CellularGatewayLanReservedIpRangeArgs>());
            set => _reservedIpRanges = value;
        }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public Input<string> Serial { get; set; } = null!;

        public CellularGatewayLanArgs()
        {
        }
        public static new CellularGatewayLanArgs Empty => new CellularGatewayLanArgs();
    }

    public sealed class CellularGatewayLanState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Lan IP of the MG
        /// </summary>
        [Input("deviceLanIp")]
        public Input<string>? DeviceLanIp { get; set; }

        /// <summary>
        /// Name of the MG.
        /// </summary>
        [Input("deviceName")]
        public Input<string>? DeviceName { get; set; }

        /// <summary>
        /// Subnet configuration of the MG.
        /// </summary>
        [Input("deviceSubnet")]
        public Input<string>? DeviceSubnet { get; set; }

        [Input("fixedIpAssignments")]
        private InputList<Inputs.CellularGatewayLanFixedIpAssignmentGetArgs>? _fixedIpAssignments;

        /// <summary>
        /// list of all fixed IP assignments for a single MG
        /// </summary>
        public InputList<Inputs.CellularGatewayLanFixedIpAssignmentGetArgs> FixedIpAssignments
        {
            get => _fixedIpAssignments ?? (_fixedIpAssignments = new InputList<Inputs.CellularGatewayLanFixedIpAssignmentGetArgs>());
            set => _fixedIpAssignments = value;
        }

        [Input("reservedIpRanges")]
        private InputList<Inputs.CellularGatewayLanReservedIpRangeGetArgs>? _reservedIpRanges;

        /// <summary>
        /// list of all reserved IP ranges for a single MG
        /// </summary>
        public InputList<Inputs.CellularGatewayLanReservedIpRangeGetArgs> ReservedIpRanges
        {
            get => _reservedIpRanges ?? (_reservedIpRanges = new InputList<Inputs.CellularGatewayLanReservedIpRangeGetArgs>());
            set => _reservedIpRanges = value;
        }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        public CellularGatewayLanState()
        {
        }
        public static new CellularGatewayLanState Empty => new CellularGatewayLanState();
    }
}
