# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetAdaptivePolicyPoliciesResult',
    'AwaitableGetAdaptivePolicyPoliciesResult',
    'get_adaptive_policy_policies',
    'get_adaptive_policy_policies_output',
]

@pulumi.output_type
class GetAdaptivePolicyPoliciesResult:
    """
    A collection of values returned by getAdaptivePolicyPolicies.
    """
    def __init__(__self__, id=None, item=None, items=None, organization_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        """
        id path parameter.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetAdaptivePolicyPoliciesItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetAdaptivePolicyPoliciesItemResult']:
        """
        Array of ResponseOrganizationsGetOrganizationAdaptivePolicyPolicies
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")


class AwaitableGetAdaptivePolicyPoliciesResult(GetAdaptivePolicyPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAdaptivePolicyPoliciesResult(
            id=self.id,
            item=self.item,
            items=self.items,
            organization_id=self.organization_id)


def get_adaptive_policy_policies(id: Optional[str] = None,
                                 organization_id: Optional[str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAdaptivePolicyPoliciesResult:
    """
    ## Example Usage


    :param str id: id path parameter.
    :param str organization_id: organizationId path parameter. Organization ID
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['organizationId'] = organization_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:organizations/getAdaptivePolicyPolicies:getAdaptivePolicyPolicies', __args__, opts=opts, typ=GetAdaptivePolicyPoliciesResult).value

    return AwaitableGetAdaptivePolicyPoliciesResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        items=pulumi.get(__ret__, 'items'),
        organization_id=pulumi.get(__ret__, 'organization_id'))


@_utilities.lift_output_func(get_adaptive_policy_policies)
def get_adaptive_policy_policies_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                                        organization_id: Optional[pulumi.Input[Optional[str]]] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAdaptivePolicyPoliciesResult]:
    """
    ## Example Usage


    :param str id: id path parameter.
    :param str organization_id: organizationId path parameter. Organization ID
    """
    ...
