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
//			example, err := organizations.NewAdaptivePolicySettings(ctx, "example", &organizations.AdaptivePolicySettingsArgs{
//				EnabledNetworks: pulumi.StringArray{
//					pulumi.String("L_11111111"),
//					pulumi.String("L_22222222"),
//					pulumi.String("N_33333333"),
//					pulumi.String("L_44444444"),
//				},
//				OrganizationId: pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsAdaptivePolicySettingsExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:organizations/adaptivePolicySettings:AdaptivePolicySettings example "organization_id"
// ```
type AdaptivePolicySettings struct {
	pulumi.CustomResourceState

	// List of network IDs with adaptive policy enabled
	EnabledNetworks pulumi.StringArrayOutput `pulumi:"enabledNetworks"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
}

// NewAdaptivePolicySettings registers a new resource with the given unique name, arguments, and options.
func NewAdaptivePolicySettings(ctx *pulumi.Context,
	name string, args *AdaptivePolicySettingsArgs, opts ...pulumi.ResourceOption) (*AdaptivePolicySettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AdaptivePolicySettings
	err := ctx.RegisterResource("meraki:organizations/adaptivePolicySettings:AdaptivePolicySettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAdaptivePolicySettings gets an existing AdaptivePolicySettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAdaptivePolicySettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AdaptivePolicySettingsState, opts ...pulumi.ResourceOption) (*AdaptivePolicySettings, error) {
	var resource AdaptivePolicySettings
	err := ctx.ReadResource("meraki:organizations/adaptivePolicySettings:AdaptivePolicySettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AdaptivePolicySettings resources.
type adaptivePolicySettingsState struct {
	// List of network IDs with adaptive policy enabled
	EnabledNetworks []string `pulumi:"enabledNetworks"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
}

type AdaptivePolicySettingsState struct {
	// List of network IDs with adaptive policy enabled
	EnabledNetworks pulumi.StringArrayInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
}

func (AdaptivePolicySettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*adaptivePolicySettingsState)(nil)).Elem()
}

type adaptivePolicySettingsArgs struct {
	// List of network IDs with adaptive policy enabled
	EnabledNetworks []string `pulumi:"enabledNetworks"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

// The set of arguments for constructing a AdaptivePolicySettings resource.
type AdaptivePolicySettingsArgs struct {
	// List of network IDs with adaptive policy enabled
	EnabledNetworks pulumi.StringArrayInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
}

func (AdaptivePolicySettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*adaptivePolicySettingsArgs)(nil)).Elem()
}

type AdaptivePolicySettingsInput interface {
	pulumi.Input

	ToAdaptivePolicySettingsOutput() AdaptivePolicySettingsOutput
	ToAdaptivePolicySettingsOutputWithContext(ctx context.Context) AdaptivePolicySettingsOutput
}

func (*AdaptivePolicySettings) ElementType() reflect.Type {
	return reflect.TypeOf((**AdaptivePolicySettings)(nil)).Elem()
}

func (i *AdaptivePolicySettings) ToAdaptivePolicySettingsOutput() AdaptivePolicySettingsOutput {
	return i.ToAdaptivePolicySettingsOutputWithContext(context.Background())
}

func (i *AdaptivePolicySettings) ToAdaptivePolicySettingsOutputWithContext(ctx context.Context) AdaptivePolicySettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdaptivePolicySettingsOutput)
}

// AdaptivePolicySettingsArrayInput is an input type that accepts AdaptivePolicySettingsArray and AdaptivePolicySettingsArrayOutput values.
// You can construct a concrete instance of `AdaptivePolicySettingsArrayInput` via:
//
//	AdaptivePolicySettingsArray{ AdaptivePolicySettingsArgs{...} }
type AdaptivePolicySettingsArrayInput interface {
	pulumi.Input

	ToAdaptivePolicySettingsArrayOutput() AdaptivePolicySettingsArrayOutput
	ToAdaptivePolicySettingsArrayOutputWithContext(context.Context) AdaptivePolicySettingsArrayOutput
}

type AdaptivePolicySettingsArray []AdaptivePolicySettingsInput

func (AdaptivePolicySettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AdaptivePolicySettings)(nil)).Elem()
}

func (i AdaptivePolicySettingsArray) ToAdaptivePolicySettingsArrayOutput() AdaptivePolicySettingsArrayOutput {
	return i.ToAdaptivePolicySettingsArrayOutputWithContext(context.Background())
}

func (i AdaptivePolicySettingsArray) ToAdaptivePolicySettingsArrayOutputWithContext(ctx context.Context) AdaptivePolicySettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdaptivePolicySettingsArrayOutput)
}

// AdaptivePolicySettingsMapInput is an input type that accepts AdaptivePolicySettingsMap and AdaptivePolicySettingsMapOutput values.
// You can construct a concrete instance of `AdaptivePolicySettingsMapInput` via:
//
//	AdaptivePolicySettingsMap{ "key": AdaptivePolicySettingsArgs{...} }
type AdaptivePolicySettingsMapInput interface {
	pulumi.Input

	ToAdaptivePolicySettingsMapOutput() AdaptivePolicySettingsMapOutput
	ToAdaptivePolicySettingsMapOutputWithContext(context.Context) AdaptivePolicySettingsMapOutput
}

type AdaptivePolicySettingsMap map[string]AdaptivePolicySettingsInput

func (AdaptivePolicySettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AdaptivePolicySettings)(nil)).Elem()
}

func (i AdaptivePolicySettingsMap) ToAdaptivePolicySettingsMapOutput() AdaptivePolicySettingsMapOutput {
	return i.ToAdaptivePolicySettingsMapOutputWithContext(context.Background())
}

func (i AdaptivePolicySettingsMap) ToAdaptivePolicySettingsMapOutputWithContext(ctx context.Context) AdaptivePolicySettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdaptivePolicySettingsMapOutput)
}

type AdaptivePolicySettingsOutput struct{ *pulumi.OutputState }

func (AdaptivePolicySettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AdaptivePolicySettings)(nil)).Elem()
}

func (o AdaptivePolicySettingsOutput) ToAdaptivePolicySettingsOutput() AdaptivePolicySettingsOutput {
	return o
}

func (o AdaptivePolicySettingsOutput) ToAdaptivePolicySettingsOutputWithContext(ctx context.Context) AdaptivePolicySettingsOutput {
	return o
}

// List of network IDs with adaptive policy enabled
func (o AdaptivePolicySettingsOutput) EnabledNetworks() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AdaptivePolicySettings) pulumi.StringArrayOutput { return v.EnabledNetworks }).(pulumi.StringArrayOutput)
}

// organizationId path parameter. Organization ID
func (o AdaptivePolicySettingsOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicySettings) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

type AdaptivePolicySettingsArrayOutput struct{ *pulumi.OutputState }

func (AdaptivePolicySettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AdaptivePolicySettings)(nil)).Elem()
}

func (o AdaptivePolicySettingsArrayOutput) ToAdaptivePolicySettingsArrayOutput() AdaptivePolicySettingsArrayOutput {
	return o
}

func (o AdaptivePolicySettingsArrayOutput) ToAdaptivePolicySettingsArrayOutputWithContext(ctx context.Context) AdaptivePolicySettingsArrayOutput {
	return o
}

func (o AdaptivePolicySettingsArrayOutput) Index(i pulumi.IntInput) AdaptivePolicySettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AdaptivePolicySettings {
		return vs[0].([]*AdaptivePolicySettings)[vs[1].(int)]
	}).(AdaptivePolicySettingsOutput)
}

type AdaptivePolicySettingsMapOutput struct{ *pulumi.OutputState }

func (AdaptivePolicySettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AdaptivePolicySettings)(nil)).Elem()
}

func (o AdaptivePolicySettingsMapOutput) ToAdaptivePolicySettingsMapOutput() AdaptivePolicySettingsMapOutput {
	return o
}

func (o AdaptivePolicySettingsMapOutput) ToAdaptivePolicySettingsMapOutputWithContext(ctx context.Context) AdaptivePolicySettingsMapOutput {
	return o
}

func (o AdaptivePolicySettingsMapOutput) MapIndex(k pulumi.StringInput) AdaptivePolicySettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AdaptivePolicySettings {
		return vs[0].(map[string]*AdaptivePolicySettings)[vs[1].(string)]
	}).(AdaptivePolicySettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AdaptivePolicySettingsInput)(nil)).Elem(), &AdaptivePolicySettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*AdaptivePolicySettingsArrayInput)(nil)).Elem(), AdaptivePolicySettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AdaptivePolicySettingsMapInput)(nil)).Elem(), AdaptivePolicySettingsMap{})
	pulumi.RegisterOutputType(AdaptivePolicySettingsOutput{})
	pulumi.RegisterOutputType(AdaptivePolicySettingsArrayOutput{})
	pulumi.RegisterOutputType(AdaptivePolicySettingsMapOutput{})
}