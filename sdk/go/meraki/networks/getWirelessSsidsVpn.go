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
//			example, err := networks.LookupWirelessSsidsVpn(ctx, &networks.LookupWirelessSsidsVpnArgs{
//				NetworkId: "string",
//				Number:    "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksWirelessSsidsVpnExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupWirelessSsidsVpn(ctx *pulumi.Context, args *LookupWirelessSsidsVpnArgs, opts ...pulumi.InvokeOption) (*LookupWirelessSsidsVpnResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWirelessSsidsVpnResult
	err := ctx.Invoke("meraki:networks/getWirelessSsidsVpn:getWirelessSsidsVpn", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessSsidsVpn.
type LookupWirelessSsidsVpnArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
}

// A collection of values returned by getWirelessSsidsVpn.
type LookupWirelessSsidsVpnResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                  `pulumi:"id"`
	Item GetWirelessSsidsVpnItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
}

func LookupWirelessSsidsVpnOutput(ctx *pulumi.Context, args LookupWirelessSsidsVpnOutputArgs, opts ...pulumi.InvokeOption) LookupWirelessSsidsVpnResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupWirelessSsidsVpnResult, error) {
			args := v.(LookupWirelessSsidsVpnArgs)
			r, err := LookupWirelessSsidsVpn(ctx, &args, opts...)
			var s LookupWirelessSsidsVpnResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupWirelessSsidsVpnResultOutput)
}

// A collection of arguments for invoking getWirelessSsidsVpn.
type LookupWirelessSsidsVpnOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// number path parameter.
	Number pulumi.StringInput `pulumi:"number"`
}

func (LookupWirelessSsidsVpnOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsVpnArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessSsidsVpn.
type LookupWirelessSsidsVpnResultOutput struct{ *pulumi.OutputState }

func (LookupWirelessSsidsVpnResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsVpnResult)(nil)).Elem()
}

func (o LookupWirelessSsidsVpnResultOutput) ToLookupWirelessSsidsVpnResultOutput() LookupWirelessSsidsVpnResultOutput {
	return o
}

func (o LookupWirelessSsidsVpnResultOutput) ToLookupWirelessSsidsVpnResultOutputWithContext(ctx context.Context) LookupWirelessSsidsVpnResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWirelessSsidsVpnResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsVpnResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupWirelessSsidsVpnResultOutput) Item() GetWirelessSsidsVpnItemOutput {
	return o.ApplyT(func(v LookupWirelessSsidsVpnResult) GetWirelessSsidsVpnItem { return v.Item }).(GetWirelessSsidsVpnItemOutput)
}

// networkId path parameter. Network ID
func (o LookupWirelessSsidsVpnResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsVpnResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// number path parameter.
func (o LookupWirelessSsidsVpnResultOutput) Number() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsVpnResult) string { return v.Number }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWirelessSsidsVpnResultOutput{})
}
