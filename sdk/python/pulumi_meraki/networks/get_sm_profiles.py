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
    'GetSmProfilesResult',
    'AwaitableGetSmProfilesResult',
    'get_sm_profiles',
    'get_sm_profiles_output',
]

@pulumi.output_type
class GetSmProfilesResult:
    """
    A collection of values returned by getSmProfiles.
    """
    def __init__(__self__, id=None, items=None, network_id=None, payload_types=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)
        if payload_types and not isinstance(payload_types, list):
            raise TypeError("Expected argument 'payload_types' to be a list")
        pulumi.set(__self__, "payload_types", payload_types)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetSmProfilesItemResult']:
        """
        Array of ResponseSmGetNetworkSmProfiles
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
    @pulumi.getter(name="payloadTypes")
    def payload_types(self) -> Optional[Sequence[str]]:
        """
        payloadTypes query parameter. Filter by payload types
        """
        return pulumi.get(self, "payload_types")


class AwaitableGetSmProfilesResult(GetSmProfilesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSmProfilesResult(
            id=self.id,
            items=self.items,
            network_id=self.network_id,
            payload_types=self.payload_types)


def get_sm_profiles(network_id: Optional[str] = None,
                    payload_types: Optional[Sequence[str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSmProfilesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_sm_profiles(network_id="string",
        payload_types=["string"])
    pulumi.export("merakiNetworksSmProfilesExample", example.items)
    ```


    :param str network_id: networkId path parameter. Network ID
    :param Sequence[str] payload_types: payloadTypes query parameter. Filter by payload types
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    __args__['payloadTypes'] = payload_types
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getSmProfiles:getSmProfiles', __args__, opts=opts, typ=GetSmProfilesResult).value

    return AwaitableGetSmProfilesResult(
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'),
        payload_types=pulumi.get(__ret__, 'payload_types'))


@_utilities.lift_output_func(get_sm_profiles)
def get_sm_profiles_output(network_id: Optional[pulumi.Input[str]] = None,
                           payload_types: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSmProfilesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_sm_profiles(network_id="string",
        payload_types=["string"])
    pulumi.export("merakiNetworksSmProfilesExample", example.items)
    ```


    :param str network_id: networkId path parameter. Network ID
    :param Sequence[str] payload_types: payloadTypes query parameter. Filter by payload types
    """
    ...
