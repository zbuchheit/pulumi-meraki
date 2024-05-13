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
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/networks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := networks.NewSwitchDscpToCosMappings(ctx, "example", &networks.SwitchDscpToCosMappingsArgs{
//				Mappings: networks.SwitchDscpToCosMappingsMappingArray{
//					&networks.SwitchDscpToCosMappingsMappingArgs{
//						Cos:   pulumi.Int(1),
//						Dscp:  pulumi.Int(1),
//						Title: pulumi.String("Video"),
//					},
//				},
//				NetworkId: pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSwitchDscpToCosMappingsExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/switchDscpToCosMappings:SwitchDscpToCosMappings example "network_id"
// ```
type SwitchDscpToCosMappings struct {
	pulumi.CustomResourceState

	// An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
	Mappings SwitchDscpToCosMappingsMappingArrayOutput `pulumi:"mappings"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
}

// NewSwitchDscpToCosMappings registers a new resource with the given unique name, arguments, and options.
func NewSwitchDscpToCosMappings(ctx *pulumi.Context,
	name string, args *SwitchDscpToCosMappingsArgs, opts ...pulumi.ResourceOption) (*SwitchDscpToCosMappings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchDscpToCosMappings
	err := ctx.RegisterResource("meraki:networks/switchDscpToCosMappings:SwitchDscpToCosMappings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchDscpToCosMappings gets an existing SwitchDscpToCosMappings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchDscpToCosMappings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchDscpToCosMappingsState, opts ...pulumi.ResourceOption) (*SwitchDscpToCosMappings, error) {
	var resource SwitchDscpToCosMappings
	err := ctx.ReadResource("meraki:networks/switchDscpToCosMappings:SwitchDscpToCosMappings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchDscpToCosMappings resources.
type switchDscpToCosMappingsState struct {
	// An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
	Mappings []SwitchDscpToCosMappingsMapping `pulumi:"mappings"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
}

type SwitchDscpToCosMappingsState struct {
	// An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
	Mappings SwitchDscpToCosMappingsMappingArrayInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
}

func (SwitchDscpToCosMappingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchDscpToCosMappingsState)(nil)).Elem()
}

type switchDscpToCosMappingsArgs struct {
	// An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
	Mappings []SwitchDscpToCosMappingsMapping `pulumi:"mappings"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// The set of arguments for constructing a SwitchDscpToCosMappings resource.
type SwitchDscpToCosMappingsArgs struct {
	// An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
	Mappings SwitchDscpToCosMappingsMappingArrayInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
}

func (SwitchDscpToCosMappingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchDscpToCosMappingsArgs)(nil)).Elem()
}

type SwitchDscpToCosMappingsInput interface {
	pulumi.Input

	ToSwitchDscpToCosMappingsOutput() SwitchDscpToCosMappingsOutput
	ToSwitchDscpToCosMappingsOutputWithContext(ctx context.Context) SwitchDscpToCosMappingsOutput
}

func (*SwitchDscpToCosMappings) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchDscpToCosMappings)(nil)).Elem()
}

func (i *SwitchDscpToCosMappings) ToSwitchDscpToCosMappingsOutput() SwitchDscpToCosMappingsOutput {
	return i.ToSwitchDscpToCosMappingsOutputWithContext(context.Background())
}

func (i *SwitchDscpToCosMappings) ToSwitchDscpToCosMappingsOutputWithContext(ctx context.Context) SwitchDscpToCosMappingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchDscpToCosMappingsOutput)
}

// SwitchDscpToCosMappingsArrayInput is an input type that accepts SwitchDscpToCosMappingsArray and SwitchDscpToCosMappingsArrayOutput values.
// You can construct a concrete instance of `SwitchDscpToCosMappingsArrayInput` via:
//
//	SwitchDscpToCosMappingsArray{ SwitchDscpToCosMappingsArgs{...} }
type SwitchDscpToCosMappingsArrayInput interface {
	pulumi.Input

	ToSwitchDscpToCosMappingsArrayOutput() SwitchDscpToCosMappingsArrayOutput
	ToSwitchDscpToCosMappingsArrayOutputWithContext(context.Context) SwitchDscpToCosMappingsArrayOutput
}

type SwitchDscpToCosMappingsArray []SwitchDscpToCosMappingsInput

func (SwitchDscpToCosMappingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchDscpToCosMappings)(nil)).Elem()
}

func (i SwitchDscpToCosMappingsArray) ToSwitchDscpToCosMappingsArrayOutput() SwitchDscpToCosMappingsArrayOutput {
	return i.ToSwitchDscpToCosMappingsArrayOutputWithContext(context.Background())
}

func (i SwitchDscpToCosMappingsArray) ToSwitchDscpToCosMappingsArrayOutputWithContext(ctx context.Context) SwitchDscpToCosMappingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchDscpToCosMappingsArrayOutput)
}

// SwitchDscpToCosMappingsMapInput is an input type that accepts SwitchDscpToCosMappingsMap and SwitchDscpToCosMappingsMapOutput values.
// You can construct a concrete instance of `SwitchDscpToCosMappingsMapInput` via:
//
//	SwitchDscpToCosMappingsMap{ "key": SwitchDscpToCosMappingsArgs{...} }
type SwitchDscpToCosMappingsMapInput interface {
	pulumi.Input

	ToSwitchDscpToCosMappingsMapOutput() SwitchDscpToCosMappingsMapOutput
	ToSwitchDscpToCosMappingsMapOutputWithContext(context.Context) SwitchDscpToCosMappingsMapOutput
}

type SwitchDscpToCosMappingsMap map[string]SwitchDscpToCosMappingsInput

func (SwitchDscpToCosMappingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchDscpToCosMappings)(nil)).Elem()
}

func (i SwitchDscpToCosMappingsMap) ToSwitchDscpToCosMappingsMapOutput() SwitchDscpToCosMappingsMapOutput {
	return i.ToSwitchDscpToCosMappingsMapOutputWithContext(context.Background())
}

func (i SwitchDscpToCosMappingsMap) ToSwitchDscpToCosMappingsMapOutputWithContext(ctx context.Context) SwitchDscpToCosMappingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchDscpToCosMappingsMapOutput)
}

type SwitchDscpToCosMappingsOutput struct{ *pulumi.OutputState }

func (SwitchDscpToCosMappingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchDscpToCosMappings)(nil)).Elem()
}

func (o SwitchDscpToCosMappingsOutput) ToSwitchDscpToCosMappingsOutput() SwitchDscpToCosMappingsOutput {
	return o
}

func (o SwitchDscpToCosMappingsOutput) ToSwitchDscpToCosMappingsOutputWithContext(ctx context.Context) SwitchDscpToCosMappingsOutput {
	return o
}

// An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
func (o SwitchDscpToCosMappingsOutput) Mappings() SwitchDscpToCosMappingsMappingArrayOutput {
	return o.ApplyT(func(v *SwitchDscpToCosMappings) SwitchDscpToCosMappingsMappingArrayOutput { return v.Mappings }).(SwitchDscpToCosMappingsMappingArrayOutput)
}

// networkId path parameter. Network ID
func (o SwitchDscpToCosMappingsOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchDscpToCosMappings) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

type SwitchDscpToCosMappingsArrayOutput struct{ *pulumi.OutputState }

func (SwitchDscpToCosMappingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchDscpToCosMappings)(nil)).Elem()
}

func (o SwitchDscpToCosMappingsArrayOutput) ToSwitchDscpToCosMappingsArrayOutput() SwitchDscpToCosMappingsArrayOutput {
	return o
}

func (o SwitchDscpToCosMappingsArrayOutput) ToSwitchDscpToCosMappingsArrayOutputWithContext(ctx context.Context) SwitchDscpToCosMappingsArrayOutput {
	return o
}

func (o SwitchDscpToCosMappingsArrayOutput) Index(i pulumi.IntInput) SwitchDscpToCosMappingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchDscpToCosMappings {
		return vs[0].([]*SwitchDscpToCosMappings)[vs[1].(int)]
	}).(SwitchDscpToCosMappingsOutput)
}

type SwitchDscpToCosMappingsMapOutput struct{ *pulumi.OutputState }

func (SwitchDscpToCosMappingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchDscpToCosMappings)(nil)).Elem()
}

func (o SwitchDscpToCosMappingsMapOutput) ToSwitchDscpToCosMappingsMapOutput() SwitchDscpToCosMappingsMapOutput {
	return o
}

func (o SwitchDscpToCosMappingsMapOutput) ToSwitchDscpToCosMappingsMapOutputWithContext(ctx context.Context) SwitchDscpToCosMappingsMapOutput {
	return o
}

func (o SwitchDscpToCosMappingsMapOutput) MapIndex(k pulumi.StringInput) SwitchDscpToCosMappingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchDscpToCosMappings {
		return vs[0].(map[string]*SwitchDscpToCosMappings)[vs[1].(string)]
	}).(SwitchDscpToCosMappingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchDscpToCosMappingsInput)(nil)).Elem(), &SwitchDscpToCosMappings{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchDscpToCosMappingsArrayInput)(nil)).Elem(), SwitchDscpToCosMappingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchDscpToCosMappingsMapInput)(nil)).Elem(), SwitchDscpToCosMappingsMap{})
	pulumi.RegisterOutputType(SwitchDscpToCosMappingsOutput{})
	pulumi.RegisterOutputType(SwitchDscpToCosMappingsArrayOutput{})
	pulumi.RegisterOutputType(SwitchDscpToCosMappingsMapOutput{})
}