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
//			example, err := networks.LookupWirelessSsidsFirewallL7FirewallRules(ctx, &networks.LookupWirelessSsidsFirewallL7FirewallRulesArgs{
//				NetworkId: "string",
//				Number:    "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksWirelessSsidsFirewallL7FirewallRulesExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupWirelessSsidsFirewallL7FirewallRules(ctx *pulumi.Context, args *LookupWirelessSsidsFirewallL7FirewallRulesArgs, opts ...pulumi.InvokeOption) (*LookupWirelessSsidsFirewallL7FirewallRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWirelessSsidsFirewallL7FirewallRulesResult
	err := ctx.Invoke("meraki:networks/getWirelessSsidsFirewallL7FirewallRules:getWirelessSsidsFirewallL7FirewallRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessSsidsFirewallL7FirewallRules.
type LookupWirelessSsidsFirewallL7FirewallRulesArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
}

// A collection of values returned by getWirelessSsidsFirewallL7FirewallRules.
type LookupWirelessSsidsFirewallL7FirewallRulesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                                      `pulumi:"id"`
	Item GetWirelessSsidsFirewallL7FirewallRulesItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
}

func LookupWirelessSsidsFirewallL7FirewallRulesOutput(ctx *pulumi.Context, args LookupWirelessSsidsFirewallL7FirewallRulesOutputArgs, opts ...pulumi.InvokeOption) LookupWirelessSsidsFirewallL7FirewallRulesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupWirelessSsidsFirewallL7FirewallRulesResult, error) {
			args := v.(LookupWirelessSsidsFirewallL7FirewallRulesArgs)
			r, err := LookupWirelessSsidsFirewallL7FirewallRules(ctx, &args, opts...)
			var s LookupWirelessSsidsFirewallL7FirewallRulesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupWirelessSsidsFirewallL7FirewallRulesResultOutput)
}

// A collection of arguments for invoking getWirelessSsidsFirewallL7FirewallRules.
type LookupWirelessSsidsFirewallL7FirewallRulesOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// number path parameter.
	Number pulumi.StringInput `pulumi:"number"`
}

func (LookupWirelessSsidsFirewallL7FirewallRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsFirewallL7FirewallRulesArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessSsidsFirewallL7FirewallRules.
type LookupWirelessSsidsFirewallL7FirewallRulesResultOutput struct{ *pulumi.OutputState }

func (LookupWirelessSsidsFirewallL7FirewallRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsFirewallL7FirewallRulesResult)(nil)).Elem()
}

func (o LookupWirelessSsidsFirewallL7FirewallRulesResultOutput) ToLookupWirelessSsidsFirewallL7FirewallRulesResultOutput() LookupWirelessSsidsFirewallL7FirewallRulesResultOutput {
	return o
}

func (o LookupWirelessSsidsFirewallL7FirewallRulesResultOutput) ToLookupWirelessSsidsFirewallL7FirewallRulesResultOutputWithContext(ctx context.Context) LookupWirelessSsidsFirewallL7FirewallRulesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWirelessSsidsFirewallL7FirewallRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsFirewallL7FirewallRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupWirelessSsidsFirewallL7FirewallRulesResultOutput) Item() GetWirelessSsidsFirewallL7FirewallRulesItemOutput {
	return o.ApplyT(func(v LookupWirelessSsidsFirewallL7FirewallRulesResult) GetWirelessSsidsFirewallL7FirewallRulesItem {
		return v.Item
	}).(GetWirelessSsidsFirewallL7FirewallRulesItemOutput)
}

// networkId path parameter. Network ID
func (o LookupWirelessSsidsFirewallL7FirewallRulesResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsFirewallL7FirewallRulesResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// number path parameter.
func (o LookupWirelessSsidsFirewallL7FirewallRulesResultOutput) Number() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsFirewallL7FirewallRulesResult) string { return v.Number }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWirelessSsidsFirewallL7FirewallRulesResultOutput{})
}
