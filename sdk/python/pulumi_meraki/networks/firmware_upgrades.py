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

__all__ = ['FirmwareUpgradesArgs', 'FirmwareUpgrades']

@pulumi.input_type
class FirmwareUpgradesArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[str],
                 products: Optional[pulumi.Input['FirmwareUpgradesProductsArgs']] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 upgrade_window: Optional[pulumi.Input['FirmwareUpgradesUpgradeWindowArgs']] = None):
        """
        The set of arguments for constructing a FirmwareUpgrades resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input['FirmwareUpgradesProductsArgs'] products: The network devices to be updated
        :param pulumi.Input[str] timezone: The timezone for the network
        :param pulumi.Input['FirmwareUpgradesUpgradeWindowArgs'] upgrade_window: Upgrade window for devices in network
        """
        pulumi.set(__self__, "network_id", network_id)
        if products is not None:
            pulumi.set(__self__, "products", products)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)
        if upgrade_window is not None:
            pulumi.set(__self__, "upgrade_window", upgrade_window)

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
    def products(self) -> Optional[pulumi.Input['FirmwareUpgradesProductsArgs']]:
        """
        The network devices to be updated
        """
        return pulumi.get(self, "products")

    @products.setter
    def products(self, value: Optional[pulumi.Input['FirmwareUpgradesProductsArgs']]):
        pulumi.set(self, "products", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        The timezone for the network
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)

    @property
    @pulumi.getter(name="upgradeWindow")
    def upgrade_window(self) -> Optional[pulumi.Input['FirmwareUpgradesUpgradeWindowArgs']]:
        """
        Upgrade window for devices in network
        """
        return pulumi.get(self, "upgrade_window")

    @upgrade_window.setter
    def upgrade_window(self, value: Optional[pulumi.Input['FirmwareUpgradesUpgradeWindowArgs']]):
        pulumi.set(self, "upgrade_window", value)


@pulumi.input_type
class _FirmwareUpgradesState:
    def __init__(__self__, *,
                 network_id: Optional[pulumi.Input[str]] = None,
                 products: Optional[pulumi.Input['FirmwareUpgradesProductsArgs']] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 upgrade_window: Optional[pulumi.Input['FirmwareUpgradesUpgradeWindowArgs']] = None):
        """
        Input properties used for looking up and filtering FirmwareUpgrades resources.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input['FirmwareUpgradesProductsArgs'] products: The network devices to be updated
        :param pulumi.Input[str] timezone: The timezone for the network
        :param pulumi.Input['FirmwareUpgradesUpgradeWindowArgs'] upgrade_window: Upgrade window for devices in network
        """
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if products is not None:
            pulumi.set(__self__, "products", products)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)
        if upgrade_window is not None:
            pulumi.set(__self__, "upgrade_window", upgrade_window)

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
    def products(self) -> Optional[pulumi.Input['FirmwareUpgradesProductsArgs']]:
        """
        The network devices to be updated
        """
        return pulumi.get(self, "products")

    @products.setter
    def products(self, value: Optional[pulumi.Input['FirmwareUpgradesProductsArgs']]):
        pulumi.set(self, "products", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        The timezone for the network
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)

    @property
    @pulumi.getter(name="upgradeWindow")
    def upgrade_window(self) -> Optional[pulumi.Input['FirmwareUpgradesUpgradeWindowArgs']]:
        """
        Upgrade window for devices in network
        """
        return pulumi.get(self, "upgrade_window")

    @upgrade_window.setter
    def upgrade_window(self, value: Optional[pulumi.Input['FirmwareUpgradesUpgradeWindowArgs']]):
        pulumi.set(self, "upgrade_window", value)


class FirmwareUpgrades(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 products: Optional[pulumi.Input[pulumi.InputType['FirmwareUpgradesProductsArgs']]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 upgrade_window: Optional[pulumi.Input[pulumi.InputType['FirmwareUpgradesUpgradeWindowArgs']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/firmwareUpgrades:FirmwareUpgrades example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[pulumi.InputType['FirmwareUpgradesProductsArgs']] products: The network devices to be updated
        :param pulumi.Input[str] timezone: The timezone for the network
        :param pulumi.Input[pulumi.InputType['FirmwareUpgradesUpgradeWindowArgs']] upgrade_window: Upgrade window for devices in network
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FirmwareUpgradesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/firmwareUpgrades:FirmwareUpgrades example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param FirmwareUpgradesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FirmwareUpgradesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 products: Optional[pulumi.Input[pulumi.InputType['FirmwareUpgradesProductsArgs']]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 upgrade_window: Optional[pulumi.Input[pulumi.InputType['FirmwareUpgradesUpgradeWindowArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FirmwareUpgradesArgs.__new__(FirmwareUpgradesArgs)

            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            __props__.__dict__["products"] = products
            __props__.__dict__["timezone"] = timezone
            __props__.__dict__["upgrade_window"] = upgrade_window
        super(FirmwareUpgrades, __self__).__init__(
            'meraki:networks/firmwareUpgrades:FirmwareUpgrades',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            network_id: Optional[pulumi.Input[str]] = None,
            products: Optional[pulumi.Input[pulumi.InputType['FirmwareUpgradesProductsArgs']]] = None,
            timezone: Optional[pulumi.Input[str]] = None,
            upgrade_window: Optional[pulumi.Input[pulumi.InputType['FirmwareUpgradesUpgradeWindowArgs']]] = None) -> 'FirmwareUpgrades':
        """
        Get an existing FirmwareUpgrades resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[pulumi.InputType['FirmwareUpgradesProductsArgs']] products: The network devices to be updated
        :param pulumi.Input[str] timezone: The timezone for the network
        :param pulumi.Input[pulumi.InputType['FirmwareUpgradesUpgradeWindowArgs']] upgrade_window: Upgrade window for devices in network
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FirmwareUpgradesState.__new__(_FirmwareUpgradesState)

        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["products"] = products
        __props__.__dict__["timezone"] = timezone
        __props__.__dict__["upgrade_window"] = upgrade_window
        return FirmwareUpgrades(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def products(self) -> pulumi.Output['outputs.FirmwareUpgradesProducts']:
        """
        The network devices to be updated
        """
        return pulumi.get(self, "products")

    @property
    @pulumi.getter
    def timezone(self) -> pulumi.Output[str]:
        """
        The timezone for the network
        """
        return pulumi.get(self, "timezone")

    @property
    @pulumi.getter(name="upgradeWindow")
    def upgrade_window(self) -> pulumi.Output['outputs.FirmwareUpgradesUpgradeWindow']:
        """
        Upgrade window for devices in network
        """
        return pulumi.get(self, "upgrade_window")

