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
//			example, err := organizations.GetOpenapiSpec(ctx, &organizations.GetOpenapiSpecArgs{
//				OrganizationId: "string",
//				Version:        pulumi.IntRef(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsOpenapiSpecExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetOpenapiSpec(ctx *pulumi.Context, args *GetOpenapiSpecArgs, opts ...pulumi.InvokeOption) (*GetOpenapiSpecResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetOpenapiSpecResult
	err := ctx.Invoke("meraki:organizations/getOpenapiSpec:getOpenapiSpec", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOpenapiSpec.
type GetOpenapiSpecArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// version query parameter. OpenAPI Specification version to return. Default is 2
	Version *int `pulumi:"version"`
}

// A collection of values returned by getOpenapiSpec.
type GetOpenapiSpecResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string             `pulumi:"id"`
	Item GetOpenapiSpecItem `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// version query parameter. OpenAPI Specification version to return. Default is 2
	Version *int `pulumi:"version"`
}

func GetOpenapiSpecOutput(ctx *pulumi.Context, args GetOpenapiSpecOutputArgs, opts ...pulumi.InvokeOption) GetOpenapiSpecResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetOpenapiSpecResult, error) {
			args := v.(GetOpenapiSpecArgs)
			r, err := GetOpenapiSpec(ctx, &args, opts...)
			var s GetOpenapiSpecResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetOpenapiSpecResultOutput)
}

// A collection of arguments for invoking getOpenapiSpec.
type GetOpenapiSpecOutputArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// version query parameter. OpenAPI Specification version to return. Default is 2
	Version pulumi.IntPtrInput `pulumi:"version"`
}

func (GetOpenapiSpecOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOpenapiSpecArgs)(nil)).Elem()
}

// A collection of values returned by getOpenapiSpec.
type GetOpenapiSpecResultOutput struct{ *pulumi.OutputState }

func (GetOpenapiSpecResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOpenapiSpecResult)(nil)).Elem()
}

func (o GetOpenapiSpecResultOutput) ToGetOpenapiSpecResultOutput() GetOpenapiSpecResultOutput {
	return o
}

func (o GetOpenapiSpecResultOutput) ToGetOpenapiSpecResultOutputWithContext(ctx context.Context) GetOpenapiSpecResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetOpenapiSpecResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetOpenapiSpecResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetOpenapiSpecResultOutput) Item() GetOpenapiSpecItemOutput {
	return o.ApplyT(func(v GetOpenapiSpecResult) GetOpenapiSpecItem { return v.Item }).(GetOpenapiSpecItemOutput)
}

// organizationId path parameter. Organization ID
func (o GetOpenapiSpecResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetOpenapiSpecResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// version query parameter. OpenAPI Specification version to return. Default is 2
func (o GetOpenapiSpecResultOutput) Version() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetOpenapiSpecResult) *int { return v.Version }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetOpenapiSpecResultOutput{})
}
