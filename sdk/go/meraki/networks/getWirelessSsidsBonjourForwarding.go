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
//			example, err := networks.LookupWirelessSsidsBonjourForwarding(ctx, &networks.LookupWirelessSsidsBonjourForwardingArgs{
//				NetworkId: "string",
//				Number:    "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksWirelessSsidsBonjourForwardingExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupWirelessSsidsBonjourForwarding(ctx *pulumi.Context, args *LookupWirelessSsidsBonjourForwardingArgs, opts ...pulumi.InvokeOption) (*LookupWirelessSsidsBonjourForwardingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWirelessSsidsBonjourForwardingResult
	err := ctx.Invoke("meraki:networks/getWirelessSsidsBonjourForwarding:getWirelessSsidsBonjourForwarding", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessSsidsBonjourForwarding.
type LookupWirelessSsidsBonjourForwardingArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
}

// A collection of values returned by getWirelessSsidsBonjourForwarding.
type LookupWirelessSsidsBonjourForwardingResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                                `pulumi:"id"`
	Item GetWirelessSsidsBonjourForwardingItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
}

func LookupWirelessSsidsBonjourForwardingOutput(ctx *pulumi.Context, args LookupWirelessSsidsBonjourForwardingOutputArgs, opts ...pulumi.InvokeOption) LookupWirelessSsidsBonjourForwardingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupWirelessSsidsBonjourForwardingResult, error) {
			args := v.(LookupWirelessSsidsBonjourForwardingArgs)
			r, err := LookupWirelessSsidsBonjourForwarding(ctx, &args, opts...)
			var s LookupWirelessSsidsBonjourForwardingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupWirelessSsidsBonjourForwardingResultOutput)
}

// A collection of arguments for invoking getWirelessSsidsBonjourForwarding.
type LookupWirelessSsidsBonjourForwardingOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// number path parameter.
	Number pulumi.StringInput `pulumi:"number"`
}

func (LookupWirelessSsidsBonjourForwardingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsBonjourForwardingArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessSsidsBonjourForwarding.
type LookupWirelessSsidsBonjourForwardingResultOutput struct{ *pulumi.OutputState }

func (LookupWirelessSsidsBonjourForwardingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsBonjourForwardingResult)(nil)).Elem()
}

func (o LookupWirelessSsidsBonjourForwardingResultOutput) ToLookupWirelessSsidsBonjourForwardingResultOutput() LookupWirelessSsidsBonjourForwardingResultOutput {
	return o
}

func (o LookupWirelessSsidsBonjourForwardingResultOutput) ToLookupWirelessSsidsBonjourForwardingResultOutputWithContext(ctx context.Context) LookupWirelessSsidsBonjourForwardingResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWirelessSsidsBonjourForwardingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsBonjourForwardingResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupWirelessSsidsBonjourForwardingResultOutput) Item() GetWirelessSsidsBonjourForwardingItemOutput {
	return o.ApplyT(func(v LookupWirelessSsidsBonjourForwardingResult) GetWirelessSsidsBonjourForwardingItem {
		return v.Item
	}).(GetWirelessSsidsBonjourForwardingItemOutput)
}

// networkId path parameter. Network ID
func (o LookupWirelessSsidsBonjourForwardingResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsBonjourForwardingResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// number path parameter.
func (o LookupWirelessSsidsBonjourForwardingResultOutput) Number() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsBonjourForwardingResult) string { return v.Number }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWirelessSsidsBonjourForwardingResultOutput{})
}
