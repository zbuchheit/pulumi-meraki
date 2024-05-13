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
//			example, err := networks.LookupWirelessAlternateManagementInterface(ctx, &networks.LookupWirelessAlternateManagementInterfaceArgs{
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksWirelessAlternateManagementInterfaceExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupWirelessAlternateManagementInterface(ctx *pulumi.Context, args *LookupWirelessAlternateManagementInterfaceArgs, opts ...pulumi.InvokeOption) (*LookupWirelessAlternateManagementInterfaceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWirelessAlternateManagementInterfaceResult
	err := ctx.Invoke("meraki:networks/getWirelessAlternateManagementInterface:getWirelessAlternateManagementInterface", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessAlternateManagementInterface.
type LookupWirelessAlternateManagementInterfaceArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getWirelessAlternateManagementInterface.
type LookupWirelessAlternateManagementInterfaceResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                                      `pulumi:"id"`
	Item GetWirelessAlternateManagementInterfaceItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func LookupWirelessAlternateManagementInterfaceOutput(ctx *pulumi.Context, args LookupWirelessAlternateManagementInterfaceOutputArgs, opts ...pulumi.InvokeOption) LookupWirelessAlternateManagementInterfaceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupWirelessAlternateManagementInterfaceResult, error) {
			args := v.(LookupWirelessAlternateManagementInterfaceArgs)
			r, err := LookupWirelessAlternateManagementInterface(ctx, &args, opts...)
			var s LookupWirelessAlternateManagementInterfaceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupWirelessAlternateManagementInterfaceResultOutput)
}

// A collection of arguments for invoking getWirelessAlternateManagementInterface.
type LookupWirelessAlternateManagementInterfaceOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (LookupWirelessAlternateManagementInterfaceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessAlternateManagementInterfaceArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessAlternateManagementInterface.
type LookupWirelessAlternateManagementInterfaceResultOutput struct{ *pulumi.OutputState }

func (LookupWirelessAlternateManagementInterfaceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessAlternateManagementInterfaceResult)(nil)).Elem()
}

func (o LookupWirelessAlternateManagementInterfaceResultOutput) ToLookupWirelessAlternateManagementInterfaceResultOutput() LookupWirelessAlternateManagementInterfaceResultOutput {
	return o
}

func (o LookupWirelessAlternateManagementInterfaceResultOutput) ToLookupWirelessAlternateManagementInterfaceResultOutputWithContext(ctx context.Context) LookupWirelessAlternateManagementInterfaceResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWirelessAlternateManagementInterfaceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessAlternateManagementInterfaceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupWirelessAlternateManagementInterfaceResultOutput) Item() GetWirelessAlternateManagementInterfaceItemOutput {
	return o.ApplyT(func(v LookupWirelessAlternateManagementInterfaceResult) GetWirelessAlternateManagementInterfaceItem {
		return v.Item
	}).(GetWirelessAlternateManagementInterfaceItemOutput)
}

// networkId path parameter. Network ID
func (o LookupWirelessAlternateManagementInterfaceResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessAlternateManagementInterfaceResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWirelessAlternateManagementInterfaceResultOutput{})
}