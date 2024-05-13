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
func LookupGroupPolicies(ctx *pulumi.Context, args *LookupGroupPoliciesArgs, opts ...pulumi.InvokeOption) (*LookupGroupPoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGroupPoliciesResult
	err := ctx.Invoke("meraki:networks/getGroupPolicies:getGroupPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGroupPolicies.
type LookupGroupPoliciesArgs struct {
	// groupPolicyId path parameter. Group policy ID
	GroupPolicyId *string `pulumi:"groupPolicyId"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
}

// A collection of values returned by getGroupPolicies.
type LookupGroupPoliciesResult struct {
	// groupPolicyId path parameter. Group policy ID
	GroupPolicyId *string `pulumi:"groupPolicyId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string               `pulumi:"id"`
	Item GetGroupPoliciesItem `pulumi:"item"`
	// Array of ResponseNetworksGetNetworkGroupPolicies
	Items []GetGroupPoliciesItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
}

func LookupGroupPoliciesOutput(ctx *pulumi.Context, args LookupGroupPoliciesOutputArgs, opts ...pulumi.InvokeOption) LookupGroupPoliciesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGroupPoliciesResult, error) {
			args := v.(LookupGroupPoliciesArgs)
			r, err := LookupGroupPolicies(ctx, &args, opts...)
			var s LookupGroupPoliciesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupGroupPoliciesResultOutput)
}

// A collection of arguments for invoking getGroupPolicies.
type LookupGroupPoliciesOutputArgs struct {
	// groupPolicyId path parameter. Group policy ID
	GroupPolicyId pulumi.StringPtrInput `pulumi:"groupPolicyId"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput `pulumi:"networkId"`
}

func (LookupGroupPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGroupPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getGroupPolicies.
type LookupGroupPoliciesResultOutput struct{ *pulumi.OutputState }

func (LookupGroupPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGroupPoliciesResult)(nil)).Elem()
}

func (o LookupGroupPoliciesResultOutput) ToLookupGroupPoliciesResultOutput() LookupGroupPoliciesResultOutput {
	return o
}

func (o LookupGroupPoliciesResultOutput) ToLookupGroupPoliciesResultOutputWithContext(ctx context.Context) LookupGroupPoliciesResultOutput {
	return o
}

// groupPolicyId path parameter. Group policy ID
func (o LookupGroupPoliciesResultOutput) GroupPolicyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGroupPoliciesResult) *string { return v.GroupPolicyId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGroupPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupGroupPoliciesResultOutput) Item() GetGroupPoliciesItemOutput {
	return o.ApplyT(func(v LookupGroupPoliciesResult) GetGroupPoliciesItem { return v.Item }).(GetGroupPoliciesItemOutput)
}

// Array of ResponseNetworksGetNetworkGroupPolicies
func (o LookupGroupPoliciesResultOutput) Items() GetGroupPoliciesItemArrayOutput {
	return o.ApplyT(func(v LookupGroupPoliciesResult) []GetGroupPoliciesItem { return v.Items }).(GetGroupPoliciesItemArrayOutput)
}

// networkId path parameter. Network ID
func (o LookupGroupPoliciesResultOutput) NetworkId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGroupPoliciesResult) *string { return v.NetworkId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGroupPoliciesResultOutput{})
}