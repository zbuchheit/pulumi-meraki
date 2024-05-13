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

// ## Example Usage
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/cameraWirelessProfiles:CameraWirelessProfiles example "network_id,wireless_profile_id"
// ```
type CameraWirelessProfiles struct {
	pulumi.CustomResourceState

	AppliedDeviceCount pulumi.IntOutput `pulumi:"appliedDeviceCount"`
	// The identity of the wireless profile. Required for creating wireless profiles in 8021x-radius auth mode.
	Identity CameraWirelessProfilesIdentityOutput `pulumi:"identity"`
	// The name of the camera wireless profile. This parameter is required.
	Name pulumi.StringOutput `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// The details of the SSID config.
	Ssid CameraWirelessProfilesSsidOutput `pulumi:"ssid"`
	// wirelessProfileId path parameter. Wireless profile ID
	WirelessProfileId pulumi.StringPtrOutput `pulumi:"wirelessProfileId"`
}

// NewCameraWirelessProfiles registers a new resource with the given unique name, arguments, and options.
func NewCameraWirelessProfiles(ctx *pulumi.Context,
	name string, args *CameraWirelessProfilesArgs, opts ...pulumi.ResourceOption) (*CameraWirelessProfiles, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CameraWirelessProfiles
	err := ctx.RegisterResource("meraki:networks/cameraWirelessProfiles:CameraWirelessProfiles", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCameraWirelessProfiles gets an existing CameraWirelessProfiles resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCameraWirelessProfiles(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CameraWirelessProfilesState, opts ...pulumi.ResourceOption) (*CameraWirelessProfiles, error) {
	var resource CameraWirelessProfiles
	err := ctx.ReadResource("meraki:networks/cameraWirelessProfiles:CameraWirelessProfiles", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CameraWirelessProfiles resources.
type cameraWirelessProfilesState struct {
	AppliedDeviceCount *int `pulumi:"appliedDeviceCount"`
	// The identity of the wireless profile. Required for creating wireless profiles in 8021x-radius auth mode.
	Identity *CameraWirelessProfilesIdentity `pulumi:"identity"`
	// The name of the camera wireless profile. This parameter is required.
	Name *string `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// The details of the SSID config.
	Ssid *CameraWirelessProfilesSsid `pulumi:"ssid"`
	// wirelessProfileId path parameter. Wireless profile ID
	WirelessProfileId *string `pulumi:"wirelessProfileId"`
}

type CameraWirelessProfilesState struct {
	AppliedDeviceCount pulumi.IntPtrInput
	// The identity of the wireless profile. Required for creating wireless profiles in 8021x-radius auth mode.
	Identity CameraWirelessProfilesIdentityPtrInput
	// The name of the camera wireless profile. This parameter is required.
	Name pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// The details of the SSID config.
	Ssid CameraWirelessProfilesSsidPtrInput
	// wirelessProfileId path parameter. Wireless profile ID
	WirelessProfileId pulumi.StringPtrInput
}

func (CameraWirelessProfilesState) ElementType() reflect.Type {
	return reflect.TypeOf((*cameraWirelessProfilesState)(nil)).Elem()
}

type cameraWirelessProfilesArgs struct {
	// The identity of the wireless profile. Required for creating wireless profiles in 8021x-radius auth mode.
	Identity *CameraWirelessProfilesIdentity `pulumi:"identity"`
	// The name of the camera wireless profile. This parameter is required.
	Name *string `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// The details of the SSID config.
	Ssid *CameraWirelessProfilesSsid `pulumi:"ssid"`
	// wirelessProfileId path parameter. Wireless profile ID
	WirelessProfileId *string `pulumi:"wirelessProfileId"`
}

// The set of arguments for constructing a CameraWirelessProfiles resource.
type CameraWirelessProfilesArgs struct {
	// The identity of the wireless profile. Required for creating wireless profiles in 8021x-radius auth mode.
	Identity CameraWirelessProfilesIdentityPtrInput
	// The name of the camera wireless profile. This parameter is required.
	Name pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// The details of the SSID config.
	Ssid CameraWirelessProfilesSsidPtrInput
	// wirelessProfileId path parameter. Wireless profile ID
	WirelessProfileId pulumi.StringPtrInput
}

func (CameraWirelessProfilesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cameraWirelessProfilesArgs)(nil)).Elem()
}

type CameraWirelessProfilesInput interface {
	pulumi.Input

	ToCameraWirelessProfilesOutput() CameraWirelessProfilesOutput
	ToCameraWirelessProfilesOutputWithContext(ctx context.Context) CameraWirelessProfilesOutput
}

func (*CameraWirelessProfiles) ElementType() reflect.Type {
	return reflect.TypeOf((**CameraWirelessProfiles)(nil)).Elem()
}

func (i *CameraWirelessProfiles) ToCameraWirelessProfilesOutput() CameraWirelessProfilesOutput {
	return i.ToCameraWirelessProfilesOutputWithContext(context.Background())
}

func (i *CameraWirelessProfiles) ToCameraWirelessProfilesOutputWithContext(ctx context.Context) CameraWirelessProfilesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CameraWirelessProfilesOutput)
}

// CameraWirelessProfilesArrayInput is an input type that accepts CameraWirelessProfilesArray and CameraWirelessProfilesArrayOutput values.
// You can construct a concrete instance of `CameraWirelessProfilesArrayInput` via:
//
//	CameraWirelessProfilesArray{ CameraWirelessProfilesArgs{...} }
type CameraWirelessProfilesArrayInput interface {
	pulumi.Input

	ToCameraWirelessProfilesArrayOutput() CameraWirelessProfilesArrayOutput
	ToCameraWirelessProfilesArrayOutputWithContext(context.Context) CameraWirelessProfilesArrayOutput
}

type CameraWirelessProfilesArray []CameraWirelessProfilesInput

func (CameraWirelessProfilesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CameraWirelessProfiles)(nil)).Elem()
}

func (i CameraWirelessProfilesArray) ToCameraWirelessProfilesArrayOutput() CameraWirelessProfilesArrayOutput {
	return i.ToCameraWirelessProfilesArrayOutputWithContext(context.Background())
}

func (i CameraWirelessProfilesArray) ToCameraWirelessProfilesArrayOutputWithContext(ctx context.Context) CameraWirelessProfilesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CameraWirelessProfilesArrayOutput)
}

// CameraWirelessProfilesMapInput is an input type that accepts CameraWirelessProfilesMap and CameraWirelessProfilesMapOutput values.
// You can construct a concrete instance of `CameraWirelessProfilesMapInput` via:
//
//	CameraWirelessProfilesMap{ "key": CameraWirelessProfilesArgs{...} }
type CameraWirelessProfilesMapInput interface {
	pulumi.Input

	ToCameraWirelessProfilesMapOutput() CameraWirelessProfilesMapOutput
	ToCameraWirelessProfilesMapOutputWithContext(context.Context) CameraWirelessProfilesMapOutput
}

type CameraWirelessProfilesMap map[string]CameraWirelessProfilesInput

func (CameraWirelessProfilesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CameraWirelessProfiles)(nil)).Elem()
}

func (i CameraWirelessProfilesMap) ToCameraWirelessProfilesMapOutput() CameraWirelessProfilesMapOutput {
	return i.ToCameraWirelessProfilesMapOutputWithContext(context.Background())
}

func (i CameraWirelessProfilesMap) ToCameraWirelessProfilesMapOutputWithContext(ctx context.Context) CameraWirelessProfilesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CameraWirelessProfilesMapOutput)
}

type CameraWirelessProfilesOutput struct{ *pulumi.OutputState }

func (CameraWirelessProfilesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CameraWirelessProfiles)(nil)).Elem()
}

func (o CameraWirelessProfilesOutput) ToCameraWirelessProfilesOutput() CameraWirelessProfilesOutput {
	return o
}

func (o CameraWirelessProfilesOutput) ToCameraWirelessProfilesOutputWithContext(ctx context.Context) CameraWirelessProfilesOutput {
	return o
}

func (o CameraWirelessProfilesOutput) AppliedDeviceCount() pulumi.IntOutput {
	return o.ApplyT(func(v *CameraWirelessProfiles) pulumi.IntOutput { return v.AppliedDeviceCount }).(pulumi.IntOutput)
}

// The identity of the wireless profile. Required for creating wireless profiles in 8021x-radius auth mode.
func (o CameraWirelessProfilesOutput) Identity() CameraWirelessProfilesIdentityOutput {
	return o.ApplyT(func(v *CameraWirelessProfiles) CameraWirelessProfilesIdentityOutput { return v.Identity }).(CameraWirelessProfilesIdentityOutput)
}

// The name of the camera wireless profile. This parameter is required.
func (o CameraWirelessProfilesOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CameraWirelessProfiles) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o CameraWirelessProfilesOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *CameraWirelessProfiles) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// The details of the SSID config.
func (o CameraWirelessProfilesOutput) Ssid() CameraWirelessProfilesSsidOutput {
	return o.ApplyT(func(v *CameraWirelessProfiles) CameraWirelessProfilesSsidOutput { return v.Ssid }).(CameraWirelessProfilesSsidOutput)
}

// wirelessProfileId path parameter. Wireless profile ID
func (o CameraWirelessProfilesOutput) WirelessProfileId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CameraWirelessProfiles) pulumi.StringPtrOutput { return v.WirelessProfileId }).(pulumi.StringPtrOutput)
}

type CameraWirelessProfilesArrayOutput struct{ *pulumi.OutputState }

func (CameraWirelessProfilesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CameraWirelessProfiles)(nil)).Elem()
}

func (o CameraWirelessProfilesArrayOutput) ToCameraWirelessProfilesArrayOutput() CameraWirelessProfilesArrayOutput {
	return o
}

func (o CameraWirelessProfilesArrayOutput) ToCameraWirelessProfilesArrayOutputWithContext(ctx context.Context) CameraWirelessProfilesArrayOutput {
	return o
}

func (o CameraWirelessProfilesArrayOutput) Index(i pulumi.IntInput) CameraWirelessProfilesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CameraWirelessProfiles {
		return vs[0].([]*CameraWirelessProfiles)[vs[1].(int)]
	}).(CameraWirelessProfilesOutput)
}

type CameraWirelessProfilesMapOutput struct{ *pulumi.OutputState }

func (CameraWirelessProfilesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CameraWirelessProfiles)(nil)).Elem()
}

func (o CameraWirelessProfilesMapOutput) ToCameraWirelessProfilesMapOutput() CameraWirelessProfilesMapOutput {
	return o
}

func (o CameraWirelessProfilesMapOutput) ToCameraWirelessProfilesMapOutputWithContext(ctx context.Context) CameraWirelessProfilesMapOutput {
	return o
}

func (o CameraWirelessProfilesMapOutput) MapIndex(k pulumi.StringInput) CameraWirelessProfilesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CameraWirelessProfiles {
		return vs[0].(map[string]*CameraWirelessProfiles)[vs[1].(string)]
	}).(CameraWirelessProfilesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CameraWirelessProfilesInput)(nil)).Elem(), &CameraWirelessProfiles{})
	pulumi.RegisterInputType(reflect.TypeOf((*CameraWirelessProfilesArrayInput)(nil)).Elem(), CameraWirelessProfilesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CameraWirelessProfilesMapInput)(nil)).Elem(), CameraWirelessProfilesMap{})
	pulumi.RegisterOutputType(CameraWirelessProfilesOutput{})
	pulumi.RegisterOutputType(CameraWirelessProfilesArrayOutput{})
	pulumi.RegisterOutputType(CameraWirelessProfilesMapOutput{})
}