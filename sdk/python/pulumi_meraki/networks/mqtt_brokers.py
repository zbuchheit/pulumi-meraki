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

__all__ = ['MqttBrokersArgs', 'MqttBrokers']

@pulumi.input_type
class MqttBrokersArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[str],
                 parameters: pulumi.Input['MqttBrokersParametersArgs']):
        """
        The set of arguments for constructing a MqttBrokers resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        """
        pulumi.set(__self__, "network_id", network_id)
        pulumi.set(__self__, "parameters", parameters)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Input[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Input['MqttBrokersParametersArgs']:
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: pulumi.Input['MqttBrokersParametersArgs']):
        pulumi.set(self, "parameters", value)


@pulumi.input_type
class _MqttBrokersState:
    def __init__(__self__, *,
                 item: Optional[pulumi.Input['MqttBrokersItemArgs']] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input['MqttBrokersParametersArgs']] = None):
        """
        Input properties used for looking up and filtering MqttBrokers resources.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        """
        if item is not None:
            pulumi.set(__self__, "item", item)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)

    @property
    @pulumi.getter
    def item(self) -> Optional[pulumi.Input['MqttBrokersItemArgs']]:
        return pulumi.get(self, "item")

    @item.setter
    def item(self, value: Optional[pulumi.Input['MqttBrokersItemArgs']]):
        pulumi.set(self, "item", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[str]]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input['MqttBrokersParametersArgs']]:
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input['MqttBrokersParametersArgs']]):
        pulumi.set(self, "parameters", value)


class MqttBrokers(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[pulumi.InputType['MqttBrokersParametersArgs']]] = None,
                 __props__=None):
        """
        ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
        already existed previously.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.MqttBrokers("example",
            network_id="string",
            parameters=meraki.networks.MqttBrokersParametersArgs(
                authentication=meraki.networks.MqttBrokersParametersAuthenticationArgs(
                    password="*****",
                    username="milesmeraki",
                ),
                host="1.2.3.4",
                name="MQTT_Broker_1",
                port=443,
                security=meraki.networks.MqttBrokersParametersSecurityArgs(
                    mode="tls",
                    tls=meraki.networks.MqttBrokersParametersSecurityTlsArgs(
                        ca_certificate="*****",
                        verify_hostnames=True,
                    ),
                ),
            ))
        pulumi.export("merakiNetworksMqttBrokersExample", example)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MqttBrokersArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
        already existed previously.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.MqttBrokers("example",
            network_id="string",
            parameters=meraki.networks.MqttBrokersParametersArgs(
                authentication=meraki.networks.MqttBrokersParametersAuthenticationArgs(
                    password="*****",
                    username="milesmeraki",
                ),
                host="1.2.3.4",
                name="MQTT_Broker_1",
                port=443,
                security=meraki.networks.MqttBrokersParametersSecurityArgs(
                    mode="tls",
                    tls=meraki.networks.MqttBrokersParametersSecurityTlsArgs(
                        ca_certificate="*****",
                        verify_hostnames=True,
                    ),
                ),
            ))
        pulumi.export("merakiNetworksMqttBrokersExample", example)
        ```

        :param str resource_name: The name of the resource.
        :param MqttBrokersArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MqttBrokersArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[pulumi.InputType['MqttBrokersParametersArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MqttBrokersArgs.__new__(MqttBrokersArgs)

            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            if parameters is None and not opts.urn:
                raise TypeError("Missing required property 'parameters'")
            __props__.__dict__["parameters"] = parameters
            __props__.__dict__["item"] = None
        super(MqttBrokers, __self__).__init__(
            'meraki:networks/mqttBrokers:MqttBrokers',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            item: Optional[pulumi.Input[pulumi.InputType['MqttBrokersItemArgs']]] = None,
            network_id: Optional[pulumi.Input[str]] = None,
            parameters: Optional[pulumi.Input[pulumi.InputType['MqttBrokersParametersArgs']]] = None) -> 'MqttBrokers':
        """
        Get an existing MqttBrokers resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MqttBrokersState.__new__(_MqttBrokersState)

        __props__.__dict__["item"] = item
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["parameters"] = parameters
        return MqttBrokers(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def item(self) -> pulumi.Output['outputs.MqttBrokersItem']:
        return pulumi.get(self, "item")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Output['outputs.MqttBrokersParameters']:
        return pulumi.get(self, "parameters")

