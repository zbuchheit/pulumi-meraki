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
//			example, err := networks.LookupSwitchDhcpServerPolicyArpInspectionTrustedServers(ctx, &networks.LookupSwitchDhcpServerPolicyArpInspectionTrustedServersArgs{
//				EndingBefore:  pulumi.StringRef("string"),
//				NetworkId:     "string",
//				PerPage:       pulumi.IntRef(1),
//				StartingAfter: pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSwitchDhcpServerPolicyArpInspectionTrustedServersExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func LookupSwitchDhcpServerPolicyArpInspectionTrustedServers(ctx *pulumi.Context, args *LookupSwitchDhcpServerPolicyArpInspectionTrustedServersArgs, opts ...pulumi.InvokeOption) (*LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult
	err := ctx.Invoke("meraki:networks/getSwitchDhcpServerPolicyArpInspectionTrustedServers:getSwitchDhcpServerPolicyArpInspectionTrustedServers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSwitchDhcpServerPolicyArpInspectionTrustedServers.
type LookupSwitchDhcpServerPolicyArpInspectionTrustedServersArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

// A collection of values returned by getSwitchDhcpServerPolicyArpInspectionTrustedServers.
type LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseSwitchGetNetworkSwitchDhcpServerPolicyArpInspectionTrustedServers
	Items []GetSwitchDhcpServerPolicyArpInspectionTrustedServersItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

func LookupSwitchDhcpServerPolicyArpInspectionTrustedServersOutput(ctx *pulumi.Context, args LookupSwitchDhcpServerPolicyArpInspectionTrustedServersOutputArgs, opts ...pulumi.InvokeOption) LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult, error) {
			args := v.(LookupSwitchDhcpServerPolicyArpInspectionTrustedServersArgs)
			r, err := LookupSwitchDhcpServerPolicyArpInspectionTrustedServers(ctx, &args, opts...)
			var s LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput)
}

// A collection of arguments for invoking getSwitchDhcpServerPolicyArpInspectionTrustedServers.
type LookupSwitchDhcpServerPolicyArpInspectionTrustedServersOutputArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
}

func (LookupSwitchDhcpServerPolicyArpInspectionTrustedServersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchDhcpServerPolicyArpInspectionTrustedServersArgs)(nil)).Elem()
}

// A collection of values returned by getSwitchDhcpServerPolicyArpInspectionTrustedServers.
type LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput struct{ *pulumi.OutputState }

func (LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult)(nil)).Elem()
}

func (o LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput) ToLookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput() LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput {
	return o
}

func (o LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput) ToLookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutputWithContext(ctx context.Context) LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput {
	return o
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseSwitchGetNetworkSwitchDhcpServerPolicyArpInspectionTrustedServers
func (o LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput) Items() GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemArrayOutput {
	return o.ApplyT(func(v LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult) []GetSwitchDhcpServerPolicyArpInspectionTrustedServersItem {
		return v.Items
	}).(GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemArrayOutput)
}

// networkId path parameter. Network ID
func (o LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
func (o LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSwitchDhcpServerPolicyArpInspectionTrustedServersResultOutput{})
}