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
    'GetPiiRequestsResult',
    'AwaitableGetPiiRequestsResult',
    'get_pii_requests',
    'get_pii_requests_output',
]

@pulumi.output_type
class GetPiiRequestsResult:
    """
    A collection of values returned by getPiiRequests.
    """
    def __init__(__self__, id=None, item=None, items=None, network_id=None, request_id=None):
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
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetPiiRequestsItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetPiiRequestsItemResult']:
        """
        Array of ResponseNetworksGetNetworkPiiRequests
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
    @pulumi.getter(name="requestId")
    def request_id(self) -> Optional[str]:
        """
        requestId path parameter. Request ID
        """
        return pulumi.get(self, "request_id")


class AwaitableGetPiiRequestsResult(GetPiiRequestsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPiiRequestsResult(
            id=self.id,
            item=self.item,
            items=self.items,
            network_id=self.network_id,
            request_id=self.request_id)


def get_pii_requests(network_id: Optional[str] = None,
                     request_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPiiRequestsResult:
    """
    ## Example Usage


    :param str network_id: networkId path parameter. Network ID
    :param str request_id: requestId path parameter. Request ID
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    __args__['requestId'] = request_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getPiiRequests:getPiiRequests', __args__, opts=opts, typ=GetPiiRequestsResult).value

    return AwaitableGetPiiRequestsResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'),
        request_id=pulumi.get(__ret__, 'request_id'))


@_utilities.lift_output_func(get_pii_requests)
def get_pii_requests_output(network_id: Optional[pulumi.Input[Optional[str]]] = None,
                            request_id: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPiiRequestsResult]:
    """
    ## Example Usage


    :param str network_id: networkId path parameter. Network ID
    :param str request_id: requestId path parameter. Request ID
    """
    ...
