// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := organizations.GetCameraBoundariesAreasByDevice(ctx, &organizations.GetCameraBoundariesAreasByDeviceArgs{
//				OrganizationId: "string",
//				Serials: []string{
//					"string",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsCameraBoundariesAreasByDeviceExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetCameraBoundariesAreasByDevice(ctx *pulumi.Context, args *GetCameraBoundariesAreasByDeviceArgs, opts ...pulumi.InvokeOption) (*GetCameraBoundariesAreasByDeviceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCameraBoundariesAreasByDeviceResult
	err := ctx.Invoke("meraki:organizations/getCameraBoundariesAreasByDevice:getCameraBoundariesAreasByDevice", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCameraBoundariesAreasByDevice.
type GetCameraBoundariesAreasByDeviceArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// serials query parameter. A list of serial numbers. The returned cameras will be filtered to only include these serials.
	Serials []string `pulumi:"serials"`
}

// A collection of values returned by getCameraBoundariesAreasByDevice.
type GetCameraBoundariesAreasByDeviceResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseCameraGetOrganizationCameraBoundariesAreasByDevice
	Items []GetCameraBoundariesAreasByDeviceItem `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// serials query parameter. A list of serial numbers. The returned cameras will be filtered to only include these serials.
	Serials []string `pulumi:"serials"`
}

func GetCameraBoundariesAreasByDeviceOutput(ctx *pulumi.Context, args GetCameraBoundariesAreasByDeviceOutputArgs, opts ...pulumi.InvokeOption) GetCameraBoundariesAreasByDeviceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCameraBoundariesAreasByDeviceResult, error) {
			args := v.(GetCameraBoundariesAreasByDeviceArgs)
			r, err := GetCameraBoundariesAreasByDevice(ctx, &args, opts...)
			var s GetCameraBoundariesAreasByDeviceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCameraBoundariesAreasByDeviceResultOutput)
}

// A collection of arguments for invoking getCameraBoundariesAreasByDevice.
type GetCameraBoundariesAreasByDeviceOutputArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// serials query parameter. A list of serial numbers. The returned cameras will be filtered to only include these serials.
	Serials pulumi.StringArrayInput `pulumi:"serials"`
}

func (GetCameraBoundariesAreasByDeviceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCameraBoundariesAreasByDeviceArgs)(nil)).Elem()
}

// A collection of values returned by getCameraBoundariesAreasByDevice.
type GetCameraBoundariesAreasByDeviceResultOutput struct{ *pulumi.OutputState }

func (GetCameraBoundariesAreasByDeviceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCameraBoundariesAreasByDeviceResult)(nil)).Elem()
}

func (o GetCameraBoundariesAreasByDeviceResultOutput) ToGetCameraBoundariesAreasByDeviceResultOutput() GetCameraBoundariesAreasByDeviceResultOutput {
	return o
}

func (o GetCameraBoundariesAreasByDeviceResultOutput) ToGetCameraBoundariesAreasByDeviceResultOutputWithContext(ctx context.Context) GetCameraBoundariesAreasByDeviceResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetCameraBoundariesAreasByDeviceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCameraBoundariesAreasByDeviceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseCameraGetOrganizationCameraBoundariesAreasByDevice
func (o GetCameraBoundariesAreasByDeviceResultOutput) Items() GetCameraBoundariesAreasByDeviceItemArrayOutput {
	return o.ApplyT(func(v GetCameraBoundariesAreasByDeviceResult) []GetCameraBoundariesAreasByDeviceItem { return v.Items }).(GetCameraBoundariesAreasByDeviceItemArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetCameraBoundariesAreasByDeviceResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetCameraBoundariesAreasByDeviceResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// serials query parameter. A list of serial numbers. The returned cameras will be filtered to only include these serials.
func (o GetCameraBoundariesAreasByDeviceResultOutput) Serials() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetCameraBoundariesAreasByDeviceResult) []string { return v.Serials }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCameraBoundariesAreasByDeviceResultOutput{})
}
