// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/applianceSecurityIntrusion:ApplianceSecurityIntrusion example "network_id"
// ```
type ApplianceSecurityIntrusion struct {
	pulumi.CustomResourceState

	// Intrusion detection ruleset
	IdsRulesets pulumi.StringOutput `pulumi:"idsRulesets"`
	// Intrusion detection mode
	Mode pulumi.StringOutput `pulumi:"mode"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// Networks included in and excluded from the detection engine
	ProtectedNetworks ApplianceSecurityIntrusionProtectedNetworksOutput `pulumi:"protectedNetworks"`
}

// NewApplianceSecurityIntrusion registers a new resource with the given unique name, arguments, and options.
func NewApplianceSecurityIntrusion(ctx *pulumi.Context,
	name string, args *ApplianceSecurityIntrusionArgs, opts ...pulumi.ResourceOption) (*ApplianceSecurityIntrusion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplianceSecurityIntrusion
	err := ctx.RegisterResource("meraki:networks/applianceSecurityIntrusion:ApplianceSecurityIntrusion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplianceSecurityIntrusion gets an existing ApplianceSecurityIntrusion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplianceSecurityIntrusion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplianceSecurityIntrusionState, opts ...pulumi.ResourceOption) (*ApplianceSecurityIntrusion, error) {
	var resource ApplianceSecurityIntrusion
	err := ctx.ReadResource("meraki:networks/applianceSecurityIntrusion:ApplianceSecurityIntrusion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplianceSecurityIntrusion resources.
type applianceSecurityIntrusionState struct {
	// Intrusion detection ruleset
	IdsRulesets *string `pulumi:"idsRulesets"`
	// Intrusion detection mode
	Mode *string `pulumi:"mode"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// Networks included in and excluded from the detection engine
	ProtectedNetworks *ApplianceSecurityIntrusionProtectedNetworks `pulumi:"protectedNetworks"`
}

type ApplianceSecurityIntrusionState struct {
	// Intrusion detection ruleset
	IdsRulesets pulumi.StringPtrInput
	// Intrusion detection mode
	Mode pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// Networks included in and excluded from the detection engine
	ProtectedNetworks ApplianceSecurityIntrusionProtectedNetworksPtrInput
}

func (ApplianceSecurityIntrusionState) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceSecurityIntrusionState)(nil)).Elem()
}

type applianceSecurityIntrusionArgs struct {
	// Intrusion detection ruleset
	IdsRulesets *string `pulumi:"idsRulesets"`
	// Intrusion detection mode
	Mode *string `pulumi:"mode"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// Networks included in and excluded from the detection engine
	ProtectedNetworks *ApplianceSecurityIntrusionProtectedNetworks `pulumi:"protectedNetworks"`
}

// The set of arguments for constructing a ApplianceSecurityIntrusion resource.
type ApplianceSecurityIntrusionArgs struct {
	// Intrusion detection ruleset
	IdsRulesets pulumi.StringPtrInput
	// Intrusion detection mode
	Mode pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// Networks included in and excluded from the detection engine
	ProtectedNetworks ApplianceSecurityIntrusionProtectedNetworksPtrInput
}

func (ApplianceSecurityIntrusionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceSecurityIntrusionArgs)(nil)).Elem()
}

type ApplianceSecurityIntrusionInput interface {
	pulumi.Input

	ToApplianceSecurityIntrusionOutput() ApplianceSecurityIntrusionOutput
	ToApplianceSecurityIntrusionOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionOutput
}

func (*ApplianceSecurityIntrusion) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceSecurityIntrusion)(nil)).Elem()
}

func (i *ApplianceSecurityIntrusion) ToApplianceSecurityIntrusionOutput() ApplianceSecurityIntrusionOutput {
	return i.ToApplianceSecurityIntrusionOutputWithContext(context.Background())
}

func (i *ApplianceSecurityIntrusion) ToApplianceSecurityIntrusionOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceSecurityIntrusionOutput)
}

// ApplianceSecurityIntrusionArrayInput is an input type that accepts ApplianceSecurityIntrusionArray and ApplianceSecurityIntrusionArrayOutput values.
// You can construct a concrete instance of `ApplianceSecurityIntrusionArrayInput` via:
//
//	ApplianceSecurityIntrusionArray{ ApplianceSecurityIntrusionArgs{...} }
type ApplianceSecurityIntrusionArrayInput interface {
	pulumi.Input

	ToApplianceSecurityIntrusionArrayOutput() ApplianceSecurityIntrusionArrayOutput
	ToApplianceSecurityIntrusionArrayOutputWithContext(context.Context) ApplianceSecurityIntrusionArrayOutput
}

type ApplianceSecurityIntrusionArray []ApplianceSecurityIntrusionInput

func (ApplianceSecurityIntrusionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceSecurityIntrusion)(nil)).Elem()
}

func (i ApplianceSecurityIntrusionArray) ToApplianceSecurityIntrusionArrayOutput() ApplianceSecurityIntrusionArrayOutput {
	return i.ToApplianceSecurityIntrusionArrayOutputWithContext(context.Background())
}

func (i ApplianceSecurityIntrusionArray) ToApplianceSecurityIntrusionArrayOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceSecurityIntrusionArrayOutput)
}

// ApplianceSecurityIntrusionMapInput is an input type that accepts ApplianceSecurityIntrusionMap and ApplianceSecurityIntrusionMapOutput values.
// You can construct a concrete instance of `ApplianceSecurityIntrusionMapInput` via:
//
//	ApplianceSecurityIntrusionMap{ "key": ApplianceSecurityIntrusionArgs{...} }
type ApplianceSecurityIntrusionMapInput interface {
	pulumi.Input

	ToApplianceSecurityIntrusionMapOutput() ApplianceSecurityIntrusionMapOutput
	ToApplianceSecurityIntrusionMapOutputWithContext(context.Context) ApplianceSecurityIntrusionMapOutput
}

type ApplianceSecurityIntrusionMap map[string]ApplianceSecurityIntrusionInput

func (ApplianceSecurityIntrusionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceSecurityIntrusion)(nil)).Elem()
}

func (i ApplianceSecurityIntrusionMap) ToApplianceSecurityIntrusionMapOutput() ApplianceSecurityIntrusionMapOutput {
	return i.ToApplianceSecurityIntrusionMapOutputWithContext(context.Background())
}

func (i ApplianceSecurityIntrusionMap) ToApplianceSecurityIntrusionMapOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceSecurityIntrusionMapOutput)
}

type ApplianceSecurityIntrusionOutput struct{ *pulumi.OutputState }

func (ApplianceSecurityIntrusionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceSecurityIntrusion)(nil)).Elem()
}

func (o ApplianceSecurityIntrusionOutput) ToApplianceSecurityIntrusionOutput() ApplianceSecurityIntrusionOutput {
	return o
}

func (o ApplianceSecurityIntrusionOutput) ToApplianceSecurityIntrusionOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionOutput {
	return o
}

// Intrusion detection ruleset
func (o ApplianceSecurityIntrusionOutput) IdsRulesets() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceSecurityIntrusion) pulumi.StringOutput { return v.IdsRulesets }).(pulumi.StringOutput)
}

// Intrusion detection mode
func (o ApplianceSecurityIntrusionOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceSecurityIntrusion) pulumi.StringOutput { return v.Mode }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o ApplianceSecurityIntrusionOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceSecurityIntrusion) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// Networks included in and excluded from the detection engine
func (o ApplianceSecurityIntrusionOutput) ProtectedNetworks() ApplianceSecurityIntrusionProtectedNetworksOutput {
	return o.ApplyT(func(v *ApplianceSecurityIntrusion) ApplianceSecurityIntrusionProtectedNetworksOutput {
		return v.ProtectedNetworks
	}).(ApplianceSecurityIntrusionProtectedNetworksOutput)
}

type ApplianceSecurityIntrusionArrayOutput struct{ *pulumi.OutputState }

func (ApplianceSecurityIntrusionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceSecurityIntrusion)(nil)).Elem()
}

func (o ApplianceSecurityIntrusionArrayOutput) ToApplianceSecurityIntrusionArrayOutput() ApplianceSecurityIntrusionArrayOutput {
	return o
}

func (o ApplianceSecurityIntrusionArrayOutput) ToApplianceSecurityIntrusionArrayOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionArrayOutput {
	return o
}

func (o ApplianceSecurityIntrusionArrayOutput) Index(i pulumi.IntInput) ApplianceSecurityIntrusionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplianceSecurityIntrusion {
		return vs[0].([]*ApplianceSecurityIntrusion)[vs[1].(int)]
	}).(ApplianceSecurityIntrusionOutput)
}

type ApplianceSecurityIntrusionMapOutput struct{ *pulumi.OutputState }

func (ApplianceSecurityIntrusionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceSecurityIntrusion)(nil)).Elem()
}

func (o ApplianceSecurityIntrusionMapOutput) ToApplianceSecurityIntrusionMapOutput() ApplianceSecurityIntrusionMapOutput {
	return o
}

func (o ApplianceSecurityIntrusionMapOutput) ToApplianceSecurityIntrusionMapOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionMapOutput {
	return o
}

func (o ApplianceSecurityIntrusionMapOutput) MapIndex(k pulumi.StringInput) ApplianceSecurityIntrusionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplianceSecurityIntrusion {
		return vs[0].(map[string]*ApplianceSecurityIntrusion)[vs[1].(string)]
	}).(ApplianceSecurityIntrusionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceSecurityIntrusionInput)(nil)).Elem(), &ApplianceSecurityIntrusion{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceSecurityIntrusionArrayInput)(nil)).Elem(), ApplianceSecurityIntrusionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceSecurityIntrusionMapInput)(nil)).Elem(), ApplianceSecurityIntrusionMap{})
	pulumi.RegisterOutputType(ApplianceSecurityIntrusionOutput{})
	pulumi.RegisterOutputType(ApplianceSecurityIntrusionArrayOutput{})
	pulumi.RegisterOutputType(ApplianceSecurityIntrusionMapOutput{})
}