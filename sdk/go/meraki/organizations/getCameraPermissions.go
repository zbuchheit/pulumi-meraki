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
//			example, err := organizations.GetCameraPermissions(ctx, &organizations.GetCameraPermissionsArgs{
//				OrganizationId:    "string",
//				PermissionScopeId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsCameraPermissionsExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetCameraPermissions(ctx *pulumi.Context, args *GetCameraPermissionsArgs, opts ...pulumi.InvokeOption) (*GetCameraPermissionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCameraPermissionsResult
	err := ctx.Invoke("meraki:organizations/getCameraPermissions:getCameraPermissions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCameraPermissions.
type GetCameraPermissionsArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// permissionScopeId path parameter. Permission scope ID
	PermissionScopeId string `pulumi:"permissionScopeId"`
}

// A collection of values returned by getCameraPermissions.
type GetCameraPermissionsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                   `pulumi:"id"`
	Item GetCameraPermissionsItem `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// permissionScopeId path parameter. Permission scope ID
	PermissionScopeId string `pulumi:"permissionScopeId"`
}

func GetCameraPermissionsOutput(ctx *pulumi.Context, args GetCameraPermissionsOutputArgs, opts ...pulumi.InvokeOption) GetCameraPermissionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCameraPermissionsResult, error) {
			args := v.(GetCameraPermissionsArgs)
			r, err := GetCameraPermissions(ctx, &args, opts...)
			var s GetCameraPermissionsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCameraPermissionsResultOutput)
}

// A collection of arguments for invoking getCameraPermissions.
type GetCameraPermissionsOutputArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// permissionScopeId path parameter. Permission scope ID
	PermissionScopeId pulumi.StringInput `pulumi:"permissionScopeId"`
}

func (GetCameraPermissionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCameraPermissionsArgs)(nil)).Elem()
}

// A collection of values returned by getCameraPermissions.
type GetCameraPermissionsResultOutput struct{ *pulumi.OutputState }

func (GetCameraPermissionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCameraPermissionsResult)(nil)).Elem()
}

func (o GetCameraPermissionsResultOutput) ToGetCameraPermissionsResultOutput() GetCameraPermissionsResultOutput {
	return o
}

func (o GetCameraPermissionsResultOutput) ToGetCameraPermissionsResultOutputWithContext(ctx context.Context) GetCameraPermissionsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetCameraPermissionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCameraPermissionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetCameraPermissionsResultOutput) Item() GetCameraPermissionsItemOutput {
	return o.ApplyT(func(v GetCameraPermissionsResult) GetCameraPermissionsItem { return v.Item }).(GetCameraPermissionsItemOutput)
}

// organizationId path parameter. Organization ID
func (o GetCameraPermissionsResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetCameraPermissionsResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// permissionScopeId path parameter. Permission scope ID
func (o GetCameraPermissionsResultOutput) PermissionScopeId() pulumi.StringOutput {
	return o.ApplyT(func(v GetCameraPermissionsResult) string { return v.PermissionScopeId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCameraPermissionsResultOutput{})
}