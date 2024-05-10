// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devices

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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/devices"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := devices.NewSwitchRoutingStaticRoutes(ctx, "example", &devices.SwitchRoutingStaticRoutesArgs{
//				AdvertiseViaOspfEnabled:     pulumi.Bool(false),
//				Name:                        pulumi.String("My route"),
//				NextHopIp:                   pulumi.String("1.2.3.4"),
//				PreferOverOspfRoutesEnabled: pulumi.Bool(false),
//				Serial:                      pulumi.String("string"),
//				Subnet:                      pulumi.String("192.168.1.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesSwitchRoutingStaticRoutesExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/switchRoutingStaticRoutes:SwitchRoutingStaticRoutes example "serial,static_route_id"
// ```
type SwitchRoutingStaticRoutes struct {
	pulumi.CustomResourceState

	// Option to advertise static routes via OSPF
	AdvertiseViaOspfEnabled pulumi.BoolOutput `pulumi:"advertiseViaOspfEnabled"`
	// The name or description of the layer 3 static route
	Name pulumi.StringOutput `pulumi:"name"`
	// The IP address of the router to which traffic for this destination network should be sent
	NextHopIp pulumi.StringOutput `pulumi:"nextHopIp"`
	// Option to prefer static routes over OSPF routes
	PreferOverOspfRoutesEnabled pulumi.BoolOutput `pulumi:"preferOverOspfRoutesEnabled"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
	// The identifier of a layer 3 static route
	StaticRouteId pulumi.StringOutput `pulumi:"staticRouteId"`
	// The IP address of the subnetwork specified in CIDR notation (ex. 1.2.3.0/24)
	Subnet pulumi.StringOutput `pulumi:"subnet"`
}

// NewSwitchRoutingStaticRoutes registers a new resource with the given unique name, arguments, and options.
func NewSwitchRoutingStaticRoutes(ctx *pulumi.Context,
	name string, args *SwitchRoutingStaticRoutesArgs, opts ...pulumi.ResourceOption) (*SwitchRoutingStaticRoutes, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchRoutingStaticRoutes
	err := ctx.RegisterResource("meraki:devices/switchRoutingStaticRoutes:SwitchRoutingStaticRoutes", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchRoutingStaticRoutes gets an existing SwitchRoutingStaticRoutes resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchRoutingStaticRoutes(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchRoutingStaticRoutesState, opts ...pulumi.ResourceOption) (*SwitchRoutingStaticRoutes, error) {
	var resource SwitchRoutingStaticRoutes
	err := ctx.ReadResource("meraki:devices/switchRoutingStaticRoutes:SwitchRoutingStaticRoutes", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchRoutingStaticRoutes resources.
type switchRoutingStaticRoutesState struct {
	// Option to advertise static routes via OSPF
	AdvertiseViaOspfEnabled *bool `pulumi:"advertiseViaOspfEnabled"`
	// The name or description of the layer 3 static route
	Name *string `pulumi:"name"`
	// The IP address of the router to which traffic for this destination network should be sent
	NextHopIp *string `pulumi:"nextHopIp"`
	// Option to prefer static routes over OSPF routes
	PreferOverOspfRoutesEnabled *bool `pulumi:"preferOverOspfRoutesEnabled"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
	// The identifier of a layer 3 static route
	StaticRouteId *string `pulumi:"staticRouteId"`
	// The IP address of the subnetwork specified in CIDR notation (ex. 1.2.3.0/24)
	Subnet *string `pulumi:"subnet"`
}

type SwitchRoutingStaticRoutesState struct {
	// Option to advertise static routes via OSPF
	AdvertiseViaOspfEnabled pulumi.BoolPtrInput
	// The name or description of the layer 3 static route
	Name pulumi.StringPtrInput
	// The IP address of the router to which traffic for this destination network should be sent
	NextHopIp pulumi.StringPtrInput
	// Option to prefer static routes over OSPF routes
	PreferOverOspfRoutesEnabled pulumi.BoolPtrInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
	// The identifier of a layer 3 static route
	StaticRouteId pulumi.StringPtrInput
	// The IP address of the subnetwork specified in CIDR notation (ex. 1.2.3.0/24)
	Subnet pulumi.StringPtrInput
}

func (SwitchRoutingStaticRoutesState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchRoutingStaticRoutesState)(nil)).Elem()
}

type switchRoutingStaticRoutesArgs struct {
	// Option to advertise static routes via OSPF
	AdvertiseViaOspfEnabled *bool `pulumi:"advertiseViaOspfEnabled"`
	// The name or description of the layer 3 static route
	Name *string `pulumi:"name"`
	// The IP address of the router to which traffic for this destination network should be sent
	NextHopIp *string `pulumi:"nextHopIp"`
	// Option to prefer static routes over OSPF routes
	PreferOverOspfRoutesEnabled *bool `pulumi:"preferOverOspfRoutesEnabled"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
	// The identifier of a layer 3 static route
	StaticRouteId *string `pulumi:"staticRouteId"`
	// The IP address of the subnetwork specified in CIDR notation (ex. 1.2.3.0/24)
	Subnet *string `pulumi:"subnet"`
}

// The set of arguments for constructing a SwitchRoutingStaticRoutes resource.
type SwitchRoutingStaticRoutesArgs struct {
	// Option to advertise static routes via OSPF
	AdvertiseViaOspfEnabled pulumi.BoolPtrInput
	// The name or description of the layer 3 static route
	Name pulumi.StringPtrInput
	// The IP address of the router to which traffic for this destination network should be sent
	NextHopIp pulumi.StringPtrInput
	// Option to prefer static routes over OSPF routes
	PreferOverOspfRoutesEnabled pulumi.BoolPtrInput
	// serial path parameter.
	Serial pulumi.StringInput
	// The identifier of a layer 3 static route
	StaticRouteId pulumi.StringPtrInput
	// The IP address of the subnetwork specified in CIDR notation (ex. 1.2.3.0/24)
	Subnet pulumi.StringPtrInput
}

func (SwitchRoutingStaticRoutesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchRoutingStaticRoutesArgs)(nil)).Elem()
}

type SwitchRoutingStaticRoutesInput interface {
	pulumi.Input

	ToSwitchRoutingStaticRoutesOutput() SwitchRoutingStaticRoutesOutput
	ToSwitchRoutingStaticRoutesOutputWithContext(ctx context.Context) SwitchRoutingStaticRoutesOutput
}

func (*SwitchRoutingStaticRoutes) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchRoutingStaticRoutes)(nil)).Elem()
}

func (i *SwitchRoutingStaticRoutes) ToSwitchRoutingStaticRoutesOutput() SwitchRoutingStaticRoutesOutput {
	return i.ToSwitchRoutingStaticRoutesOutputWithContext(context.Background())
}

func (i *SwitchRoutingStaticRoutes) ToSwitchRoutingStaticRoutesOutputWithContext(ctx context.Context) SwitchRoutingStaticRoutesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchRoutingStaticRoutesOutput)
}

// SwitchRoutingStaticRoutesArrayInput is an input type that accepts SwitchRoutingStaticRoutesArray and SwitchRoutingStaticRoutesArrayOutput values.
// You can construct a concrete instance of `SwitchRoutingStaticRoutesArrayInput` via:
//
//	SwitchRoutingStaticRoutesArray{ SwitchRoutingStaticRoutesArgs{...} }
type SwitchRoutingStaticRoutesArrayInput interface {
	pulumi.Input

	ToSwitchRoutingStaticRoutesArrayOutput() SwitchRoutingStaticRoutesArrayOutput
	ToSwitchRoutingStaticRoutesArrayOutputWithContext(context.Context) SwitchRoutingStaticRoutesArrayOutput
}

type SwitchRoutingStaticRoutesArray []SwitchRoutingStaticRoutesInput

func (SwitchRoutingStaticRoutesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchRoutingStaticRoutes)(nil)).Elem()
}

func (i SwitchRoutingStaticRoutesArray) ToSwitchRoutingStaticRoutesArrayOutput() SwitchRoutingStaticRoutesArrayOutput {
	return i.ToSwitchRoutingStaticRoutesArrayOutputWithContext(context.Background())
}

func (i SwitchRoutingStaticRoutesArray) ToSwitchRoutingStaticRoutesArrayOutputWithContext(ctx context.Context) SwitchRoutingStaticRoutesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchRoutingStaticRoutesArrayOutput)
}

// SwitchRoutingStaticRoutesMapInput is an input type that accepts SwitchRoutingStaticRoutesMap and SwitchRoutingStaticRoutesMapOutput values.
// You can construct a concrete instance of `SwitchRoutingStaticRoutesMapInput` via:
//
//	SwitchRoutingStaticRoutesMap{ "key": SwitchRoutingStaticRoutesArgs{...} }
type SwitchRoutingStaticRoutesMapInput interface {
	pulumi.Input

	ToSwitchRoutingStaticRoutesMapOutput() SwitchRoutingStaticRoutesMapOutput
	ToSwitchRoutingStaticRoutesMapOutputWithContext(context.Context) SwitchRoutingStaticRoutesMapOutput
}

type SwitchRoutingStaticRoutesMap map[string]SwitchRoutingStaticRoutesInput

func (SwitchRoutingStaticRoutesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchRoutingStaticRoutes)(nil)).Elem()
}

func (i SwitchRoutingStaticRoutesMap) ToSwitchRoutingStaticRoutesMapOutput() SwitchRoutingStaticRoutesMapOutput {
	return i.ToSwitchRoutingStaticRoutesMapOutputWithContext(context.Background())
}

func (i SwitchRoutingStaticRoutesMap) ToSwitchRoutingStaticRoutesMapOutputWithContext(ctx context.Context) SwitchRoutingStaticRoutesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchRoutingStaticRoutesMapOutput)
}

type SwitchRoutingStaticRoutesOutput struct{ *pulumi.OutputState }

func (SwitchRoutingStaticRoutesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchRoutingStaticRoutes)(nil)).Elem()
}

func (o SwitchRoutingStaticRoutesOutput) ToSwitchRoutingStaticRoutesOutput() SwitchRoutingStaticRoutesOutput {
	return o
}

func (o SwitchRoutingStaticRoutesOutput) ToSwitchRoutingStaticRoutesOutputWithContext(ctx context.Context) SwitchRoutingStaticRoutesOutput {
	return o
}

// Option to advertise static routes via OSPF
func (o SwitchRoutingStaticRoutesOutput) AdvertiseViaOspfEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchRoutingStaticRoutes) pulumi.BoolOutput { return v.AdvertiseViaOspfEnabled }).(pulumi.BoolOutput)
}

// The name or description of the layer 3 static route
func (o SwitchRoutingStaticRoutesOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingStaticRoutes) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The IP address of the router to which traffic for this destination network should be sent
func (o SwitchRoutingStaticRoutesOutput) NextHopIp() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingStaticRoutes) pulumi.StringOutput { return v.NextHopIp }).(pulumi.StringOutput)
}

// Option to prefer static routes over OSPF routes
func (o SwitchRoutingStaticRoutesOutput) PreferOverOspfRoutesEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchRoutingStaticRoutes) pulumi.BoolOutput { return v.PreferOverOspfRoutesEnabled }).(pulumi.BoolOutput)
}

// serial path parameter.
func (o SwitchRoutingStaticRoutesOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingStaticRoutes) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

// The identifier of a layer 3 static route
func (o SwitchRoutingStaticRoutesOutput) StaticRouteId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingStaticRoutes) pulumi.StringOutput { return v.StaticRouteId }).(pulumi.StringOutput)
}

// The IP address of the subnetwork specified in CIDR notation (ex. 1.2.3.0/24)
func (o SwitchRoutingStaticRoutesOutput) Subnet() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingStaticRoutes) pulumi.StringOutput { return v.Subnet }).(pulumi.StringOutput)
}

type SwitchRoutingStaticRoutesArrayOutput struct{ *pulumi.OutputState }

func (SwitchRoutingStaticRoutesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchRoutingStaticRoutes)(nil)).Elem()
}

func (o SwitchRoutingStaticRoutesArrayOutput) ToSwitchRoutingStaticRoutesArrayOutput() SwitchRoutingStaticRoutesArrayOutput {
	return o
}

func (o SwitchRoutingStaticRoutesArrayOutput) ToSwitchRoutingStaticRoutesArrayOutputWithContext(ctx context.Context) SwitchRoutingStaticRoutesArrayOutput {
	return o
}

func (o SwitchRoutingStaticRoutesArrayOutput) Index(i pulumi.IntInput) SwitchRoutingStaticRoutesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchRoutingStaticRoutes {
		return vs[0].([]*SwitchRoutingStaticRoutes)[vs[1].(int)]
	}).(SwitchRoutingStaticRoutesOutput)
}

type SwitchRoutingStaticRoutesMapOutput struct{ *pulumi.OutputState }

func (SwitchRoutingStaticRoutesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchRoutingStaticRoutes)(nil)).Elem()
}

func (o SwitchRoutingStaticRoutesMapOutput) ToSwitchRoutingStaticRoutesMapOutput() SwitchRoutingStaticRoutesMapOutput {
	return o
}

func (o SwitchRoutingStaticRoutesMapOutput) ToSwitchRoutingStaticRoutesMapOutputWithContext(ctx context.Context) SwitchRoutingStaticRoutesMapOutput {
	return o
}

func (o SwitchRoutingStaticRoutesMapOutput) MapIndex(k pulumi.StringInput) SwitchRoutingStaticRoutesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchRoutingStaticRoutes {
		return vs[0].(map[string]*SwitchRoutingStaticRoutes)[vs[1].(string)]
	}).(SwitchRoutingStaticRoutesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchRoutingStaticRoutesInput)(nil)).Elem(), &SwitchRoutingStaticRoutes{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchRoutingStaticRoutesArrayInput)(nil)).Elem(), SwitchRoutingStaticRoutesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchRoutingStaticRoutesMapInput)(nil)).Elem(), SwitchRoutingStaticRoutesMap{})
	pulumi.RegisterOutputType(SwitchRoutingStaticRoutesOutput{})
	pulumi.RegisterOutputType(SwitchRoutingStaticRoutesArrayOutput{})
	pulumi.RegisterOutputType(SwitchRoutingStaticRoutesMapOutput{})
}
