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
//			example, err := devices.NewApplianceUplinksSettings(ctx, "example", &devices.ApplianceUplinksSettingsArgs{
//				Interfaces: &devices.ApplianceUplinksSettingsInterfacesArgs{
//					Wan1: &devices.ApplianceUplinksSettingsInterfacesWan1Args{
//						Enabled: pulumi.Bool(true),
//						Pppoe: &devices.ApplianceUplinksSettingsInterfacesWan1PppoeArgs{
//							Authentication: &devices.ApplianceUplinksSettingsInterfacesWan1PppoeAuthenticationArgs{
//								Enabled:  pulumi.Bool(true),
//								Password: pulumi.String("password"),
//								Username: pulumi.String("username"),
//							},
//							Enabled: pulumi.Bool(true),
//						},
//						Svis: &devices.ApplianceUplinksSettingsInterfacesWan1SvisArgs{
//							Ipv4: &devices.ApplianceUplinksSettingsInterfacesWan1SvisIpv4Args{
//								Address:        pulumi.String("9.10.11.10/16"),
//								AssignmentMode: pulumi.String("static"),
//								Gateway:        pulumi.String("13.14.15.16"),
//								Nameservers: &devices.ApplianceUplinksSettingsInterfacesWan1SvisIpv4NameserversArgs{
//									Addresses: pulumi.StringArray{
//										pulumi.String("1.2.3.4"),
//									},
//								},
//							},
//							Ipv6: &devices.ApplianceUplinksSettingsInterfacesWan1SvisIpv6Args{
//								Address:        pulumi.String("1:2:3::4"),
//								AssignmentMode: pulumi.String("static"),
//								Gateway:        pulumi.String("1:2:3::5"),
//								Nameservers: &devices.ApplianceUplinksSettingsInterfacesWan1SvisIpv6NameserversArgs{
//									Addresses: pulumi.StringArray{
//										pulumi.String("1001:4860:4860::8888"),
//										pulumi.String("1001:4860:4860::8844"),
//									},
//								},
//							},
//						},
//						VlanTagging: &devices.ApplianceUplinksSettingsInterfacesWan1VlanTaggingArgs{
//							Enabled: pulumi.Bool(true),
//							VlanId:  pulumi.Int(1),
//						},
//					},
//					Wan2: &devices.ApplianceUplinksSettingsInterfacesWan2Args{
//						Enabled: pulumi.Bool(true),
//						Pppoe: &devices.ApplianceUplinksSettingsInterfacesWan2PppoeArgs{
//							Authentication: &devices.ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs{
//								Enabled:  pulumi.Bool(true),
//								Password: pulumi.String("password"),
//								Username: pulumi.String("username"),
//							},
//							Enabled: pulumi.Bool(true),
//						},
//						Svis: &devices.ApplianceUplinksSettingsInterfacesWan2SvisArgs{
//							Ipv4: &devices.ApplianceUplinksSettingsInterfacesWan2SvisIpv4Args{
//								Address:        pulumi.String("9.10.11.10/16"),
//								AssignmentMode: pulumi.String("static"),
//								Gateway:        pulumi.String("13.14.15.16"),
//								Nameservers: &devices.ApplianceUplinksSettingsInterfacesWan2SvisIpv4NameserversArgs{
//									Addresses: pulumi.StringArray{
//										pulumi.String("1.2.3.4"),
//									},
//								},
//							},
//							Ipv6: &devices.ApplianceUplinksSettingsInterfacesWan2SvisIpv6Args{
//								Address:        pulumi.String("1:2:3::4"),
//								AssignmentMode: pulumi.String("static"),
//								Gateway:        pulumi.String("1:2:3::5"),
//								Nameservers: &devices.ApplianceUplinksSettingsInterfacesWan2SvisIpv6NameserversArgs{
//									Addresses: pulumi.StringArray{
//										pulumi.String("1001:4860:4860::8888"),
//										pulumi.String("1001:4860:4860::8844"),
//									},
//								},
//							},
//						},
//						VlanTagging: &devices.ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs{
//							Enabled: pulumi.Bool(true),
//							VlanId:  pulumi.Int(1),
//						},
//					},
//				},
//				Serial: pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesApplianceUplinksSettingsExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/applianceUplinksSettings:ApplianceUplinksSettings example "serial"
// ```
type ApplianceUplinksSettings struct {
	pulumi.CustomResourceState

	// Interface settings.
	Interfaces ApplianceUplinksSettingsInterfacesOutput `pulumi:"interfaces"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
}

// NewApplianceUplinksSettings registers a new resource with the given unique name, arguments, and options.
func NewApplianceUplinksSettings(ctx *pulumi.Context,
	name string, args *ApplianceUplinksSettingsArgs, opts ...pulumi.ResourceOption) (*ApplianceUplinksSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplianceUplinksSettings
	err := ctx.RegisterResource("meraki:devices/applianceUplinksSettings:ApplianceUplinksSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplianceUplinksSettings gets an existing ApplianceUplinksSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplianceUplinksSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplianceUplinksSettingsState, opts ...pulumi.ResourceOption) (*ApplianceUplinksSettings, error) {
	var resource ApplianceUplinksSettings
	err := ctx.ReadResource("meraki:devices/applianceUplinksSettings:ApplianceUplinksSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplianceUplinksSettings resources.
type applianceUplinksSettingsState struct {
	// Interface settings.
	Interfaces *ApplianceUplinksSettingsInterfaces `pulumi:"interfaces"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
}

type ApplianceUplinksSettingsState struct {
	// Interface settings.
	Interfaces ApplianceUplinksSettingsInterfacesPtrInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
}

func (ApplianceUplinksSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceUplinksSettingsState)(nil)).Elem()
}

type applianceUplinksSettingsArgs struct {
	// Interface settings.
	Interfaces *ApplianceUplinksSettingsInterfaces `pulumi:"interfaces"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// The set of arguments for constructing a ApplianceUplinksSettings resource.
type ApplianceUplinksSettingsArgs struct {
	// Interface settings.
	Interfaces ApplianceUplinksSettingsInterfacesPtrInput
	// serial path parameter.
	Serial pulumi.StringInput
}

func (ApplianceUplinksSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceUplinksSettingsArgs)(nil)).Elem()
}

type ApplianceUplinksSettingsInput interface {
	pulumi.Input

	ToApplianceUplinksSettingsOutput() ApplianceUplinksSettingsOutput
	ToApplianceUplinksSettingsOutputWithContext(ctx context.Context) ApplianceUplinksSettingsOutput
}

func (*ApplianceUplinksSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceUplinksSettings)(nil)).Elem()
}

func (i *ApplianceUplinksSettings) ToApplianceUplinksSettingsOutput() ApplianceUplinksSettingsOutput {
	return i.ToApplianceUplinksSettingsOutputWithContext(context.Background())
}

func (i *ApplianceUplinksSettings) ToApplianceUplinksSettingsOutputWithContext(ctx context.Context) ApplianceUplinksSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceUplinksSettingsOutput)
}

// ApplianceUplinksSettingsArrayInput is an input type that accepts ApplianceUplinksSettingsArray and ApplianceUplinksSettingsArrayOutput values.
// You can construct a concrete instance of `ApplianceUplinksSettingsArrayInput` via:
//
//	ApplianceUplinksSettingsArray{ ApplianceUplinksSettingsArgs{...} }
type ApplianceUplinksSettingsArrayInput interface {
	pulumi.Input

	ToApplianceUplinksSettingsArrayOutput() ApplianceUplinksSettingsArrayOutput
	ToApplianceUplinksSettingsArrayOutputWithContext(context.Context) ApplianceUplinksSettingsArrayOutput
}

type ApplianceUplinksSettingsArray []ApplianceUplinksSettingsInput

func (ApplianceUplinksSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceUplinksSettings)(nil)).Elem()
}

func (i ApplianceUplinksSettingsArray) ToApplianceUplinksSettingsArrayOutput() ApplianceUplinksSettingsArrayOutput {
	return i.ToApplianceUplinksSettingsArrayOutputWithContext(context.Background())
}

func (i ApplianceUplinksSettingsArray) ToApplianceUplinksSettingsArrayOutputWithContext(ctx context.Context) ApplianceUplinksSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceUplinksSettingsArrayOutput)
}

// ApplianceUplinksSettingsMapInput is an input type that accepts ApplianceUplinksSettingsMap and ApplianceUplinksSettingsMapOutput values.
// You can construct a concrete instance of `ApplianceUplinksSettingsMapInput` via:
//
//	ApplianceUplinksSettingsMap{ "key": ApplianceUplinksSettingsArgs{...} }
type ApplianceUplinksSettingsMapInput interface {
	pulumi.Input

	ToApplianceUplinksSettingsMapOutput() ApplianceUplinksSettingsMapOutput
	ToApplianceUplinksSettingsMapOutputWithContext(context.Context) ApplianceUplinksSettingsMapOutput
}

type ApplianceUplinksSettingsMap map[string]ApplianceUplinksSettingsInput

func (ApplianceUplinksSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceUplinksSettings)(nil)).Elem()
}

func (i ApplianceUplinksSettingsMap) ToApplianceUplinksSettingsMapOutput() ApplianceUplinksSettingsMapOutput {
	return i.ToApplianceUplinksSettingsMapOutputWithContext(context.Background())
}

func (i ApplianceUplinksSettingsMap) ToApplianceUplinksSettingsMapOutputWithContext(ctx context.Context) ApplianceUplinksSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceUplinksSettingsMapOutput)
}

type ApplianceUplinksSettingsOutput struct{ *pulumi.OutputState }

func (ApplianceUplinksSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceUplinksSettings)(nil)).Elem()
}

func (o ApplianceUplinksSettingsOutput) ToApplianceUplinksSettingsOutput() ApplianceUplinksSettingsOutput {
	return o
}

func (o ApplianceUplinksSettingsOutput) ToApplianceUplinksSettingsOutputWithContext(ctx context.Context) ApplianceUplinksSettingsOutput {
	return o
}

// Interface settings.
func (o ApplianceUplinksSettingsOutput) Interfaces() ApplianceUplinksSettingsInterfacesOutput {
	return o.ApplyT(func(v *ApplianceUplinksSettings) ApplianceUplinksSettingsInterfacesOutput { return v.Interfaces }).(ApplianceUplinksSettingsInterfacesOutput)
}

// serial path parameter.
func (o ApplianceUplinksSettingsOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceUplinksSettings) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

type ApplianceUplinksSettingsArrayOutput struct{ *pulumi.OutputState }

func (ApplianceUplinksSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceUplinksSettings)(nil)).Elem()
}

func (o ApplianceUplinksSettingsArrayOutput) ToApplianceUplinksSettingsArrayOutput() ApplianceUplinksSettingsArrayOutput {
	return o
}

func (o ApplianceUplinksSettingsArrayOutput) ToApplianceUplinksSettingsArrayOutputWithContext(ctx context.Context) ApplianceUplinksSettingsArrayOutput {
	return o
}

func (o ApplianceUplinksSettingsArrayOutput) Index(i pulumi.IntInput) ApplianceUplinksSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplianceUplinksSettings {
		return vs[0].([]*ApplianceUplinksSettings)[vs[1].(int)]
	}).(ApplianceUplinksSettingsOutput)
}

type ApplianceUplinksSettingsMapOutput struct{ *pulumi.OutputState }

func (ApplianceUplinksSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceUplinksSettings)(nil)).Elem()
}

func (o ApplianceUplinksSettingsMapOutput) ToApplianceUplinksSettingsMapOutput() ApplianceUplinksSettingsMapOutput {
	return o
}

func (o ApplianceUplinksSettingsMapOutput) ToApplianceUplinksSettingsMapOutputWithContext(ctx context.Context) ApplianceUplinksSettingsMapOutput {
	return o
}

func (o ApplianceUplinksSettingsMapOutput) MapIndex(k pulumi.StringInput) ApplianceUplinksSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplianceUplinksSettings {
		return vs[0].(map[string]*ApplianceUplinksSettings)[vs[1].(string)]
	}).(ApplianceUplinksSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceUplinksSettingsInput)(nil)).Elem(), &ApplianceUplinksSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceUplinksSettingsArrayInput)(nil)).Elem(), ApplianceUplinksSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceUplinksSettingsMapInput)(nil)).Elem(), ApplianceUplinksSettingsMap{})
	pulumi.RegisterOutputType(ApplianceUplinksSettingsOutput{})
	pulumi.RegisterOutputType(ApplianceUplinksSettingsArrayOutput{})
	pulumi.RegisterOutputType(ApplianceUplinksSettingsMapOutput{})
}
