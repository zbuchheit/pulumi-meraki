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
//			example, err := organizations.GetDevicesUplinksAddressesByDevice(ctx, &organizations.GetDevicesUplinksAddressesByDeviceArgs{
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
//				Tags: []string{
//					"string",
//				},
//				TagsFilterType: pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsDevicesUplinksAddressesByDeviceExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetDevicesUplinksAddressesByDevice(ctx *pulumi.Context, args *GetDevicesUplinksAddressesByDeviceArgs, opts ...pulumi.InvokeOption) (*GetDevicesUplinksAddressesByDeviceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDevicesUplinksAddressesByDeviceResult
	err := ctx.Invoke("meraki:organizations/getDevicesUplinksAddressesByDevice:getDevicesUplinksAddressesByDevice", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDevicesUplinksAddressesByDevice.
type GetDevicesUplinksAddressesByDeviceArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
	ProductTypes []string `pulumi:"productTypes"`
	// serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
	Tags []string `pulumi:"tags"`
	// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
	TagsFilterType *string `pulumi:"tagsFilterType"`
}

// A collection of values returned by getDevicesUplinksAddressesByDevice.
type GetDevicesUplinksAddressesByDeviceResult struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseOrganizationsGetOrganizationDevicesUplinksAddressesByDevice
	Items []GetDevicesUplinksAddressesByDeviceItem `pulumi:"items"`
	// networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
	ProductTypes []string `pulumi:"productTypes"`
	// serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
	Tags []string `pulumi:"tags"`
	// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
	TagsFilterType *string `pulumi:"tagsFilterType"`
}

func GetDevicesUplinksAddressesByDeviceOutput(ctx *pulumi.Context, args GetDevicesUplinksAddressesByDeviceOutputArgs, opts ...pulumi.InvokeOption) GetDevicesUplinksAddressesByDeviceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDevicesUplinksAddressesByDeviceResult, error) {
			args := v.(GetDevicesUplinksAddressesByDeviceArgs)
			r, err := GetDevicesUplinksAddressesByDevice(ctx, &args, opts...)
			var s GetDevicesUplinksAddressesByDeviceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDevicesUplinksAddressesByDeviceResultOutput)
}

// A collection of arguments for invoking getDevicesUplinksAddressesByDevice.
type GetDevicesUplinksAddressesByDeviceOutputArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
	NetworkIds pulumi.StringArrayInput `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
	ProductTypes pulumi.StringArrayInput `pulumi:"productTypes"`
	// serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
	Serials pulumi.StringArrayInput `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
	// tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
	Tags pulumi.StringArrayInput `pulumi:"tags"`
	// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
	TagsFilterType pulumi.StringPtrInput `pulumi:"tagsFilterType"`
}

func (GetDevicesUplinksAddressesByDeviceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicesUplinksAddressesByDeviceArgs)(nil)).Elem()
}

// A collection of values returned by getDevicesUplinksAddressesByDevice.
type GetDevicesUplinksAddressesByDeviceResultOutput struct{ *pulumi.OutputState }

func (GetDevicesUplinksAddressesByDeviceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicesUplinksAddressesByDeviceResult)(nil)).Elem()
}

func (o GetDevicesUplinksAddressesByDeviceResultOutput) ToGetDevicesUplinksAddressesByDeviceResultOutput() GetDevicesUplinksAddressesByDeviceResultOutput {
	return o
}

func (o GetDevicesUplinksAddressesByDeviceResultOutput) ToGetDevicesUplinksAddressesByDeviceResultOutputWithContext(ctx context.Context) GetDevicesUplinksAddressesByDeviceResultOutput {
	return o
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetDevicesUplinksAddressesByDeviceResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesUplinksAddressesByDeviceResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDevicesUplinksAddressesByDeviceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicesUplinksAddressesByDeviceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseOrganizationsGetOrganizationDevicesUplinksAddressesByDevice
func (o GetDevicesUplinksAddressesByDeviceResultOutput) Items() GetDevicesUplinksAddressesByDeviceItemArrayOutput {
	return o.ApplyT(func(v GetDevicesUplinksAddressesByDeviceResult) []GetDevicesUplinksAddressesByDeviceItem {
		return v.Items
	}).(GetDevicesUplinksAddressesByDeviceItemArrayOutput)
}

// networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
func (o GetDevicesUplinksAddressesByDeviceResultOutput) NetworkIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesUplinksAddressesByDeviceResult) []string { return v.NetworkIds }).(pulumi.StringArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetDevicesUplinksAddressesByDeviceResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicesUplinksAddressesByDeviceResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
func (o GetDevicesUplinksAddressesByDeviceResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDevicesUplinksAddressesByDeviceResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
func (o GetDevicesUplinksAddressesByDeviceResultOutput) ProductTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesUplinksAddressesByDeviceResult) []string { return v.ProductTypes }).(pulumi.StringArrayOutput)
}

// serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
func (o GetDevicesUplinksAddressesByDeviceResultOutput) Serials() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesUplinksAddressesByDeviceResult) []string { return v.Serials }).(pulumi.StringArrayOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetDevicesUplinksAddressesByDeviceResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesUplinksAddressesByDeviceResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

// tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
func (o GetDevicesUplinksAddressesByDeviceResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesUplinksAddressesByDeviceResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
func (o GetDevicesUplinksAddressesByDeviceResultOutput) TagsFilterType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesUplinksAddressesByDeviceResult) *string { return v.TagsFilterType }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDevicesUplinksAddressesByDeviceResultOutput{})
}
