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
// $ pulumi import meraki:networks/wirelessSettings:WirelessSettings example "network_id"
// ```
type WirelessSettings struct {
	pulumi.CustomResourceState

	// Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
	Ipv6BridgeEnabled pulumi.BoolOutput `pulumi:"ipv6BridgeEnabled"`
	// Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
	LedLightsOn pulumi.BoolOutput `pulumi:"ledLightsOn"`
	// Toggle for enabling or disabling location analytics for your network
	LocationAnalyticsEnabled pulumi.BoolOutput `pulumi:"locationAnalyticsEnabled"`
	// Toggle for enabling or disabling meshing in a network
	MeshingEnabled pulumi.BoolOutput `pulumi:"meshingEnabled"`
	// Named VLAN settings for wireless networks.
	NamedVlans WirelessSettingsNamedVlansOutput `pulumi:"namedVlans"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// Regulatory domain information for this network.
	RegulatoryDomain WirelessSettingsRegulatoryDomainOutput `pulumi:"regulatoryDomain"`
	// The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
	Upgradestrategy pulumi.StringOutput `pulumi:"upgradestrategy"`
}

// NewWirelessSettings registers a new resource with the given unique name, arguments, and options.
func NewWirelessSettings(ctx *pulumi.Context,
	name string, args *WirelessSettingsArgs, opts ...pulumi.ResourceOption) (*WirelessSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WirelessSettings
	err := ctx.RegisterResource("meraki:networks/wirelessSettings:WirelessSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWirelessSettings gets an existing WirelessSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWirelessSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WirelessSettingsState, opts ...pulumi.ResourceOption) (*WirelessSettings, error) {
	var resource WirelessSettings
	err := ctx.ReadResource("meraki:networks/wirelessSettings:WirelessSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WirelessSettings resources.
type wirelessSettingsState struct {
	// Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
	Ipv6BridgeEnabled *bool `pulumi:"ipv6BridgeEnabled"`
	// Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
	LedLightsOn *bool `pulumi:"ledLightsOn"`
	// Toggle for enabling or disabling location analytics for your network
	LocationAnalyticsEnabled *bool `pulumi:"locationAnalyticsEnabled"`
	// Toggle for enabling or disabling meshing in a network
	MeshingEnabled *bool `pulumi:"meshingEnabled"`
	// Named VLAN settings for wireless networks.
	NamedVlans *WirelessSettingsNamedVlans `pulumi:"namedVlans"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// Regulatory domain information for this network.
	RegulatoryDomain *WirelessSettingsRegulatoryDomain `pulumi:"regulatoryDomain"`
	// The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
	Upgradestrategy *string `pulumi:"upgradestrategy"`
}

type WirelessSettingsState struct {
	// Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
	Ipv6BridgeEnabled pulumi.BoolPtrInput
	// Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
	LedLightsOn pulumi.BoolPtrInput
	// Toggle for enabling or disabling location analytics for your network
	LocationAnalyticsEnabled pulumi.BoolPtrInput
	// Toggle for enabling or disabling meshing in a network
	MeshingEnabled pulumi.BoolPtrInput
	// Named VLAN settings for wireless networks.
	NamedVlans WirelessSettingsNamedVlansPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// Regulatory domain information for this network.
	RegulatoryDomain WirelessSettingsRegulatoryDomainPtrInput
	// The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
	Upgradestrategy pulumi.StringPtrInput
}

func (WirelessSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*wirelessSettingsState)(nil)).Elem()
}

type wirelessSettingsArgs struct {
	// Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
	Ipv6BridgeEnabled *bool `pulumi:"ipv6BridgeEnabled"`
	// Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
	LedLightsOn *bool `pulumi:"ledLightsOn"`
	// Toggle for enabling or disabling location analytics for your network
	LocationAnalyticsEnabled *bool `pulumi:"locationAnalyticsEnabled"`
	// Toggle for enabling or disabling meshing in a network
	MeshingEnabled *bool `pulumi:"meshingEnabled"`
	// Named VLAN settings for wireless networks.
	NamedVlans *WirelessSettingsNamedVlans `pulumi:"namedVlans"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
	Upgradestrategy *string `pulumi:"upgradestrategy"`
}

// The set of arguments for constructing a WirelessSettings resource.
type WirelessSettingsArgs struct {
	// Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
	Ipv6BridgeEnabled pulumi.BoolPtrInput
	// Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
	LedLightsOn pulumi.BoolPtrInput
	// Toggle for enabling or disabling location analytics for your network
	LocationAnalyticsEnabled pulumi.BoolPtrInput
	// Toggle for enabling or disabling meshing in a network
	MeshingEnabled pulumi.BoolPtrInput
	// Named VLAN settings for wireless networks.
	NamedVlans WirelessSettingsNamedVlansPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
	Upgradestrategy pulumi.StringPtrInput
}

func (WirelessSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wirelessSettingsArgs)(nil)).Elem()
}

type WirelessSettingsInput interface {
	pulumi.Input

	ToWirelessSettingsOutput() WirelessSettingsOutput
	ToWirelessSettingsOutputWithContext(ctx context.Context) WirelessSettingsOutput
}

func (*WirelessSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**WirelessSettings)(nil)).Elem()
}

func (i *WirelessSettings) ToWirelessSettingsOutput() WirelessSettingsOutput {
	return i.ToWirelessSettingsOutputWithContext(context.Background())
}

func (i *WirelessSettings) ToWirelessSettingsOutputWithContext(ctx context.Context) WirelessSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessSettingsOutput)
}

// WirelessSettingsArrayInput is an input type that accepts WirelessSettingsArray and WirelessSettingsArrayOutput values.
// You can construct a concrete instance of `WirelessSettingsArrayInput` via:
//
//	WirelessSettingsArray{ WirelessSettingsArgs{...} }
type WirelessSettingsArrayInput interface {
	pulumi.Input

	ToWirelessSettingsArrayOutput() WirelessSettingsArrayOutput
	ToWirelessSettingsArrayOutputWithContext(context.Context) WirelessSettingsArrayOutput
}

type WirelessSettingsArray []WirelessSettingsInput

func (WirelessSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WirelessSettings)(nil)).Elem()
}

func (i WirelessSettingsArray) ToWirelessSettingsArrayOutput() WirelessSettingsArrayOutput {
	return i.ToWirelessSettingsArrayOutputWithContext(context.Background())
}

func (i WirelessSettingsArray) ToWirelessSettingsArrayOutputWithContext(ctx context.Context) WirelessSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessSettingsArrayOutput)
}

// WirelessSettingsMapInput is an input type that accepts WirelessSettingsMap and WirelessSettingsMapOutput values.
// You can construct a concrete instance of `WirelessSettingsMapInput` via:
//
//	WirelessSettingsMap{ "key": WirelessSettingsArgs{...} }
type WirelessSettingsMapInput interface {
	pulumi.Input

	ToWirelessSettingsMapOutput() WirelessSettingsMapOutput
	ToWirelessSettingsMapOutputWithContext(context.Context) WirelessSettingsMapOutput
}

type WirelessSettingsMap map[string]WirelessSettingsInput

func (WirelessSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WirelessSettings)(nil)).Elem()
}

func (i WirelessSettingsMap) ToWirelessSettingsMapOutput() WirelessSettingsMapOutput {
	return i.ToWirelessSettingsMapOutputWithContext(context.Background())
}

func (i WirelessSettingsMap) ToWirelessSettingsMapOutputWithContext(ctx context.Context) WirelessSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessSettingsMapOutput)
}

type WirelessSettingsOutput struct{ *pulumi.OutputState }

func (WirelessSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WirelessSettings)(nil)).Elem()
}

func (o WirelessSettingsOutput) ToWirelessSettingsOutput() WirelessSettingsOutput {
	return o
}

func (o WirelessSettingsOutput) ToWirelessSettingsOutputWithContext(ctx context.Context) WirelessSettingsOutput {
	return o
}

// Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
func (o WirelessSettingsOutput) Ipv6BridgeEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *WirelessSettings) pulumi.BoolOutput { return v.Ipv6BridgeEnabled }).(pulumi.BoolOutput)
}

// Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
func (o WirelessSettingsOutput) LedLightsOn() pulumi.BoolOutput {
	return o.ApplyT(func(v *WirelessSettings) pulumi.BoolOutput { return v.LedLightsOn }).(pulumi.BoolOutput)
}

// Toggle for enabling or disabling location analytics for your network
func (o WirelessSettingsOutput) LocationAnalyticsEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *WirelessSettings) pulumi.BoolOutput { return v.LocationAnalyticsEnabled }).(pulumi.BoolOutput)
}

// Toggle for enabling or disabling meshing in a network
func (o WirelessSettingsOutput) MeshingEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *WirelessSettings) pulumi.BoolOutput { return v.MeshingEnabled }).(pulumi.BoolOutput)
}

// Named VLAN settings for wireless networks.
func (o WirelessSettingsOutput) NamedVlans() WirelessSettingsNamedVlansOutput {
	return o.ApplyT(func(v *WirelessSettings) WirelessSettingsNamedVlansOutput { return v.NamedVlans }).(WirelessSettingsNamedVlansOutput)
}

// networkId path parameter. Network ID
func (o WirelessSettingsOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *WirelessSettings) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// Regulatory domain information for this network.
func (o WirelessSettingsOutput) RegulatoryDomain() WirelessSettingsRegulatoryDomainOutput {
	return o.ApplyT(func(v *WirelessSettings) WirelessSettingsRegulatoryDomainOutput { return v.RegulatoryDomain }).(WirelessSettingsRegulatoryDomainOutput)
}

// The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
func (o WirelessSettingsOutput) Upgradestrategy() pulumi.StringOutput {
	return o.ApplyT(func(v *WirelessSettings) pulumi.StringOutput { return v.Upgradestrategy }).(pulumi.StringOutput)
}

type WirelessSettingsArrayOutput struct{ *pulumi.OutputState }

func (WirelessSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WirelessSettings)(nil)).Elem()
}

func (o WirelessSettingsArrayOutput) ToWirelessSettingsArrayOutput() WirelessSettingsArrayOutput {
	return o
}

func (o WirelessSettingsArrayOutput) ToWirelessSettingsArrayOutputWithContext(ctx context.Context) WirelessSettingsArrayOutput {
	return o
}

func (o WirelessSettingsArrayOutput) Index(i pulumi.IntInput) WirelessSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WirelessSettings {
		return vs[0].([]*WirelessSettings)[vs[1].(int)]
	}).(WirelessSettingsOutput)
}

type WirelessSettingsMapOutput struct{ *pulumi.OutputState }

func (WirelessSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WirelessSettings)(nil)).Elem()
}

func (o WirelessSettingsMapOutput) ToWirelessSettingsMapOutput() WirelessSettingsMapOutput {
	return o
}

func (o WirelessSettingsMapOutput) ToWirelessSettingsMapOutputWithContext(ctx context.Context) WirelessSettingsMapOutput {
	return o
}

func (o WirelessSettingsMapOutput) MapIndex(k pulumi.StringInput) WirelessSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WirelessSettings {
		return vs[0].(map[string]*WirelessSettings)[vs[1].(string)]
	}).(WirelessSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessSettingsInput)(nil)).Elem(), &WirelessSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessSettingsArrayInput)(nil)).Elem(), WirelessSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessSettingsMapInput)(nil)).Elem(), WirelessSettingsMap{})
	pulumi.RegisterOutputType(WirelessSettingsOutput{})
	pulumi.RegisterOutputType(WirelessSettingsArrayOutput{})
	pulumi.RegisterOutputType(WirelessSettingsMapOutput{})
}
