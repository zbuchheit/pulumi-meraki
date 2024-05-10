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
//			example, err := organizations.GetWirelessDevicesChannelUtilizationByNetwork(ctx, &organizations.GetWirelessDevicesChannelUtilizationByNetworkArgs{
//				EndingBefore: pulumi.StringRef("string"),
//				Interval:     pulumi.IntRef(1),
//				NetworkIds: []string{
//					"string",
//				},
//				OrganizationId: "string",
//				PerPage:        pulumi.IntRef(1),
//				Serials: []string{
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
//			ctx.Export("merakiOrganizationsWirelessDevicesChannelUtilizationByNetworkExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetWirelessDevicesChannelUtilizationByNetwork(ctx *pulumi.Context, args *GetWirelessDevicesChannelUtilizationByNetworkArgs, opts ...pulumi.InvokeOption) (*GetWirelessDevicesChannelUtilizationByNetworkResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWirelessDevicesChannelUtilizationByNetworkResult
	err := ctx.Invoke("meraki:organizations/getWirelessDevicesChannelUtilizationByNetwork:getWirelessDevicesChannelUtilizationByNetwork", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessDevicesChannelUtilizationByNetwork.
type GetWirelessDevicesChannelUtilizationByNetworkArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// interval query parameter. The time interval in seconds for returned data. The valid intervals are: 300, 600, 3600, 7200, 14400, 21600. The default is 3600.
	Interval *int `pulumi:"interval"`
	// networkIds query parameter. Filter results by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// serials query parameter. Filter results by device.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 90 days. The default is 7 days.
	Timespan *float64 `pulumi:"timespan"`
}

// A collection of values returned by getWirelessDevicesChannelUtilizationByNetwork.
type GetWirelessDevicesChannelUtilizationByNetworkResult struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// interval query parameter. The time interval in seconds for returned data. The valid intervals are: 300, 600, 3600, 7200, 14400, 21600. The default is 3600.
	Interval *int `pulumi:"interval"`
	// Array of ResponseWirelessGetOrganizationWirelessDevicesChannelUtilizationByNetwork
	Items []GetWirelessDevicesChannelUtilizationByNetworkItem `pulumi:"items"`
	// networkIds query parameter. Filter results by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// serials query parameter. Filter results by device.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 90 days. The default is 7 days.
	Timespan *float64 `pulumi:"timespan"`
}

func GetWirelessDevicesChannelUtilizationByNetworkOutput(ctx *pulumi.Context, args GetWirelessDevicesChannelUtilizationByNetworkOutputArgs, opts ...pulumi.InvokeOption) GetWirelessDevicesChannelUtilizationByNetworkResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetWirelessDevicesChannelUtilizationByNetworkResult, error) {
			args := v.(GetWirelessDevicesChannelUtilizationByNetworkArgs)
			r, err := GetWirelessDevicesChannelUtilizationByNetwork(ctx, &args, opts...)
			var s GetWirelessDevicesChannelUtilizationByNetworkResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetWirelessDevicesChannelUtilizationByNetworkResultOutput)
}

// A collection of arguments for invoking getWirelessDevicesChannelUtilizationByNetwork.
type GetWirelessDevicesChannelUtilizationByNetworkOutputArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// interval query parameter. The time interval in seconds for returned data. The valid intervals are: 300, 600, 3600, 7200, 14400, 21600. The default is 3600.
	Interval pulumi.IntPtrInput `pulumi:"interval"`
	// networkIds query parameter. Filter results by network.
	NetworkIds pulumi.StringArrayInput `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// serials query parameter. Filter results by device.
	Serials pulumi.StringArrayInput `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 90 days. The default is 7 days.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
}

func (GetWirelessDevicesChannelUtilizationByNetworkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessDevicesChannelUtilizationByNetworkArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessDevicesChannelUtilizationByNetwork.
type GetWirelessDevicesChannelUtilizationByNetworkResultOutput struct{ *pulumi.OutputState }

func (GetWirelessDevicesChannelUtilizationByNetworkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessDevicesChannelUtilizationByNetworkResult)(nil)).Elem()
}

func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) ToGetWirelessDevicesChannelUtilizationByNetworkResultOutput() GetWirelessDevicesChannelUtilizationByNetworkResultOutput {
	return o
}

func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) ToGetWirelessDevicesChannelUtilizationByNetworkResultOutputWithContext(ctx context.Context) GetWirelessDevicesChannelUtilizationByNetworkResultOutput {
	return o
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) string { return v.Id }).(pulumi.StringOutput)
}

// interval query parameter. The time interval in seconds for returned data. The valid intervals are: 300, 600, 3600, 7200, 14400, 21600. The default is 3600.
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) Interval() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) *int { return v.Interval }).(pulumi.IntPtrOutput)
}

// Array of ResponseWirelessGetOrganizationWirelessDevicesChannelUtilizationByNetwork
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) Items() GetWirelessDevicesChannelUtilizationByNetworkItemArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) []GetWirelessDevicesChannelUtilizationByNetworkItem {
		return v.Items
	}).(GetWirelessDevicesChannelUtilizationByNetworkItemArrayOutput)
}

// networkIds query parameter. Filter results by network.
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) NetworkIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) []string { return v.NetworkIds }).(pulumi.StringArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// serials query parameter. Filter results by device.
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) Serials() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) []string { return v.Serials }).(pulumi.StringArrayOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 90 days. The default is 7 days.
func (o GetWirelessDevicesChannelUtilizationByNetworkResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesChannelUtilizationByNetworkResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWirelessDevicesChannelUtilizationByNetworkResultOutput{})
}
