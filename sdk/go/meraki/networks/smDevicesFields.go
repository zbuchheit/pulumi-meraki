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
type SmDevicesFields struct {
	pulumi.CustomResourceState

	// Array of ResponseSmUpdateNetworkSmDevicesFields
	Items SmDevicesFieldsItemArrayOutput `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringOutput             `pulumi:"networkId"`
	Parameters SmDevicesFieldsParametersOutput `pulumi:"parameters"`
}

// NewSmDevicesFields registers a new resource with the given unique name, arguments, and options.
func NewSmDevicesFields(ctx *pulumi.Context,
	name string, args *SmDevicesFieldsArgs, opts ...pulumi.ResourceOption) (*SmDevicesFields, error) {
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
	var resource SmDevicesFields
	err := ctx.RegisterResource("meraki:networks/smDevicesFields:SmDevicesFields", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSmDevicesFields gets an existing SmDevicesFields resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSmDevicesFields(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SmDevicesFieldsState, opts ...pulumi.ResourceOption) (*SmDevicesFields, error) {
	var resource SmDevicesFields
	err := ctx.ReadResource("meraki:networks/smDevicesFields:SmDevicesFields", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SmDevicesFields resources.
type smDevicesFieldsState struct {
	// Array of ResponseSmUpdateNetworkSmDevicesFields
	Items []SmDevicesFieldsItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId  *string                    `pulumi:"networkId"`
	Parameters *SmDevicesFieldsParameters `pulumi:"parameters"`
}

type SmDevicesFieldsState struct {
	// Array of ResponseSmUpdateNetworkSmDevicesFields
	Items SmDevicesFieldsItemArrayInput
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringPtrInput
	Parameters SmDevicesFieldsParametersPtrInput
}

func (SmDevicesFieldsState) ElementType() reflect.Type {
	return reflect.TypeOf((*smDevicesFieldsState)(nil)).Elem()
}

type smDevicesFieldsArgs struct {
	// networkId path parameter. Network ID
	NetworkId  string                    `pulumi:"networkId"`
	Parameters SmDevicesFieldsParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a SmDevicesFields resource.
type SmDevicesFieldsArgs struct {
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringInput
	Parameters SmDevicesFieldsParametersInput
}

func (SmDevicesFieldsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*smDevicesFieldsArgs)(nil)).Elem()
}

type SmDevicesFieldsInput interface {
	pulumi.Input

	ToSmDevicesFieldsOutput() SmDevicesFieldsOutput
	ToSmDevicesFieldsOutputWithContext(ctx context.Context) SmDevicesFieldsOutput
}

func (*SmDevicesFields) ElementType() reflect.Type {
	return reflect.TypeOf((**SmDevicesFields)(nil)).Elem()
}

func (i *SmDevicesFields) ToSmDevicesFieldsOutput() SmDevicesFieldsOutput {
	return i.ToSmDevicesFieldsOutputWithContext(context.Background())
}

func (i *SmDevicesFields) ToSmDevicesFieldsOutputWithContext(ctx context.Context) SmDevicesFieldsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesFieldsOutput)
}

// SmDevicesFieldsArrayInput is an input type that accepts SmDevicesFieldsArray and SmDevicesFieldsArrayOutput values.
// You can construct a concrete instance of `SmDevicesFieldsArrayInput` via:
//
//	SmDevicesFieldsArray{ SmDevicesFieldsArgs{...} }
type SmDevicesFieldsArrayInput interface {
	pulumi.Input

	ToSmDevicesFieldsArrayOutput() SmDevicesFieldsArrayOutput
	ToSmDevicesFieldsArrayOutputWithContext(context.Context) SmDevicesFieldsArrayOutput
}

type SmDevicesFieldsArray []SmDevicesFieldsInput

func (SmDevicesFieldsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmDevicesFields)(nil)).Elem()
}

func (i SmDevicesFieldsArray) ToSmDevicesFieldsArrayOutput() SmDevicesFieldsArrayOutput {
	return i.ToSmDevicesFieldsArrayOutputWithContext(context.Background())
}

func (i SmDevicesFieldsArray) ToSmDevicesFieldsArrayOutputWithContext(ctx context.Context) SmDevicesFieldsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesFieldsArrayOutput)
}

// SmDevicesFieldsMapInput is an input type that accepts SmDevicesFieldsMap and SmDevicesFieldsMapOutput values.
// You can construct a concrete instance of `SmDevicesFieldsMapInput` via:
//
//	SmDevicesFieldsMap{ "key": SmDevicesFieldsArgs{...} }
type SmDevicesFieldsMapInput interface {
	pulumi.Input

	ToSmDevicesFieldsMapOutput() SmDevicesFieldsMapOutput
	ToSmDevicesFieldsMapOutputWithContext(context.Context) SmDevicesFieldsMapOutput
}

type SmDevicesFieldsMap map[string]SmDevicesFieldsInput

func (SmDevicesFieldsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmDevicesFields)(nil)).Elem()
}

func (i SmDevicesFieldsMap) ToSmDevicesFieldsMapOutput() SmDevicesFieldsMapOutput {
	return i.ToSmDevicesFieldsMapOutputWithContext(context.Background())
}

func (i SmDevicesFieldsMap) ToSmDevicesFieldsMapOutputWithContext(ctx context.Context) SmDevicesFieldsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesFieldsMapOutput)
}

type SmDevicesFieldsOutput struct{ *pulumi.OutputState }

func (SmDevicesFieldsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SmDevicesFields)(nil)).Elem()
}

func (o SmDevicesFieldsOutput) ToSmDevicesFieldsOutput() SmDevicesFieldsOutput {
	return o
}

func (o SmDevicesFieldsOutput) ToSmDevicesFieldsOutputWithContext(ctx context.Context) SmDevicesFieldsOutput {
	return o
}

// Array of ResponseSmUpdateNetworkSmDevicesFields
func (o SmDevicesFieldsOutput) Items() SmDevicesFieldsItemArrayOutput {
	return o.ApplyT(func(v *SmDevicesFields) SmDevicesFieldsItemArrayOutput { return v.Items }).(SmDevicesFieldsItemArrayOutput)
}

// networkId path parameter. Network ID
func (o SmDevicesFieldsOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SmDevicesFields) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

func (o SmDevicesFieldsOutput) Parameters() SmDevicesFieldsParametersOutput {
	return o.ApplyT(func(v *SmDevicesFields) SmDevicesFieldsParametersOutput { return v.Parameters }).(SmDevicesFieldsParametersOutput)
}

type SmDevicesFieldsArrayOutput struct{ *pulumi.OutputState }

func (SmDevicesFieldsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmDevicesFields)(nil)).Elem()
}

func (o SmDevicesFieldsArrayOutput) ToSmDevicesFieldsArrayOutput() SmDevicesFieldsArrayOutput {
	return o
}

func (o SmDevicesFieldsArrayOutput) ToSmDevicesFieldsArrayOutputWithContext(ctx context.Context) SmDevicesFieldsArrayOutput {
	return o
}

func (o SmDevicesFieldsArrayOutput) Index(i pulumi.IntInput) SmDevicesFieldsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SmDevicesFields {
		return vs[0].([]*SmDevicesFields)[vs[1].(int)]
	}).(SmDevicesFieldsOutput)
}

type SmDevicesFieldsMapOutput struct{ *pulumi.OutputState }

func (SmDevicesFieldsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmDevicesFields)(nil)).Elem()
}

func (o SmDevicesFieldsMapOutput) ToSmDevicesFieldsMapOutput() SmDevicesFieldsMapOutput {
	return o
}

func (o SmDevicesFieldsMapOutput) ToSmDevicesFieldsMapOutputWithContext(ctx context.Context) SmDevicesFieldsMapOutput {
	return o
}

func (o SmDevicesFieldsMapOutput) MapIndex(k pulumi.StringInput) SmDevicesFieldsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SmDevicesFields {
		return vs[0].(map[string]*SmDevicesFields)[vs[1].(string)]
	}).(SmDevicesFieldsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesFieldsInput)(nil)).Elem(), &SmDevicesFields{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesFieldsArrayInput)(nil)).Elem(), SmDevicesFieldsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesFieldsMapInput)(nil)).Elem(), SmDevicesFieldsMap{})
	pulumi.RegisterOutputType(SmDevicesFieldsOutput{})
	pulumi.RegisterOutputType(SmDevicesFieldsArrayOutput{})
	pulumi.RegisterOutputType(SmDevicesFieldsMapOutput{})
}