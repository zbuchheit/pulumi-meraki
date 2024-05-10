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
func LookupSwitchRoutingInterfaces(ctx *pulumi.Context, args *LookupSwitchRoutingInterfacesArgs, opts ...pulumi.InvokeOption) (*LookupSwitchRoutingInterfacesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSwitchRoutingInterfacesResult
	err := ctx.Invoke("meraki:devices/getSwitchRoutingInterfaces:getSwitchRoutingInterfaces", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSwitchRoutingInterfaces.
type LookupSwitchRoutingInterfacesArgs struct {
	// interfaceId path parameter. Interface ID
	InterfaceId *string `pulumi:"interfaceId"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
}

// A collection of values returned by getSwitchRoutingInterfaces.
type LookupSwitchRoutingInterfacesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// interfaceId path parameter. Interface ID
	InterfaceId *string                        `pulumi:"interfaceId"`
	Item        GetSwitchRoutingInterfacesItem `pulumi:"item"`
	// Array of ResponseSwitchGetDeviceSwitchRoutingInterfaces
	Items []GetSwitchRoutingInterfacesItem `pulumi:"items"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
}

func LookupSwitchRoutingInterfacesOutput(ctx *pulumi.Context, args LookupSwitchRoutingInterfacesOutputArgs, opts ...pulumi.InvokeOption) LookupSwitchRoutingInterfacesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSwitchRoutingInterfacesResult, error) {
			args := v.(LookupSwitchRoutingInterfacesArgs)
			r, err := LookupSwitchRoutingInterfaces(ctx, &args, opts...)
			var s LookupSwitchRoutingInterfacesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSwitchRoutingInterfacesResultOutput)
}

// A collection of arguments for invoking getSwitchRoutingInterfaces.
type LookupSwitchRoutingInterfacesOutputArgs struct {
	// interfaceId path parameter. Interface ID
	InterfaceId pulumi.StringPtrInput `pulumi:"interfaceId"`
	// serial path parameter.
	Serial pulumi.StringPtrInput `pulumi:"serial"`
}

func (LookupSwitchRoutingInterfacesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchRoutingInterfacesArgs)(nil)).Elem()
}

// A collection of values returned by getSwitchRoutingInterfaces.
type LookupSwitchRoutingInterfacesResultOutput struct{ *pulumi.OutputState }

func (LookupSwitchRoutingInterfacesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchRoutingInterfacesResult)(nil)).Elem()
}

func (o LookupSwitchRoutingInterfacesResultOutput) ToLookupSwitchRoutingInterfacesResultOutput() LookupSwitchRoutingInterfacesResultOutput {
	return o
}

func (o LookupSwitchRoutingInterfacesResultOutput) ToLookupSwitchRoutingInterfacesResultOutputWithContext(ctx context.Context) LookupSwitchRoutingInterfacesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSwitchRoutingInterfacesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSwitchRoutingInterfacesResult) string { return v.Id }).(pulumi.StringOutput)
}

// interfaceId path parameter. Interface ID
func (o LookupSwitchRoutingInterfacesResultOutput) InterfaceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSwitchRoutingInterfacesResult) *string { return v.InterfaceId }).(pulumi.StringPtrOutput)
}

func (o LookupSwitchRoutingInterfacesResultOutput) Item() GetSwitchRoutingInterfacesItemOutput {
	return o.ApplyT(func(v LookupSwitchRoutingInterfacesResult) GetSwitchRoutingInterfacesItem { return v.Item }).(GetSwitchRoutingInterfacesItemOutput)
}

// Array of ResponseSwitchGetDeviceSwitchRoutingInterfaces
func (o LookupSwitchRoutingInterfacesResultOutput) Items() GetSwitchRoutingInterfacesItemArrayOutput {
	return o.ApplyT(func(v LookupSwitchRoutingInterfacesResult) []GetSwitchRoutingInterfacesItem { return v.Items }).(GetSwitchRoutingInterfacesItemArrayOutput)
}

// serial path parameter.
func (o LookupSwitchRoutingInterfacesResultOutput) Serial() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSwitchRoutingInterfacesResult) *string { return v.Serial }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSwitchRoutingInterfacesResultOutput{})
}
