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
//			example, err := organizations.GetWebhooksLogs(ctx, &organizations.GetWebhooksLogsArgs{
//				EndingBefore:   pulumi.StringRef("string"),
//				OrganizationId: "string",
//				PerPage:        pulumi.IntRef(1),
//				StartingAfter:  pulumi.StringRef("string"),
//				T0:             pulumi.StringRef("string"),
//				T1:             pulumi.StringRef("string"),
//				Timespan:       pulumi.Float64Ref(1),
//				Url:            pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsWebhooksLogsExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetWebhooksLogs(ctx *pulumi.Context, args *GetWebhooksLogsArgs, opts ...pulumi.InvokeOption) (*GetWebhooksLogsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWebhooksLogsResult
	err := ctx.Invoke("meraki:organizations/getWebhooksLogs:getWebhooksLogs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWebhooksLogs.
type GetWebhooksLogsArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
	PerPage *int `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
	Timespan *float64 `pulumi:"timespan"`
	// url query parameter. The URL the webhook was sent to
	Url *string `pulumi:"url"`
}

// A collection of values returned by getWebhooksLogs.
type GetWebhooksLogsResult struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseOrganizationsGetOrganizationWebhooksLogs
	Items []GetWebhooksLogsItem `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
	PerPage *int `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
	Timespan *float64 `pulumi:"timespan"`
	// url query parameter. The URL the webhook was sent to
	Url *string `pulumi:"url"`
}

func GetWebhooksLogsOutput(ctx *pulumi.Context, args GetWebhooksLogsOutputArgs, opts ...pulumi.InvokeOption) GetWebhooksLogsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetWebhooksLogsResult, error) {
			args := v.(GetWebhooksLogsArgs)
			r, err := GetWebhooksLogs(ctx, &args, opts...)
			var s GetWebhooksLogsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetWebhooksLogsResultOutput)
}

// A collection of arguments for invoking getWebhooksLogs.
type GetWebhooksLogsOutputArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
	// url query parameter. The URL the webhook was sent to
	Url pulumi.StringPtrInput `pulumi:"url"`
}

func (GetWebhooksLogsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWebhooksLogsArgs)(nil)).Elem()
}

// A collection of values returned by getWebhooksLogs.
type GetWebhooksLogsResultOutput struct{ *pulumi.OutputState }

func (GetWebhooksLogsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWebhooksLogsResult)(nil)).Elem()
}

func (o GetWebhooksLogsResultOutput) ToGetWebhooksLogsResultOutput() GetWebhooksLogsResultOutput {
	return o
}

func (o GetWebhooksLogsResultOutput) ToGetWebhooksLogsResultOutputWithContext(ctx context.Context) GetWebhooksLogsResultOutput {
	return o
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetWebhooksLogsResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWebhooksLogsResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWebhooksLogsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWebhooksLogsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseOrganizationsGetOrganizationWebhooksLogs
func (o GetWebhooksLogsResultOutput) Items() GetWebhooksLogsItemArrayOutput {
	return o.ApplyT(func(v GetWebhooksLogsResult) []GetWebhooksLogsItem { return v.Items }).(GetWebhooksLogsItemArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetWebhooksLogsResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWebhooksLogsResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
func (o GetWebhooksLogsResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWebhooksLogsResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetWebhooksLogsResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWebhooksLogsResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
func (o GetWebhooksLogsResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWebhooksLogsResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
func (o GetWebhooksLogsResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWebhooksLogsResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
func (o GetWebhooksLogsResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetWebhooksLogsResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

// url query parameter. The URL the webhook was sent to
func (o GetWebhooksLogsResultOutput) Url() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWebhooksLogsResult) *string { return v.Url }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWebhooksLogsResultOutput{})
}