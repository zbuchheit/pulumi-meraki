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
// $ pulumi import meraki:networks/switchStp:SwitchStp example "network_id"
// ```
type SwitchStp struct {
	pulumi.CustomResourceState

	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// The spanning tree protocol status in network
	RstpEnabled pulumi.BoolOutput `pulumi:"rstpEnabled"`
	// STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
	StpBridgePriorities SwitchStpStpBridgePriorityArrayOutput `pulumi:"stpBridgePriorities"`
	// STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
	StpBridgePriorityResponses SwitchStpStpBridgePriorityResponseArrayOutput `pulumi:"stpBridgePriorityResponses"`
}

// NewSwitchStp registers a new resource with the given unique name, arguments, and options.
func NewSwitchStp(ctx *pulumi.Context,
	name string, args *SwitchStpArgs, opts ...pulumi.ResourceOption) (*SwitchStp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchStp
	err := ctx.RegisterResource("meraki:networks/switchStp:SwitchStp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchStp gets an existing SwitchStp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchStp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchStpState, opts ...pulumi.ResourceOption) (*SwitchStp, error) {
	var resource SwitchStp
	err := ctx.ReadResource("meraki:networks/switchStp:SwitchStp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchStp resources.
type switchStpState struct {
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// The spanning tree protocol status in network
	RstpEnabled *bool `pulumi:"rstpEnabled"`
	// STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
	StpBridgePriorities []SwitchStpStpBridgePriority `pulumi:"stpBridgePriorities"`
	// STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
	StpBridgePriorityResponses []SwitchStpStpBridgePriorityResponse `pulumi:"stpBridgePriorityResponses"`
}

type SwitchStpState struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// The spanning tree protocol status in network
	RstpEnabled pulumi.BoolPtrInput
	// STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
	StpBridgePriorities SwitchStpStpBridgePriorityArrayInput
	// STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
	StpBridgePriorityResponses SwitchStpStpBridgePriorityResponseArrayInput
}

func (SwitchStpState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchStpState)(nil)).Elem()
}

type switchStpArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// The spanning tree protocol status in network
	RstpEnabled *bool `pulumi:"rstpEnabled"`
	// STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
	StpBridgePriorities []SwitchStpStpBridgePriority `pulumi:"stpBridgePriorities"`
}

// The set of arguments for constructing a SwitchStp resource.
type SwitchStpArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// The spanning tree protocol status in network
	RstpEnabled pulumi.BoolPtrInput
	// STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
	StpBridgePriorities SwitchStpStpBridgePriorityArrayInput
}

func (SwitchStpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchStpArgs)(nil)).Elem()
}

type SwitchStpInput interface {
	pulumi.Input

	ToSwitchStpOutput() SwitchStpOutput
	ToSwitchStpOutputWithContext(ctx context.Context) SwitchStpOutput
}

func (*SwitchStp) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchStp)(nil)).Elem()
}

func (i *SwitchStp) ToSwitchStpOutput() SwitchStpOutput {
	return i.ToSwitchStpOutputWithContext(context.Background())
}

func (i *SwitchStp) ToSwitchStpOutputWithContext(ctx context.Context) SwitchStpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchStpOutput)
}

// SwitchStpArrayInput is an input type that accepts SwitchStpArray and SwitchStpArrayOutput values.
// You can construct a concrete instance of `SwitchStpArrayInput` via:
//
//	SwitchStpArray{ SwitchStpArgs{...} }
type SwitchStpArrayInput interface {
	pulumi.Input

	ToSwitchStpArrayOutput() SwitchStpArrayOutput
	ToSwitchStpArrayOutputWithContext(context.Context) SwitchStpArrayOutput
}

type SwitchStpArray []SwitchStpInput

func (SwitchStpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchStp)(nil)).Elem()
}

func (i SwitchStpArray) ToSwitchStpArrayOutput() SwitchStpArrayOutput {
	return i.ToSwitchStpArrayOutputWithContext(context.Background())
}

func (i SwitchStpArray) ToSwitchStpArrayOutputWithContext(ctx context.Context) SwitchStpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchStpArrayOutput)
}

// SwitchStpMapInput is an input type that accepts SwitchStpMap and SwitchStpMapOutput values.
// You can construct a concrete instance of `SwitchStpMapInput` via:
//
//	SwitchStpMap{ "key": SwitchStpArgs{...} }
type SwitchStpMapInput interface {
	pulumi.Input

	ToSwitchStpMapOutput() SwitchStpMapOutput
	ToSwitchStpMapOutputWithContext(context.Context) SwitchStpMapOutput
}

type SwitchStpMap map[string]SwitchStpInput

func (SwitchStpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchStp)(nil)).Elem()
}

func (i SwitchStpMap) ToSwitchStpMapOutput() SwitchStpMapOutput {
	return i.ToSwitchStpMapOutputWithContext(context.Background())
}

func (i SwitchStpMap) ToSwitchStpMapOutputWithContext(ctx context.Context) SwitchStpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchStpMapOutput)
}

type SwitchStpOutput struct{ *pulumi.OutputState }

func (SwitchStpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchStp)(nil)).Elem()
}

func (o SwitchStpOutput) ToSwitchStpOutput() SwitchStpOutput {
	return o
}

func (o SwitchStpOutput) ToSwitchStpOutputWithContext(ctx context.Context) SwitchStpOutput {
	return o
}

// networkId path parameter. Network ID
func (o SwitchStpOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStp) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// The spanning tree protocol status in network
func (o SwitchStpOutput) RstpEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchStp) pulumi.BoolOutput { return v.RstpEnabled }).(pulumi.BoolOutput)
}

// STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
func (o SwitchStpOutput) StpBridgePriorities() SwitchStpStpBridgePriorityArrayOutput {
	return o.ApplyT(func(v *SwitchStp) SwitchStpStpBridgePriorityArrayOutput { return v.StpBridgePriorities }).(SwitchStpStpBridgePriorityArrayOutput)
}

// STP bridge priority for switches/stacks or switch templates. An empty array will clear the STP bridge priority settings.
func (o SwitchStpOutput) StpBridgePriorityResponses() SwitchStpStpBridgePriorityResponseArrayOutput {
	return o.ApplyT(func(v *SwitchStp) SwitchStpStpBridgePriorityResponseArrayOutput { return v.StpBridgePriorityResponses }).(SwitchStpStpBridgePriorityResponseArrayOutput)
}

type SwitchStpArrayOutput struct{ *pulumi.OutputState }

func (SwitchStpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchStp)(nil)).Elem()
}

func (o SwitchStpArrayOutput) ToSwitchStpArrayOutput() SwitchStpArrayOutput {
	return o
}

func (o SwitchStpArrayOutput) ToSwitchStpArrayOutputWithContext(ctx context.Context) SwitchStpArrayOutput {
	return o
}

func (o SwitchStpArrayOutput) Index(i pulumi.IntInput) SwitchStpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchStp {
		return vs[0].([]*SwitchStp)[vs[1].(int)]
	}).(SwitchStpOutput)
}

type SwitchStpMapOutput struct{ *pulumi.OutputState }

func (SwitchStpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchStp)(nil)).Elem()
}

func (o SwitchStpMapOutput) ToSwitchStpMapOutput() SwitchStpMapOutput {
	return o
}

func (o SwitchStpMapOutput) ToSwitchStpMapOutputWithContext(ctx context.Context) SwitchStpMapOutput {
	return o
}

func (o SwitchStpMapOutput) MapIndex(k pulumi.StringInput) SwitchStpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchStp {
		return vs[0].(map[string]*SwitchStp)[vs[1].(string)]
	}).(SwitchStpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchStpInput)(nil)).Elem(), &SwitchStp{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchStpArrayInput)(nil)).Elem(), SwitchStpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchStpMapInput)(nil)).Elem(), SwitchStpMap{})
	pulumi.RegisterOutputType(SwitchStpOutput{})
	pulumi.RegisterOutputType(SwitchStpArrayOutput{})
	pulumi.RegisterOutputType(SwitchStpMapOutput{})
}
