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
//			example, err := networks.LookupApplianceSecurityIntrusion(ctx, &networks.LookupApplianceSecurityIntrusionArgs{
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksApplianceSecurityIntrusionExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupApplianceSecurityIntrusion(ctx *pulumi.Context, args *LookupApplianceSecurityIntrusionArgs, opts ...pulumi.InvokeOption) (*LookupApplianceSecurityIntrusionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApplianceSecurityIntrusionResult
	err := ctx.Invoke("meraki:networks/getApplianceSecurityIntrusion:getApplianceSecurityIntrusion", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplianceSecurityIntrusion.
type LookupApplianceSecurityIntrusionArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getApplianceSecurityIntrusion.
type LookupApplianceSecurityIntrusionResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                            `pulumi:"id"`
	Item GetApplianceSecurityIntrusionItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func LookupApplianceSecurityIntrusionOutput(ctx *pulumi.Context, args LookupApplianceSecurityIntrusionOutputArgs, opts ...pulumi.InvokeOption) LookupApplianceSecurityIntrusionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupApplianceSecurityIntrusionResult, error) {
			args := v.(LookupApplianceSecurityIntrusionArgs)
			r, err := LookupApplianceSecurityIntrusion(ctx, &args, opts...)
			var s LookupApplianceSecurityIntrusionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupApplianceSecurityIntrusionResultOutput)
}

// A collection of arguments for invoking getApplianceSecurityIntrusion.
type LookupApplianceSecurityIntrusionOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (LookupApplianceSecurityIntrusionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceSecurityIntrusionArgs)(nil)).Elem()
}

// A collection of values returned by getApplianceSecurityIntrusion.
type LookupApplianceSecurityIntrusionResultOutput struct{ *pulumi.OutputState }

func (LookupApplianceSecurityIntrusionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceSecurityIntrusionResult)(nil)).Elem()
}

func (o LookupApplianceSecurityIntrusionResultOutput) ToLookupApplianceSecurityIntrusionResultOutput() LookupApplianceSecurityIntrusionResultOutput {
	return o
}

func (o LookupApplianceSecurityIntrusionResultOutput) ToLookupApplianceSecurityIntrusionResultOutputWithContext(ctx context.Context) LookupApplianceSecurityIntrusionResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApplianceSecurityIntrusionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceSecurityIntrusionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupApplianceSecurityIntrusionResultOutput) Item() GetApplianceSecurityIntrusionItemOutput {
	return o.ApplyT(func(v LookupApplianceSecurityIntrusionResult) GetApplianceSecurityIntrusionItem { return v.Item }).(GetApplianceSecurityIntrusionItemOutput)
}

// networkId path parameter. Network ID
func (o LookupApplianceSecurityIntrusionResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceSecurityIntrusionResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplianceSecurityIntrusionResultOutput{})
}