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
    ///     var example = new Meraki.Devices.Base("example", new()
    ///     {
    ///         Lat = 37.4180951010362,
    ///         Lng = -122.098531723022,
    ///         Name = "My AP",
    ///         Serial = "string",
    ///         Tags = new[]
    ///         {
    ///             "recently-added",
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiDevicesExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:devices/base:base example "organization_id,serial"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:devices/base:base")]
    public partial class Base : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Physical address of the device
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// Additional device information
        /// </summary>
        [Output("details")]
        public Output<ImmutableArray<Outputs.BaseDetail>> Details { get; private set; } = null!;

        /// <summary>
        /// Firmware version of the device
        /// </summary>
        [Output("firmware")]
        public Output<string> Firmware { get; private set; } = null!;

        /// <summary>
        /// The floor plan to associate to this device. null disassociates the device from the floorplan.
        /// </summary>
        [Output("floorPlanId")]
        public Output<string> FloorPlanId { get; private set; } = null!;

        /// <summary>
        /// IMEI of the device, if applicable
        /// </summary>
        [Output("imei")]
        public Output<string> Imei { get; private set; } = null!;

        /// <summary>
        /// LAN IP address of the device
        /// </summary>
        [Output("lanIp")]
        public Output<string> LanIp { get; private set; } = null!;

        /// <summary>
        /// Latitude of the device
        /// </summary>
        [Output("lat")]
        public Output<double> Lat { get; private set; } = null!;

        /// <summary>
        /// Longitude of the device
        /// </summary>
        [Output("lng")]
        public Output<double> Lng { get; private set; } = null!;

        /// <summary>
        /// MAC address of the device
        /// </summary>
        [Output("mac")]
        public Output<string> Mac { get; private set; } = null!;

        /// <summary>
        /// Model of the device
        /// </summary>
        [Output("model")]
        public Output<string> Model { get; private set; } = null!;

        /// <summary>
        /// Whether or not to set the latitude and longitude of a device based on the new address. Only applies when lat and lng are not specified.
        /// </summary>
        [Output("moveMapMarker")]
        public Output<bool> MoveMapMarker { get; private set; } = null!;

        /// <summary>
        /// Name of the device
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// ID of the network the device belongs to
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// Notes for the device, limited to 255 characters
        /// </summary>
        [Output("notes")]
        public Output<string> Notes { get; private set; } = null!;

        /// <summary>
        /// Product type of the device
        /// </summary>
        [Output("productType")]
        public Output<string> ProductType { get; private set; } = null!;

        /// <summary>
        /// Serial number of the device
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;

        /// <summary>
        /// The ID of a switch template to bind to the device (for available switch templates, see the 'Switch Templates' endpoint). Use null to unbind the switch device from the current profile. For a device to be bindable to a switch template, it must (1) be a switch, and (2) belong to a network that is bound to a configuration template.
        /// </summary>
        [Output("switchProfileId")]
        public Output<string> SwitchProfileId { get; private set; } = null!;

        /// <summary>
        /// List of tags assigned to the device
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Base resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Base(string name, BaseArgs args, CustomResourceOptions? options = null)
            : base("meraki:devices/base:base", name, args ?? new BaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Base(string name, Input<string> id, BaseState? state = null, CustomResourceOptions? options = null)
            : base("meraki:devices/base:base", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Base resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Base Get(string name, Input<string> id, BaseState? state = null, CustomResourceOptions? options = null)
        {
            return new Base(name, id, state, options);
        }
    }

    public sealed class BaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Physical address of the device
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The floor plan to associate to this device. null disassociates the device from the floorplan.
        /// </summary>
        [Input("floorPlanId")]
        public Input<string>? FloorPlanId { get; set; }

        /// <summary>
        /// Latitude of the device
        /// </summary>
        [Input("lat")]
        public Input<double>? Lat { get; set; }

        /// <summary>
        /// Longitude of the device
        /// </summary>
        [Input("lng")]
        public Input<double>? Lng { get; set; }

        /// <summary>
        /// Whether or not to set the latitude and longitude of a device based on the new address. Only applies when lat and lng are not specified.
        /// </summary>
        [Input("moveMapMarker")]
        public Input<bool>? MoveMapMarker { get; set; }

        /// <summary>
        /// Name of the device
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Notes for the device, limited to 255 characters
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// Serial number of the device
        /// </summary>
        [Input("serial", required: true)]
        public Input<string> Serial { get; set; } = null!;

        /// <summary>
        /// The ID of a switch template to bind to the device (for available switch templates, see the 'Switch Templates' endpoint). Use null to unbind the switch device from the current profile. For a device to be bindable to a switch template, it must (1) be a switch, and (2) belong to a network that is bound to a configuration template.
        /// </summary>
        [Input("switchProfileId")]
        public Input<string>? SwitchProfileId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// List of tags assigned to the device
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public BaseArgs()
        {
        }
        public static new BaseArgs Empty => new BaseArgs();
    }

    public sealed class BaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Physical address of the device
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        [Input("details")]
        private InputList<Inputs.BaseDetailGetArgs>? _details;

        /// <summary>
        /// Additional device information
        /// </summary>
        public InputList<Inputs.BaseDetailGetArgs> Details
        {
            get => _details ?? (_details = new InputList<Inputs.BaseDetailGetArgs>());
            set => _details = value;
        }

        /// <summary>
        /// Firmware version of the device
        /// </summary>
        [Input("firmware")]
        public Input<string>? Firmware { get; set; }

        /// <summary>
        /// The floor plan to associate to this device. null disassociates the device from the floorplan.
        /// </summary>
        [Input("floorPlanId")]
        public Input<string>? FloorPlanId { get; set; }

        /// <summary>
        /// IMEI of the device, if applicable
        /// </summary>
        [Input("imei")]
        public Input<string>? Imei { get; set; }

        /// <summary>
        /// LAN IP address of the device
        /// </summary>
        [Input("lanIp")]
        public Input<string>? LanIp { get; set; }

        /// <summary>
        /// Latitude of the device
        /// </summary>
        [Input("lat")]
        public Input<double>? Lat { get; set; }

        /// <summary>
        /// Longitude of the device
        /// </summary>
        [Input("lng")]
        public Input<double>? Lng { get; set; }

        /// <summary>
        /// MAC address of the device
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        /// <summary>
        /// Model of the device
        /// </summary>
        [Input("model")]
        public Input<string>? Model { get; set; }

        /// <summary>
        /// Whether or not to set the latitude and longitude of a device based on the new address. Only applies when lat and lng are not specified.
        /// </summary>
        [Input("moveMapMarker")]
        public Input<bool>? MoveMapMarker { get; set; }

        /// <summary>
        /// Name of the device
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the network the device belongs to
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Notes for the device, limited to 255 characters
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// Product type of the device
        /// </summary>
        [Input("productType")]
        public Input<string>? ProductType { get; set; }

        /// <summary>
        /// Serial number of the device
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        /// <summary>
        /// The ID of a switch template to bind to the device (for available switch templates, see the 'Switch Templates' endpoint). Use null to unbind the switch device from the current profile. For a device to be bindable to a switch template, it must (1) be a switch, and (2) belong to a network that is bound to a configuration template.
        /// </summary>
        [Input("switchProfileId")]
        public Input<string>? SwitchProfileId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// List of tags assigned to the device
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public BaseState()
        {
        }
        public static new BaseState Empty => new BaseState();
    }
}
