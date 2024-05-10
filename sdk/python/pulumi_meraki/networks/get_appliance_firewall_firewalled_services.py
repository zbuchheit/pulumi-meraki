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
    'GetApplianceFirewallFirewalledServicesResult',
    'AwaitableGetApplianceFirewallFirewalledServicesResult',
    'get_appliance_firewall_firewalled_services',
    'get_appliance_firewall_firewalled_services_output',
]

@pulumi.output_type
class GetApplianceFirewallFirewalledServicesResult:
    """
    A collection of values returned by getApplianceFirewallFirewalledServices.
    """
    def __init__(__self__, id=None, item=None, network_id=None, service=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)
        if service and not isinstance(service, str):
            raise TypeError("Expected argument 'service' to be a str")
        pulumi.set(__self__, "service", service)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetApplianceFirewallFirewalledServicesItemResult':
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
    def service(self) -> str:
        """
        service path parameter.
        """
        return pulumi.get(self, "service")


class AwaitableGetApplianceFirewallFirewalledServicesResult(GetApplianceFirewallFirewalledServicesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApplianceFirewallFirewalledServicesResult(
            id=self.id,
            item=self.item,
            network_id=self.network_id,
            service=self.service)


def get_appliance_firewall_firewalled_services(network_id: Optional[str] = None,
                                               service: Optional[str] = None,
                                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApplianceFirewallFirewalledServicesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_appliance_firewall_firewalled_services(network_id="string",
        service="string")
    pulumi.export("merakiNetworksApplianceFirewallFirewalledServicesExample", example.item)
    ```


    :param str network_id: networkId path parameter. Network ID
    :param str service: service path parameter.
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    __args__['service'] = service
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getApplianceFirewallFirewalledServices:getApplianceFirewallFirewalledServices', __args__, opts=opts, typ=GetApplianceFirewallFirewalledServicesResult).value

    return AwaitableGetApplianceFirewallFirewalledServicesResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        network_id=pulumi.get(__ret__, 'network_id'),
        service=pulumi.get(__ret__, 'service'))


@_utilities.lift_output_func(get_appliance_firewall_firewalled_services)
def get_appliance_firewall_firewalled_services_output(network_id: Optional[pulumi.Input[str]] = None,
                                                      service: Optional[pulumi.Input[str]] = None,
                                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetApplianceFirewallFirewalledServicesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_appliance_firewall_firewalled_services(network_id="string",
        service="string")
    pulumi.export("merakiNetworksApplianceFirewallFirewalledServicesExample", example.item)
    ```


    :param str network_id: networkId path parameter. Network ID
    :param str service: service path parameter.
    """
    ...
