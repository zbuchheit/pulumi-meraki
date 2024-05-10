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

__all__ = ['WirelessSsidsHotspot20Args', 'WirelessSsidsHotspot20']

@pulumi.input_type
class WirelessSsidsHotspot20Args:
    def __init__(__self__, *,
                 network_id: pulumi.Input[str],
                 number: pulumi.Input[str],
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 mcc_mncs: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20MccMncArgs']]]] = None,
                 nai_realms: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20NaiRealmArgs']]]] = None,
                 network_access_type: Optional[pulumi.Input[str]] = None,
                 operator: Optional[pulumi.Input['WirelessSsidsHotspot20OperatorArgs']] = None,
                 roam_consort_ois: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 venue: Optional[pulumi.Input['WirelessSsidsHotspot20VenueArgs']] = None):
        """
        The set of arguments for constructing a WirelessSsidsHotspot20 resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] number: number path parameter.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domains: An array of domain names
        :param pulumi.Input[bool] enabled: Whether or not Hotspot 2.0 for this SSID is enabled
        :param pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20MccMncArgs']]] mcc_mncs: An array of MCC/MNC pairs
        :param pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20NaiRealmArgs']]] nai_realms: An array of NAI realms
        :param pulumi.Input[str] network_access_type: The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
        :param pulumi.Input['WirelessSsidsHotspot20OperatorArgs'] operator: Operator settings for this SSID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roam_consort_ois: An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
        :param pulumi.Input['WirelessSsidsHotspot20VenueArgs'] venue: Venue settings for this SSID
        """
        pulumi.set(__self__, "network_id", network_id)
        pulumi.set(__self__, "number", number)
        if domains is not None:
            pulumi.set(__self__, "domains", domains)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if mcc_mncs is not None:
            pulumi.set(__self__, "mcc_mncs", mcc_mncs)
        if nai_realms is not None:
            pulumi.set(__self__, "nai_realms", nai_realms)
        if network_access_type is not None:
            pulumi.set(__self__, "network_access_type", network_access_type)
        if operator is not None:
            pulumi.set(__self__, "operator", operator)
        if roam_consort_ois is not None:
            pulumi.set(__self__, "roam_consort_ois", roam_consort_ois)
        if venue is not None:
            pulumi.set(__self__, "venue", venue)

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
    def number(self) -> pulumi.Input[str]:
        """
        number path parameter.
        """
        return pulumi.get(self, "number")

    @number.setter
    def number(self, value: pulumi.Input[str]):
        pulumi.set(self, "number", value)

    @property
    @pulumi.getter
    def domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of domain names
        """
        return pulumi.get(self, "domains")

    @domains.setter
    def domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "domains", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not Hotspot 2.0 for this SSID is enabled
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="mccMncs")
    def mcc_mncs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20MccMncArgs']]]]:
        """
        An array of MCC/MNC pairs
        """
        return pulumi.get(self, "mcc_mncs")

    @mcc_mncs.setter
    def mcc_mncs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20MccMncArgs']]]]):
        pulumi.set(self, "mcc_mncs", value)

    @property
    @pulumi.getter(name="naiRealms")
    def nai_realms(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20NaiRealmArgs']]]]:
        """
        An array of NAI realms
        """
        return pulumi.get(self, "nai_realms")

    @nai_realms.setter
    def nai_realms(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20NaiRealmArgs']]]]):
        pulumi.set(self, "nai_realms", value)

    @property
    @pulumi.getter(name="networkAccessType")
    def network_access_type(self) -> Optional[pulumi.Input[str]]:
        """
        The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
        """
        return pulumi.get(self, "network_access_type")

    @network_access_type.setter
    def network_access_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_access_type", value)

    @property
    @pulumi.getter
    def operator(self) -> Optional[pulumi.Input['WirelessSsidsHotspot20OperatorArgs']]:
        """
        Operator settings for this SSID
        """
        return pulumi.get(self, "operator")

    @operator.setter
    def operator(self, value: Optional[pulumi.Input['WirelessSsidsHotspot20OperatorArgs']]):
        pulumi.set(self, "operator", value)

    @property
    @pulumi.getter(name="roamConsortOis")
    def roam_consort_ois(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
        """
        return pulumi.get(self, "roam_consort_ois")

    @roam_consort_ois.setter
    def roam_consort_ois(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roam_consort_ois", value)

    @property
    @pulumi.getter
    def venue(self) -> Optional[pulumi.Input['WirelessSsidsHotspot20VenueArgs']]:
        """
        Venue settings for this SSID
        """
        return pulumi.get(self, "venue")

    @venue.setter
    def venue(self, value: Optional[pulumi.Input['WirelessSsidsHotspot20VenueArgs']]):
        pulumi.set(self, "venue", value)


@pulumi.input_type
class _WirelessSsidsHotspot20State:
    def __init__(__self__, *,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 mcc_mncs: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20MccMncArgs']]]] = None,
                 nai_realms: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20NaiRealmArgs']]]] = None,
                 network_access_type: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 number: Optional[pulumi.Input[str]] = None,
                 operator: Optional[pulumi.Input['WirelessSsidsHotspot20OperatorArgs']] = None,
                 roam_consort_ois: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 venue: Optional[pulumi.Input['WirelessSsidsHotspot20VenueArgs']] = None):
        """
        Input properties used for looking up and filtering WirelessSsidsHotspot20 resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domains: An array of domain names
        :param pulumi.Input[bool] enabled: Whether or not Hotspot 2.0 for this SSID is enabled
        :param pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20MccMncArgs']]] mcc_mncs: An array of MCC/MNC pairs
        :param pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20NaiRealmArgs']]] nai_realms: An array of NAI realms
        :param pulumi.Input[str] network_access_type: The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] number: number path parameter.
        :param pulumi.Input['WirelessSsidsHotspot20OperatorArgs'] operator: Operator settings for this SSID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roam_consort_ois: An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
        :param pulumi.Input['WirelessSsidsHotspot20VenueArgs'] venue: Venue settings for this SSID
        """
        if domains is not None:
            pulumi.set(__self__, "domains", domains)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if mcc_mncs is not None:
            pulumi.set(__self__, "mcc_mncs", mcc_mncs)
        if nai_realms is not None:
            pulumi.set(__self__, "nai_realms", nai_realms)
        if network_access_type is not None:
            pulumi.set(__self__, "network_access_type", network_access_type)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if number is not None:
            pulumi.set(__self__, "number", number)
        if operator is not None:
            pulumi.set(__self__, "operator", operator)
        if roam_consort_ois is not None:
            pulumi.set(__self__, "roam_consort_ois", roam_consort_ois)
        if venue is not None:
            pulumi.set(__self__, "venue", venue)

    @property
    @pulumi.getter
    def domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of domain names
        """
        return pulumi.get(self, "domains")

    @domains.setter
    def domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "domains", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not Hotspot 2.0 for this SSID is enabled
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="mccMncs")
    def mcc_mncs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20MccMncArgs']]]]:
        """
        An array of MCC/MNC pairs
        """
        return pulumi.get(self, "mcc_mncs")

    @mcc_mncs.setter
    def mcc_mncs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20MccMncArgs']]]]):
        pulumi.set(self, "mcc_mncs", value)

    @property
    @pulumi.getter(name="naiRealms")
    def nai_realms(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20NaiRealmArgs']]]]:
        """
        An array of NAI realms
        """
        return pulumi.get(self, "nai_realms")

    @nai_realms.setter
    def nai_realms(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessSsidsHotspot20NaiRealmArgs']]]]):
        pulumi.set(self, "nai_realms", value)

    @property
    @pulumi.getter(name="networkAccessType")
    def network_access_type(self) -> Optional[pulumi.Input[str]]:
        """
        The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
        """
        return pulumi.get(self, "network_access_type")

    @network_access_type.setter
    def network_access_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_access_type", value)

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
    def number(self) -> Optional[pulumi.Input[str]]:
        """
        number path parameter.
        """
        return pulumi.get(self, "number")

    @number.setter
    def number(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "number", value)

    @property
    @pulumi.getter
    def operator(self) -> Optional[pulumi.Input['WirelessSsidsHotspot20OperatorArgs']]:
        """
        Operator settings for this SSID
        """
        return pulumi.get(self, "operator")

    @operator.setter
    def operator(self, value: Optional[pulumi.Input['WirelessSsidsHotspot20OperatorArgs']]):
        pulumi.set(self, "operator", value)

    @property
    @pulumi.getter(name="roamConsortOis")
    def roam_consort_ois(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
        """
        return pulumi.get(self, "roam_consort_ois")

    @roam_consort_ois.setter
    def roam_consort_ois(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roam_consort_ois", value)

    @property
    @pulumi.getter
    def venue(self) -> Optional[pulumi.Input['WirelessSsidsHotspot20VenueArgs']]:
        """
        Venue settings for this SSID
        """
        return pulumi.get(self, "venue")

    @venue.setter
    def venue(self, value: Optional[pulumi.Input['WirelessSsidsHotspot20VenueArgs']]):
        pulumi.set(self, "venue", value)


class WirelessSsidsHotspot20(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 mcc_mncs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20MccMncArgs']]]]] = None,
                 nai_realms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20NaiRealmArgs']]]]] = None,
                 network_access_type: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 number: Optional[pulumi.Input[str]] = None,
                 operator: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20OperatorArgs']]] = None,
                 roam_consort_ois: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 venue: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20VenueArgs']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/wirelessSsidsHotspot20:WirelessSsidsHotspot20 example "network_id,number"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domains: An array of domain names
        :param pulumi.Input[bool] enabled: Whether or not Hotspot 2.0 for this SSID is enabled
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20MccMncArgs']]]] mcc_mncs: An array of MCC/MNC pairs
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20NaiRealmArgs']]]] nai_realms: An array of NAI realms
        :param pulumi.Input[str] network_access_type: The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] number: number path parameter.
        :param pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20OperatorArgs']] operator: Operator settings for this SSID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roam_consort_ois: An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
        :param pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20VenueArgs']] venue: Venue settings for this SSID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WirelessSsidsHotspot20Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/wirelessSsidsHotspot20:WirelessSsidsHotspot20 example "network_id,number"
        ```

        :param str resource_name: The name of the resource.
        :param WirelessSsidsHotspot20Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WirelessSsidsHotspot20Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 mcc_mncs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20MccMncArgs']]]]] = None,
                 nai_realms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20NaiRealmArgs']]]]] = None,
                 network_access_type: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 number: Optional[pulumi.Input[str]] = None,
                 operator: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20OperatorArgs']]] = None,
                 roam_consort_ois: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 venue: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20VenueArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WirelessSsidsHotspot20Args.__new__(WirelessSsidsHotspot20Args)

            __props__.__dict__["domains"] = domains
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["mcc_mncs"] = mcc_mncs
            __props__.__dict__["nai_realms"] = nai_realms
            __props__.__dict__["network_access_type"] = network_access_type
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            if number is None and not opts.urn:
                raise TypeError("Missing required property 'number'")
            __props__.__dict__["number"] = number
            __props__.__dict__["operator"] = operator
            __props__.__dict__["roam_consort_ois"] = roam_consort_ois
            __props__.__dict__["venue"] = venue
        super(WirelessSsidsHotspot20, __self__).__init__(
            'meraki:networks/wirelessSsidsHotspot20:WirelessSsidsHotspot20',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            mcc_mncs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20MccMncArgs']]]]] = None,
            nai_realms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20NaiRealmArgs']]]]] = None,
            network_access_type: Optional[pulumi.Input[str]] = None,
            network_id: Optional[pulumi.Input[str]] = None,
            number: Optional[pulumi.Input[str]] = None,
            operator: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20OperatorArgs']]] = None,
            roam_consort_ois: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            venue: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20VenueArgs']]] = None) -> 'WirelessSsidsHotspot20':
        """
        Get an existing WirelessSsidsHotspot20 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domains: An array of domain names
        :param pulumi.Input[bool] enabled: Whether or not Hotspot 2.0 for this SSID is enabled
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20MccMncArgs']]]] mcc_mncs: An array of MCC/MNC pairs
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20NaiRealmArgs']]]] nai_realms: An array of NAI realms
        :param pulumi.Input[str] network_access_type: The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] number: number path parameter.
        :param pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20OperatorArgs']] operator: Operator settings for this SSID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roam_consort_ois: An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
        :param pulumi.Input[pulumi.InputType['WirelessSsidsHotspot20VenueArgs']] venue: Venue settings for this SSID
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WirelessSsidsHotspot20State.__new__(_WirelessSsidsHotspot20State)

        __props__.__dict__["domains"] = domains
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["mcc_mncs"] = mcc_mncs
        __props__.__dict__["nai_realms"] = nai_realms
        __props__.__dict__["network_access_type"] = network_access_type
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["number"] = number
        __props__.__dict__["operator"] = operator
        __props__.__dict__["roam_consort_ois"] = roam_consort_ois
        __props__.__dict__["venue"] = venue
        return WirelessSsidsHotspot20(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def domains(self) -> pulumi.Output[Sequence[str]]:
        """
        An array of domain names
        """
        return pulumi.get(self, "domains")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Whether or not Hotspot 2.0 for this SSID is enabled
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="mccMncs")
    def mcc_mncs(self) -> pulumi.Output[Sequence['outputs.WirelessSsidsHotspot20MccMnc']]:
        """
        An array of MCC/MNC pairs
        """
        return pulumi.get(self, "mcc_mncs")

    @property
    @pulumi.getter(name="naiRealms")
    def nai_realms(self) -> pulumi.Output[Sequence['outputs.WirelessSsidsHotspot20NaiRealm']]:
        """
        An array of NAI realms
        """
        return pulumi.get(self, "nai_realms")

    @property
    @pulumi.getter(name="networkAccessType")
    def network_access_type(self) -> pulumi.Output[str]:
        """
        The network type of this SSID ('Private network', 'Private network with guest access', 'Chargeable public network', 'Free public network', 'Personal device network', 'Emergency services only network', 'Test or experimental', 'Wildcard')
        """
        return pulumi.get(self, "network_access_type")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def number(self) -> pulumi.Output[str]:
        """
        number path parameter.
        """
        return pulumi.get(self, "number")

    @property
    @pulumi.getter
    def operator(self) -> pulumi.Output['outputs.WirelessSsidsHotspot20Operator']:
        """
        Operator settings for this SSID
        """
        return pulumi.get(self, "operator")

    @property
    @pulumi.getter(name="roamConsortOis")
    def roam_consort_ois(self) -> pulumi.Output[Sequence[str]]:
        """
        An array of roaming consortium OIs (hexadecimal number 3-5 octets in length)
        """
        return pulumi.get(self, "roam_consort_ois")

    @property
    @pulumi.getter
    def venue(self) -> pulumi.Output['outputs.WirelessSsidsHotspot20Venue']:
        """
        Venue settings for this SSID
        """
        return pulumi.get(self, "venue")

