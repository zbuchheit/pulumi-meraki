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

// ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
// already existed previously.
//
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
//			example, err := organizations.NewLicensingCotermLicensesMove(ctx, "example", &organizations.LicensingCotermLicensesMoveArgs{
//				OrganizationId: pulumi.String("string"),
//				Parameters: &organizations.LicensingCotermLicensesMoveParametersArgs{
//					Destination: &organizations.LicensingCotermLicensesMoveParametersDestinationArgs{
//						Mode:           pulumi.String("addDevices"),
//						OrganizationId: pulumi.String("123"),
//					},
//					Licenses: organizations.LicensingCotermLicensesMoveParametersLicenseArray{
//						&organizations.LicensingCotermLicensesMoveParametersLicenseArgs{
//							Counts: organizations.LicensingCotermLicensesMoveParametersLicenseCountArray{
//								&organizations.LicensingCotermLicensesMoveParametersLicenseCountArgs{
//									Count: pulumi.Int(5),
//									Model: pulumi.String("MR Enterprise"),
//								},
//							},
//							Key: pulumi.String("Z2AA-BBBB-CCCC"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsLicensingCotermLicensesMoveExample", example)
//			return nil
//		})
//	}
//
// ```
type LicensingCotermLicensesMove struct {
	pulumi.CustomResourceState

	Item LicensingCotermLicensesMoveItemOutput `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput                         `pulumi:"organizationId"`
	Parameters     LicensingCotermLicensesMoveParametersOutput `pulumi:"parameters"`
}

// NewLicensingCotermLicensesMove registers a new resource with the given unique name, arguments, and options.
func NewLicensingCotermLicensesMove(ctx *pulumi.Context,
	name string, args *LicensingCotermLicensesMoveArgs, opts ...pulumi.ResourceOption) (*LicensingCotermLicensesMove, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	if args.Parameters == nil {
		return nil, errors.New("invalid value for required argument 'Parameters'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LicensingCotermLicensesMove
	err := ctx.RegisterResource("meraki:organizations/licensingCotermLicensesMove:LicensingCotermLicensesMove", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLicensingCotermLicensesMove gets an existing LicensingCotermLicensesMove resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLicensingCotermLicensesMove(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LicensingCotermLicensesMoveState, opts ...pulumi.ResourceOption) (*LicensingCotermLicensesMove, error) {
	var resource LicensingCotermLicensesMove
	err := ctx.ReadResource("meraki:organizations/licensingCotermLicensesMove:LicensingCotermLicensesMove", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LicensingCotermLicensesMove resources.
type licensingCotermLicensesMoveState struct {
	Item *LicensingCotermLicensesMoveItem `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId *string                                `pulumi:"organizationId"`
	Parameters     *LicensingCotermLicensesMoveParameters `pulumi:"parameters"`
}

type LicensingCotermLicensesMoveState struct {
	Item LicensingCotermLicensesMoveItemPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
	Parameters     LicensingCotermLicensesMoveParametersPtrInput
}

func (LicensingCotermLicensesMoveState) ElementType() reflect.Type {
	return reflect.TypeOf((*licensingCotermLicensesMoveState)(nil)).Elem()
}

type licensingCotermLicensesMoveArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string                                `pulumi:"organizationId"`
	Parameters     LicensingCotermLicensesMoveParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a LicensingCotermLicensesMove resource.
type LicensingCotermLicensesMoveArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
	Parameters     LicensingCotermLicensesMoveParametersInput
}

func (LicensingCotermLicensesMoveArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*licensingCotermLicensesMoveArgs)(nil)).Elem()
}

type LicensingCotermLicensesMoveInput interface {
	pulumi.Input

	ToLicensingCotermLicensesMoveOutput() LicensingCotermLicensesMoveOutput
	ToLicensingCotermLicensesMoveOutputWithContext(ctx context.Context) LicensingCotermLicensesMoveOutput
}

func (*LicensingCotermLicensesMove) ElementType() reflect.Type {
	return reflect.TypeOf((**LicensingCotermLicensesMove)(nil)).Elem()
}

func (i *LicensingCotermLicensesMove) ToLicensingCotermLicensesMoveOutput() LicensingCotermLicensesMoveOutput {
	return i.ToLicensingCotermLicensesMoveOutputWithContext(context.Background())
}

func (i *LicensingCotermLicensesMove) ToLicensingCotermLicensesMoveOutputWithContext(ctx context.Context) LicensingCotermLicensesMoveOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicensingCotermLicensesMoveOutput)
}

// LicensingCotermLicensesMoveArrayInput is an input type that accepts LicensingCotermLicensesMoveArray and LicensingCotermLicensesMoveArrayOutput values.
// You can construct a concrete instance of `LicensingCotermLicensesMoveArrayInput` via:
//
//	LicensingCotermLicensesMoveArray{ LicensingCotermLicensesMoveArgs{...} }
type LicensingCotermLicensesMoveArrayInput interface {
	pulumi.Input

	ToLicensingCotermLicensesMoveArrayOutput() LicensingCotermLicensesMoveArrayOutput
	ToLicensingCotermLicensesMoveArrayOutputWithContext(context.Context) LicensingCotermLicensesMoveArrayOutput
}

type LicensingCotermLicensesMoveArray []LicensingCotermLicensesMoveInput

func (LicensingCotermLicensesMoveArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LicensingCotermLicensesMove)(nil)).Elem()
}

func (i LicensingCotermLicensesMoveArray) ToLicensingCotermLicensesMoveArrayOutput() LicensingCotermLicensesMoveArrayOutput {
	return i.ToLicensingCotermLicensesMoveArrayOutputWithContext(context.Background())
}

func (i LicensingCotermLicensesMoveArray) ToLicensingCotermLicensesMoveArrayOutputWithContext(ctx context.Context) LicensingCotermLicensesMoveArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicensingCotermLicensesMoveArrayOutput)
}

// LicensingCotermLicensesMoveMapInput is an input type that accepts LicensingCotermLicensesMoveMap and LicensingCotermLicensesMoveMapOutput values.
// You can construct a concrete instance of `LicensingCotermLicensesMoveMapInput` via:
//
//	LicensingCotermLicensesMoveMap{ "key": LicensingCotermLicensesMoveArgs{...} }
type LicensingCotermLicensesMoveMapInput interface {
	pulumi.Input

	ToLicensingCotermLicensesMoveMapOutput() LicensingCotermLicensesMoveMapOutput
	ToLicensingCotermLicensesMoveMapOutputWithContext(context.Context) LicensingCotermLicensesMoveMapOutput
}

type LicensingCotermLicensesMoveMap map[string]LicensingCotermLicensesMoveInput

func (LicensingCotermLicensesMoveMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LicensingCotermLicensesMove)(nil)).Elem()
}

func (i LicensingCotermLicensesMoveMap) ToLicensingCotermLicensesMoveMapOutput() LicensingCotermLicensesMoveMapOutput {
	return i.ToLicensingCotermLicensesMoveMapOutputWithContext(context.Background())
}

func (i LicensingCotermLicensesMoveMap) ToLicensingCotermLicensesMoveMapOutputWithContext(ctx context.Context) LicensingCotermLicensesMoveMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicensingCotermLicensesMoveMapOutput)
}

type LicensingCotermLicensesMoveOutput struct{ *pulumi.OutputState }

func (LicensingCotermLicensesMoveOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LicensingCotermLicensesMove)(nil)).Elem()
}

func (o LicensingCotermLicensesMoveOutput) ToLicensingCotermLicensesMoveOutput() LicensingCotermLicensesMoveOutput {
	return o
}

func (o LicensingCotermLicensesMoveOutput) ToLicensingCotermLicensesMoveOutputWithContext(ctx context.Context) LicensingCotermLicensesMoveOutput {
	return o
}

func (o LicensingCotermLicensesMoveOutput) Item() LicensingCotermLicensesMoveItemOutput {
	return o.ApplyT(func(v *LicensingCotermLicensesMove) LicensingCotermLicensesMoveItemOutput { return v.Item }).(LicensingCotermLicensesMoveItemOutput)
}

// organizationId path parameter. Organization ID
func (o LicensingCotermLicensesMoveOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *LicensingCotermLicensesMove) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

func (o LicensingCotermLicensesMoveOutput) Parameters() LicensingCotermLicensesMoveParametersOutput {
	return o.ApplyT(func(v *LicensingCotermLicensesMove) LicensingCotermLicensesMoveParametersOutput { return v.Parameters }).(LicensingCotermLicensesMoveParametersOutput)
}

type LicensingCotermLicensesMoveArrayOutput struct{ *pulumi.OutputState }

func (LicensingCotermLicensesMoveArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LicensingCotermLicensesMove)(nil)).Elem()
}

func (o LicensingCotermLicensesMoveArrayOutput) ToLicensingCotermLicensesMoveArrayOutput() LicensingCotermLicensesMoveArrayOutput {
	return o
}

func (o LicensingCotermLicensesMoveArrayOutput) ToLicensingCotermLicensesMoveArrayOutputWithContext(ctx context.Context) LicensingCotermLicensesMoveArrayOutput {
	return o
}

func (o LicensingCotermLicensesMoveArrayOutput) Index(i pulumi.IntInput) LicensingCotermLicensesMoveOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LicensingCotermLicensesMove {
		return vs[0].([]*LicensingCotermLicensesMove)[vs[1].(int)]
	}).(LicensingCotermLicensesMoveOutput)
}

type LicensingCotermLicensesMoveMapOutput struct{ *pulumi.OutputState }

func (LicensingCotermLicensesMoveMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LicensingCotermLicensesMove)(nil)).Elem()
}

func (o LicensingCotermLicensesMoveMapOutput) ToLicensingCotermLicensesMoveMapOutput() LicensingCotermLicensesMoveMapOutput {
	return o
}

func (o LicensingCotermLicensesMoveMapOutput) ToLicensingCotermLicensesMoveMapOutputWithContext(ctx context.Context) LicensingCotermLicensesMoveMapOutput {
	return o
}

func (o LicensingCotermLicensesMoveMapOutput) MapIndex(k pulumi.StringInput) LicensingCotermLicensesMoveOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LicensingCotermLicensesMove {
		return vs[0].(map[string]*LicensingCotermLicensesMove)[vs[1].(string)]
	}).(LicensingCotermLicensesMoveOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LicensingCotermLicensesMoveInput)(nil)).Elem(), &LicensingCotermLicensesMove{})
	pulumi.RegisterInputType(reflect.TypeOf((*LicensingCotermLicensesMoveArrayInput)(nil)).Elem(), LicensingCotermLicensesMoveArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LicensingCotermLicensesMoveMapInput)(nil)).Elem(), LicensingCotermLicensesMoveMap{})
	pulumi.RegisterOutputType(LicensingCotermLicensesMoveOutput{})
	pulumi.RegisterOutputType(LicensingCotermLicensesMoveArrayOutput{})
	pulumi.RegisterOutputType(LicensingCotermLicensesMoveMapOutput{})
}