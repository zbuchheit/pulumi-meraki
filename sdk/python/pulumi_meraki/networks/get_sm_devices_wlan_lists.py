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
    'GetSmDevicesWlanListsResult',
    'AwaitableGetSmDevicesWlanListsResult',
    'get_sm_devices_wlan_lists',
    'get_sm_devices_wlan_lists_output',
]

@pulumi.output_type
class GetSmDevicesWlanListsResult:
    """
    A collection of values returned by getSmDevicesWlanLists.
    """
    def __init__(__self__, device_id=None, id=None, items=None, network_id=None):
        if device_id and not isinstance(device_id, str):
            raise TypeError("Expected argument 'device_id' to be a str")
        pulumi.set(__self__, "device_id", device_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> str:
        """
        deviceId path parameter. Device ID
        """
        return pulumi.get(self, "device_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetSmDevicesWlanListsItemResult']:
        """
        Array of ResponseSmGetNetworkSmDeviceWlanLists
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> str:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")


class AwaitableGetSmDevicesWlanListsResult(GetSmDevicesWlanListsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSmDevicesWlanListsResult(
            device_id=self.device_id,
            id=self.id,
            items=self.items,
            network_id=self.network_id)


def get_sm_devices_wlan_lists(device_id: Optional[str] = None,
                              network_id: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSmDevicesWlanListsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_sm_devices_wlan_lists(device_id="string",
        network_id="string")
    pulumi.export("merakiNetworksSmDevicesWlanListsExample", example.items)
    ```


    :param str device_id: deviceId path parameter. Device ID
    :param str network_id: networkId path parameter. Network ID
    """
    __args__ = dict()
    __args__['deviceId'] = device_id
    __args__['networkId'] = network_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getSmDevicesWlanLists:getSmDevicesWlanLists', __args__, opts=opts, typ=GetSmDevicesWlanListsResult).value

    return AwaitableGetSmDevicesWlanListsResult(
        device_id=pulumi.get(__ret__, 'device_id'),
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'))


@_utilities.lift_output_func(get_sm_devices_wlan_lists)
def get_sm_devices_wlan_lists_output(device_id: Optional[pulumi.Input[str]] = None,
                                     network_id: Optional[pulumi.Input[str]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSmDevicesWlanListsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_sm_devices_wlan_lists(device_id="string",
        network_id="string")
    pulumi.export("merakiNetworksSmDevicesWlanListsExample", example.items)
    ```


    :param str device_id: deviceId path parameter. Device ID
    :param str network_id: networkId path parameter. Network ID
    """
    ...
