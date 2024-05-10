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

__all__ = ['CellularGatewayPortForwardingRulesArgs', 'CellularGatewayPortForwardingRules']

@pulumi.input_type
class CellularGatewayPortForwardingRulesArgs:
    def __init__(__self__, *,
                 serial: pulumi.Input[str],
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['CellularGatewayPortForwardingRulesRuleArgs']]]] = None):
        """
        The set of arguments for constructing a CellularGatewayPortForwardingRules resource.
        :param pulumi.Input[str] serial: serial path parameter.
        :param pulumi.Input[Sequence[pulumi.Input['CellularGatewayPortForwardingRulesRuleArgs']]] rules: An array of port forwarding params
        """
        pulumi.set(__self__, "serial", serial)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

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

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CellularGatewayPortForwardingRulesRuleArgs']]]]:
        """
        An array of port forwarding params
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CellularGatewayPortForwardingRulesRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.input_type
class _CellularGatewayPortForwardingRulesState:
    def __init__(__self__, *,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['CellularGatewayPortForwardingRulesRuleArgs']]]] = None,
                 serial: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CellularGatewayPortForwardingRules resources.
        :param pulumi.Input[Sequence[pulumi.Input['CellularGatewayPortForwardingRulesRuleArgs']]] rules: An array of port forwarding params
        :param pulumi.Input[str] serial: serial path parameter.
        """
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if serial is not None:
            pulumi.set(__self__, "serial", serial)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CellularGatewayPortForwardingRulesRuleArgs']]]]:
        """
        An array of port forwarding params
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CellularGatewayPortForwardingRulesRuleArgs']]]]):
        pulumi.set(self, "rules", value)

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


class CellularGatewayPortForwardingRules(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CellularGatewayPortForwardingRulesRuleArgs']]]]] = None,
                 serial: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:devices/cellularGatewayPortForwardingRules:CellularGatewayPortForwardingRules example "serial"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CellularGatewayPortForwardingRulesRuleArgs']]]] rules: An array of port forwarding params
        :param pulumi.Input[str] serial: serial path parameter.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CellularGatewayPortForwardingRulesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:devices/cellularGatewayPortForwardingRules:CellularGatewayPortForwardingRules example "serial"
        ```

        :param str resource_name: The name of the resource.
        :param CellularGatewayPortForwardingRulesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CellularGatewayPortForwardingRulesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CellularGatewayPortForwardingRulesRuleArgs']]]]] = None,
                 serial: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CellularGatewayPortForwardingRulesArgs.__new__(CellularGatewayPortForwardingRulesArgs)

            __props__.__dict__["rules"] = rules
            if serial is None and not opts.urn:
                raise TypeError("Missing required property 'serial'")
            __props__.__dict__["serial"] = serial
        super(CellularGatewayPortForwardingRules, __self__).__init__(
            'meraki:devices/cellularGatewayPortForwardingRules:CellularGatewayPortForwardingRules',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CellularGatewayPortForwardingRulesRuleArgs']]]]] = None,
            serial: Optional[pulumi.Input[str]] = None) -> 'CellularGatewayPortForwardingRules':
        """
        Get an existing CellularGatewayPortForwardingRules resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CellularGatewayPortForwardingRulesRuleArgs']]]] rules: An array of port forwarding params
        :param pulumi.Input[str] serial: serial path parameter.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CellularGatewayPortForwardingRulesState.__new__(_CellularGatewayPortForwardingRulesState)

        __props__.__dict__["rules"] = rules
        __props__.__dict__["serial"] = serial
        return CellularGatewayPortForwardingRules(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence['outputs.CellularGatewayPortForwardingRulesRule']]:
        """
        An array of port forwarding params
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter
    def serial(self) -> pulumi.Output[str]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

