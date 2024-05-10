// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.ApplianceVlansArgs;
import com.pulumi.meraki.networks.inputs.ApplianceVlansState;
import com.pulumi.meraki.networks.outputs.ApplianceVlansDhcpOption;
import com.pulumi.meraki.networks.outputs.ApplianceVlansIpv6;
import com.pulumi.meraki.networks.outputs.ApplianceVlansMandatoryDhcp;
import com.pulumi.meraki.networks.outputs.ApplianceVlansReservedIpRange;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.meraki.networks.ApplianceVlans;
 * import com.pulumi.meraki.networks.ApplianceVlansArgs;
 * import com.pulumi.meraki.networks.inputs.ApplianceVlansIpv6Args;
 * import com.pulumi.meraki.networks.inputs.ApplianceVlansMandatoryDhcpArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ApplianceVlans(&#34;example&#34;, ApplianceVlansArgs.builder()        
 *             .applianceIp(&#34;192.168.1.2&#34;)
 *             .cidr(&#34;192.168.1.0/24&#34;)
 *             .groupPolicyId(&#34;101&#34;)
 *             .id(&#34;1234&#34;)
 *             .ipv6(ApplianceVlansIpv6Args.builder()
 *                 .enabled(true)
 *                 .prefix_assignments(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .build())
 *             .mandatoryDhcp(ApplianceVlansMandatoryDhcpArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .mask(28)
 *             .name(&#34;My VLAN&#34;)
 *             .networkId(&#34;string&#34;)
 *             .subnet(&#34;192.168.1.0/24&#34;)
 *             .templateVlanType(&#34;same&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksApplianceVlansExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/applianceVlans:ApplianceVlans example &#34;network_id,vlan_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/applianceVlans:ApplianceVlans")
public class ApplianceVlans extends com.pulumi.resources.CustomResource {
    /**
     * The local IP of the appliance on the VLAN
     * 
     */
    @Export(name="applianceIp", refs={String.class}, tree="[0]")
    private Output<String> applianceIp;

    /**
     * @return The local IP of the appliance on the VLAN
     * 
     */
    public Output<String> applianceIp() {
        return this.applianceIp;
    }
    /**
     * CIDR of the pool of subnets. Applicable only for template network. Each network bound to the template will automatically pick a subnet from this pool to build its own VLAN.
     * 
     */
    @Export(name="cidr", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cidr;

    /**
     * @return CIDR of the pool of subnets. Applicable only for template network. Each network bound to the template will automatically pick a subnet from this pool to build its own VLAN.
     * 
     */
    public Output<Optional<String>> cidr() {
        return Codegen.optional(this.cidr);
    }
    /**
     * DHCP boot option for boot filename
     * 
     */
    @Export(name="dhcpBootFilename", refs={String.class}, tree="[0]")
    private Output<String> dhcpBootFilename;

    /**
     * @return DHCP boot option for boot filename
     * 
     */
    public Output<String> dhcpBootFilename() {
        return this.dhcpBootFilename;
    }
    /**
     * DHCP boot option to direct boot clients to the server to load the boot file from
     * 
     */
    @Export(name="dhcpBootNextServer", refs={String.class}, tree="[0]")
    private Output<String> dhcpBootNextServer;

    /**
     * @return DHCP boot option to direct boot clients to the server to load the boot file from
     * 
     */
    public Output<String> dhcpBootNextServer() {
        return this.dhcpBootNextServer;
    }
    /**
     * Use DHCP boot options specified in other properties
     * 
     */
    @Export(name="dhcpBootOptionsEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> dhcpBootOptionsEnabled;

    /**
     * @return Use DHCP boot options specified in other properties
     * 
     */
    public Output<Boolean> dhcpBootOptionsEnabled() {
        return this.dhcpBootOptionsEnabled;
    }
    /**
     * The appliance&#39;s handling of DHCP requests on this VLAN. One of: &#39;Run a DHCP server&#39;, &#39;Relay DHCP to another server&#39; or &#39;Do not respond to DHCP requests&#39;
     * 
     */
    @Export(name="dhcpHandling", refs={String.class}, tree="[0]")
    private Output<String> dhcpHandling;

    /**
     * @return The appliance&#39;s handling of DHCP requests on this VLAN. One of: &#39;Run a DHCP server&#39;, &#39;Relay DHCP to another server&#39; or &#39;Do not respond to DHCP requests&#39;
     * 
     */
    public Output<String> dhcpHandling() {
        return this.dhcpHandling;
    }
    /**
     * The term of DHCP leases if the appliance is running a DHCP server on this VLAN. One of: &#39;30 minutes&#39;, &#39;1 hour&#39;, &#39;4 hours&#39;, &#39;12 hours&#39;, &#39;1 day&#39; or &#39;1 week&#39;
     * 
     */
    @Export(name="dhcpLeaseTime", refs={String.class}, tree="[0]")
    private Output<String> dhcpLeaseTime;

    /**
     * @return The term of DHCP leases if the appliance is running a DHCP server on this VLAN. One of: &#39;30 minutes&#39;, &#39;1 hour&#39;, &#39;4 hours&#39;, &#39;12 hours&#39;, &#39;1 day&#39; or &#39;1 week&#39;
     * 
     */
    public Output<String> dhcpLeaseTime() {
        return this.dhcpLeaseTime;
    }
    /**
     * The list of DHCP options that will be included in DHCP responses. Each object in the list should have &#34;code&#34;, &#34;type&#34;, and &#34;value&#34; properties.
     * 
     */
    @Export(name="dhcpOptions", refs={List.class,ApplianceVlansDhcpOption.class}, tree="[0,1]")
    private Output<List<ApplianceVlansDhcpOption>> dhcpOptions;

    /**
     * @return The list of DHCP options that will be included in DHCP responses. Each object in the list should have &#34;code&#34;, &#34;type&#34;, and &#34;value&#34; properties.
     * 
     */
    public Output<List<ApplianceVlansDhcpOption>> dhcpOptions() {
        return this.dhcpOptions;
    }
    /**
     * The IPs of the DHCP servers that DHCP requests should be relayed to
     * 
     */
    @Export(name="dhcpRelayServerIps", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dhcpRelayServerIps;

    /**
     * @return The IPs of the DHCP servers that DHCP requests should be relayed to
     * 
     */
    public Output<List<String>> dhcpRelayServerIps() {
        return this.dhcpRelayServerIps;
    }
    /**
     * The DNS nameservers used for DHCP responses, either &#34;upstream*dns&#34;, &#34;google*dns&#34;, &#34;opendns&#34;, or a newline seperated string of IP addresses or domain names
     * 
     */
    @Export(name="dnsNameservers", refs={String.class}, tree="[0]")
    private Output<String> dnsNameservers;

    /**
     * @return The DNS nameservers used for DHCP responses, either &#34;upstream*dns&#34;, &#34;google*dns&#34;, &#34;opendns&#34;, or a newline seperated string of IP addresses or domain names
     * 
     */
    public Output<String> dnsNameservers() {
        return this.dnsNameservers;
    }
    /**
     * The id of the desired group policy to apply to the VLAN
     * 
     */
    @Export(name="groupPolicyId", refs={String.class}, tree="[0]")
    private Output<String> groupPolicyId;

    /**
     * @return The id of the desired group policy to apply to the VLAN
     * 
     */
    public Output<String> groupPolicyId() {
        return this.groupPolicyId;
    }
    /**
     * The interface ID of the VLAN
     * 
     */
    @Export(name="interfaceId", refs={String.class}, tree="[0]")
    private Output<String> interfaceId;

    /**
     * @return The interface ID of the VLAN
     * 
     */
    public Output<String> interfaceId() {
        return this.interfaceId;
    }
    /**
     * IPv6 configuration on the VLAN
     * 
     */
    @Export(name="ipv6", refs={ApplianceVlansIpv6.class}, tree="[0]")
    private Output<ApplianceVlansIpv6> ipv6;

    /**
     * @return IPv6 configuration on the VLAN
     * 
     */
    public Output<ApplianceVlansIpv6> ipv6() {
        return this.ipv6;
    }
    /**
     * Mandatory DHCP will enforce that clients connecting to this VLAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won&#39;t be able to associate. Only available on firmware versions 17.0 and above
     * 
     */
    @Export(name="mandatoryDhcp", refs={ApplianceVlansMandatoryDhcp.class}, tree="[0]")
    private Output<ApplianceVlansMandatoryDhcp> mandatoryDhcp;

    /**
     * @return Mandatory DHCP will enforce that clients connecting to this VLAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won&#39;t be able to associate. Only available on firmware versions 17.0 and above
     * 
     */
    public Output<ApplianceVlansMandatoryDhcp> mandatoryDhcp() {
        return this.mandatoryDhcp;
    }
    /**
     * Mask used for the subnet of all bound to the template networks. Applicable only for template network.
     * 
     */
    @Export(name="mask", refs={Integer.class}, tree="[0]")
    private Output<Integer> mask;

    /**
     * @return Mask used for the subnet of all bound to the template networks. Applicable only for template network.
     * 
     */
    public Output<Integer> mask() {
        return this.mask;
    }
    /**
     * The name of the VLAN
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the VLAN
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * networkId path parameter. Network ID
     * 
     */
    @Export(name="networkId", refs={String.class}, tree="[0]")
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }
    /**
     * The DHCP reserved IP ranges on the VLAN
     * 
     */
    @Export(name="reservedIpRanges", refs={List.class,ApplianceVlansReservedIpRange.class}, tree="[0,1]")
    private Output<List<ApplianceVlansReservedIpRange>> reservedIpRanges;

    /**
     * @return The DHCP reserved IP ranges on the VLAN
     * 
     */
    public Output<List<ApplianceVlansReservedIpRange>> reservedIpRanges() {
        return this.reservedIpRanges;
    }
    /**
     * The subnet of the VLAN
     * 
     */
    @Export(name="subnet", refs={String.class}, tree="[0]")
    private Output<String> subnet;

    /**
     * @return The subnet of the VLAN
     * 
     */
    public Output<String> subnet() {
        return this.subnet;
    }
    /**
     * Type of subnetting of the VLAN. Applicable only for template network.
     * 
     */
    @Export(name="templateVlanType", refs={String.class}, tree="[0]")
    private Output<String> templateVlanType;

    /**
     * @return Type of subnetting of the VLAN. Applicable only for template network.
     * 
     */
    public Output<String> templateVlanType() {
        return this.templateVlanType;
    }
    /**
     * The translated VPN subnet if VPN and VPN subnet translation are enabled on the VLAN
     * 
     */
    @Export(name="vpnNatSubnet", refs={String.class}, tree="[0]")
    private Output<String> vpnNatSubnet;

    /**
     * @return The translated VPN subnet if VPN and VPN subnet translation are enabled on the VLAN
     * 
     */
    public Output<String> vpnNatSubnet() {
        return this.vpnNatSubnet;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplianceVlans(String name) {
        this(name, ApplianceVlansArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceVlans(String name, ApplianceVlansArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceVlans(String name, ApplianceVlansArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceVlans:ApplianceVlans", name, args == null ? ApplianceVlansArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplianceVlans(String name, Output<String> id, @Nullable ApplianceVlansState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceVlans:ApplianceVlans", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApplianceVlans get(String name, Output<String> id, @Nullable ApplianceVlansState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceVlans(name, id, state, options);
    }
}
