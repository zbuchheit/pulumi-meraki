// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package administered

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "meraki:administered/licensingSubscriptionSubscriptionsBind:LicensingSubscriptionSubscriptionsBind":
		r = &LicensingSubscriptionSubscriptionsBind{}
	case "meraki:administered/licensingSubscriptionSubscriptionsClaim:LicensingSubscriptionSubscriptionsClaim":
		r = &LicensingSubscriptionSubscriptionsClaim{}
	case "meraki:administered/licensingSubscriptionSubscriptionsClaimKeyValidate:LicensingSubscriptionSubscriptionsClaimKeyValidate":
		r = &LicensingSubscriptionSubscriptionsClaimKeyValidate{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"meraki",
		"administered/licensingSubscriptionSubscriptionsBind",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"administered/licensingSubscriptionSubscriptionsClaim",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"administered/licensingSubscriptionSubscriptionsClaimKeyValidate",
		&module{version},
	)
}