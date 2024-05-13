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
type SmDevicesUninstallApps struct {
	pulumi.CustomResourceState

	// deviceId path parameter. Device ID
	DeviceId pulumi.StringOutput `pulumi:"deviceId"`
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringOutput                    `pulumi:"networkId"`
	Parameters SmDevicesUninstallAppsParametersOutput `pulumi:"parameters"`
}

// NewSmDevicesUninstallApps registers a new resource with the given unique name, arguments, and options.
func NewSmDevicesUninstallApps(ctx *pulumi.Context,
	name string, args *SmDevicesUninstallAppsArgs, opts ...pulumi.ResourceOption) (*SmDevicesUninstallApps, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeviceId == nil {
		return nil, errors.New("invalid value for required argument 'DeviceId'")
	}
	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	if args.Parameters == nil {
		return nil, errors.New("invalid value for required argument 'Parameters'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SmDevicesUninstallApps
	err := ctx.RegisterResource("meraki:networks/smDevicesUninstallApps:SmDevicesUninstallApps", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSmDevicesUninstallApps gets an existing SmDevicesUninstallApps resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSmDevicesUninstallApps(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SmDevicesUninstallAppsState, opts ...pulumi.ResourceOption) (*SmDevicesUninstallApps, error) {
	var resource SmDevicesUninstallApps
	err := ctx.ReadResource("meraki:networks/smDevicesUninstallApps:SmDevicesUninstallApps", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SmDevicesUninstallApps resources.
type smDevicesUninstallAppsState struct {
	// deviceId path parameter. Device ID
	DeviceId *string `pulumi:"deviceId"`
	// networkId path parameter. Network ID
	NetworkId  *string                           `pulumi:"networkId"`
	Parameters *SmDevicesUninstallAppsParameters `pulumi:"parameters"`
}

type SmDevicesUninstallAppsState struct {
	// deviceId path parameter. Device ID
	DeviceId pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringPtrInput
	Parameters SmDevicesUninstallAppsParametersPtrInput
}

func (SmDevicesUninstallAppsState) ElementType() reflect.Type {
	return reflect.TypeOf((*smDevicesUninstallAppsState)(nil)).Elem()
}

type smDevicesUninstallAppsArgs struct {
	// deviceId path parameter. Device ID
	DeviceId string `pulumi:"deviceId"`
	// networkId path parameter. Network ID
	NetworkId  string                           `pulumi:"networkId"`
	Parameters SmDevicesUninstallAppsParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a SmDevicesUninstallApps resource.
type SmDevicesUninstallAppsArgs struct {
	// deviceId path parameter. Device ID
	DeviceId pulumi.StringInput
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringInput
	Parameters SmDevicesUninstallAppsParametersInput
}

func (SmDevicesUninstallAppsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*smDevicesUninstallAppsArgs)(nil)).Elem()
}

type SmDevicesUninstallAppsInput interface {
	pulumi.Input

	ToSmDevicesUninstallAppsOutput() SmDevicesUninstallAppsOutput
	ToSmDevicesUninstallAppsOutputWithContext(ctx context.Context) SmDevicesUninstallAppsOutput
}

func (*SmDevicesUninstallApps) ElementType() reflect.Type {
	return reflect.TypeOf((**SmDevicesUninstallApps)(nil)).Elem()
}

func (i *SmDevicesUninstallApps) ToSmDevicesUninstallAppsOutput() SmDevicesUninstallAppsOutput {
	return i.ToSmDevicesUninstallAppsOutputWithContext(context.Background())
}

func (i *SmDevicesUninstallApps) ToSmDevicesUninstallAppsOutputWithContext(ctx context.Context) SmDevicesUninstallAppsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesUninstallAppsOutput)
}

// SmDevicesUninstallAppsArrayInput is an input type that accepts SmDevicesUninstallAppsArray and SmDevicesUninstallAppsArrayOutput values.
// You can construct a concrete instance of `SmDevicesUninstallAppsArrayInput` via:
//
//	SmDevicesUninstallAppsArray{ SmDevicesUninstallAppsArgs{...} }
type SmDevicesUninstallAppsArrayInput interface {
	pulumi.Input

	ToSmDevicesUninstallAppsArrayOutput() SmDevicesUninstallAppsArrayOutput
	ToSmDevicesUninstallAppsArrayOutputWithContext(context.Context) SmDevicesUninstallAppsArrayOutput
}

type SmDevicesUninstallAppsArray []SmDevicesUninstallAppsInput

func (SmDevicesUninstallAppsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmDevicesUninstallApps)(nil)).Elem()
}

func (i SmDevicesUninstallAppsArray) ToSmDevicesUninstallAppsArrayOutput() SmDevicesUninstallAppsArrayOutput {
	return i.ToSmDevicesUninstallAppsArrayOutputWithContext(context.Background())
}

func (i SmDevicesUninstallAppsArray) ToSmDevicesUninstallAppsArrayOutputWithContext(ctx context.Context) SmDevicesUninstallAppsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesUninstallAppsArrayOutput)
}

// SmDevicesUninstallAppsMapInput is an input type that accepts SmDevicesUninstallAppsMap and SmDevicesUninstallAppsMapOutput values.
// You can construct a concrete instance of `SmDevicesUninstallAppsMapInput` via:
//
//	SmDevicesUninstallAppsMap{ "key": SmDevicesUninstallAppsArgs{...} }
type SmDevicesUninstallAppsMapInput interface {
	pulumi.Input

	ToSmDevicesUninstallAppsMapOutput() SmDevicesUninstallAppsMapOutput
	ToSmDevicesUninstallAppsMapOutputWithContext(context.Context) SmDevicesUninstallAppsMapOutput
}

type SmDevicesUninstallAppsMap map[string]SmDevicesUninstallAppsInput

func (SmDevicesUninstallAppsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmDevicesUninstallApps)(nil)).Elem()
}

func (i SmDevicesUninstallAppsMap) ToSmDevicesUninstallAppsMapOutput() SmDevicesUninstallAppsMapOutput {
	return i.ToSmDevicesUninstallAppsMapOutputWithContext(context.Background())
}

func (i SmDevicesUninstallAppsMap) ToSmDevicesUninstallAppsMapOutputWithContext(ctx context.Context) SmDevicesUninstallAppsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesUninstallAppsMapOutput)
}

type SmDevicesUninstallAppsOutput struct{ *pulumi.OutputState }

func (SmDevicesUninstallAppsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SmDevicesUninstallApps)(nil)).Elem()
}

func (o SmDevicesUninstallAppsOutput) ToSmDevicesUninstallAppsOutput() SmDevicesUninstallAppsOutput {
	return o
}

func (o SmDevicesUninstallAppsOutput) ToSmDevicesUninstallAppsOutputWithContext(ctx context.Context) SmDevicesUninstallAppsOutput {
	return o
}

// deviceId path parameter. Device ID
func (o SmDevicesUninstallAppsOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SmDevicesUninstallApps) pulumi.StringOutput { return v.DeviceId }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o SmDevicesUninstallAppsOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SmDevicesUninstallApps) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

func (o SmDevicesUninstallAppsOutput) Parameters() SmDevicesUninstallAppsParametersOutput {
	return o.ApplyT(func(v *SmDevicesUninstallApps) SmDevicesUninstallAppsParametersOutput { return v.Parameters }).(SmDevicesUninstallAppsParametersOutput)
}

type SmDevicesUninstallAppsArrayOutput struct{ *pulumi.OutputState }

func (SmDevicesUninstallAppsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmDevicesUninstallApps)(nil)).Elem()
}

func (o SmDevicesUninstallAppsArrayOutput) ToSmDevicesUninstallAppsArrayOutput() SmDevicesUninstallAppsArrayOutput {
	return o
}

func (o SmDevicesUninstallAppsArrayOutput) ToSmDevicesUninstallAppsArrayOutputWithContext(ctx context.Context) SmDevicesUninstallAppsArrayOutput {
	return o
}

func (o SmDevicesUninstallAppsArrayOutput) Index(i pulumi.IntInput) SmDevicesUninstallAppsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SmDevicesUninstallApps {
		return vs[0].([]*SmDevicesUninstallApps)[vs[1].(int)]
	}).(SmDevicesUninstallAppsOutput)
}

type SmDevicesUninstallAppsMapOutput struct{ *pulumi.OutputState }

func (SmDevicesUninstallAppsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmDevicesUninstallApps)(nil)).Elem()
}

func (o SmDevicesUninstallAppsMapOutput) ToSmDevicesUninstallAppsMapOutput() SmDevicesUninstallAppsMapOutput {
	return o
}

func (o SmDevicesUninstallAppsMapOutput) ToSmDevicesUninstallAppsMapOutputWithContext(ctx context.Context) SmDevicesUninstallAppsMapOutput {
	return o
}

func (o SmDevicesUninstallAppsMapOutput) MapIndex(k pulumi.StringInput) SmDevicesUninstallAppsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SmDevicesUninstallApps {
		return vs[0].(map[string]*SmDevicesUninstallApps)[vs[1].(string)]
	}).(SmDevicesUninstallAppsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesUninstallAppsInput)(nil)).Elem(), &SmDevicesUninstallApps{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesUninstallAppsArrayInput)(nil)).Elem(), SmDevicesUninstallAppsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesUninstallAppsMapInput)(nil)).Elem(), SmDevicesUninstallAppsMap{})
	pulumi.RegisterOutputType(SmDevicesUninstallAppsOutput{})
	pulumi.RegisterOutputType(SmDevicesUninstallAppsArrayOutput{})
	pulumi.RegisterOutputType(SmDevicesUninstallAppsMapOutput{})
}