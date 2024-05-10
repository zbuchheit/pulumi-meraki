// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SwitchRoutingOspfArgs;
import com.pulumi.meraki.networks.inputs.SwitchRoutingOspfState;
import com.pulumi.meraki.networks.outputs.SwitchRoutingOspfArea;
import com.pulumi.meraki.networks.outputs.SwitchRoutingOspfMd5AuthenticationKey;
import com.pulumi.meraki.networks.outputs.SwitchRoutingOspfV3;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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
 * import com.pulumi.meraki.networks.SwitchRoutingOspf;
 * import com.pulumi.meraki.networks.SwitchRoutingOspfArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchRoutingOspfAreaArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchRoutingOspfMd5AuthenticationKeyArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchRoutingOspfV3Args;
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
 *         var example = new SwitchRoutingOspf(&#34;example&#34;, SwitchRoutingOspfArgs.builder()        
 *             .areas(SwitchRoutingOspfAreaArgs.builder()
 *                 .area_id(&#34;1284392014819&#34;)
 *                 .area_name(&#34;Backbone&#34;)
 *                 .area_type(&#34;normal&#34;)
 *                 .build())
 *             .deadTimerInSeconds(40)
 *             .enabled(true)
 *             .helloTimerInSeconds(10)
 *             .md5AuthenticationEnabled(true)
 *             .md5AuthenticationKey(SwitchRoutingOspfMd5AuthenticationKeyArgs.builder()
 *                 .id(1234)
 *                 .passphrase(&#34;abc1234&#34;)
 *                 .build())
 *             .networkId(&#34;string&#34;)
 *             .v3(SwitchRoutingOspfV3Args.builder()
 *                 .areas(SwitchRoutingOspfV3AreaArgs.builder()
 *                     .areaId(&#34;1284392014819&#34;)
 *                     .areaName(&#34;V3 Backbone&#34;)
 *                     .areaType(&#34;normal&#34;)
 *                     .build())
 *                 .dead_timer_in_seconds(40)
 *                 .enabled(true)
 *                 .hello_timer_in_seconds(10)
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksSwitchRoutingOspfExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/switchRoutingOspf:SwitchRoutingOspf example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/switchRoutingOspf:SwitchRoutingOspf")
public class SwitchRoutingOspf extends com.pulumi.resources.CustomResource {
    /**
     * OSPF areas
     * 
     */
    @Export(name="areas", refs={List.class,SwitchRoutingOspfArea.class}, tree="[0,1]")
    private Output<List<SwitchRoutingOspfArea>> areas;

    /**
     * @return OSPF areas
     * 
     */
    public Output<List<SwitchRoutingOspfArea>> areas() {
        return this.areas;
    }
    /**
     * Time interval to determine when the peer will be declared inactive/dead. Value must be between 1 and 65535
     * 
     */
    @Export(name="deadTimerInSeconds", refs={Integer.class}, tree="[0]")
    private Output<Integer> deadTimerInSeconds;

    /**
     * @return Time interval to determine when the peer will be declared inactive/dead. Value must be between 1 and 65535
     * 
     */
    public Output<Integer> deadTimerInSeconds() {
        return this.deadTimerInSeconds;
    }
    /**
     * Boolean value to enable or disable OSPF routing. OSPF routing is disabled by default.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Boolean value to enable or disable OSPF routing. OSPF routing is disabled by default.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Time interval in seconds at which hello packet will be sent to OSPF neighbors to maintain connectivity. Value must be between 1 and 255. Default is 10 seconds.
     * 
     */
    @Export(name="helloTimerInSeconds", refs={Integer.class}, tree="[0]")
    private Output<Integer> helloTimerInSeconds;

    /**
     * @return Time interval in seconds at which hello packet will be sent to OSPF neighbors to maintain connectivity. Value must be between 1 and 255. Default is 10 seconds.
     * 
     */
    public Output<Integer> helloTimerInSeconds() {
        return this.helloTimerInSeconds;
    }
    /**
     * Boolean value to enable or disable MD5 authentication. MD5 authentication is disabled by default.
     * 
     */
    @Export(name="md5AuthenticationEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> md5AuthenticationEnabled;

    /**
     * @return Boolean value to enable or disable MD5 authentication. MD5 authentication is disabled by default.
     * 
     */
    public Output<Boolean> md5AuthenticationEnabled() {
        return this.md5AuthenticationEnabled;
    }
    /**
     * MD5 authentication credentials. This param is only relevant if md5AuthenticationEnabled is true
     * 
     */
    @Export(name="md5AuthenticationKey", refs={SwitchRoutingOspfMd5AuthenticationKey.class}, tree="[0]")
    private Output<SwitchRoutingOspfMd5AuthenticationKey> md5AuthenticationKey;

    /**
     * @return MD5 authentication credentials. This param is only relevant if md5AuthenticationEnabled is true
     * 
     */
    public Output<SwitchRoutingOspfMd5AuthenticationKey> md5AuthenticationKey() {
        return this.md5AuthenticationKey;
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
     * OSPF v3 configuration
     * 
     */
    @Export(name="v3", refs={SwitchRoutingOspfV3.class}, tree="[0]")
    private Output<SwitchRoutingOspfV3> v3;

    /**
     * @return OSPF v3 configuration
     * 
     */
    public Output<SwitchRoutingOspfV3> v3() {
        return this.v3;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SwitchRoutingOspf(String name) {
        this(name, SwitchRoutingOspfArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SwitchRoutingOspf(String name, SwitchRoutingOspfArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SwitchRoutingOspf(String name, SwitchRoutingOspfArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchRoutingOspf:SwitchRoutingOspf", name, args == null ? SwitchRoutingOspfArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SwitchRoutingOspf(String name, Output<String> id, @Nullable SwitchRoutingOspfState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchRoutingOspf:SwitchRoutingOspf", name, state, makeResourceOptions(options, id));
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
    public static SwitchRoutingOspf get(String name, Output<String> id, @Nullable SwitchRoutingOspfState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SwitchRoutingOspf(name, id, state, options);
    }
}
