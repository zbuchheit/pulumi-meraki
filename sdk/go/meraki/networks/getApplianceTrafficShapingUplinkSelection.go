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
//			example, err := networks.LookupApplianceTrafficShapingUplinkSelection(ctx, &networks.LookupApplianceTrafficShapingUplinkSelectionArgs{
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksApplianceTrafficShapingUplinkSelectionExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupApplianceTrafficShapingUplinkSelection(ctx *pulumi.Context, args *LookupApplianceTrafficShapingUplinkSelectionArgs, opts ...pulumi.InvokeOption) (*LookupApplianceTrafficShapingUplinkSelectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApplianceTrafficShapingUplinkSelectionResult
	err := ctx.Invoke("meraki:networks/getApplianceTrafficShapingUplinkSelection:getApplianceTrafficShapingUplinkSelection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplianceTrafficShapingUplinkSelection.
type LookupApplianceTrafficShapingUplinkSelectionArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getApplianceTrafficShapingUplinkSelection.
type LookupApplianceTrafficShapingUplinkSelectionResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                                        `pulumi:"id"`
	Item GetApplianceTrafficShapingUplinkSelectionItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func LookupApplianceTrafficShapingUplinkSelectionOutput(ctx *pulumi.Context, args LookupApplianceTrafficShapingUplinkSelectionOutputArgs, opts ...pulumi.InvokeOption) LookupApplianceTrafficShapingUplinkSelectionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupApplianceTrafficShapingUplinkSelectionResult, error) {
			args := v.(LookupApplianceTrafficShapingUplinkSelectionArgs)
			r, err := LookupApplianceTrafficShapingUplinkSelection(ctx, &args, opts...)
			var s LookupApplianceTrafficShapingUplinkSelectionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupApplianceTrafficShapingUplinkSelectionResultOutput)
}

// A collection of arguments for invoking getApplianceTrafficShapingUplinkSelection.
type LookupApplianceTrafficShapingUplinkSelectionOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (LookupApplianceTrafficShapingUplinkSelectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceTrafficShapingUplinkSelectionArgs)(nil)).Elem()
}

// A collection of values returned by getApplianceTrafficShapingUplinkSelection.
type LookupApplianceTrafficShapingUplinkSelectionResultOutput struct{ *pulumi.OutputState }

func (LookupApplianceTrafficShapingUplinkSelectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceTrafficShapingUplinkSelectionResult)(nil)).Elem()
}

func (o LookupApplianceTrafficShapingUplinkSelectionResultOutput) ToLookupApplianceTrafficShapingUplinkSelectionResultOutput() LookupApplianceTrafficShapingUplinkSelectionResultOutput {
	return o
}

func (o LookupApplianceTrafficShapingUplinkSelectionResultOutput) ToLookupApplianceTrafficShapingUplinkSelectionResultOutputWithContext(ctx context.Context) LookupApplianceTrafficShapingUplinkSelectionResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApplianceTrafficShapingUplinkSelectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceTrafficShapingUplinkSelectionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupApplianceTrafficShapingUplinkSelectionResultOutput) Item() GetApplianceTrafficShapingUplinkSelectionItemOutput {
	return o.ApplyT(func(v LookupApplianceTrafficShapingUplinkSelectionResult) GetApplianceTrafficShapingUplinkSelectionItem {
		return v.Item
	}).(GetApplianceTrafficShapingUplinkSelectionItemOutput)
}

// networkId path parameter. Network ID
func (o LookupApplianceTrafficShapingUplinkSelectionResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceTrafficShapingUplinkSelectionResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplianceTrafficShapingUplinkSelectionResultOutput{})
}