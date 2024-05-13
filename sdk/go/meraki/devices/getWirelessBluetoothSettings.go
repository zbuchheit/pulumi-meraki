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
//			example, err := devices.LookupWirelessBluetoothSettings(ctx, &devices.LookupWirelessBluetoothSettingsArgs{
//				Serial: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesWirelessBluetoothSettingsExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupWirelessBluetoothSettings(ctx *pulumi.Context, args *LookupWirelessBluetoothSettingsArgs, opts ...pulumi.InvokeOption) (*LookupWirelessBluetoothSettingsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWirelessBluetoothSettingsResult
	err := ctx.Invoke("meraki:devices/getWirelessBluetoothSettings:getWirelessBluetoothSettings", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessBluetoothSettings.
type LookupWirelessBluetoothSettingsArgs struct {
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// A collection of values returned by getWirelessBluetoothSettings.
type LookupWirelessBluetoothSettingsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                           `pulumi:"id"`
	Item GetWirelessBluetoothSettingsItem `pulumi:"item"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

func LookupWirelessBluetoothSettingsOutput(ctx *pulumi.Context, args LookupWirelessBluetoothSettingsOutputArgs, opts ...pulumi.InvokeOption) LookupWirelessBluetoothSettingsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupWirelessBluetoothSettingsResult, error) {
			args := v.(LookupWirelessBluetoothSettingsArgs)
			r, err := LookupWirelessBluetoothSettings(ctx, &args, opts...)
			var s LookupWirelessBluetoothSettingsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupWirelessBluetoothSettingsResultOutput)
}

// A collection of arguments for invoking getWirelessBluetoothSettings.
type LookupWirelessBluetoothSettingsOutputArgs struct {
	// serial path parameter.
	Serial pulumi.StringInput `pulumi:"serial"`
}

func (LookupWirelessBluetoothSettingsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessBluetoothSettingsArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessBluetoothSettings.
type LookupWirelessBluetoothSettingsResultOutput struct{ *pulumi.OutputState }

func (LookupWirelessBluetoothSettingsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessBluetoothSettingsResult)(nil)).Elem()
}

func (o LookupWirelessBluetoothSettingsResultOutput) ToLookupWirelessBluetoothSettingsResultOutput() LookupWirelessBluetoothSettingsResultOutput {
	return o
}

func (o LookupWirelessBluetoothSettingsResultOutput) ToLookupWirelessBluetoothSettingsResultOutputWithContext(ctx context.Context) LookupWirelessBluetoothSettingsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWirelessBluetoothSettingsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessBluetoothSettingsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupWirelessBluetoothSettingsResultOutput) Item() GetWirelessBluetoothSettingsItemOutput {
	return o.ApplyT(func(v LookupWirelessBluetoothSettingsResult) GetWirelessBluetoothSettingsItem { return v.Item }).(GetWirelessBluetoothSettingsItemOutput)
}

// serial path parameter.
func (o LookupWirelessBluetoothSettingsResultOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessBluetoothSettingsResult) string { return v.Serial }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWirelessBluetoothSettingsResultOutput{})
}