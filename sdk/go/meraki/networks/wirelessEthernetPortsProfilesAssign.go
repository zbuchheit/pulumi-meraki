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

// ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
// already existed previously.
type WirelessEthernetPortsProfilesAssign struct {
	pulumi.CustomResourceState

	Item WirelessEthernetPortsProfilesAssignItemOutput `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringOutput                                 `pulumi:"networkId"`
	Parameters WirelessEthernetPortsProfilesAssignParametersOutput `pulumi:"parameters"`
}

// NewWirelessEthernetPortsProfilesAssign registers a new resource with the given unique name, arguments, and options.
func NewWirelessEthernetPortsProfilesAssign(ctx *pulumi.Context,
	name string, args *WirelessEthernetPortsProfilesAssignArgs, opts ...pulumi.ResourceOption) (*WirelessEthernetPortsProfilesAssign, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	if args.Parameters == nil {
		return nil, errors.New("invalid value for required argument 'Parameters'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WirelessEthernetPortsProfilesAssign
	err := ctx.RegisterResource("meraki:networks/wirelessEthernetPortsProfilesAssign:WirelessEthernetPortsProfilesAssign", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWirelessEthernetPortsProfilesAssign gets an existing WirelessEthernetPortsProfilesAssign resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWirelessEthernetPortsProfilesAssign(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WirelessEthernetPortsProfilesAssignState, opts ...pulumi.ResourceOption) (*WirelessEthernetPortsProfilesAssign, error) {
	var resource WirelessEthernetPortsProfilesAssign
	err := ctx.ReadResource("meraki:networks/wirelessEthernetPortsProfilesAssign:WirelessEthernetPortsProfilesAssign", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WirelessEthernetPortsProfilesAssign resources.
type wirelessEthernetPortsProfilesAssignState struct {
	Item *WirelessEthernetPortsProfilesAssignItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  *string                                        `pulumi:"networkId"`
	Parameters *WirelessEthernetPortsProfilesAssignParameters `pulumi:"parameters"`
}

type WirelessEthernetPortsProfilesAssignState struct {
	Item WirelessEthernetPortsProfilesAssignItemPtrInput
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringPtrInput
	Parameters WirelessEthernetPortsProfilesAssignParametersPtrInput
}

func (WirelessEthernetPortsProfilesAssignState) ElementType() reflect.Type {
	return reflect.TypeOf((*wirelessEthernetPortsProfilesAssignState)(nil)).Elem()
}

type wirelessEthernetPortsProfilesAssignArgs struct {
	// networkId path parameter. Network ID
	NetworkId  string                                        `pulumi:"networkId"`
	Parameters WirelessEthernetPortsProfilesAssignParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a WirelessEthernetPortsProfilesAssign resource.
type WirelessEthernetPortsProfilesAssignArgs struct {
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringInput
	Parameters WirelessEthernetPortsProfilesAssignParametersInput
}

func (WirelessEthernetPortsProfilesAssignArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wirelessEthernetPortsProfilesAssignArgs)(nil)).Elem()
}

type WirelessEthernetPortsProfilesAssignInput interface {
	pulumi.Input

	ToWirelessEthernetPortsProfilesAssignOutput() WirelessEthernetPortsProfilesAssignOutput
	ToWirelessEthernetPortsProfilesAssignOutputWithContext(ctx context.Context) WirelessEthernetPortsProfilesAssignOutput
}

func (*WirelessEthernetPortsProfilesAssign) ElementType() reflect.Type {
	return reflect.TypeOf((**WirelessEthernetPortsProfilesAssign)(nil)).Elem()
}

func (i *WirelessEthernetPortsProfilesAssign) ToWirelessEthernetPortsProfilesAssignOutput() WirelessEthernetPortsProfilesAssignOutput {
	return i.ToWirelessEthernetPortsProfilesAssignOutputWithContext(context.Background())
}

func (i *WirelessEthernetPortsProfilesAssign) ToWirelessEthernetPortsProfilesAssignOutputWithContext(ctx context.Context) WirelessEthernetPortsProfilesAssignOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessEthernetPortsProfilesAssignOutput)
}

// WirelessEthernetPortsProfilesAssignArrayInput is an input type that accepts WirelessEthernetPortsProfilesAssignArray and WirelessEthernetPortsProfilesAssignArrayOutput values.
// You can construct a concrete instance of `WirelessEthernetPortsProfilesAssignArrayInput` via:
//
//	WirelessEthernetPortsProfilesAssignArray{ WirelessEthernetPortsProfilesAssignArgs{...} }
type WirelessEthernetPortsProfilesAssignArrayInput interface {
	pulumi.Input

	ToWirelessEthernetPortsProfilesAssignArrayOutput() WirelessEthernetPortsProfilesAssignArrayOutput
	ToWirelessEthernetPortsProfilesAssignArrayOutputWithContext(context.Context) WirelessEthernetPortsProfilesAssignArrayOutput
}

type WirelessEthernetPortsProfilesAssignArray []WirelessEthernetPortsProfilesAssignInput

func (WirelessEthernetPortsProfilesAssignArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WirelessEthernetPortsProfilesAssign)(nil)).Elem()
}

func (i WirelessEthernetPortsProfilesAssignArray) ToWirelessEthernetPortsProfilesAssignArrayOutput() WirelessEthernetPortsProfilesAssignArrayOutput {
	return i.ToWirelessEthernetPortsProfilesAssignArrayOutputWithContext(context.Background())
}

func (i WirelessEthernetPortsProfilesAssignArray) ToWirelessEthernetPortsProfilesAssignArrayOutputWithContext(ctx context.Context) WirelessEthernetPortsProfilesAssignArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessEthernetPortsProfilesAssignArrayOutput)
}

// WirelessEthernetPortsProfilesAssignMapInput is an input type that accepts WirelessEthernetPortsProfilesAssignMap and WirelessEthernetPortsProfilesAssignMapOutput values.
// You can construct a concrete instance of `WirelessEthernetPortsProfilesAssignMapInput` via:
//
//	WirelessEthernetPortsProfilesAssignMap{ "key": WirelessEthernetPortsProfilesAssignArgs{...} }
type WirelessEthernetPortsProfilesAssignMapInput interface {
	pulumi.Input

	ToWirelessEthernetPortsProfilesAssignMapOutput() WirelessEthernetPortsProfilesAssignMapOutput
	ToWirelessEthernetPortsProfilesAssignMapOutputWithContext(context.Context) WirelessEthernetPortsProfilesAssignMapOutput
}

type WirelessEthernetPortsProfilesAssignMap map[string]WirelessEthernetPortsProfilesAssignInput

func (WirelessEthernetPortsProfilesAssignMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WirelessEthernetPortsProfilesAssign)(nil)).Elem()
}

func (i WirelessEthernetPortsProfilesAssignMap) ToWirelessEthernetPortsProfilesAssignMapOutput() WirelessEthernetPortsProfilesAssignMapOutput {
	return i.ToWirelessEthernetPortsProfilesAssignMapOutputWithContext(context.Background())
}

func (i WirelessEthernetPortsProfilesAssignMap) ToWirelessEthernetPortsProfilesAssignMapOutputWithContext(ctx context.Context) WirelessEthernetPortsProfilesAssignMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessEthernetPortsProfilesAssignMapOutput)
}

type WirelessEthernetPortsProfilesAssignOutput struct{ *pulumi.OutputState }

func (WirelessEthernetPortsProfilesAssignOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WirelessEthernetPortsProfilesAssign)(nil)).Elem()
}

func (o WirelessEthernetPortsProfilesAssignOutput) ToWirelessEthernetPortsProfilesAssignOutput() WirelessEthernetPortsProfilesAssignOutput {
	return o
}

func (o WirelessEthernetPortsProfilesAssignOutput) ToWirelessEthernetPortsProfilesAssignOutputWithContext(ctx context.Context) WirelessEthernetPortsProfilesAssignOutput {
	return o
}

func (o WirelessEthernetPortsProfilesAssignOutput) Item() WirelessEthernetPortsProfilesAssignItemOutput {
	return o.ApplyT(func(v *WirelessEthernetPortsProfilesAssign) WirelessEthernetPortsProfilesAssignItemOutput {
		return v.Item
	}).(WirelessEthernetPortsProfilesAssignItemOutput)
}

// networkId path parameter. Network ID
func (o WirelessEthernetPortsProfilesAssignOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *WirelessEthernetPortsProfilesAssign) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

func (o WirelessEthernetPortsProfilesAssignOutput) Parameters() WirelessEthernetPortsProfilesAssignParametersOutput {
	return o.ApplyT(func(v *WirelessEthernetPortsProfilesAssign) WirelessEthernetPortsProfilesAssignParametersOutput {
		return v.Parameters
	}).(WirelessEthernetPortsProfilesAssignParametersOutput)
}

type WirelessEthernetPortsProfilesAssignArrayOutput struct{ *pulumi.OutputState }

func (WirelessEthernetPortsProfilesAssignArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WirelessEthernetPortsProfilesAssign)(nil)).Elem()
}

func (o WirelessEthernetPortsProfilesAssignArrayOutput) ToWirelessEthernetPortsProfilesAssignArrayOutput() WirelessEthernetPortsProfilesAssignArrayOutput {
	return o
}

func (o WirelessEthernetPortsProfilesAssignArrayOutput) ToWirelessEthernetPortsProfilesAssignArrayOutputWithContext(ctx context.Context) WirelessEthernetPortsProfilesAssignArrayOutput {
	return o
}

func (o WirelessEthernetPortsProfilesAssignArrayOutput) Index(i pulumi.IntInput) WirelessEthernetPortsProfilesAssignOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WirelessEthernetPortsProfilesAssign {
		return vs[0].([]*WirelessEthernetPortsProfilesAssign)[vs[1].(int)]
	}).(WirelessEthernetPortsProfilesAssignOutput)
}

type WirelessEthernetPortsProfilesAssignMapOutput struct{ *pulumi.OutputState }

func (WirelessEthernetPortsProfilesAssignMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WirelessEthernetPortsProfilesAssign)(nil)).Elem()
}

func (o WirelessEthernetPortsProfilesAssignMapOutput) ToWirelessEthernetPortsProfilesAssignMapOutput() WirelessEthernetPortsProfilesAssignMapOutput {
	return o
}

func (o WirelessEthernetPortsProfilesAssignMapOutput) ToWirelessEthernetPortsProfilesAssignMapOutputWithContext(ctx context.Context) WirelessEthernetPortsProfilesAssignMapOutput {
	return o
}

func (o WirelessEthernetPortsProfilesAssignMapOutput) MapIndex(k pulumi.StringInput) WirelessEthernetPortsProfilesAssignOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WirelessEthernetPortsProfilesAssign {
		return vs[0].(map[string]*WirelessEthernetPortsProfilesAssign)[vs[1].(string)]
	}).(WirelessEthernetPortsProfilesAssignOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessEthernetPortsProfilesAssignInput)(nil)).Elem(), &WirelessEthernetPortsProfilesAssign{})
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessEthernetPortsProfilesAssignArrayInput)(nil)).Elem(), WirelessEthernetPortsProfilesAssignArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessEthernetPortsProfilesAssignMapInput)(nil)).Elem(), WirelessEthernetPortsProfilesAssignMap{})
	pulumi.RegisterOutputType(WirelessEthernetPortsProfilesAssignOutput{})
	pulumi.RegisterOutputType(WirelessEthernetPortsProfilesAssignArrayOutput{})
	pulumi.RegisterOutputType(WirelessEthernetPortsProfilesAssignMapOutput{})
}
