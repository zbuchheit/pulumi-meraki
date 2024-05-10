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
// $ pulumi import meraki:networks/switchMtu:SwitchMtu example "network_id"
// ```
type SwitchMtu struct {
	pulumi.CustomResourceState

	// MTU size for the entire network. Default value is 9578.
	DefaultMtuSize pulumi.IntOutput `pulumi:"defaultMtuSize"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// Override MTU size for individual switches or switch templates.
	//   An empty array will clear overrides.
	Overrides SwitchMtuOverrideArrayOutput `pulumi:"overrides"`
}

// NewSwitchMtu registers a new resource with the given unique name, arguments, and options.
func NewSwitchMtu(ctx *pulumi.Context,
	name string, args *SwitchMtuArgs, opts ...pulumi.ResourceOption) (*SwitchMtu, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchMtu
	err := ctx.RegisterResource("meraki:networks/switchMtu:SwitchMtu", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchMtu gets an existing SwitchMtu resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchMtu(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchMtuState, opts ...pulumi.ResourceOption) (*SwitchMtu, error) {
	var resource SwitchMtu
	err := ctx.ReadResource("meraki:networks/switchMtu:SwitchMtu", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchMtu resources.
type switchMtuState struct {
	// MTU size for the entire network. Default value is 9578.
	DefaultMtuSize *int `pulumi:"defaultMtuSize"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// Override MTU size for individual switches or switch templates.
	//   An empty array will clear overrides.
	Overrides []SwitchMtuOverride `pulumi:"overrides"`
}

type SwitchMtuState struct {
	// MTU size for the entire network. Default value is 9578.
	DefaultMtuSize pulumi.IntPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// Override MTU size for individual switches or switch templates.
	//   An empty array will clear overrides.
	Overrides SwitchMtuOverrideArrayInput
}

func (SwitchMtuState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchMtuState)(nil)).Elem()
}

type switchMtuArgs struct {
	// MTU size for the entire network. Default value is 9578.
	DefaultMtuSize *int `pulumi:"defaultMtuSize"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// Override MTU size for individual switches or switch templates.
	//   An empty array will clear overrides.
	Overrides []SwitchMtuOverride `pulumi:"overrides"`
}

// The set of arguments for constructing a SwitchMtu resource.
type SwitchMtuArgs struct {
	// MTU size for the entire network. Default value is 9578.
	DefaultMtuSize pulumi.IntPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// Override MTU size for individual switches or switch templates.
	//   An empty array will clear overrides.
	Overrides SwitchMtuOverrideArrayInput
}

func (SwitchMtuArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchMtuArgs)(nil)).Elem()
}

type SwitchMtuInput interface {
	pulumi.Input

	ToSwitchMtuOutput() SwitchMtuOutput
	ToSwitchMtuOutputWithContext(ctx context.Context) SwitchMtuOutput
}

func (*SwitchMtu) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchMtu)(nil)).Elem()
}

func (i *SwitchMtu) ToSwitchMtuOutput() SwitchMtuOutput {
	return i.ToSwitchMtuOutputWithContext(context.Background())
}

func (i *SwitchMtu) ToSwitchMtuOutputWithContext(ctx context.Context) SwitchMtuOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchMtuOutput)
}

// SwitchMtuArrayInput is an input type that accepts SwitchMtuArray and SwitchMtuArrayOutput values.
// You can construct a concrete instance of `SwitchMtuArrayInput` via:
//
//	SwitchMtuArray{ SwitchMtuArgs{...} }
type SwitchMtuArrayInput interface {
	pulumi.Input

	ToSwitchMtuArrayOutput() SwitchMtuArrayOutput
	ToSwitchMtuArrayOutputWithContext(context.Context) SwitchMtuArrayOutput
}

type SwitchMtuArray []SwitchMtuInput

func (SwitchMtuArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchMtu)(nil)).Elem()
}

func (i SwitchMtuArray) ToSwitchMtuArrayOutput() SwitchMtuArrayOutput {
	return i.ToSwitchMtuArrayOutputWithContext(context.Background())
}

func (i SwitchMtuArray) ToSwitchMtuArrayOutputWithContext(ctx context.Context) SwitchMtuArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchMtuArrayOutput)
}

// SwitchMtuMapInput is an input type that accepts SwitchMtuMap and SwitchMtuMapOutput values.
// You can construct a concrete instance of `SwitchMtuMapInput` via:
//
//	SwitchMtuMap{ "key": SwitchMtuArgs{...} }
type SwitchMtuMapInput interface {
	pulumi.Input

	ToSwitchMtuMapOutput() SwitchMtuMapOutput
	ToSwitchMtuMapOutputWithContext(context.Context) SwitchMtuMapOutput
}

type SwitchMtuMap map[string]SwitchMtuInput

func (SwitchMtuMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchMtu)(nil)).Elem()
}

func (i SwitchMtuMap) ToSwitchMtuMapOutput() SwitchMtuMapOutput {
	return i.ToSwitchMtuMapOutputWithContext(context.Background())
}

func (i SwitchMtuMap) ToSwitchMtuMapOutputWithContext(ctx context.Context) SwitchMtuMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchMtuMapOutput)
}

type SwitchMtuOutput struct{ *pulumi.OutputState }

func (SwitchMtuOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchMtu)(nil)).Elem()
}

func (o SwitchMtuOutput) ToSwitchMtuOutput() SwitchMtuOutput {
	return o
}

func (o SwitchMtuOutput) ToSwitchMtuOutputWithContext(ctx context.Context) SwitchMtuOutput {
	return o
}

// MTU size for the entire network. Default value is 9578.
func (o SwitchMtuOutput) DefaultMtuSize() pulumi.IntOutput {
	return o.ApplyT(func(v *SwitchMtu) pulumi.IntOutput { return v.DefaultMtuSize }).(pulumi.IntOutput)
}

// networkId path parameter. Network ID
func (o SwitchMtuOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchMtu) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// Override MTU size for individual switches or switch templates.
//
//	An empty array will clear overrides.
func (o SwitchMtuOutput) Overrides() SwitchMtuOverrideArrayOutput {
	return o.ApplyT(func(v *SwitchMtu) SwitchMtuOverrideArrayOutput { return v.Overrides }).(SwitchMtuOverrideArrayOutput)
}

type SwitchMtuArrayOutput struct{ *pulumi.OutputState }

func (SwitchMtuArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchMtu)(nil)).Elem()
}

func (o SwitchMtuArrayOutput) ToSwitchMtuArrayOutput() SwitchMtuArrayOutput {
	return o
}

func (o SwitchMtuArrayOutput) ToSwitchMtuArrayOutputWithContext(ctx context.Context) SwitchMtuArrayOutput {
	return o
}

func (o SwitchMtuArrayOutput) Index(i pulumi.IntInput) SwitchMtuOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchMtu {
		return vs[0].([]*SwitchMtu)[vs[1].(int)]
	}).(SwitchMtuOutput)
}

type SwitchMtuMapOutput struct{ *pulumi.OutputState }

func (SwitchMtuMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchMtu)(nil)).Elem()
}

func (o SwitchMtuMapOutput) ToSwitchMtuMapOutput() SwitchMtuMapOutput {
	return o
}

func (o SwitchMtuMapOutput) ToSwitchMtuMapOutputWithContext(ctx context.Context) SwitchMtuMapOutput {
	return o
}

func (o SwitchMtuMapOutput) MapIndex(k pulumi.StringInput) SwitchMtuOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchMtu {
		return vs[0].(map[string]*SwitchMtu)[vs[1].(string)]
	}).(SwitchMtuOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchMtuInput)(nil)).Elem(), &SwitchMtu{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchMtuArrayInput)(nil)).Elem(), SwitchMtuArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchMtuMapInput)(nil)).Elem(), SwitchMtuMap{})
	pulumi.RegisterOutputType(SwitchMtuOutput{})
	pulumi.RegisterOutputType(SwitchMtuArrayOutput{})
	pulumi.RegisterOutputType(SwitchMtuMapOutput{})
}
