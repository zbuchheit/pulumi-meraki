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
// $ pulumi import meraki:networks/applianceSingleLan:ApplianceSingleLan example "network_id"
// ```
type ApplianceSingleLan struct {
	pulumi.CustomResourceState

	// The local IP of the appliance on the single LAN
	ApplianceIp pulumi.StringOutput `pulumi:"applianceIp"`
	// IPv6 configuration on the single LAN
	Ipv6 ApplianceSingleLanIpv6Output `pulumi:"ipv6"`
	// Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
	MandatoryDhcp ApplianceSingleLanMandatoryDhcpOutput `pulumi:"mandatoryDhcp"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// The subnet of the single LAN
	Subnet pulumi.StringOutput `pulumi:"subnet"`
}

// NewApplianceSingleLan registers a new resource with the given unique name, arguments, and options.
func NewApplianceSingleLan(ctx *pulumi.Context,
	name string, args *ApplianceSingleLanArgs, opts ...pulumi.ResourceOption) (*ApplianceSingleLan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplianceSingleLan
	err := ctx.RegisterResource("meraki:networks/applianceSingleLan:ApplianceSingleLan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplianceSingleLan gets an existing ApplianceSingleLan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplianceSingleLan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplianceSingleLanState, opts ...pulumi.ResourceOption) (*ApplianceSingleLan, error) {
	var resource ApplianceSingleLan
	err := ctx.ReadResource("meraki:networks/applianceSingleLan:ApplianceSingleLan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplianceSingleLan resources.
type applianceSingleLanState struct {
	// The local IP of the appliance on the single LAN
	ApplianceIp *string `pulumi:"applianceIp"`
	// IPv6 configuration on the single LAN
	Ipv6 *ApplianceSingleLanIpv6 `pulumi:"ipv6"`
	// Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
	MandatoryDhcp *ApplianceSingleLanMandatoryDhcp `pulumi:"mandatoryDhcp"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// The subnet of the single LAN
	Subnet *string `pulumi:"subnet"`
}

type ApplianceSingleLanState struct {
	// The local IP of the appliance on the single LAN
	ApplianceIp pulumi.StringPtrInput
	// IPv6 configuration on the single LAN
	Ipv6 ApplianceSingleLanIpv6PtrInput
	// Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
	MandatoryDhcp ApplianceSingleLanMandatoryDhcpPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// The subnet of the single LAN
	Subnet pulumi.StringPtrInput
}

func (ApplianceSingleLanState) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceSingleLanState)(nil)).Elem()
}

type applianceSingleLanArgs struct {
	// The local IP of the appliance on the single LAN
	ApplianceIp *string `pulumi:"applianceIp"`
	// IPv6 configuration on the single LAN
	Ipv6 *ApplianceSingleLanIpv6 `pulumi:"ipv6"`
	// Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
	MandatoryDhcp *ApplianceSingleLanMandatoryDhcp `pulumi:"mandatoryDhcp"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// The subnet of the single LAN
	Subnet *string `pulumi:"subnet"`
}

// The set of arguments for constructing a ApplianceSingleLan resource.
type ApplianceSingleLanArgs struct {
	// The local IP of the appliance on the single LAN
	ApplianceIp pulumi.StringPtrInput
	// IPv6 configuration on the single LAN
	Ipv6 ApplianceSingleLanIpv6PtrInput
	// Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
	MandatoryDhcp ApplianceSingleLanMandatoryDhcpPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// The subnet of the single LAN
	Subnet pulumi.StringPtrInput
}

func (ApplianceSingleLanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceSingleLanArgs)(nil)).Elem()
}

type ApplianceSingleLanInput interface {
	pulumi.Input

	ToApplianceSingleLanOutput() ApplianceSingleLanOutput
	ToApplianceSingleLanOutputWithContext(ctx context.Context) ApplianceSingleLanOutput
}

func (*ApplianceSingleLan) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceSingleLan)(nil)).Elem()
}

func (i *ApplianceSingleLan) ToApplianceSingleLanOutput() ApplianceSingleLanOutput {
	return i.ToApplianceSingleLanOutputWithContext(context.Background())
}

func (i *ApplianceSingleLan) ToApplianceSingleLanOutputWithContext(ctx context.Context) ApplianceSingleLanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceSingleLanOutput)
}

// ApplianceSingleLanArrayInput is an input type that accepts ApplianceSingleLanArray and ApplianceSingleLanArrayOutput values.
// You can construct a concrete instance of `ApplianceSingleLanArrayInput` via:
//
//	ApplianceSingleLanArray{ ApplianceSingleLanArgs{...} }
type ApplianceSingleLanArrayInput interface {
	pulumi.Input

	ToApplianceSingleLanArrayOutput() ApplianceSingleLanArrayOutput
	ToApplianceSingleLanArrayOutputWithContext(context.Context) ApplianceSingleLanArrayOutput
}

type ApplianceSingleLanArray []ApplianceSingleLanInput

func (ApplianceSingleLanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceSingleLan)(nil)).Elem()
}

func (i ApplianceSingleLanArray) ToApplianceSingleLanArrayOutput() ApplianceSingleLanArrayOutput {
	return i.ToApplianceSingleLanArrayOutputWithContext(context.Background())
}

func (i ApplianceSingleLanArray) ToApplianceSingleLanArrayOutputWithContext(ctx context.Context) ApplianceSingleLanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceSingleLanArrayOutput)
}

// ApplianceSingleLanMapInput is an input type that accepts ApplianceSingleLanMap and ApplianceSingleLanMapOutput values.
// You can construct a concrete instance of `ApplianceSingleLanMapInput` via:
//
//	ApplianceSingleLanMap{ "key": ApplianceSingleLanArgs{...} }
type ApplianceSingleLanMapInput interface {
	pulumi.Input

	ToApplianceSingleLanMapOutput() ApplianceSingleLanMapOutput
	ToApplianceSingleLanMapOutputWithContext(context.Context) ApplianceSingleLanMapOutput
}

type ApplianceSingleLanMap map[string]ApplianceSingleLanInput

func (ApplianceSingleLanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceSingleLan)(nil)).Elem()
}

func (i ApplianceSingleLanMap) ToApplianceSingleLanMapOutput() ApplianceSingleLanMapOutput {
	return i.ToApplianceSingleLanMapOutputWithContext(context.Background())
}

func (i ApplianceSingleLanMap) ToApplianceSingleLanMapOutputWithContext(ctx context.Context) ApplianceSingleLanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceSingleLanMapOutput)
}

type ApplianceSingleLanOutput struct{ *pulumi.OutputState }

func (ApplianceSingleLanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceSingleLan)(nil)).Elem()
}

func (o ApplianceSingleLanOutput) ToApplianceSingleLanOutput() ApplianceSingleLanOutput {
	return o
}

func (o ApplianceSingleLanOutput) ToApplianceSingleLanOutputWithContext(ctx context.Context) ApplianceSingleLanOutput {
	return o
}

// The local IP of the appliance on the single LAN
func (o ApplianceSingleLanOutput) ApplianceIp() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceSingleLan) pulumi.StringOutput { return v.ApplianceIp }).(pulumi.StringOutput)
}

// IPv6 configuration on the single LAN
func (o ApplianceSingleLanOutput) Ipv6() ApplianceSingleLanIpv6Output {
	return o.ApplyT(func(v *ApplianceSingleLan) ApplianceSingleLanIpv6Output { return v.Ipv6 }).(ApplianceSingleLanIpv6Output)
}

// Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
func (o ApplianceSingleLanOutput) MandatoryDhcp() ApplianceSingleLanMandatoryDhcpOutput {
	return o.ApplyT(func(v *ApplianceSingleLan) ApplianceSingleLanMandatoryDhcpOutput { return v.MandatoryDhcp }).(ApplianceSingleLanMandatoryDhcpOutput)
}

// networkId path parameter. Network ID
func (o ApplianceSingleLanOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceSingleLan) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// The subnet of the single LAN
func (o ApplianceSingleLanOutput) Subnet() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceSingleLan) pulumi.StringOutput { return v.Subnet }).(pulumi.StringOutput)
}

type ApplianceSingleLanArrayOutput struct{ *pulumi.OutputState }

func (ApplianceSingleLanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceSingleLan)(nil)).Elem()
}

func (o ApplianceSingleLanArrayOutput) ToApplianceSingleLanArrayOutput() ApplianceSingleLanArrayOutput {
	return o
}

func (o ApplianceSingleLanArrayOutput) ToApplianceSingleLanArrayOutputWithContext(ctx context.Context) ApplianceSingleLanArrayOutput {
	return o
}

func (o ApplianceSingleLanArrayOutput) Index(i pulumi.IntInput) ApplianceSingleLanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplianceSingleLan {
		return vs[0].([]*ApplianceSingleLan)[vs[1].(int)]
	}).(ApplianceSingleLanOutput)
}

type ApplianceSingleLanMapOutput struct{ *pulumi.OutputState }

func (ApplianceSingleLanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceSingleLan)(nil)).Elem()
}

func (o ApplianceSingleLanMapOutput) ToApplianceSingleLanMapOutput() ApplianceSingleLanMapOutput {
	return o
}

func (o ApplianceSingleLanMapOutput) ToApplianceSingleLanMapOutputWithContext(ctx context.Context) ApplianceSingleLanMapOutput {
	return o
}

func (o ApplianceSingleLanMapOutput) MapIndex(k pulumi.StringInput) ApplianceSingleLanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplianceSingleLan {
		return vs[0].(map[string]*ApplianceSingleLan)[vs[1].(string)]
	}).(ApplianceSingleLanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceSingleLanInput)(nil)).Elem(), &ApplianceSingleLan{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceSingleLanArrayInput)(nil)).Elem(), ApplianceSingleLanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceSingleLanMapInput)(nil)).Elem(), ApplianceSingleLanMap{})
	pulumi.RegisterOutputType(ApplianceSingleLanOutput{})
	pulumi.RegisterOutputType(ApplianceSingleLanArrayOutput{})
	pulumi.RegisterOutputType(ApplianceSingleLanMapOutput{})
}
