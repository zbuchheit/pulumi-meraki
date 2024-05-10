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
    'GetSwitchDhcpV4ServersSeenResult',
    'AwaitableGetSwitchDhcpV4ServersSeenResult',
    'get_switch_dhcp_v4_servers_seen',
    'get_switch_dhcp_v4_servers_seen_output',
]

@pulumi.output_type
class GetSwitchDhcpV4ServersSeenResult:
    """
    A collection of values returned by getSwitchDhcpV4ServersSeen.
    """
    def __init__(__self__, ending_before=None, id=None, items=None, network_id=None, per_page=None, starting_after=None, t0=None, timespan=None):
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
        if starting_after and not isinstance(starting_after, str):
            raise TypeError("Expected argument 'starting_after' to be a str")
        pulumi.set(__self__, "starting_after", starting_after)
        if t0 and not isinstance(t0, str):
            raise TypeError("Expected argument 't0' to be a str")
        pulumi.set(__self__, "t0", t0)
        if timespan and not isinstance(timespan, float):
            raise TypeError("Expected argument 'timespan' to be a float")
        pulumi.set(__self__, "timespan", timespan)

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
    def items(self) -> Sequence['outputs.GetSwitchDhcpV4ServersSeenItemResult']:
        """
        Array of ResponseSwitchGetNetworkSwitchDhcpV4ServersSeen
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
    @pulumi.getter(name="startingAfter")
    def starting_after(self) -> Optional[str]:
        """
        startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "starting_after")

    @property
    @pulumi.getter
    def t0(self) -> Optional[str]:
        """
        t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
        """
        return pulumi.get(self, "t0")

    @property
    @pulumi.getter
    def timespan(self) -> Optional[float]:
        """
        timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
        """
        return pulumi.get(self, "timespan")


class AwaitableGetSwitchDhcpV4ServersSeenResult(GetSwitchDhcpV4ServersSeenResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSwitchDhcpV4ServersSeenResult(
            ending_before=self.ending_before,
            id=self.id,
            items=self.items,
            network_id=self.network_id,
            per_page=self.per_page,
            starting_after=self.starting_after,
            t0=self.t0,
            timespan=self.timespan)


def get_switch_dhcp_v4_servers_seen(ending_before: Optional[str] = None,
                                    network_id: Optional[str] = None,
                                    per_page: Optional[int] = None,
                                    starting_after: Optional[str] = None,
                                    t0: Optional[str] = None,
                                    timespan: Optional[float] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSwitchDhcpV4ServersSeenResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_switch_dhcp_v4_servers_seen(ending_before="string",
        network_id="string",
        per_page=1,
        starting_after="string",
        t0="string",
        timespan=1)
    pulumi.export("merakiNetworksSwitchDhcpV4ServersSeenExample", example.items)
    ```


    :param str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param str network_id: networkId path parameter. Network ID
    :param int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
    :param str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param str t0: t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
    :param float timespan: timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
    """
    __args__ = dict()
    __args__['endingBefore'] = ending_before
    __args__['networkId'] = network_id
    __args__['perPage'] = per_page
    __args__['startingAfter'] = starting_after
    __args__['t0'] = t0
    __args__['timespan'] = timespan
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getSwitchDhcpV4ServersSeen:getSwitchDhcpV4ServersSeen', __args__, opts=opts, typ=GetSwitchDhcpV4ServersSeenResult).value

    return AwaitableGetSwitchDhcpV4ServersSeenResult(
        ending_before=pulumi.get(__ret__, 'ending_before'),
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'),
        per_page=pulumi.get(__ret__, 'per_page'),
        starting_after=pulumi.get(__ret__, 'starting_after'),
        t0=pulumi.get(__ret__, 't0'),
        timespan=pulumi.get(__ret__, 'timespan'))


@_utilities.lift_output_func(get_switch_dhcp_v4_servers_seen)
def get_switch_dhcp_v4_servers_seen_output(ending_before: Optional[pulumi.Input[Optional[str]]] = None,
                                           network_id: Optional[pulumi.Input[str]] = None,
                                           per_page: Optional[pulumi.Input[Optional[int]]] = None,
                                           starting_after: Optional[pulumi.Input[Optional[str]]] = None,
                                           t0: Optional[pulumi.Input[Optional[str]]] = None,
                                           timespan: Optional[pulumi.Input[Optional[float]]] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSwitchDhcpV4ServersSeenResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_switch_dhcp_v4_servers_seen(ending_before="string",
        network_id="string",
        per_page=1,
        starting_after="string",
        t0="string",
        timespan=1)
    pulumi.export("merakiNetworksSwitchDhcpV4ServersSeenExample", example.items)
    ```


    :param str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param str network_id: networkId path parameter. Network ID
    :param int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
    :param str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param str t0: t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
    :param float timespan: timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
    """
    ...
