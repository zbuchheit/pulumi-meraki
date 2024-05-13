// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := organizations.LookupApplianceVpnThirdPartyVpnpeers(ctx, &organizations.LookupApplianceVpnThirdPartyVpnpeersArgs{
//				OrganizationId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsApplianceVpnThirdPartyVpnpeersExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupApplianceVpnThirdPartyVpnpeers(ctx *pulumi.Context, args *LookupApplianceVpnThirdPartyVpnpeersArgs, opts ...pulumi.InvokeOption) (*LookupApplianceVpnThirdPartyVpnpeersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApplianceVpnThirdPartyVpnpeersResult
	err := ctx.Invoke("meraki:organizations/getApplianceVpnThirdPartyVpnpeers:getApplianceVpnThirdPartyVpnpeers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplianceVpnThirdPartyVpnpeers.
type LookupApplianceVpnThirdPartyVpnpeersArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

// A collection of values returned by getApplianceVpnThirdPartyVpnpeers.
type LookupApplianceVpnThirdPartyVpnpeersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                                `pulumi:"id"`
	Item GetApplianceVpnThirdPartyVpnpeersItem `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

func LookupApplianceVpnThirdPartyVpnpeersOutput(ctx *pulumi.Context, args LookupApplianceVpnThirdPartyVpnpeersOutputArgs, opts ...pulumi.InvokeOption) LookupApplianceVpnThirdPartyVpnpeersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupApplianceVpnThirdPartyVpnpeersResult, error) {
			args := v.(LookupApplianceVpnThirdPartyVpnpeersArgs)
			r, err := LookupApplianceVpnThirdPartyVpnpeers(ctx, &args, opts...)
			var s LookupApplianceVpnThirdPartyVpnpeersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupApplianceVpnThirdPartyVpnpeersResultOutput)
}

// A collection of arguments for invoking getApplianceVpnThirdPartyVpnpeers.
type LookupApplianceVpnThirdPartyVpnpeersOutputArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
}

func (LookupApplianceVpnThirdPartyVpnpeersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceVpnThirdPartyVpnpeersArgs)(nil)).Elem()
}

// A collection of values returned by getApplianceVpnThirdPartyVpnpeers.
type LookupApplianceVpnThirdPartyVpnpeersResultOutput struct{ *pulumi.OutputState }

func (LookupApplianceVpnThirdPartyVpnpeersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceVpnThirdPartyVpnpeersResult)(nil)).Elem()
}

func (o LookupApplianceVpnThirdPartyVpnpeersResultOutput) ToLookupApplianceVpnThirdPartyVpnpeersResultOutput() LookupApplianceVpnThirdPartyVpnpeersResultOutput {
	return o
}

func (o LookupApplianceVpnThirdPartyVpnpeersResultOutput) ToLookupApplianceVpnThirdPartyVpnpeersResultOutputWithContext(ctx context.Context) LookupApplianceVpnThirdPartyVpnpeersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApplianceVpnThirdPartyVpnpeersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceVpnThirdPartyVpnpeersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupApplianceVpnThirdPartyVpnpeersResultOutput) Item() GetApplianceVpnThirdPartyVpnpeersItemOutput {
	return o.ApplyT(func(v LookupApplianceVpnThirdPartyVpnpeersResult) GetApplianceVpnThirdPartyVpnpeersItem {
		return v.Item
	}).(GetApplianceVpnThirdPartyVpnpeersItemOutput)
}

// organizationId path parameter. Organization ID
func (o LookupApplianceVpnThirdPartyVpnpeersResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceVpnThirdPartyVpnpeersResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplianceVpnThirdPartyVpnpeersResultOutput{})
}