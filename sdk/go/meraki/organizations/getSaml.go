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
//			example, err := organizations.LookupSaml(ctx, &organizations.LookupSamlArgs{
//				OrganizationId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsSamlExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupSaml(ctx *pulumi.Context, args *LookupSamlArgs, opts ...pulumi.InvokeOption) (*LookupSamlResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSamlResult
	err := ctx.Invoke("meraki:organizations/getSaml:getSaml", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSaml.
type LookupSamlArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

// A collection of values returned by getSaml.
type LookupSamlResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string      `pulumi:"id"`
	Item GetSamlItem `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

func LookupSamlOutput(ctx *pulumi.Context, args LookupSamlOutputArgs, opts ...pulumi.InvokeOption) LookupSamlResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSamlResult, error) {
			args := v.(LookupSamlArgs)
			r, err := LookupSaml(ctx, &args, opts...)
			var s LookupSamlResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSamlResultOutput)
}

// A collection of arguments for invoking getSaml.
type LookupSamlOutputArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
}

func (LookupSamlOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSamlArgs)(nil)).Elem()
}

// A collection of values returned by getSaml.
type LookupSamlResultOutput struct{ *pulumi.OutputState }

func (LookupSamlResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSamlResult)(nil)).Elem()
}

func (o LookupSamlResultOutput) ToLookupSamlResultOutput() LookupSamlResultOutput {
	return o
}

func (o LookupSamlResultOutput) ToLookupSamlResultOutputWithContext(ctx context.Context) LookupSamlResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSamlResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSamlResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSamlResultOutput) Item() GetSamlItemOutput {
	return o.ApplyT(func(v LookupSamlResult) GetSamlItem { return v.Item }).(GetSamlItemOutput)
}

// organizationId path parameter. Organization ID
func (o LookupSamlResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSamlResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSamlResultOutput{})
}