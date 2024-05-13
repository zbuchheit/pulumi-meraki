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
//			example, err := networks.GetClients(ctx, &networks.GetClientsArgs{
//				ClientId:  "string",
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksClientsExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetClients(ctx *pulumi.Context, args *GetClientsArgs, opts ...pulumi.InvokeOption) (*GetClientsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetClientsResult
	err := ctx.Invoke("meraki:networks/getClients:getClients", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClients.
type GetClientsArgs struct {
	// clientId path parameter. Client ID
	ClientId string `pulumi:"clientId"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getClients.
type GetClientsResult struct {
	// clientId path parameter. Client ID
	ClientId string `pulumi:"clientId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string         `pulumi:"id"`
	Item GetClientsItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func GetClientsOutput(ctx *pulumi.Context, args GetClientsOutputArgs, opts ...pulumi.InvokeOption) GetClientsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetClientsResult, error) {
			args := v.(GetClientsArgs)
			r, err := GetClients(ctx, &args, opts...)
			var s GetClientsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetClientsResultOutput)
}

// A collection of arguments for invoking getClients.
type GetClientsOutputArgs struct {
	// clientId path parameter. Client ID
	ClientId pulumi.StringInput `pulumi:"clientId"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (GetClientsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClientsArgs)(nil)).Elem()
}

// A collection of values returned by getClients.
type GetClientsResultOutput struct{ *pulumi.OutputState }

func (GetClientsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClientsResult)(nil)).Elem()
}

func (o GetClientsResultOutput) ToGetClientsResultOutput() GetClientsResultOutput {
	return o
}

func (o GetClientsResultOutput) ToGetClientsResultOutputWithContext(ctx context.Context) GetClientsResultOutput {
	return o
}

// clientId path parameter. Client ID
func (o GetClientsResultOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v GetClientsResult) string { return v.ClientId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetClientsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetClientsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetClientsResultOutput) Item() GetClientsItemOutput {
	return o.ApplyT(func(v GetClientsResult) GetClientsItem { return v.Item }).(GetClientsItemOutput)
}

// networkId path parameter. Network ID
func (o GetClientsResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetClientsResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetClientsResultOutput{})
}