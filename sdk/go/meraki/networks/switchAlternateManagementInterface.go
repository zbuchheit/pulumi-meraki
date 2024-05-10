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
// $ pulumi import meraki:networks/switchAlternateManagementInterface:SwitchAlternateManagementInterface example "network_id"
// ```
type SwitchAlternateManagementInterface struct {
	pulumi.CustomResourceState

	// Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
	Protocols pulumi.StringArrayOutput `pulumi:"protocols"`
	// Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
	Switches SwitchAlternateManagementInterfaceSwitchArrayOutput `pulumi:"switches"`
	// Alternate management VLAN, must be between 1 and 4094
	VlanId pulumi.IntOutput `pulumi:"vlanId"`
}

// NewSwitchAlternateManagementInterface registers a new resource with the given unique name, arguments, and options.
func NewSwitchAlternateManagementInterface(ctx *pulumi.Context,
	name string, args *SwitchAlternateManagementInterfaceArgs, opts ...pulumi.ResourceOption) (*SwitchAlternateManagementInterface, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchAlternateManagementInterface
	err := ctx.RegisterResource("meraki:networks/switchAlternateManagementInterface:SwitchAlternateManagementInterface", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchAlternateManagementInterface gets an existing SwitchAlternateManagementInterface resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchAlternateManagementInterface(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchAlternateManagementInterfaceState, opts ...pulumi.ResourceOption) (*SwitchAlternateManagementInterface, error) {
	var resource SwitchAlternateManagementInterface
	err := ctx.ReadResource("meraki:networks/switchAlternateManagementInterface:SwitchAlternateManagementInterface", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchAlternateManagementInterface resources.
type switchAlternateManagementInterfaceState struct {
	// Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
	Enabled *bool `pulumi:"enabled"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
	Protocols []string `pulumi:"protocols"`
	// Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
	Switches []SwitchAlternateManagementInterfaceSwitch `pulumi:"switches"`
	// Alternate management VLAN, must be between 1 and 4094
	VlanId *int `pulumi:"vlanId"`
}

type SwitchAlternateManagementInterfaceState struct {
	// Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
	Enabled pulumi.BoolPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
	Protocols pulumi.StringArrayInput
	// Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
	Switches SwitchAlternateManagementInterfaceSwitchArrayInput
	// Alternate management VLAN, must be between 1 and 4094
	VlanId pulumi.IntPtrInput
}

func (SwitchAlternateManagementInterfaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchAlternateManagementInterfaceState)(nil)).Elem()
}

type switchAlternateManagementInterfaceArgs struct {
	// Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
	Enabled *bool `pulumi:"enabled"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
	Protocols []string `pulumi:"protocols"`
	// Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
	Switches []SwitchAlternateManagementInterfaceSwitch `pulumi:"switches"`
	// Alternate management VLAN, must be between 1 and 4094
	VlanId *int `pulumi:"vlanId"`
}

// The set of arguments for constructing a SwitchAlternateManagementInterface resource.
type SwitchAlternateManagementInterfaceArgs struct {
	// Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
	Enabled pulumi.BoolPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
	Protocols pulumi.StringArrayInput
	// Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
	Switches SwitchAlternateManagementInterfaceSwitchArrayInput
	// Alternate management VLAN, must be between 1 and 4094
	VlanId pulumi.IntPtrInput
}

func (SwitchAlternateManagementInterfaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchAlternateManagementInterfaceArgs)(nil)).Elem()
}

type SwitchAlternateManagementInterfaceInput interface {
	pulumi.Input

	ToSwitchAlternateManagementInterfaceOutput() SwitchAlternateManagementInterfaceOutput
	ToSwitchAlternateManagementInterfaceOutputWithContext(ctx context.Context) SwitchAlternateManagementInterfaceOutput
}

func (*SwitchAlternateManagementInterface) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchAlternateManagementInterface)(nil)).Elem()
}

func (i *SwitchAlternateManagementInterface) ToSwitchAlternateManagementInterfaceOutput() SwitchAlternateManagementInterfaceOutput {
	return i.ToSwitchAlternateManagementInterfaceOutputWithContext(context.Background())
}

func (i *SwitchAlternateManagementInterface) ToSwitchAlternateManagementInterfaceOutputWithContext(ctx context.Context) SwitchAlternateManagementInterfaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchAlternateManagementInterfaceOutput)
}

// SwitchAlternateManagementInterfaceArrayInput is an input type that accepts SwitchAlternateManagementInterfaceArray and SwitchAlternateManagementInterfaceArrayOutput values.
// You can construct a concrete instance of `SwitchAlternateManagementInterfaceArrayInput` via:
//
//	SwitchAlternateManagementInterfaceArray{ SwitchAlternateManagementInterfaceArgs{...} }
type SwitchAlternateManagementInterfaceArrayInput interface {
	pulumi.Input

	ToSwitchAlternateManagementInterfaceArrayOutput() SwitchAlternateManagementInterfaceArrayOutput
	ToSwitchAlternateManagementInterfaceArrayOutputWithContext(context.Context) SwitchAlternateManagementInterfaceArrayOutput
}

type SwitchAlternateManagementInterfaceArray []SwitchAlternateManagementInterfaceInput

func (SwitchAlternateManagementInterfaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchAlternateManagementInterface)(nil)).Elem()
}

func (i SwitchAlternateManagementInterfaceArray) ToSwitchAlternateManagementInterfaceArrayOutput() SwitchAlternateManagementInterfaceArrayOutput {
	return i.ToSwitchAlternateManagementInterfaceArrayOutputWithContext(context.Background())
}

func (i SwitchAlternateManagementInterfaceArray) ToSwitchAlternateManagementInterfaceArrayOutputWithContext(ctx context.Context) SwitchAlternateManagementInterfaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchAlternateManagementInterfaceArrayOutput)
}

// SwitchAlternateManagementInterfaceMapInput is an input type that accepts SwitchAlternateManagementInterfaceMap and SwitchAlternateManagementInterfaceMapOutput values.
// You can construct a concrete instance of `SwitchAlternateManagementInterfaceMapInput` via:
//
//	SwitchAlternateManagementInterfaceMap{ "key": SwitchAlternateManagementInterfaceArgs{...} }
type SwitchAlternateManagementInterfaceMapInput interface {
	pulumi.Input

	ToSwitchAlternateManagementInterfaceMapOutput() SwitchAlternateManagementInterfaceMapOutput
	ToSwitchAlternateManagementInterfaceMapOutputWithContext(context.Context) SwitchAlternateManagementInterfaceMapOutput
}

type SwitchAlternateManagementInterfaceMap map[string]SwitchAlternateManagementInterfaceInput

func (SwitchAlternateManagementInterfaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchAlternateManagementInterface)(nil)).Elem()
}

func (i SwitchAlternateManagementInterfaceMap) ToSwitchAlternateManagementInterfaceMapOutput() SwitchAlternateManagementInterfaceMapOutput {
	return i.ToSwitchAlternateManagementInterfaceMapOutputWithContext(context.Background())
}

func (i SwitchAlternateManagementInterfaceMap) ToSwitchAlternateManagementInterfaceMapOutputWithContext(ctx context.Context) SwitchAlternateManagementInterfaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchAlternateManagementInterfaceMapOutput)
}

type SwitchAlternateManagementInterfaceOutput struct{ *pulumi.OutputState }

func (SwitchAlternateManagementInterfaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchAlternateManagementInterface)(nil)).Elem()
}

func (o SwitchAlternateManagementInterfaceOutput) ToSwitchAlternateManagementInterfaceOutput() SwitchAlternateManagementInterfaceOutput {
	return o
}

func (o SwitchAlternateManagementInterfaceOutput) ToSwitchAlternateManagementInterfaceOutputWithContext(ctx context.Context) SwitchAlternateManagementInterfaceOutput {
	return o
}

// Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
func (o SwitchAlternateManagementInterfaceOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchAlternateManagementInterface) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// networkId path parameter. Network ID
func (o SwitchAlternateManagementInterfaceOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchAlternateManagementInterface) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
func (o SwitchAlternateManagementInterfaceOutput) Protocols() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SwitchAlternateManagementInterface) pulumi.StringArrayOutput { return v.Protocols }).(pulumi.StringArrayOutput)
}

// Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
func (o SwitchAlternateManagementInterfaceOutput) Switches() SwitchAlternateManagementInterfaceSwitchArrayOutput {
	return o.ApplyT(func(v *SwitchAlternateManagementInterface) SwitchAlternateManagementInterfaceSwitchArrayOutput {
		return v.Switches
	}).(SwitchAlternateManagementInterfaceSwitchArrayOutput)
}

// Alternate management VLAN, must be between 1 and 4094
func (o SwitchAlternateManagementInterfaceOutput) VlanId() pulumi.IntOutput {
	return o.ApplyT(func(v *SwitchAlternateManagementInterface) pulumi.IntOutput { return v.VlanId }).(pulumi.IntOutput)
}

type SwitchAlternateManagementInterfaceArrayOutput struct{ *pulumi.OutputState }

func (SwitchAlternateManagementInterfaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchAlternateManagementInterface)(nil)).Elem()
}

func (o SwitchAlternateManagementInterfaceArrayOutput) ToSwitchAlternateManagementInterfaceArrayOutput() SwitchAlternateManagementInterfaceArrayOutput {
	return o
}

func (o SwitchAlternateManagementInterfaceArrayOutput) ToSwitchAlternateManagementInterfaceArrayOutputWithContext(ctx context.Context) SwitchAlternateManagementInterfaceArrayOutput {
	return o
}

func (o SwitchAlternateManagementInterfaceArrayOutput) Index(i pulumi.IntInput) SwitchAlternateManagementInterfaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchAlternateManagementInterface {
		return vs[0].([]*SwitchAlternateManagementInterface)[vs[1].(int)]
	}).(SwitchAlternateManagementInterfaceOutput)
}

type SwitchAlternateManagementInterfaceMapOutput struct{ *pulumi.OutputState }

func (SwitchAlternateManagementInterfaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchAlternateManagementInterface)(nil)).Elem()
}

func (o SwitchAlternateManagementInterfaceMapOutput) ToSwitchAlternateManagementInterfaceMapOutput() SwitchAlternateManagementInterfaceMapOutput {
	return o
}

func (o SwitchAlternateManagementInterfaceMapOutput) ToSwitchAlternateManagementInterfaceMapOutputWithContext(ctx context.Context) SwitchAlternateManagementInterfaceMapOutput {
	return o
}

func (o SwitchAlternateManagementInterfaceMapOutput) MapIndex(k pulumi.StringInput) SwitchAlternateManagementInterfaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchAlternateManagementInterface {
		return vs[0].(map[string]*SwitchAlternateManagementInterface)[vs[1].(string)]
	}).(SwitchAlternateManagementInterfaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchAlternateManagementInterfaceInput)(nil)).Elem(), &SwitchAlternateManagementInterface{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchAlternateManagementInterfaceArrayInput)(nil)).Elem(), SwitchAlternateManagementInterfaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchAlternateManagementInterfaceMapInput)(nil)).Elem(), SwitchAlternateManagementInterfaceMap{})
	pulumi.RegisterOutputType(SwitchAlternateManagementInterfaceOutput{})
	pulumi.RegisterOutputType(SwitchAlternateManagementInterfaceArrayOutput{})
	pulumi.RegisterOutputType(SwitchAlternateManagementInterfaceMapOutput{})
}
