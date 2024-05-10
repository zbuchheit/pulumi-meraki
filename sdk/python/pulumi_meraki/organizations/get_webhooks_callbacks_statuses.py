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
    'GetWebhooksCallbacksStatusesResult',
    'AwaitableGetWebhooksCallbacksStatusesResult',
    'get_webhooks_callbacks_statuses',
    'get_webhooks_callbacks_statuses_output',
]

@pulumi.output_type
class GetWebhooksCallbacksStatusesResult:
    """
    A collection of values returned by getWebhooksCallbacksStatuses.
    """
    def __init__(__self__, callback_id=None, id=None, item=None, organization_id=None):
        if callback_id and not isinstance(callback_id, str):
            raise TypeError("Expected argument 'callback_id' to be a str")
        pulumi.set(__self__, "callback_id", callback_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)

    @property
    @pulumi.getter(name="callbackId")
    def callback_id(self) -> str:
        """
        callbackId path parameter. Callback ID
        """
        return pulumi.get(self, "callback_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetWebhooksCallbacksStatusesItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> str:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")


class AwaitableGetWebhooksCallbacksStatusesResult(GetWebhooksCallbacksStatusesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWebhooksCallbacksStatusesResult(
            callback_id=self.callback_id,
            id=self.id,
            item=self.item,
            organization_id=self.organization_id)


def get_webhooks_callbacks_statuses(callback_id: Optional[str] = None,
                                    organization_id: Optional[str] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWebhooksCallbacksStatusesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_webhooks_callbacks_statuses(callback_id="string",
        organization_id="string")
    pulumi.export("merakiOrganizationsWebhooksCallbacksStatusesExample", example.item)
    ```


    :param str callback_id: callbackId path parameter. Callback ID
    :param str organization_id: organizationId path parameter. Organization ID
    """
    __args__ = dict()
    __args__['callbackId'] = callback_id
    __args__['organizationId'] = organization_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:organizations/getWebhooksCallbacksStatuses:getWebhooksCallbacksStatuses', __args__, opts=opts, typ=GetWebhooksCallbacksStatusesResult).value

    return AwaitableGetWebhooksCallbacksStatusesResult(
        callback_id=pulumi.get(__ret__, 'callback_id'),
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        organization_id=pulumi.get(__ret__, 'organization_id'))


@_utilities.lift_output_func(get_webhooks_callbacks_statuses)
def get_webhooks_callbacks_statuses_output(callback_id: Optional[pulumi.Input[str]] = None,
                                           organization_id: Optional[pulumi.Input[str]] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetWebhooksCallbacksStatusesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_webhooks_callbacks_statuses(callback_id="string",
        organization_id="string")
    pulumi.export("merakiOrganizationsWebhooksCallbacksStatusesExample", example.item)
    ```


    :param str callback_id: callbackId path parameter. Callback ID
    :param str organization_id: organizationId path parameter. Organization ID
    """
    ...
