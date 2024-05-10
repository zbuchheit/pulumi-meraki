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
// $ pulumi import meraki:devices/liveToolsWakeOnLan:LiveToolsWakeOnLan example "serial,wake_on_lan_id"
// ```
type LiveToolsWakeOnLan struct {
	pulumi.CustomResourceState

	// Details for the callback. Please include either an httpServerId OR url and sharedSecret
	Callback LiveToolsWakeOnLanCallbackOutput `pulumi:"callback"`
	// An error message for a failed execution
	Error pulumi.StringOutput `pulumi:"error"`
	// The target's MAC address
	Mac pulumi.StringOutput `pulumi:"mac"`
	// The parameters of the Wake-on-LAN request
	Request LiveToolsWakeOnLanRequestOutput `pulumi:"request"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
	// Status of the Wake-on-LAN request
	Status pulumi.StringOutput `pulumi:"status"`
	// GET this url to check the status of your ping request
	Url pulumi.StringOutput `pulumi:"url"`
	// The target's VLAN (1 to 4094)
	VlanId pulumi.IntOutput `pulumi:"vlanId"`
	// ID of the Wake-on-LAN job
	WakeOnLanId pulumi.StringOutput `pulumi:"wakeOnLanId"`
}

// NewLiveToolsWakeOnLan registers a new resource with the given unique name, arguments, and options.
func NewLiveToolsWakeOnLan(ctx *pulumi.Context,
	name string, args *LiveToolsWakeOnLanArgs, opts ...pulumi.ResourceOption) (*LiveToolsWakeOnLan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LiveToolsWakeOnLan
	err := ctx.RegisterResource("meraki:devices/liveToolsWakeOnLan:LiveToolsWakeOnLan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLiveToolsWakeOnLan gets an existing LiveToolsWakeOnLan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLiveToolsWakeOnLan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LiveToolsWakeOnLanState, opts ...pulumi.ResourceOption) (*LiveToolsWakeOnLan, error) {
	var resource LiveToolsWakeOnLan
	err := ctx.ReadResource("meraki:devices/liveToolsWakeOnLan:LiveToolsWakeOnLan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LiveToolsWakeOnLan resources.
type liveToolsWakeOnLanState struct {
	// Details for the callback. Please include either an httpServerId OR url and sharedSecret
	Callback *LiveToolsWakeOnLanCallback `pulumi:"callback"`
	// An error message for a failed execution
	Error *string `pulumi:"error"`
	// The target's MAC address
	Mac *string `pulumi:"mac"`
	// The parameters of the Wake-on-LAN request
	Request *LiveToolsWakeOnLanRequest `pulumi:"request"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
	// Status of the Wake-on-LAN request
	Status *string `pulumi:"status"`
	// GET this url to check the status of your ping request
	Url *string `pulumi:"url"`
	// The target's VLAN (1 to 4094)
	VlanId *int `pulumi:"vlanId"`
	// ID of the Wake-on-LAN job
	WakeOnLanId *string `pulumi:"wakeOnLanId"`
}

type LiveToolsWakeOnLanState struct {
	// Details for the callback. Please include either an httpServerId OR url and sharedSecret
	Callback LiveToolsWakeOnLanCallbackPtrInput
	// An error message for a failed execution
	Error pulumi.StringPtrInput
	// The target's MAC address
	Mac pulumi.StringPtrInput
	// The parameters of the Wake-on-LAN request
	Request LiveToolsWakeOnLanRequestPtrInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
	// Status of the Wake-on-LAN request
	Status pulumi.StringPtrInput
	// GET this url to check the status of your ping request
	Url pulumi.StringPtrInput
	// The target's VLAN (1 to 4094)
	VlanId pulumi.IntPtrInput
	// ID of the Wake-on-LAN job
	WakeOnLanId pulumi.StringPtrInput
}

func (LiveToolsWakeOnLanState) ElementType() reflect.Type {
	return reflect.TypeOf((*liveToolsWakeOnLanState)(nil)).Elem()
}

type liveToolsWakeOnLanArgs struct {
	// Details for the callback. Please include either an httpServerId OR url and sharedSecret
	Callback *LiveToolsWakeOnLanCallback `pulumi:"callback"`
	// The target's MAC address
	Mac *string `pulumi:"mac"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
	// The target's VLAN (1 to 4094)
	VlanId *int `pulumi:"vlanId"`
	// ID of the Wake-on-LAN job
	WakeOnLanId *string `pulumi:"wakeOnLanId"`
}

// The set of arguments for constructing a LiveToolsWakeOnLan resource.
type LiveToolsWakeOnLanArgs struct {
	// Details for the callback. Please include either an httpServerId OR url and sharedSecret
	Callback LiveToolsWakeOnLanCallbackPtrInput
	// The target's MAC address
	Mac pulumi.StringPtrInput
	// serial path parameter.
	Serial pulumi.StringInput
	// The target's VLAN (1 to 4094)
	VlanId pulumi.IntPtrInput
	// ID of the Wake-on-LAN job
	WakeOnLanId pulumi.StringPtrInput
}

func (LiveToolsWakeOnLanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*liveToolsWakeOnLanArgs)(nil)).Elem()
}

type LiveToolsWakeOnLanInput interface {
	pulumi.Input

	ToLiveToolsWakeOnLanOutput() LiveToolsWakeOnLanOutput
	ToLiveToolsWakeOnLanOutputWithContext(ctx context.Context) LiveToolsWakeOnLanOutput
}

func (*LiveToolsWakeOnLan) ElementType() reflect.Type {
	return reflect.TypeOf((**LiveToolsWakeOnLan)(nil)).Elem()
}

func (i *LiveToolsWakeOnLan) ToLiveToolsWakeOnLanOutput() LiveToolsWakeOnLanOutput {
	return i.ToLiveToolsWakeOnLanOutputWithContext(context.Background())
}

func (i *LiveToolsWakeOnLan) ToLiveToolsWakeOnLanOutputWithContext(ctx context.Context) LiveToolsWakeOnLanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LiveToolsWakeOnLanOutput)
}

// LiveToolsWakeOnLanArrayInput is an input type that accepts LiveToolsWakeOnLanArray and LiveToolsWakeOnLanArrayOutput values.
// You can construct a concrete instance of `LiveToolsWakeOnLanArrayInput` via:
//
//	LiveToolsWakeOnLanArray{ LiveToolsWakeOnLanArgs{...} }
type LiveToolsWakeOnLanArrayInput interface {
	pulumi.Input

	ToLiveToolsWakeOnLanArrayOutput() LiveToolsWakeOnLanArrayOutput
	ToLiveToolsWakeOnLanArrayOutputWithContext(context.Context) LiveToolsWakeOnLanArrayOutput
}

type LiveToolsWakeOnLanArray []LiveToolsWakeOnLanInput

func (LiveToolsWakeOnLanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LiveToolsWakeOnLan)(nil)).Elem()
}

func (i LiveToolsWakeOnLanArray) ToLiveToolsWakeOnLanArrayOutput() LiveToolsWakeOnLanArrayOutput {
	return i.ToLiveToolsWakeOnLanArrayOutputWithContext(context.Background())
}

func (i LiveToolsWakeOnLanArray) ToLiveToolsWakeOnLanArrayOutputWithContext(ctx context.Context) LiveToolsWakeOnLanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LiveToolsWakeOnLanArrayOutput)
}

// LiveToolsWakeOnLanMapInput is an input type that accepts LiveToolsWakeOnLanMap and LiveToolsWakeOnLanMapOutput values.
// You can construct a concrete instance of `LiveToolsWakeOnLanMapInput` via:
//
//	LiveToolsWakeOnLanMap{ "key": LiveToolsWakeOnLanArgs{...} }
type LiveToolsWakeOnLanMapInput interface {
	pulumi.Input

	ToLiveToolsWakeOnLanMapOutput() LiveToolsWakeOnLanMapOutput
	ToLiveToolsWakeOnLanMapOutputWithContext(context.Context) LiveToolsWakeOnLanMapOutput
}

type LiveToolsWakeOnLanMap map[string]LiveToolsWakeOnLanInput

func (LiveToolsWakeOnLanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LiveToolsWakeOnLan)(nil)).Elem()
}

func (i LiveToolsWakeOnLanMap) ToLiveToolsWakeOnLanMapOutput() LiveToolsWakeOnLanMapOutput {
	return i.ToLiveToolsWakeOnLanMapOutputWithContext(context.Background())
}

func (i LiveToolsWakeOnLanMap) ToLiveToolsWakeOnLanMapOutputWithContext(ctx context.Context) LiveToolsWakeOnLanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LiveToolsWakeOnLanMapOutput)
}

type LiveToolsWakeOnLanOutput struct{ *pulumi.OutputState }

func (LiveToolsWakeOnLanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LiveToolsWakeOnLan)(nil)).Elem()
}

func (o LiveToolsWakeOnLanOutput) ToLiveToolsWakeOnLanOutput() LiveToolsWakeOnLanOutput {
	return o
}

func (o LiveToolsWakeOnLanOutput) ToLiveToolsWakeOnLanOutputWithContext(ctx context.Context) LiveToolsWakeOnLanOutput {
	return o
}

// Details for the callback. Please include either an httpServerId OR url and sharedSecret
func (o LiveToolsWakeOnLanOutput) Callback() LiveToolsWakeOnLanCallbackOutput {
	return o.ApplyT(func(v *LiveToolsWakeOnLan) LiveToolsWakeOnLanCallbackOutput { return v.Callback }).(LiveToolsWakeOnLanCallbackOutput)
}

// An error message for a failed execution
func (o LiveToolsWakeOnLanOutput) Error() pulumi.StringOutput {
	return o.ApplyT(func(v *LiveToolsWakeOnLan) pulumi.StringOutput { return v.Error }).(pulumi.StringOutput)
}

// The target's MAC address
func (o LiveToolsWakeOnLanOutput) Mac() pulumi.StringOutput {
	return o.ApplyT(func(v *LiveToolsWakeOnLan) pulumi.StringOutput { return v.Mac }).(pulumi.StringOutput)
}

// The parameters of the Wake-on-LAN request
func (o LiveToolsWakeOnLanOutput) Request() LiveToolsWakeOnLanRequestOutput {
	return o.ApplyT(func(v *LiveToolsWakeOnLan) LiveToolsWakeOnLanRequestOutput { return v.Request }).(LiveToolsWakeOnLanRequestOutput)
}

// serial path parameter.
func (o LiveToolsWakeOnLanOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *LiveToolsWakeOnLan) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

// Status of the Wake-on-LAN request
func (o LiveToolsWakeOnLanOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *LiveToolsWakeOnLan) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// GET this url to check the status of your ping request
func (o LiveToolsWakeOnLanOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *LiveToolsWakeOnLan) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// The target's VLAN (1 to 4094)
func (o LiveToolsWakeOnLanOutput) VlanId() pulumi.IntOutput {
	return o.ApplyT(func(v *LiveToolsWakeOnLan) pulumi.IntOutput { return v.VlanId }).(pulumi.IntOutput)
}

// ID of the Wake-on-LAN job
func (o LiveToolsWakeOnLanOutput) WakeOnLanId() pulumi.StringOutput {
	return o.ApplyT(func(v *LiveToolsWakeOnLan) pulumi.StringOutput { return v.WakeOnLanId }).(pulumi.StringOutput)
}

type LiveToolsWakeOnLanArrayOutput struct{ *pulumi.OutputState }

func (LiveToolsWakeOnLanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LiveToolsWakeOnLan)(nil)).Elem()
}

func (o LiveToolsWakeOnLanArrayOutput) ToLiveToolsWakeOnLanArrayOutput() LiveToolsWakeOnLanArrayOutput {
	return o
}

func (o LiveToolsWakeOnLanArrayOutput) ToLiveToolsWakeOnLanArrayOutputWithContext(ctx context.Context) LiveToolsWakeOnLanArrayOutput {
	return o
}

func (o LiveToolsWakeOnLanArrayOutput) Index(i pulumi.IntInput) LiveToolsWakeOnLanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LiveToolsWakeOnLan {
		return vs[0].([]*LiveToolsWakeOnLan)[vs[1].(int)]
	}).(LiveToolsWakeOnLanOutput)
}

type LiveToolsWakeOnLanMapOutput struct{ *pulumi.OutputState }

func (LiveToolsWakeOnLanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LiveToolsWakeOnLan)(nil)).Elem()
}

func (o LiveToolsWakeOnLanMapOutput) ToLiveToolsWakeOnLanMapOutput() LiveToolsWakeOnLanMapOutput {
	return o
}

func (o LiveToolsWakeOnLanMapOutput) ToLiveToolsWakeOnLanMapOutputWithContext(ctx context.Context) LiveToolsWakeOnLanMapOutput {
	return o
}

func (o LiveToolsWakeOnLanMapOutput) MapIndex(k pulumi.StringInput) LiveToolsWakeOnLanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LiveToolsWakeOnLan {
		return vs[0].(map[string]*LiveToolsWakeOnLan)[vs[1].(string)]
	}).(LiveToolsWakeOnLanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LiveToolsWakeOnLanInput)(nil)).Elem(), &LiveToolsWakeOnLan{})
	pulumi.RegisterInputType(reflect.TypeOf((*LiveToolsWakeOnLanArrayInput)(nil)).Elem(), LiveToolsWakeOnLanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LiveToolsWakeOnLanMapInput)(nil)).Elem(), LiveToolsWakeOnLanMap{})
	pulumi.RegisterOutputType(LiveToolsWakeOnLanOutput{})
	pulumi.RegisterOutputType(LiveToolsWakeOnLanArrayOutput{})
	pulumi.RegisterOutputType(LiveToolsWakeOnLanMapOutput{})
}
