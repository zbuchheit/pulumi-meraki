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
//			example, err := networks.LookupWirelessSsidsFirewallL3FirewallRules(ctx, &networks.LookupWirelessSsidsFirewallL3FirewallRulesArgs{
//				NetworkId: "string",
//				Number:    "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksWirelessSsidsFirewallL3FirewallRulesExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupWirelessSsidsFirewallL3FirewallRules(ctx *pulumi.Context, args *LookupWirelessSsidsFirewallL3FirewallRulesArgs, opts ...pulumi.InvokeOption) (*LookupWirelessSsidsFirewallL3FirewallRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWirelessSsidsFirewallL3FirewallRulesResult
	err := ctx.Invoke("meraki:networks/getWirelessSsidsFirewallL3FirewallRules:getWirelessSsidsFirewallL3FirewallRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessSsidsFirewallL3FirewallRules.
type LookupWirelessSsidsFirewallL3FirewallRulesArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
}

// A collection of values returned by getWirelessSsidsFirewallL3FirewallRules.
type LookupWirelessSsidsFirewallL3FirewallRulesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                                      `pulumi:"id"`
	Item GetWirelessSsidsFirewallL3FirewallRulesItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// number path parameter.
	Number string `pulumi:"number"`
}

func LookupWirelessSsidsFirewallL3FirewallRulesOutput(ctx *pulumi.Context, args LookupWirelessSsidsFirewallL3FirewallRulesOutputArgs, opts ...pulumi.InvokeOption) LookupWirelessSsidsFirewallL3FirewallRulesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupWirelessSsidsFirewallL3FirewallRulesResult, error) {
			args := v.(LookupWirelessSsidsFirewallL3FirewallRulesArgs)
			r, err := LookupWirelessSsidsFirewallL3FirewallRules(ctx, &args, opts...)
			var s LookupWirelessSsidsFirewallL3FirewallRulesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupWirelessSsidsFirewallL3FirewallRulesResultOutput)
}

// A collection of arguments for invoking getWirelessSsidsFirewallL3FirewallRules.
type LookupWirelessSsidsFirewallL3FirewallRulesOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// number path parameter.
	Number pulumi.StringInput `pulumi:"number"`
}

func (LookupWirelessSsidsFirewallL3FirewallRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsFirewallL3FirewallRulesArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessSsidsFirewallL3FirewallRules.
type LookupWirelessSsidsFirewallL3FirewallRulesResultOutput struct{ *pulumi.OutputState }

func (LookupWirelessSsidsFirewallL3FirewallRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsFirewallL3FirewallRulesResult)(nil)).Elem()
}

func (o LookupWirelessSsidsFirewallL3FirewallRulesResultOutput) ToLookupWirelessSsidsFirewallL3FirewallRulesResultOutput() LookupWirelessSsidsFirewallL3FirewallRulesResultOutput {
	return o
}

func (o LookupWirelessSsidsFirewallL3FirewallRulesResultOutput) ToLookupWirelessSsidsFirewallL3FirewallRulesResultOutputWithContext(ctx context.Context) LookupWirelessSsidsFirewallL3FirewallRulesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWirelessSsidsFirewallL3FirewallRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsFirewallL3FirewallRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupWirelessSsidsFirewallL3FirewallRulesResultOutput) Item() GetWirelessSsidsFirewallL3FirewallRulesItemOutput {
	return o.ApplyT(func(v LookupWirelessSsidsFirewallL3FirewallRulesResult) GetWirelessSsidsFirewallL3FirewallRulesItem {
		return v.Item
	}).(GetWirelessSsidsFirewallL3FirewallRulesItemOutput)
}

// networkId path parameter. Network ID
func (o LookupWirelessSsidsFirewallL3FirewallRulesResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsFirewallL3FirewallRulesResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// number path parameter.
func (o LookupWirelessSsidsFirewallL3FirewallRulesResultOutput) Number() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsFirewallL3FirewallRulesResult) string { return v.Number }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWirelessSsidsFirewallL3FirewallRulesResultOutput{})
}
