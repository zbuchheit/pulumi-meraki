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
type SmDevicesReboot struct {
	pulumi.CustomResourceState

	Item SmDevicesRebootItemOutput `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringOutput             `pulumi:"networkId"`
	Parameters SmDevicesRebootParametersOutput `pulumi:"parameters"`
}

// NewSmDevicesReboot registers a new resource with the given unique name, arguments, and options.
func NewSmDevicesReboot(ctx *pulumi.Context,
	name string, args *SmDevicesRebootArgs, opts ...pulumi.ResourceOption) (*SmDevicesReboot, error) {
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
	var resource SmDevicesReboot
	err := ctx.RegisterResource("meraki:networks/smDevicesReboot:SmDevicesReboot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSmDevicesReboot gets an existing SmDevicesReboot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSmDevicesReboot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SmDevicesRebootState, opts ...pulumi.ResourceOption) (*SmDevicesReboot, error) {
	var resource SmDevicesReboot
	err := ctx.ReadResource("meraki:networks/smDevicesReboot:SmDevicesReboot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SmDevicesReboot resources.
type smDevicesRebootState struct {
	Item *SmDevicesRebootItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  *string                    `pulumi:"networkId"`
	Parameters *SmDevicesRebootParameters `pulumi:"parameters"`
}

type SmDevicesRebootState struct {
	Item SmDevicesRebootItemPtrInput
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringPtrInput
	Parameters SmDevicesRebootParametersPtrInput
}

func (SmDevicesRebootState) ElementType() reflect.Type {
	return reflect.TypeOf((*smDevicesRebootState)(nil)).Elem()
}

type smDevicesRebootArgs struct {
	// networkId path parameter. Network ID
	NetworkId  string                    `pulumi:"networkId"`
	Parameters SmDevicesRebootParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a SmDevicesReboot resource.
type SmDevicesRebootArgs struct {
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringInput
	Parameters SmDevicesRebootParametersInput
}

func (SmDevicesRebootArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*smDevicesRebootArgs)(nil)).Elem()
}

type SmDevicesRebootInput interface {
	pulumi.Input

	ToSmDevicesRebootOutput() SmDevicesRebootOutput
	ToSmDevicesRebootOutputWithContext(ctx context.Context) SmDevicesRebootOutput
}

func (*SmDevicesReboot) ElementType() reflect.Type {
	return reflect.TypeOf((**SmDevicesReboot)(nil)).Elem()
}

func (i *SmDevicesReboot) ToSmDevicesRebootOutput() SmDevicesRebootOutput {
	return i.ToSmDevicesRebootOutputWithContext(context.Background())
}

func (i *SmDevicesReboot) ToSmDevicesRebootOutputWithContext(ctx context.Context) SmDevicesRebootOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesRebootOutput)
}

// SmDevicesRebootArrayInput is an input type that accepts SmDevicesRebootArray and SmDevicesRebootArrayOutput values.
// You can construct a concrete instance of `SmDevicesRebootArrayInput` via:
//
//	SmDevicesRebootArray{ SmDevicesRebootArgs{...} }
type SmDevicesRebootArrayInput interface {
	pulumi.Input

	ToSmDevicesRebootArrayOutput() SmDevicesRebootArrayOutput
	ToSmDevicesRebootArrayOutputWithContext(context.Context) SmDevicesRebootArrayOutput
}

type SmDevicesRebootArray []SmDevicesRebootInput

func (SmDevicesRebootArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmDevicesReboot)(nil)).Elem()
}

func (i SmDevicesRebootArray) ToSmDevicesRebootArrayOutput() SmDevicesRebootArrayOutput {
	return i.ToSmDevicesRebootArrayOutputWithContext(context.Background())
}

func (i SmDevicesRebootArray) ToSmDevicesRebootArrayOutputWithContext(ctx context.Context) SmDevicesRebootArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesRebootArrayOutput)
}

// SmDevicesRebootMapInput is an input type that accepts SmDevicesRebootMap and SmDevicesRebootMapOutput values.
// You can construct a concrete instance of `SmDevicesRebootMapInput` via:
//
//	SmDevicesRebootMap{ "key": SmDevicesRebootArgs{...} }
type SmDevicesRebootMapInput interface {
	pulumi.Input

	ToSmDevicesRebootMapOutput() SmDevicesRebootMapOutput
	ToSmDevicesRebootMapOutputWithContext(context.Context) SmDevicesRebootMapOutput
}

type SmDevicesRebootMap map[string]SmDevicesRebootInput

func (SmDevicesRebootMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmDevicesReboot)(nil)).Elem()
}

func (i SmDevicesRebootMap) ToSmDevicesRebootMapOutput() SmDevicesRebootMapOutput {
	return i.ToSmDevicesRebootMapOutputWithContext(context.Background())
}

func (i SmDevicesRebootMap) ToSmDevicesRebootMapOutputWithContext(ctx context.Context) SmDevicesRebootMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesRebootMapOutput)
}

type SmDevicesRebootOutput struct{ *pulumi.OutputState }

func (SmDevicesRebootOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SmDevicesReboot)(nil)).Elem()
}

func (o SmDevicesRebootOutput) ToSmDevicesRebootOutput() SmDevicesRebootOutput {
	return o
}

func (o SmDevicesRebootOutput) ToSmDevicesRebootOutputWithContext(ctx context.Context) SmDevicesRebootOutput {
	return o
}

func (o SmDevicesRebootOutput) Item() SmDevicesRebootItemOutput {
	return o.ApplyT(func(v *SmDevicesReboot) SmDevicesRebootItemOutput { return v.Item }).(SmDevicesRebootItemOutput)
}

// networkId path parameter. Network ID
func (o SmDevicesRebootOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SmDevicesReboot) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

func (o SmDevicesRebootOutput) Parameters() SmDevicesRebootParametersOutput {
	return o.ApplyT(func(v *SmDevicesReboot) SmDevicesRebootParametersOutput { return v.Parameters }).(SmDevicesRebootParametersOutput)
}

type SmDevicesRebootArrayOutput struct{ *pulumi.OutputState }

func (SmDevicesRebootArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmDevicesReboot)(nil)).Elem()
}

func (o SmDevicesRebootArrayOutput) ToSmDevicesRebootArrayOutput() SmDevicesRebootArrayOutput {
	return o
}

func (o SmDevicesRebootArrayOutput) ToSmDevicesRebootArrayOutputWithContext(ctx context.Context) SmDevicesRebootArrayOutput {
	return o
}

func (o SmDevicesRebootArrayOutput) Index(i pulumi.IntInput) SmDevicesRebootOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SmDevicesReboot {
		return vs[0].([]*SmDevicesReboot)[vs[1].(int)]
	}).(SmDevicesRebootOutput)
}

type SmDevicesRebootMapOutput struct{ *pulumi.OutputState }

func (SmDevicesRebootMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmDevicesReboot)(nil)).Elem()
}

func (o SmDevicesRebootMapOutput) ToSmDevicesRebootMapOutput() SmDevicesRebootMapOutput {
	return o
}

func (o SmDevicesRebootMapOutput) ToSmDevicesRebootMapOutputWithContext(ctx context.Context) SmDevicesRebootMapOutput {
	return o
}

func (o SmDevicesRebootMapOutput) MapIndex(k pulumi.StringInput) SmDevicesRebootOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SmDevicesReboot {
		return vs[0].(map[string]*SmDevicesReboot)[vs[1].(string)]
	}).(SmDevicesRebootOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesRebootInput)(nil)).Elem(), &SmDevicesReboot{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesRebootArrayInput)(nil)).Elem(), SmDevicesRebootArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesRebootMapInput)(nil)).Elem(), SmDevicesRebootMap{})
	pulumi.RegisterOutputType(SmDevicesRebootOutput{})
	pulumi.RegisterOutputType(SmDevicesRebootArrayOutput{})
	pulumi.RegisterOutputType(SmDevicesRebootMapOutput{})
}