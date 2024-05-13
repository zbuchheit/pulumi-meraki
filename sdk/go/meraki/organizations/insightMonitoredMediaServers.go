// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := organizations.NewInsightMonitoredMediaServers(ctx, "example", &organizations.InsightMonitoredMediaServersArgs{
//				Address:                     pulumi.String("123.123.123.1"),
//				BestEffortMonitoringEnabled: pulumi.Bool(true),
//				Name:                        pulumi.String("Sample VoIP Provider"),
//				OrganizationId:              pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsInsightMonitoredMediaServersExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:organizations/insightMonitoredMediaServers:InsightMonitoredMediaServers example "monitored_media_server_id,organization_id"
// ```
type InsightMonitoredMediaServers struct {
	pulumi.CustomResourceState

	// The IP address (IPv4 only) or hostname of the media server to monitor
	Address pulumi.StringOutput `pulumi:"address"`
	// Indicates that if the media server doesn't respond to ICMP pings, the nearest hop will be used in its stead
	BestEffortMonitoringEnabled pulumi.BoolOutput `pulumi:"bestEffortMonitoringEnabled"`
	// monitoredMediaServerId path parameter. Monitored media server ID
	MonitoredMediaServerId pulumi.StringPtrOutput `pulumi:"monitoredMediaServerId"`
	// The name of the VoIP provider
	Name pulumi.StringOutput `pulumi:"name"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
}

// NewInsightMonitoredMediaServers registers a new resource with the given unique name, arguments, and options.
func NewInsightMonitoredMediaServers(ctx *pulumi.Context,
	name string, args *InsightMonitoredMediaServersArgs, opts ...pulumi.ResourceOption) (*InsightMonitoredMediaServers, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InsightMonitoredMediaServers
	err := ctx.RegisterResource("meraki:organizations/insightMonitoredMediaServers:InsightMonitoredMediaServers", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInsightMonitoredMediaServers gets an existing InsightMonitoredMediaServers resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInsightMonitoredMediaServers(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InsightMonitoredMediaServersState, opts ...pulumi.ResourceOption) (*InsightMonitoredMediaServers, error) {
	var resource InsightMonitoredMediaServers
	err := ctx.ReadResource("meraki:organizations/insightMonitoredMediaServers:InsightMonitoredMediaServers", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InsightMonitoredMediaServers resources.
type insightMonitoredMediaServersState struct {
	// The IP address (IPv4 only) or hostname of the media server to monitor
	Address *string `pulumi:"address"`
	// Indicates that if the media server doesn't respond to ICMP pings, the nearest hop will be used in its stead
	BestEffortMonitoringEnabled *bool `pulumi:"bestEffortMonitoringEnabled"`
	// monitoredMediaServerId path parameter. Monitored media server ID
	MonitoredMediaServerId *string `pulumi:"monitoredMediaServerId"`
	// The name of the VoIP provider
	Name *string `pulumi:"name"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
}

type InsightMonitoredMediaServersState struct {
	// The IP address (IPv4 only) or hostname of the media server to monitor
	Address pulumi.StringPtrInput
	// Indicates that if the media server doesn't respond to ICMP pings, the nearest hop will be used in its stead
	BestEffortMonitoringEnabled pulumi.BoolPtrInput
	// monitoredMediaServerId path parameter. Monitored media server ID
	MonitoredMediaServerId pulumi.StringPtrInput
	// The name of the VoIP provider
	Name pulumi.StringPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
}

func (InsightMonitoredMediaServersState) ElementType() reflect.Type {
	return reflect.TypeOf((*insightMonitoredMediaServersState)(nil)).Elem()
}

type insightMonitoredMediaServersArgs struct {
	// The IP address (IPv4 only) or hostname of the media server to monitor
	Address *string `pulumi:"address"`
	// Indicates that if the media server doesn't respond to ICMP pings, the nearest hop will be used in its stead
	BestEffortMonitoringEnabled *bool `pulumi:"bestEffortMonitoringEnabled"`
	// monitoredMediaServerId path parameter. Monitored media server ID
	MonitoredMediaServerId *string `pulumi:"monitoredMediaServerId"`
	// The name of the VoIP provider
	Name *string `pulumi:"name"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

// The set of arguments for constructing a InsightMonitoredMediaServers resource.
type InsightMonitoredMediaServersArgs struct {
	// The IP address (IPv4 only) or hostname of the media server to monitor
	Address pulumi.StringPtrInput
	// Indicates that if the media server doesn't respond to ICMP pings, the nearest hop will be used in its stead
	BestEffortMonitoringEnabled pulumi.BoolPtrInput
	// monitoredMediaServerId path parameter. Monitored media server ID
	MonitoredMediaServerId pulumi.StringPtrInput
	// The name of the VoIP provider
	Name pulumi.StringPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
}

func (InsightMonitoredMediaServersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*insightMonitoredMediaServersArgs)(nil)).Elem()
}

type InsightMonitoredMediaServersInput interface {
	pulumi.Input

	ToInsightMonitoredMediaServersOutput() InsightMonitoredMediaServersOutput
	ToInsightMonitoredMediaServersOutputWithContext(ctx context.Context) InsightMonitoredMediaServersOutput
}

func (*InsightMonitoredMediaServers) ElementType() reflect.Type {
	return reflect.TypeOf((**InsightMonitoredMediaServers)(nil)).Elem()
}

func (i *InsightMonitoredMediaServers) ToInsightMonitoredMediaServersOutput() InsightMonitoredMediaServersOutput {
	return i.ToInsightMonitoredMediaServersOutputWithContext(context.Background())
}

func (i *InsightMonitoredMediaServers) ToInsightMonitoredMediaServersOutputWithContext(ctx context.Context) InsightMonitoredMediaServersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InsightMonitoredMediaServersOutput)
}

// InsightMonitoredMediaServersArrayInput is an input type that accepts InsightMonitoredMediaServersArray and InsightMonitoredMediaServersArrayOutput values.
// You can construct a concrete instance of `InsightMonitoredMediaServersArrayInput` via:
//
//	InsightMonitoredMediaServersArray{ InsightMonitoredMediaServersArgs{...} }
type InsightMonitoredMediaServersArrayInput interface {
	pulumi.Input

	ToInsightMonitoredMediaServersArrayOutput() InsightMonitoredMediaServersArrayOutput
	ToInsightMonitoredMediaServersArrayOutputWithContext(context.Context) InsightMonitoredMediaServersArrayOutput
}

type InsightMonitoredMediaServersArray []InsightMonitoredMediaServersInput

func (InsightMonitoredMediaServersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InsightMonitoredMediaServers)(nil)).Elem()
}

func (i InsightMonitoredMediaServersArray) ToInsightMonitoredMediaServersArrayOutput() InsightMonitoredMediaServersArrayOutput {
	return i.ToInsightMonitoredMediaServersArrayOutputWithContext(context.Background())
}

func (i InsightMonitoredMediaServersArray) ToInsightMonitoredMediaServersArrayOutputWithContext(ctx context.Context) InsightMonitoredMediaServersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InsightMonitoredMediaServersArrayOutput)
}

// InsightMonitoredMediaServersMapInput is an input type that accepts InsightMonitoredMediaServersMap and InsightMonitoredMediaServersMapOutput values.
// You can construct a concrete instance of `InsightMonitoredMediaServersMapInput` via:
//
//	InsightMonitoredMediaServersMap{ "key": InsightMonitoredMediaServersArgs{...} }
type InsightMonitoredMediaServersMapInput interface {
	pulumi.Input

	ToInsightMonitoredMediaServersMapOutput() InsightMonitoredMediaServersMapOutput
	ToInsightMonitoredMediaServersMapOutputWithContext(context.Context) InsightMonitoredMediaServersMapOutput
}

type InsightMonitoredMediaServersMap map[string]InsightMonitoredMediaServersInput

func (InsightMonitoredMediaServersMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InsightMonitoredMediaServers)(nil)).Elem()
}

func (i InsightMonitoredMediaServersMap) ToInsightMonitoredMediaServersMapOutput() InsightMonitoredMediaServersMapOutput {
	return i.ToInsightMonitoredMediaServersMapOutputWithContext(context.Background())
}

func (i InsightMonitoredMediaServersMap) ToInsightMonitoredMediaServersMapOutputWithContext(ctx context.Context) InsightMonitoredMediaServersMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InsightMonitoredMediaServersMapOutput)
}

type InsightMonitoredMediaServersOutput struct{ *pulumi.OutputState }

func (InsightMonitoredMediaServersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InsightMonitoredMediaServers)(nil)).Elem()
}

func (o InsightMonitoredMediaServersOutput) ToInsightMonitoredMediaServersOutput() InsightMonitoredMediaServersOutput {
	return o
}

func (o InsightMonitoredMediaServersOutput) ToInsightMonitoredMediaServersOutputWithContext(ctx context.Context) InsightMonitoredMediaServersOutput {
	return o
}

// The IP address (IPv4 only) or hostname of the media server to monitor
func (o InsightMonitoredMediaServersOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v *InsightMonitoredMediaServers) pulumi.StringOutput { return v.Address }).(pulumi.StringOutput)
}

// Indicates that if the media server doesn't respond to ICMP pings, the nearest hop will be used in its stead
func (o InsightMonitoredMediaServersOutput) BestEffortMonitoringEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *InsightMonitoredMediaServers) pulumi.BoolOutput { return v.BestEffortMonitoringEnabled }).(pulumi.BoolOutput)
}

// monitoredMediaServerId path parameter. Monitored media server ID
func (o InsightMonitoredMediaServersOutput) MonitoredMediaServerId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InsightMonitoredMediaServers) pulumi.StringPtrOutput { return v.MonitoredMediaServerId }).(pulumi.StringPtrOutput)
}

// The name of the VoIP provider
func (o InsightMonitoredMediaServersOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InsightMonitoredMediaServers) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// organizationId path parameter. Organization ID
func (o InsightMonitoredMediaServersOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *InsightMonitoredMediaServers) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

type InsightMonitoredMediaServersArrayOutput struct{ *pulumi.OutputState }

func (InsightMonitoredMediaServersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InsightMonitoredMediaServers)(nil)).Elem()
}

func (o InsightMonitoredMediaServersArrayOutput) ToInsightMonitoredMediaServersArrayOutput() InsightMonitoredMediaServersArrayOutput {
	return o
}

func (o InsightMonitoredMediaServersArrayOutput) ToInsightMonitoredMediaServersArrayOutputWithContext(ctx context.Context) InsightMonitoredMediaServersArrayOutput {
	return o
}

func (o InsightMonitoredMediaServersArrayOutput) Index(i pulumi.IntInput) InsightMonitoredMediaServersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InsightMonitoredMediaServers {
		return vs[0].([]*InsightMonitoredMediaServers)[vs[1].(int)]
	}).(InsightMonitoredMediaServersOutput)
}

type InsightMonitoredMediaServersMapOutput struct{ *pulumi.OutputState }

func (InsightMonitoredMediaServersMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InsightMonitoredMediaServers)(nil)).Elem()
}

func (o InsightMonitoredMediaServersMapOutput) ToInsightMonitoredMediaServersMapOutput() InsightMonitoredMediaServersMapOutput {
	return o
}

func (o InsightMonitoredMediaServersMapOutput) ToInsightMonitoredMediaServersMapOutputWithContext(ctx context.Context) InsightMonitoredMediaServersMapOutput {
	return o
}

func (o InsightMonitoredMediaServersMapOutput) MapIndex(k pulumi.StringInput) InsightMonitoredMediaServersOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InsightMonitoredMediaServers {
		return vs[0].(map[string]*InsightMonitoredMediaServers)[vs[1].(string)]
	}).(InsightMonitoredMediaServersOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InsightMonitoredMediaServersInput)(nil)).Elem(), &InsightMonitoredMediaServers{})
	pulumi.RegisterInputType(reflect.TypeOf((*InsightMonitoredMediaServersArrayInput)(nil)).Elem(), InsightMonitoredMediaServersArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InsightMonitoredMediaServersMapInput)(nil)).Elem(), InsightMonitoredMediaServersMap{})
	pulumi.RegisterOutputType(InsightMonitoredMediaServersOutput{})
	pulumi.RegisterOutputType(InsightMonitoredMediaServersArrayOutput{})
	pulumi.RegisterOutputType(InsightMonitoredMediaServersMapOutput{})
}