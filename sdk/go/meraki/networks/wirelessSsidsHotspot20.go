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
// $ pulumi import meraki:networks/wirelessSsidsHotspot20:WirelessSsidsHotspot20 example "network_id,number"
// ```
type WirelessSsidsHotspot20 struct {
	pulumi.CustomResourceState

	// An array of domain names
	Domains pulumi.StringArrayOutput `pulumi:"domains"`
	// Whether or not Hotspot 2.0 for this SSID is enabled
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// An array of MCC/MNC pairs
	MccMncs WirelessSsidsHotspot20MccMncArrayOutput `pulumi:"mccMncs"`
	// An array of NAI realms
	NaiRealms WirelessSsidsHotspot20NaiRealmArrayOutput `pulumi:"naiRealms"`
	// The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
	NetworkAccessType pulumi.StringOutput `pulumi:"networkAccessType"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// number path parameter.
	Number pulumi.StringOutput `pulumi:"number"`
	// Operator settings for this SSID
	Operator WirelessSsidsHotspot20OperatorOutput `pulumi:"operator"`
	// An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
	RoamConsortOis pulumi.StringArrayOutput `pulumi:"roamConsortOis"`
	// Venue settings for this SSID
	Venue WirelessSsidsHotspot20VenueOutput `pulumi:"venue"`
}

// NewWirelessSsidsHotspot20 registers a new resource with the given unique name, arguments, and options.
func NewWirelessSsidsHotspot20(ctx *pulumi.Context,
	name string, args *WirelessSsidsHotspot20Args, opts ...pulumi.ResourceOption) (*WirelessSsidsHotspot20, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	if args.Number == nil {
		return nil, errors.New("invalid value for required argument 'Number'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WirelessSsidsHotspot20
	err := ctx.RegisterResource("meraki:networks/wirelessSsidsHotspot20:WirelessSsidsHotspot20", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWirelessSsidsHotspot20 gets an existing WirelessSsidsHotspot20 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWirelessSsidsHotspot20(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WirelessSsidsHotspot20State, opts ...pulumi.ResourceOption) (*WirelessSsidsHotspot20, error) {
	var resource WirelessSsidsHotspot20
	err := ctx.ReadResource("meraki:networks/wirelessSsidsHotspot20:WirelessSsidsHotspot20", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WirelessSsidsHotspot20 resources.
type wirelessSsidsHotspot20State struct {
	// An array of domain names
	Domains []string `pulumi:"domains"`
	// Whether or not Hotspot 2.0 for this SSID is enabled
	Enabled *bool `pulumi:"enabled"`
	// An array of MCC/MNC pairs
	MccMncs []WirelessSsidsHotspot20MccMnc `pulumi:"mccMncs"`
	// An array of NAI realms
	NaiRealms []WirelessSsidsHotspot20NaiRealm `pulumi:"naiRealms"`
	// The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
	NetworkAccessType *string `pulumi:"networkAccessType"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// number path parameter.
	Number *string `pulumi:"number"`
	// Operator settings for this SSID
	Operator *WirelessSsidsHotspot20Operator `pulumi:"operator"`
	// An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
	RoamConsortOis []string `pulumi:"roamConsortOis"`
	// Venue settings for this SSID
	Venue *WirelessSsidsHotspot20Venue `pulumi:"venue"`
}

type WirelessSsidsHotspot20State struct {
	// An array of domain names
	Domains pulumi.StringArrayInput
	// Whether or not Hotspot 2.0 for this SSID is enabled
	Enabled pulumi.BoolPtrInput
	// An array of MCC/MNC pairs
	MccMncs WirelessSsidsHotspot20MccMncArrayInput
	// An array of NAI realms
	NaiRealms WirelessSsidsHotspot20NaiRealmArrayInput
	// The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
	NetworkAccessType pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// number path parameter.
	Number pulumi.StringPtrInput
	// Operator settings for this SSID
	Operator WirelessSsidsHotspot20OperatorPtrInput
	// An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
	RoamConsortOis pulumi.StringArrayInput
	// Venue settings for this SSID
	Venue WirelessSsidsHotspot20VenuePtrInput
}

func (WirelessSsidsHotspot20State) ElementType() reflect.Type {
	return reflect.TypeOf((*wirelessSsidsHotspot20State)(nil)).Elem()
}

type wirelessSsidsHotspot20Args struct {
	// An array of domain names
	Domains []string `pulumi:"domains"`
	// Whether or not Hotspot 2.0 for this SSID is enabled
	Enabled *bool `pulumi:"enabled"`
	// An array of MCC/MNC pairs
	MccMncs []WirelessSsidsHotspot20MccMnc `pulumi:"mccMncs"`
	// An array of NAI realms
	NaiRealms []WirelessSsidsHotspot20NaiRealm `pulumi:"naiRealms"`
	// The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
	NetworkAccessType *string `pulumi:"networkAccessType"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
	// Operator settings for this SSID
	Operator *WirelessSsidsHotspot20Operator `pulumi:"operator"`
	// An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
	RoamConsortOis []string `pulumi:"roamConsortOis"`
	// Venue settings for this SSID
	Venue *WirelessSsidsHotspot20Venue `pulumi:"venue"`
}

// The set of arguments for constructing a WirelessSsidsHotspot20 resource.
type WirelessSsidsHotspot20Args struct {
	// An array of domain names
	Domains pulumi.StringArrayInput
	// Whether or not Hotspot 2.0 for this SSID is enabled
	Enabled pulumi.BoolPtrInput
	// An array of MCC/MNC pairs
	MccMncs WirelessSsidsHotspot20MccMncArrayInput
	// An array of NAI realms
	NaiRealms WirelessSsidsHotspot20NaiRealmArrayInput
	// The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
	NetworkAccessType pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// number path parameter.
	Number pulumi.StringInput
	// Operator settings for this SSID
	Operator WirelessSsidsHotspot20OperatorPtrInput
	// An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
	RoamConsortOis pulumi.StringArrayInput
	// Venue settings for this SSID
	Venue WirelessSsidsHotspot20VenuePtrInput
}

func (WirelessSsidsHotspot20Args) ElementType() reflect.Type {
	return reflect.TypeOf((*wirelessSsidsHotspot20Args)(nil)).Elem()
}

type WirelessSsidsHotspot20Input interface {
	pulumi.Input

	ToWirelessSsidsHotspot20Output() WirelessSsidsHotspot20Output
	ToWirelessSsidsHotspot20OutputWithContext(ctx context.Context) WirelessSsidsHotspot20Output
}

func (*WirelessSsidsHotspot20) ElementType() reflect.Type {
	return reflect.TypeOf((**WirelessSsidsHotspot20)(nil)).Elem()
}

func (i *WirelessSsidsHotspot20) ToWirelessSsidsHotspot20Output() WirelessSsidsHotspot20Output {
	return i.ToWirelessSsidsHotspot20OutputWithContext(context.Background())
}

func (i *WirelessSsidsHotspot20) ToWirelessSsidsHotspot20OutputWithContext(ctx context.Context) WirelessSsidsHotspot20Output {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessSsidsHotspot20Output)
}

// WirelessSsidsHotspot20ArrayInput is an input type that accepts WirelessSsidsHotspot20Array and WirelessSsidsHotspot20ArrayOutput values.
// You can construct a concrete instance of `WirelessSsidsHotspot20ArrayInput` via:
//
//	WirelessSsidsHotspot20Array{ WirelessSsidsHotspot20Args{...} }
type WirelessSsidsHotspot20ArrayInput interface {
	pulumi.Input

	ToWirelessSsidsHotspot20ArrayOutput() WirelessSsidsHotspot20ArrayOutput
	ToWirelessSsidsHotspot20ArrayOutputWithContext(context.Context) WirelessSsidsHotspot20ArrayOutput
}

type WirelessSsidsHotspot20Array []WirelessSsidsHotspot20Input

func (WirelessSsidsHotspot20Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WirelessSsidsHotspot20)(nil)).Elem()
}

func (i WirelessSsidsHotspot20Array) ToWirelessSsidsHotspot20ArrayOutput() WirelessSsidsHotspot20ArrayOutput {
	return i.ToWirelessSsidsHotspot20ArrayOutputWithContext(context.Background())
}

func (i WirelessSsidsHotspot20Array) ToWirelessSsidsHotspot20ArrayOutputWithContext(ctx context.Context) WirelessSsidsHotspot20ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessSsidsHotspot20ArrayOutput)
}

// WirelessSsidsHotspot20MapInput is an input type that accepts WirelessSsidsHotspot20Map and WirelessSsidsHotspot20MapOutput values.
// You can construct a concrete instance of `WirelessSsidsHotspot20MapInput` via:
//
//	WirelessSsidsHotspot20Map{ "key": WirelessSsidsHotspot20Args{...} }
type WirelessSsidsHotspot20MapInput interface {
	pulumi.Input

	ToWirelessSsidsHotspot20MapOutput() WirelessSsidsHotspot20MapOutput
	ToWirelessSsidsHotspot20MapOutputWithContext(context.Context) WirelessSsidsHotspot20MapOutput
}

type WirelessSsidsHotspot20Map map[string]WirelessSsidsHotspot20Input

func (WirelessSsidsHotspot20Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WirelessSsidsHotspot20)(nil)).Elem()
}

func (i WirelessSsidsHotspot20Map) ToWirelessSsidsHotspot20MapOutput() WirelessSsidsHotspot20MapOutput {
	return i.ToWirelessSsidsHotspot20MapOutputWithContext(context.Background())
}

func (i WirelessSsidsHotspot20Map) ToWirelessSsidsHotspot20MapOutputWithContext(ctx context.Context) WirelessSsidsHotspot20MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessSsidsHotspot20MapOutput)
}

type WirelessSsidsHotspot20Output struct{ *pulumi.OutputState }

func (WirelessSsidsHotspot20Output) ElementType() reflect.Type {
	return reflect.TypeOf((**WirelessSsidsHotspot20)(nil)).Elem()
}

func (o WirelessSsidsHotspot20Output) ToWirelessSsidsHotspot20Output() WirelessSsidsHotspot20Output {
	return o
}

func (o WirelessSsidsHotspot20Output) ToWirelessSsidsHotspot20OutputWithContext(ctx context.Context) WirelessSsidsHotspot20Output {
	return o
}

// An array of domain names
func (o WirelessSsidsHotspot20Output) Domains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *WirelessSsidsHotspot20) pulumi.StringArrayOutput { return v.Domains }).(pulumi.StringArrayOutput)
}

// Whether or not Hotspot 2.0 for this SSID is enabled
func (o WirelessSsidsHotspot20Output) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *WirelessSsidsHotspot20) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// An array of MCC/MNC pairs
func (o WirelessSsidsHotspot20Output) MccMncs() WirelessSsidsHotspot20MccMncArrayOutput {
	return o.ApplyT(func(v *WirelessSsidsHotspot20) WirelessSsidsHotspot20MccMncArrayOutput { return v.MccMncs }).(WirelessSsidsHotspot20MccMncArrayOutput)
}

// An array of NAI realms
func (o WirelessSsidsHotspot20Output) NaiRealms() WirelessSsidsHotspot20NaiRealmArrayOutput {
	return o.ApplyT(func(v *WirelessSsidsHotspot20) WirelessSsidsHotspot20NaiRealmArrayOutput { return v.NaiRealms }).(WirelessSsidsHotspot20NaiRealmArrayOutput)
}

// The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
func (o WirelessSsidsHotspot20Output) NetworkAccessType() pulumi.StringOutput {
	return o.ApplyT(func(v *WirelessSsidsHotspot20) pulumi.StringOutput { return v.NetworkAccessType }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o WirelessSsidsHotspot20Output) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *WirelessSsidsHotspot20) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// number path parameter.
func (o WirelessSsidsHotspot20Output) Number() pulumi.StringOutput {
	return o.ApplyT(func(v *WirelessSsidsHotspot20) pulumi.StringOutput { return v.Number }).(pulumi.StringOutput)
}

// Operator settings for this SSID
func (o WirelessSsidsHotspot20Output) Operator() WirelessSsidsHotspot20OperatorOutput {
	return o.ApplyT(func(v *WirelessSsidsHotspot20) WirelessSsidsHotspot20OperatorOutput { return v.Operator }).(WirelessSsidsHotspot20OperatorOutput)
}

// An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
func (o WirelessSsidsHotspot20Output) RoamConsortOis() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *WirelessSsidsHotspot20) pulumi.StringArrayOutput { return v.RoamConsortOis }).(pulumi.StringArrayOutput)
}

// Venue settings for this SSID
func (o WirelessSsidsHotspot20Output) Venue() WirelessSsidsHotspot20VenueOutput {
	return o.ApplyT(func(v *WirelessSsidsHotspot20) WirelessSsidsHotspot20VenueOutput { return v.Venue }).(WirelessSsidsHotspot20VenueOutput)
}

type WirelessSsidsHotspot20ArrayOutput struct{ *pulumi.OutputState }

func (WirelessSsidsHotspot20ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WirelessSsidsHotspot20)(nil)).Elem()
}

func (o WirelessSsidsHotspot20ArrayOutput) ToWirelessSsidsHotspot20ArrayOutput() WirelessSsidsHotspot20ArrayOutput {
	return o
}

func (o WirelessSsidsHotspot20ArrayOutput) ToWirelessSsidsHotspot20ArrayOutputWithContext(ctx context.Context) WirelessSsidsHotspot20ArrayOutput {
	return o
}

func (o WirelessSsidsHotspot20ArrayOutput) Index(i pulumi.IntInput) WirelessSsidsHotspot20Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WirelessSsidsHotspot20 {
		return vs[0].([]*WirelessSsidsHotspot20)[vs[1].(int)]
	}).(WirelessSsidsHotspot20Output)
}

type WirelessSsidsHotspot20MapOutput struct{ *pulumi.OutputState }

func (WirelessSsidsHotspot20MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WirelessSsidsHotspot20)(nil)).Elem()
}

func (o WirelessSsidsHotspot20MapOutput) ToWirelessSsidsHotspot20MapOutput() WirelessSsidsHotspot20MapOutput {
	return o
}

func (o WirelessSsidsHotspot20MapOutput) ToWirelessSsidsHotspot20MapOutputWithContext(ctx context.Context) WirelessSsidsHotspot20MapOutput {
	return o
}

func (o WirelessSsidsHotspot20MapOutput) MapIndex(k pulumi.StringInput) WirelessSsidsHotspot20Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WirelessSsidsHotspot20 {
		return vs[0].(map[string]*WirelessSsidsHotspot20)[vs[1].(string)]
	}).(WirelessSsidsHotspot20Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessSsidsHotspot20Input)(nil)).Elem(), &WirelessSsidsHotspot20{})
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessSsidsHotspot20ArrayInput)(nil)).Elem(), WirelessSsidsHotspot20Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessSsidsHotspot20MapInput)(nil)).Elem(), WirelessSsidsHotspot20Map{})
	pulumi.RegisterOutputType(WirelessSsidsHotspot20Output{})
	pulumi.RegisterOutputType(WirelessSsidsHotspot20ArrayOutput{})
	pulumi.RegisterOutputType(WirelessSsidsHotspot20MapOutput{})
}