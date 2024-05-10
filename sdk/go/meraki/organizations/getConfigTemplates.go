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
func LookupConfigTemplates(ctx *pulumi.Context, args *LookupConfigTemplatesArgs, opts ...pulumi.InvokeOption) (*LookupConfigTemplatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConfigTemplatesResult
	err := ctx.Invoke("meraki:organizations/getConfigTemplates:getConfigTemplates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConfigTemplates.
type LookupConfigTemplatesArgs struct {
	// configTemplateId path parameter. Config template ID
	ConfigTemplateId *string `pulumi:"configTemplateId"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
}

// A collection of values returned by getConfigTemplates.
type LookupConfigTemplatesResult struct {
	// configTemplateId path parameter. Config template ID
	ConfigTemplateId *string `pulumi:"configTemplateId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string                 `pulumi:"id"`
	Item GetConfigTemplatesItem `pulumi:"item"`
	// Array of ResponseOrganizationsGetOrganizationConfigTemplates
	Items []GetConfigTemplatesItem `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
}

func LookupConfigTemplatesOutput(ctx *pulumi.Context, args LookupConfigTemplatesOutputArgs, opts ...pulumi.InvokeOption) LookupConfigTemplatesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConfigTemplatesResult, error) {
			args := v.(LookupConfigTemplatesArgs)
			r, err := LookupConfigTemplates(ctx, &args, opts...)
			var s LookupConfigTemplatesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupConfigTemplatesResultOutput)
}

// A collection of arguments for invoking getConfigTemplates.
type LookupConfigTemplatesOutputArgs struct {
	// configTemplateId path parameter. Config template ID
	ConfigTemplateId pulumi.StringPtrInput `pulumi:"configTemplateId"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput `pulumi:"organizationId"`
}

func (LookupConfigTemplatesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConfigTemplatesArgs)(nil)).Elem()
}

// A collection of values returned by getConfigTemplates.
type LookupConfigTemplatesResultOutput struct{ *pulumi.OutputState }

func (LookupConfigTemplatesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConfigTemplatesResult)(nil)).Elem()
}

func (o LookupConfigTemplatesResultOutput) ToLookupConfigTemplatesResultOutput() LookupConfigTemplatesResultOutput {
	return o
}

func (o LookupConfigTemplatesResultOutput) ToLookupConfigTemplatesResultOutputWithContext(ctx context.Context) LookupConfigTemplatesResultOutput {
	return o
}

// configTemplateId path parameter. Config template ID
func (o LookupConfigTemplatesResultOutput) ConfigTemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConfigTemplatesResult) *string { return v.ConfigTemplateId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConfigTemplatesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigTemplatesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupConfigTemplatesResultOutput) Item() GetConfigTemplatesItemOutput {
	return o.ApplyT(func(v LookupConfigTemplatesResult) GetConfigTemplatesItem { return v.Item }).(GetConfigTemplatesItemOutput)
}

// Array of ResponseOrganizationsGetOrganizationConfigTemplates
func (o LookupConfigTemplatesResultOutput) Items() GetConfigTemplatesItemArrayOutput {
	return o.ApplyT(func(v LookupConfigTemplatesResult) []GetConfigTemplatesItem { return v.Items }).(GetConfigTemplatesItemArrayOutput)
}

// organizationId path parameter. Organization ID
func (o LookupConfigTemplatesResultOutput) OrganizationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConfigTemplatesResult) *string { return v.OrganizationId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConfigTemplatesResultOutput{})
}
