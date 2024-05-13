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
// $ pulumi import meraki:networks/alertsSettings:AlertsSettings example "network_id"
// ```
type AlertsSettings struct {
	pulumi.CustomResourceState

	// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
	Alerts AlertsSettingsAlertArrayOutput `pulumi:"alerts"`
	// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
	AlertsResponses AlertsSettingsAlertsResponseArrayOutput `pulumi:"alertsResponses"`
	// The network-wide destinations for all alerts on the network.
	DefaultDestinations AlertsSettingsDefaultDestinationsOutput `pulumi:"defaultDestinations"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
}

// NewAlertsSettings registers a new resource with the given unique name, arguments, and options.
func NewAlertsSettings(ctx *pulumi.Context,
	name string, args *AlertsSettingsArgs, opts ...pulumi.ResourceOption) (*AlertsSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AlertsSettings
	err := ctx.RegisterResource("meraki:networks/alertsSettings:AlertsSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertsSettings gets an existing AlertsSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertsSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertsSettingsState, opts ...pulumi.ResourceOption) (*AlertsSettings, error) {
	var resource AlertsSettings
	err := ctx.ReadResource("meraki:networks/alertsSettings:AlertsSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertsSettings resources.
type alertsSettingsState struct {
	// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
	Alerts []AlertsSettingsAlert `pulumi:"alerts"`
	// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
	AlertsResponses []AlertsSettingsAlertsResponse `pulumi:"alertsResponses"`
	// The network-wide destinations for all alerts on the network.
	DefaultDestinations *AlertsSettingsDefaultDestinations `pulumi:"defaultDestinations"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
}

type AlertsSettingsState struct {
	// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
	Alerts AlertsSettingsAlertArrayInput
	// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
	AlertsResponses AlertsSettingsAlertsResponseArrayInput
	// The network-wide destinations for all alerts on the network.
	DefaultDestinations AlertsSettingsDefaultDestinationsPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
}

func (AlertsSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertsSettingsState)(nil)).Elem()
}

type alertsSettingsArgs struct {
	// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
	Alerts []AlertsSettingsAlert `pulumi:"alerts"`
	// The network-wide destinations for all alerts on the network.
	DefaultDestinations *AlertsSettingsDefaultDestinations `pulumi:"defaultDestinations"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// The set of arguments for constructing a AlertsSettings resource.
type AlertsSettingsArgs struct {
	// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
	Alerts AlertsSettingsAlertArrayInput
	// The network-wide destinations for all alerts on the network.
	DefaultDestinations AlertsSettingsDefaultDestinationsPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
}

func (AlertsSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertsSettingsArgs)(nil)).Elem()
}

type AlertsSettingsInput interface {
	pulumi.Input

	ToAlertsSettingsOutput() AlertsSettingsOutput
	ToAlertsSettingsOutputWithContext(ctx context.Context) AlertsSettingsOutput
}

func (*AlertsSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertsSettings)(nil)).Elem()
}

func (i *AlertsSettings) ToAlertsSettingsOutput() AlertsSettingsOutput {
	return i.ToAlertsSettingsOutputWithContext(context.Background())
}

func (i *AlertsSettings) ToAlertsSettingsOutputWithContext(ctx context.Context) AlertsSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertsSettingsOutput)
}

// AlertsSettingsArrayInput is an input type that accepts AlertsSettingsArray and AlertsSettingsArrayOutput values.
// You can construct a concrete instance of `AlertsSettingsArrayInput` via:
//
//	AlertsSettingsArray{ AlertsSettingsArgs{...} }
type AlertsSettingsArrayInput interface {
	pulumi.Input

	ToAlertsSettingsArrayOutput() AlertsSettingsArrayOutput
	ToAlertsSettingsArrayOutputWithContext(context.Context) AlertsSettingsArrayOutput
}

type AlertsSettingsArray []AlertsSettingsInput

func (AlertsSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertsSettings)(nil)).Elem()
}

func (i AlertsSettingsArray) ToAlertsSettingsArrayOutput() AlertsSettingsArrayOutput {
	return i.ToAlertsSettingsArrayOutputWithContext(context.Background())
}

func (i AlertsSettingsArray) ToAlertsSettingsArrayOutputWithContext(ctx context.Context) AlertsSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertsSettingsArrayOutput)
}

// AlertsSettingsMapInput is an input type that accepts AlertsSettingsMap and AlertsSettingsMapOutput values.
// You can construct a concrete instance of `AlertsSettingsMapInput` via:
//
//	AlertsSettingsMap{ "key": AlertsSettingsArgs{...} }
type AlertsSettingsMapInput interface {
	pulumi.Input

	ToAlertsSettingsMapOutput() AlertsSettingsMapOutput
	ToAlertsSettingsMapOutputWithContext(context.Context) AlertsSettingsMapOutput
}

type AlertsSettingsMap map[string]AlertsSettingsInput

func (AlertsSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertsSettings)(nil)).Elem()
}

func (i AlertsSettingsMap) ToAlertsSettingsMapOutput() AlertsSettingsMapOutput {
	return i.ToAlertsSettingsMapOutputWithContext(context.Background())
}

func (i AlertsSettingsMap) ToAlertsSettingsMapOutputWithContext(ctx context.Context) AlertsSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertsSettingsMapOutput)
}

type AlertsSettingsOutput struct{ *pulumi.OutputState }

func (AlertsSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertsSettings)(nil)).Elem()
}

func (o AlertsSettingsOutput) ToAlertsSettingsOutput() AlertsSettingsOutput {
	return o
}

func (o AlertsSettingsOutput) ToAlertsSettingsOutputWithContext(ctx context.Context) AlertsSettingsOutput {
	return o
}

// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
func (o AlertsSettingsOutput) Alerts() AlertsSettingsAlertArrayOutput {
	return o.ApplyT(func(v *AlertsSettings) AlertsSettingsAlertArrayOutput { return v.Alerts }).(AlertsSettingsAlertArrayOutput)
}

// Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
func (o AlertsSettingsOutput) AlertsResponses() AlertsSettingsAlertsResponseArrayOutput {
	return o.ApplyT(func(v *AlertsSettings) AlertsSettingsAlertsResponseArrayOutput { return v.AlertsResponses }).(AlertsSettingsAlertsResponseArrayOutput)
}

// The network-wide destinations for all alerts on the network.
func (o AlertsSettingsOutput) DefaultDestinations() AlertsSettingsDefaultDestinationsOutput {
	return o.ApplyT(func(v *AlertsSettings) AlertsSettingsDefaultDestinationsOutput { return v.DefaultDestinations }).(AlertsSettingsDefaultDestinationsOutput)
}

// networkId path parameter. Network ID
func (o AlertsSettingsOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertsSettings) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

type AlertsSettingsArrayOutput struct{ *pulumi.OutputState }

func (AlertsSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertsSettings)(nil)).Elem()
}

func (o AlertsSettingsArrayOutput) ToAlertsSettingsArrayOutput() AlertsSettingsArrayOutput {
	return o
}

func (o AlertsSettingsArrayOutput) ToAlertsSettingsArrayOutputWithContext(ctx context.Context) AlertsSettingsArrayOutput {
	return o
}

func (o AlertsSettingsArrayOutput) Index(i pulumi.IntInput) AlertsSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AlertsSettings {
		return vs[0].([]*AlertsSettings)[vs[1].(int)]
	}).(AlertsSettingsOutput)
}

type AlertsSettingsMapOutput struct{ *pulumi.OutputState }

func (AlertsSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertsSettings)(nil)).Elem()
}

func (o AlertsSettingsMapOutput) ToAlertsSettingsMapOutput() AlertsSettingsMapOutput {
	return o
}

func (o AlertsSettingsMapOutput) ToAlertsSettingsMapOutputWithContext(ctx context.Context) AlertsSettingsMapOutput {
	return o
}

func (o AlertsSettingsMapOutput) MapIndex(k pulumi.StringInput) AlertsSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AlertsSettings {
		return vs[0].(map[string]*AlertsSettings)[vs[1].(string)]
	}).(AlertsSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlertsSettingsInput)(nil)).Elem(), &AlertsSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertsSettingsArrayInput)(nil)).Elem(), AlertsSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertsSettingsMapInput)(nil)).Elem(), AlertsSettingsMap{})
	pulumi.RegisterOutputType(AlertsSettingsOutput{})
	pulumi.RegisterOutputType(AlertsSettingsArrayOutput{})
	pulumi.RegisterOutputType(AlertsSettingsMapOutput{})
}