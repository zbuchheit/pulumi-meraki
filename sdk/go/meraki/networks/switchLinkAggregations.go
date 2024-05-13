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
// $ pulumi import meraki:networks/switchLinkAggregations:SwitchLinkAggregations example "network_id"
// ```
type SwitchLinkAggregations struct {
	pulumi.CustomResourceState

	// linkAggregationId path parameter. Link aggregation ID
	LinkAggregationId pulumi.StringOutput `pulumi:"linkAggregationId"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// Array of switch or stack ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
	SwitchPorts SwitchLinkAggregationsSwitchPortArrayOutput `pulumi:"switchPorts"`
	// Array of switch profile ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
	SwitchProfilePorts SwitchLinkAggregationsSwitchProfilePortArrayOutput `pulumi:"switchProfilePorts"`
}

// NewSwitchLinkAggregations registers a new resource with the given unique name, arguments, and options.
func NewSwitchLinkAggregations(ctx *pulumi.Context,
	name string, args *SwitchLinkAggregationsArgs, opts ...pulumi.ResourceOption) (*SwitchLinkAggregations, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchLinkAggregations
	err := ctx.RegisterResource("meraki:networks/switchLinkAggregations:SwitchLinkAggregations", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchLinkAggregations gets an existing SwitchLinkAggregations resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchLinkAggregations(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchLinkAggregationsState, opts ...pulumi.ResourceOption) (*SwitchLinkAggregations, error) {
	var resource SwitchLinkAggregations
	err := ctx.ReadResource("meraki:networks/switchLinkAggregations:SwitchLinkAggregations", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchLinkAggregations resources.
type switchLinkAggregationsState struct {
	// linkAggregationId path parameter. Link aggregation ID
	LinkAggregationId *string `pulumi:"linkAggregationId"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// Array of switch or stack ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
	SwitchPorts []SwitchLinkAggregationsSwitchPort `pulumi:"switchPorts"`
	// Array of switch profile ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
	SwitchProfilePorts []SwitchLinkAggregationsSwitchProfilePort `pulumi:"switchProfilePorts"`
}

type SwitchLinkAggregationsState struct {
	// linkAggregationId path parameter. Link aggregation ID
	LinkAggregationId pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// Array of switch or stack ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
	SwitchPorts SwitchLinkAggregationsSwitchPortArrayInput
	// Array of switch profile ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
	SwitchProfilePorts SwitchLinkAggregationsSwitchProfilePortArrayInput
}

func (SwitchLinkAggregationsState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchLinkAggregationsState)(nil)).Elem()
}

type switchLinkAggregationsArgs struct {
	// linkAggregationId path parameter. Link aggregation ID
	LinkAggregationId *string `pulumi:"linkAggregationId"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// Array of switch or stack ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
	SwitchPorts []SwitchLinkAggregationsSwitchPort `pulumi:"switchPorts"`
	// Array of switch profile ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
	SwitchProfilePorts []SwitchLinkAggregationsSwitchProfilePort `pulumi:"switchProfilePorts"`
}

// The set of arguments for constructing a SwitchLinkAggregations resource.
type SwitchLinkAggregationsArgs struct {
	// linkAggregationId path parameter. Link aggregation ID
	LinkAggregationId pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// Array of switch or stack ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
	SwitchPorts SwitchLinkAggregationsSwitchPortArrayInput
	// Array of switch profile ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
	SwitchProfilePorts SwitchLinkAggregationsSwitchProfilePortArrayInput
}

func (SwitchLinkAggregationsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchLinkAggregationsArgs)(nil)).Elem()
}

type SwitchLinkAggregationsInput interface {
	pulumi.Input

	ToSwitchLinkAggregationsOutput() SwitchLinkAggregationsOutput
	ToSwitchLinkAggregationsOutputWithContext(ctx context.Context) SwitchLinkAggregationsOutput
}

func (*SwitchLinkAggregations) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchLinkAggregations)(nil)).Elem()
}

func (i *SwitchLinkAggregations) ToSwitchLinkAggregationsOutput() SwitchLinkAggregationsOutput {
	return i.ToSwitchLinkAggregationsOutputWithContext(context.Background())
}

func (i *SwitchLinkAggregations) ToSwitchLinkAggregationsOutputWithContext(ctx context.Context) SwitchLinkAggregationsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchLinkAggregationsOutput)
}

// SwitchLinkAggregationsArrayInput is an input type that accepts SwitchLinkAggregationsArray and SwitchLinkAggregationsArrayOutput values.
// You can construct a concrete instance of `SwitchLinkAggregationsArrayInput` via:
//
//	SwitchLinkAggregationsArray{ SwitchLinkAggregationsArgs{...} }
type SwitchLinkAggregationsArrayInput interface {
	pulumi.Input

	ToSwitchLinkAggregationsArrayOutput() SwitchLinkAggregationsArrayOutput
	ToSwitchLinkAggregationsArrayOutputWithContext(context.Context) SwitchLinkAggregationsArrayOutput
}

type SwitchLinkAggregationsArray []SwitchLinkAggregationsInput

func (SwitchLinkAggregationsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchLinkAggregations)(nil)).Elem()
}

func (i SwitchLinkAggregationsArray) ToSwitchLinkAggregationsArrayOutput() SwitchLinkAggregationsArrayOutput {
	return i.ToSwitchLinkAggregationsArrayOutputWithContext(context.Background())
}

func (i SwitchLinkAggregationsArray) ToSwitchLinkAggregationsArrayOutputWithContext(ctx context.Context) SwitchLinkAggregationsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchLinkAggregationsArrayOutput)
}

// SwitchLinkAggregationsMapInput is an input type that accepts SwitchLinkAggregationsMap and SwitchLinkAggregationsMapOutput values.
// You can construct a concrete instance of `SwitchLinkAggregationsMapInput` via:
//
//	SwitchLinkAggregationsMap{ "key": SwitchLinkAggregationsArgs{...} }
type SwitchLinkAggregationsMapInput interface {
	pulumi.Input

	ToSwitchLinkAggregationsMapOutput() SwitchLinkAggregationsMapOutput
	ToSwitchLinkAggregationsMapOutputWithContext(context.Context) SwitchLinkAggregationsMapOutput
}

type SwitchLinkAggregationsMap map[string]SwitchLinkAggregationsInput

func (SwitchLinkAggregationsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchLinkAggregations)(nil)).Elem()
}

func (i SwitchLinkAggregationsMap) ToSwitchLinkAggregationsMapOutput() SwitchLinkAggregationsMapOutput {
	return i.ToSwitchLinkAggregationsMapOutputWithContext(context.Background())
}

func (i SwitchLinkAggregationsMap) ToSwitchLinkAggregationsMapOutputWithContext(ctx context.Context) SwitchLinkAggregationsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchLinkAggregationsMapOutput)
}

type SwitchLinkAggregationsOutput struct{ *pulumi.OutputState }

func (SwitchLinkAggregationsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchLinkAggregations)(nil)).Elem()
}

func (o SwitchLinkAggregationsOutput) ToSwitchLinkAggregationsOutput() SwitchLinkAggregationsOutput {
	return o
}

func (o SwitchLinkAggregationsOutput) ToSwitchLinkAggregationsOutputWithContext(ctx context.Context) SwitchLinkAggregationsOutput {
	return o
}

// linkAggregationId path parameter. Link aggregation ID
func (o SwitchLinkAggregationsOutput) LinkAggregationId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchLinkAggregations) pulumi.StringOutput { return v.LinkAggregationId }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o SwitchLinkAggregationsOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchLinkAggregations) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// Array of switch or stack ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
func (o SwitchLinkAggregationsOutput) SwitchPorts() SwitchLinkAggregationsSwitchPortArrayOutput {
	return o.ApplyT(func(v *SwitchLinkAggregations) SwitchLinkAggregationsSwitchPortArrayOutput { return v.SwitchPorts }).(SwitchLinkAggregationsSwitchPortArrayOutput)
}

// Array of switch profile ports for creating aggregation group. Minimum 2 and maximum 8 ports are supported.
func (o SwitchLinkAggregationsOutput) SwitchProfilePorts() SwitchLinkAggregationsSwitchProfilePortArrayOutput {
	return o.ApplyT(func(v *SwitchLinkAggregations) SwitchLinkAggregationsSwitchProfilePortArrayOutput {
		return v.SwitchProfilePorts
	}).(SwitchLinkAggregationsSwitchProfilePortArrayOutput)
}

type SwitchLinkAggregationsArrayOutput struct{ *pulumi.OutputState }

func (SwitchLinkAggregationsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchLinkAggregations)(nil)).Elem()
}

func (o SwitchLinkAggregationsArrayOutput) ToSwitchLinkAggregationsArrayOutput() SwitchLinkAggregationsArrayOutput {
	return o
}

func (o SwitchLinkAggregationsArrayOutput) ToSwitchLinkAggregationsArrayOutputWithContext(ctx context.Context) SwitchLinkAggregationsArrayOutput {
	return o
}

func (o SwitchLinkAggregationsArrayOutput) Index(i pulumi.IntInput) SwitchLinkAggregationsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchLinkAggregations {
		return vs[0].([]*SwitchLinkAggregations)[vs[1].(int)]
	}).(SwitchLinkAggregationsOutput)
}

type SwitchLinkAggregationsMapOutput struct{ *pulumi.OutputState }

func (SwitchLinkAggregationsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchLinkAggregations)(nil)).Elem()
}

func (o SwitchLinkAggregationsMapOutput) ToSwitchLinkAggregationsMapOutput() SwitchLinkAggregationsMapOutput {
	return o
}

func (o SwitchLinkAggregationsMapOutput) ToSwitchLinkAggregationsMapOutputWithContext(ctx context.Context) SwitchLinkAggregationsMapOutput {
	return o
}

func (o SwitchLinkAggregationsMapOutput) MapIndex(k pulumi.StringInput) SwitchLinkAggregationsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchLinkAggregations {
		return vs[0].(map[string]*SwitchLinkAggregations)[vs[1].(string)]
	}).(SwitchLinkAggregationsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchLinkAggregationsInput)(nil)).Elem(), &SwitchLinkAggregations{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchLinkAggregationsArrayInput)(nil)).Elem(), SwitchLinkAggregationsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchLinkAggregationsMapInput)(nil)).Elem(), SwitchLinkAggregationsMap{})
	pulumi.RegisterOutputType(SwitchLinkAggregationsOutput{})
	pulumi.RegisterOutputType(SwitchLinkAggregationsArrayOutput{})
	pulumi.RegisterOutputType(SwitchLinkAggregationsMapOutput{})
}