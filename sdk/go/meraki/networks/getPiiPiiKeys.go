// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networks

import (
	"context"
	"reflect"

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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/networks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := networks.GetPiiPiiKeys(ctx, &networks.GetPiiPiiKeysArgs{
//				BluetoothMac: pulumi.StringRef("string"),
//				Email:        pulumi.StringRef("string"),
//				Imei:         pulumi.StringRef("string"),
//				Mac:          pulumi.StringRef("string"),
//				NetworkId:    "string",
//				Serial:       pulumi.StringRef("string"),
//				Username:     pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksPiiPiiKeysExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetPiiPiiKeys(ctx *pulumi.Context, args *GetPiiPiiKeysArgs, opts ...pulumi.InvokeOption) (*GetPiiPiiKeysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPiiPiiKeysResult
	err := ctx.Invoke("meraki:networks/getPiiPiiKeys:getPiiPiiKeys", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPiiPiiKeys.
type GetPiiPiiKeysArgs struct {
	// bluetoothMac query parameter. The MAC of a Bluetooth client
	BluetoothMac *string `pulumi:"bluetoothMac"`
	// email query parameter. The email of a network user account or a Systems Manager device
	Email *string `pulumi:"email"`
	// imei query parameter. The IMEI of a Systems Manager device
	Imei *string `pulumi:"imei"`
	// mac query parameter. The MAC of a network client device or a Systems Manager device
	Mac *string `pulumi:"mac"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// serial query parameter. The serial of a Systems Manager device
	Serial *string `pulumi:"serial"`
	// username query parameter. The username of a Systems Manager user
	Username *string `pulumi:"username"`
}

// A collection of values returned by getPiiPiiKeys.
type GetPiiPiiKeysResult struct {
	// bluetoothMac query parameter. The MAC of a Bluetooth client
	BluetoothMac *string `pulumi:"bluetoothMac"`
	// email query parameter. The email of a network user account or a Systems Manager device
	Email *string `pulumi:"email"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// imei query parameter. The IMEI of a Systems Manager device
	Imei *string           `pulumi:"imei"`
	Item GetPiiPiiKeysItem `pulumi:"item"`
	// mac query parameter. The MAC of a network client device or a Systems Manager device
	Mac *string `pulumi:"mac"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// serial query parameter. The serial of a Systems Manager device
	Serial *string `pulumi:"serial"`
	// username query parameter. The username of a Systems Manager user
	Username *string `pulumi:"username"`
}

func GetPiiPiiKeysOutput(ctx *pulumi.Context, args GetPiiPiiKeysOutputArgs, opts ...pulumi.InvokeOption) GetPiiPiiKeysResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPiiPiiKeysResult, error) {
			args := v.(GetPiiPiiKeysArgs)
			r, err := GetPiiPiiKeys(ctx, &args, opts...)
			var s GetPiiPiiKeysResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPiiPiiKeysResultOutput)
}

// A collection of arguments for invoking getPiiPiiKeys.
type GetPiiPiiKeysOutputArgs struct {
	// bluetoothMac query parameter. The MAC of a Bluetooth client
	BluetoothMac pulumi.StringPtrInput `pulumi:"bluetoothMac"`
	// email query parameter. The email of a network user account or a Systems Manager device
	Email pulumi.StringPtrInput `pulumi:"email"`
	// imei query parameter. The IMEI of a Systems Manager device
	Imei pulumi.StringPtrInput `pulumi:"imei"`
	// mac query parameter. The MAC of a network client device or a Systems Manager device
	Mac pulumi.StringPtrInput `pulumi:"mac"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// serial query parameter. The serial of a Systems Manager device
	Serial pulumi.StringPtrInput `pulumi:"serial"`
	// username query parameter. The username of a Systems Manager user
	Username pulumi.StringPtrInput `pulumi:"username"`
}

func (GetPiiPiiKeysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPiiPiiKeysArgs)(nil)).Elem()
}

// A collection of values returned by getPiiPiiKeys.
type GetPiiPiiKeysResultOutput struct{ *pulumi.OutputState }

func (GetPiiPiiKeysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPiiPiiKeysResult)(nil)).Elem()
}

func (o GetPiiPiiKeysResultOutput) ToGetPiiPiiKeysResultOutput() GetPiiPiiKeysResultOutput {
	return o
}

func (o GetPiiPiiKeysResultOutput) ToGetPiiPiiKeysResultOutputWithContext(ctx context.Context) GetPiiPiiKeysResultOutput {
	return o
}

// bluetoothMac query parameter. The MAC of a Bluetooth client
func (o GetPiiPiiKeysResultOutput) BluetoothMac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPiiPiiKeysResult) *string { return v.BluetoothMac }).(pulumi.StringPtrOutput)
}

// email query parameter. The email of a network user account or a Systems Manager device
func (o GetPiiPiiKeysResultOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPiiPiiKeysResult) *string { return v.Email }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPiiPiiKeysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPiiPiiKeysResult) string { return v.Id }).(pulumi.StringOutput)
}

// imei query parameter. The IMEI of a Systems Manager device
func (o GetPiiPiiKeysResultOutput) Imei() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPiiPiiKeysResult) *string { return v.Imei }).(pulumi.StringPtrOutput)
}

func (o GetPiiPiiKeysResultOutput) Item() GetPiiPiiKeysItemOutput {
	return o.ApplyT(func(v GetPiiPiiKeysResult) GetPiiPiiKeysItem { return v.Item }).(GetPiiPiiKeysItemOutput)
}

// mac query parameter. The MAC of a network client device or a Systems Manager device
func (o GetPiiPiiKeysResultOutput) Mac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPiiPiiKeysResult) *string { return v.Mac }).(pulumi.StringPtrOutput)
}

// networkId path parameter. Network ID
func (o GetPiiPiiKeysResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPiiPiiKeysResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// serial query parameter. The serial of a Systems Manager device
func (o GetPiiPiiKeysResultOutput) Serial() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPiiPiiKeysResult) *string { return v.Serial }).(pulumi.StringPtrOutput)
}

// username query parameter. The username of a Systems Manager user
func (o GetPiiPiiKeysResultOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPiiPiiKeysResult) *string { return v.Username }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPiiPiiKeysResultOutput{})
}
