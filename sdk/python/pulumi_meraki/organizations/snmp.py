# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SnmpArgs', 'Snmp']

@pulumi.input_type
class SnmpArgs:
    def __init__(__self__, *,
                 organization_id: pulumi.Input[str],
                 peer_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 v2c_enabled: Optional[pulumi.Input[bool]] = None,
                 v3_auth_mode: Optional[pulumi.Input[str]] = None,
                 v3_auth_pass: Optional[pulumi.Input[str]] = None,
                 v3_enabled: Optional[pulumi.Input[bool]] = None,
                 v3_priv_mode: Optional[pulumi.Input[str]] = None,
                 v3_priv_pass: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Snmp resource.
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] peer_ips: The list of IPv4 addresses that are allowed to access the SNMP server.
        :param pulumi.Input[bool] v2c_enabled: Boolean indicating whether SNMP version 2c is enabled for the organization.
        :param pulumi.Input[str] v3_auth_mode: The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
        :param pulumi.Input[str] v3_auth_pass: The SNMP version 3 authentication password. Must be at least 8 characters if specified.
        :param pulumi.Input[bool] v3_enabled: Boolean indicating whether SNMP version 3 is enabled for the organization.
        :param pulumi.Input[str] v3_priv_mode: The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
        :param pulumi.Input[str] v3_priv_pass: The SNMP version 3 privacy password. Must be at least 8 characters if specified.
        """
        pulumi.set(__self__, "organization_id", organization_id)
        if peer_ips is not None:
            pulumi.set(__self__, "peer_ips", peer_ips)
        if v2c_enabled is not None:
            pulumi.set(__self__, "v2c_enabled", v2c_enabled)
        if v3_auth_mode is not None:
            pulumi.set(__self__, "v3_auth_mode", v3_auth_mode)
        if v3_auth_pass is not None:
            pulumi.set(__self__, "v3_auth_pass", v3_auth_pass)
        if v3_enabled is not None:
            pulumi.set(__self__, "v3_enabled", v3_enabled)
        if v3_priv_mode is not None:
            pulumi.set(__self__, "v3_priv_mode", v3_priv_mode)
        if v3_priv_pass is not None:
            pulumi.set(__self__, "v3_priv_pass", v3_priv_pass)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="peerIps")
    def peer_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of IPv4 addresses that are allowed to access the SNMP server.
        """
        return pulumi.get(self, "peer_ips")

    @peer_ips.setter
    def peer_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "peer_ips", value)

    @property
    @pulumi.getter(name="v2cEnabled")
    def v2c_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean indicating whether SNMP version 2c is enabled for the organization.
        """
        return pulumi.get(self, "v2c_enabled")

    @v2c_enabled.setter
    def v2c_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "v2c_enabled", value)

    @property
    @pulumi.getter(name="v3AuthMode")
    def v3_auth_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
        """
        return pulumi.get(self, "v3_auth_mode")

    @v3_auth_mode.setter
    def v3_auth_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "v3_auth_mode", value)

    @property
    @pulumi.getter(name="v3AuthPass")
    def v3_auth_pass(self) -> Optional[pulumi.Input[str]]:
        """
        The SNMP version 3 authentication password. Must be at least 8 characters if specified.
        """
        return pulumi.get(self, "v3_auth_pass")

    @v3_auth_pass.setter
    def v3_auth_pass(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "v3_auth_pass", value)

    @property
    @pulumi.getter(name="v3Enabled")
    def v3_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean indicating whether SNMP version 3 is enabled for the organization.
        """
        return pulumi.get(self, "v3_enabled")

    @v3_enabled.setter
    def v3_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "v3_enabled", value)

    @property
    @pulumi.getter(name="v3PrivMode")
    def v3_priv_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
        """
        return pulumi.get(self, "v3_priv_mode")

    @v3_priv_mode.setter
    def v3_priv_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "v3_priv_mode", value)

    @property
    @pulumi.getter(name="v3PrivPass")
    def v3_priv_pass(self) -> Optional[pulumi.Input[str]]:
        """
        The SNMP version 3 privacy password. Must be at least 8 characters if specified.
        """
        return pulumi.get(self, "v3_priv_pass")

    @v3_priv_pass.setter
    def v3_priv_pass(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "v3_priv_pass", value)


@pulumi.input_type
class _SnmpState:
    def __init__(__self__, *,
                 hostname: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 peer_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 v2_community_string: Optional[pulumi.Input[str]] = None,
                 v2c_enabled: Optional[pulumi.Input[bool]] = None,
                 v3_auth_mode: Optional[pulumi.Input[str]] = None,
                 v3_auth_pass: Optional[pulumi.Input[str]] = None,
                 v3_enabled: Optional[pulumi.Input[bool]] = None,
                 v3_priv_mode: Optional[pulumi.Input[str]] = None,
                 v3_priv_pass: Optional[pulumi.Input[str]] = None,
                 v3_user: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Snmp resources.
        :param pulumi.Input[str] hostname: The hostname of the SNMP server.
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] peer_ips: The list of IPv4 addresses that are allowed to access the SNMP server.
        :param pulumi.Input[int] port: The port of the SNMP server.
        :param pulumi.Input[str] v2_community_string: The community string for SNMP version 2c, if enabled.
        :param pulumi.Input[bool] v2c_enabled: Boolean indicating whether SNMP version 2c is enabled for the organization.
        :param pulumi.Input[str] v3_auth_mode: The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
        :param pulumi.Input[str] v3_auth_pass: The SNMP version 3 authentication password. Must be at least 8 characters if specified.
        :param pulumi.Input[bool] v3_enabled: Boolean indicating whether SNMP version 3 is enabled for the organization.
        :param pulumi.Input[str] v3_priv_mode: The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
        :param pulumi.Input[str] v3_priv_pass: The SNMP version 3 privacy password. Must be at least 8 characters if specified.
        :param pulumi.Input[str] v3_user: The user for SNMP version 3, if enabled.
        """
        if hostname is not None:
            pulumi.set(__self__, "hostname", hostname)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if peer_ips is not None:
            pulumi.set(__self__, "peer_ips", peer_ips)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if v2_community_string is not None:
            pulumi.set(__self__, "v2_community_string", v2_community_string)
        if v2c_enabled is not None:
            pulumi.set(__self__, "v2c_enabled", v2c_enabled)
        if v3_auth_mode is not None:
            pulumi.set(__self__, "v3_auth_mode", v3_auth_mode)
        if v3_auth_pass is not None:
            pulumi.set(__self__, "v3_auth_pass", v3_auth_pass)
        if v3_enabled is not None:
            pulumi.set(__self__, "v3_enabled", v3_enabled)
        if v3_priv_mode is not None:
            pulumi.set(__self__, "v3_priv_mode", v3_priv_mode)
        if v3_priv_pass is not None:
            pulumi.set(__self__, "v3_priv_pass", v3_priv_pass)
        if v3_user is not None:
            pulumi.set(__self__, "v3_user", v3_user)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        """
        The hostname of the SNMP server.
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="peerIps")
    def peer_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of IPv4 addresses that are allowed to access the SNMP server.
        """
        return pulumi.get(self, "peer_ips")

    @peer_ips.setter
    def peer_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "peer_ips", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        The port of the SNMP server.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter(name="v2CommunityString")
    def v2_community_string(self) -> Optional[pulumi.Input[str]]:
        """
        The community string for SNMP version 2c, if enabled.
        """
        return pulumi.get(self, "v2_community_string")

    @v2_community_string.setter
    def v2_community_string(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "v2_community_string", value)

    @property
    @pulumi.getter(name="v2cEnabled")
    def v2c_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean indicating whether SNMP version 2c is enabled for the organization.
        """
        return pulumi.get(self, "v2c_enabled")

    @v2c_enabled.setter
    def v2c_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "v2c_enabled", value)

    @property
    @pulumi.getter(name="v3AuthMode")
    def v3_auth_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
        """
        return pulumi.get(self, "v3_auth_mode")

    @v3_auth_mode.setter
    def v3_auth_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "v3_auth_mode", value)

    @property
    @pulumi.getter(name="v3AuthPass")
    def v3_auth_pass(self) -> Optional[pulumi.Input[str]]:
        """
        The SNMP version 3 authentication password. Must be at least 8 characters if specified.
        """
        return pulumi.get(self, "v3_auth_pass")

    @v3_auth_pass.setter
    def v3_auth_pass(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "v3_auth_pass", value)

    @property
    @pulumi.getter(name="v3Enabled")
    def v3_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean indicating whether SNMP version 3 is enabled for the organization.
        """
        return pulumi.get(self, "v3_enabled")

    @v3_enabled.setter
    def v3_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "v3_enabled", value)

    @property
    @pulumi.getter(name="v3PrivMode")
    def v3_priv_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
        """
        return pulumi.get(self, "v3_priv_mode")

    @v3_priv_mode.setter
    def v3_priv_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "v3_priv_mode", value)

    @property
    @pulumi.getter(name="v3PrivPass")
    def v3_priv_pass(self) -> Optional[pulumi.Input[str]]:
        """
        The SNMP version 3 privacy password. Must be at least 8 characters if specified.
        """
        return pulumi.get(self, "v3_priv_pass")

    @v3_priv_pass.setter
    def v3_priv_pass(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "v3_priv_pass", value)

    @property
    @pulumi.getter(name="v3User")
    def v3_user(self) -> Optional[pulumi.Input[str]]:
        """
        The user for SNMP version 3, if enabled.
        """
        return pulumi.get(self, "v3_user")

    @v3_user.setter
    def v3_user(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "v3_user", value)


class Snmp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 peer_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 v2c_enabled: Optional[pulumi.Input[bool]] = None,
                 v3_auth_mode: Optional[pulumi.Input[str]] = None,
                 v3_auth_pass: Optional[pulumi.Input[str]] = None,
                 v3_enabled: Optional[pulumi.Input[bool]] = None,
                 v3_priv_mode: Optional[pulumi.Input[str]] = None,
                 v3_priv_pass: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.Snmp("example",
            organization_id="string",
            peer_ips=["123.123.123.1"],
            v2c_enabled=False,
            v3_auth_mode="SHA",
            v3_auth_pass="password",
            v3_enabled=True,
            v3_priv_mode="AES128",
            v3_priv_pass="password")
        pulumi.export("merakiOrganizationsSnmpExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/snmp:Snmp example "organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] peer_ips: The list of IPv4 addresses that are allowed to access the SNMP server.
        :param pulumi.Input[bool] v2c_enabled: Boolean indicating whether SNMP version 2c is enabled for the organization.
        :param pulumi.Input[str] v3_auth_mode: The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
        :param pulumi.Input[str] v3_auth_pass: The SNMP version 3 authentication password. Must be at least 8 characters if specified.
        :param pulumi.Input[bool] v3_enabled: Boolean indicating whether SNMP version 3 is enabled for the organization.
        :param pulumi.Input[str] v3_priv_mode: The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
        :param pulumi.Input[str] v3_priv_pass: The SNMP version 3 privacy password. Must be at least 8 characters if specified.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SnmpArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.Snmp("example",
            organization_id="string",
            peer_ips=["123.123.123.1"],
            v2c_enabled=False,
            v3_auth_mode="SHA",
            v3_auth_pass="password",
            v3_enabled=True,
            v3_priv_mode="AES128",
            v3_priv_pass="password")
        pulumi.export("merakiOrganizationsSnmpExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/snmp:Snmp example "organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param SnmpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SnmpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 peer_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 v2c_enabled: Optional[pulumi.Input[bool]] = None,
                 v3_auth_mode: Optional[pulumi.Input[str]] = None,
                 v3_auth_pass: Optional[pulumi.Input[str]] = None,
                 v3_enabled: Optional[pulumi.Input[bool]] = None,
                 v3_priv_mode: Optional[pulumi.Input[str]] = None,
                 v3_priv_pass: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SnmpArgs.__new__(SnmpArgs)

            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            __props__.__dict__["peer_ips"] = peer_ips
            __props__.__dict__["v2c_enabled"] = v2c_enabled
            __props__.__dict__["v3_auth_mode"] = v3_auth_mode
            __props__.__dict__["v3_auth_pass"] = v3_auth_pass
            __props__.__dict__["v3_enabled"] = v3_enabled
            __props__.__dict__["v3_priv_mode"] = v3_priv_mode
            __props__.__dict__["v3_priv_pass"] = v3_priv_pass
            __props__.__dict__["hostname"] = None
            __props__.__dict__["port"] = None
            __props__.__dict__["v2_community_string"] = None
            __props__.__dict__["v3_user"] = None
        super(Snmp, __self__).__init__(
            'meraki:organizations/snmp:Snmp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            hostname: Optional[pulumi.Input[str]] = None,
            organization_id: Optional[pulumi.Input[str]] = None,
            peer_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            port: Optional[pulumi.Input[int]] = None,
            v2_community_string: Optional[pulumi.Input[str]] = None,
            v2c_enabled: Optional[pulumi.Input[bool]] = None,
            v3_auth_mode: Optional[pulumi.Input[str]] = None,
            v3_auth_pass: Optional[pulumi.Input[str]] = None,
            v3_enabled: Optional[pulumi.Input[bool]] = None,
            v3_priv_mode: Optional[pulumi.Input[str]] = None,
            v3_priv_pass: Optional[pulumi.Input[str]] = None,
            v3_user: Optional[pulumi.Input[str]] = None) -> 'Snmp':
        """
        Get an existing Snmp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] hostname: The hostname of the SNMP server.
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] peer_ips: The list of IPv4 addresses that are allowed to access the SNMP server.
        :param pulumi.Input[int] port: The port of the SNMP server.
        :param pulumi.Input[str] v2_community_string: The community string for SNMP version 2c, if enabled.
        :param pulumi.Input[bool] v2c_enabled: Boolean indicating whether SNMP version 2c is enabled for the organization.
        :param pulumi.Input[str] v3_auth_mode: The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
        :param pulumi.Input[str] v3_auth_pass: The SNMP version 3 authentication password. Must be at least 8 characters if specified.
        :param pulumi.Input[bool] v3_enabled: Boolean indicating whether SNMP version 3 is enabled for the organization.
        :param pulumi.Input[str] v3_priv_mode: The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
        :param pulumi.Input[str] v3_priv_pass: The SNMP version 3 privacy password. Must be at least 8 characters if specified.
        :param pulumi.Input[str] v3_user: The user for SNMP version 3, if enabled.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SnmpState.__new__(_SnmpState)

        __props__.__dict__["hostname"] = hostname
        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["peer_ips"] = peer_ips
        __props__.__dict__["port"] = port
        __props__.__dict__["v2_community_string"] = v2_community_string
        __props__.__dict__["v2c_enabled"] = v2c_enabled
        __props__.__dict__["v3_auth_mode"] = v3_auth_mode
        __props__.__dict__["v3_auth_pass"] = v3_auth_pass
        __props__.__dict__["v3_enabled"] = v3_enabled
        __props__.__dict__["v3_priv_mode"] = v3_priv_mode
        __props__.__dict__["v3_priv_pass"] = v3_priv_pass
        __props__.__dict__["v3_user"] = v3_user
        return Snmp(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Output[str]:
        """
        The hostname of the SNMP server.
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="peerIps")
    def peer_ips(self) -> pulumi.Output[Sequence[str]]:
        """
        The list of IPv4 addresses that are allowed to access the SNMP server.
        """
        return pulumi.get(self, "peer_ips")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[int]:
        """
        The port of the SNMP server.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="v2CommunityString")
    def v2_community_string(self) -> pulumi.Output[str]:
        """
        The community string for SNMP version 2c, if enabled.
        """
        return pulumi.get(self, "v2_community_string")

    @property
    @pulumi.getter(name="v2cEnabled")
    def v2c_enabled(self) -> pulumi.Output[bool]:
        """
        Boolean indicating whether SNMP version 2c is enabled for the organization.
        """
        return pulumi.get(self, "v2c_enabled")

    @property
    @pulumi.getter(name="v3AuthMode")
    def v3_auth_mode(self) -> pulumi.Output[str]:
        """
        The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
        """
        return pulumi.get(self, "v3_auth_mode")

    @property
    @pulumi.getter(name="v3AuthPass")
    def v3_auth_pass(self) -> pulumi.Output[str]:
        """
        The SNMP version 3 authentication password. Must be at least 8 characters if specified.
        """
        return pulumi.get(self, "v3_auth_pass")

    @property
    @pulumi.getter(name="v3Enabled")
    def v3_enabled(self) -> pulumi.Output[bool]:
        """
        Boolean indicating whether SNMP version 3 is enabled for the organization.
        """
        return pulumi.get(self, "v3_enabled")

    @property
    @pulumi.getter(name="v3PrivMode")
    def v3_priv_mode(self) -> pulumi.Output[str]:
        """
        The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
        """
        return pulumi.get(self, "v3_priv_mode")

    @property
    @pulumi.getter(name="v3PrivPass")
    def v3_priv_pass(self) -> pulumi.Output[str]:
        """
        The SNMP version 3 privacy password. Must be at least 8 characters if specified.
        """
        return pulumi.get(self, "v3_priv_pass")

    @property
    @pulumi.getter(name="v3User")
    def v3_user(self) -> pulumi.Output[str]:
        """
        The user for SNMP version 3, if enabled.
        """
        return pulumi.get(self, "v3_user")

