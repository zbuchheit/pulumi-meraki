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
    'GetAppliancePrefixesDelegatedStaticsResult',
    'AwaitableGetAppliancePrefixesDelegatedStaticsResult',
    'get_appliance_prefixes_delegated_statics',
    'get_appliance_prefixes_delegated_statics_output',
]

@pulumi.output_type
class GetAppliancePrefixesDelegatedStaticsResult:
    """
    A collection of values returned by getAppliancePrefixesDelegatedStatics.
    """
    def __init__(__self__, id=None, item=None, items=None, network_id=None, static_delegated_prefix_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)
        if static_delegated_prefix_id and not isinstance(static_delegated_prefix_id, str):
            raise TypeError("Expected argument 'static_delegated_prefix_id' to be a str")
        pulumi.set(__self__, "static_delegated_prefix_id", static_delegated_prefix_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetAppliancePrefixesDelegatedStaticsItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetAppliancePrefixesDelegatedStaticsItemResult']:
        """
        Array of ResponseApplianceGetNetworkAppliancePrefixesDelegatedStatics
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter(name="staticDelegatedPrefixId")
    def static_delegated_prefix_id(self) -> Optional[str]:
        """
        staticDelegatedPrefixId path parameter. Static delegated prefix ID
        """
        return pulumi.get(self, "static_delegated_prefix_id")


class AwaitableGetAppliancePrefixesDelegatedStaticsResult(GetAppliancePrefixesDelegatedStaticsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppliancePrefixesDelegatedStaticsResult(
            id=self.id,
            item=self.item,
            items=self.items,
            network_id=self.network_id,
            static_delegated_prefix_id=self.static_delegated_prefix_id)


def get_appliance_prefixes_delegated_statics(network_id: Optional[str] = None,
                                             static_delegated_prefix_id: Optional[str] = None,
                                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppliancePrefixesDelegatedStaticsResult:
    """
    ## Example Usage


    :param str network_id: networkId path parameter. Network ID
    :param str static_delegated_prefix_id: staticDelegatedPrefixId path parameter. Static delegated prefix ID
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    __args__['staticDelegatedPrefixId'] = static_delegated_prefix_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getAppliancePrefixesDelegatedStatics:getAppliancePrefixesDelegatedStatics', __args__, opts=opts, typ=GetAppliancePrefixesDelegatedStaticsResult).value

    return AwaitableGetAppliancePrefixesDelegatedStaticsResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'),
        static_delegated_prefix_id=pulumi.get(__ret__, 'static_delegated_prefix_id'))


@_utilities.lift_output_func(get_appliance_prefixes_delegated_statics)
def get_appliance_prefixes_delegated_statics_output(network_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                    static_delegated_prefix_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAppliancePrefixesDelegatedStaticsResult]:
    """
    ## Example Usage


    :param str network_id: networkId path parameter. Network ID
    :param str static_delegated_prefix_id: staticDelegatedPrefixId path parameter. Static delegated prefix ID
    """
    ...