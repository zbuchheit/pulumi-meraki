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
//			example, err := devices.LookupCameraQualityAndRetention(ctx, &devices.LookupCameraQualityAndRetentionArgs{
//				Serial: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesCameraQualityAndRetentionExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupCameraQualityAndRetention(ctx *pulumi.Context, args *LookupCameraQualityAndRetentionArgs, opts ...pulumi.InvokeOption) (*LookupCameraQualityAndRetentionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCameraQualityAndRetentionResult
	err := ctx.Invoke("meraki:devices/getCameraQualityAndRetention:getCameraQualityAndRetention", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCameraQualityAndRetention.
type LookupCameraQualityAndRetentionArgs struct {
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// A collection of values returned by getCameraQualityAndRetention.
type LookupCameraQualityAndRetentionResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                           `pulumi:"id"`
	Item GetCameraQualityAndRetentionItem `pulumi:"item"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

func LookupCameraQualityAndRetentionOutput(ctx *pulumi.Context, args LookupCameraQualityAndRetentionOutputArgs, opts ...pulumi.InvokeOption) LookupCameraQualityAndRetentionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCameraQualityAndRetentionResult, error) {
			args := v.(LookupCameraQualityAndRetentionArgs)
			r, err := LookupCameraQualityAndRetention(ctx, &args, opts...)
			var s LookupCameraQualityAndRetentionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCameraQualityAndRetentionResultOutput)
}

// A collection of arguments for invoking getCameraQualityAndRetention.
type LookupCameraQualityAndRetentionOutputArgs struct {
	// serial path parameter.
	Serial pulumi.StringInput `pulumi:"serial"`
}

func (LookupCameraQualityAndRetentionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCameraQualityAndRetentionArgs)(nil)).Elem()
}

// A collection of values returned by getCameraQualityAndRetention.
type LookupCameraQualityAndRetentionResultOutput struct{ *pulumi.OutputState }

func (LookupCameraQualityAndRetentionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCameraQualityAndRetentionResult)(nil)).Elem()
}

func (o LookupCameraQualityAndRetentionResultOutput) ToLookupCameraQualityAndRetentionResultOutput() LookupCameraQualityAndRetentionResultOutput {
	return o
}

func (o LookupCameraQualityAndRetentionResultOutput) ToLookupCameraQualityAndRetentionResultOutputWithContext(ctx context.Context) LookupCameraQualityAndRetentionResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCameraQualityAndRetentionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCameraQualityAndRetentionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCameraQualityAndRetentionResultOutput) Item() GetCameraQualityAndRetentionItemOutput {
	return o.ApplyT(func(v LookupCameraQualityAndRetentionResult) GetCameraQualityAndRetentionItem { return v.Item }).(GetCameraQualityAndRetentionItemOutput)
}

// serial path parameter.
func (o LookupCameraQualityAndRetentionResultOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCameraQualityAndRetentionResult) string { return v.Serial }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCameraQualityAndRetentionResultOutput{})
}