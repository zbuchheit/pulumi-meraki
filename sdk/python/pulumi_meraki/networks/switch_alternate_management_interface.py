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

__all__ = ['SwitchAlternateManagementInterfaceArgs', 'SwitchAlternateManagementInterface']

@pulumi.input_type
class SwitchAlternateManagementInterfaceArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 switches: Optional[pulumi.Input[Sequence[pulumi.Input['SwitchAlternateManagementInterfaceSwitchArgs']]]] = None,
                 vlan_id: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a SwitchAlternateManagementInterface resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[bool] enabled: Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
        :param pulumi.Input[Sequence[pulumi.Input['SwitchAlternateManagementInterfaceSwitchArgs']]] switches: Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
        :param pulumi.Input[int] vlan_id: Alternate management VLAN, must be between 1 and 4094
        """
        pulumi.set(__self__, "network_id", network_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if protocols is not None:
            pulumi.set(__self__, "protocols", protocols)
        if switches is not None:
            pulumi.set(__self__, "switches", switches)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)

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
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def protocols(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
        """
        return pulumi.get(self, "protocols")

    @protocols.setter
    def protocols(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "protocols", value)

    @property
    @pulumi.getter
    def switches(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SwitchAlternateManagementInterfaceSwitchArgs']]]]:
        """
        Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
        """
        return pulumi.get(self, "switches")

    @switches.setter
    def switches(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SwitchAlternateManagementInterfaceSwitchArgs']]]]):
        pulumi.set(self, "switches", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[int]]:
        """
        Alternate management VLAN, must be between 1 and 4094
        """
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vlan_id", value)


@pulumi.input_type
class _SwitchAlternateManagementInterfaceState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 switches: Optional[pulumi.Input[Sequence[pulumi.Input['SwitchAlternateManagementInterfaceSwitchArgs']]]] = None,
                 vlan_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering SwitchAlternateManagementInterface resources.
        :param pulumi.Input[bool] enabled: Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
        :param pulumi.Input[Sequence[pulumi.Input['SwitchAlternateManagementInterfaceSwitchArgs']]] switches: Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
        :param pulumi.Input[int] vlan_id: Alternate management VLAN, must be between 1 and 4094
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if protocols is not None:
            pulumi.set(__self__, "protocols", protocols)
        if switches is not None:
            pulumi.set(__self__, "switches", switches)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

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
    def protocols(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
        """
        return pulumi.get(self, "protocols")

    @protocols.setter
    def protocols(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "protocols", value)

    @property
    @pulumi.getter
    def switches(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SwitchAlternateManagementInterfaceSwitchArgs']]]]:
        """
        Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
        """
        return pulumi.get(self, "switches")

    @switches.setter
    def switches(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SwitchAlternateManagementInterfaceSwitchArgs']]]]):
        pulumi.set(self, "switches", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[int]]:
        """
        Alternate management VLAN, must be between 1 and 4094
        """
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vlan_id", value)


class SwitchAlternateManagementInterface(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 switches: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwitchAlternateManagementInterfaceSwitchArgs']]]]] = None,
                 vlan_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/switchAlternateManagementInterface:SwitchAlternateManagementInterface example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwitchAlternateManagementInterfaceSwitchArgs']]]] switches: Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
        :param pulumi.Input[int] vlan_id: Alternate management VLAN, must be between 1 and 4094
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SwitchAlternateManagementInterfaceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/switchAlternateManagementInterface:SwitchAlternateManagementInterface example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param SwitchAlternateManagementInterfaceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SwitchAlternateManagementInterfaceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 switches: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwitchAlternateManagementInterfaceSwitchArgs']]]]] = None,
                 vlan_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SwitchAlternateManagementInterfaceArgs.__new__(SwitchAlternateManagementInterfaceArgs)

            __props__.__dict__["enabled"] = enabled
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            __props__.__dict__["protocols"] = protocols
            __props__.__dict__["switches"] = switches
            __props__.__dict__["vlan_id"] = vlan_id
        super(SwitchAlternateManagementInterface, __self__).__init__(
            'meraki:networks/switchAlternateManagementInterface:SwitchAlternateManagementInterface',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            network_id: Optional[pulumi.Input[str]] = None,
            protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            switches: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwitchAlternateManagementInterfaceSwitchArgs']]]]] = None,
            vlan_id: Optional[pulumi.Input[int]] = None) -> 'SwitchAlternateManagementInterface':
        """
        Get an existing SwitchAlternateManagementInterface resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwitchAlternateManagementInterfaceSwitchArgs']]]] switches: Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
        :param pulumi.Input[int] vlan_id: Alternate management VLAN, must be between 1 and 4094
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SwitchAlternateManagementInterfaceState.__new__(_SwitchAlternateManagementInterfaceState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["protocols"] = protocols
        __props__.__dict__["switches"] = switches
        __props__.__dict__["vlan_id"] = vlan_id
        return SwitchAlternateManagementInterface(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def protocols(self) -> pulumi.Output[Sequence[str]]:
        """
        Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
        """
        return pulumi.get(self, "protocols")

    @property
    @pulumi.getter
    def switches(self) -> pulumi.Output[Sequence['outputs.SwitchAlternateManagementInterfaceSwitch']]:
        """
        Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
        """
        return pulumi.get(self, "switches")

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> pulumi.Output[int]:
        """
        Alternate management VLAN, must be between 1 and 4094
        """
        return pulumi.get(self, "vlan_id")

