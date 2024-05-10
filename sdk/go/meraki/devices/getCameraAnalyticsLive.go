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
//			example, err := devices.GetCameraAnalyticsLive(ctx, &devices.GetCameraAnalyticsLiveArgs{
//				Serial: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesCameraAnalyticsLiveExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetCameraAnalyticsLive(ctx *pulumi.Context, args *GetCameraAnalyticsLiveArgs, opts ...pulumi.InvokeOption) (*GetCameraAnalyticsLiveResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCameraAnalyticsLiveResult
	err := ctx.Invoke("meraki:devices/getCameraAnalyticsLive:getCameraAnalyticsLive", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCameraAnalyticsLive.
type GetCameraAnalyticsLiveArgs struct {
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// A collection of values returned by getCameraAnalyticsLive.
type GetCameraAnalyticsLiveResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                     `pulumi:"id"`
	Item GetCameraAnalyticsLiveItem `pulumi:"item"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

func GetCameraAnalyticsLiveOutput(ctx *pulumi.Context, args GetCameraAnalyticsLiveOutputArgs, opts ...pulumi.InvokeOption) GetCameraAnalyticsLiveResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCameraAnalyticsLiveResult, error) {
			args := v.(GetCameraAnalyticsLiveArgs)
			r, err := GetCameraAnalyticsLive(ctx, &args, opts...)
			var s GetCameraAnalyticsLiveResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCameraAnalyticsLiveResultOutput)
}

// A collection of arguments for invoking getCameraAnalyticsLive.
type GetCameraAnalyticsLiveOutputArgs struct {
	// serial path parameter.
	Serial pulumi.StringInput `pulumi:"serial"`
}

func (GetCameraAnalyticsLiveOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCameraAnalyticsLiveArgs)(nil)).Elem()
}

// A collection of values returned by getCameraAnalyticsLive.
type GetCameraAnalyticsLiveResultOutput struct{ *pulumi.OutputState }

func (GetCameraAnalyticsLiveResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCameraAnalyticsLiveResult)(nil)).Elem()
}

func (o GetCameraAnalyticsLiveResultOutput) ToGetCameraAnalyticsLiveResultOutput() GetCameraAnalyticsLiveResultOutput {
	return o
}

func (o GetCameraAnalyticsLiveResultOutput) ToGetCameraAnalyticsLiveResultOutputWithContext(ctx context.Context) GetCameraAnalyticsLiveResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetCameraAnalyticsLiveResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCameraAnalyticsLiveResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetCameraAnalyticsLiveResultOutput) Item() GetCameraAnalyticsLiveItemOutput {
	return o.ApplyT(func(v GetCameraAnalyticsLiveResult) GetCameraAnalyticsLiveItem { return v.Item }).(GetCameraAnalyticsLiveItemOutput)
}

// serial path parameter.
func (o GetCameraAnalyticsLiveResultOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v GetCameraAnalyticsLiveResult) string { return v.Serial }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCameraAnalyticsLiveResultOutput{})
}
