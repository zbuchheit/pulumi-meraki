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

__all__ = ['ApplianceFirewallInboundFirewallRulesArgs', 'ApplianceFirewallInboundFirewallRules']

@pulumi.input_type
class ApplianceFirewallInboundFirewallRulesArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[str],
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallInboundFirewallRulesRuleArgs']]]] = None,
                 syslog_default_rule: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ApplianceFirewallInboundFirewallRules resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallInboundFirewallRulesRuleArgs']]] rules: An ordered array of the firewall rules (not including the default rule)
        :param pulumi.Input[bool] syslog_default_rule: Log the special default rule (boolean value - enable only if you've configured a syslog server) (optional)
        """
        pulumi.set(__self__, "network_id", network_id)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if syslog_default_rule is not None:
            pulumi.set(__self__, "syslog_default_rule", syslog_default_rule)

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
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallInboundFirewallRulesRuleArgs']]]]:
        """
        An ordered array of the firewall rules (not including the default rule)
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallInboundFirewallRulesRuleArgs']]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter(name="syslogDefaultRule")
    def syslog_default_rule(self) -> Optional[pulumi.Input[bool]]:
        """
        Log the special default rule (boolean value - enable only if you've configured a syslog server) (optional)
        """
        return pulumi.get(self, "syslog_default_rule")

    @syslog_default_rule.setter
    def syslog_default_rule(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "syslog_default_rule", value)


@pulumi.input_type
class _ApplianceFirewallInboundFirewallRulesState:
    def __init__(__self__, *,
                 network_id: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallInboundFirewallRulesRuleArgs']]]] = None,
                 syslog_default_rule: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering ApplianceFirewallInboundFirewallRules resources.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallInboundFirewallRulesRuleArgs']]] rules: An ordered array of the firewall rules (not including the default rule)
        :param pulumi.Input[bool] syslog_default_rule: Log the special default rule (boolean value - enable only if you've configured a syslog server) (optional)
        """
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if syslog_default_rule is not None:
            pulumi.set(__self__, "syslog_default_rule", syslog_default_rule)

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
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallInboundFirewallRulesRuleArgs']]]]:
        """
        An ordered array of the firewall rules (not including the default rule)
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallInboundFirewallRulesRuleArgs']]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter(name="syslogDefaultRule")
    def syslog_default_rule(self) -> Optional[pulumi.Input[bool]]:
        """
        Log the special default rule (boolean value - enable only if you've configured a syslog server) (optional)
        """
        return pulumi.get(self, "syslog_default_rule")

    @syslog_default_rule.setter
    def syslog_default_rule(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "syslog_default_rule", value)


class ApplianceFirewallInboundFirewallRules(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApplianceFirewallInboundFirewallRulesRuleArgs']]]]] = None,
                 syslog_default_rule: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/applianceFirewallInboundFirewallRules:ApplianceFirewallInboundFirewallRules example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApplianceFirewallInboundFirewallRulesRuleArgs']]]] rules: An ordered array of the firewall rules (not including the default rule)
        :param pulumi.Input[bool] syslog_default_rule: Log the special default rule (boolean value - enable only if you've configured a syslog server) (optional)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplianceFirewallInboundFirewallRulesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/applianceFirewallInboundFirewallRules:ApplianceFirewallInboundFirewallRules example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param ApplianceFirewallInboundFirewallRulesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplianceFirewallInboundFirewallRulesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApplianceFirewallInboundFirewallRulesRuleArgs']]]]] = None,
                 syslog_default_rule: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplianceFirewallInboundFirewallRulesArgs.__new__(ApplianceFirewallInboundFirewallRulesArgs)

            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            __props__.__dict__["rules"] = rules
            __props__.__dict__["syslog_default_rule"] = syslog_default_rule
        super(ApplianceFirewallInboundFirewallRules, __self__).__init__(
            'meraki:networks/applianceFirewallInboundFirewallRules:ApplianceFirewallInboundFirewallRules',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            network_id: Optional[pulumi.Input[str]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApplianceFirewallInboundFirewallRulesRuleArgs']]]]] = None,
            syslog_default_rule: Optional[pulumi.Input[bool]] = None) -> 'ApplianceFirewallInboundFirewallRules':
        """
        Get an existing ApplianceFirewallInboundFirewallRules resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApplianceFirewallInboundFirewallRulesRuleArgs']]]] rules: An ordered array of the firewall rules (not including the default rule)
        :param pulumi.Input[bool] syslog_default_rule: Log the special default rule (boolean value - enable only if you've configured a syslog server) (optional)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplianceFirewallInboundFirewallRulesState.__new__(_ApplianceFirewallInboundFirewallRulesState)

        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["rules"] = rules
        __props__.__dict__["syslog_default_rule"] = syslog_default_rule
        return ApplianceFirewallInboundFirewallRules(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence['outputs.ApplianceFirewallInboundFirewallRulesRule']]:
        """
        An ordered array of the firewall rules (not including the default rule)
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter(name="syslogDefaultRule")
    def syslog_default_rule(self) -> pulumi.Output[bool]:
        """
        Log the special default rule (boolean value - enable only if you've configured a syslog server) (optional)
        """
        return pulumi.get(self, "syslog_default_rule")
