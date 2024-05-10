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

// ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
// already existed previously.
//
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/applianceRadioSettings:ApplianceRadioSettings example "serial"
// ```
type ApplianceRadioSettings struct {
	pulumi.CustomResourceState

	// Manual radio settings for 5 GHz
	FiveGhzSettings ApplianceRadioSettingsFiveGhzSettingsOutput `pulumi:"fiveGhzSettings"`
	// RF Profile ID
	RfProfileId pulumi.StringOutput `pulumi:"rfProfileId"`
	// The device serial
	Serial pulumi.StringOutput `pulumi:"serial"`
	// Manual radio settings for 2.4 GHz
	TwoFourGhzSettings ApplianceRadioSettingsTwoFourGhzSettingsOutput `pulumi:"twoFourGhzSettings"`
}

// NewApplianceRadioSettings registers a new resource with the given unique name, arguments, and options.
func NewApplianceRadioSettings(ctx *pulumi.Context,
	name string, args *ApplianceRadioSettingsArgs, opts ...pulumi.ResourceOption) (*ApplianceRadioSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplianceRadioSettings
	err := ctx.RegisterResource("meraki:devices/applianceRadioSettings:ApplianceRadioSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplianceRadioSettings gets an existing ApplianceRadioSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplianceRadioSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplianceRadioSettingsState, opts ...pulumi.ResourceOption) (*ApplianceRadioSettings, error) {
	var resource ApplianceRadioSettings
	err := ctx.ReadResource("meraki:devices/applianceRadioSettings:ApplianceRadioSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplianceRadioSettings resources.
type applianceRadioSettingsState struct {
	// Manual radio settings for 5 GHz
	FiveGhzSettings *ApplianceRadioSettingsFiveGhzSettings `pulumi:"fiveGhzSettings"`
	// RF Profile ID
	RfProfileId *string `pulumi:"rfProfileId"`
	// The device serial
	Serial *string `pulumi:"serial"`
	// Manual radio settings for 2.4 GHz
	TwoFourGhzSettings *ApplianceRadioSettingsTwoFourGhzSettings `pulumi:"twoFourGhzSettings"`
}

type ApplianceRadioSettingsState struct {
	// Manual radio settings for 5 GHz
	FiveGhzSettings ApplianceRadioSettingsFiveGhzSettingsPtrInput
	// RF Profile ID
	RfProfileId pulumi.StringPtrInput
	// The device serial
	Serial pulumi.StringPtrInput
	// Manual radio settings for 2.4 GHz
	TwoFourGhzSettings ApplianceRadioSettingsTwoFourGhzSettingsPtrInput
}

func (ApplianceRadioSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceRadioSettingsState)(nil)).Elem()
}

type applianceRadioSettingsArgs struct {
	// Manual radio settings for 5 GHz
	FiveGhzSettings *ApplianceRadioSettingsFiveGhzSettings `pulumi:"fiveGhzSettings"`
	// RF Profile ID
	RfProfileId *string `pulumi:"rfProfileId"`
	// The device serial
	Serial string `pulumi:"serial"`
	// Manual radio settings for 2.4 GHz
	TwoFourGhzSettings *ApplianceRadioSettingsTwoFourGhzSettings `pulumi:"twoFourGhzSettings"`
}

// The set of arguments for constructing a ApplianceRadioSettings resource.
type ApplianceRadioSettingsArgs struct {
	// Manual radio settings for 5 GHz
	FiveGhzSettings ApplianceRadioSettingsFiveGhzSettingsPtrInput
	// RF Profile ID
	RfProfileId pulumi.StringPtrInput
	// The device serial
	Serial pulumi.StringInput
	// Manual radio settings for 2.4 GHz
	TwoFourGhzSettings ApplianceRadioSettingsTwoFourGhzSettingsPtrInput
}

func (ApplianceRadioSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceRadioSettingsArgs)(nil)).Elem()
}

type ApplianceRadioSettingsInput interface {
	pulumi.Input

	ToApplianceRadioSettingsOutput() ApplianceRadioSettingsOutput
	ToApplianceRadioSettingsOutputWithContext(ctx context.Context) ApplianceRadioSettingsOutput
}

func (*ApplianceRadioSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceRadioSettings)(nil)).Elem()
}

func (i *ApplianceRadioSettings) ToApplianceRadioSettingsOutput() ApplianceRadioSettingsOutput {
	return i.ToApplianceRadioSettingsOutputWithContext(context.Background())
}

func (i *ApplianceRadioSettings) ToApplianceRadioSettingsOutputWithContext(ctx context.Context) ApplianceRadioSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceRadioSettingsOutput)
}

// ApplianceRadioSettingsArrayInput is an input type that accepts ApplianceRadioSettingsArray and ApplianceRadioSettingsArrayOutput values.
// You can construct a concrete instance of `ApplianceRadioSettingsArrayInput` via:
//
//	ApplianceRadioSettingsArray{ ApplianceRadioSettingsArgs{...} }
type ApplianceRadioSettingsArrayInput interface {
	pulumi.Input

	ToApplianceRadioSettingsArrayOutput() ApplianceRadioSettingsArrayOutput
	ToApplianceRadioSettingsArrayOutputWithContext(context.Context) ApplianceRadioSettingsArrayOutput
}

type ApplianceRadioSettingsArray []ApplianceRadioSettingsInput

func (ApplianceRadioSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceRadioSettings)(nil)).Elem()
}

func (i ApplianceRadioSettingsArray) ToApplianceRadioSettingsArrayOutput() ApplianceRadioSettingsArrayOutput {
	return i.ToApplianceRadioSettingsArrayOutputWithContext(context.Background())
}

func (i ApplianceRadioSettingsArray) ToApplianceRadioSettingsArrayOutputWithContext(ctx context.Context) ApplianceRadioSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceRadioSettingsArrayOutput)
}

// ApplianceRadioSettingsMapInput is an input type that accepts ApplianceRadioSettingsMap and ApplianceRadioSettingsMapOutput values.
// You can construct a concrete instance of `ApplianceRadioSettingsMapInput` via:
//
//	ApplianceRadioSettingsMap{ "key": ApplianceRadioSettingsArgs{...} }
type ApplianceRadioSettingsMapInput interface {
	pulumi.Input

	ToApplianceRadioSettingsMapOutput() ApplianceRadioSettingsMapOutput
	ToApplianceRadioSettingsMapOutputWithContext(context.Context) ApplianceRadioSettingsMapOutput
}

type ApplianceRadioSettingsMap map[string]ApplianceRadioSettingsInput

func (ApplianceRadioSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceRadioSettings)(nil)).Elem()
}

func (i ApplianceRadioSettingsMap) ToApplianceRadioSettingsMapOutput() ApplianceRadioSettingsMapOutput {
	return i.ToApplianceRadioSettingsMapOutputWithContext(context.Background())
}

func (i ApplianceRadioSettingsMap) ToApplianceRadioSettingsMapOutputWithContext(ctx context.Context) ApplianceRadioSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceRadioSettingsMapOutput)
}

type ApplianceRadioSettingsOutput struct{ *pulumi.OutputState }

func (ApplianceRadioSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceRadioSettings)(nil)).Elem()
}

func (o ApplianceRadioSettingsOutput) ToApplianceRadioSettingsOutput() ApplianceRadioSettingsOutput {
	return o
}

func (o ApplianceRadioSettingsOutput) ToApplianceRadioSettingsOutputWithContext(ctx context.Context) ApplianceRadioSettingsOutput {
	return o
}

// Manual radio settings for 5 GHz
func (o ApplianceRadioSettingsOutput) FiveGhzSettings() ApplianceRadioSettingsFiveGhzSettingsOutput {
	return o.ApplyT(func(v *ApplianceRadioSettings) ApplianceRadioSettingsFiveGhzSettingsOutput { return v.FiveGhzSettings }).(ApplianceRadioSettingsFiveGhzSettingsOutput)
}

// RF Profile ID
func (o ApplianceRadioSettingsOutput) RfProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceRadioSettings) pulumi.StringOutput { return v.RfProfileId }).(pulumi.StringOutput)
}

// The device serial
func (o ApplianceRadioSettingsOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceRadioSettings) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

// Manual radio settings for 2.4 GHz
func (o ApplianceRadioSettingsOutput) TwoFourGhzSettings() ApplianceRadioSettingsTwoFourGhzSettingsOutput {
	return o.ApplyT(func(v *ApplianceRadioSettings) ApplianceRadioSettingsTwoFourGhzSettingsOutput {
		return v.TwoFourGhzSettings
	}).(ApplianceRadioSettingsTwoFourGhzSettingsOutput)
}

type ApplianceRadioSettingsArrayOutput struct{ *pulumi.OutputState }

func (ApplianceRadioSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceRadioSettings)(nil)).Elem()
}

func (o ApplianceRadioSettingsArrayOutput) ToApplianceRadioSettingsArrayOutput() ApplianceRadioSettingsArrayOutput {
	return o
}

func (o ApplianceRadioSettingsArrayOutput) ToApplianceRadioSettingsArrayOutputWithContext(ctx context.Context) ApplianceRadioSettingsArrayOutput {
	return o
}

func (o ApplianceRadioSettingsArrayOutput) Index(i pulumi.IntInput) ApplianceRadioSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplianceRadioSettings {
		return vs[0].([]*ApplianceRadioSettings)[vs[1].(int)]
	}).(ApplianceRadioSettingsOutput)
}

type ApplianceRadioSettingsMapOutput struct{ *pulumi.OutputState }

func (ApplianceRadioSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceRadioSettings)(nil)).Elem()
}

func (o ApplianceRadioSettingsMapOutput) ToApplianceRadioSettingsMapOutput() ApplianceRadioSettingsMapOutput {
	return o
}

func (o ApplianceRadioSettingsMapOutput) ToApplianceRadioSettingsMapOutputWithContext(ctx context.Context) ApplianceRadioSettingsMapOutput {
	return o
}

func (o ApplianceRadioSettingsMapOutput) MapIndex(k pulumi.StringInput) ApplianceRadioSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplianceRadioSettings {
		return vs[0].(map[string]*ApplianceRadioSettings)[vs[1].(string)]
	}).(ApplianceRadioSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceRadioSettingsInput)(nil)).Elem(), &ApplianceRadioSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceRadioSettingsArrayInput)(nil)).Elem(), ApplianceRadioSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceRadioSettingsMapInput)(nil)).Elem(), ApplianceRadioSettingsMap{})
	pulumi.RegisterOutputType(ApplianceRadioSettingsOutput{})
	pulumi.RegisterOutputType(ApplianceRadioSettingsArrayOutput{})
	pulumi.RegisterOutputType(ApplianceRadioSettingsMapOutput{})
}
