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
//			example, err := networks.GetWirelessMeshStatuses(ctx, &networks.GetWirelessMeshStatusesArgs{
//				EndingBefore:  pulumi.StringRef("string"),
//				NetworkId:     "string",
//				PerPage:       pulumi.IntRef(1),
//				StartingAfter: pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksWirelessMeshStatusesExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetWirelessMeshStatuses(ctx *pulumi.Context, args *GetWirelessMeshStatusesArgs, opts ...pulumi.InvokeOption) (*GetWirelessMeshStatusesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWirelessMeshStatusesResult
	err := ctx.Invoke("meraki:networks/getWirelessMeshStatuses:getWirelessMeshStatuses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessMeshStatuses.
type GetWirelessMeshStatusesArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 500. Default is 50.
	PerPage *int `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

// A collection of values returned by getWirelessMeshStatuses.
type GetWirelessMeshStatusesResult struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseWirelessGetNetworkWirelessMeshStatuses
	Items []GetWirelessMeshStatusesItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 500. Default is 50.
	PerPage *int `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

func GetWirelessMeshStatusesOutput(ctx *pulumi.Context, args GetWirelessMeshStatusesOutputArgs, opts ...pulumi.InvokeOption) GetWirelessMeshStatusesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetWirelessMeshStatusesResult, error) {
			args := v.(GetWirelessMeshStatusesArgs)
			r, err := GetWirelessMeshStatuses(ctx, &args, opts...)
			var s GetWirelessMeshStatusesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetWirelessMeshStatusesResultOutput)
}

// A collection of arguments for invoking getWirelessMeshStatuses.
type GetWirelessMeshStatusesOutputArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 500. Default is 50.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
}

func (GetWirelessMeshStatusesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessMeshStatusesArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessMeshStatuses.
type GetWirelessMeshStatusesResultOutput struct{ *pulumi.OutputState }

func (GetWirelessMeshStatusesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessMeshStatusesResult)(nil)).Elem()
}

func (o GetWirelessMeshStatusesResultOutput) ToGetWirelessMeshStatusesResultOutput() GetWirelessMeshStatusesResultOutput {
	return o
}

func (o GetWirelessMeshStatusesResultOutput) ToGetWirelessMeshStatusesResultOutputWithContext(ctx context.Context) GetWirelessMeshStatusesResultOutput {
	return o
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetWirelessMeshStatusesResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessMeshStatusesResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWirelessMeshStatusesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessMeshStatusesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseWirelessGetNetworkWirelessMeshStatuses
func (o GetWirelessMeshStatusesResultOutput) Items() GetWirelessMeshStatusesItemArrayOutput {
	return o.ApplyT(func(v GetWirelessMeshStatusesResult) []GetWirelessMeshStatusesItem { return v.Items }).(GetWirelessMeshStatusesItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetWirelessMeshStatusesResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessMeshStatusesResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 500. Default is 50.
func (o GetWirelessMeshStatusesResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessMeshStatusesResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetWirelessMeshStatusesResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessMeshStatusesResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWirelessMeshStatusesResultOutput{})
}
