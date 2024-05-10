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

__all__ = ['LicensesArgs', 'Licenses']

@pulumi.input_type
class LicensesArgs:
    def __init__(__self__, *,
                 license_id: pulumi.Input[str],
                 organization_id: pulumi.Input[str],
                 device_serial: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Licenses resource.
        :param pulumi.Input[str] license_id: licenseId path parameter. License ID
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[str] device_serial: Serial number of the device the license is assigned to
        """
        pulumi.set(__self__, "license_id", license_id)
        pulumi.set(__self__, "organization_id", organization_id)
        if device_serial is not None:
            pulumi.set(__self__, "device_serial", device_serial)

    @property
    @pulumi.getter(name="licenseId")
    def license_id(self) -> pulumi.Input[str]:
        """
        licenseId path parameter. License ID
        """
        return pulumi.get(self, "license_id")

    @license_id.setter
    def license_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "license_id", value)

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
    @pulumi.getter(name="deviceSerial")
    def device_serial(self) -> Optional[pulumi.Input[str]]:
        """
        Serial number of the device the license is assigned to
        """
        return pulumi.get(self, "device_serial")

    @device_serial.setter
    def device_serial(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_serial", value)


@pulumi.input_type
class _LicensesState:
    def __init__(__self__, *,
                 activation_date: Optional[pulumi.Input[str]] = None,
                 claim_date: Optional[pulumi.Input[str]] = None,
                 device_serial: Optional[pulumi.Input[str]] = None,
                 duration_in_days: Optional[pulumi.Input[int]] = None,
                 expiration_date: Optional[pulumi.Input[str]] = None,
                 head_license_id: Optional[pulumi.Input[str]] = None,
                 license_id: Optional[pulumi.Input[str]] = None,
                 license_key: Optional[pulumi.Input[str]] = None,
                 license_type: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 order_number: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 permanently_queued_licenses: Optional[pulumi.Input[Sequence[pulumi.Input['LicensesPermanentlyQueuedLicenseArgs']]]] = None,
                 seat_count: Optional[pulumi.Input[int]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 total_duration_in_days: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Licenses resources.
        :param pulumi.Input[str] activation_date: The date the license started burning
        :param pulumi.Input[str] claim_date: The date the license was claimed into the organization
        :param pulumi.Input[str] device_serial: Serial number of the device the license is assigned to
        :param pulumi.Input[int] duration_in_days: The duration of the individual license
        :param pulumi.Input[str] expiration_date: The date the license will expire
        :param pulumi.Input[str] head_license_id: The id of the head license this license is queued behind. If there is no head license, it returns nil.
        :param pulumi.Input[str] license_id: licenseId path parameter. License ID
        :param pulumi.Input[str] license_key: License key
        :param pulumi.Input[str] license_type: License type
        :param pulumi.Input[str] network_id: ID of the network the license is assigned to
        :param pulumi.Input[str] order_number: Order number
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Sequence[pulumi.Input['LicensesPermanentlyQueuedLicenseArgs']]] permanently_queued_licenses: DEPRECATED List of permanently queued licenses attached to the license. Instead, use /organizations/{organizationId}/licenses?deviceSerial= to retrieved queued licenses for a given device.
        :param pulumi.Input[int] seat_count: The number of seats of the license. Only applicable to SM licenses.
        :param pulumi.Input[str] state: The state of the license. All queued licenses have a status of *recentlyQueued*.
        :param pulumi.Input[int] total_duration_in_days: The duration of the license plus all permanently queued licenses associated with it
        """
        if activation_date is not None:
            pulumi.set(__self__, "activation_date", activation_date)
        if claim_date is not None:
            pulumi.set(__self__, "claim_date", claim_date)
        if device_serial is not None:
            pulumi.set(__self__, "device_serial", device_serial)
        if duration_in_days is not None:
            pulumi.set(__self__, "duration_in_days", duration_in_days)
        if expiration_date is not None:
            pulumi.set(__self__, "expiration_date", expiration_date)
        if head_license_id is not None:
            pulumi.set(__self__, "head_license_id", head_license_id)
        if license_id is not None:
            pulumi.set(__self__, "license_id", license_id)
        if license_key is not None:
            pulumi.set(__self__, "license_key", license_key)
        if license_type is not None:
            pulumi.set(__self__, "license_type", license_type)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if order_number is not None:
            pulumi.set(__self__, "order_number", order_number)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if permanently_queued_licenses is not None:
            pulumi.set(__self__, "permanently_queued_licenses", permanently_queued_licenses)
        if seat_count is not None:
            pulumi.set(__self__, "seat_count", seat_count)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if total_duration_in_days is not None:
            pulumi.set(__self__, "total_duration_in_days", total_duration_in_days)

    @property
    @pulumi.getter(name="activationDate")
    def activation_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date the license started burning
        """
        return pulumi.get(self, "activation_date")

    @activation_date.setter
    def activation_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "activation_date", value)

    @property
    @pulumi.getter(name="claimDate")
    def claim_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date the license was claimed into the organization
        """
        return pulumi.get(self, "claim_date")

    @claim_date.setter
    def claim_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "claim_date", value)

    @property
    @pulumi.getter(name="deviceSerial")
    def device_serial(self) -> Optional[pulumi.Input[str]]:
        """
        Serial number of the device the license is assigned to
        """
        return pulumi.get(self, "device_serial")

    @device_serial.setter
    def device_serial(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_serial", value)

    @property
    @pulumi.getter(name="durationInDays")
    def duration_in_days(self) -> Optional[pulumi.Input[int]]:
        """
        The duration of the individual license
        """
        return pulumi.get(self, "duration_in_days")

    @duration_in_days.setter
    def duration_in_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "duration_in_days", value)

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date the license will expire
        """
        return pulumi.get(self, "expiration_date")

    @expiration_date.setter
    def expiration_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiration_date", value)

    @property
    @pulumi.getter(name="headLicenseId")
    def head_license_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the head license this license is queued behind. If there is no head license, it returns nil.
        """
        return pulumi.get(self, "head_license_id")

    @head_license_id.setter
    def head_license_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "head_license_id", value)

    @property
    @pulumi.getter(name="licenseId")
    def license_id(self) -> Optional[pulumi.Input[str]]:
        """
        licenseId path parameter. License ID
        """
        return pulumi.get(self, "license_id")

    @license_id.setter
    def license_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "license_id", value)

    @property
    @pulumi.getter(name="licenseKey")
    def license_key(self) -> Optional[pulumi.Input[str]]:
        """
        License key
        """
        return pulumi.get(self, "license_key")

    @license_key.setter
    def license_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "license_key", value)

    @property
    @pulumi.getter(name="licenseType")
    def license_type(self) -> Optional[pulumi.Input[str]]:
        """
        License type
        """
        return pulumi.get(self, "license_type")

    @license_type.setter
    def license_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "license_type", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the network the license is assigned to
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter(name="orderNumber")
    def order_number(self) -> Optional[pulumi.Input[str]]:
        """
        Order number
        """
        return pulumi.get(self, "order_number")

    @order_number.setter
    def order_number(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "order_number", value)

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
    @pulumi.getter(name="permanentlyQueuedLicenses")
    def permanently_queued_licenses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LicensesPermanentlyQueuedLicenseArgs']]]]:
        """
        DEPRECATED List of permanently queued licenses attached to the license. Instead, use /organizations/{organizationId}/licenses?deviceSerial= to retrieved queued licenses for a given device.
        """
        return pulumi.get(self, "permanently_queued_licenses")

    @permanently_queued_licenses.setter
    def permanently_queued_licenses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LicensesPermanentlyQueuedLicenseArgs']]]]):
        pulumi.set(self, "permanently_queued_licenses", value)

    @property
    @pulumi.getter(name="seatCount")
    def seat_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of seats of the license. Only applicable to SM licenses.
        """
        return pulumi.get(self, "seat_count")

    @seat_count.setter
    def seat_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "seat_count", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the license. All queued licenses have a status of *recentlyQueued*.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter(name="totalDurationInDays")
    def total_duration_in_days(self) -> Optional[pulumi.Input[int]]:
        """
        The duration of the license plus all permanently queued licenses associated with it
        """
        return pulumi.get(self, "total_duration_in_days")

    @total_duration_in_days.setter
    def total_duration_in_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "total_duration_in_days", value)


class Licenses(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_serial: Optional[pulumi.Input[str]] = None,
                 license_id: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.Licenses("example",
            device_serial="Q234-ABCD-5678",
            license_id="string",
            organization_id="string")
        pulumi.export("merakiOrganizationsLicensesExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/licenses:Licenses example "license_id,organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device_serial: Serial number of the device the license is assigned to
        :param pulumi.Input[str] license_id: licenseId path parameter. License ID
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LicensesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.Licenses("example",
            device_serial="Q234-ABCD-5678",
            license_id="string",
            organization_id="string")
        pulumi.export("merakiOrganizationsLicensesExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/licenses:Licenses example "license_id,organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param LicensesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LicensesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_serial: Optional[pulumi.Input[str]] = None,
                 license_id: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LicensesArgs.__new__(LicensesArgs)

            __props__.__dict__["device_serial"] = device_serial
            if license_id is None and not opts.urn:
                raise TypeError("Missing required property 'license_id'")
            __props__.__dict__["license_id"] = license_id
            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            __props__.__dict__["activation_date"] = None
            __props__.__dict__["claim_date"] = None
            __props__.__dict__["duration_in_days"] = None
            __props__.__dict__["expiration_date"] = None
            __props__.__dict__["head_license_id"] = None
            __props__.__dict__["license_key"] = None
            __props__.__dict__["license_type"] = None
            __props__.__dict__["network_id"] = None
            __props__.__dict__["order_number"] = None
            __props__.__dict__["permanently_queued_licenses"] = None
            __props__.__dict__["seat_count"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["total_duration_in_days"] = None
        super(Licenses, __self__).__init__(
            'meraki:organizations/licenses:Licenses',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            activation_date: Optional[pulumi.Input[str]] = None,
            claim_date: Optional[pulumi.Input[str]] = None,
            device_serial: Optional[pulumi.Input[str]] = None,
            duration_in_days: Optional[pulumi.Input[int]] = None,
            expiration_date: Optional[pulumi.Input[str]] = None,
            head_license_id: Optional[pulumi.Input[str]] = None,
            license_id: Optional[pulumi.Input[str]] = None,
            license_key: Optional[pulumi.Input[str]] = None,
            license_type: Optional[pulumi.Input[str]] = None,
            network_id: Optional[pulumi.Input[str]] = None,
            order_number: Optional[pulumi.Input[str]] = None,
            organization_id: Optional[pulumi.Input[str]] = None,
            permanently_queued_licenses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LicensesPermanentlyQueuedLicenseArgs']]]]] = None,
            seat_count: Optional[pulumi.Input[int]] = None,
            state: Optional[pulumi.Input[str]] = None,
            total_duration_in_days: Optional[pulumi.Input[int]] = None) -> 'Licenses':
        """
        Get an existing Licenses resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] activation_date: The date the license started burning
        :param pulumi.Input[str] claim_date: The date the license was claimed into the organization
        :param pulumi.Input[str] device_serial: Serial number of the device the license is assigned to
        :param pulumi.Input[int] duration_in_days: The duration of the individual license
        :param pulumi.Input[str] expiration_date: The date the license will expire
        :param pulumi.Input[str] head_license_id: The id of the head license this license is queued behind. If there is no head license, it returns nil.
        :param pulumi.Input[str] license_id: licenseId path parameter. License ID
        :param pulumi.Input[str] license_key: License key
        :param pulumi.Input[str] license_type: License type
        :param pulumi.Input[str] network_id: ID of the network the license is assigned to
        :param pulumi.Input[str] order_number: Order number
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LicensesPermanentlyQueuedLicenseArgs']]]] permanently_queued_licenses: DEPRECATED List of permanently queued licenses attached to the license. Instead, use /organizations/{organizationId}/licenses?deviceSerial= to retrieved queued licenses for a given device.
        :param pulumi.Input[int] seat_count: The number of seats of the license. Only applicable to SM licenses.
        :param pulumi.Input[str] state: The state of the license. All queued licenses have a status of *recentlyQueued*.
        :param pulumi.Input[int] total_duration_in_days: The duration of the license plus all permanently queued licenses associated with it
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LicensesState.__new__(_LicensesState)

        __props__.__dict__["activation_date"] = activation_date
        __props__.__dict__["claim_date"] = claim_date
        __props__.__dict__["device_serial"] = device_serial
        __props__.__dict__["duration_in_days"] = duration_in_days
        __props__.__dict__["expiration_date"] = expiration_date
        __props__.__dict__["head_license_id"] = head_license_id
        __props__.__dict__["license_id"] = license_id
        __props__.__dict__["license_key"] = license_key
        __props__.__dict__["license_type"] = license_type
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["order_number"] = order_number
        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["permanently_queued_licenses"] = permanently_queued_licenses
        __props__.__dict__["seat_count"] = seat_count
        __props__.__dict__["state"] = state
        __props__.__dict__["total_duration_in_days"] = total_duration_in_days
        return Licenses(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="activationDate")
    def activation_date(self) -> pulumi.Output[str]:
        """
        The date the license started burning
        """
        return pulumi.get(self, "activation_date")

    @property
    @pulumi.getter(name="claimDate")
    def claim_date(self) -> pulumi.Output[str]:
        """
        The date the license was claimed into the organization
        """
        return pulumi.get(self, "claim_date")

    @property
    @pulumi.getter(name="deviceSerial")
    def device_serial(self) -> pulumi.Output[str]:
        """
        Serial number of the device the license is assigned to
        """
        return pulumi.get(self, "device_serial")

    @property
    @pulumi.getter(name="durationInDays")
    def duration_in_days(self) -> pulumi.Output[int]:
        """
        The duration of the individual license
        """
        return pulumi.get(self, "duration_in_days")

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> pulumi.Output[str]:
        """
        The date the license will expire
        """
        return pulumi.get(self, "expiration_date")

    @property
    @pulumi.getter(name="headLicenseId")
    def head_license_id(self) -> pulumi.Output[str]:
        """
        The id of the head license this license is queued behind. If there is no head license, it returns nil.
        """
        return pulumi.get(self, "head_license_id")

    @property
    @pulumi.getter(name="licenseId")
    def license_id(self) -> pulumi.Output[str]:
        """
        licenseId path parameter. License ID
        """
        return pulumi.get(self, "license_id")

    @property
    @pulumi.getter(name="licenseKey")
    def license_key(self) -> pulumi.Output[str]:
        """
        License key
        """
        return pulumi.get(self, "license_key")

    @property
    @pulumi.getter(name="licenseType")
    def license_type(self) -> pulumi.Output[str]:
        """
        License type
        """
        return pulumi.get(self, "license_type")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        ID of the network the license is assigned to
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter(name="orderNumber")
    def order_number(self) -> pulumi.Output[str]:
        """
        Order number
        """
        return pulumi.get(self, "order_number")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="permanentlyQueuedLicenses")
    def permanently_queued_licenses(self) -> pulumi.Output[Sequence['outputs.LicensesPermanentlyQueuedLicense']]:
        """
        DEPRECATED List of permanently queued licenses attached to the license. Instead, use /organizations/{organizationId}/licenses?deviceSerial= to retrieved queued licenses for a given device.
        """
        return pulumi.get(self, "permanently_queued_licenses")

    @property
    @pulumi.getter(name="seatCount")
    def seat_count(self) -> pulumi.Output[int]:
        """
        The number of seats of the license. Only applicable to SM licenses.
        """
        return pulumi.get(self, "seat_count")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The state of the license. All queued licenses have a status of *recentlyQueued*.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="totalDurationInDays")
    def total_duration_in_days(self) -> pulumi.Output[int]:
        """
        The duration of the license plus all permanently queued licenses associated with it
        """
        return pulumi.get(self, "total_duration_in_days")

