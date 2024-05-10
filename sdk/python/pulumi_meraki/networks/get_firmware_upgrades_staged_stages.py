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
    'GetFirmwareUpgradesStagedStagesResult',
    'AwaitableGetFirmwareUpgradesStagedStagesResult',
    'get_firmware_upgrades_staged_stages',
    'get_firmware_upgrades_staged_stages_output',
]

@pulumi.output_type
class GetFirmwareUpgradesStagedStagesResult:
    """
    A collection of values returned by getFirmwareUpgradesStagedStages.
    """
    def __init__(__self__, id=None, items=None, network_id=None):
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
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetFirmwareUpgradesStagedStagesItemResult']:
        """
        Array of ResponseNetworksGetNetworkFirmwareUpgradesStagedStages
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> str:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")


class AwaitableGetFirmwareUpgradesStagedStagesResult(GetFirmwareUpgradesStagedStagesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFirmwareUpgradesStagedStagesResult(
            id=self.id,
            items=self.items,
            network_id=self.network_id)


def get_firmware_upgrades_staged_stages(network_id: Optional[str] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFirmwareUpgradesStagedStagesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_firmware_upgrades_staged_stages(network_id="string")
    pulumi.export("merakiNetworksFirmwareUpgradesStagedStagesExample", example.items)
    ```


    :param str network_id: networkId path parameter. Network ID
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getFirmwareUpgradesStagedStages:getFirmwareUpgradesStagedStages', __args__, opts=opts, typ=GetFirmwareUpgradesStagedStagesResult).value

    return AwaitableGetFirmwareUpgradesStagedStagesResult(
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'))


@_utilities.lift_output_func(get_firmware_upgrades_staged_stages)
def get_firmware_upgrades_staged_stages_output(network_id: Optional[pulumi.Input[str]] = None,
                                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFirmwareUpgradesStagedStagesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_firmware_upgrades_staged_stages(network_id="string")
    pulumi.export("merakiNetworksFirmwareUpgradesStagedStagesExample", example.items)
    ```


    :param str network_id: networkId path parameter. Network ID
    """
    ...
