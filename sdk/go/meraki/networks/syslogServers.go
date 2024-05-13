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
//			example, err := networks.NewSyslogServers(ctx, "example", &networks.SyslogServersArgs{
//				NetworkId: pulumi.String("string"),
//				Servers: networks.SyslogServersServerArray{
//					&networks.SyslogServersServerArgs{
//						Host: pulumi.String("1.2.3.4"),
//						Port: pulumi.Int(443),
//						Roles: pulumi.StringArray{
//							pulumi.String("Wireless event log"),
//							pulumi.String("URLs"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSyslogServersExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/syslogServers:SyslogServers example "network_id"
// ```
type SyslogServers struct {
	pulumi.CustomResourceState

	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// List of the syslog servers for this network
	Servers SyslogServersServerArrayOutput `pulumi:"servers"`
}

// NewSyslogServers registers a new resource with the given unique name, arguments, and options.
func NewSyslogServers(ctx *pulumi.Context,
	name string, args *SyslogServersArgs, opts ...pulumi.ResourceOption) (*SyslogServers, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SyslogServers
	err := ctx.RegisterResource("meraki:networks/syslogServers:SyslogServers", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSyslogServers gets an existing SyslogServers resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSyslogServers(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SyslogServersState, opts ...pulumi.ResourceOption) (*SyslogServers, error) {
	var resource SyslogServers
	err := ctx.ReadResource("meraki:networks/syslogServers:SyslogServers", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SyslogServers resources.
type syslogServersState struct {
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// List of the syslog servers for this network
	Servers []SyslogServersServer `pulumi:"servers"`
}

type SyslogServersState struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// List of the syslog servers for this network
	Servers SyslogServersServerArrayInput
}

func (SyslogServersState) ElementType() reflect.Type {
	return reflect.TypeOf((*syslogServersState)(nil)).Elem()
}

type syslogServersArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// List of the syslog servers for this network
	Servers []SyslogServersServer `pulumi:"servers"`
}

// The set of arguments for constructing a SyslogServers resource.
type SyslogServersArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// List of the syslog servers for this network
	Servers SyslogServersServerArrayInput
}

func (SyslogServersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*syslogServersArgs)(nil)).Elem()
}

type SyslogServersInput interface {
	pulumi.Input

	ToSyslogServersOutput() SyslogServersOutput
	ToSyslogServersOutputWithContext(ctx context.Context) SyslogServersOutput
}

func (*SyslogServers) ElementType() reflect.Type {
	return reflect.TypeOf((**SyslogServers)(nil)).Elem()
}

func (i *SyslogServers) ToSyslogServersOutput() SyslogServersOutput {
	return i.ToSyslogServersOutputWithContext(context.Background())
}

func (i *SyslogServers) ToSyslogServersOutputWithContext(ctx context.Context) SyslogServersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SyslogServersOutput)
}

// SyslogServersArrayInput is an input type that accepts SyslogServersArray and SyslogServersArrayOutput values.
// You can construct a concrete instance of `SyslogServersArrayInput` via:
//
//	SyslogServersArray{ SyslogServersArgs{...} }
type SyslogServersArrayInput interface {
	pulumi.Input

	ToSyslogServersArrayOutput() SyslogServersArrayOutput
	ToSyslogServersArrayOutputWithContext(context.Context) SyslogServersArrayOutput
}

type SyslogServersArray []SyslogServersInput

func (SyslogServersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SyslogServers)(nil)).Elem()
}

func (i SyslogServersArray) ToSyslogServersArrayOutput() SyslogServersArrayOutput {
	return i.ToSyslogServersArrayOutputWithContext(context.Background())
}

func (i SyslogServersArray) ToSyslogServersArrayOutputWithContext(ctx context.Context) SyslogServersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SyslogServersArrayOutput)
}

// SyslogServersMapInput is an input type that accepts SyslogServersMap and SyslogServersMapOutput values.
// You can construct a concrete instance of `SyslogServersMapInput` via:
//
//	SyslogServersMap{ "key": SyslogServersArgs{...} }
type SyslogServersMapInput interface {
	pulumi.Input

	ToSyslogServersMapOutput() SyslogServersMapOutput
	ToSyslogServersMapOutputWithContext(context.Context) SyslogServersMapOutput
}

type SyslogServersMap map[string]SyslogServersInput

func (SyslogServersMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SyslogServers)(nil)).Elem()
}

func (i SyslogServersMap) ToSyslogServersMapOutput() SyslogServersMapOutput {
	return i.ToSyslogServersMapOutputWithContext(context.Background())
}

func (i SyslogServersMap) ToSyslogServersMapOutputWithContext(ctx context.Context) SyslogServersMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SyslogServersMapOutput)
}

type SyslogServersOutput struct{ *pulumi.OutputState }

func (SyslogServersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SyslogServers)(nil)).Elem()
}

func (o SyslogServersOutput) ToSyslogServersOutput() SyslogServersOutput {
	return o
}

func (o SyslogServersOutput) ToSyslogServersOutputWithContext(ctx context.Context) SyslogServersOutput {
	return o
}

// networkId path parameter. Network ID
func (o SyslogServersOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SyslogServers) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// List of the syslog servers for this network
func (o SyslogServersOutput) Servers() SyslogServersServerArrayOutput {
	return o.ApplyT(func(v *SyslogServers) SyslogServersServerArrayOutput { return v.Servers }).(SyslogServersServerArrayOutput)
}

type SyslogServersArrayOutput struct{ *pulumi.OutputState }

func (SyslogServersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SyslogServers)(nil)).Elem()
}

func (o SyslogServersArrayOutput) ToSyslogServersArrayOutput() SyslogServersArrayOutput {
	return o
}

func (o SyslogServersArrayOutput) ToSyslogServersArrayOutputWithContext(ctx context.Context) SyslogServersArrayOutput {
	return o
}

func (o SyslogServersArrayOutput) Index(i pulumi.IntInput) SyslogServersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SyslogServers {
		return vs[0].([]*SyslogServers)[vs[1].(int)]
	}).(SyslogServersOutput)
}

type SyslogServersMapOutput struct{ *pulumi.OutputState }

func (SyslogServersMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SyslogServers)(nil)).Elem()
}

func (o SyslogServersMapOutput) ToSyslogServersMapOutput() SyslogServersMapOutput {
	return o
}

func (o SyslogServersMapOutput) ToSyslogServersMapOutputWithContext(ctx context.Context) SyslogServersMapOutput {
	return o
}

func (o SyslogServersMapOutput) MapIndex(k pulumi.StringInput) SyslogServersOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SyslogServers {
		return vs[0].(map[string]*SyslogServers)[vs[1].(string)]
	}).(SyslogServersOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SyslogServersInput)(nil)).Elem(), &SyslogServers{})
	pulumi.RegisterInputType(reflect.TypeOf((*SyslogServersArrayInput)(nil)).Elem(), SyslogServersArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SyslogServersMapInput)(nil)).Elem(), SyslogServersMap{})
	pulumi.RegisterOutputType(SyslogServersOutput{})
	pulumi.RegisterOutputType(SyslogServersArrayOutput{})
	pulumi.RegisterOutputType(SyslogServersMapOutput{})
}