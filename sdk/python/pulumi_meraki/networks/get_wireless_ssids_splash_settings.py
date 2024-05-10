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
    'GetWirelessSsidsSplashSettingsResult',
    'AwaitableGetWirelessSsidsSplashSettingsResult',
    'get_wireless_ssids_splash_settings',
    'get_wireless_ssids_splash_settings_output',
]

@pulumi.output_type
class GetWirelessSsidsSplashSettingsResult:
    """
    A collection of values returned by getWirelessSsidsSplashSettings.
    """
    def __init__(__self__, id=None, item=None, network_id=None, number=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)
        if number and not isinstance(number, str):
            raise TypeError("Expected argument 'number' to be a str")
        pulumi.set(__self__, "number", number)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetWirelessSsidsSplashSettingsItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> str:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def number(self) -> str:
        """
        number path parameter.
        """
        return pulumi.get(self, "number")


class AwaitableGetWirelessSsidsSplashSettingsResult(GetWirelessSsidsSplashSettingsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWirelessSsidsSplashSettingsResult(
            id=self.id,
            item=self.item,
            network_id=self.network_id,
            number=self.number)


def get_wireless_ssids_splash_settings(network_id: Optional[str] = None,
                                       number: Optional[str] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWirelessSsidsSplashSettingsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_wireless_ssids_splash_settings(network_id="string",
        number="string")
    pulumi.export("merakiNetworksWirelessSsidsSplashSettingsExample", example.item)
    ```


    :param str network_id: networkId path parameter. Network ID
    :param str number: number path parameter.
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    __args__['number'] = number
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getWirelessSsidsSplashSettings:getWirelessSsidsSplashSettings', __args__, opts=opts, typ=GetWirelessSsidsSplashSettingsResult).value

    return AwaitableGetWirelessSsidsSplashSettingsResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        network_id=pulumi.get(__ret__, 'network_id'),
        number=pulumi.get(__ret__, 'number'))


@_utilities.lift_output_func(get_wireless_ssids_splash_settings)
def get_wireless_ssids_splash_settings_output(network_id: Optional[pulumi.Input[str]] = None,
                                              number: Optional[pulumi.Input[str]] = None,
                                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetWirelessSsidsSplashSettingsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_wireless_ssids_splash_settings(network_id="string",
        number="string")
    pulumi.export("merakiNetworksWirelessSsidsSplashSettingsExample", example.item)
    ```


    :param str network_id: networkId path parameter. Network ID
    :param str number: number path parameter.
    """
    ...
