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
// ## Import
//
// ```sh
// $ pulumi import meraki:organizations/applianceSecurityIntrusion:ApplianceSecurityIntrusion example "organization_id"
// ```
type ApplianceSecurityIntrusion struct {
	pulumi.CustomResourceState

	// Sets a list of specific SNORT signatures to allow
	AllowedRules ApplianceSecurityIntrusionAllowedRuleArrayOutput `pulumi:"allowedRules"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
}

// NewApplianceSecurityIntrusion registers a new resource with the given unique name, arguments, and options.
func NewApplianceSecurityIntrusion(ctx *pulumi.Context,
	name string, args *ApplianceSecurityIntrusionArgs, opts ...pulumi.ResourceOption) (*ApplianceSecurityIntrusion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplianceSecurityIntrusion
	err := ctx.RegisterResource("meraki:organizations/applianceSecurityIntrusion:ApplianceSecurityIntrusion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplianceSecurityIntrusion gets an existing ApplianceSecurityIntrusion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplianceSecurityIntrusion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplianceSecurityIntrusionState, opts ...pulumi.ResourceOption) (*ApplianceSecurityIntrusion, error) {
	var resource ApplianceSecurityIntrusion
	err := ctx.ReadResource("meraki:organizations/applianceSecurityIntrusion:ApplianceSecurityIntrusion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplianceSecurityIntrusion resources.
type applianceSecurityIntrusionState struct {
	// Sets a list of specific SNORT signatures to allow
	AllowedRules []ApplianceSecurityIntrusionAllowedRule `pulumi:"allowedRules"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
}

type ApplianceSecurityIntrusionState struct {
	// Sets a list of specific SNORT signatures to allow
	AllowedRules ApplianceSecurityIntrusionAllowedRuleArrayInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
}

func (ApplianceSecurityIntrusionState) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceSecurityIntrusionState)(nil)).Elem()
}

type applianceSecurityIntrusionArgs struct {
	// Sets a list of specific SNORT signatures to allow
	AllowedRules []ApplianceSecurityIntrusionAllowedRule `pulumi:"allowedRules"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

// The set of arguments for constructing a ApplianceSecurityIntrusion resource.
type ApplianceSecurityIntrusionArgs struct {
	// Sets a list of specific SNORT signatures to allow
	AllowedRules ApplianceSecurityIntrusionAllowedRuleArrayInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
}

func (ApplianceSecurityIntrusionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceSecurityIntrusionArgs)(nil)).Elem()
}

type ApplianceSecurityIntrusionInput interface {
	pulumi.Input

	ToApplianceSecurityIntrusionOutput() ApplianceSecurityIntrusionOutput
	ToApplianceSecurityIntrusionOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionOutput
}

func (*ApplianceSecurityIntrusion) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceSecurityIntrusion)(nil)).Elem()
}

func (i *ApplianceSecurityIntrusion) ToApplianceSecurityIntrusionOutput() ApplianceSecurityIntrusionOutput {
	return i.ToApplianceSecurityIntrusionOutputWithContext(context.Background())
}

func (i *ApplianceSecurityIntrusion) ToApplianceSecurityIntrusionOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceSecurityIntrusionOutput)
}

// ApplianceSecurityIntrusionArrayInput is an input type that accepts ApplianceSecurityIntrusionArray and ApplianceSecurityIntrusionArrayOutput values.
// You can construct a concrete instance of `ApplianceSecurityIntrusionArrayInput` via:
//
//	ApplianceSecurityIntrusionArray{ ApplianceSecurityIntrusionArgs{...} }
type ApplianceSecurityIntrusionArrayInput interface {
	pulumi.Input

	ToApplianceSecurityIntrusionArrayOutput() ApplianceSecurityIntrusionArrayOutput
	ToApplianceSecurityIntrusionArrayOutputWithContext(context.Context) ApplianceSecurityIntrusionArrayOutput
}

type ApplianceSecurityIntrusionArray []ApplianceSecurityIntrusionInput

func (ApplianceSecurityIntrusionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceSecurityIntrusion)(nil)).Elem()
}

func (i ApplianceSecurityIntrusionArray) ToApplianceSecurityIntrusionArrayOutput() ApplianceSecurityIntrusionArrayOutput {
	return i.ToApplianceSecurityIntrusionArrayOutputWithContext(context.Background())
}

func (i ApplianceSecurityIntrusionArray) ToApplianceSecurityIntrusionArrayOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceSecurityIntrusionArrayOutput)
}

// ApplianceSecurityIntrusionMapInput is an input type that accepts ApplianceSecurityIntrusionMap and ApplianceSecurityIntrusionMapOutput values.
// You can construct a concrete instance of `ApplianceSecurityIntrusionMapInput` via:
//
//	ApplianceSecurityIntrusionMap{ "key": ApplianceSecurityIntrusionArgs{...} }
type ApplianceSecurityIntrusionMapInput interface {
	pulumi.Input

	ToApplianceSecurityIntrusionMapOutput() ApplianceSecurityIntrusionMapOutput
	ToApplianceSecurityIntrusionMapOutputWithContext(context.Context) ApplianceSecurityIntrusionMapOutput
}

type ApplianceSecurityIntrusionMap map[string]ApplianceSecurityIntrusionInput

func (ApplianceSecurityIntrusionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceSecurityIntrusion)(nil)).Elem()
}

func (i ApplianceSecurityIntrusionMap) ToApplianceSecurityIntrusionMapOutput() ApplianceSecurityIntrusionMapOutput {
	return i.ToApplianceSecurityIntrusionMapOutputWithContext(context.Background())
}

func (i ApplianceSecurityIntrusionMap) ToApplianceSecurityIntrusionMapOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceSecurityIntrusionMapOutput)
}

type ApplianceSecurityIntrusionOutput struct{ *pulumi.OutputState }

func (ApplianceSecurityIntrusionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceSecurityIntrusion)(nil)).Elem()
}

func (o ApplianceSecurityIntrusionOutput) ToApplianceSecurityIntrusionOutput() ApplianceSecurityIntrusionOutput {
	return o
}

func (o ApplianceSecurityIntrusionOutput) ToApplianceSecurityIntrusionOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionOutput {
	return o
}

// Sets a list of specific SNORT signatures to allow
func (o ApplianceSecurityIntrusionOutput) AllowedRules() ApplianceSecurityIntrusionAllowedRuleArrayOutput {
	return o.ApplyT(func(v *ApplianceSecurityIntrusion) ApplianceSecurityIntrusionAllowedRuleArrayOutput {
		return v.AllowedRules
	}).(ApplianceSecurityIntrusionAllowedRuleArrayOutput)
}

// organizationId path parameter. Organization ID
func (o ApplianceSecurityIntrusionOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceSecurityIntrusion) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

type ApplianceSecurityIntrusionArrayOutput struct{ *pulumi.OutputState }

func (ApplianceSecurityIntrusionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceSecurityIntrusion)(nil)).Elem()
}

func (o ApplianceSecurityIntrusionArrayOutput) ToApplianceSecurityIntrusionArrayOutput() ApplianceSecurityIntrusionArrayOutput {
	return o
}

func (o ApplianceSecurityIntrusionArrayOutput) ToApplianceSecurityIntrusionArrayOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionArrayOutput {
	return o
}

func (o ApplianceSecurityIntrusionArrayOutput) Index(i pulumi.IntInput) ApplianceSecurityIntrusionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplianceSecurityIntrusion {
		return vs[0].([]*ApplianceSecurityIntrusion)[vs[1].(int)]
	}).(ApplianceSecurityIntrusionOutput)
}

type ApplianceSecurityIntrusionMapOutput struct{ *pulumi.OutputState }

func (ApplianceSecurityIntrusionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceSecurityIntrusion)(nil)).Elem()
}

func (o ApplianceSecurityIntrusionMapOutput) ToApplianceSecurityIntrusionMapOutput() ApplianceSecurityIntrusionMapOutput {
	return o
}

func (o ApplianceSecurityIntrusionMapOutput) ToApplianceSecurityIntrusionMapOutputWithContext(ctx context.Context) ApplianceSecurityIntrusionMapOutput {
	return o
}

func (o ApplianceSecurityIntrusionMapOutput) MapIndex(k pulumi.StringInput) ApplianceSecurityIntrusionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplianceSecurityIntrusion {
		return vs[0].(map[string]*ApplianceSecurityIntrusion)[vs[1].(string)]
	}).(ApplianceSecurityIntrusionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceSecurityIntrusionInput)(nil)).Elem(), &ApplianceSecurityIntrusion{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceSecurityIntrusionArrayInput)(nil)).Elem(), ApplianceSecurityIntrusionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceSecurityIntrusionMapInput)(nil)).Elem(), ApplianceSecurityIntrusionMap{})
	pulumi.RegisterOutputType(ApplianceSecurityIntrusionOutput{})
	pulumi.RegisterOutputType(ApplianceSecurityIntrusionArrayOutput{})
	pulumi.RegisterOutputType(ApplianceSecurityIntrusionMapOutput{})
}