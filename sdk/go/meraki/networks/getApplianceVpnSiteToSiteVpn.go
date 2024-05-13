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
//			example, err := networks.LookupApplianceVpnSiteToSiteVpn(ctx, &networks.LookupApplianceVpnSiteToSiteVpnArgs{
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksApplianceVpnSiteToSiteVpnExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupApplianceVpnSiteToSiteVpn(ctx *pulumi.Context, args *LookupApplianceVpnSiteToSiteVpnArgs, opts ...pulumi.InvokeOption) (*LookupApplianceVpnSiteToSiteVpnResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApplianceVpnSiteToSiteVpnResult
	err := ctx.Invoke("meraki:networks/getApplianceVpnSiteToSiteVpn:getApplianceVpnSiteToSiteVpn", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplianceVpnSiteToSiteVpn.
type LookupApplianceVpnSiteToSiteVpnArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getApplianceVpnSiteToSiteVpn.
type LookupApplianceVpnSiteToSiteVpnResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                           `pulumi:"id"`
	Item GetApplianceVpnSiteToSiteVpnItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func LookupApplianceVpnSiteToSiteVpnOutput(ctx *pulumi.Context, args LookupApplianceVpnSiteToSiteVpnOutputArgs, opts ...pulumi.InvokeOption) LookupApplianceVpnSiteToSiteVpnResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupApplianceVpnSiteToSiteVpnResult, error) {
			args := v.(LookupApplianceVpnSiteToSiteVpnArgs)
			r, err := LookupApplianceVpnSiteToSiteVpn(ctx, &args, opts...)
			var s LookupApplianceVpnSiteToSiteVpnResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupApplianceVpnSiteToSiteVpnResultOutput)
}

// A collection of arguments for invoking getApplianceVpnSiteToSiteVpn.
type LookupApplianceVpnSiteToSiteVpnOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (LookupApplianceVpnSiteToSiteVpnOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceVpnSiteToSiteVpnArgs)(nil)).Elem()
}

// A collection of values returned by getApplianceVpnSiteToSiteVpn.
type LookupApplianceVpnSiteToSiteVpnResultOutput struct{ *pulumi.OutputState }

func (LookupApplianceVpnSiteToSiteVpnResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceVpnSiteToSiteVpnResult)(nil)).Elem()
}

func (o LookupApplianceVpnSiteToSiteVpnResultOutput) ToLookupApplianceVpnSiteToSiteVpnResultOutput() LookupApplianceVpnSiteToSiteVpnResultOutput {
	return o
}

func (o LookupApplianceVpnSiteToSiteVpnResultOutput) ToLookupApplianceVpnSiteToSiteVpnResultOutputWithContext(ctx context.Context) LookupApplianceVpnSiteToSiteVpnResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApplianceVpnSiteToSiteVpnResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceVpnSiteToSiteVpnResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupApplianceVpnSiteToSiteVpnResultOutput) Item() GetApplianceVpnSiteToSiteVpnItemOutput {
	return o.ApplyT(func(v LookupApplianceVpnSiteToSiteVpnResult) GetApplianceVpnSiteToSiteVpnItem { return v.Item }).(GetApplianceVpnSiteToSiteVpnItemOutput)
}

// networkId path parameter. Network ID
func (o LookupApplianceVpnSiteToSiteVpnResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceVpnSiteToSiteVpnResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplianceVpnSiteToSiteVpnResultOutput{})
}