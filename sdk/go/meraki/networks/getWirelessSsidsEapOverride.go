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
//			example, err := networks.LookupWirelessSsidsEapOverride(ctx, &networks.LookupWirelessSsidsEapOverrideArgs{
//				NetworkId: "string",
//				Number:    "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksWirelessSsidsEapOverrideExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupWirelessSsidsEapOverride(ctx *pulumi.Context, args *LookupWirelessSsidsEapOverrideArgs, opts ...pulumi.InvokeOption) (*LookupWirelessSsidsEapOverrideResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWirelessSsidsEapOverrideResult
	err := ctx.Invoke("meraki:networks/getWirelessSsidsEapOverride:getWirelessSsidsEapOverride", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessSsidsEapOverride.
type LookupWirelessSsidsEapOverrideArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
}

// A collection of values returned by getWirelessSsidsEapOverride.
type LookupWirelessSsidsEapOverrideResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                          `pulumi:"id"`
	Item GetWirelessSsidsEapOverrideItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
}

func LookupWirelessSsidsEapOverrideOutput(ctx *pulumi.Context, args LookupWirelessSsidsEapOverrideOutputArgs, opts ...pulumi.InvokeOption) LookupWirelessSsidsEapOverrideResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupWirelessSsidsEapOverrideResult, error) {
			args := v.(LookupWirelessSsidsEapOverrideArgs)
			r, err := LookupWirelessSsidsEapOverride(ctx, &args, opts...)
			var s LookupWirelessSsidsEapOverrideResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupWirelessSsidsEapOverrideResultOutput)
}

// A collection of arguments for invoking getWirelessSsidsEapOverride.
type LookupWirelessSsidsEapOverrideOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// number path parameter.
	Number pulumi.StringInput `pulumi:"number"`
}

func (LookupWirelessSsidsEapOverrideOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsEapOverrideArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessSsidsEapOverride.
type LookupWirelessSsidsEapOverrideResultOutput struct{ *pulumi.OutputState }

func (LookupWirelessSsidsEapOverrideResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsEapOverrideResult)(nil)).Elem()
}

func (o LookupWirelessSsidsEapOverrideResultOutput) ToLookupWirelessSsidsEapOverrideResultOutput() LookupWirelessSsidsEapOverrideResultOutput {
	return o
}

func (o LookupWirelessSsidsEapOverrideResultOutput) ToLookupWirelessSsidsEapOverrideResultOutputWithContext(ctx context.Context) LookupWirelessSsidsEapOverrideResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWirelessSsidsEapOverrideResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsEapOverrideResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupWirelessSsidsEapOverrideResultOutput) Item() GetWirelessSsidsEapOverrideItemOutput {
	return o.ApplyT(func(v LookupWirelessSsidsEapOverrideResult) GetWirelessSsidsEapOverrideItem { return v.Item }).(GetWirelessSsidsEapOverrideItemOutput)
}

// networkId path parameter. Network ID
func (o LookupWirelessSsidsEapOverrideResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsEapOverrideResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// number path parameter.
func (o LookupWirelessSsidsEapOverrideResultOutput) Number() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsEapOverrideResult) string { return v.Number }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWirelessSsidsEapOverrideResultOutput{})
}