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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/networks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := networks.NewSwitchStacksRemove(ctx, "example", &networks.SwitchStacksRemoveArgs{
//				NetworkId:     pulumi.String("string"),
//				SwitchStackId: pulumi.String("string"),
//				Parameters: &networks.SwitchStacksRemoveParametersArgs{
//					Serial: pulumi.String("QBZY-XWVU-TSRQ"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSwitchStacksRemoveExample", example)
//			return nil
//		})
//	}
//
// ```
type SwitchStacksRemove struct {
	pulumi.CustomResourceState

	Item SwitchStacksRemoveItemOutput `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringOutput                `pulumi:"networkId"`
	Parameters SwitchStacksRemoveParametersOutput `pulumi:"parameters"`
	// switchStackId path parameter. Switch stack ID
	SwitchStackId pulumi.StringOutput `pulumi:"switchStackId"`
}

// NewSwitchStacksRemove registers a new resource with the given unique name, arguments, and options.
func NewSwitchStacksRemove(ctx *pulumi.Context,
	name string, args *SwitchStacksRemoveArgs, opts ...pulumi.ResourceOption) (*SwitchStacksRemove, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	if args.Parameters == nil {
		return nil, errors.New("invalid value for required argument 'Parameters'")
	}
	if args.SwitchStackId == nil {
		return nil, errors.New("invalid value for required argument 'SwitchStackId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchStacksRemove
	err := ctx.RegisterResource("meraki:networks/switchStacksRemove:SwitchStacksRemove", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchStacksRemove gets an existing SwitchStacksRemove resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchStacksRemove(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchStacksRemoveState, opts ...pulumi.ResourceOption) (*SwitchStacksRemove, error) {
	var resource SwitchStacksRemove
	err := ctx.ReadResource("meraki:networks/switchStacksRemove:SwitchStacksRemove", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchStacksRemove resources.
type switchStacksRemoveState struct {
	Item *SwitchStacksRemoveItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  *string                       `pulumi:"networkId"`
	Parameters *SwitchStacksRemoveParameters `pulumi:"parameters"`
	// switchStackId path parameter. Switch stack ID
	SwitchStackId *string `pulumi:"switchStackId"`
}

type SwitchStacksRemoveState struct {
	Item SwitchStacksRemoveItemPtrInput
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringPtrInput
	Parameters SwitchStacksRemoveParametersPtrInput
	// switchStackId path parameter. Switch stack ID
	SwitchStackId pulumi.StringPtrInput
}

func (SwitchStacksRemoveState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchStacksRemoveState)(nil)).Elem()
}

type switchStacksRemoveArgs struct {
	// networkId path parameter. Network ID
	NetworkId  string                       `pulumi:"networkId"`
	Parameters SwitchStacksRemoveParameters `pulumi:"parameters"`
	// switchStackId path parameter. Switch stack ID
	SwitchStackId string `pulumi:"switchStackId"`
}

// The set of arguments for constructing a SwitchStacksRemove resource.
type SwitchStacksRemoveArgs struct {
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringInput
	Parameters SwitchStacksRemoveParametersInput
	// switchStackId path parameter. Switch stack ID
	SwitchStackId pulumi.StringInput
}

func (SwitchStacksRemoveArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchStacksRemoveArgs)(nil)).Elem()
}

type SwitchStacksRemoveInput interface {
	pulumi.Input

	ToSwitchStacksRemoveOutput() SwitchStacksRemoveOutput
	ToSwitchStacksRemoveOutputWithContext(ctx context.Context) SwitchStacksRemoveOutput
}

func (*SwitchStacksRemove) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchStacksRemove)(nil)).Elem()
}

func (i *SwitchStacksRemove) ToSwitchStacksRemoveOutput() SwitchStacksRemoveOutput {
	return i.ToSwitchStacksRemoveOutputWithContext(context.Background())
}

func (i *SwitchStacksRemove) ToSwitchStacksRemoveOutputWithContext(ctx context.Context) SwitchStacksRemoveOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchStacksRemoveOutput)
}

// SwitchStacksRemoveArrayInput is an input type that accepts SwitchStacksRemoveArray and SwitchStacksRemoveArrayOutput values.
// You can construct a concrete instance of `SwitchStacksRemoveArrayInput` via:
//
//	SwitchStacksRemoveArray{ SwitchStacksRemoveArgs{...} }
type SwitchStacksRemoveArrayInput interface {
	pulumi.Input

	ToSwitchStacksRemoveArrayOutput() SwitchStacksRemoveArrayOutput
	ToSwitchStacksRemoveArrayOutputWithContext(context.Context) SwitchStacksRemoveArrayOutput
}

type SwitchStacksRemoveArray []SwitchStacksRemoveInput

func (SwitchStacksRemoveArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchStacksRemove)(nil)).Elem()
}

func (i SwitchStacksRemoveArray) ToSwitchStacksRemoveArrayOutput() SwitchStacksRemoveArrayOutput {
	return i.ToSwitchStacksRemoveArrayOutputWithContext(context.Background())
}

func (i SwitchStacksRemoveArray) ToSwitchStacksRemoveArrayOutputWithContext(ctx context.Context) SwitchStacksRemoveArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchStacksRemoveArrayOutput)
}

// SwitchStacksRemoveMapInput is an input type that accepts SwitchStacksRemoveMap and SwitchStacksRemoveMapOutput values.
// You can construct a concrete instance of `SwitchStacksRemoveMapInput` via:
//
//	SwitchStacksRemoveMap{ "key": SwitchStacksRemoveArgs{...} }
type SwitchStacksRemoveMapInput interface {
	pulumi.Input

	ToSwitchStacksRemoveMapOutput() SwitchStacksRemoveMapOutput
	ToSwitchStacksRemoveMapOutputWithContext(context.Context) SwitchStacksRemoveMapOutput
}

type SwitchStacksRemoveMap map[string]SwitchStacksRemoveInput

func (SwitchStacksRemoveMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchStacksRemove)(nil)).Elem()
}

func (i SwitchStacksRemoveMap) ToSwitchStacksRemoveMapOutput() SwitchStacksRemoveMapOutput {
	return i.ToSwitchStacksRemoveMapOutputWithContext(context.Background())
}

func (i SwitchStacksRemoveMap) ToSwitchStacksRemoveMapOutputWithContext(ctx context.Context) SwitchStacksRemoveMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchStacksRemoveMapOutput)
}

type SwitchStacksRemoveOutput struct{ *pulumi.OutputState }

func (SwitchStacksRemoveOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchStacksRemove)(nil)).Elem()
}

func (o SwitchStacksRemoveOutput) ToSwitchStacksRemoveOutput() SwitchStacksRemoveOutput {
	return o
}

func (o SwitchStacksRemoveOutput) ToSwitchStacksRemoveOutputWithContext(ctx context.Context) SwitchStacksRemoveOutput {
	return o
}

func (o SwitchStacksRemoveOutput) Item() SwitchStacksRemoveItemOutput {
	return o.ApplyT(func(v *SwitchStacksRemove) SwitchStacksRemoveItemOutput { return v.Item }).(SwitchStacksRemoveItemOutput)
}

// networkId path parameter. Network ID
func (o SwitchStacksRemoveOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStacksRemove) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

func (o SwitchStacksRemoveOutput) Parameters() SwitchStacksRemoveParametersOutput {
	return o.ApplyT(func(v *SwitchStacksRemove) SwitchStacksRemoveParametersOutput { return v.Parameters }).(SwitchStacksRemoveParametersOutput)
}

// switchStackId path parameter. Switch stack ID
func (o SwitchStacksRemoveOutput) SwitchStackId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStacksRemove) pulumi.StringOutput { return v.SwitchStackId }).(pulumi.StringOutput)
}

type SwitchStacksRemoveArrayOutput struct{ *pulumi.OutputState }

func (SwitchStacksRemoveArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchStacksRemove)(nil)).Elem()
}

func (o SwitchStacksRemoveArrayOutput) ToSwitchStacksRemoveArrayOutput() SwitchStacksRemoveArrayOutput {
	return o
}

func (o SwitchStacksRemoveArrayOutput) ToSwitchStacksRemoveArrayOutputWithContext(ctx context.Context) SwitchStacksRemoveArrayOutput {
	return o
}

func (o SwitchStacksRemoveArrayOutput) Index(i pulumi.IntInput) SwitchStacksRemoveOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchStacksRemove {
		return vs[0].([]*SwitchStacksRemove)[vs[1].(int)]
	}).(SwitchStacksRemoveOutput)
}

type SwitchStacksRemoveMapOutput struct{ *pulumi.OutputState }

func (SwitchStacksRemoveMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchStacksRemove)(nil)).Elem()
}

func (o SwitchStacksRemoveMapOutput) ToSwitchStacksRemoveMapOutput() SwitchStacksRemoveMapOutput {
	return o
}

func (o SwitchStacksRemoveMapOutput) ToSwitchStacksRemoveMapOutputWithContext(ctx context.Context) SwitchStacksRemoveMapOutput {
	return o
}

func (o SwitchStacksRemoveMapOutput) MapIndex(k pulumi.StringInput) SwitchStacksRemoveOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchStacksRemove {
		return vs[0].(map[string]*SwitchStacksRemove)[vs[1].(string)]
	}).(SwitchStacksRemoveOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchStacksRemoveInput)(nil)).Elem(), &SwitchStacksRemove{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchStacksRemoveArrayInput)(nil)).Elem(), SwitchStacksRemoveArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchStacksRemoveMapInput)(nil)).Elem(), SwitchStacksRemoveMap{})
	pulumi.RegisterOutputType(SwitchStacksRemoveOutput{})
	pulumi.RegisterOutputType(SwitchStacksRemoveArrayOutput{})
	pulumi.RegisterOutputType(SwitchStacksRemoveMapOutput{})
}
