// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := organizations.GetWirelessDevicesPacketLossByClient(ctx, &organizations.GetWirelessDevicesPacketLossByClientArgs{
//				Bands: []string{
//					"string",
//				},
//				EndingBefore: pulumi.StringRef("string"),
//				Macs: []string{
//					"string",
//				},
//				NetworkIds: []string{
//					"string",
//				},
//				OrganizationId: "string",
//				PerPage:        pulumi.IntRef(1),
//				Ssids: []string{
//					"string",
//				},
//				StartingAfter: pulumi.StringRef("string"),
//				T0:            pulumi.StringRef("string"),
//				T1:            pulumi.StringRef("string"),
//				Timespan:      pulumi.Float64Ref(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsWirelessDevicesPacketLossByClientExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetWirelessDevicesPacketLossByClient(ctx *pulumi.Context, args *GetWirelessDevicesPacketLossByClientArgs, opts ...pulumi.InvokeOption) (*GetWirelessDevicesPacketLossByClientResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWirelessDevicesPacketLossByClientResult
	err := ctx.Invoke("meraki:organizations/getWirelessDevicesPacketLossByClient:getWirelessDevicesPacketLossByClient", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessDevicesPacketLossByClient.
type GetWirelessDevicesPacketLossByClientArgs struct {
	// bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
	Bands []string `pulumi:"bands"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// macs query parameter. Filter results by client mac address(es).
	Macs []string `pulumi:"macs"`
	// networkIds query parameter. Filter results by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// ssids query parameter. Filter results by SSID number.
	Ssids []string `pulumi:"ssids"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
	Timespan *float64 `pulumi:"timespan"`
}

// A collection of values returned by getWirelessDevicesPacketLossByClient.
type GetWirelessDevicesPacketLossByClientResult struct {
	// bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
	Bands []string `pulumi:"bands"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseWirelessGetOrganizationWirelessDevicesPacketLossByClient
	Items []GetWirelessDevicesPacketLossByClientItem `pulumi:"items"`
	// macs query parameter. Filter results by client mac address(es).
	Macs []string `pulumi:"macs"`
	// networkIds query parameter. Filter results by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// ssids query parameter. Filter results by SSID number.
	Ssids []string `pulumi:"ssids"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
	Timespan *float64 `pulumi:"timespan"`
}

func GetWirelessDevicesPacketLossByClientOutput(ctx *pulumi.Context, args GetWirelessDevicesPacketLossByClientOutputArgs, opts ...pulumi.InvokeOption) GetWirelessDevicesPacketLossByClientResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetWirelessDevicesPacketLossByClientResult, error) {
			args := v.(GetWirelessDevicesPacketLossByClientArgs)
			r, err := GetWirelessDevicesPacketLossByClient(ctx, &args, opts...)
			var s GetWirelessDevicesPacketLossByClientResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetWirelessDevicesPacketLossByClientResultOutput)
}

// A collection of arguments for invoking getWirelessDevicesPacketLossByClient.
type GetWirelessDevicesPacketLossByClientOutputArgs struct {
	// bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
	Bands pulumi.StringArrayInput `pulumi:"bands"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// macs query parameter. Filter results by client mac address(es).
	Macs pulumi.StringArrayInput `pulumi:"macs"`
	// networkIds query parameter. Filter results by network.
	NetworkIds pulumi.StringArrayInput `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// ssids query parameter. Filter results by SSID number.
	Ssids pulumi.StringArrayInput `pulumi:"ssids"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
}

func (GetWirelessDevicesPacketLossByClientOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessDevicesPacketLossByClientArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessDevicesPacketLossByClient.
type GetWirelessDevicesPacketLossByClientResultOutput struct{ *pulumi.OutputState }

func (GetWirelessDevicesPacketLossByClientResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessDevicesPacketLossByClientResult)(nil)).Elem()
}

func (o GetWirelessDevicesPacketLossByClientResultOutput) ToGetWirelessDevicesPacketLossByClientResultOutput() GetWirelessDevicesPacketLossByClientResultOutput {
	return o
}

func (o GetWirelessDevicesPacketLossByClientResultOutput) ToGetWirelessDevicesPacketLossByClientResultOutputWithContext(ctx context.Context) GetWirelessDevicesPacketLossByClientResultOutput {
	return o
}

// bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
func (o GetWirelessDevicesPacketLossByClientResultOutput) Bands() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) []string { return v.Bands }).(pulumi.StringArrayOutput)
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetWirelessDevicesPacketLossByClientResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWirelessDevicesPacketLossByClientResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseWirelessGetOrganizationWirelessDevicesPacketLossByClient
func (o GetWirelessDevicesPacketLossByClientResultOutput) Items() GetWirelessDevicesPacketLossByClientItemArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) []GetWirelessDevicesPacketLossByClientItem {
		return v.Items
	}).(GetWirelessDevicesPacketLossByClientItemArrayOutput)
}

// macs query parameter. Filter results by client mac address(es).
func (o GetWirelessDevicesPacketLossByClientResultOutput) Macs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) []string { return v.Macs }).(pulumi.StringArrayOutput)
}

// networkIds query parameter. Filter results by network.
func (o GetWirelessDevicesPacketLossByClientResultOutput) NetworkIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) []string { return v.NetworkIds }).(pulumi.StringArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetWirelessDevicesPacketLossByClientResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
func (o GetWirelessDevicesPacketLossByClientResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// ssids query parameter. Filter results by SSID number.
func (o GetWirelessDevicesPacketLossByClientResultOutput) Ssids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) []string { return v.Ssids }).(pulumi.StringArrayOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetWirelessDevicesPacketLossByClientResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
func (o GetWirelessDevicesPacketLossByClientResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
func (o GetWirelessDevicesPacketLossByClientResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
func (o GetWirelessDevicesPacketLossByClientResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByClientResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWirelessDevicesPacketLossByClientResultOutput{})
}
