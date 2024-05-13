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
    'GetVlanProfilesAssignmentsByDeviceResult',
    'AwaitableGetVlanProfilesAssignmentsByDeviceResult',
    'get_vlan_profiles_assignments_by_device',
    'get_vlan_profiles_assignments_by_device_output',
]

@pulumi.output_type
class GetVlanProfilesAssignmentsByDeviceResult:
    """
    A collection of values returned by getVlanProfilesAssignmentsByDevice.
    """
    def __init__(__self__, ending_before=None, id=None, items=None, network_id=None, per_page=None, product_types=None, serials=None, stack_ids=None, starting_after=None):
        if ending_before and not isinstance(ending_before, str):
            raise TypeError("Expected argument 'ending_before' to be a str")
        pulumi.set(__self__, "ending_before", ending_before)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)
        if per_page and not isinstance(per_page, int):
            raise TypeError("Expected argument 'per_page' to be a int")
        pulumi.set(__self__, "per_page", per_page)
        if product_types and not isinstance(product_types, list):
            raise TypeError("Expected argument 'product_types' to be a list")
        pulumi.set(__self__, "product_types", product_types)
        if serials and not isinstance(serials, list):
            raise TypeError("Expected argument 'serials' to be a list")
        pulumi.set(__self__, "serials", serials)
        if stack_ids and not isinstance(stack_ids, list):
            raise TypeError("Expected argument 'stack_ids' to be a list")
        pulumi.set(__self__, "stack_ids", stack_ids)
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
    def items(self) -> Sequence['outputs.GetVlanProfilesAssignmentsByDeviceItemResult']:
        """
        Array of ResponseNetworksGetNetworkVlanProfilesAssignmentsByDevice
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> str:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter(name="perPage")
    def per_page(self) -> Optional[int]:
        """
        perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        """
        return pulumi.get(self, "per_page")

    @property
    @pulumi.getter(name="productTypes")
    def product_types(self) -> Optional[Sequence[str]]:
        """
        productTypes query parameter. Optional parameter to filter devices by product types.
        """
        return pulumi.get(self, "product_types")

    @property
    @pulumi.getter
    def serials(self) -> Optional[Sequence[str]]:
        """
        serials query parameter. Optional parameter to filter devices by serials. All devices returned belong to serial numbers that are an exact match.
        """
        return pulumi.get(self, "serials")

    @property
    @pulumi.getter(name="stackIds")
    def stack_ids(self) -> Optional[Sequence[str]]:
        """
        stackIds query parameter. Optional parameter to filter devices by Switch Stack ids.
        """
        return pulumi.get(self, "stack_ids")

    @property
    @pulumi.getter(name="startingAfter")
    def starting_after(self) -> Optional[str]:
        """
        startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "starting_after")


class AwaitableGetVlanProfilesAssignmentsByDeviceResult(GetVlanProfilesAssignmentsByDeviceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVlanProfilesAssignmentsByDeviceResult(
            ending_before=self.ending_before,
            id=self.id,
            items=self.items,
            network_id=self.network_id,
            per_page=self.per_page,
            product_types=self.product_types,
            serials=self.serials,
            stack_ids=self.stack_ids,
            starting_after=self.starting_after)


def get_vlan_profiles_assignments_by_device(ending_before: Optional[str] = None,
                                            network_id: Optional[str] = None,
                                            per_page: Optional[int] = None,
                                            product_types: Optional[Sequence[str]] = None,
                                            serials: Optional[Sequence[str]] = None,
                                            stack_ids: Optional[Sequence[str]] = None,
                                            starting_after: Optional[str] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVlanProfilesAssignmentsByDeviceResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_vlan_profiles_assignments_by_device(ending_before="string",
        network_id="string",
        per_page=1,
        product_types=["string"],
        serials=["string"],
        stack_ids=["string"],
        starting_after="string")
    pulumi.export("merakiNetworksVlanProfilesAssignmentsByDeviceExample", example.items)
    ```


    :param str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param str network_id: networkId path parameter. Network ID
    :param int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
    :param Sequence[str] product_types: productTypes query parameter. Optional parameter to filter devices by product types.
    :param Sequence[str] serials: serials query parameter. Optional parameter to filter devices by serials. All devices returned belong to serial numbers that are an exact match.
    :param Sequence[str] stack_ids: stackIds query parameter. Optional parameter to filter devices by Switch Stack ids.
    :param str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    """
    __args__ = dict()
    __args__['endingBefore'] = ending_before
    __args__['networkId'] = network_id
    __args__['perPage'] = per_page
    __args__['productTypes'] = product_types
    __args__['serials'] = serials
    __args__['stackIds'] = stack_ids
    __args__['startingAfter'] = starting_after
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getVlanProfilesAssignmentsByDevice:getVlanProfilesAssignmentsByDevice', __args__, opts=opts, typ=GetVlanProfilesAssignmentsByDeviceResult).value

    return AwaitableGetVlanProfilesAssignmentsByDeviceResult(
        ending_before=pulumi.get(__ret__, 'ending_before'),
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'),
        per_page=pulumi.get(__ret__, 'per_page'),
        product_types=pulumi.get(__ret__, 'product_types'),
        serials=pulumi.get(__ret__, 'serials'),
        stack_ids=pulumi.get(__ret__, 'stack_ids'),
        starting_after=pulumi.get(__ret__, 'starting_after'))


@_utilities.lift_output_func(get_vlan_profiles_assignments_by_device)
def get_vlan_profiles_assignments_by_device_output(ending_before: Optional[pulumi.Input[Optional[str]]] = None,
                                                   network_id: Optional[pulumi.Input[str]] = None,
                                                   per_page: Optional[pulumi.Input[Optional[int]]] = None,
                                                   product_types: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                                   serials: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                                   stack_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                                   starting_after: Optional[pulumi.Input[Optional[str]]] = None,
                                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVlanProfilesAssignmentsByDeviceResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_vlan_profiles_assignments_by_device(ending_before="string",
        network_id="string",
        per_page=1,
        product_types=["string"],
        serials=["string"],
        stack_ids=["string"],
        starting_after="string")
    pulumi.export("merakiNetworksVlanProfilesAssignmentsByDeviceExample", example.items)
    ```


    :param str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param str network_id: networkId path parameter. Network ID
    :param int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
    :param Sequence[str] product_types: productTypes query parameter. Optional parameter to filter devices by product types.
    :param Sequence[str] serials: serials query parameter. Optional parameter to filter devices by serials. All devices returned belong to serial numbers that are an exact match.
    :param Sequence[str] stack_ids: stackIds query parameter. Optional parameter to filter devices by Switch Stack ids.
    :param str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    """
    ...