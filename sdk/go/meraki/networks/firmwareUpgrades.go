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
// $ pulumi import meraki:networks/firmwareUpgrades:FirmwareUpgrades example "network_id"
// ```
type FirmwareUpgrades struct {
	pulumi.CustomResourceState

	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// The network devices to be updated
	Products FirmwareUpgradesProductsOutput `pulumi:"products"`
	// The timezone for the network
	Timezone pulumi.StringOutput `pulumi:"timezone"`
	// Upgrade window for devices in network
	UpgradeWindow FirmwareUpgradesUpgradeWindowOutput `pulumi:"upgradeWindow"`
}

// NewFirmwareUpgrades registers a new resource with the given unique name, arguments, and options.
func NewFirmwareUpgrades(ctx *pulumi.Context,
	name string, args *FirmwareUpgradesArgs, opts ...pulumi.ResourceOption) (*FirmwareUpgrades, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FirmwareUpgrades
	err := ctx.RegisterResource("meraki:networks/firmwareUpgrades:FirmwareUpgrades", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirmwareUpgrades gets an existing FirmwareUpgrades resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirmwareUpgrades(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirmwareUpgradesState, opts ...pulumi.ResourceOption) (*FirmwareUpgrades, error) {
	var resource FirmwareUpgrades
	err := ctx.ReadResource("meraki:networks/firmwareUpgrades:FirmwareUpgrades", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FirmwareUpgrades resources.
type firmwareUpgradesState struct {
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// The network devices to be updated
	Products *FirmwareUpgradesProducts `pulumi:"products"`
	// The timezone for the network
	Timezone *string `pulumi:"timezone"`
	// Upgrade window for devices in network
	UpgradeWindow *FirmwareUpgradesUpgradeWindow `pulumi:"upgradeWindow"`
}

type FirmwareUpgradesState struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// The network devices to be updated
	Products FirmwareUpgradesProductsPtrInput
	// The timezone for the network
	Timezone pulumi.StringPtrInput
	// Upgrade window for devices in network
	UpgradeWindow FirmwareUpgradesUpgradeWindowPtrInput
}

func (FirmwareUpgradesState) ElementType() reflect.Type {
	return reflect.TypeOf((*firmwareUpgradesState)(nil)).Elem()
}

type firmwareUpgradesArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// The network devices to be updated
	Products *FirmwareUpgradesProducts `pulumi:"products"`
	// The timezone for the network
	Timezone *string `pulumi:"timezone"`
	// Upgrade window for devices in network
	UpgradeWindow *FirmwareUpgradesUpgradeWindow `pulumi:"upgradeWindow"`
}

// The set of arguments for constructing a FirmwareUpgrades resource.
type FirmwareUpgradesArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// The network devices to be updated
	Products FirmwareUpgradesProductsPtrInput
	// The timezone for the network
	Timezone pulumi.StringPtrInput
	// Upgrade window for devices in network
	UpgradeWindow FirmwareUpgradesUpgradeWindowPtrInput
}

func (FirmwareUpgradesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firmwareUpgradesArgs)(nil)).Elem()
}

type FirmwareUpgradesInput interface {
	pulumi.Input

	ToFirmwareUpgradesOutput() FirmwareUpgradesOutput
	ToFirmwareUpgradesOutputWithContext(ctx context.Context) FirmwareUpgradesOutput
}

func (*FirmwareUpgrades) ElementType() reflect.Type {
	return reflect.TypeOf((**FirmwareUpgrades)(nil)).Elem()
}

func (i *FirmwareUpgrades) ToFirmwareUpgradesOutput() FirmwareUpgradesOutput {
	return i.ToFirmwareUpgradesOutputWithContext(context.Background())
}

func (i *FirmwareUpgrades) ToFirmwareUpgradesOutputWithContext(ctx context.Context) FirmwareUpgradesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirmwareUpgradesOutput)
}

// FirmwareUpgradesArrayInput is an input type that accepts FirmwareUpgradesArray and FirmwareUpgradesArrayOutput values.
// You can construct a concrete instance of `FirmwareUpgradesArrayInput` via:
//
//	FirmwareUpgradesArray{ FirmwareUpgradesArgs{...} }
type FirmwareUpgradesArrayInput interface {
	pulumi.Input

	ToFirmwareUpgradesArrayOutput() FirmwareUpgradesArrayOutput
	ToFirmwareUpgradesArrayOutputWithContext(context.Context) FirmwareUpgradesArrayOutput
}

type FirmwareUpgradesArray []FirmwareUpgradesInput

func (FirmwareUpgradesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirmwareUpgrades)(nil)).Elem()
}

func (i FirmwareUpgradesArray) ToFirmwareUpgradesArrayOutput() FirmwareUpgradesArrayOutput {
	return i.ToFirmwareUpgradesArrayOutputWithContext(context.Background())
}

func (i FirmwareUpgradesArray) ToFirmwareUpgradesArrayOutputWithContext(ctx context.Context) FirmwareUpgradesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirmwareUpgradesArrayOutput)
}

// FirmwareUpgradesMapInput is an input type that accepts FirmwareUpgradesMap and FirmwareUpgradesMapOutput values.
// You can construct a concrete instance of `FirmwareUpgradesMapInput` via:
//
//	FirmwareUpgradesMap{ "key": FirmwareUpgradesArgs{...} }
type FirmwareUpgradesMapInput interface {
	pulumi.Input

	ToFirmwareUpgradesMapOutput() FirmwareUpgradesMapOutput
	ToFirmwareUpgradesMapOutputWithContext(context.Context) FirmwareUpgradesMapOutput
}

type FirmwareUpgradesMap map[string]FirmwareUpgradesInput

func (FirmwareUpgradesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirmwareUpgrades)(nil)).Elem()
}

func (i FirmwareUpgradesMap) ToFirmwareUpgradesMapOutput() FirmwareUpgradesMapOutput {
	return i.ToFirmwareUpgradesMapOutputWithContext(context.Background())
}

func (i FirmwareUpgradesMap) ToFirmwareUpgradesMapOutputWithContext(ctx context.Context) FirmwareUpgradesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirmwareUpgradesMapOutput)
}

type FirmwareUpgradesOutput struct{ *pulumi.OutputState }

func (FirmwareUpgradesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FirmwareUpgrades)(nil)).Elem()
}

func (o FirmwareUpgradesOutput) ToFirmwareUpgradesOutput() FirmwareUpgradesOutput {
	return o
}

func (o FirmwareUpgradesOutput) ToFirmwareUpgradesOutputWithContext(ctx context.Context) FirmwareUpgradesOutput {
	return o
}

// networkId path parameter. Network ID
func (o FirmwareUpgradesOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *FirmwareUpgrades) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// The network devices to be updated
func (o FirmwareUpgradesOutput) Products() FirmwareUpgradesProductsOutput {
	return o.ApplyT(func(v *FirmwareUpgrades) FirmwareUpgradesProductsOutput { return v.Products }).(FirmwareUpgradesProductsOutput)
}

// The timezone for the network
func (o FirmwareUpgradesOutput) Timezone() pulumi.StringOutput {
	return o.ApplyT(func(v *FirmwareUpgrades) pulumi.StringOutput { return v.Timezone }).(pulumi.StringOutput)
}

// Upgrade window for devices in network
func (o FirmwareUpgradesOutput) UpgradeWindow() FirmwareUpgradesUpgradeWindowOutput {
	return o.ApplyT(func(v *FirmwareUpgrades) FirmwareUpgradesUpgradeWindowOutput { return v.UpgradeWindow }).(FirmwareUpgradesUpgradeWindowOutput)
}

type FirmwareUpgradesArrayOutput struct{ *pulumi.OutputState }

func (FirmwareUpgradesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirmwareUpgrades)(nil)).Elem()
}

func (o FirmwareUpgradesArrayOutput) ToFirmwareUpgradesArrayOutput() FirmwareUpgradesArrayOutput {
	return o
}

func (o FirmwareUpgradesArrayOutput) ToFirmwareUpgradesArrayOutputWithContext(ctx context.Context) FirmwareUpgradesArrayOutput {
	return o
}

func (o FirmwareUpgradesArrayOutput) Index(i pulumi.IntInput) FirmwareUpgradesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FirmwareUpgrades {
		return vs[0].([]*FirmwareUpgrades)[vs[1].(int)]
	}).(FirmwareUpgradesOutput)
}

type FirmwareUpgradesMapOutput struct{ *pulumi.OutputState }

func (FirmwareUpgradesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirmwareUpgrades)(nil)).Elem()
}

func (o FirmwareUpgradesMapOutput) ToFirmwareUpgradesMapOutput() FirmwareUpgradesMapOutput {
	return o
}

func (o FirmwareUpgradesMapOutput) ToFirmwareUpgradesMapOutputWithContext(ctx context.Context) FirmwareUpgradesMapOutput {
	return o
}

func (o FirmwareUpgradesMapOutput) MapIndex(k pulumi.StringInput) FirmwareUpgradesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FirmwareUpgrades {
		return vs[0].(map[string]*FirmwareUpgrades)[vs[1].(string)]
	}).(FirmwareUpgradesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirmwareUpgradesInput)(nil)).Elem(), &FirmwareUpgrades{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirmwareUpgradesArrayInput)(nil)).Elem(), FirmwareUpgradesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirmwareUpgradesMapInput)(nil)).Elem(), FirmwareUpgradesMap{})
	pulumi.RegisterOutputType(FirmwareUpgradesOutput{})
	pulumi.RegisterOutputType(FirmwareUpgradesArrayOutput{})
	pulumi.RegisterOutputType(FirmwareUpgradesMapOutput{})
}