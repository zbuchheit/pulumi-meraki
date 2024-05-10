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
func LookupAdaptivePolicyAcls(ctx *pulumi.Context, args *LookupAdaptivePolicyAclsArgs, opts ...pulumi.InvokeOption) (*LookupAdaptivePolicyAclsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAdaptivePolicyAclsResult
	err := ctx.Invoke("meraki:organizations/getAdaptivePolicyAcls:getAdaptivePolicyAcls", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAdaptivePolicyAcls.
type LookupAdaptivePolicyAclsArgs struct {
	// aclId path parameter. Acl ID
	AclId *string `pulumi:"aclId"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
}

// A collection of values returned by getAdaptivePolicyAcls.
type LookupAdaptivePolicyAclsResult struct {
	// aclId path parameter. Acl ID
	AclId *string `pulumi:"aclId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string                    `pulumi:"id"`
	Item GetAdaptivePolicyAclsItem `pulumi:"item"`
	// Array of ResponseOrganizationsGetOrganizationAdaptivePolicyAcls
	Items []GetAdaptivePolicyAclsItem `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
}

func LookupAdaptivePolicyAclsOutput(ctx *pulumi.Context, args LookupAdaptivePolicyAclsOutputArgs, opts ...pulumi.InvokeOption) LookupAdaptivePolicyAclsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAdaptivePolicyAclsResult, error) {
			args := v.(LookupAdaptivePolicyAclsArgs)
			r, err := LookupAdaptivePolicyAcls(ctx, &args, opts...)
			var s LookupAdaptivePolicyAclsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAdaptivePolicyAclsResultOutput)
}

// A collection of arguments for invoking getAdaptivePolicyAcls.
type LookupAdaptivePolicyAclsOutputArgs struct {
	// aclId path parameter. Acl ID
	AclId pulumi.StringPtrInput `pulumi:"aclId"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput `pulumi:"organizationId"`
}

func (LookupAdaptivePolicyAclsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAdaptivePolicyAclsArgs)(nil)).Elem()
}

// A collection of values returned by getAdaptivePolicyAcls.
type LookupAdaptivePolicyAclsResultOutput struct{ *pulumi.OutputState }

func (LookupAdaptivePolicyAclsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAdaptivePolicyAclsResult)(nil)).Elem()
}

func (o LookupAdaptivePolicyAclsResultOutput) ToLookupAdaptivePolicyAclsResultOutput() LookupAdaptivePolicyAclsResultOutput {
	return o
}

func (o LookupAdaptivePolicyAclsResultOutput) ToLookupAdaptivePolicyAclsResultOutputWithContext(ctx context.Context) LookupAdaptivePolicyAclsResultOutput {
	return o
}

// aclId path parameter. Acl ID
func (o LookupAdaptivePolicyAclsResultOutput) AclId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAdaptivePolicyAclsResult) *string { return v.AclId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAdaptivePolicyAclsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdaptivePolicyAclsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAdaptivePolicyAclsResultOutput) Item() GetAdaptivePolicyAclsItemOutput {
	return o.ApplyT(func(v LookupAdaptivePolicyAclsResult) GetAdaptivePolicyAclsItem { return v.Item }).(GetAdaptivePolicyAclsItemOutput)
}

// Array of ResponseOrganizationsGetOrganizationAdaptivePolicyAcls
func (o LookupAdaptivePolicyAclsResultOutput) Items() GetAdaptivePolicyAclsItemArrayOutput {
	return o.ApplyT(func(v LookupAdaptivePolicyAclsResult) []GetAdaptivePolicyAclsItem { return v.Items }).(GetAdaptivePolicyAclsItemArrayOutput)
}

// organizationId path parameter. Organization ID
func (o LookupAdaptivePolicyAclsResultOutput) OrganizationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAdaptivePolicyAclsResult) *string { return v.OrganizationId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAdaptivePolicyAclsResultOutput{})
}
