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
    'GetCellularGatewayUplinkStatusesResult',
    'AwaitableGetCellularGatewayUplinkStatusesResult',
    'get_cellular_gateway_uplink_statuses',
    'get_cellular_gateway_uplink_statuses_output',
]

@pulumi.output_type
class GetCellularGatewayUplinkStatusesResult:
    """
    A collection of values returned by getCellularGatewayUplinkStatuses.
    """
    def __init__(__self__, ending_before=None, iccids=None, id=None, items=None, network_ids=None, organization_id=None, per_page=None, serials=None, starting_after=None):
        if ending_before and not isinstance(ending_before, str):
            raise TypeError("Expected argument 'ending_before' to be a str")
        pulumi.set(__self__, "ending_before", ending_before)
        if iccids and not isinstance(iccids, list):
            raise TypeError("Expected argument 'iccids' to be a list")
        pulumi.set(__self__, "iccids", iccids)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if network_ids and not isinstance(network_ids, list):
            raise TypeError("Expected argument 'network_ids' to be a list")
        pulumi.set(__self__, "network_ids", network_ids)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)
        if per_page and not isinstance(per_page, int):
            raise TypeError("Expected argument 'per_page' to be a int")
        pulumi.set(__self__, "per_page", per_page)
        if serials and not isinstance(serials, list):
            raise TypeError("Expected argument 'serials' to be a list")
        pulumi.set(__self__, "serials", serials)
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
    def iccids(self) -> Optional[Sequence[str]]:
        """
        iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
        """
        return pulumi.get(self, "iccids")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetCellularGatewayUplinkStatusesItemResult']:
        """
        Array of ResponseCellularGatewayGetOrganizationCellularGatewayUplinkStatuses
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter(name="networkIds")
    def network_ids(self) -> Optional[Sequence[str]]:
        """
        networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
        """
        return pulumi.get(self, "network_ids")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> str:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="perPage")
    def per_page(self) -> Optional[int]:
        """
        perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        """
        return pulumi.get(self, "per_page")

    @property
    @pulumi.getter
    def serials(self) -> Optional[Sequence[str]]:
        """
        serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
        """
        return pulumi.get(self, "serials")

    @property
    @pulumi.getter(name="startingAfter")
    def starting_after(self) -> Optional[str]:
        """
        startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "starting_after")


class AwaitableGetCellularGatewayUplinkStatusesResult(GetCellularGatewayUplinkStatusesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCellularGatewayUplinkStatusesResult(
            ending_before=self.ending_before,
            iccids=self.iccids,
            id=self.id,
            items=self.items,
            network_ids=self.network_ids,
            organization_id=self.organization_id,
            per_page=self.per_page,
            serials=self.serials,
            starting_after=self.starting_after)


def get_cellular_gateway_uplink_statuses(ending_before: Optional[str] = None,
                                         iccids: Optional[Sequence[str]] = None,
                                         network_ids: Optional[Sequence[str]] = None,
                                         organization_id: Optional[str] = None,
                                         per_page: Optional[int] = None,
                                         serials: Optional[Sequence[str]] = None,
                                         starting_after: Optional[str] = None,
                                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCellularGatewayUplinkStatusesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_cellular_gateway_uplink_statuses(ending_before="string",
        iccids=["string"],
        network_ids=["string"],
        organization_id="string",
        per_page=1,
        serials=["string"],
        starting_after="string")
    pulumi.export("merakiOrganizationsCellularGatewayUplinkStatusesExample", example.items)
    ```


    :param str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[str] iccids: iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
    :param Sequence[str] network_ids: networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
    :param str organization_id: organizationId path parameter. Organization ID
    :param int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
    :param Sequence[str] serials: serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
    :param str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    """
    __args__ = dict()
    __args__['endingBefore'] = ending_before
    __args__['iccids'] = iccids
    __args__['networkIds'] = network_ids
    __args__['organizationId'] = organization_id
    __args__['perPage'] = per_page
    __args__['serials'] = serials
    __args__['startingAfter'] = starting_after
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:organizations/getCellularGatewayUplinkStatuses:getCellularGatewayUplinkStatuses', __args__, opts=opts, typ=GetCellularGatewayUplinkStatusesResult).value

    return AwaitableGetCellularGatewayUplinkStatusesResult(
        ending_before=pulumi.get(__ret__, 'ending_before'),
        iccids=pulumi.get(__ret__, 'iccids'),
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        network_ids=pulumi.get(__ret__, 'network_ids'),
        organization_id=pulumi.get(__ret__, 'organization_id'),
        per_page=pulumi.get(__ret__, 'per_page'),
        serials=pulumi.get(__ret__, 'serials'),
        starting_after=pulumi.get(__ret__, 'starting_after'))


@_utilities.lift_output_func(get_cellular_gateway_uplink_statuses)
def get_cellular_gateway_uplink_statuses_output(ending_before: Optional[pulumi.Input[Optional[str]]] = None,
                                                iccids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                                network_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                                organization_id: Optional[pulumi.Input[str]] = None,
                                                per_page: Optional[pulumi.Input[Optional[int]]] = None,
                                                serials: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                                starting_after: Optional[pulumi.Input[Optional[str]]] = None,
                                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCellularGatewayUplinkStatusesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_cellular_gateway_uplink_statuses(ending_before="string",
        iccids=["string"],
        network_ids=["string"],
        organization_id="string",
        per_page=1,
        serials=["string"],
        starting_after="string")
    pulumi.export("merakiOrganizationsCellularGatewayUplinkStatusesExample", example.items)
    ```


    :param str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[str] iccids: iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
    :param Sequence[str] network_ids: networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
    :param str organization_id: organizationId path parameter. Organization ID
    :param int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
    :param Sequence[str] serials: serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
    :param str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    """
    ...