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
//			example, err := devices.NewCameraVideoSettings(ctx, "example", &devices.CameraVideoSettingsArgs{
//				ExternalRtspEnabled: pulumi.Bool(true),
//				Serial:              pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesCameraVideoSettingsExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/cameraVideoSettings:CameraVideoSettings example "serial"
// ```
type CameraVideoSettings struct {
	pulumi.CustomResourceState

	// Boolean indicating if external rtsp stream is exposed
	ExternalRtspEnabled pulumi.BoolOutput `pulumi:"externalRtspEnabled"`
	// External rstp url. Will only be returned if external rtsp stream is exposed
	RtspUrl pulumi.StringOutput `pulumi:"rtspUrl"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
}

// NewCameraVideoSettings registers a new resource with the given unique name, arguments, and options.
func NewCameraVideoSettings(ctx *pulumi.Context,
	name string, args *CameraVideoSettingsArgs, opts ...pulumi.ResourceOption) (*CameraVideoSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CameraVideoSettings
	err := ctx.RegisterResource("meraki:devices/cameraVideoSettings:CameraVideoSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCameraVideoSettings gets an existing CameraVideoSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCameraVideoSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CameraVideoSettingsState, opts ...pulumi.ResourceOption) (*CameraVideoSettings, error) {
	var resource CameraVideoSettings
	err := ctx.ReadResource("meraki:devices/cameraVideoSettings:CameraVideoSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CameraVideoSettings resources.
type cameraVideoSettingsState struct {
	// Boolean indicating if external rtsp stream is exposed
	ExternalRtspEnabled *bool `pulumi:"externalRtspEnabled"`
	// External rstp url. Will only be returned if external rtsp stream is exposed
	RtspUrl *string `pulumi:"rtspUrl"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
}

type CameraVideoSettingsState struct {
	// Boolean indicating if external rtsp stream is exposed
	ExternalRtspEnabled pulumi.BoolPtrInput
	// External rstp url. Will only be returned if external rtsp stream is exposed
	RtspUrl pulumi.StringPtrInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
}

func (CameraVideoSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*cameraVideoSettingsState)(nil)).Elem()
}

type cameraVideoSettingsArgs struct {
	// Boolean indicating if external rtsp stream is exposed
	ExternalRtspEnabled *bool `pulumi:"externalRtspEnabled"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// The set of arguments for constructing a CameraVideoSettings resource.
type CameraVideoSettingsArgs struct {
	// Boolean indicating if external rtsp stream is exposed
	ExternalRtspEnabled pulumi.BoolPtrInput
	// serial path parameter.
	Serial pulumi.StringInput
}

func (CameraVideoSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cameraVideoSettingsArgs)(nil)).Elem()
}

type CameraVideoSettingsInput interface {
	pulumi.Input

	ToCameraVideoSettingsOutput() CameraVideoSettingsOutput
	ToCameraVideoSettingsOutputWithContext(ctx context.Context) CameraVideoSettingsOutput
}

func (*CameraVideoSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**CameraVideoSettings)(nil)).Elem()
}

func (i *CameraVideoSettings) ToCameraVideoSettingsOutput() CameraVideoSettingsOutput {
	return i.ToCameraVideoSettingsOutputWithContext(context.Background())
}

func (i *CameraVideoSettings) ToCameraVideoSettingsOutputWithContext(ctx context.Context) CameraVideoSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CameraVideoSettingsOutput)
}

// CameraVideoSettingsArrayInput is an input type that accepts CameraVideoSettingsArray and CameraVideoSettingsArrayOutput values.
// You can construct a concrete instance of `CameraVideoSettingsArrayInput` via:
//
//	CameraVideoSettingsArray{ CameraVideoSettingsArgs{...} }
type CameraVideoSettingsArrayInput interface {
	pulumi.Input

	ToCameraVideoSettingsArrayOutput() CameraVideoSettingsArrayOutput
	ToCameraVideoSettingsArrayOutputWithContext(context.Context) CameraVideoSettingsArrayOutput
}

type CameraVideoSettingsArray []CameraVideoSettingsInput

func (CameraVideoSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CameraVideoSettings)(nil)).Elem()
}

func (i CameraVideoSettingsArray) ToCameraVideoSettingsArrayOutput() CameraVideoSettingsArrayOutput {
	return i.ToCameraVideoSettingsArrayOutputWithContext(context.Background())
}

func (i CameraVideoSettingsArray) ToCameraVideoSettingsArrayOutputWithContext(ctx context.Context) CameraVideoSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CameraVideoSettingsArrayOutput)
}

// CameraVideoSettingsMapInput is an input type that accepts CameraVideoSettingsMap and CameraVideoSettingsMapOutput values.
// You can construct a concrete instance of `CameraVideoSettingsMapInput` via:
//
//	CameraVideoSettingsMap{ "key": CameraVideoSettingsArgs{...} }
type CameraVideoSettingsMapInput interface {
	pulumi.Input

	ToCameraVideoSettingsMapOutput() CameraVideoSettingsMapOutput
	ToCameraVideoSettingsMapOutputWithContext(context.Context) CameraVideoSettingsMapOutput
}

type CameraVideoSettingsMap map[string]CameraVideoSettingsInput

func (CameraVideoSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CameraVideoSettings)(nil)).Elem()
}

func (i CameraVideoSettingsMap) ToCameraVideoSettingsMapOutput() CameraVideoSettingsMapOutput {
	return i.ToCameraVideoSettingsMapOutputWithContext(context.Background())
}

func (i CameraVideoSettingsMap) ToCameraVideoSettingsMapOutputWithContext(ctx context.Context) CameraVideoSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CameraVideoSettingsMapOutput)
}

type CameraVideoSettingsOutput struct{ *pulumi.OutputState }

func (CameraVideoSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CameraVideoSettings)(nil)).Elem()
}

func (o CameraVideoSettingsOutput) ToCameraVideoSettingsOutput() CameraVideoSettingsOutput {
	return o
}

func (o CameraVideoSettingsOutput) ToCameraVideoSettingsOutputWithContext(ctx context.Context) CameraVideoSettingsOutput {
	return o
}

// Boolean indicating if external rtsp stream is exposed
func (o CameraVideoSettingsOutput) ExternalRtspEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *CameraVideoSettings) pulumi.BoolOutput { return v.ExternalRtspEnabled }).(pulumi.BoolOutput)
}

// External rstp url. Will only be returned if external rtsp stream is exposed
func (o CameraVideoSettingsOutput) RtspUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *CameraVideoSettings) pulumi.StringOutput { return v.RtspUrl }).(pulumi.StringOutput)
}

// serial path parameter.
func (o CameraVideoSettingsOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *CameraVideoSettings) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

type CameraVideoSettingsArrayOutput struct{ *pulumi.OutputState }

func (CameraVideoSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CameraVideoSettings)(nil)).Elem()
}

func (o CameraVideoSettingsArrayOutput) ToCameraVideoSettingsArrayOutput() CameraVideoSettingsArrayOutput {
	return o
}

func (o CameraVideoSettingsArrayOutput) ToCameraVideoSettingsArrayOutputWithContext(ctx context.Context) CameraVideoSettingsArrayOutput {
	return o
}

func (o CameraVideoSettingsArrayOutput) Index(i pulumi.IntInput) CameraVideoSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CameraVideoSettings {
		return vs[0].([]*CameraVideoSettings)[vs[1].(int)]
	}).(CameraVideoSettingsOutput)
}

type CameraVideoSettingsMapOutput struct{ *pulumi.OutputState }

func (CameraVideoSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CameraVideoSettings)(nil)).Elem()
}

func (o CameraVideoSettingsMapOutput) ToCameraVideoSettingsMapOutput() CameraVideoSettingsMapOutput {
	return o
}

func (o CameraVideoSettingsMapOutput) ToCameraVideoSettingsMapOutputWithContext(ctx context.Context) CameraVideoSettingsMapOutput {
	return o
}

func (o CameraVideoSettingsMapOutput) MapIndex(k pulumi.StringInput) CameraVideoSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CameraVideoSettings {
		return vs[0].(map[string]*CameraVideoSettings)[vs[1].(string)]
	}).(CameraVideoSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CameraVideoSettingsInput)(nil)).Elem(), &CameraVideoSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*CameraVideoSettingsArrayInput)(nil)).Elem(), CameraVideoSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CameraVideoSettingsMapInput)(nil)).Elem(), CameraVideoSettingsMap{})
	pulumi.RegisterOutputType(CameraVideoSettingsOutput{})
	pulumi.RegisterOutputType(CameraVideoSettingsArrayOutput{})
	pulumi.RegisterOutputType(CameraVideoSettingsMapOutput{})
}
