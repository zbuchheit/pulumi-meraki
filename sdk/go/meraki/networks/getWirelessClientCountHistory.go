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
//			example, err := networks.GetWirelessClientCountHistory(ctx, &networks.GetWirelessClientCountHistoryArgs{
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
//			ctx.Export("merakiNetworksWirelessClientCountHistoryExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetWirelessClientCountHistory(ctx *pulumi.Context, args *GetWirelessClientCountHistoryArgs, opts ...pulumi.InvokeOption) (*GetWirelessClientCountHistoryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWirelessClientCountHistoryResult
	err := ctx.Invoke("meraki:networks/getWirelessClientCountHistory:getWirelessClientCountHistory", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessClientCountHistory.
type GetWirelessClientCountHistoryArgs struct {
	// apTag query parameter. Filter results by AP tag.
	ApTag *string `pulumi:"apTag"`
	// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
	AutoResolution *bool `pulumi:"autoResolution"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6').
	Band *string `pulumi:"band"`
	// clientId query parameter. Filter results by network client to return per-device client counts over time inner joined by the queried client's connection history.
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

// A collection of values returned by getWirelessClientCountHistory.
type GetWirelessClientCountHistoryResult struct {
	// apTag query parameter. Filter results by AP tag.
	ApTag *string `pulumi:"apTag"`
	// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
	AutoResolution *bool `pulumi:"autoResolution"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6').
	Band *string `pulumi:"band"`
	// clientId query parameter. Filter results by network client to return per-device client counts over time inner joined by the queried client's connection history.
	ClientId *string `pulumi:"clientId"`
	// deviceSerial query parameter. Filter results by device.
	DeviceSerial *string `pulumi:"deviceSerial"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseWirelessGetNetworkWirelessClientCountHistory
	Items []GetWirelessClientCountHistoryItem `pulumi:"items"`
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

func GetWirelessClientCountHistoryOutput(ctx *pulumi.Context, args GetWirelessClientCountHistoryOutputArgs, opts ...pulumi.InvokeOption) GetWirelessClientCountHistoryResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetWirelessClientCountHistoryResult, error) {
			args := v.(GetWirelessClientCountHistoryArgs)
			r, err := GetWirelessClientCountHistory(ctx, &args, opts...)
			var s GetWirelessClientCountHistoryResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetWirelessClientCountHistoryResultOutput)
}

// A collection of arguments for invoking getWirelessClientCountHistory.
type GetWirelessClientCountHistoryOutputArgs struct {
	// apTag query parameter. Filter results by AP tag.
	ApTag pulumi.StringPtrInput `pulumi:"apTag"`
	// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
	AutoResolution pulumi.BoolPtrInput `pulumi:"autoResolution"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6').
	Band pulumi.StringPtrInput `pulumi:"band"`
	// clientId query parameter. Filter results by network client to return per-device client counts over time inner joined by the queried client's connection history.
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

func (GetWirelessClientCountHistoryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessClientCountHistoryArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessClientCountHistory.
type GetWirelessClientCountHistoryResultOutput struct{ *pulumi.OutputState }

func (GetWirelessClientCountHistoryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessClientCountHistoryResult)(nil)).Elem()
}

func (o GetWirelessClientCountHistoryResultOutput) ToGetWirelessClientCountHistoryResultOutput() GetWirelessClientCountHistoryResultOutput {
	return o
}

func (o GetWirelessClientCountHistoryResultOutput) ToGetWirelessClientCountHistoryResultOutputWithContext(ctx context.Context) GetWirelessClientCountHistoryResultOutput {
	return o
}

// apTag query parameter. Filter results by AP tag.
func (o GetWirelessClientCountHistoryResultOutput) ApTag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) *string { return v.ApTag }).(pulumi.StringPtrOutput)
}

// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
func (o GetWirelessClientCountHistoryResultOutput) AutoResolution() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) *bool { return v.AutoResolution }).(pulumi.BoolPtrOutput)
}

// band query parameter. Filter results by band (either '2.4', '5' or '6').
func (o GetWirelessClientCountHistoryResultOutput) Band() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) *string { return v.Band }).(pulumi.StringPtrOutput)
}

// clientId query parameter. Filter results by network client to return per-device client counts over time inner joined by the queried client's connection history.
func (o GetWirelessClientCountHistoryResultOutput) ClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) *string { return v.ClientId }).(pulumi.StringPtrOutput)
}

// deviceSerial query parameter. Filter results by device.
func (o GetWirelessClientCountHistoryResultOutput) DeviceSerial() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) *string { return v.DeviceSerial }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWirelessClientCountHistoryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseWirelessGetNetworkWirelessClientCountHistory
func (o GetWirelessClientCountHistoryResultOutput) Items() GetWirelessClientCountHistoryItemArrayOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) []GetWirelessClientCountHistoryItem { return v.Items }).(GetWirelessClientCountHistoryItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetWirelessClientCountHistoryResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 300, 600, 1200, 3600, 14400, 86400. The default is 86400.
func (o GetWirelessClientCountHistoryResultOutput) Resolution() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) *int { return v.Resolution }).(pulumi.IntPtrOutput)
}

// ssid query parameter. Filter results by SSID number.
func (o GetWirelessClientCountHistoryResultOutput) Ssid() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) *int { return v.Ssid }).(pulumi.IntPtrOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
func (o GetWirelessClientCountHistoryResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
func (o GetWirelessClientCountHistoryResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
func (o GetWirelessClientCountHistoryResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetWirelessClientCountHistoryResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWirelessClientCountHistoryResultOutput{})
}