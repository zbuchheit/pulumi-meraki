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
    'GetSwitchRoutingInterfacesDhcpResult',
    'AwaitableGetSwitchRoutingInterfacesDhcpResult',
    'get_switch_routing_interfaces_dhcp',
    'get_switch_routing_interfaces_dhcp_output',
]

@pulumi.output_type
class GetSwitchRoutingInterfacesDhcpResult:
    """
    A collection of values returned by getSwitchRoutingInterfacesDhcp.
    """
    def __init__(__self__, id=None, interface_id=None, item=None, serial=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if interface_id and not isinstance(interface_id, str):
            raise TypeError("Expected argument 'interface_id' to be a str")
        pulumi.set(__self__, "interface_id", interface_id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if serial and not isinstance(serial, str):
            raise TypeError("Expected argument 'serial' to be a str")
        pulumi.set(__self__, "serial", serial)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="interfaceId")
    def interface_id(self) -> str:
        """
        interfaceId path parameter. Interface ID
        """
        return pulumi.get(self, "interface_id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetSwitchRoutingInterfacesDhcpItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter
    def serial(self) -> str:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")


class AwaitableGetSwitchRoutingInterfacesDhcpResult(GetSwitchRoutingInterfacesDhcpResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSwitchRoutingInterfacesDhcpResult(
            id=self.id,
            interface_id=self.interface_id,
            item=self.item,
            serial=self.serial)


def get_switch_routing_interfaces_dhcp(interface_id: Optional[str] = None,
                                       serial: Optional[str] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSwitchRoutingInterfacesDhcpResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.devices.get_switch_routing_interfaces_dhcp(interface_id="string",
        serial="string")
    pulumi.export("merakiDevicesSwitchRoutingInterfacesDhcpExample", example.item)
    ```


    :param str interface_id: interfaceId path parameter. Interface ID
    :param str serial: serial path parameter.
    """
    __args__ = dict()
    __args__['interfaceId'] = interface_id
    __args__['serial'] = serial
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:devices/getSwitchRoutingInterfacesDhcp:getSwitchRoutingInterfacesDhcp', __args__, opts=opts, typ=GetSwitchRoutingInterfacesDhcpResult).value

    return AwaitableGetSwitchRoutingInterfacesDhcpResult(
        id=pulumi.get(__ret__, 'id'),
        interface_id=pulumi.get(__ret__, 'interface_id'),
        item=pulumi.get(__ret__, 'item'),
        serial=pulumi.get(__ret__, 'serial'))


@_utilities.lift_output_func(get_switch_routing_interfaces_dhcp)
def get_switch_routing_interfaces_dhcp_output(interface_id: Optional[pulumi.Input[str]] = None,
                                              serial: Optional[pulumi.Input[str]] = None,
                                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSwitchRoutingInterfacesDhcpResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.devices.get_switch_routing_interfaces_dhcp(interface_id="string",
        serial="string")
    pulumi.export("merakiDevicesSwitchRoutingInterfacesDhcpExample", example.item)
    ```


    :param str interface_id: interfaceId path parameter. Interface ID
    :param str serial: serial path parameter.
    """
    ...
