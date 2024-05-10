// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetWirelessDevicesPacketLossByDevice
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
        ///     var example = Meraki.Organizations.GetWirelessDevicesPacketLossByDevice.Invoke(new()
        ///     {
        ///         Bands = new[]
        ///         {
        ///             "string",
        ///         },
        ///         EndingBefore = "string",
        ///         NetworkIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         OrganizationId = "string",
        ///         PerPage = 1,
        ///         Serials = new[]
        ///         {
        ///             "string",
        ///         },
        ///         Ssids = new[]
        ///         {
        ///             "string",
        ///         },
        ///         StartingAfter = "string",
        ///         T0 = "string",
        ///         T1 = "string",
        ///         Timespan = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsWirelessDevicesPacketLossByDeviceExample"] = example.Apply(getWirelessDevicesPacketLossByDeviceResult =&gt; getWirelessDevicesPacketLossByDeviceResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetWirelessDevicesPacketLossByDeviceResult> InvokeAsync(GetWirelessDevicesPacketLossByDeviceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWirelessDevicesPacketLossByDeviceResult>("meraki:organizations/getWirelessDevicesPacketLossByDevice:getWirelessDevicesPacketLossByDevice", args ?? new GetWirelessDevicesPacketLossByDeviceArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Organizations.GetWirelessDevicesPacketLossByDevice.Invoke(new()
        ///     {
        ///         Bands = new[]
        ///         {
        ///             "string",
        ///         },
        ///         EndingBefore = "string",
        ///         NetworkIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         OrganizationId = "string",
        ///         PerPage = 1,
        ///         Serials = new[]
        ///         {
        ///             "string",
        ///         },
        ///         Ssids = new[]
        ///         {
        ///             "string",
        ///         },
        ///         StartingAfter = "string",
        ///         T0 = "string",
        ///         T1 = "string",
        ///         Timespan = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsWirelessDevicesPacketLossByDeviceExample"] = example.Apply(getWirelessDevicesPacketLossByDeviceResult =&gt; getWirelessDevicesPacketLossByDeviceResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWirelessDevicesPacketLossByDeviceResult> Invoke(GetWirelessDevicesPacketLossByDeviceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWirelessDevicesPacketLossByDeviceResult>("meraki:organizations/getWirelessDevicesPacketLossByDevice:getWirelessDevicesPacketLossByDevice", args ?? new GetWirelessDevicesPacketLossByDeviceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWirelessDevicesPacketLossByDeviceArgs : global::Pulumi.InvokeArgs
    {
        [Input("bands")]
        private List<string>? _bands;

        /// <summary>
        /// bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
        /// </summary>
        public List<string> Bands
        {
            get => _bands ?? (_bands = new List<string>());
            set => _bands = value;
        }

        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public string? EndingBefore { get; set; }

        [Input("networkIds")]
        private List<string>? _networkIds;

        /// <summary>
        /// networkIds query parameter. Filter results by network.
        /// </summary>
        public List<string> NetworkIds
        {
            get => _networkIds ?? (_networkIds = new List<string>());
            set => _networkIds = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public string OrganizationId { get; set; } = null!;

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public int? PerPage { get; set; }

        [Input("serials")]
        private List<string>? _serials;

        /// <summary>
        /// serials query parameter. Filter results by device.
        /// </summary>
        public List<string> Serials
        {
            get => _serials ?? (_serials = new List<string>());
            set => _serials = value;
        }

        [Input("ssids")]
        private List<string>? _ssids;

        /// <summary>
        /// ssids query parameter. Filter results by SSID number.
        /// </summary>
        public List<string> Ssids
        {
            get => _ssids ?? (_ssids = new List<string>());
            set => _ssids = value;
        }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public string? StartingAfter { get; set; }

        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
        /// </summary>
        [Input("t0")]
        public string? T0 { get; set; }

        /// <summary>
        /// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
        /// </summary>
        [Input("t1")]
        public string? T1 { get; set; }

        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
        /// </summary>
        [Input("timespan")]
        public double? Timespan { get; set; }

        public GetWirelessDevicesPacketLossByDeviceArgs()
        {
        }
        public static new GetWirelessDevicesPacketLossByDeviceArgs Empty => new GetWirelessDevicesPacketLossByDeviceArgs();
    }

    public sealed class GetWirelessDevicesPacketLossByDeviceInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("bands")]
        private InputList<string>? _bands;

        /// <summary>
        /// bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
        /// </summary>
        public InputList<string> Bands
        {
            get => _bands ?? (_bands = new InputList<string>());
            set => _bands = value;
        }

        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public Input<string>? EndingBefore { get; set; }

        [Input("networkIds")]
        private InputList<string>? _networkIds;

        /// <summary>
        /// networkIds query parameter. Filter results by network.
        /// </summary>
        public InputList<string> NetworkIds
        {
            get => _networkIds ?? (_networkIds = new InputList<string>());
            set => _networkIds = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public Input<int>? PerPage { get; set; }

        [Input("serials")]
        private InputList<string>? _serials;

        /// <summary>
        /// serials query parameter. Filter results by device.
        /// </summary>
        public InputList<string> Serials
        {
            get => _serials ?? (_serials = new InputList<string>());
            set => _serials = value;
        }

        [Input("ssids")]
        private InputList<string>? _ssids;

        /// <summary>
        /// ssids query parameter. Filter results by SSID number.
        /// </summary>
        public InputList<string> Ssids
        {
            get => _ssids ?? (_ssids = new InputList<string>());
            set => _ssids = value;
        }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public Input<string>? StartingAfter { get; set; }

        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
        /// </summary>
        [Input("t0")]
        public Input<string>? T0 { get; set; }

        /// <summary>
        /// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
        /// </summary>
        [Input("t1")]
        public Input<string>? T1 { get; set; }

        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
        /// </summary>
        [Input("timespan")]
        public Input<double>? Timespan { get; set; }

        public GetWirelessDevicesPacketLossByDeviceInvokeArgs()
        {
        }
        public static new GetWirelessDevicesPacketLossByDeviceInvokeArgs Empty => new GetWirelessDevicesPacketLossByDeviceInvokeArgs();
    }


    [OutputType]
    public sealed class GetWirelessDevicesPacketLossByDeviceResult
    {
        /// <summary>
        /// bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
        /// </summary>
        public readonly ImmutableArray<string> Bands;
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? EndingBefore;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseWirelessGetOrganizationWirelessDevicesPacketLossByDevice
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWirelessDevicesPacketLossByDeviceItemResult> Items;
        /// <summary>
        /// networkIds query parameter. Filter results by network.
        /// </summary>
        public readonly ImmutableArray<string> NetworkIds;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        public readonly int? PerPage;
        /// <summary>
        /// serials query parameter. Filter results by device.
        /// </summary>
        public readonly ImmutableArray<string> Serials;
        /// <summary>
        /// ssids query parameter. Filter results by SSID number.
        /// </summary>
        public readonly ImmutableArray<string> Ssids;
        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? StartingAfter;
        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
        /// </summary>
        public readonly string? T0;
        /// <summary>
        /// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
        /// </summary>
        public readonly string? T1;
        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
        /// </summary>
        public readonly double? Timespan;

        [OutputConstructor]
        private GetWirelessDevicesPacketLossByDeviceResult(
            ImmutableArray<string> bands,

            string? endingBefore,

            string id,

            ImmutableArray<Outputs.GetWirelessDevicesPacketLossByDeviceItemResult> items,

            ImmutableArray<string> networkIds,

            string organizationId,

            int? perPage,

            ImmutableArray<string> serials,

            ImmutableArray<string> ssids,

            string? startingAfter,

            string? t0,

            string? t1,

            double? timespan)
        {
            Bands = bands;
            EndingBefore = endingBefore;
            Id = id;
            Items = items;
            NetworkIds = networkIds;
            OrganizationId = organizationId;
            PerPage = perPage;
            Serials = serials;
            Ssids = ssids;
            StartingAfter = startingAfter;
            T0 = t0;
            T1 = t1;
            Timespan = timespan;
        }
    }
}
