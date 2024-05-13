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
//			example, err := organizations.LookupLoginSecurity(ctx, &organizations.LookupLoginSecurityArgs{
//				OrganizationId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsLoginSecurityExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupLoginSecurity(ctx *pulumi.Context, args *LookupLoginSecurityArgs, opts ...pulumi.InvokeOption) (*LookupLoginSecurityResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupLoginSecurityResult
	err := ctx.Invoke("meraki:organizations/getLoginSecurity:getLoginSecurity", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLoginSecurity.
type LookupLoginSecurityArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

// A collection of values returned by getLoginSecurity.
type LookupLoginSecurityResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string               `pulumi:"id"`
	Item GetLoginSecurityItem `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

func LookupLoginSecurityOutput(ctx *pulumi.Context, args LookupLoginSecurityOutputArgs, opts ...pulumi.InvokeOption) LookupLoginSecurityResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupLoginSecurityResult, error) {
			args := v.(LookupLoginSecurityArgs)
			r, err := LookupLoginSecurity(ctx, &args, opts...)
			var s LookupLoginSecurityResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupLoginSecurityResultOutput)
}

// A collection of arguments for invoking getLoginSecurity.
type LookupLoginSecurityOutputArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
}

func (LookupLoginSecurityOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoginSecurityArgs)(nil)).Elem()
}

// A collection of values returned by getLoginSecurity.
type LookupLoginSecurityResultOutput struct{ *pulumi.OutputState }

func (LookupLoginSecurityResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoginSecurityResult)(nil)).Elem()
}

func (o LookupLoginSecurityResultOutput) ToLookupLoginSecurityResultOutput() LookupLoginSecurityResultOutput {
	return o
}

func (o LookupLoginSecurityResultOutput) ToLookupLoginSecurityResultOutputWithContext(ctx context.Context) LookupLoginSecurityResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupLoginSecurityResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoginSecurityResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupLoginSecurityResultOutput) Item() GetLoginSecurityItemOutput {
	return o.ApplyT(func(v LookupLoginSecurityResult) GetLoginSecurityItem { return v.Item }).(GetLoginSecurityItemOutput)
}

// organizationId path parameter. Organization ID
func (o LookupLoginSecurityResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoginSecurityResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLoginSecurityResultOutput{})
}