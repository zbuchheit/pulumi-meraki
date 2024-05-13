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
//			example, err := organizations.NewSaml(ctx, "example", &organizations.SamlArgs{
//				Enabled:        pulumi.Bool(true),
//				OrganizationId: pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsSamlExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:organizations/saml:Saml example "organization_id"
// ```
type Saml struct {
	pulumi.CustomResourceState

	// Toggle depicting if SAML SSO settings are enabled
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
}

// NewSaml registers a new resource with the given unique name, arguments, and options.
func NewSaml(ctx *pulumi.Context,
	name string, args *SamlArgs, opts ...pulumi.ResourceOption) (*Saml, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Saml
	err := ctx.RegisterResource("meraki:organizations/saml:Saml", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSaml gets an existing Saml resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSaml(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SamlState, opts ...pulumi.ResourceOption) (*Saml, error) {
	var resource Saml
	err := ctx.ReadResource("meraki:organizations/saml:Saml", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Saml resources.
type samlState struct {
	// Toggle depicting if SAML SSO settings are enabled
	Enabled *bool `pulumi:"enabled"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
}

type SamlState struct {
	// Toggle depicting if SAML SSO settings are enabled
	Enabled pulumi.BoolPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
}

func (SamlState) ElementType() reflect.Type {
	return reflect.TypeOf((*samlState)(nil)).Elem()
}

type samlArgs struct {
	// Toggle depicting if SAML SSO settings are enabled
	Enabled *bool `pulumi:"enabled"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

// The set of arguments for constructing a Saml resource.
type SamlArgs struct {
	// Toggle depicting if SAML SSO settings are enabled
	Enabled pulumi.BoolPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
}

func (SamlArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*samlArgs)(nil)).Elem()
}

type SamlInput interface {
	pulumi.Input

	ToSamlOutput() SamlOutput
	ToSamlOutputWithContext(ctx context.Context) SamlOutput
}

func (*Saml) ElementType() reflect.Type {
	return reflect.TypeOf((**Saml)(nil)).Elem()
}

func (i *Saml) ToSamlOutput() SamlOutput {
	return i.ToSamlOutputWithContext(context.Background())
}

func (i *Saml) ToSamlOutputWithContext(ctx context.Context) SamlOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlOutput)
}

// SamlArrayInput is an input type that accepts SamlArray and SamlArrayOutput values.
// You can construct a concrete instance of `SamlArrayInput` via:
//
//	SamlArray{ SamlArgs{...} }
type SamlArrayInput interface {
	pulumi.Input

	ToSamlArrayOutput() SamlArrayOutput
	ToSamlArrayOutputWithContext(context.Context) SamlArrayOutput
}

type SamlArray []SamlInput

func (SamlArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Saml)(nil)).Elem()
}

func (i SamlArray) ToSamlArrayOutput() SamlArrayOutput {
	return i.ToSamlArrayOutputWithContext(context.Background())
}

func (i SamlArray) ToSamlArrayOutputWithContext(ctx context.Context) SamlArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlArrayOutput)
}

// SamlMapInput is an input type that accepts SamlMap and SamlMapOutput values.
// You can construct a concrete instance of `SamlMapInput` via:
//
//	SamlMap{ "key": SamlArgs{...} }
type SamlMapInput interface {
	pulumi.Input

	ToSamlMapOutput() SamlMapOutput
	ToSamlMapOutputWithContext(context.Context) SamlMapOutput
}

type SamlMap map[string]SamlInput

func (SamlMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Saml)(nil)).Elem()
}

func (i SamlMap) ToSamlMapOutput() SamlMapOutput {
	return i.ToSamlMapOutputWithContext(context.Background())
}

func (i SamlMap) ToSamlMapOutputWithContext(ctx context.Context) SamlMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlMapOutput)
}

type SamlOutput struct{ *pulumi.OutputState }

func (SamlOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Saml)(nil)).Elem()
}

func (o SamlOutput) ToSamlOutput() SamlOutput {
	return o
}

func (o SamlOutput) ToSamlOutputWithContext(ctx context.Context) SamlOutput {
	return o
}

// Toggle depicting if SAML SSO settings are enabled
func (o SamlOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Saml) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// organizationId path parameter. Organization ID
func (o SamlOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *Saml) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

type SamlArrayOutput struct{ *pulumi.OutputState }

func (SamlArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Saml)(nil)).Elem()
}

func (o SamlArrayOutput) ToSamlArrayOutput() SamlArrayOutput {
	return o
}

func (o SamlArrayOutput) ToSamlArrayOutputWithContext(ctx context.Context) SamlArrayOutput {
	return o
}

func (o SamlArrayOutput) Index(i pulumi.IntInput) SamlOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Saml {
		return vs[0].([]*Saml)[vs[1].(int)]
	}).(SamlOutput)
}

type SamlMapOutput struct{ *pulumi.OutputState }

func (SamlMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Saml)(nil)).Elem()
}

func (o SamlMapOutput) ToSamlMapOutput() SamlMapOutput {
	return o
}

func (o SamlMapOutput) ToSamlMapOutputWithContext(ctx context.Context) SamlMapOutput {
	return o
}

func (o SamlMapOutput) MapIndex(k pulumi.StringInput) SamlOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Saml {
		return vs[0].(map[string]*Saml)[vs[1].(string)]
	}).(SamlOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SamlInput)(nil)).Elem(), &Saml{})
	pulumi.RegisterInputType(reflect.TypeOf((*SamlArrayInput)(nil)).Elem(), SamlArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SamlMapInput)(nil)).Elem(), SamlMap{})
	pulumi.RegisterOutputType(SamlOutput{})
	pulumi.RegisterOutputType(SamlArrayOutput{})
	pulumi.RegisterOutputType(SamlMapOutput{})
}