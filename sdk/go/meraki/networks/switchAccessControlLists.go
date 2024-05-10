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
// $ pulumi import meraki:networks/switchAccessControlLists:SwitchAccessControlLists example "network_id"
// ```
type SwitchAccessControlLists struct {
	pulumi.CustomResourceState

	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// An ordered array of the access control list rules
	Rules SwitchAccessControlListsRuleArrayOutput `pulumi:"rules"`
	// An ordered array of the access control list rules
	RulesResponses SwitchAccessControlListsRulesResponseArrayOutput `pulumi:"rulesResponses"`
}

// NewSwitchAccessControlLists registers a new resource with the given unique name, arguments, and options.
func NewSwitchAccessControlLists(ctx *pulumi.Context,
	name string, args *SwitchAccessControlListsArgs, opts ...pulumi.ResourceOption) (*SwitchAccessControlLists, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchAccessControlLists
	err := ctx.RegisterResource("meraki:networks/switchAccessControlLists:SwitchAccessControlLists", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchAccessControlLists gets an existing SwitchAccessControlLists resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchAccessControlLists(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchAccessControlListsState, opts ...pulumi.ResourceOption) (*SwitchAccessControlLists, error) {
	var resource SwitchAccessControlLists
	err := ctx.ReadResource("meraki:networks/switchAccessControlLists:SwitchAccessControlLists", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchAccessControlLists resources.
type switchAccessControlListsState struct {
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// An ordered array of the access control list rules
	Rules []SwitchAccessControlListsRule `pulumi:"rules"`
	// An ordered array of the access control list rules
	RulesResponses []SwitchAccessControlListsRulesResponse `pulumi:"rulesResponses"`
}

type SwitchAccessControlListsState struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// An ordered array of the access control list rules
	Rules SwitchAccessControlListsRuleArrayInput
	// An ordered array of the access control list rules
	RulesResponses SwitchAccessControlListsRulesResponseArrayInput
}

func (SwitchAccessControlListsState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchAccessControlListsState)(nil)).Elem()
}

type switchAccessControlListsArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// An ordered array of the access control list rules
	Rules []SwitchAccessControlListsRule `pulumi:"rules"`
	// An ordered array of the access control list rules
	RulesResponses []SwitchAccessControlListsRulesResponse `pulumi:"rulesResponses"`
}

// The set of arguments for constructing a SwitchAccessControlLists resource.
type SwitchAccessControlListsArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// An ordered array of the access control list rules
	Rules SwitchAccessControlListsRuleArrayInput
	// An ordered array of the access control list rules
	RulesResponses SwitchAccessControlListsRulesResponseArrayInput
}

func (SwitchAccessControlListsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchAccessControlListsArgs)(nil)).Elem()
}

type SwitchAccessControlListsInput interface {
	pulumi.Input

	ToSwitchAccessControlListsOutput() SwitchAccessControlListsOutput
	ToSwitchAccessControlListsOutputWithContext(ctx context.Context) SwitchAccessControlListsOutput
}

func (*SwitchAccessControlLists) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchAccessControlLists)(nil)).Elem()
}

func (i *SwitchAccessControlLists) ToSwitchAccessControlListsOutput() SwitchAccessControlListsOutput {
	return i.ToSwitchAccessControlListsOutputWithContext(context.Background())
}

func (i *SwitchAccessControlLists) ToSwitchAccessControlListsOutputWithContext(ctx context.Context) SwitchAccessControlListsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchAccessControlListsOutput)
}

// SwitchAccessControlListsArrayInput is an input type that accepts SwitchAccessControlListsArray and SwitchAccessControlListsArrayOutput values.
// You can construct a concrete instance of `SwitchAccessControlListsArrayInput` via:
//
//	SwitchAccessControlListsArray{ SwitchAccessControlListsArgs{...} }
type SwitchAccessControlListsArrayInput interface {
	pulumi.Input

	ToSwitchAccessControlListsArrayOutput() SwitchAccessControlListsArrayOutput
	ToSwitchAccessControlListsArrayOutputWithContext(context.Context) SwitchAccessControlListsArrayOutput
}

type SwitchAccessControlListsArray []SwitchAccessControlListsInput

func (SwitchAccessControlListsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchAccessControlLists)(nil)).Elem()
}

func (i SwitchAccessControlListsArray) ToSwitchAccessControlListsArrayOutput() SwitchAccessControlListsArrayOutput {
	return i.ToSwitchAccessControlListsArrayOutputWithContext(context.Background())
}

func (i SwitchAccessControlListsArray) ToSwitchAccessControlListsArrayOutputWithContext(ctx context.Context) SwitchAccessControlListsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchAccessControlListsArrayOutput)
}

// SwitchAccessControlListsMapInput is an input type that accepts SwitchAccessControlListsMap and SwitchAccessControlListsMapOutput values.
// You can construct a concrete instance of `SwitchAccessControlListsMapInput` via:
//
//	SwitchAccessControlListsMap{ "key": SwitchAccessControlListsArgs{...} }
type SwitchAccessControlListsMapInput interface {
	pulumi.Input

	ToSwitchAccessControlListsMapOutput() SwitchAccessControlListsMapOutput
	ToSwitchAccessControlListsMapOutputWithContext(context.Context) SwitchAccessControlListsMapOutput
}

type SwitchAccessControlListsMap map[string]SwitchAccessControlListsInput

func (SwitchAccessControlListsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchAccessControlLists)(nil)).Elem()
}

func (i SwitchAccessControlListsMap) ToSwitchAccessControlListsMapOutput() SwitchAccessControlListsMapOutput {
	return i.ToSwitchAccessControlListsMapOutputWithContext(context.Background())
}

func (i SwitchAccessControlListsMap) ToSwitchAccessControlListsMapOutputWithContext(ctx context.Context) SwitchAccessControlListsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchAccessControlListsMapOutput)
}

type SwitchAccessControlListsOutput struct{ *pulumi.OutputState }

func (SwitchAccessControlListsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchAccessControlLists)(nil)).Elem()
}

func (o SwitchAccessControlListsOutput) ToSwitchAccessControlListsOutput() SwitchAccessControlListsOutput {
	return o
}

func (o SwitchAccessControlListsOutput) ToSwitchAccessControlListsOutputWithContext(ctx context.Context) SwitchAccessControlListsOutput {
	return o
}

// networkId path parameter. Network ID
func (o SwitchAccessControlListsOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchAccessControlLists) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// An ordered array of the access control list rules
func (o SwitchAccessControlListsOutput) Rules() SwitchAccessControlListsRuleArrayOutput {
	return o.ApplyT(func(v *SwitchAccessControlLists) SwitchAccessControlListsRuleArrayOutput { return v.Rules }).(SwitchAccessControlListsRuleArrayOutput)
}

// An ordered array of the access control list rules
func (o SwitchAccessControlListsOutput) RulesResponses() SwitchAccessControlListsRulesResponseArrayOutput {
	return o.ApplyT(func(v *SwitchAccessControlLists) SwitchAccessControlListsRulesResponseArrayOutput {
		return v.RulesResponses
	}).(SwitchAccessControlListsRulesResponseArrayOutput)
}

type SwitchAccessControlListsArrayOutput struct{ *pulumi.OutputState }

func (SwitchAccessControlListsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchAccessControlLists)(nil)).Elem()
}

func (o SwitchAccessControlListsArrayOutput) ToSwitchAccessControlListsArrayOutput() SwitchAccessControlListsArrayOutput {
	return o
}

func (o SwitchAccessControlListsArrayOutput) ToSwitchAccessControlListsArrayOutputWithContext(ctx context.Context) SwitchAccessControlListsArrayOutput {
	return o
}

func (o SwitchAccessControlListsArrayOutput) Index(i pulumi.IntInput) SwitchAccessControlListsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchAccessControlLists {
		return vs[0].([]*SwitchAccessControlLists)[vs[1].(int)]
	}).(SwitchAccessControlListsOutput)
}

type SwitchAccessControlListsMapOutput struct{ *pulumi.OutputState }

func (SwitchAccessControlListsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchAccessControlLists)(nil)).Elem()
}

func (o SwitchAccessControlListsMapOutput) ToSwitchAccessControlListsMapOutput() SwitchAccessControlListsMapOutput {
	return o
}

func (o SwitchAccessControlListsMapOutput) ToSwitchAccessControlListsMapOutputWithContext(ctx context.Context) SwitchAccessControlListsMapOutput {
	return o
}

func (o SwitchAccessControlListsMapOutput) MapIndex(k pulumi.StringInput) SwitchAccessControlListsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchAccessControlLists {
		return vs[0].(map[string]*SwitchAccessControlLists)[vs[1].(string)]
	}).(SwitchAccessControlListsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchAccessControlListsInput)(nil)).Elem(), &SwitchAccessControlLists{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchAccessControlListsArrayInput)(nil)).Elem(), SwitchAccessControlListsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchAccessControlListsMapInput)(nil)).Elem(), SwitchAccessControlListsMap{})
	pulumi.RegisterOutputType(SwitchAccessControlListsOutput{})
	pulumi.RegisterOutputType(SwitchAccessControlListsArrayOutput{})
	pulumi.RegisterOutputType(SwitchAccessControlListsMapOutput{})
}
