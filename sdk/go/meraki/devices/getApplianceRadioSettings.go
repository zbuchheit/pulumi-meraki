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
//			example, err := devices.LookupApplianceRadioSettings(ctx, &devices.LookupApplianceRadioSettingsArgs{
//				Serial: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesApplianceRadioSettingsExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupApplianceRadioSettings(ctx *pulumi.Context, args *LookupApplianceRadioSettingsArgs, opts ...pulumi.InvokeOption) (*LookupApplianceRadioSettingsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApplianceRadioSettingsResult
	err := ctx.Invoke("meraki:devices/getApplianceRadioSettings:getApplianceRadioSettings", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplianceRadioSettings.
type LookupApplianceRadioSettingsArgs struct {
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// A collection of values returned by getApplianceRadioSettings.
type LookupApplianceRadioSettingsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                        `pulumi:"id"`
	Item GetApplianceRadioSettingsItem `pulumi:"item"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

func LookupApplianceRadioSettingsOutput(ctx *pulumi.Context, args LookupApplianceRadioSettingsOutputArgs, opts ...pulumi.InvokeOption) LookupApplianceRadioSettingsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupApplianceRadioSettingsResult, error) {
			args := v.(LookupApplianceRadioSettingsArgs)
			r, err := LookupApplianceRadioSettings(ctx, &args, opts...)
			var s LookupApplianceRadioSettingsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupApplianceRadioSettingsResultOutput)
}

// A collection of arguments for invoking getApplianceRadioSettings.
type LookupApplianceRadioSettingsOutputArgs struct {
	// serial path parameter.
	Serial pulumi.StringInput `pulumi:"serial"`
}

func (LookupApplianceRadioSettingsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceRadioSettingsArgs)(nil)).Elem()
}

// A collection of values returned by getApplianceRadioSettings.
type LookupApplianceRadioSettingsResultOutput struct{ *pulumi.OutputState }

func (LookupApplianceRadioSettingsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceRadioSettingsResult)(nil)).Elem()
}

func (o LookupApplianceRadioSettingsResultOutput) ToLookupApplianceRadioSettingsResultOutput() LookupApplianceRadioSettingsResultOutput {
	return o
}

func (o LookupApplianceRadioSettingsResultOutput) ToLookupApplianceRadioSettingsResultOutputWithContext(ctx context.Context) LookupApplianceRadioSettingsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApplianceRadioSettingsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceRadioSettingsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupApplianceRadioSettingsResultOutput) Item() GetApplianceRadioSettingsItemOutput {
	return o.ApplyT(func(v LookupApplianceRadioSettingsResult) GetApplianceRadioSettingsItem { return v.Item }).(GetApplianceRadioSettingsItemOutput)
}

// serial path parameter.
func (o LookupApplianceRadioSettingsResultOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceRadioSettingsResult) string { return v.Serial }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplianceRadioSettingsResultOutput{})
}
