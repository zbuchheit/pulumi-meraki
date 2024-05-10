// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devices

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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/devices"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := devices.GetAppliancePerformance(ctx, &devices.GetAppliancePerformanceArgs{
//				Serial: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesAppliancePerformanceExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetAppliancePerformance(ctx *pulumi.Context, args *GetAppliancePerformanceArgs, opts ...pulumi.InvokeOption) (*GetAppliancePerformanceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAppliancePerformanceResult
	err := ctx.Invoke("meraki:devices/getAppliancePerformance:getAppliancePerformance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppliancePerformance.
type GetAppliancePerformanceArgs struct {
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// A collection of values returned by getAppliancePerformance.
type GetAppliancePerformanceResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                      `pulumi:"id"`
	Item GetAppliancePerformanceItem `pulumi:"item"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

func GetAppliancePerformanceOutput(ctx *pulumi.Context, args GetAppliancePerformanceOutputArgs, opts ...pulumi.InvokeOption) GetAppliancePerformanceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAppliancePerformanceResult, error) {
			args := v.(GetAppliancePerformanceArgs)
			r, err := GetAppliancePerformance(ctx, &args, opts...)
			var s GetAppliancePerformanceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAppliancePerformanceResultOutput)
}

// A collection of arguments for invoking getAppliancePerformance.
type GetAppliancePerformanceOutputArgs struct {
	// serial path parameter.
	Serial pulumi.StringInput `pulumi:"serial"`
}

func (GetAppliancePerformanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppliancePerformanceArgs)(nil)).Elem()
}

// A collection of values returned by getAppliancePerformance.
type GetAppliancePerformanceResultOutput struct{ *pulumi.OutputState }

func (GetAppliancePerformanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppliancePerformanceResult)(nil)).Elem()
}

func (o GetAppliancePerformanceResultOutput) ToGetAppliancePerformanceResultOutput() GetAppliancePerformanceResultOutput {
	return o
}

func (o GetAppliancePerformanceResultOutput) ToGetAppliancePerformanceResultOutputWithContext(ctx context.Context) GetAppliancePerformanceResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetAppliancePerformanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppliancePerformanceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAppliancePerformanceResultOutput) Item() GetAppliancePerformanceItemOutput {
	return o.ApplyT(func(v GetAppliancePerformanceResult) GetAppliancePerformanceItem { return v.Item }).(GetAppliancePerformanceItemOutput)
}

// serial path parameter.
func (o GetAppliancePerformanceResultOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppliancePerformanceResult) string { return v.Serial }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAppliancePerformanceResultOutput{})
}
