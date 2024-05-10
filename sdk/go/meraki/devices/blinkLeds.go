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
//			example, err := devices.NewBlinkLeds(ctx, "example", &devices.BlinkLedsArgs{
//				Serial: pulumi.String("string"),
//				Parameters: &devices.BlinkLedsParametersArgs{
//					Duration: pulumi.Int(20),
//					Duty:     pulumi.Int(50),
//					Period:   pulumi.Int(160),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesBlinkLedsExample", example)
//			return nil
//		})
//	}
//
// ```
type BlinkLeds struct {
	pulumi.CustomResourceState

	Item       BlinkLedsItemOutput       `pulumi:"item"`
	Parameters BlinkLedsParametersOutput `pulumi:"parameters"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
}

// NewBlinkLeds registers a new resource with the given unique name, arguments, and options.
func NewBlinkLeds(ctx *pulumi.Context,
	name string, args *BlinkLedsArgs, opts ...pulumi.ResourceOption) (*BlinkLeds, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Parameters == nil {
		return nil, errors.New("invalid value for required argument 'Parameters'")
	}
	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BlinkLeds
	err := ctx.RegisterResource("meraki:devices/blinkLeds:BlinkLeds", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBlinkLeds gets an existing BlinkLeds resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBlinkLeds(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BlinkLedsState, opts ...pulumi.ResourceOption) (*BlinkLeds, error) {
	var resource BlinkLeds
	err := ctx.ReadResource("meraki:devices/blinkLeds:BlinkLeds", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BlinkLeds resources.
type blinkLedsState struct {
	Item       *BlinkLedsItem       `pulumi:"item"`
	Parameters *BlinkLedsParameters `pulumi:"parameters"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
}

type BlinkLedsState struct {
	Item       BlinkLedsItemPtrInput
	Parameters BlinkLedsParametersPtrInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
}

func (BlinkLedsState) ElementType() reflect.Type {
	return reflect.TypeOf((*blinkLedsState)(nil)).Elem()
}

type blinkLedsArgs struct {
	Parameters BlinkLedsParameters `pulumi:"parameters"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// The set of arguments for constructing a BlinkLeds resource.
type BlinkLedsArgs struct {
	Parameters BlinkLedsParametersInput
	// serial path parameter.
	Serial pulumi.StringInput
}

func (BlinkLedsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*blinkLedsArgs)(nil)).Elem()
}

type BlinkLedsInput interface {
	pulumi.Input

	ToBlinkLedsOutput() BlinkLedsOutput
	ToBlinkLedsOutputWithContext(ctx context.Context) BlinkLedsOutput
}

func (*BlinkLeds) ElementType() reflect.Type {
	return reflect.TypeOf((**BlinkLeds)(nil)).Elem()
}

func (i *BlinkLeds) ToBlinkLedsOutput() BlinkLedsOutput {
	return i.ToBlinkLedsOutputWithContext(context.Background())
}

func (i *BlinkLeds) ToBlinkLedsOutputWithContext(ctx context.Context) BlinkLedsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BlinkLedsOutput)
}

// BlinkLedsArrayInput is an input type that accepts BlinkLedsArray and BlinkLedsArrayOutput values.
// You can construct a concrete instance of `BlinkLedsArrayInput` via:
//
//	BlinkLedsArray{ BlinkLedsArgs{...} }
type BlinkLedsArrayInput interface {
	pulumi.Input

	ToBlinkLedsArrayOutput() BlinkLedsArrayOutput
	ToBlinkLedsArrayOutputWithContext(context.Context) BlinkLedsArrayOutput
}

type BlinkLedsArray []BlinkLedsInput

func (BlinkLedsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BlinkLeds)(nil)).Elem()
}

func (i BlinkLedsArray) ToBlinkLedsArrayOutput() BlinkLedsArrayOutput {
	return i.ToBlinkLedsArrayOutputWithContext(context.Background())
}

func (i BlinkLedsArray) ToBlinkLedsArrayOutputWithContext(ctx context.Context) BlinkLedsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BlinkLedsArrayOutput)
}

// BlinkLedsMapInput is an input type that accepts BlinkLedsMap and BlinkLedsMapOutput values.
// You can construct a concrete instance of `BlinkLedsMapInput` via:
//
//	BlinkLedsMap{ "key": BlinkLedsArgs{...} }
type BlinkLedsMapInput interface {
	pulumi.Input

	ToBlinkLedsMapOutput() BlinkLedsMapOutput
	ToBlinkLedsMapOutputWithContext(context.Context) BlinkLedsMapOutput
}

type BlinkLedsMap map[string]BlinkLedsInput

func (BlinkLedsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BlinkLeds)(nil)).Elem()
}

func (i BlinkLedsMap) ToBlinkLedsMapOutput() BlinkLedsMapOutput {
	return i.ToBlinkLedsMapOutputWithContext(context.Background())
}

func (i BlinkLedsMap) ToBlinkLedsMapOutputWithContext(ctx context.Context) BlinkLedsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BlinkLedsMapOutput)
}

type BlinkLedsOutput struct{ *pulumi.OutputState }

func (BlinkLedsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BlinkLeds)(nil)).Elem()
}

func (o BlinkLedsOutput) ToBlinkLedsOutput() BlinkLedsOutput {
	return o
}

func (o BlinkLedsOutput) ToBlinkLedsOutputWithContext(ctx context.Context) BlinkLedsOutput {
	return o
}

func (o BlinkLedsOutput) Item() BlinkLedsItemOutput {
	return o.ApplyT(func(v *BlinkLeds) BlinkLedsItemOutput { return v.Item }).(BlinkLedsItemOutput)
}

func (o BlinkLedsOutput) Parameters() BlinkLedsParametersOutput {
	return o.ApplyT(func(v *BlinkLeds) BlinkLedsParametersOutput { return v.Parameters }).(BlinkLedsParametersOutput)
}

// serial path parameter.
func (o BlinkLedsOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *BlinkLeds) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

type BlinkLedsArrayOutput struct{ *pulumi.OutputState }

func (BlinkLedsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BlinkLeds)(nil)).Elem()
}

func (o BlinkLedsArrayOutput) ToBlinkLedsArrayOutput() BlinkLedsArrayOutput {
	return o
}

func (o BlinkLedsArrayOutput) ToBlinkLedsArrayOutputWithContext(ctx context.Context) BlinkLedsArrayOutput {
	return o
}

func (o BlinkLedsArrayOutput) Index(i pulumi.IntInput) BlinkLedsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BlinkLeds {
		return vs[0].([]*BlinkLeds)[vs[1].(int)]
	}).(BlinkLedsOutput)
}

type BlinkLedsMapOutput struct{ *pulumi.OutputState }

func (BlinkLedsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BlinkLeds)(nil)).Elem()
}

func (o BlinkLedsMapOutput) ToBlinkLedsMapOutput() BlinkLedsMapOutput {
	return o
}

func (o BlinkLedsMapOutput) ToBlinkLedsMapOutputWithContext(ctx context.Context) BlinkLedsMapOutput {
	return o
}

func (o BlinkLedsMapOutput) MapIndex(k pulumi.StringInput) BlinkLedsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BlinkLeds {
		return vs[0].(map[string]*BlinkLeds)[vs[1].(string)]
	}).(BlinkLedsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BlinkLedsInput)(nil)).Elem(), &BlinkLeds{})
	pulumi.RegisterInputType(reflect.TypeOf((*BlinkLedsArrayInput)(nil)).Elem(), BlinkLedsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BlinkLedsMapInput)(nil)).Elem(), BlinkLedsMap{})
	pulumi.RegisterOutputType(BlinkLedsOutput{})
	pulumi.RegisterOutputType(BlinkLedsArrayOutput{})
	pulumi.RegisterOutputType(BlinkLedsMapOutput{})
}
