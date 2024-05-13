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
type FirmwareUpgradesRollbacks struct {
	pulumi.CustomResourceState

	Item FirmwareUpgradesRollbacksItemOutput `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringOutput                       `pulumi:"networkId"`
	Parameters FirmwareUpgradesRollbacksParametersOutput `pulumi:"parameters"`
}

// NewFirmwareUpgradesRollbacks registers a new resource with the given unique name, arguments, and options.
func NewFirmwareUpgradesRollbacks(ctx *pulumi.Context,
	name string, args *FirmwareUpgradesRollbacksArgs, opts ...pulumi.ResourceOption) (*FirmwareUpgradesRollbacks, error) {
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
	var resource FirmwareUpgradesRollbacks
	err := ctx.RegisterResource("meraki:networks/firmwareUpgradesRollbacks:FirmwareUpgradesRollbacks", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirmwareUpgradesRollbacks gets an existing FirmwareUpgradesRollbacks resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirmwareUpgradesRollbacks(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirmwareUpgradesRollbacksState, opts ...pulumi.ResourceOption) (*FirmwareUpgradesRollbacks, error) {
	var resource FirmwareUpgradesRollbacks
	err := ctx.ReadResource("meraki:networks/firmwareUpgradesRollbacks:FirmwareUpgradesRollbacks", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FirmwareUpgradesRollbacks resources.
type firmwareUpgradesRollbacksState struct {
	Item *FirmwareUpgradesRollbacksItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  *string                              `pulumi:"networkId"`
	Parameters *FirmwareUpgradesRollbacksParameters `pulumi:"parameters"`
}

type FirmwareUpgradesRollbacksState struct {
	Item FirmwareUpgradesRollbacksItemPtrInput
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringPtrInput
	Parameters FirmwareUpgradesRollbacksParametersPtrInput
}

func (FirmwareUpgradesRollbacksState) ElementType() reflect.Type {
	return reflect.TypeOf((*firmwareUpgradesRollbacksState)(nil)).Elem()
}

type firmwareUpgradesRollbacksArgs struct {
	// networkId path parameter. Network ID
	NetworkId  string                              `pulumi:"networkId"`
	Parameters FirmwareUpgradesRollbacksParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a FirmwareUpgradesRollbacks resource.
type FirmwareUpgradesRollbacksArgs struct {
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringInput
	Parameters FirmwareUpgradesRollbacksParametersInput
}

func (FirmwareUpgradesRollbacksArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firmwareUpgradesRollbacksArgs)(nil)).Elem()
}

type FirmwareUpgradesRollbacksInput interface {
	pulumi.Input

	ToFirmwareUpgradesRollbacksOutput() FirmwareUpgradesRollbacksOutput
	ToFirmwareUpgradesRollbacksOutputWithContext(ctx context.Context) FirmwareUpgradesRollbacksOutput
}

func (*FirmwareUpgradesRollbacks) ElementType() reflect.Type {
	return reflect.TypeOf((**FirmwareUpgradesRollbacks)(nil)).Elem()
}

func (i *FirmwareUpgradesRollbacks) ToFirmwareUpgradesRollbacksOutput() FirmwareUpgradesRollbacksOutput {
	return i.ToFirmwareUpgradesRollbacksOutputWithContext(context.Background())
}

func (i *FirmwareUpgradesRollbacks) ToFirmwareUpgradesRollbacksOutputWithContext(ctx context.Context) FirmwareUpgradesRollbacksOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirmwareUpgradesRollbacksOutput)
}

// FirmwareUpgradesRollbacksArrayInput is an input type that accepts FirmwareUpgradesRollbacksArray and FirmwareUpgradesRollbacksArrayOutput values.
// You can construct a concrete instance of `FirmwareUpgradesRollbacksArrayInput` via:
//
//	FirmwareUpgradesRollbacksArray{ FirmwareUpgradesRollbacksArgs{...} }
type FirmwareUpgradesRollbacksArrayInput interface {
	pulumi.Input

	ToFirmwareUpgradesRollbacksArrayOutput() FirmwareUpgradesRollbacksArrayOutput
	ToFirmwareUpgradesRollbacksArrayOutputWithContext(context.Context) FirmwareUpgradesRollbacksArrayOutput
}

type FirmwareUpgradesRollbacksArray []FirmwareUpgradesRollbacksInput

func (FirmwareUpgradesRollbacksArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirmwareUpgradesRollbacks)(nil)).Elem()
}

func (i FirmwareUpgradesRollbacksArray) ToFirmwareUpgradesRollbacksArrayOutput() FirmwareUpgradesRollbacksArrayOutput {
	return i.ToFirmwareUpgradesRollbacksArrayOutputWithContext(context.Background())
}

func (i FirmwareUpgradesRollbacksArray) ToFirmwareUpgradesRollbacksArrayOutputWithContext(ctx context.Context) FirmwareUpgradesRollbacksArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirmwareUpgradesRollbacksArrayOutput)
}

// FirmwareUpgradesRollbacksMapInput is an input type that accepts FirmwareUpgradesRollbacksMap and FirmwareUpgradesRollbacksMapOutput values.
// You can construct a concrete instance of `FirmwareUpgradesRollbacksMapInput` via:
//
//	FirmwareUpgradesRollbacksMap{ "key": FirmwareUpgradesRollbacksArgs{...} }
type FirmwareUpgradesRollbacksMapInput interface {
	pulumi.Input

	ToFirmwareUpgradesRollbacksMapOutput() FirmwareUpgradesRollbacksMapOutput
	ToFirmwareUpgradesRollbacksMapOutputWithContext(context.Context) FirmwareUpgradesRollbacksMapOutput
}

type FirmwareUpgradesRollbacksMap map[string]FirmwareUpgradesRollbacksInput

func (FirmwareUpgradesRollbacksMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirmwareUpgradesRollbacks)(nil)).Elem()
}

func (i FirmwareUpgradesRollbacksMap) ToFirmwareUpgradesRollbacksMapOutput() FirmwareUpgradesRollbacksMapOutput {
	return i.ToFirmwareUpgradesRollbacksMapOutputWithContext(context.Background())
}

func (i FirmwareUpgradesRollbacksMap) ToFirmwareUpgradesRollbacksMapOutputWithContext(ctx context.Context) FirmwareUpgradesRollbacksMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirmwareUpgradesRollbacksMapOutput)
}

type FirmwareUpgradesRollbacksOutput struct{ *pulumi.OutputState }

func (FirmwareUpgradesRollbacksOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FirmwareUpgradesRollbacks)(nil)).Elem()
}

func (o FirmwareUpgradesRollbacksOutput) ToFirmwareUpgradesRollbacksOutput() FirmwareUpgradesRollbacksOutput {
	return o
}

func (o FirmwareUpgradesRollbacksOutput) ToFirmwareUpgradesRollbacksOutputWithContext(ctx context.Context) FirmwareUpgradesRollbacksOutput {
	return o
}

func (o FirmwareUpgradesRollbacksOutput) Item() FirmwareUpgradesRollbacksItemOutput {
	return o.ApplyT(func(v *FirmwareUpgradesRollbacks) FirmwareUpgradesRollbacksItemOutput { return v.Item }).(FirmwareUpgradesRollbacksItemOutput)
}

// networkId path parameter. Network ID
func (o FirmwareUpgradesRollbacksOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *FirmwareUpgradesRollbacks) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

func (o FirmwareUpgradesRollbacksOutput) Parameters() FirmwareUpgradesRollbacksParametersOutput {
	return o.ApplyT(func(v *FirmwareUpgradesRollbacks) FirmwareUpgradesRollbacksParametersOutput { return v.Parameters }).(FirmwareUpgradesRollbacksParametersOutput)
}

type FirmwareUpgradesRollbacksArrayOutput struct{ *pulumi.OutputState }

func (FirmwareUpgradesRollbacksArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirmwareUpgradesRollbacks)(nil)).Elem()
}

func (o FirmwareUpgradesRollbacksArrayOutput) ToFirmwareUpgradesRollbacksArrayOutput() FirmwareUpgradesRollbacksArrayOutput {
	return o
}

func (o FirmwareUpgradesRollbacksArrayOutput) ToFirmwareUpgradesRollbacksArrayOutputWithContext(ctx context.Context) FirmwareUpgradesRollbacksArrayOutput {
	return o
}

func (o FirmwareUpgradesRollbacksArrayOutput) Index(i pulumi.IntInput) FirmwareUpgradesRollbacksOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FirmwareUpgradesRollbacks {
		return vs[0].([]*FirmwareUpgradesRollbacks)[vs[1].(int)]
	}).(FirmwareUpgradesRollbacksOutput)
}

type FirmwareUpgradesRollbacksMapOutput struct{ *pulumi.OutputState }

func (FirmwareUpgradesRollbacksMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirmwareUpgradesRollbacks)(nil)).Elem()
}

func (o FirmwareUpgradesRollbacksMapOutput) ToFirmwareUpgradesRollbacksMapOutput() FirmwareUpgradesRollbacksMapOutput {
	return o
}

func (o FirmwareUpgradesRollbacksMapOutput) ToFirmwareUpgradesRollbacksMapOutputWithContext(ctx context.Context) FirmwareUpgradesRollbacksMapOutput {
	return o
}

func (o FirmwareUpgradesRollbacksMapOutput) MapIndex(k pulumi.StringInput) FirmwareUpgradesRollbacksOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FirmwareUpgradesRollbacks {
		return vs[0].(map[string]*FirmwareUpgradesRollbacks)[vs[1].(string)]
	}).(FirmwareUpgradesRollbacksOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirmwareUpgradesRollbacksInput)(nil)).Elem(), &FirmwareUpgradesRollbacks{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirmwareUpgradesRollbacksArrayInput)(nil)).Elem(), FirmwareUpgradesRollbacksArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirmwareUpgradesRollbacksMapInput)(nil)).Elem(), FirmwareUpgradesRollbacksMap{})
	pulumi.RegisterOutputType(FirmwareUpgradesRollbacksOutput{})
	pulumi.RegisterOutputType(FirmwareUpgradesRollbacksArrayOutput{})
	pulumi.RegisterOutputType(FirmwareUpgradesRollbacksMapOutput{})
}