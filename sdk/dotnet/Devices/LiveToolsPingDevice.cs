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
    /// ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
    /// already existed previously.
    /// 
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
    ///     var example = new Meraki.Devices.LiveToolsPingDevice("example", new()
    ///     {
    ///         Serial = "string",
    ///         Parameters = new Meraki.Devices.Inputs.LiveToolsPingDeviceParametersArgs
    ///         {
    ///             Callback = new Meraki.Devices.Inputs.LiveToolsPingDeviceParametersCallbackArgs
    ///             {
    ///                 HttpServer = new Meraki.Devices.Inputs.LiveToolsPingDeviceParametersCallbackHttpServerArgs
    ///                 {
    ///                     Id = "aHR0cHM6Ly93d3cuZXhhbXBsZS5jb20vd2ViaG9va3M=",
    ///                 },
    ///                 PayloadTemplate = new Meraki.Devices.Inputs.LiveToolsPingDeviceParametersCallbackPayloadTemplateArgs
    ///                 {
    ///                     Id = "wpt_2100",
    ///                 },
    ///                 SharedSecret = "secret",
    ///                 Url = "https://webhook.site/28efa24e-f830-4d9f-a12b-fbb9e5035031",
    ///             },
    ///             Count = 3,
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiDevicesLiveToolsPingDeviceExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:devices/liveToolsPingDevice:LiveToolsPingDevice example "id,serial"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:devices/liveToolsPingDevice:LiveToolsPingDevice")]
    public partial class LiveToolsPingDevice : global::Pulumi.CustomResource
    {
        [Output("item")]
        public Output<Outputs.LiveToolsPingDeviceItem> Item { get; private set; } = null!;

        [Output("parameters")]
        public Output<Outputs.LiveToolsPingDeviceParameters> Parameters { get; private set; } = null!;

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;


        /// <summary>
        /// Create a LiveToolsPingDevice resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LiveToolsPingDevice(string name, LiveToolsPingDeviceArgs args, CustomResourceOptions? options = null)
            : base("meraki:devices/liveToolsPingDevice:LiveToolsPingDevice", name, args ?? new LiveToolsPingDeviceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LiveToolsPingDevice(string name, Input<string> id, LiveToolsPingDeviceState? state = null, CustomResourceOptions? options = null)
            : base("meraki:devices/liveToolsPingDevice:LiveToolsPingDevice", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LiveToolsPingDevice resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LiveToolsPingDevice Get(string name, Input<string> id, LiveToolsPingDeviceState? state = null, CustomResourceOptions? options = null)
        {
            return new LiveToolsPingDevice(name, id, state, options);
        }
    }

    public sealed class LiveToolsPingDeviceArgs : global::Pulumi.ResourceArgs
    {
        [Input("parameters", required: true)]
        public Input<Inputs.LiveToolsPingDeviceParametersArgs> Parameters { get; set; } = null!;

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public Input<string> Serial { get; set; } = null!;

        public LiveToolsPingDeviceArgs()
        {
        }
        public static new LiveToolsPingDeviceArgs Empty => new LiveToolsPingDeviceArgs();
    }

    public sealed class LiveToolsPingDeviceState : global::Pulumi.ResourceArgs
    {
        [Input("item")]
        public Input<Inputs.LiveToolsPingDeviceItemGetArgs>? Item { get; set; }

        [Input("parameters")]
        public Input<Inputs.LiveToolsPingDeviceParametersGetArgs>? Parameters { get; set; }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        public LiveToolsPingDeviceState()
        {
        }
        public static new LiveToolsPingDeviceState Empty => new LiveToolsPingDeviceState();
    }
}
