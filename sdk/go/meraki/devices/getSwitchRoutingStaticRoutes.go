// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devices

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
func LookupSwitchRoutingStaticRoutes(ctx *pulumi.Context, args *LookupSwitchRoutingStaticRoutesArgs, opts ...pulumi.InvokeOption) (*LookupSwitchRoutingStaticRoutesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSwitchRoutingStaticRoutesResult
	err := ctx.Invoke("meraki:devices/getSwitchRoutingStaticRoutes:getSwitchRoutingStaticRoutes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSwitchRoutingStaticRoutes.
type LookupSwitchRoutingStaticRoutesArgs struct {
	// serial path parameter.
	Serial *string `pulumi:"serial"`
	// staticRouteId path parameter. Static route ID
	StaticRouteId *string `pulumi:"staticRouteId"`
}

// A collection of values returned by getSwitchRoutingStaticRoutes.
type LookupSwitchRoutingStaticRoutesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                           `pulumi:"id"`
	Item GetSwitchRoutingStaticRoutesItem `pulumi:"item"`
	// Array of ResponseSwitchGetDeviceSwitchRoutingStaticRoutes
	Items []GetSwitchRoutingStaticRoutesItem `pulumi:"items"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
	// staticRouteId path parameter. Static route ID
	StaticRouteId *string `pulumi:"staticRouteId"`
}

func LookupSwitchRoutingStaticRoutesOutput(ctx *pulumi.Context, args LookupSwitchRoutingStaticRoutesOutputArgs, opts ...pulumi.InvokeOption) LookupSwitchRoutingStaticRoutesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSwitchRoutingStaticRoutesResult, error) {
			args := v.(LookupSwitchRoutingStaticRoutesArgs)
			r, err := LookupSwitchRoutingStaticRoutes(ctx, &args, opts...)
			var s LookupSwitchRoutingStaticRoutesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSwitchRoutingStaticRoutesResultOutput)
}

// A collection of arguments for invoking getSwitchRoutingStaticRoutes.
type LookupSwitchRoutingStaticRoutesOutputArgs struct {
	// serial path parameter.
	Serial pulumi.StringPtrInput `pulumi:"serial"`
	// staticRouteId path parameter. Static route ID
	StaticRouteId pulumi.StringPtrInput `pulumi:"staticRouteId"`
}

func (LookupSwitchRoutingStaticRoutesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchRoutingStaticRoutesArgs)(nil)).Elem()
}

// A collection of values returned by getSwitchRoutingStaticRoutes.
type LookupSwitchRoutingStaticRoutesResultOutput struct{ *pulumi.OutputState }

func (LookupSwitchRoutingStaticRoutesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchRoutingStaticRoutesResult)(nil)).Elem()
}

func (o LookupSwitchRoutingStaticRoutesResultOutput) ToLookupSwitchRoutingStaticRoutesResultOutput() LookupSwitchRoutingStaticRoutesResultOutput {
	return o
}

func (o LookupSwitchRoutingStaticRoutesResultOutput) ToLookupSwitchRoutingStaticRoutesResultOutputWithContext(ctx context.Context) LookupSwitchRoutingStaticRoutesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSwitchRoutingStaticRoutesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSwitchRoutingStaticRoutesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSwitchRoutingStaticRoutesResultOutput) Item() GetSwitchRoutingStaticRoutesItemOutput {
	return o.ApplyT(func(v LookupSwitchRoutingStaticRoutesResult) GetSwitchRoutingStaticRoutesItem { return v.Item }).(GetSwitchRoutingStaticRoutesItemOutput)
}

// Array of ResponseSwitchGetDeviceSwitchRoutingStaticRoutes
func (o LookupSwitchRoutingStaticRoutesResultOutput) Items() GetSwitchRoutingStaticRoutesItemArrayOutput {
	return o.ApplyT(func(v LookupSwitchRoutingStaticRoutesResult) []GetSwitchRoutingStaticRoutesItem { return v.Items }).(GetSwitchRoutingStaticRoutesItemArrayOutput)
}

// serial path parameter.
func (o LookupSwitchRoutingStaticRoutesResultOutput) Serial() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSwitchRoutingStaticRoutesResult) *string { return v.Serial }).(pulumi.StringPtrOutput)
}

// staticRouteId path parameter. Static route ID
func (o LookupSwitchRoutingStaticRoutesResultOutput) StaticRouteId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSwitchRoutingStaticRoutesResult) *string { return v.StaticRouteId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSwitchRoutingStaticRoutesResultOutput{})
}
