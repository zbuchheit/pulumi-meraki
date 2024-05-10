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
//			example, err := organizations.GetInsightApplications(ctx, &organizations.GetInsightApplicationsArgs{
//				OrganizationId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsInsightApplicationsExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetInsightApplications(ctx *pulumi.Context, args *GetInsightApplicationsArgs, opts ...pulumi.InvokeOption) (*GetInsightApplicationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInsightApplicationsResult
	err := ctx.Invoke("meraki:organizations/getInsightApplications:getInsightApplications", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInsightApplications.
type GetInsightApplicationsArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

// A collection of values returned by getInsightApplications.
type GetInsightApplicationsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseInsightGetOrganizationInsightApplications
	Items []GetInsightApplicationsItem `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

func GetInsightApplicationsOutput(ctx *pulumi.Context, args GetInsightApplicationsOutputArgs, opts ...pulumi.InvokeOption) GetInsightApplicationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInsightApplicationsResult, error) {
			args := v.(GetInsightApplicationsArgs)
			r, err := GetInsightApplications(ctx, &args, opts...)
			var s GetInsightApplicationsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetInsightApplicationsResultOutput)
}

// A collection of arguments for invoking getInsightApplications.
type GetInsightApplicationsOutputArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
}

func (GetInsightApplicationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInsightApplicationsArgs)(nil)).Elem()
}

// A collection of values returned by getInsightApplications.
type GetInsightApplicationsResultOutput struct{ *pulumi.OutputState }

func (GetInsightApplicationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInsightApplicationsResult)(nil)).Elem()
}

func (o GetInsightApplicationsResultOutput) ToGetInsightApplicationsResultOutput() GetInsightApplicationsResultOutput {
	return o
}

func (o GetInsightApplicationsResultOutput) ToGetInsightApplicationsResultOutputWithContext(ctx context.Context) GetInsightApplicationsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetInsightApplicationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInsightApplicationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseInsightGetOrganizationInsightApplications
func (o GetInsightApplicationsResultOutput) Items() GetInsightApplicationsItemArrayOutput {
	return o.ApplyT(func(v GetInsightApplicationsResult) []GetInsightApplicationsItem { return v.Items }).(GetInsightApplicationsItemArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetInsightApplicationsResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInsightApplicationsResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInsightApplicationsResultOutput{})
}
