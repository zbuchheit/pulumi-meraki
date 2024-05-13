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
//			example, err := organizations.GetDevicesStatusesOverview(ctx, &organizations.GetDevicesStatusesOverviewArgs{
//				NetworkIds: []string{
//					"string",
//				},
//				OrganizationId: "string",
//				ProductTypes: []string{
//					"string",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsDevicesStatusesOverviewExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetDevicesStatusesOverview(ctx *pulumi.Context, args *GetDevicesStatusesOverviewArgs, opts ...pulumi.InvokeOption) (*GetDevicesStatusesOverviewResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDevicesStatusesOverviewResult
	err := ctx.Invoke("meraki:organizations/getDevicesStatusesOverview:getDevicesStatusesOverview", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDevicesStatusesOverview.
type GetDevicesStatusesOverviewArgs struct {
	// networkIds query parameter. An optional parameter to filter device statuses by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// productTypes query parameter. An optional parameter to filter device statuses by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
	ProductTypes []string `pulumi:"productTypes"`
}

// A collection of values returned by getDevicesStatusesOverview.
type GetDevicesStatusesOverviewResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                         `pulumi:"id"`
	Item GetDevicesStatusesOverviewItem `pulumi:"item"`
	// networkIds query parameter. An optional parameter to filter device statuses by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// productTypes query parameter. An optional parameter to filter device statuses by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
	ProductTypes []string `pulumi:"productTypes"`
}

func GetDevicesStatusesOverviewOutput(ctx *pulumi.Context, args GetDevicesStatusesOverviewOutputArgs, opts ...pulumi.InvokeOption) GetDevicesStatusesOverviewResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDevicesStatusesOverviewResult, error) {
			args := v.(GetDevicesStatusesOverviewArgs)
			r, err := GetDevicesStatusesOverview(ctx, &args, opts...)
			var s GetDevicesStatusesOverviewResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDevicesStatusesOverviewResultOutput)
}

// A collection of arguments for invoking getDevicesStatusesOverview.
type GetDevicesStatusesOverviewOutputArgs struct {
	// networkIds query parameter. An optional parameter to filter device statuses by network.
	NetworkIds pulumi.StringArrayInput `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// productTypes query parameter. An optional parameter to filter device statuses by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
	ProductTypes pulumi.StringArrayInput `pulumi:"productTypes"`
}

func (GetDevicesStatusesOverviewOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicesStatusesOverviewArgs)(nil)).Elem()
}

// A collection of values returned by getDevicesStatusesOverview.
type GetDevicesStatusesOverviewResultOutput struct{ *pulumi.OutputState }

func (GetDevicesStatusesOverviewResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicesStatusesOverviewResult)(nil)).Elem()
}

func (o GetDevicesStatusesOverviewResultOutput) ToGetDevicesStatusesOverviewResultOutput() GetDevicesStatusesOverviewResultOutput {
	return o
}

func (o GetDevicesStatusesOverviewResultOutput) ToGetDevicesStatusesOverviewResultOutputWithContext(ctx context.Context) GetDevicesStatusesOverviewResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetDevicesStatusesOverviewResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicesStatusesOverviewResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDevicesStatusesOverviewResultOutput) Item() GetDevicesStatusesOverviewItemOutput {
	return o.ApplyT(func(v GetDevicesStatusesOverviewResult) GetDevicesStatusesOverviewItem { return v.Item }).(GetDevicesStatusesOverviewItemOutput)
}

// networkIds query parameter. An optional parameter to filter device statuses by network.
func (o GetDevicesStatusesOverviewResultOutput) NetworkIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesStatusesOverviewResult) []string { return v.NetworkIds }).(pulumi.StringArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetDevicesStatusesOverviewResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicesStatusesOverviewResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// productTypes query parameter. An optional parameter to filter device statuses by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
func (o GetDevicesStatusesOverviewResultOutput) ProductTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesStatusesOverviewResult) []string { return v.ProductTypes }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDevicesStatusesOverviewResultOutput{})
}