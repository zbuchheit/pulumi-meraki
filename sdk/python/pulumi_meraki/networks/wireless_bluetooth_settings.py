# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['WirelessBluetoothSettingsArgs', 'WirelessBluetoothSettings']

@pulumi.input_type
class WirelessBluetoothSettingsArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[str],
                 advertising_enabled: Optional[pulumi.Input[bool]] = None,
                 major: Optional[pulumi.Input[int]] = None,
                 major_minor_assignment_mode: Optional[pulumi.Input[str]] = None,
                 minor: Optional[pulumi.Input[int]] = None,
                 scanning_enabled: Optional[pulumi.Input[bool]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a WirelessBluetoothSettings resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[bool] advertising_enabled: Whether APs will advertise beacons.
        :param pulumi.Input[int] major: The major number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        :param pulumi.Input[str] major_minor_assignment_mode: The way major and minor number should be assigned to nodes in the network. ('Unique', 'Non-unique')
        :param pulumi.Input[int] minor: The minor number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        :param pulumi.Input[bool] scanning_enabled: Whether APs will scan for Bluetooth enabled clients.
        :param pulumi.Input[str] uuid: The UUID to be used in the beacon identifier.
        """
        pulumi.set(__self__, "network_id", network_id)
        if advertising_enabled is not None:
            pulumi.set(__self__, "advertising_enabled", advertising_enabled)
        if major is not None:
            pulumi.set(__self__, "major", major)
        if major_minor_assignment_mode is not None:
            pulumi.set(__self__, "major_minor_assignment_mode", major_minor_assignment_mode)
        if minor is not None:
            pulumi.set(__self__, "minor", minor)
        if scanning_enabled is not None:
            pulumi.set(__self__, "scanning_enabled", scanning_enabled)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

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
    @pulumi.getter(name="advertisingEnabled")
    def advertising_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether APs will advertise beacons.
        """
        return pulumi.get(self, "advertising_enabled")

    @advertising_enabled.setter
    def advertising_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "advertising_enabled", value)

    @property
    @pulumi.getter
    def major(self) -> Optional[pulumi.Input[int]]:
        """
        The major number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        """
        return pulumi.get(self, "major")

    @major.setter
    def major(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "major", value)

    @property
    @pulumi.getter(name="majorMinorAssignmentMode")
    def major_minor_assignment_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The way major and minor number should be assigned to nodes in the network. ('Unique', 'Non-unique')
        """
        return pulumi.get(self, "major_minor_assignment_mode")

    @major_minor_assignment_mode.setter
    def major_minor_assignment_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "major_minor_assignment_mode", value)

    @property
    @pulumi.getter
    def minor(self) -> Optional[pulumi.Input[int]]:
        """
        The minor number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        """
        return pulumi.get(self, "minor")

    @minor.setter
    def minor(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "minor", value)

    @property
    @pulumi.getter(name="scanningEnabled")
    def scanning_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether APs will scan for Bluetooth enabled clients.
        """
        return pulumi.get(self, "scanning_enabled")

    @scanning_enabled.setter
    def scanning_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "scanning_enabled", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        """
        The UUID to be used in the beacon identifier.
        """
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


@pulumi.input_type
class _WirelessBluetoothSettingsState:
    def __init__(__self__, *,
                 advertising_enabled: Optional[pulumi.Input[bool]] = None,
                 esl_enabled: Optional[pulumi.Input[bool]] = None,
                 major: Optional[pulumi.Input[int]] = None,
                 major_minor_assignment_mode: Optional[pulumi.Input[str]] = None,
                 minor: Optional[pulumi.Input[int]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 scanning_enabled: Optional[pulumi.Input[bool]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WirelessBluetoothSettings resources.
        :param pulumi.Input[bool] advertising_enabled: Whether APs will advertise beacons.
        :param pulumi.Input[bool] esl_enabled: Whether ESL is enabled on this network.
        :param pulumi.Input[int] major: The major number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        :param pulumi.Input[str] major_minor_assignment_mode: The way major and minor number should be assigned to nodes in the network. ('Unique', 'Non-unique')
        :param pulumi.Input[int] minor: The minor number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[bool] scanning_enabled: Whether APs will scan for Bluetooth enabled clients.
        :param pulumi.Input[str] uuid: The UUID to be used in the beacon identifier.
        """
        if advertising_enabled is not None:
            pulumi.set(__self__, "advertising_enabled", advertising_enabled)
        if esl_enabled is not None:
            pulumi.set(__self__, "esl_enabled", esl_enabled)
        if major is not None:
            pulumi.set(__self__, "major", major)
        if major_minor_assignment_mode is not None:
            pulumi.set(__self__, "major_minor_assignment_mode", major_minor_assignment_mode)
        if minor is not None:
            pulumi.set(__self__, "minor", minor)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if scanning_enabled is not None:
            pulumi.set(__self__, "scanning_enabled", scanning_enabled)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter(name="advertisingEnabled")
    def advertising_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether APs will advertise beacons.
        """
        return pulumi.get(self, "advertising_enabled")

    @advertising_enabled.setter
    def advertising_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "advertising_enabled", value)

    @property
    @pulumi.getter(name="eslEnabled")
    def esl_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether ESL is enabled on this network.
        """
        return pulumi.get(self, "esl_enabled")

    @esl_enabled.setter
    def esl_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "esl_enabled", value)

    @property
    @pulumi.getter
    def major(self) -> Optional[pulumi.Input[int]]:
        """
        The major number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        """
        return pulumi.get(self, "major")

    @major.setter
    def major(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "major", value)

    @property
    @pulumi.getter(name="majorMinorAssignmentMode")
    def major_minor_assignment_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The way major and minor number should be assigned to nodes in the network. ('Unique', 'Non-unique')
        """
        return pulumi.get(self, "major_minor_assignment_mode")

    @major_minor_assignment_mode.setter
    def major_minor_assignment_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "major_minor_assignment_mode", value)

    @property
    @pulumi.getter
    def minor(self) -> Optional[pulumi.Input[int]]:
        """
        The minor number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        """
        return pulumi.get(self, "minor")

    @minor.setter
    def minor(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "minor", value)

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
    @pulumi.getter(name="scanningEnabled")
    def scanning_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether APs will scan for Bluetooth enabled clients.
        """
        return pulumi.get(self, "scanning_enabled")

    @scanning_enabled.setter
    def scanning_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "scanning_enabled", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        """
        The UUID to be used in the beacon identifier.
        """
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


class WirelessBluetoothSettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 advertising_enabled: Optional[pulumi.Input[bool]] = None,
                 major: Optional[pulumi.Input[int]] = None,
                 major_minor_assignment_mode: Optional[pulumi.Input[str]] = None,
                 minor: Optional[pulumi.Input[int]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 scanning_enabled: Optional[pulumi.Input[bool]] = None,
                 uuid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.WirelessBluetoothSettings("example",
            advertising_enabled=True,
            major=1,
            major_minor_assignment_mode="Non-unique",
            minor=1,
            network_id="string",
            scanning_enabled=True,
            uuid="00000000-0000-0000-000-000000000000")
        pulumi.export("merakiNetworksWirelessBluetoothSettingsExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] advertising_enabled: Whether APs will advertise beacons.
        :param pulumi.Input[int] major: The major number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        :param pulumi.Input[str] major_minor_assignment_mode: The way major and minor number should be assigned to nodes in the network. ('Unique', 'Non-unique')
        :param pulumi.Input[int] minor: The minor number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[bool] scanning_enabled: Whether APs will scan for Bluetooth enabled clients.
        :param pulumi.Input[str] uuid: The UUID to be used in the beacon identifier.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WirelessBluetoothSettingsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.WirelessBluetoothSettings("example",
            advertising_enabled=True,
            major=1,
            major_minor_assignment_mode="Non-unique",
            minor=1,
            network_id="string",
            scanning_enabled=True,
            uuid="00000000-0000-0000-000-000000000000")
        pulumi.export("merakiNetworksWirelessBluetoothSettingsExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param WirelessBluetoothSettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WirelessBluetoothSettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 advertising_enabled: Optional[pulumi.Input[bool]] = None,
                 major: Optional[pulumi.Input[int]] = None,
                 major_minor_assignment_mode: Optional[pulumi.Input[str]] = None,
                 minor: Optional[pulumi.Input[int]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 scanning_enabled: Optional[pulumi.Input[bool]] = None,
                 uuid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WirelessBluetoothSettingsArgs.__new__(WirelessBluetoothSettingsArgs)

            __props__.__dict__["advertising_enabled"] = advertising_enabled
            __props__.__dict__["major"] = major
            __props__.__dict__["major_minor_assignment_mode"] = major_minor_assignment_mode
            __props__.__dict__["minor"] = minor
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            __props__.__dict__["scanning_enabled"] = scanning_enabled
            __props__.__dict__["uuid"] = uuid
            __props__.__dict__["esl_enabled"] = None
        super(WirelessBluetoothSettings, __self__).__init__(
            'meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            advertising_enabled: Optional[pulumi.Input[bool]] = None,
            esl_enabled: Optional[pulumi.Input[bool]] = None,
            major: Optional[pulumi.Input[int]] = None,
            major_minor_assignment_mode: Optional[pulumi.Input[str]] = None,
            minor: Optional[pulumi.Input[int]] = None,
            network_id: Optional[pulumi.Input[str]] = None,
            scanning_enabled: Optional[pulumi.Input[bool]] = None,
            uuid: Optional[pulumi.Input[str]] = None) -> 'WirelessBluetoothSettings':
        """
        Get an existing WirelessBluetoothSettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] advertising_enabled: Whether APs will advertise beacons.
        :param pulumi.Input[bool] esl_enabled: Whether ESL is enabled on this network.
        :param pulumi.Input[int] major: The major number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        :param pulumi.Input[str] major_minor_assignment_mode: The way major and minor number should be assigned to nodes in the network. ('Unique', 'Non-unique')
        :param pulumi.Input[int] minor: The minor number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[bool] scanning_enabled: Whether APs will scan for Bluetooth enabled clients.
        :param pulumi.Input[str] uuid: The UUID to be used in the beacon identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WirelessBluetoothSettingsState.__new__(_WirelessBluetoothSettingsState)

        __props__.__dict__["advertising_enabled"] = advertising_enabled
        __props__.__dict__["esl_enabled"] = esl_enabled
        __props__.__dict__["major"] = major
        __props__.__dict__["major_minor_assignment_mode"] = major_minor_assignment_mode
        __props__.__dict__["minor"] = minor
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["scanning_enabled"] = scanning_enabled
        __props__.__dict__["uuid"] = uuid
        return WirelessBluetoothSettings(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="advertisingEnabled")
    def advertising_enabled(self) -> pulumi.Output[bool]:
        """
        Whether APs will advertise beacons.
        """
        return pulumi.get(self, "advertising_enabled")

    @property
    @pulumi.getter(name="eslEnabled")
    def esl_enabled(self) -> pulumi.Output[bool]:
        """
        Whether ESL is enabled on this network.
        """
        return pulumi.get(self, "esl_enabled")

    @property
    @pulumi.getter
    def major(self) -> pulumi.Output[int]:
        """
        The major number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        """
        return pulumi.get(self, "major")

    @property
    @pulumi.getter(name="majorMinorAssignmentMode")
    def major_minor_assignment_mode(self) -> pulumi.Output[str]:
        """
        The way major and minor number should be assigned to nodes in the network. ('Unique', 'Non-unique')
        """
        return pulumi.get(self, "major_minor_assignment_mode")

    @property
    @pulumi.getter
    def minor(self) -> pulumi.Output[int]:
        """
        The minor number to be used in the beacon identifier. Only valid in 'Non-unique' mode.
        """
        return pulumi.get(self, "minor")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter(name="scanningEnabled")
    def scanning_enabled(self) -> pulumi.Output[bool]:
        """
        Whether APs will scan for Bluetooth enabled clients.
        """
        return pulumi.get(self, "scanning_enabled")

    @property
    @pulumi.getter
    def uuid(self) -> pulumi.Output[str]:
        """
        The UUID to be used in the beacon identifier.
        """
        return pulumi.get(self, "uuid")

