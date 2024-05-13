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
//			example, err := networks.LookupSwitchRoutingOspf(ctx, &networks.LookupSwitchRoutingOspfArgs{
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSwitchRoutingOspfExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupSwitchRoutingOspf(ctx *pulumi.Context, args *LookupSwitchRoutingOspfArgs, opts ...pulumi.InvokeOption) (*LookupSwitchRoutingOspfResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSwitchRoutingOspfResult
	err := ctx.Invoke("meraki:networks/getSwitchRoutingOspf:getSwitchRoutingOspf", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSwitchRoutingOspf.
type LookupSwitchRoutingOspfArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getSwitchRoutingOspf.
type LookupSwitchRoutingOspfResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                   `pulumi:"id"`
	Item GetSwitchRoutingOspfItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func LookupSwitchRoutingOspfOutput(ctx *pulumi.Context, args LookupSwitchRoutingOspfOutputArgs, opts ...pulumi.InvokeOption) LookupSwitchRoutingOspfResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSwitchRoutingOspfResult, error) {
			args := v.(LookupSwitchRoutingOspfArgs)
			r, err := LookupSwitchRoutingOspf(ctx, &args, opts...)
			var s LookupSwitchRoutingOspfResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSwitchRoutingOspfResultOutput)
}

// A collection of arguments for invoking getSwitchRoutingOspf.
type LookupSwitchRoutingOspfOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (LookupSwitchRoutingOspfOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchRoutingOspfArgs)(nil)).Elem()
}

// A collection of values returned by getSwitchRoutingOspf.
type LookupSwitchRoutingOspfResultOutput struct{ *pulumi.OutputState }

func (LookupSwitchRoutingOspfResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchRoutingOspfResult)(nil)).Elem()
}

func (o LookupSwitchRoutingOspfResultOutput) ToLookupSwitchRoutingOspfResultOutput() LookupSwitchRoutingOspfResultOutput {
	return o
}

func (o LookupSwitchRoutingOspfResultOutput) ToLookupSwitchRoutingOspfResultOutputWithContext(ctx context.Context) LookupSwitchRoutingOspfResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSwitchRoutingOspfResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSwitchRoutingOspfResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSwitchRoutingOspfResultOutput) Item() GetSwitchRoutingOspfItemOutput {
	return o.ApplyT(func(v LookupSwitchRoutingOspfResult) GetSwitchRoutingOspfItem { return v.Item }).(GetSwitchRoutingOspfItemOutput)
}

// networkId path parameter. Network ID
func (o LookupSwitchRoutingOspfResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSwitchRoutingOspfResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSwitchRoutingOspfResultOutput{})
}