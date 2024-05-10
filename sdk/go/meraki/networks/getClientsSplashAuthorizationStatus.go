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
//			example, err := networks.LookupClientsSplashAuthorizationStatus(ctx, &networks.LookupClientsSplashAuthorizationStatusArgs{
//				ClientId:  "string",
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksClientsSplashAuthorizationStatusExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupClientsSplashAuthorizationStatus(ctx *pulumi.Context, args *LookupClientsSplashAuthorizationStatusArgs, opts ...pulumi.InvokeOption) (*LookupClientsSplashAuthorizationStatusResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupClientsSplashAuthorizationStatusResult
	err := ctx.Invoke("meraki:networks/getClientsSplashAuthorizationStatus:getClientsSplashAuthorizationStatus", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClientsSplashAuthorizationStatus.
type LookupClientsSplashAuthorizationStatusArgs struct {
	// clientId path parameter. Client ID
	ClientId string `pulumi:"clientId"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getClientsSplashAuthorizationStatus.
type LookupClientsSplashAuthorizationStatusResult struct {
	// clientId path parameter. Client ID
	ClientId string `pulumi:"clientId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string                                  `pulumi:"id"`
	Item GetClientsSplashAuthorizationStatusItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func LookupClientsSplashAuthorizationStatusOutput(ctx *pulumi.Context, args LookupClientsSplashAuthorizationStatusOutputArgs, opts ...pulumi.InvokeOption) LookupClientsSplashAuthorizationStatusResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClientsSplashAuthorizationStatusResult, error) {
			args := v.(LookupClientsSplashAuthorizationStatusArgs)
			r, err := LookupClientsSplashAuthorizationStatus(ctx, &args, opts...)
			var s LookupClientsSplashAuthorizationStatusResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClientsSplashAuthorizationStatusResultOutput)
}

// A collection of arguments for invoking getClientsSplashAuthorizationStatus.
type LookupClientsSplashAuthorizationStatusOutputArgs struct {
	// clientId path parameter. Client ID
	ClientId pulumi.StringInput `pulumi:"clientId"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (LookupClientsSplashAuthorizationStatusOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClientsSplashAuthorizationStatusArgs)(nil)).Elem()
}

// A collection of values returned by getClientsSplashAuthorizationStatus.
type LookupClientsSplashAuthorizationStatusResultOutput struct{ *pulumi.OutputState }

func (LookupClientsSplashAuthorizationStatusResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClientsSplashAuthorizationStatusResult)(nil)).Elem()
}

func (o LookupClientsSplashAuthorizationStatusResultOutput) ToLookupClientsSplashAuthorizationStatusResultOutput() LookupClientsSplashAuthorizationStatusResultOutput {
	return o
}

func (o LookupClientsSplashAuthorizationStatusResultOutput) ToLookupClientsSplashAuthorizationStatusResultOutputWithContext(ctx context.Context) LookupClientsSplashAuthorizationStatusResultOutput {
	return o
}

// clientId path parameter. Client ID
func (o LookupClientsSplashAuthorizationStatusResultOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientsSplashAuthorizationStatusResult) string { return v.ClientId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClientsSplashAuthorizationStatusResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientsSplashAuthorizationStatusResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupClientsSplashAuthorizationStatusResultOutput) Item() GetClientsSplashAuthorizationStatusItemOutput {
	return o.ApplyT(func(v LookupClientsSplashAuthorizationStatusResult) GetClientsSplashAuthorizationStatusItem {
		return v.Item
	}).(GetClientsSplashAuthorizationStatusItemOutput)
}

// networkId path parameter. Network ID
func (o LookupClientsSplashAuthorizationStatusResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientsSplashAuthorizationStatusResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClientsSplashAuthorizationStatusResultOutput{})
}
