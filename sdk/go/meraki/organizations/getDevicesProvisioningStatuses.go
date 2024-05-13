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
//			example, err := organizations.GetDevicesProvisioningStatuses(ctx, &organizations.GetDevicesProvisioningStatusesArgs{
//				EndingBefore: pulumi.StringRef("string"),
//				NetworkIds: []string{
//					"string",
//				},
//				OrganizationId: "string",
//				PerPage:        pulumi.IntRef(1),
//				ProductTypes: []string{
//					"string",
//				},
//				Serials: []string{
//					"string",
//				},
//				StartingAfter: pulumi.StringRef("string"),
//				Status:        pulumi.StringRef("string"),
//				Tags: []string{
//					"string",
//				},
//				TagsFilterType: pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsDevicesProvisioningStatusesExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetDevicesProvisioningStatuses(ctx *pulumi.Context, args *GetDevicesProvisioningStatusesArgs, opts ...pulumi.InvokeOption) (*GetDevicesProvisioningStatusesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDevicesProvisioningStatusesResult
	err := ctx.Invoke("meraki:organizations/getDevicesProvisioningStatuses:getDevicesProvisioningStatuses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDevicesProvisioningStatuses.
type GetDevicesProvisioningStatusesArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// networkIds query parameter. Optional parameter to filter device by network ID. This filter uses multiple exact matches.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter device by device product types. This filter uses multiple exact matches.
	ProductTypes []string `pulumi:"productTypes"`
	// serials query parameter. Optional parameter to filter device by device serial numbers. This filter uses multiple exact matches.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// status query parameter. An optional parameter to filter devices by the provisioning status. Accepted statuses: unprovisioned, incomplete, complete.
	Status *string `pulumi:"status"`
	// tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
	Tags []string `pulumi:"tags"`
	// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
	TagsFilterType *string `pulumi:"tagsFilterType"`
}

// A collection of values returned by getDevicesProvisioningStatuses.
type GetDevicesProvisioningStatusesResult struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseOrganizationsGetOrganizationDevicesProvisioningStatuses
	Items []GetDevicesProvisioningStatusesItem `pulumi:"items"`
	// networkIds query parameter. Optional parameter to filter device by network ID. This filter uses multiple exact matches.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter device by device product types. This filter uses multiple exact matches.
	ProductTypes []string `pulumi:"productTypes"`
	// serials query parameter. Optional parameter to filter device by device serial numbers. This filter uses multiple exact matches.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// status query parameter. An optional parameter to filter devices by the provisioning status. Accepted statuses: unprovisioned, incomplete, complete.
	Status *string `pulumi:"status"`
	// tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
	Tags []string `pulumi:"tags"`
	// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
	TagsFilterType *string `pulumi:"tagsFilterType"`
}

func GetDevicesProvisioningStatusesOutput(ctx *pulumi.Context, args GetDevicesProvisioningStatusesOutputArgs, opts ...pulumi.InvokeOption) GetDevicesProvisioningStatusesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDevicesProvisioningStatusesResult, error) {
			args := v.(GetDevicesProvisioningStatusesArgs)
			r, err := GetDevicesProvisioningStatuses(ctx, &args, opts...)
			var s GetDevicesProvisioningStatusesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDevicesProvisioningStatusesResultOutput)
}

// A collection of arguments for invoking getDevicesProvisioningStatuses.
type GetDevicesProvisioningStatusesOutputArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// networkIds query parameter. Optional parameter to filter device by network ID. This filter uses multiple exact matches.
	NetworkIds pulumi.StringArrayInput `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter device by device product types. This filter uses multiple exact matches.
	ProductTypes pulumi.StringArrayInput `pulumi:"productTypes"`
	// serials query parameter. Optional parameter to filter device by device serial numbers. This filter uses multiple exact matches.
	Serials pulumi.StringArrayInput `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
	// status query parameter. An optional parameter to filter devices by the provisioning status. Accepted statuses: unprovisioned, incomplete, complete.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
	Tags pulumi.StringArrayInput `pulumi:"tags"`
	// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
	TagsFilterType pulumi.StringPtrInput `pulumi:"tagsFilterType"`
}

func (GetDevicesProvisioningStatusesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicesProvisioningStatusesArgs)(nil)).Elem()
}

// A collection of values returned by getDevicesProvisioningStatuses.
type GetDevicesProvisioningStatusesResultOutput struct{ *pulumi.OutputState }

func (GetDevicesProvisioningStatusesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicesProvisioningStatusesResult)(nil)).Elem()
}

func (o GetDevicesProvisioningStatusesResultOutput) ToGetDevicesProvisioningStatusesResultOutput() GetDevicesProvisioningStatusesResultOutput {
	return o
}

func (o GetDevicesProvisioningStatusesResultOutput) ToGetDevicesProvisioningStatusesResultOutputWithContext(ctx context.Context) GetDevicesProvisioningStatusesResultOutput {
	return o
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetDevicesProvisioningStatusesResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDevicesProvisioningStatusesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseOrganizationsGetOrganizationDevicesProvisioningStatuses
func (o GetDevicesProvisioningStatusesResultOutput) Items() GetDevicesProvisioningStatusesItemArrayOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) []GetDevicesProvisioningStatusesItem { return v.Items }).(GetDevicesProvisioningStatusesItemArrayOutput)
}

// networkIds query parameter. Optional parameter to filter device by network ID. This filter uses multiple exact matches.
func (o GetDevicesProvisioningStatusesResultOutput) NetworkIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) []string { return v.NetworkIds }).(pulumi.StringArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetDevicesProvisioningStatusesResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
func (o GetDevicesProvisioningStatusesResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// productTypes query parameter. Optional parameter to filter device by device product types. This filter uses multiple exact matches.
func (o GetDevicesProvisioningStatusesResultOutput) ProductTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) []string { return v.ProductTypes }).(pulumi.StringArrayOutput)
}

// serials query parameter. Optional parameter to filter device by device serial numbers. This filter uses multiple exact matches.
func (o GetDevicesProvisioningStatusesResultOutput) Serials() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) []string { return v.Serials }).(pulumi.StringArrayOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetDevicesProvisioningStatusesResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

// status query parameter. An optional parameter to filter devices by the provisioning status. Accepted statuses: unprovisioned, incomplete, complete.
func (o GetDevicesProvisioningStatusesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
func (o GetDevicesProvisioningStatusesResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
func (o GetDevicesProvisioningStatusesResultOutput) TagsFilterType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesProvisioningStatusesResult) *string { return v.TagsFilterType }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDevicesProvisioningStatusesResultOutput{})
}