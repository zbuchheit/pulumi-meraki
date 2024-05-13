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
//			example, err := networks.NewSwitchRoutingMulticastRendezvousPoints(ctx, "example", &networks.SwitchRoutingMulticastRendezvousPointsArgs{
//				InterfaceIp:    pulumi.String("192.168.1.2"),
//				MulticastGroup: pulumi.String("Any"),
//				NetworkId:      pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSwitchRoutingMulticastRendezvousPointsExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints example "network_id,rendezvous_point_id"
// ```
type SwitchRoutingMulticastRendezvousPoints struct {
	pulumi.CustomResourceState

	// The IP address of the interface where the RP needs to be created.
	InterfaceIp   pulumi.StringOutput `pulumi:"interfaceIp"`
	InterfaceName pulumi.StringOutput `pulumi:"interfaceName"`
	// 'Any', or the IP address of a multicast group
	MulticastGroup pulumi.StringOutput `pulumi:"multicastGroup"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// rendezvousPointId path parameter. Rendezvous point ID
	RendezvousPointId pulumi.StringOutput `pulumi:"rendezvousPointId"`
	Serial            pulumi.StringOutput `pulumi:"serial"`
}

// NewSwitchRoutingMulticastRendezvousPoints registers a new resource with the given unique name, arguments, and options.
func NewSwitchRoutingMulticastRendezvousPoints(ctx *pulumi.Context,
	name string, args *SwitchRoutingMulticastRendezvousPointsArgs, opts ...pulumi.ResourceOption) (*SwitchRoutingMulticastRendezvousPoints, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchRoutingMulticastRendezvousPoints
	err := ctx.RegisterResource("meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchRoutingMulticastRendezvousPoints gets an existing SwitchRoutingMulticastRendezvousPoints resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchRoutingMulticastRendezvousPoints(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchRoutingMulticastRendezvousPointsState, opts ...pulumi.ResourceOption) (*SwitchRoutingMulticastRendezvousPoints, error) {
	var resource SwitchRoutingMulticastRendezvousPoints
	err := ctx.ReadResource("meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchRoutingMulticastRendezvousPoints resources.
type switchRoutingMulticastRendezvousPointsState struct {
	// The IP address of the interface where the RP needs to be created.
	InterfaceIp   *string `pulumi:"interfaceIp"`
	InterfaceName *string `pulumi:"interfaceName"`
	// 'Any', or the IP address of a multicast group
	MulticastGroup *string `pulumi:"multicastGroup"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// rendezvousPointId path parameter. Rendezvous point ID
	RendezvousPointId *string `pulumi:"rendezvousPointId"`
	Serial            *string `pulumi:"serial"`
}

type SwitchRoutingMulticastRendezvousPointsState struct {
	// The IP address of the interface where the RP needs to be created.
	InterfaceIp   pulumi.StringPtrInput
	InterfaceName pulumi.StringPtrInput
	// 'Any', or the IP address of a multicast group
	MulticastGroup pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// rendezvousPointId path parameter. Rendezvous point ID
	RendezvousPointId pulumi.StringPtrInput
	Serial            pulumi.StringPtrInput
}

func (SwitchRoutingMulticastRendezvousPointsState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchRoutingMulticastRendezvousPointsState)(nil)).Elem()
}

type switchRoutingMulticastRendezvousPointsArgs struct {
	// The IP address of the interface where the RP needs to be created.
	InterfaceIp *string `pulumi:"interfaceIp"`
	// 'Any', or the IP address of a multicast group
	MulticastGroup *string `pulumi:"multicastGroup"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// rendezvousPointId path parameter. Rendezvous point ID
	RendezvousPointId *string `pulumi:"rendezvousPointId"`
}

// The set of arguments for constructing a SwitchRoutingMulticastRendezvousPoints resource.
type SwitchRoutingMulticastRendezvousPointsArgs struct {
	// The IP address of the interface where the RP needs to be created.
	InterfaceIp pulumi.StringPtrInput
	// 'Any', or the IP address of a multicast group
	MulticastGroup pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// rendezvousPointId path parameter. Rendezvous point ID
	RendezvousPointId pulumi.StringPtrInput
}

func (SwitchRoutingMulticastRendezvousPointsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchRoutingMulticastRendezvousPointsArgs)(nil)).Elem()
}

type SwitchRoutingMulticastRendezvousPointsInput interface {
	pulumi.Input

	ToSwitchRoutingMulticastRendezvousPointsOutput() SwitchRoutingMulticastRendezvousPointsOutput
	ToSwitchRoutingMulticastRendezvousPointsOutputWithContext(ctx context.Context) SwitchRoutingMulticastRendezvousPointsOutput
}

func (*SwitchRoutingMulticastRendezvousPoints) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchRoutingMulticastRendezvousPoints)(nil)).Elem()
}

func (i *SwitchRoutingMulticastRendezvousPoints) ToSwitchRoutingMulticastRendezvousPointsOutput() SwitchRoutingMulticastRendezvousPointsOutput {
	return i.ToSwitchRoutingMulticastRendezvousPointsOutputWithContext(context.Background())
}

func (i *SwitchRoutingMulticastRendezvousPoints) ToSwitchRoutingMulticastRendezvousPointsOutputWithContext(ctx context.Context) SwitchRoutingMulticastRendezvousPointsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchRoutingMulticastRendezvousPointsOutput)
}

// SwitchRoutingMulticastRendezvousPointsArrayInput is an input type that accepts SwitchRoutingMulticastRendezvousPointsArray and SwitchRoutingMulticastRendezvousPointsArrayOutput values.
// You can construct a concrete instance of `SwitchRoutingMulticastRendezvousPointsArrayInput` via:
//
//	SwitchRoutingMulticastRendezvousPointsArray{ SwitchRoutingMulticastRendezvousPointsArgs{...} }
type SwitchRoutingMulticastRendezvousPointsArrayInput interface {
	pulumi.Input

	ToSwitchRoutingMulticastRendezvousPointsArrayOutput() SwitchRoutingMulticastRendezvousPointsArrayOutput
	ToSwitchRoutingMulticastRendezvousPointsArrayOutputWithContext(context.Context) SwitchRoutingMulticastRendezvousPointsArrayOutput
}

type SwitchRoutingMulticastRendezvousPointsArray []SwitchRoutingMulticastRendezvousPointsInput

func (SwitchRoutingMulticastRendezvousPointsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchRoutingMulticastRendezvousPoints)(nil)).Elem()
}

func (i SwitchRoutingMulticastRendezvousPointsArray) ToSwitchRoutingMulticastRendezvousPointsArrayOutput() SwitchRoutingMulticastRendezvousPointsArrayOutput {
	return i.ToSwitchRoutingMulticastRendezvousPointsArrayOutputWithContext(context.Background())
}

func (i SwitchRoutingMulticastRendezvousPointsArray) ToSwitchRoutingMulticastRendezvousPointsArrayOutputWithContext(ctx context.Context) SwitchRoutingMulticastRendezvousPointsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchRoutingMulticastRendezvousPointsArrayOutput)
}

// SwitchRoutingMulticastRendezvousPointsMapInput is an input type that accepts SwitchRoutingMulticastRendezvousPointsMap and SwitchRoutingMulticastRendezvousPointsMapOutput values.
// You can construct a concrete instance of `SwitchRoutingMulticastRendezvousPointsMapInput` via:
//
//	SwitchRoutingMulticastRendezvousPointsMap{ "key": SwitchRoutingMulticastRendezvousPointsArgs{...} }
type SwitchRoutingMulticastRendezvousPointsMapInput interface {
	pulumi.Input

	ToSwitchRoutingMulticastRendezvousPointsMapOutput() SwitchRoutingMulticastRendezvousPointsMapOutput
	ToSwitchRoutingMulticastRendezvousPointsMapOutputWithContext(context.Context) SwitchRoutingMulticastRendezvousPointsMapOutput
}

type SwitchRoutingMulticastRendezvousPointsMap map[string]SwitchRoutingMulticastRendezvousPointsInput

func (SwitchRoutingMulticastRendezvousPointsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchRoutingMulticastRendezvousPoints)(nil)).Elem()
}

func (i SwitchRoutingMulticastRendezvousPointsMap) ToSwitchRoutingMulticastRendezvousPointsMapOutput() SwitchRoutingMulticastRendezvousPointsMapOutput {
	return i.ToSwitchRoutingMulticastRendezvousPointsMapOutputWithContext(context.Background())
}

func (i SwitchRoutingMulticastRendezvousPointsMap) ToSwitchRoutingMulticastRendezvousPointsMapOutputWithContext(ctx context.Context) SwitchRoutingMulticastRendezvousPointsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchRoutingMulticastRendezvousPointsMapOutput)
}

type SwitchRoutingMulticastRendezvousPointsOutput struct{ *pulumi.OutputState }

func (SwitchRoutingMulticastRendezvousPointsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchRoutingMulticastRendezvousPoints)(nil)).Elem()
}

func (o SwitchRoutingMulticastRendezvousPointsOutput) ToSwitchRoutingMulticastRendezvousPointsOutput() SwitchRoutingMulticastRendezvousPointsOutput {
	return o
}

func (o SwitchRoutingMulticastRendezvousPointsOutput) ToSwitchRoutingMulticastRendezvousPointsOutputWithContext(ctx context.Context) SwitchRoutingMulticastRendezvousPointsOutput {
	return o
}

// The IP address of the interface where the RP needs to be created.
func (o SwitchRoutingMulticastRendezvousPointsOutput) InterfaceIp() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingMulticastRendezvousPoints) pulumi.StringOutput { return v.InterfaceIp }).(pulumi.StringOutput)
}

func (o SwitchRoutingMulticastRendezvousPointsOutput) InterfaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingMulticastRendezvousPoints) pulumi.StringOutput { return v.InterfaceName }).(pulumi.StringOutput)
}

// 'Any', or the IP address of a multicast group
func (o SwitchRoutingMulticastRendezvousPointsOutput) MulticastGroup() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingMulticastRendezvousPoints) pulumi.StringOutput { return v.MulticastGroup }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o SwitchRoutingMulticastRendezvousPointsOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingMulticastRendezvousPoints) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// rendezvousPointId path parameter. Rendezvous point ID
func (o SwitchRoutingMulticastRendezvousPointsOutput) RendezvousPointId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingMulticastRendezvousPoints) pulumi.StringOutput { return v.RendezvousPointId }).(pulumi.StringOutput)
}

func (o SwitchRoutingMulticastRendezvousPointsOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingMulticastRendezvousPoints) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

type SwitchRoutingMulticastRendezvousPointsArrayOutput struct{ *pulumi.OutputState }

func (SwitchRoutingMulticastRendezvousPointsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchRoutingMulticastRendezvousPoints)(nil)).Elem()
}

func (o SwitchRoutingMulticastRendezvousPointsArrayOutput) ToSwitchRoutingMulticastRendezvousPointsArrayOutput() SwitchRoutingMulticastRendezvousPointsArrayOutput {
	return o
}

func (o SwitchRoutingMulticastRendezvousPointsArrayOutput) ToSwitchRoutingMulticastRendezvousPointsArrayOutputWithContext(ctx context.Context) SwitchRoutingMulticastRendezvousPointsArrayOutput {
	return o
}

func (o SwitchRoutingMulticastRendezvousPointsArrayOutput) Index(i pulumi.IntInput) SwitchRoutingMulticastRendezvousPointsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchRoutingMulticastRendezvousPoints {
		return vs[0].([]*SwitchRoutingMulticastRendezvousPoints)[vs[1].(int)]
	}).(SwitchRoutingMulticastRendezvousPointsOutput)
}

type SwitchRoutingMulticastRendezvousPointsMapOutput struct{ *pulumi.OutputState }

func (SwitchRoutingMulticastRendezvousPointsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchRoutingMulticastRendezvousPoints)(nil)).Elem()
}

func (o SwitchRoutingMulticastRendezvousPointsMapOutput) ToSwitchRoutingMulticastRendezvousPointsMapOutput() SwitchRoutingMulticastRendezvousPointsMapOutput {
	return o
}

func (o SwitchRoutingMulticastRendezvousPointsMapOutput) ToSwitchRoutingMulticastRendezvousPointsMapOutputWithContext(ctx context.Context) SwitchRoutingMulticastRendezvousPointsMapOutput {
	return o
}

func (o SwitchRoutingMulticastRendezvousPointsMapOutput) MapIndex(k pulumi.StringInput) SwitchRoutingMulticastRendezvousPointsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchRoutingMulticastRendezvousPoints {
		return vs[0].(map[string]*SwitchRoutingMulticastRendezvousPoints)[vs[1].(string)]
	}).(SwitchRoutingMulticastRendezvousPointsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchRoutingMulticastRendezvousPointsInput)(nil)).Elem(), &SwitchRoutingMulticastRendezvousPoints{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchRoutingMulticastRendezvousPointsArrayInput)(nil)).Elem(), SwitchRoutingMulticastRendezvousPointsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchRoutingMulticastRendezvousPointsMapInput)(nil)).Elem(), SwitchRoutingMulticastRendezvousPointsMap{})
	pulumi.RegisterOutputType(SwitchRoutingMulticastRendezvousPointsOutput{})
	pulumi.RegisterOutputType(SwitchRoutingMulticastRendezvousPointsArrayOutput{})
	pulumi.RegisterOutputType(SwitchRoutingMulticastRendezvousPointsMapOutput{})
}