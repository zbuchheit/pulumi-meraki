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
    'GetPolicyObjectsGroupsResult',
    'AwaitableGetPolicyObjectsGroupsResult',
    'get_policy_objects_groups',
    'get_policy_objects_groups_output',
]

@pulumi.output_type
class GetPolicyObjectsGroupsResult:
    """
    A collection of values returned by getPolicyObjectsGroups.
    """
    def __init__(__self__, ending_before=None, id=None, item=None, organization_id=None, per_page=None, policy_object_group_id=None, starting_after=None):
        if ending_before and not isinstance(ending_before, str):
            raise TypeError("Expected argument 'ending_before' to be a str")
        pulumi.set(__self__, "ending_before", ending_before)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)
        if per_page and not isinstance(per_page, int):
            raise TypeError("Expected argument 'per_page' to be a int")
        pulumi.set(__self__, "per_page", per_page)
        if policy_object_group_id and not isinstance(policy_object_group_id, str):
            raise TypeError("Expected argument 'policy_object_group_id' to be a str")
        pulumi.set(__self__, "policy_object_group_id", policy_object_group_id)
        if starting_after and not isinstance(starting_after, str):
            raise TypeError("Expected argument 'starting_after' to be a str")
        pulumi.set(__self__, "starting_after", starting_after)

    @property
    @pulumi.getter(name="endingBefore")
    def ending_before(self) -> Optional[str]:
        """
        endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "ending_before")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetPolicyObjectsGroupsItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="perPage")
    def per_page(self) -> Optional[int]:
        """
        perPage query parameter. The number of entries per page returned. Acceptable range is 10 1000. Default is 1000.
        """
        return pulumi.get(self, "per_page")

    @property
    @pulumi.getter(name="policyObjectGroupId")
    def policy_object_group_id(self) -> Optional[str]:
        """
        policyObjectGroupId path parameter. Policy object group ID
        """
        return pulumi.get(self, "policy_object_group_id")

    @property
    @pulumi.getter(name="startingAfter")
    def starting_after(self) -> Optional[str]:
        """
        startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "starting_after")


class AwaitableGetPolicyObjectsGroupsResult(GetPolicyObjectsGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPolicyObjectsGroupsResult(
            ending_before=self.ending_before,
            id=self.id,
            item=self.item,
            organization_id=self.organization_id,
            per_page=self.per_page,
            policy_object_group_id=self.policy_object_group_id,
            starting_after=self.starting_after)


def get_policy_objects_groups(ending_before: Optional[str] = None,
                              organization_id: Optional[str] = None,
                              per_page: Optional[int] = None,
                              policy_object_group_id: Optional[str] = None,
                              starting_after: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPolicyObjectsGroupsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_policy_objects_groups(ending_before="string",
        organization_id="string",
        per_page=1,
        starting_after="string")
    pulumi.export("merakiOrganizationsPolicyObjectsGroupsExample", example.item)
    ```


    :param str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param str organization_id: organizationId path parameter. Organization ID
    :param int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 10 1000. Default is 1000.
    :param str policy_object_group_id: policyObjectGroupId path parameter. Policy object group ID
    :param str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    """
    __args__ = dict()
    __args__['endingBefore'] = ending_before
    __args__['organizationId'] = organization_id
    __args__['perPage'] = per_page
    __args__['policyObjectGroupId'] = policy_object_group_id
    __args__['startingAfter'] = starting_after
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:organizations/getPolicyObjectsGroups:getPolicyObjectsGroups', __args__, opts=opts, typ=GetPolicyObjectsGroupsResult).value

    return AwaitableGetPolicyObjectsGroupsResult(
        ending_before=pulumi.get(__ret__, 'ending_before'),
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        organization_id=pulumi.get(__ret__, 'organization_id'),
        per_page=pulumi.get(__ret__, 'per_page'),
        policy_object_group_id=pulumi.get(__ret__, 'policy_object_group_id'),
        starting_after=pulumi.get(__ret__, 'starting_after'))


@_utilities.lift_output_func(get_policy_objects_groups)
def get_policy_objects_groups_output(ending_before: Optional[pulumi.Input[Optional[str]]] = None,
                                     organization_id: Optional[pulumi.Input[Optional[str]]] = None,
                                     per_page: Optional[pulumi.Input[Optional[int]]] = None,
                                     policy_object_group_id: Optional[pulumi.Input[Optional[str]]] = None,
                                     starting_after: Optional[pulumi.Input[Optional[str]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPolicyObjectsGroupsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_policy_objects_groups(ending_before="string",
        organization_id="string",
        per_page=1,
        starting_after="string")
    pulumi.export("merakiOrganizationsPolicyObjectsGroupsExample", example.item)
    ```


    :param str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param str organization_id: organizationId path parameter. Organization ID
    :param int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 10 1000. Default is 1000.
    :param str policy_object_group_id: policyObjectGroupId path parameter. Policy object group ID
    :param str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    """
    ...