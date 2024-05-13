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
//			example, err := organizations.GetSummaryTopDevicesModelsByUsage(ctx, &organizations.GetSummaryTopDevicesModelsByUsageArgs{
//				OrganizationId: "string",
//				T0:             pulumi.StringRef("string"),
//				T1:             pulumi.StringRef("string"),
//				Timespan:       pulumi.Float64Ref(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsSummaryTopDevicesModelsByUsageExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetSummaryTopDevicesModelsByUsage(ctx *pulumi.Context, args *GetSummaryTopDevicesModelsByUsageArgs, opts ...pulumi.InvokeOption) (*GetSummaryTopDevicesModelsByUsageResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSummaryTopDevicesModelsByUsageResult
	err := ctx.Invoke("meraki:organizations/getSummaryTopDevicesModelsByUsage:getSummaryTopDevicesModelsByUsage", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSummaryTopDevicesModelsByUsage.
type GetSummaryTopDevicesModelsByUsageArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// t0 query parameter. The beginning of the timespan for the data.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 8 hours and be less than or equal to 31 days. The default is 1 day.
	Timespan *float64 `pulumi:"timespan"`
}

// A collection of values returned by getSummaryTopDevicesModelsByUsage.
type GetSummaryTopDevicesModelsByUsageResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseOrganizationsGetOrganizationSummaryTopDevicesModelsByUsage
	Items []GetSummaryTopDevicesModelsByUsageItem `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// t0 query parameter. The beginning of the timespan for the data.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 8 hours and be less than or equal to 31 days. The default is 1 day.
	Timespan *float64 `pulumi:"timespan"`
}

func GetSummaryTopDevicesModelsByUsageOutput(ctx *pulumi.Context, args GetSummaryTopDevicesModelsByUsageOutputArgs, opts ...pulumi.InvokeOption) GetSummaryTopDevicesModelsByUsageResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSummaryTopDevicesModelsByUsageResult, error) {
			args := v.(GetSummaryTopDevicesModelsByUsageArgs)
			r, err := GetSummaryTopDevicesModelsByUsage(ctx, &args, opts...)
			var s GetSummaryTopDevicesModelsByUsageResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSummaryTopDevicesModelsByUsageResultOutput)
}

// A collection of arguments for invoking getSummaryTopDevicesModelsByUsage.
type GetSummaryTopDevicesModelsByUsageOutputArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// t0 query parameter. The beginning of the timespan for the data.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 8 hours and be less than or equal to 31 days. The default is 1 day.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
}

func (GetSummaryTopDevicesModelsByUsageOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSummaryTopDevicesModelsByUsageArgs)(nil)).Elem()
}

// A collection of values returned by getSummaryTopDevicesModelsByUsage.
type GetSummaryTopDevicesModelsByUsageResultOutput struct{ *pulumi.OutputState }

func (GetSummaryTopDevicesModelsByUsageResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSummaryTopDevicesModelsByUsageResult)(nil)).Elem()
}

func (o GetSummaryTopDevicesModelsByUsageResultOutput) ToGetSummaryTopDevicesModelsByUsageResultOutput() GetSummaryTopDevicesModelsByUsageResultOutput {
	return o
}

func (o GetSummaryTopDevicesModelsByUsageResultOutput) ToGetSummaryTopDevicesModelsByUsageResultOutputWithContext(ctx context.Context) GetSummaryTopDevicesModelsByUsageResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSummaryTopDevicesModelsByUsageResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSummaryTopDevicesModelsByUsageResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseOrganizationsGetOrganizationSummaryTopDevicesModelsByUsage
func (o GetSummaryTopDevicesModelsByUsageResultOutput) Items() GetSummaryTopDevicesModelsByUsageItemArrayOutput {
	return o.ApplyT(func(v GetSummaryTopDevicesModelsByUsageResult) []GetSummaryTopDevicesModelsByUsageItem {
		return v.Items
	}).(GetSummaryTopDevicesModelsByUsageItemArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetSummaryTopDevicesModelsByUsageResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSummaryTopDevicesModelsByUsageResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// t0 query parameter. The beginning of the timespan for the data.
func (o GetSummaryTopDevicesModelsByUsageResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSummaryTopDevicesModelsByUsageResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
func (o GetSummaryTopDevicesModelsByUsageResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSummaryTopDevicesModelsByUsageResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 8 hours and be less than or equal to 31 days. The default is 1 day.
func (o GetSummaryTopDevicesModelsByUsageResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetSummaryTopDevicesModelsByUsageResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSummaryTopDevicesModelsByUsageResultOutput{})
}