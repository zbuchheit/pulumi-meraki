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
    'GetCameraVideoSettingsResult',
    'AwaitableGetCameraVideoSettingsResult',
    'get_camera_video_settings',
    'get_camera_video_settings_output',
]

@pulumi.output_type
class GetCameraVideoSettingsResult:
    """
    A collection of values returned by getCameraVideoSettings.
    """
    def __init__(__self__, id=None, item=None, serial=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
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
    @pulumi.getter
    def item(self) -> 'outputs.GetCameraVideoSettingsItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter
    def serial(self) -> str:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")


class AwaitableGetCameraVideoSettingsResult(GetCameraVideoSettingsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCameraVideoSettingsResult(
            id=self.id,
            item=self.item,
            serial=self.serial)


def get_camera_video_settings(serial: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCameraVideoSettingsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.devices.get_camera_video_settings(serial="string")
    pulumi.export("merakiDevicesCameraVideoSettingsExample", example.item)
    ```


    :param str serial: serial path parameter.
    """
    __args__ = dict()
    __args__['serial'] = serial
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:devices/getCameraVideoSettings:getCameraVideoSettings', __args__, opts=opts, typ=GetCameraVideoSettingsResult).value

    return AwaitableGetCameraVideoSettingsResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        serial=pulumi.get(__ret__, 'serial'))


@_utilities.lift_output_func(get_camera_video_settings)
def get_camera_video_settings_output(serial: Optional[pulumi.Input[str]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCameraVideoSettingsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.devices.get_camera_video_settings(serial="string")
    pulumi.export("merakiDevicesCameraVideoSettingsExample", example.item)
    ```


    :param str serial: serial path parameter.
    """
    ...
