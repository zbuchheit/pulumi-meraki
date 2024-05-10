// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices
{
    public static class GetApplianceUplinksSettings
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
        ///     var example = Meraki.Devices.GetApplianceUplinksSettings.Invoke(new()
        ///     {
        ///         Serial = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiDevicesApplianceUplinksSettingsExample"] = example.Apply(getApplianceUplinksSettingsResult =&gt; getApplianceUplinksSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplianceUplinksSettingsResult> InvokeAsync(GetApplianceUplinksSettingsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplianceUplinksSettingsResult>("meraki:devices/getApplianceUplinksSettings:getApplianceUplinksSettings", args ?? new GetApplianceUplinksSettingsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Devices.GetApplianceUplinksSettings.Invoke(new()
        ///     {
        ///         Serial = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiDevicesApplianceUplinksSettingsExample"] = example.Apply(getApplianceUplinksSettingsResult =&gt; getApplianceUplinksSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceUplinksSettingsResult> Invoke(GetApplianceUplinksSettingsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceUplinksSettingsResult>("meraki:devices/getApplianceUplinksSettings:getApplianceUplinksSettings", args ?? new GetApplianceUplinksSettingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplianceUplinksSettingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public string Serial { get; set; } = null!;

        public GetApplianceUplinksSettingsArgs()
        {
        }
        public static new GetApplianceUplinksSettingsArgs Empty => new GetApplianceUplinksSettingsArgs();
    }

    public sealed class GetApplianceUplinksSettingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public Input<string> Serial { get; set; } = null!;

        public GetApplianceUplinksSettingsInvokeArgs()
        {
        }
        public static new GetApplianceUplinksSettingsInvokeArgs Empty => new GetApplianceUplinksSettingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplianceUplinksSettingsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetApplianceUplinksSettingsItemResult Item;
        /// <summary>
        /// serial path parameter.
        /// </summary>
        public readonly string Serial;

        [OutputConstructor]
        private GetApplianceUplinksSettingsResult(
            string id,

            Outputs.GetApplianceUplinksSettingsItemResult item,

            string serial)
        {
            Id = id;
            Item = item;
            Serial = serial;
        }
    }
}
