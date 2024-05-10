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
func LookupSwitchAccessPolicies(ctx *pulumi.Context, args *LookupSwitchAccessPoliciesArgs, opts ...pulumi.InvokeOption) (*LookupSwitchAccessPoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSwitchAccessPoliciesResult
	err := ctx.Invoke("meraki:networks/getSwitchAccessPolicies:getSwitchAccessPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSwitchAccessPolicies.
type LookupSwitchAccessPoliciesArgs struct {
	// accessPolicyNumber path parameter. Access policy number
	AccessPolicyNumber *string `pulumi:"accessPolicyNumber"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
}

// A collection of values returned by getSwitchAccessPolicies.
type LookupSwitchAccessPoliciesResult struct {
	// accessPolicyNumber path parameter. Access policy number
	AccessPolicyNumber *string `pulumi:"accessPolicyNumber"`
	// The provider-assigned unique ID for this managed resource.
	Id   string                      `pulumi:"id"`
	Item GetSwitchAccessPoliciesItem `pulumi:"item"`
	// Array of ResponseSwitchGetNetworkSwitchAccessPolicies
	Items []GetSwitchAccessPoliciesItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
}

func LookupSwitchAccessPoliciesOutput(ctx *pulumi.Context, args LookupSwitchAccessPoliciesOutputArgs, opts ...pulumi.InvokeOption) LookupSwitchAccessPoliciesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSwitchAccessPoliciesResult, error) {
			args := v.(LookupSwitchAccessPoliciesArgs)
			r, err := LookupSwitchAccessPolicies(ctx, &args, opts...)
			var s LookupSwitchAccessPoliciesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSwitchAccessPoliciesResultOutput)
}

// A collection of arguments for invoking getSwitchAccessPolicies.
type LookupSwitchAccessPoliciesOutputArgs struct {
	// accessPolicyNumber path parameter. Access policy number
	AccessPolicyNumber pulumi.StringPtrInput `pulumi:"accessPolicyNumber"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput `pulumi:"networkId"`
}

func (LookupSwitchAccessPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchAccessPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getSwitchAccessPolicies.
type LookupSwitchAccessPoliciesResultOutput struct{ *pulumi.OutputState }

func (LookupSwitchAccessPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchAccessPoliciesResult)(nil)).Elem()
}

func (o LookupSwitchAccessPoliciesResultOutput) ToLookupSwitchAccessPoliciesResultOutput() LookupSwitchAccessPoliciesResultOutput {
	return o
}

func (o LookupSwitchAccessPoliciesResultOutput) ToLookupSwitchAccessPoliciesResultOutputWithContext(ctx context.Context) LookupSwitchAccessPoliciesResultOutput {
	return o
}

// accessPolicyNumber path parameter. Access policy number
func (o LookupSwitchAccessPoliciesResultOutput) AccessPolicyNumber() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSwitchAccessPoliciesResult) *string { return v.AccessPolicyNumber }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSwitchAccessPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSwitchAccessPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSwitchAccessPoliciesResultOutput) Item() GetSwitchAccessPoliciesItemOutput {
	return o.ApplyT(func(v LookupSwitchAccessPoliciesResult) GetSwitchAccessPoliciesItem { return v.Item }).(GetSwitchAccessPoliciesItemOutput)
}

// Array of ResponseSwitchGetNetworkSwitchAccessPolicies
func (o LookupSwitchAccessPoliciesResultOutput) Items() GetSwitchAccessPoliciesItemArrayOutput {
	return o.ApplyT(func(v LookupSwitchAccessPoliciesResult) []GetSwitchAccessPoliciesItem { return v.Items }).(GetSwitchAccessPoliciesItemArrayOutput)
}

// networkId path parameter. Network ID
func (o LookupSwitchAccessPoliciesResultOutput) NetworkId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSwitchAccessPoliciesResult) *string { return v.NetworkId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSwitchAccessPoliciesResultOutput{})
}
