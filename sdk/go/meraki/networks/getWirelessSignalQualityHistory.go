// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/networks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := networks.GetWirelessSignalQualityHistory(ctx, &networks.GetWirelessSignalQualityHistoryArgs{
//				ApTag:          pulumi.StringRef("string"),
//				AutoResolution: pulumi.BoolRef(false),
//				Band:           pulumi.StringRef("string"),
//				ClientId:       pulumi.StringRef("string"),
//				DeviceSerial:   pulumi.StringRef("string"),
//				NetworkId:      "string",
//				Resolution:     pulumi.IntRef(1),
//				Ssid:           pulumi.IntRef(1),
//				T0:             pulumi.StringRef("string"),
//				T1:             pulumi.StringRef("string"),
//				Timespan:       pulumi.Float64Ref(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksWirelessSignalQualityHistoryExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetWirelessSignalQualityHistory(ctx *pulumi.Context, args *GetWirelessSignalQualityHistoryArgs, opts ...pulumi.InvokeOption) (*GetWirelessSignalQualityHistoryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWirelessSignalQualityHistoryResult
	err := ctx.Invoke("meraki:networks/getWirelessSignalQualityHistory:getWirelessSignalQualityHistory", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessSignalQualityHistory.
type GetWirelessSignalQualityHistoryArgs struct {
	// apTag query parameter. Filter results by AP tag; either :clientId or :deviceSerial must be jointly specified.
	ApTag *string `pulumi:"apTag"`
	// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
	AutoResolution *bool `pulumi:"autoResolution"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6').
	Band *string `pulumi:"band"`
	// clientId query parameter. Filter results by network client.
	ClientId *string `pulumi:"clientId"`
	// deviceSerial query parameter. Filter results by device.
	DeviceSerial *string `pulumi:"deviceSerial"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 300, 600, 1200, 3600, 14400, 86400. The default is 86400.
	Resolution *int `pulumi:"resolution"`
	// ssid query parameter. Filter results by SSID number.
	Ssid *int `pulumi:"ssid"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
	Timespan *float64 `pulumi:"timespan"`
}

// A collection of values returned by getWirelessSignalQualityHistory.
type GetWirelessSignalQualityHistoryResult struct {
	// apTag query parameter. Filter results by AP tag; either :clientId or :deviceSerial must be jointly specified.
	ApTag *string `pulumi:"apTag"`
	// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
	AutoResolution *bool `pulumi:"autoResolution"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6').
	Band *string `pulumi:"band"`
	// clientId query parameter. Filter results by network client.
	ClientId *string `pulumi:"clientId"`
	// deviceSerial query parameter. Filter results by device.
	DeviceSerial *string `pulumi:"deviceSerial"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseWirelessGetNetworkWirelessSignalQualityHistory
	Items []GetWirelessSignalQualityHistoryItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 300, 600, 1200, 3600, 14400, 86400. The default is 86400.
	Resolution *int `pulumi:"resolution"`
	// ssid query parameter. Filter results by SSID number.
	Ssid *int `pulumi:"ssid"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
	Timespan *float64 `pulumi:"timespan"`
}

func GetWirelessSignalQualityHistoryOutput(ctx *pulumi.Context, args GetWirelessSignalQualityHistoryOutputArgs, opts ...pulumi.InvokeOption) GetWirelessSignalQualityHistoryResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetWirelessSignalQualityHistoryResult, error) {
			args := v.(GetWirelessSignalQualityHistoryArgs)
			r, err := GetWirelessSignalQualityHistory(ctx, &args, opts...)
			var s GetWirelessSignalQualityHistoryResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetWirelessSignalQualityHistoryResultOutput)
}

// A collection of arguments for invoking getWirelessSignalQualityHistory.
type GetWirelessSignalQualityHistoryOutputArgs struct {
	// apTag query parameter. Filter results by AP tag; either :clientId or :deviceSerial must be jointly specified.
	ApTag pulumi.StringPtrInput `pulumi:"apTag"`
	// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
	AutoResolution pulumi.BoolPtrInput `pulumi:"autoResolution"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6').
	Band pulumi.StringPtrInput `pulumi:"band"`
	// clientId query parameter. Filter results by network client.
	ClientId pulumi.StringPtrInput `pulumi:"clientId"`
	// deviceSerial query parameter. Filter results by device.
	DeviceSerial pulumi.StringPtrInput `pulumi:"deviceSerial"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 300, 600, 1200, 3600, 14400, 86400. The default is 86400.
	Resolution pulumi.IntPtrInput `pulumi:"resolution"`
	// ssid query parameter. Filter results by SSID number.
	Ssid pulumi.IntPtrInput `pulumi:"ssid"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
}

func (GetWirelessSignalQualityHistoryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessSignalQualityHistoryArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessSignalQualityHistory.
type GetWirelessSignalQualityHistoryResultOutput struct{ *pulumi.OutputState }

func (GetWirelessSignalQualityHistoryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessSignalQualityHistoryResult)(nil)).Elem()
}

func (o GetWirelessSignalQualityHistoryResultOutput) ToGetWirelessSignalQualityHistoryResultOutput() GetWirelessSignalQualityHistoryResultOutput {
	return o
}

func (o GetWirelessSignalQualityHistoryResultOutput) ToGetWirelessSignalQualityHistoryResultOutputWithContext(ctx context.Context) GetWirelessSignalQualityHistoryResultOutput {
	return o
}

// apTag query parameter. Filter results by AP tag; either :clientId or :deviceSerial must be jointly specified.
func (o GetWirelessSignalQualityHistoryResultOutput) ApTag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) *string { return v.ApTag }).(pulumi.StringPtrOutput)
}

// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
func (o GetWirelessSignalQualityHistoryResultOutput) AutoResolution() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) *bool { return v.AutoResolution }).(pulumi.BoolPtrOutput)
}

// band query parameter. Filter results by band (either '2.4', '5' or '6').
func (o GetWirelessSignalQualityHistoryResultOutput) Band() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) *string { return v.Band }).(pulumi.StringPtrOutput)
}

// clientId query parameter. Filter results by network client.
func (o GetWirelessSignalQualityHistoryResultOutput) ClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) *string { return v.ClientId }).(pulumi.StringPtrOutput)
}

// deviceSerial query parameter. Filter results by device.
func (o GetWirelessSignalQualityHistoryResultOutput) DeviceSerial() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) *string { return v.DeviceSerial }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWirelessSignalQualityHistoryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseWirelessGetNetworkWirelessSignalQualityHistory
func (o GetWirelessSignalQualityHistoryResultOutput) Items() GetWirelessSignalQualityHistoryItemArrayOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) []GetWirelessSignalQualityHistoryItem { return v.Items }).(GetWirelessSignalQualityHistoryItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetWirelessSignalQualityHistoryResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 300, 600, 1200, 3600, 14400, 86400. The default is 86400.
func (o GetWirelessSignalQualityHistoryResultOutput) Resolution() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) *int { return v.Resolution }).(pulumi.IntPtrOutput)
}

// ssid query parameter. Filter results by SSID number.
func (o GetWirelessSignalQualityHistoryResultOutput) Ssid() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) *int { return v.Ssid }).(pulumi.IntPtrOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
func (o GetWirelessSignalQualityHistoryResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
func (o GetWirelessSignalQualityHistoryResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
func (o GetWirelessSignalQualityHistoryResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetWirelessSignalQualityHistoryResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWirelessSignalQualityHistoryResultOutput{})
}