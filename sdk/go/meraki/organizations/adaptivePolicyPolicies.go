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
//			example, err := organizations.NewAdaptivePolicyPolicies(ctx, "example", &organizations.AdaptivePolicyPoliciesArgs{
//				Acls: organizations.AdaptivePolicyPoliciesAclArray{
//					&organizations.AdaptivePolicyPoliciesAclArgs{
//						Id:   pulumi.String("444"),
//						Name: pulumi.String("Block web"),
//					},
//				},
//				DestinationGroup: &organizations.AdaptivePolicyPoliciesDestinationGroupArgs{
//					Id:   pulumi.String("333"),
//					Name: pulumi.String("IoT Servers"),
//					Sgt:  pulumi.Int(51),
//				},
//				LastEntryRule:  pulumi.String("allow"),
//				OrganizationId: pulumi.String("string"),
//				SourceGroup: &organizations.AdaptivePolicyPoliciesSourceGroupArgs{
//					Id:   pulumi.String("222"),
//					Name: pulumi.String("IoT Devices"),
//					Sgt:  pulumi.Int(50),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsAdaptivePolicyPoliciesExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:organizations/adaptivePolicyPolicies:AdaptivePolicyPolicies example "id,organization_id"
// ```
type AdaptivePolicyPolicies struct {
	pulumi.CustomResourceState

	// An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
	Acls             AdaptivePolicyPoliciesAclArrayOutput `pulumi:"acls"`
	AdaptivePolicyId pulumi.StringOutput                  `pulumi:"adaptivePolicyId"`
	CreatedAt        pulumi.StringOutput                  `pulumi:"createdAt"`
	// The destination adaptive policy group (requires one unique attribute)
	DestinationGroup AdaptivePolicyPoliciesDestinationGroupOutput `pulumi:"destinationGroup"`
	// The rule to apply if there is no matching ACL (default: "default")
	LastEntryRule pulumi.StringOutput `pulumi:"lastEntryRule"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// The source adaptive policy group (requires one unique attribute)
	SourceGroup AdaptivePolicyPoliciesSourceGroupOutput `pulumi:"sourceGroup"`
	UpdatedAt   pulumi.StringOutput                     `pulumi:"updatedAt"`
}

// NewAdaptivePolicyPolicies registers a new resource with the given unique name, arguments, and options.
func NewAdaptivePolicyPolicies(ctx *pulumi.Context,
	name string, args *AdaptivePolicyPoliciesArgs, opts ...pulumi.ResourceOption) (*AdaptivePolicyPolicies, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AdaptivePolicyPolicies
	err := ctx.RegisterResource("meraki:organizations/adaptivePolicyPolicies:AdaptivePolicyPolicies", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAdaptivePolicyPolicies gets an existing AdaptivePolicyPolicies resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAdaptivePolicyPolicies(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AdaptivePolicyPoliciesState, opts ...pulumi.ResourceOption) (*AdaptivePolicyPolicies, error) {
	var resource AdaptivePolicyPolicies
	err := ctx.ReadResource("meraki:organizations/adaptivePolicyPolicies:AdaptivePolicyPolicies", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AdaptivePolicyPolicies resources.
type adaptivePolicyPoliciesState struct {
	// An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
	Acls             []AdaptivePolicyPoliciesAcl `pulumi:"acls"`
	AdaptivePolicyId *string                     `pulumi:"adaptivePolicyId"`
	CreatedAt        *string                     `pulumi:"createdAt"`
	// The destination adaptive policy group (requires one unique attribute)
	DestinationGroup *AdaptivePolicyPoliciesDestinationGroup `pulumi:"destinationGroup"`
	// The rule to apply if there is no matching ACL (default: "default")
	LastEntryRule *string `pulumi:"lastEntryRule"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
	// The source adaptive policy group (requires one unique attribute)
	SourceGroup *AdaptivePolicyPoliciesSourceGroup `pulumi:"sourceGroup"`
	UpdatedAt   *string                            `pulumi:"updatedAt"`
}

type AdaptivePolicyPoliciesState struct {
	// An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
	Acls             AdaptivePolicyPoliciesAclArrayInput
	AdaptivePolicyId pulumi.StringPtrInput
	CreatedAt        pulumi.StringPtrInput
	// The destination adaptive policy group (requires one unique attribute)
	DestinationGroup AdaptivePolicyPoliciesDestinationGroupPtrInput
	// The rule to apply if there is no matching ACL (default: "default")
	LastEntryRule pulumi.StringPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
	// The source adaptive policy group (requires one unique attribute)
	SourceGroup AdaptivePolicyPoliciesSourceGroupPtrInput
	UpdatedAt   pulumi.StringPtrInput
}

func (AdaptivePolicyPoliciesState) ElementType() reflect.Type {
	return reflect.TypeOf((*adaptivePolicyPoliciesState)(nil)).Elem()
}

type adaptivePolicyPoliciesArgs struct {
	// An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
	Acls []AdaptivePolicyPoliciesAcl `pulumi:"acls"`
	// The destination adaptive policy group (requires one unique attribute)
	DestinationGroup *AdaptivePolicyPoliciesDestinationGroup `pulumi:"destinationGroup"`
	// The rule to apply if there is no matching ACL (default: "default")
	LastEntryRule *string `pulumi:"lastEntryRule"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// The source adaptive policy group (requires one unique attribute)
	SourceGroup *AdaptivePolicyPoliciesSourceGroup `pulumi:"sourceGroup"`
}

// The set of arguments for constructing a AdaptivePolicyPolicies resource.
type AdaptivePolicyPoliciesArgs struct {
	// An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
	Acls AdaptivePolicyPoliciesAclArrayInput
	// The destination adaptive policy group (requires one unique attribute)
	DestinationGroup AdaptivePolicyPoliciesDestinationGroupPtrInput
	// The rule to apply if there is no matching ACL (default: "default")
	LastEntryRule pulumi.StringPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
	// The source adaptive policy group (requires one unique attribute)
	SourceGroup AdaptivePolicyPoliciesSourceGroupPtrInput
}

func (AdaptivePolicyPoliciesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*adaptivePolicyPoliciesArgs)(nil)).Elem()
}

type AdaptivePolicyPoliciesInput interface {
	pulumi.Input

	ToAdaptivePolicyPoliciesOutput() AdaptivePolicyPoliciesOutput
	ToAdaptivePolicyPoliciesOutputWithContext(ctx context.Context) AdaptivePolicyPoliciesOutput
}

func (*AdaptivePolicyPolicies) ElementType() reflect.Type {
	return reflect.TypeOf((**AdaptivePolicyPolicies)(nil)).Elem()
}

func (i *AdaptivePolicyPolicies) ToAdaptivePolicyPoliciesOutput() AdaptivePolicyPoliciesOutput {
	return i.ToAdaptivePolicyPoliciesOutputWithContext(context.Background())
}

func (i *AdaptivePolicyPolicies) ToAdaptivePolicyPoliciesOutputWithContext(ctx context.Context) AdaptivePolicyPoliciesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdaptivePolicyPoliciesOutput)
}

// AdaptivePolicyPoliciesArrayInput is an input type that accepts AdaptivePolicyPoliciesArray and AdaptivePolicyPoliciesArrayOutput values.
// You can construct a concrete instance of `AdaptivePolicyPoliciesArrayInput` via:
//
//	AdaptivePolicyPoliciesArray{ AdaptivePolicyPoliciesArgs{...} }
type AdaptivePolicyPoliciesArrayInput interface {
	pulumi.Input

	ToAdaptivePolicyPoliciesArrayOutput() AdaptivePolicyPoliciesArrayOutput
	ToAdaptivePolicyPoliciesArrayOutputWithContext(context.Context) AdaptivePolicyPoliciesArrayOutput
}

type AdaptivePolicyPoliciesArray []AdaptivePolicyPoliciesInput

func (AdaptivePolicyPoliciesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AdaptivePolicyPolicies)(nil)).Elem()
}

func (i AdaptivePolicyPoliciesArray) ToAdaptivePolicyPoliciesArrayOutput() AdaptivePolicyPoliciesArrayOutput {
	return i.ToAdaptivePolicyPoliciesArrayOutputWithContext(context.Background())
}

func (i AdaptivePolicyPoliciesArray) ToAdaptivePolicyPoliciesArrayOutputWithContext(ctx context.Context) AdaptivePolicyPoliciesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdaptivePolicyPoliciesArrayOutput)
}

// AdaptivePolicyPoliciesMapInput is an input type that accepts AdaptivePolicyPoliciesMap and AdaptivePolicyPoliciesMapOutput values.
// You can construct a concrete instance of `AdaptivePolicyPoliciesMapInput` via:
//
//	AdaptivePolicyPoliciesMap{ "key": AdaptivePolicyPoliciesArgs{...} }
type AdaptivePolicyPoliciesMapInput interface {
	pulumi.Input

	ToAdaptivePolicyPoliciesMapOutput() AdaptivePolicyPoliciesMapOutput
	ToAdaptivePolicyPoliciesMapOutputWithContext(context.Context) AdaptivePolicyPoliciesMapOutput
}

type AdaptivePolicyPoliciesMap map[string]AdaptivePolicyPoliciesInput

func (AdaptivePolicyPoliciesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AdaptivePolicyPolicies)(nil)).Elem()
}

func (i AdaptivePolicyPoliciesMap) ToAdaptivePolicyPoliciesMapOutput() AdaptivePolicyPoliciesMapOutput {
	return i.ToAdaptivePolicyPoliciesMapOutputWithContext(context.Background())
}

func (i AdaptivePolicyPoliciesMap) ToAdaptivePolicyPoliciesMapOutputWithContext(ctx context.Context) AdaptivePolicyPoliciesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdaptivePolicyPoliciesMapOutput)
}

type AdaptivePolicyPoliciesOutput struct{ *pulumi.OutputState }

func (AdaptivePolicyPoliciesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AdaptivePolicyPolicies)(nil)).Elem()
}

func (o AdaptivePolicyPoliciesOutput) ToAdaptivePolicyPoliciesOutput() AdaptivePolicyPoliciesOutput {
	return o
}

func (o AdaptivePolicyPoliciesOutput) ToAdaptivePolicyPoliciesOutputWithContext(ctx context.Context) AdaptivePolicyPoliciesOutput {
	return o
}

// An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
func (o AdaptivePolicyPoliciesOutput) Acls() AdaptivePolicyPoliciesAclArrayOutput {
	return o.ApplyT(func(v *AdaptivePolicyPolicies) AdaptivePolicyPoliciesAclArrayOutput { return v.Acls }).(AdaptivePolicyPoliciesAclArrayOutput)
}

func (o AdaptivePolicyPoliciesOutput) AdaptivePolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyPolicies) pulumi.StringOutput { return v.AdaptivePolicyId }).(pulumi.StringOutput)
}

func (o AdaptivePolicyPoliciesOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyPolicies) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The destination adaptive policy group (requires one unique attribute)
func (o AdaptivePolicyPoliciesOutput) DestinationGroup() AdaptivePolicyPoliciesDestinationGroupOutput {
	return o.ApplyT(func(v *AdaptivePolicyPolicies) AdaptivePolicyPoliciesDestinationGroupOutput {
		return v.DestinationGroup
	}).(AdaptivePolicyPoliciesDestinationGroupOutput)
}

// The rule to apply if there is no matching ACL (default: "default")
func (o AdaptivePolicyPoliciesOutput) LastEntryRule() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyPolicies) pulumi.StringOutput { return v.LastEntryRule }).(pulumi.StringOutput)
}

// organizationId path parameter. Organization ID
func (o AdaptivePolicyPoliciesOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyPolicies) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// The source adaptive policy group (requires one unique attribute)
func (o AdaptivePolicyPoliciesOutput) SourceGroup() AdaptivePolicyPoliciesSourceGroupOutput {
	return o.ApplyT(func(v *AdaptivePolicyPolicies) AdaptivePolicyPoliciesSourceGroupOutput { return v.SourceGroup }).(AdaptivePolicyPoliciesSourceGroupOutput)
}

func (o AdaptivePolicyPoliciesOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyPolicies) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type AdaptivePolicyPoliciesArrayOutput struct{ *pulumi.OutputState }

func (AdaptivePolicyPoliciesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AdaptivePolicyPolicies)(nil)).Elem()
}

func (o AdaptivePolicyPoliciesArrayOutput) ToAdaptivePolicyPoliciesArrayOutput() AdaptivePolicyPoliciesArrayOutput {
	return o
}

func (o AdaptivePolicyPoliciesArrayOutput) ToAdaptivePolicyPoliciesArrayOutputWithContext(ctx context.Context) AdaptivePolicyPoliciesArrayOutput {
	return o
}

func (o AdaptivePolicyPoliciesArrayOutput) Index(i pulumi.IntInput) AdaptivePolicyPoliciesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AdaptivePolicyPolicies {
		return vs[0].([]*AdaptivePolicyPolicies)[vs[1].(int)]
	}).(AdaptivePolicyPoliciesOutput)
}

type AdaptivePolicyPoliciesMapOutput struct{ *pulumi.OutputState }

func (AdaptivePolicyPoliciesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AdaptivePolicyPolicies)(nil)).Elem()
}

func (o AdaptivePolicyPoliciesMapOutput) ToAdaptivePolicyPoliciesMapOutput() AdaptivePolicyPoliciesMapOutput {
	return o
}

func (o AdaptivePolicyPoliciesMapOutput) ToAdaptivePolicyPoliciesMapOutputWithContext(ctx context.Context) AdaptivePolicyPoliciesMapOutput {
	return o
}

func (o AdaptivePolicyPoliciesMapOutput) MapIndex(k pulumi.StringInput) AdaptivePolicyPoliciesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AdaptivePolicyPolicies {
		return vs[0].(map[string]*AdaptivePolicyPolicies)[vs[1].(string)]
	}).(AdaptivePolicyPoliciesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AdaptivePolicyPoliciesInput)(nil)).Elem(), &AdaptivePolicyPolicies{})
	pulumi.RegisterInputType(reflect.TypeOf((*AdaptivePolicyPoliciesArrayInput)(nil)).Elem(), AdaptivePolicyPoliciesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AdaptivePolicyPoliciesMapInput)(nil)).Elem(), AdaptivePolicyPoliciesMap{})
	pulumi.RegisterOutputType(AdaptivePolicyPoliciesOutput{})
	pulumi.RegisterOutputType(AdaptivePolicyPoliciesArrayOutput{})
	pulumi.RegisterOutputType(AdaptivePolicyPoliciesMapOutput{})
}
