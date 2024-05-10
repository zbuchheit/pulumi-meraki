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
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/sensorRelationships:SensorRelationships example "serial"
// ```
type SensorRelationships struct {
	pulumi.CustomResourceState

	// A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
	Livestream SensorRelationshipsLivestreamOutput `pulumi:"livestream"`
	// A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
	LivestreamRequests SensorRelationshipsLivestreamRequestArrayOutput `pulumi:"livestreamRequests"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
}

// NewSensorRelationships registers a new resource with the given unique name, arguments, and options.
func NewSensorRelationships(ctx *pulumi.Context,
	name string, args *SensorRelationshipsArgs, opts ...pulumi.ResourceOption) (*SensorRelationships, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SensorRelationships
	err := ctx.RegisterResource("meraki:devices/sensorRelationships:SensorRelationships", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSensorRelationships gets an existing SensorRelationships resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSensorRelationships(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SensorRelationshipsState, opts ...pulumi.ResourceOption) (*SensorRelationships, error) {
	var resource SensorRelationships
	err := ctx.ReadResource("meraki:devices/sensorRelationships:SensorRelationships", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SensorRelationships resources.
type sensorRelationshipsState struct {
	// A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
	Livestream *SensorRelationshipsLivestream `pulumi:"livestream"`
	// A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
	LivestreamRequests []SensorRelationshipsLivestreamRequest `pulumi:"livestreamRequests"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
}

type SensorRelationshipsState struct {
	// A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
	Livestream SensorRelationshipsLivestreamPtrInput
	// A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
	LivestreamRequests SensorRelationshipsLivestreamRequestArrayInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
}

func (SensorRelationshipsState) ElementType() reflect.Type {
	return reflect.TypeOf((*sensorRelationshipsState)(nil)).Elem()
}

type sensorRelationshipsArgs struct {
	// A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
	Livestream *SensorRelationshipsLivestream `pulumi:"livestream"`
	// A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
	LivestreamRequests []SensorRelationshipsLivestreamRequest `pulumi:"livestreamRequests"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// The set of arguments for constructing a SensorRelationships resource.
type SensorRelationshipsArgs struct {
	// A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
	Livestream SensorRelationshipsLivestreamPtrInput
	// A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
	LivestreamRequests SensorRelationshipsLivestreamRequestArrayInput
	// serial path parameter.
	Serial pulumi.StringInput
}

func (SensorRelationshipsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sensorRelationshipsArgs)(nil)).Elem()
}

type SensorRelationshipsInput interface {
	pulumi.Input

	ToSensorRelationshipsOutput() SensorRelationshipsOutput
	ToSensorRelationshipsOutputWithContext(ctx context.Context) SensorRelationshipsOutput
}

func (*SensorRelationships) ElementType() reflect.Type {
	return reflect.TypeOf((**SensorRelationships)(nil)).Elem()
}

func (i *SensorRelationships) ToSensorRelationshipsOutput() SensorRelationshipsOutput {
	return i.ToSensorRelationshipsOutputWithContext(context.Background())
}

func (i *SensorRelationships) ToSensorRelationshipsOutputWithContext(ctx context.Context) SensorRelationshipsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SensorRelationshipsOutput)
}

// SensorRelationshipsArrayInput is an input type that accepts SensorRelationshipsArray and SensorRelationshipsArrayOutput values.
// You can construct a concrete instance of `SensorRelationshipsArrayInput` via:
//
//	SensorRelationshipsArray{ SensorRelationshipsArgs{...} }
type SensorRelationshipsArrayInput interface {
	pulumi.Input

	ToSensorRelationshipsArrayOutput() SensorRelationshipsArrayOutput
	ToSensorRelationshipsArrayOutputWithContext(context.Context) SensorRelationshipsArrayOutput
}

type SensorRelationshipsArray []SensorRelationshipsInput

func (SensorRelationshipsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SensorRelationships)(nil)).Elem()
}

func (i SensorRelationshipsArray) ToSensorRelationshipsArrayOutput() SensorRelationshipsArrayOutput {
	return i.ToSensorRelationshipsArrayOutputWithContext(context.Background())
}

func (i SensorRelationshipsArray) ToSensorRelationshipsArrayOutputWithContext(ctx context.Context) SensorRelationshipsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SensorRelationshipsArrayOutput)
}

// SensorRelationshipsMapInput is an input type that accepts SensorRelationshipsMap and SensorRelationshipsMapOutput values.
// You can construct a concrete instance of `SensorRelationshipsMapInput` via:
//
//	SensorRelationshipsMap{ "key": SensorRelationshipsArgs{...} }
type SensorRelationshipsMapInput interface {
	pulumi.Input

	ToSensorRelationshipsMapOutput() SensorRelationshipsMapOutput
	ToSensorRelationshipsMapOutputWithContext(context.Context) SensorRelationshipsMapOutput
}

type SensorRelationshipsMap map[string]SensorRelationshipsInput

func (SensorRelationshipsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SensorRelationships)(nil)).Elem()
}

func (i SensorRelationshipsMap) ToSensorRelationshipsMapOutput() SensorRelationshipsMapOutput {
	return i.ToSensorRelationshipsMapOutputWithContext(context.Background())
}

func (i SensorRelationshipsMap) ToSensorRelationshipsMapOutputWithContext(ctx context.Context) SensorRelationshipsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SensorRelationshipsMapOutput)
}

type SensorRelationshipsOutput struct{ *pulumi.OutputState }

func (SensorRelationshipsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SensorRelationships)(nil)).Elem()
}

func (o SensorRelationshipsOutput) ToSensorRelationshipsOutput() SensorRelationshipsOutput {
	return o
}

func (o SensorRelationshipsOutput) ToSensorRelationshipsOutputWithContext(ctx context.Context) SensorRelationshipsOutput {
	return o
}

// A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
func (o SensorRelationshipsOutput) Livestream() SensorRelationshipsLivestreamOutput {
	return o.ApplyT(func(v *SensorRelationships) SensorRelationshipsLivestreamOutput { return v.Livestream }).(SensorRelationshipsLivestreamOutput)
}

// A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
func (o SensorRelationshipsOutput) LivestreamRequests() SensorRelationshipsLivestreamRequestArrayOutput {
	return o.ApplyT(func(v *SensorRelationships) SensorRelationshipsLivestreamRequestArrayOutput {
		return v.LivestreamRequests
	}).(SensorRelationshipsLivestreamRequestArrayOutput)
}

// serial path parameter.
func (o SensorRelationshipsOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *SensorRelationships) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

type SensorRelationshipsArrayOutput struct{ *pulumi.OutputState }

func (SensorRelationshipsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SensorRelationships)(nil)).Elem()
}

func (o SensorRelationshipsArrayOutput) ToSensorRelationshipsArrayOutput() SensorRelationshipsArrayOutput {
	return o
}

func (o SensorRelationshipsArrayOutput) ToSensorRelationshipsArrayOutputWithContext(ctx context.Context) SensorRelationshipsArrayOutput {
	return o
}

func (o SensorRelationshipsArrayOutput) Index(i pulumi.IntInput) SensorRelationshipsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SensorRelationships {
		return vs[0].([]*SensorRelationships)[vs[1].(int)]
	}).(SensorRelationshipsOutput)
}

type SensorRelationshipsMapOutput struct{ *pulumi.OutputState }

func (SensorRelationshipsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SensorRelationships)(nil)).Elem()
}

func (o SensorRelationshipsMapOutput) ToSensorRelationshipsMapOutput() SensorRelationshipsMapOutput {
	return o
}

func (o SensorRelationshipsMapOutput) ToSensorRelationshipsMapOutputWithContext(ctx context.Context) SensorRelationshipsMapOutput {
	return o
}

func (o SensorRelationshipsMapOutput) MapIndex(k pulumi.StringInput) SensorRelationshipsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SensorRelationships {
		return vs[0].(map[string]*SensorRelationships)[vs[1].(string)]
	}).(SensorRelationshipsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SensorRelationshipsInput)(nil)).Elem(), &SensorRelationships{})
	pulumi.RegisterInputType(reflect.TypeOf((*SensorRelationshipsArrayInput)(nil)).Elem(), SensorRelationshipsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SensorRelationshipsMapInput)(nil)).Elem(), SensorRelationshipsMap{})
	pulumi.RegisterOutputType(SensorRelationshipsOutput{})
	pulumi.RegisterOutputType(SensorRelationshipsArrayOutput{})
	pulumi.RegisterOutputType(SensorRelationshipsMapOutput{})
}
