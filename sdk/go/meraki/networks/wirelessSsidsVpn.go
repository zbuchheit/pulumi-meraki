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
// $ pulumi import meraki:networks/wirelessSsidsVpn:WirelessSsidsVpn example "network_id,number"
// ```
type WirelessSsidsVpn struct {
	pulumi.CustomResourceState

	// The VPN concentrator settings for this SSID.
	Concentrator WirelessSsidsVpnConcentratorOutput `pulumi:"concentrator"`
	// Secondary VPN concentrator settings. This is only used when two VPN concentrators are configured on the SSID.
	Failover WirelessSsidsVpnFailoverOutput `pulumi:"failover"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// number path parameter.
	Number pulumi.StringOutput `pulumi:"number"`
	// The VPN split tunnel settings for this SSID.
	SplitTunnel WirelessSsidsVpnSplitTunnelOutput `pulumi:"splitTunnel"`
}

// NewWirelessSsidsVpn registers a new resource with the given unique name, arguments, and options.
func NewWirelessSsidsVpn(ctx *pulumi.Context,
	name string, args *WirelessSsidsVpnArgs, opts ...pulumi.ResourceOption) (*WirelessSsidsVpn, error) {
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
	var resource WirelessSsidsVpn
	err := ctx.RegisterResource("meraki:networks/wirelessSsidsVpn:WirelessSsidsVpn", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWirelessSsidsVpn gets an existing WirelessSsidsVpn resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWirelessSsidsVpn(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WirelessSsidsVpnState, opts ...pulumi.ResourceOption) (*WirelessSsidsVpn, error) {
	var resource WirelessSsidsVpn
	err := ctx.ReadResource("meraki:networks/wirelessSsidsVpn:WirelessSsidsVpn", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WirelessSsidsVpn resources.
type wirelessSsidsVpnState struct {
	// The VPN concentrator settings for this SSID.
	Concentrator *WirelessSsidsVpnConcentrator `pulumi:"concentrator"`
	// Secondary VPN concentrator settings. This is only used when two VPN concentrators are configured on the SSID.
	Failover *WirelessSsidsVpnFailover `pulumi:"failover"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// number path parameter.
	Number *string `pulumi:"number"`
	// The VPN split tunnel settings for this SSID.
	SplitTunnel *WirelessSsidsVpnSplitTunnel `pulumi:"splitTunnel"`
}

type WirelessSsidsVpnState struct {
	// The VPN concentrator settings for this SSID.
	Concentrator WirelessSsidsVpnConcentratorPtrInput
	// Secondary VPN concentrator settings. This is only used when two VPN concentrators are configured on the SSID.
	Failover WirelessSsidsVpnFailoverPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// number path parameter.
	Number pulumi.StringPtrInput
	// The VPN split tunnel settings for this SSID.
	SplitTunnel WirelessSsidsVpnSplitTunnelPtrInput
}

func (WirelessSsidsVpnState) ElementType() reflect.Type {
	return reflect.TypeOf((*wirelessSsidsVpnState)(nil)).Elem()
}

type wirelessSsidsVpnArgs struct {
	// The VPN concentrator settings for this SSID.
	Concentrator *WirelessSsidsVpnConcentrator `pulumi:"concentrator"`
	// Secondary VPN concentrator settings. This is only used when two VPN concentrators are configured on the SSID.
	Failover *WirelessSsidsVpnFailover `pulumi:"failover"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
	// The VPN split tunnel settings for this SSID.
	SplitTunnel *WirelessSsidsVpnSplitTunnel `pulumi:"splitTunnel"`
}

// The set of arguments for constructing a WirelessSsidsVpn resource.
type WirelessSsidsVpnArgs struct {
	// The VPN concentrator settings for this SSID.
	Concentrator WirelessSsidsVpnConcentratorPtrInput
	// Secondary VPN concentrator settings. This is only used when two VPN concentrators are configured on the SSID.
	Failover WirelessSsidsVpnFailoverPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// number path parameter.
	Number pulumi.StringInput
	// The VPN split tunnel settings for this SSID.
	SplitTunnel WirelessSsidsVpnSplitTunnelPtrInput
}

func (WirelessSsidsVpnArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wirelessSsidsVpnArgs)(nil)).Elem()
}

type WirelessSsidsVpnInput interface {
	pulumi.Input

	ToWirelessSsidsVpnOutput() WirelessSsidsVpnOutput
	ToWirelessSsidsVpnOutputWithContext(ctx context.Context) WirelessSsidsVpnOutput
}

func (*WirelessSsidsVpn) ElementType() reflect.Type {
	return reflect.TypeOf((**WirelessSsidsVpn)(nil)).Elem()
}

func (i *WirelessSsidsVpn) ToWirelessSsidsVpnOutput() WirelessSsidsVpnOutput {
	return i.ToWirelessSsidsVpnOutputWithContext(context.Background())
}

func (i *WirelessSsidsVpn) ToWirelessSsidsVpnOutputWithContext(ctx context.Context) WirelessSsidsVpnOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessSsidsVpnOutput)
}

// WirelessSsidsVpnArrayInput is an input type that accepts WirelessSsidsVpnArray and WirelessSsidsVpnArrayOutput values.
// You can construct a concrete instance of `WirelessSsidsVpnArrayInput` via:
//
//	WirelessSsidsVpnArray{ WirelessSsidsVpnArgs{...} }
type WirelessSsidsVpnArrayInput interface {
	pulumi.Input

	ToWirelessSsidsVpnArrayOutput() WirelessSsidsVpnArrayOutput
	ToWirelessSsidsVpnArrayOutputWithContext(context.Context) WirelessSsidsVpnArrayOutput
}

type WirelessSsidsVpnArray []WirelessSsidsVpnInput

func (WirelessSsidsVpnArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WirelessSsidsVpn)(nil)).Elem()
}

func (i WirelessSsidsVpnArray) ToWirelessSsidsVpnArrayOutput() WirelessSsidsVpnArrayOutput {
	return i.ToWirelessSsidsVpnArrayOutputWithContext(context.Background())
}

func (i WirelessSsidsVpnArray) ToWirelessSsidsVpnArrayOutputWithContext(ctx context.Context) WirelessSsidsVpnArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessSsidsVpnArrayOutput)
}

// WirelessSsidsVpnMapInput is an input type that accepts WirelessSsidsVpnMap and WirelessSsidsVpnMapOutput values.
// You can construct a concrete instance of `WirelessSsidsVpnMapInput` via:
//
//	WirelessSsidsVpnMap{ "key": WirelessSsidsVpnArgs{...} }
type WirelessSsidsVpnMapInput interface {
	pulumi.Input

	ToWirelessSsidsVpnMapOutput() WirelessSsidsVpnMapOutput
	ToWirelessSsidsVpnMapOutputWithContext(context.Context) WirelessSsidsVpnMapOutput
}

type WirelessSsidsVpnMap map[string]WirelessSsidsVpnInput

func (WirelessSsidsVpnMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WirelessSsidsVpn)(nil)).Elem()
}

func (i WirelessSsidsVpnMap) ToWirelessSsidsVpnMapOutput() WirelessSsidsVpnMapOutput {
	return i.ToWirelessSsidsVpnMapOutputWithContext(context.Background())
}

func (i WirelessSsidsVpnMap) ToWirelessSsidsVpnMapOutputWithContext(ctx context.Context) WirelessSsidsVpnMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WirelessSsidsVpnMapOutput)
}

type WirelessSsidsVpnOutput struct{ *pulumi.OutputState }

func (WirelessSsidsVpnOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WirelessSsidsVpn)(nil)).Elem()
}

func (o WirelessSsidsVpnOutput) ToWirelessSsidsVpnOutput() WirelessSsidsVpnOutput {
	return o
}

func (o WirelessSsidsVpnOutput) ToWirelessSsidsVpnOutputWithContext(ctx context.Context) WirelessSsidsVpnOutput {
	return o
}

// The VPN concentrator settings for this SSID.
func (o WirelessSsidsVpnOutput) Concentrator() WirelessSsidsVpnConcentratorOutput {
	return o.ApplyT(func(v *WirelessSsidsVpn) WirelessSsidsVpnConcentratorOutput { return v.Concentrator }).(WirelessSsidsVpnConcentratorOutput)
}

// Secondary VPN concentrator settings. This is only used when two VPN concentrators are configured on the SSID.
func (o WirelessSsidsVpnOutput) Failover() WirelessSsidsVpnFailoverOutput {
	return o.ApplyT(func(v *WirelessSsidsVpn) WirelessSsidsVpnFailoverOutput { return v.Failover }).(WirelessSsidsVpnFailoverOutput)
}

// networkId path parameter. Network ID
func (o WirelessSsidsVpnOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *WirelessSsidsVpn) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// number path parameter.
func (o WirelessSsidsVpnOutput) Number() pulumi.StringOutput {
	return o.ApplyT(func(v *WirelessSsidsVpn) pulumi.StringOutput { return v.Number }).(pulumi.StringOutput)
}

// The VPN split tunnel settings for this SSID.
func (o WirelessSsidsVpnOutput) SplitTunnel() WirelessSsidsVpnSplitTunnelOutput {
	return o.ApplyT(func(v *WirelessSsidsVpn) WirelessSsidsVpnSplitTunnelOutput { return v.SplitTunnel }).(WirelessSsidsVpnSplitTunnelOutput)
}

type WirelessSsidsVpnArrayOutput struct{ *pulumi.OutputState }

func (WirelessSsidsVpnArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WirelessSsidsVpn)(nil)).Elem()
}

func (o WirelessSsidsVpnArrayOutput) ToWirelessSsidsVpnArrayOutput() WirelessSsidsVpnArrayOutput {
	return o
}

func (o WirelessSsidsVpnArrayOutput) ToWirelessSsidsVpnArrayOutputWithContext(ctx context.Context) WirelessSsidsVpnArrayOutput {
	return o
}

func (o WirelessSsidsVpnArrayOutput) Index(i pulumi.IntInput) WirelessSsidsVpnOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WirelessSsidsVpn {
		return vs[0].([]*WirelessSsidsVpn)[vs[1].(int)]
	}).(WirelessSsidsVpnOutput)
}

type WirelessSsidsVpnMapOutput struct{ *pulumi.OutputState }

func (WirelessSsidsVpnMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WirelessSsidsVpn)(nil)).Elem()
}

func (o WirelessSsidsVpnMapOutput) ToWirelessSsidsVpnMapOutput() WirelessSsidsVpnMapOutput {
	return o
}

func (o WirelessSsidsVpnMapOutput) ToWirelessSsidsVpnMapOutputWithContext(ctx context.Context) WirelessSsidsVpnMapOutput {
	return o
}

func (o WirelessSsidsVpnMapOutput) MapIndex(k pulumi.StringInput) WirelessSsidsVpnOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WirelessSsidsVpn {
		return vs[0].(map[string]*WirelessSsidsVpn)[vs[1].(string)]
	}).(WirelessSsidsVpnOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessSsidsVpnInput)(nil)).Elem(), &WirelessSsidsVpn{})
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessSsidsVpnArrayInput)(nil)).Elem(), WirelessSsidsVpnArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WirelessSsidsVpnMapInput)(nil)).Elem(), WirelessSsidsVpnMap{})
	pulumi.RegisterOutputType(WirelessSsidsVpnOutput{})
	pulumi.RegisterOutputType(WirelessSsidsVpnArrayOutput{})
	pulumi.RegisterOutputType(WirelessSsidsVpnMapOutput{})
}