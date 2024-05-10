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

__all__ = ['WirelessRadioSettingsArgs', 'WirelessRadioSettings']

@pulumi.input_type
class WirelessRadioSettingsArgs:
    def __init__(__self__, *,
                 serial: pulumi.Input[str],
                 five_ghz_settings: Optional[pulumi.Input['WirelessRadioSettingsFiveGhzSettingsArgs']] = None,
                 rf_profile_id: Optional[pulumi.Input[str]] = None,
                 two_four_ghz_settings: Optional[pulumi.Input['WirelessRadioSettingsTwoFourGhzSettingsArgs']] = None):
        """
        The set of arguments for constructing a WirelessRadioSettings resource.
        :param pulumi.Input[str] serial: serial path parameter.
        :param pulumi.Input['WirelessRadioSettingsFiveGhzSettingsArgs'] five_ghz_settings: Manual radio settings for 5 GHz.
        :param pulumi.Input[str] rf_profile_id: The ID of an RF profile to assign to the device. If the value of this parameter is null, the appropriate basic RF profile (indoor or outdoor) will be assigned to the device. Assigning an RF profile will clear ALL manually configured overrides on the device (channel width, channel, power).
        :param pulumi.Input['WirelessRadioSettingsTwoFourGhzSettingsArgs'] two_four_ghz_settings: Manual radio settings for 2.4 GHz.
        """
        pulumi.set(__self__, "serial", serial)
        if five_ghz_settings is not None:
            pulumi.set(__self__, "five_ghz_settings", five_ghz_settings)
        if rf_profile_id is not None:
            pulumi.set(__self__, "rf_profile_id", rf_profile_id)
        if two_four_ghz_settings is not None:
            pulumi.set(__self__, "two_four_ghz_settings", two_four_ghz_settings)

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
    @pulumi.getter(name="fiveGhzSettings")
    def five_ghz_settings(self) -> Optional[pulumi.Input['WirelessRadioSettingsFiveGhzSettingsArgs']]:
        """
        Manual radio settings for 5 GHz.
        """
        return pulumi.get(self, "five_ghz_settings")

    @five_ghz_settings.setter
    def five_ghz_settings(self, value: Optional[pulumi.Input['WirelessRadioSettingsFiveGhzSettingsArgs']]):
        pulumi.set(self, "five_ghz_settings", value)

    @property
    @pulumi.getter(name="rfProfileId")
    def rf_profile_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of an RF profile to assign to the device. If the value of this parameter is null, the appropriate basic RF profile (indoor or outdoor) will be assigned to the device. Assigning an RF profile will clear ALL manually configured overrides on the device (channel width, channel, power).
        """
        return pulumi.get(self, "rf_profile_id")

    @rf_profile_id.setter
    def rf_profile_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rf_profile_id", value)

    @property
    @pulumi.getter(name="twoFourGhzSettings")
    def two_four_ghz_settings(self) -> Optional[pulumi.Input['WirelessRadioSettingsTwoFourGhzSettingsArgs']]:
        """
        Manual radio settings for 2.4 GHz.
        """
        return pulumi.get(self, "two_four_ghz_settings")

    @two_four_ghz_settings.setter
    def two_four_ghz_settings(self, value: Optional[pulumi.Input['WirelessRadioSettingsTwoFourGhzSettingsArgs']]):
        pulumi.set(self, "two_four_ghz_settings", value)


@pulumi.input_type
class _WirelessRadioSettingsState:
    def __init__(__self__, *,
                 five_ghz_settings: Optional[pulumi.Input['WirelessRadioSettingsFiveGhzSettingsArgs']] = None,
                 rf_profile_id: Optional[pulumi.Input[str]] = None,
                 serial: Optional[pulumi.Input[str]] = None,
                 two_four_ghz_settings: Optional[pulumi.Input['WirelessRadioSettingsTwoFourGhzSettingsArgs']] = None):
        """
        Input properties used for looking up and filtering WirelessRadioSettings resources.
        :param pulumi.Input['WirelessRadioSettingsFiveGhzSettingsArgs'] five_ghz_settings: Manual radio settings for 5 GHz.
        :param pulumi.Input[str] rf_profile_id: The ID of an RF profile to assign to the device. If the value of this parameter is null, the appropriate basic RF profile (indoor or outdoor) will be assigned to the device. Assigning an RF profile will clear ALL manually configured overrides on the device (channel width, channel, power).
        :param pulumi.Input[str] serial: serial path parameter.
        :param pulumi.Input['WirelessRadioSettingsTwoFourGhzSettingsArgs'] two_four_ghz_settings: Manual radio settings for 2.4 GHz.
        """
        if five_ghz_settings is not None:
            pulumi.set(__self__, "five_ghz_settings", five_ghz_settings)
        if rf_profile_id is not None:
            pulumi.set(__self__, "rf_profile_id", rf_profile_id)
        if serial is not None:
            pulumi.set(__self__, "serial", serial)
        if two_four_ghz_settings is not None:
            pulumi.set(__self__, "two_four_ghz_settings", two_four_ghz_settings)

    @property
    @pulumi.getter(name="fiveGhzSettings")
    def five_ghz_settings(self) -> Optional[pulumi.Input['WirelessRadioSettingsFiveGhzSettingsArgs']]:
        """
        Manual radio settings for 5 GHz.
        """
        return pulumi.get(self, "five_ghz_settings")

    @five_ghz_settings.setter
    def five_ghz_settings(self, value: Optional[pulumi.Input['WirelessRadioSettingsFiveGhzSettingsArgs']]):
        pulumi.set(self, "five_ghz_settings", value)

    @property
    @pulumi.getter(name="rfProfileId")
    def rf_profile_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of an RF profile to assign to the device. If the value of this parameter is null, the appropriate basic RF profile (indoor or outdoor) will be assigned to the device. Assigning an RF profile will clear ALL manually configured overrides on the device (channel width, channel, power).
        """
        return pulumi.get(self, "rf_profile_id")

    @rf_profile_id.setter
    def rf_profile_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rf_profile_id", value)

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

    @property
    @pulumi.getter(name="twoFourGhzSettings")
    def two_four_ghz_settings(self) -> Optional[pulumi.Input['WirelessRadioSettingsTwoFourGhzSettingsArgs']]:
        """
        Manual radio settings for 2.4 GHz.
        """
        return pulumi.get(self, "two_four_ghz_settings")

    @two_four_ghz_settings.setter
    def two_four_ghz_settings(self, value: Optional[pulumi.Input['WirelessRadioSettingsTwoFourGhzSettingsArgs']]):
        pulumi.set(self, "two_four_ghz_settings", value)


class WirelessRadioSettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 five_ghz_settings: Optional[pulumi.Input[pulumi.InputType['WirelessRadioSettingsFiveGhzSettingsArgs']]] = None,
                 rf_profile_id: Optional[pulumi.Input[str]] = None,
                 serial: Optional[pulumi.Input[str]] = None,
                 two_four_ghz_settings: Optional[pulumi.Input[pulumi.InputType['WirelessRadioSettingsTwoFourGhzSettingsArgs']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:devices/wirelessRadioSettings:WirelessRadioSettings example "serial"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['WirelessRadioSettingsFiveGhzSettingsArgs']] five_ghz_settings: Manual radio settings for 5 GHz.
        :param pulumi.Input[str] rf_profile_id: The ID of an RF profile to assign to the device. If the value of this parameter is null, the appropriate basic RF profile (indoor or outdoor) will be assigned to the device. Assigning an RF profile will clear ALL manually configured overrides on the device (channel width, channel, power).
        :param pulumi.Input[str] serial: serial path parameter.
        :param pulumi.Input[pulumi.InputType['WirelessRadioSettingsTwoFourGhzSettingsArgs']] two_four_ghz_settings: Manual radio settings for 2.4 GHz.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WirelessRadioSettingsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:devices/wirelessRadioSettings:WirelessRadioSettings example "serial"
        ```

        :param str resource_name: The name of the resource.
        :param WirelessRadioSettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WirelessRadioSettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 five_ghz_settings: Optional[pulumi.Input[pulumi.InputType['WirelessRadioSettingsFiveGhzSettingsArgs']]] = None,
                 rf_profile_id: Optional[pulumi.Input[str]] = None,
                 serial: Optional[pulumi.Input[str]] = None,
                 two_four_ghz_settings: Optional[pulumi.Input[pulumi.InputType['WirelessRadioSettingsTwoFourGhzSettingsArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WirelessRadioSettingsArgs.__new__(WirelessRadioSettingsArgs)

            __props__.__dict__["five_ghz_settings"] = five_ghz_settings
            __props__.__dict__["rf_profile_id"] = rf_profile_id
            if serial is None and not opts.urn:
                raise TypeError("Missing required property 'serial'")
            __props__.__dict__["serial"] = serial
            __props__.__dict__["two_four_ghz_settings"] = two_four_ghz_settings
        super(WirelessRadioSettings, __self__).__init__(
            'meraki:devices/wirelessRadioSettings:WirelessRadioSettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            five_ghz_settings: Optional[pulumi.Input[pulumi.InputType['WirelessRadioSettingsFiveGhzSettingsArgs']]] = None,
            rf_profile_id: Optional[pulumi.Input[str]] = None,
            serial: Optional[pulumi.Input[str]] = None,
            two_four_ghz_settings: Optional[pulumi.Input[pulumi.InputType['WirelessRadioSettingsTwoFourGhzSettingsArgs']]] = None) -> 'WirelessRadioSettings':
        """
        Get an existing WirelessRadioSettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['WirelessRadioSettingsFiveGhzSettingsArgs']] five_ghz_settings: Manual radio settings for 5 GHz.
        :param pulumi.Input[str] rf_profile_id: The ID of an RF profile to assign to the device. If the value of this parameter is null, the appropriate basic RF profile (indoor or outdoor) will be assigned to the device. Assigning an RF profile will clear ALL manually configured overrides on the device (channel width, channel, power).
        :param pulumi.Input[str] serial: serial path parameter.
        :param pulumi.Input[pulumi.InputType['WirelessRadioSettingsTwoFourGhzSettingsArgs']] two_four_ghz_settings: Manual radio settings for 2.4 GHz.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WirelessRadioSettingsState.__new__(_WirelessRadioSettingsState)

        __props__.__dict__["five_ghz_settings"] = five_ghz_settings
        __props__.__dict__["rf_profile_id"] = rf_profile_id
        __props__.__dict__["serial"] = serial
        __props__.__dict__["two_four_ghz_settings"] = two_four_ghz_settings
        return WirelessRadioSettings(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="fiveGhzSettings")
    def five_ghz_settings(self) -> pulumi.Output['outputs.WirelessRadioSettingsFiveGhzSettings']:
        """
        Manual radio settings for 5 GHz.
        """
        return pulumi.get(self, "five_ghz_settings")

    @property
    @pulumi.getter(name="rfProfileId")
    def rf_profile_id(self) -> pulumi.Output[str]:
        """
        The ID of an RF profile to assign to the device. If the value of this parameter is null, the appropriate basic RF profile (indoor or outdoor) will be assigned to the device. Assigning an RF profile will clear ALL manually configured overrides on the device (channel width, channel, power).
        """
        return pulumi.get(self, "rf_profile_id")

    @property
    @pulumi.getter
    def serial(self) -> pulumi.Output[str]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

    @property
    @pulumi.getter(name="twoFourGhzSettings")
    def two_four_ghz_settings(self) -> pulumi.Output['outputs.WirelessRadioSettingsTwoFourGhzSettings']:
        """
        Manual radio settings for 2.4 GHz.
        """
        return pulumi.get(self, "two_four_ghz_settings")

