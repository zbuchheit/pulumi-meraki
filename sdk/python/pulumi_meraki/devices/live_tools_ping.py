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
from ._inputs import *

__all__ = ['LiveToolsPingArgs', 'LiveToolsPing']

@pulumi.input_type
class LiveToolsPingArgs:
    def __init__(__self__, *,
                 parameters: pulumi.Input['LiveToolsPingParametersArgs'],
                 serial: pulumi.Input[str]):
        """
        The set of arguments for constructing a LiveToolsPing resource.
        :param pulumi.Input[str] serial: serial path parameter.
        """
        pulumi.set(__self__, "parameters", parameters)
        pulumi.set(__self__, "serial", serial)

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Input['LiveToolsPingParametersArgs']:
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: pulumi.Input['LiveToolsPingParametersArgs']):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter
    def serial(self) -> pulumi.Input[str]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

    @serial.setter
    def serial(self, value: pulumi.Input[str]):
        pulumi.set(self, "serial", value)


@pulumi.input_type
class _LiveToolsPingState:
    def __init__(__self__, *,
                 item: Optional[pulumi.Input['LiveToolsPingItemArgs']] = None,
                 parameters: Optional[pulumi.Input['LiveToolsPingParametersArgs']] = None,
                 serial: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LiveToolsPing resources.
        :param pulumi.Input[str] serial: serial path parameter.
        """
        if item is not None:
            pulumi.set(__self__, "item", item)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if serial is not None:
            pulumi.set(__self__, "serial", serial)

    @property
    @pulumi.getter
    def item(self) -> Optional[pulumi.Input['LiveToolsPingItemArgs']]:
        return pulumi.get(self, "item")

    @item.setter
    def item(self, value: Optional[pulumi.Input['LiveToolsPingItemArgs']]):
        pulumi.set(self, "item", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input['LiveToolsPingParametersArgs']]:
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input['LiveToolsPingParametersArgs']]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter
    def serial(self) -> Optional[pulumi.Input[str]]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

    @serial.setter
    def serial(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "serial", value)


class LiveToolsPing(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 parameters: Optional[pulumi.Input[pulumi.InputType['LiveToolsPingParametersArgs']]] = None,
                 serial: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
        already existed previously.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.devices.LiveToolsPing("example",
            serial="string",
            parameters=meraki.devices.LiveToolsPingParametersArgs(
                callback=meraki.devices.LiveToolsPingParametersCallbackArgs(
                    http_server=meraki.devices.LiveToolsPingParametersCallbackHttpServerArgs(
                        id="aHR0cHM6Ly93d3cuZXhhbXBsZS5jb20vd2ViaG9va3M=",
                    ),
                    payload_template=meraki.devices.LiveToolsPingParametersCallbackPayloadTemplateArgs(
                        id="wpt_2100",
                    ),
                    shared_secret="secret",
                    url="https://webhook.site/28efa24e-f830-4d9f-a12b-fbb9e5035031",
                ),
                count=2,
                target="75.75.75.75",
            ))
        pulumi.export("merakiDevicesLiveToolsPingExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:devices/liveToolsPing:LiveToolsPing example "id,serial"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] serial: serial path parameter.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LiveToolsPingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
        already existed previously.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.devices.LiveToolsPing("example",
            serial="string",
            parameters=meraki.devices.LiveToolsPingParametersArgs(
                callback=meraki.devices.LiveToolsPingParametersCallbackArgs(
                    http_server=meraki.devices.LiveToolsPingParametersCallbackHttpServerArgs(
                        id="aHR0cHM6Ly93d3cuZXhhbXBsZS5jb20vd2ViaG9va3M=",
                    ),
                    payload_template=meraki.devices.LiveToolsPingParametersCallbackPayloadTemplateArgs(
                        id="wpt_2100",
                    ),
                    shared_secret="secret",
                    url="https://webhook.site/28efa24e-f830-4d9f-a12b-fbb9e5035031",
                ),
                count=2,
                target="75.75.75.75",
            ))
        pulumi.export("merakiDevicesLiveToolsPingExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:devices/liveToolsPing:LiveToolsPing example "id,serial"
        ```

        :param str resource_name: The name of the resource.
        :param LiveToolsPingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LiveToolsPingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 parameters: Optional[pulumi.Input[pulumi.InputType['LiveToolsPingParametersArgs']]] = None,
                 serial: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LiveToolsPingArgs.__new__(LiveToolsPingArgs)

            if parameters is None and not opts.urn:
                raise TypeError("Missing required property 'parameters'")
            __props__.__dict__["parameters"] = parameters
            if serial is None and not opts.urn:
                raise TypeError("Missing required property 'serial'")
            __props__.__dict__["serial"] = serial
            __props__.__dict__["item"] = None
        super(LiveToolsPing, __self__).__init__(
            'meraki:devices/liveToolsPing:LiveToolsPing',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            item: Optional[pulumi.Input[pulumi.InputType['LiveToolsPingItemArgs']]] = None,
            parameters: Optional[pulumi.Input[pulumi.InputType['LiveToolsPingParametersArgs']]] = None,
            serial: Optional[pulumi.Input[str]] = None) -> 'LiveToolsPing':
        """
        Get an existing LiveToolsPing resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] serial: serial path parameter.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LiveToolsPingState.__new__(_LiveToolsPingState)

        __props__.__dict__["item"] = item
        __props__.__dict__["parameters"] = parameters
        __props__.__dict__["serial"] = serial
        return LiveToolsPing(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def item(self) -> pulumi.Output['outputs.LiveToolsPingItem']:
        return pulumi.get(self, "item")

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Output['outputs.LiveToolsPingParameters']:
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter
    def serial(self) -> pulumi.Output[str]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

