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
//			example, err := organizations.GetSummaryTopClientsByUsage(ctx, &organizations.GetSummaryTopClientsByUsageArgs{
//				OrganizationId: "string",
//				T0:             pulumi.StringRef("string"),
//				T1:             pulumi.StringRef("string"),
//				Timespan:       pulumi.Float64Ref(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsSummaryTopClientsByUsageExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetSummaryTopClientsByUsage(ctx *pulumi.Context, args *GetSummaryTopClientsByUsageArgs, opts ...pulumi.InvokeOption) (*GetSummaryTopClientsByUsageResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSummaryTopClientsByUsageResult
	err := ctx.Invoke("meraki:organizations/getSummaryTopClientsByUsage:getSummaryTopClientsByUsage", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSummaryTopClientsByUsage.
type GetSummaryTopClientsByUsageArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// t0 query parameter. The beginning of the timespan for the data.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 8 hours and be less than or equal to 31 days. The default is 1 day.
	Timespan *float64 `pulumi:"timespan"`
}

// A collection of values returned by getSummaryTopClientsByUsage.
type GetSummaryTopClientsByUsageResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseOrganizationsGetOrganizationSummaryTopClientsByUsage
	Items []GetSummaryTopClientsByUsageItem `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// t0 query parameter. The beginning of the timespan for the data.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 8 hours and be less than or equal to 31 days. The default is 1 day.
	Timespan *float64 `pulumi:"timespan"`
}

func GetSummaryTopClientsByUsageOutput(ctx *pulumi.Context, args GetSummaryTopClientsByUsageOutputArgs, opts ...pulumi.InvokeOption) GetSummaryTopClientsByUsageResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSummaryTopClientsByUsageResult, error) {
			args := v.(GetSummaryTopClientsByUsageArgs)
			r, err := GetSummaryTopClientsByUsage(ctx, &args, opts...)
			var s GetSummaryTopClientsByUsageResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSummaryTopClientsByUsageResultOutput)
}

// A collection of arguments for invoking getSummaryTopClientsByUsage.
type GetSummaryTopClientsByUsageOutputArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// t0 query parameter. The beginning of the timespan for the data.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 8 hours and be less than or equal to 31 days. The default is 1 day.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
}

func (GetSummaryTopClientsByUsageOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSummaryTopClientsByUsageArgs)(nil)).Elem()
}

// A collection of values returned by getSummaryTopClientsByUsage.
type GetSummaryTopClientsByUsageResultOutput struct{ *pulumi.OutputState }

func (GetSummaryTopClientsByUsageResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSummaryTopClientsByUsageResult)(nil)).Elem()
}

func (o GetSummaryTopClientsByUsageResultOutput) ToGetSummaryTopClientsByUsageResultOutput() GetSummaryTopClientsByUsageResultOutput {
	return o
}

func (o GetSummaryTopClientsByUsageResultOutput) ToGetSummaryTopClientsByUsageResultOutputWithContext(ctx context.Context) GetSummaryTopClientsByUsageResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSummaryTopClientsByUsageResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSummaryTopClientsByUsageResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseOrganizationsGetOrganizationSummaryTopClientsByUsage
func (o GetSummaryTopClientsByUsageResultOutput) Items() GetSummaryTopClientsByUsageItemArrayOutput {
	return o.ApplyT(func(v GetSummaryTopClientsByUsageResult) []GetSummaryTopClientsByUsageItem { return v.Items }).(GetSummaryTopClientsByUsageItemArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetSummaryTopClientsByUsageResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSummaryTopClientsByUsageResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// t0 query parameter. The beginning of the timespan for the data.
func (o GetSummaryTopClientsByUsageResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSummaryTopClientsByUsageResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
func (o GetSummaryTopClientsByUsageResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSummaryTopClientsByUsageResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 8 hours and be less than or equal to 31 days. The default is 1 day.
func (o GetSummaryTopClientsByUsageResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetSummaryTopClientsByUsageResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSummaryTopClientsByUsageResultOutput{})
}