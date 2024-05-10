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
//			example, err := networks.GetSmDevicesDeviceProfiles(ctx, &networks.GetSmDevicesDeviceProfilesArgs{
//				DeviceId:  "string",
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSmDevicesDeviceProfilesExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetSmDevicesDeviceProfiles(ctx *pulumi.Context, args *GetSmDevicesDeviceProfilesArgs, opts ...pulumi.InvokeOption) (*GetSmDevicesDeviceProfilesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSmDevicesDeviceProfilesResult
	err := ctx.Invoke("meraki:networks/getSmDevicesDeviceProfiles:getSmDevicesDeviceProfiles", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSmDevicesDeviceProfiles.
type GetSmDevicesDeviceProfilesArgs struct {
	// deviceId path parameter. Device ID
	DeviceId string `pulumi:"deviceId"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getSmDevicesDeviceProfiles.
type GetSmDevicesDeviceProfilesResult struct {
	// deviceId path parameter. Device ID
	DeviceId string `pulumi:"deviceId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseSmGetNetworkSmDeviceDeviceProfiles
	Items []GetSmDevicesDeviceProfilesItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func GetSmDevicesDeviceProfilesOutput(ctx *pulumi.Context, args GetSmDevicesDeviceProfilesOutputArgs, opts ...pulumi.InvokeOption) GetSmDevicesDeviceProfilesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSmDevicesDeviceProfilesResult, error) {
			args := v.(GetSmDevicesDeviceProfilesArgs)
			r, err := GetSmDevicesDeviceProfiles(ctx, &args, opts...)
			var s GetSmDevicesDeviceProfilesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSmDevicesDeviceProfilesResultOutput)
}

// A collection of arguments for invoking getSmDevicesDeviceProfiles.
type GetSmDevicesDeviceProfilesOutputArgs struct {
	// deviceId path parameter. Device ID
	DeviceId pulumi.StringInput `pulumi:"deviceId"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (GetSmDevicesDeviceProfilesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmDevicesDeviceProfilesArgs)(nil)).Elem()
}

// A collection of values returned by getSmDevicesDeviceProfiles.
type GetSmDevicesDeviceProfilesResultOutput struct{ *pulumi.OutputState }

func (GetSmDevicesDeviceProfilesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmDevicesDeviceProfilesResult)(nil)).Elem()
}

func (o GetSmDevicesDeviceProfilesResultOutput) ToGetSmDevicesDeviceProfilesResultOutput() GetSmDevicesDeviceProfilesResultOutput {
	return o
}

func (o GetSmDevicesDeviceProfilesResultOutput) ToGetSmDevicesDeviceProfilesResultOutputWithContext(ctx context.Context) GetSmDevicesDeviceProfilesResultOutput {
	return o
}

// deviceId path parameter. Device ID
func (o GetSmDevicesDeviceProfilesResultOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesDeviceProfilesResult) string { return v.DeviceId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSmDevicesDeviceProfilesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesDeviceProfilesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseSmGetNetworkSmDeviceDeviceProfiles
func (o GetSmDevicesDeviceProfilesResultOutput) Items() GetSmDevicesDeviceProfilesItemArrayOutput {
	return o.ApplyT(func(v GetSmDevicesDeviceProfilesResult) []GetSmDevicesDeviceProfilesItem { return v.Items }).(GetSmDevicesDeviceProfilesItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetSmDevicesDeviceProfilesResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesDeviceProfilesResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSmDevicesDeviceProfilesResultOutput{})
}
