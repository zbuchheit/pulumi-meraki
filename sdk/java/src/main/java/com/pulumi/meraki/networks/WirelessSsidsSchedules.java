// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.WirelessSsidsSchedulesArgs;
import com.pulumi.meraki.networks.inputs.WirelessSsidsSchedulesState;
import com.pulumi.meraki.networks.outputs.WirelessSsidsSchedulesRange;
import com.pulumi.meraki.networks.outputs.WirelessSsidsSchedulesRangesInSecond;
import java.lang.Boolean;
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
 * import com.pulumi.meraki.networks.WirelessSsidsSchedules;
 * import com.pulumi.meraki.networks.WirelessSsidsSchedulesArgs;
 * import com.pulumi.meraki.networks.inputs.WirelessSsidsSchedulesRangeArgs;
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
 *         var example = new WirelessSsidsSchedules(&#34;example&#34;, WirelessSsidsSchedulesArgs.builder()        
 *             .enabled(true)
 *             .networkId(&#34;string&#34;)
 *             .number(&#34;string&#34;)
 *             .ranges(WirelessSsidsSchedulesRangeArgs.builder()
 *                 .end_day(&#34;Tuesday&#34;)
 *                 .end_time(&#34;05:00&#34;)
 *                 .start_day(&#34;Tuesday&#34;)
 *                 .start_time(&#34;01:00&#34;)
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksWirelessSsidsSchedulesExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/wirelessSsidsSchedules:WirelessSsidsSchedules example &#34;network_id,number&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/wirelessSsidsSchedules:WirelessSsidsSchedules")
public class WirelessSsidsSchedules extends com.pulumi.resources.CustomResource {
    /**
     * If true, the SSID outage schedule is enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return If true, the SSID outage schedule is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
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
     * number path parameter.
     * 
     */
    @Export(name="number", refs={String.class}, tree="[0]")
    private Output<String> number;

    /**
     * @return number path parameter.
     * 
     */
    public Output<String> number() {
        return this.number;
    }
    /**
     * List of outage ranges. Has a start date and time, and end date and time. If this parameter is passed in along with rangesInSeconds parameter, this will take precedence.
     * 
     */
    @Export(name="ranges", refs={List.class,WirelessSsidsSchedulesRange.class}, tree="[0,1]")
    private Output<List<WirelessSsidsSchedulesRange>> ranges;

    /**
     * @return List of outage ranges. Has a start date and time, and end date and time. If this parameter is passed in along with rangesInSeconds parameter, this will take precedence.
     * 
     */
    public Output<List<WirelessSsidsSchedulesRange>> ranges() {
        return this.ranges;
    }
    /**
     * List of outage ranges in seconds since Sunday at Midnight. Has a start and end. If this parameter is passed in along with the ranges parameter, ranges will take precedence.
     * 
     */
    @Export(name="rangesInSeconds", refs={List.class,WirelessSsidsSchedulesRangesInSecond.class}, tree="[0,1]")
    private Output<List<WirelessSsidsSchedulesRangesInSecond>> rangesInSeconds;

    /**
     * @return List of outage ranges in seconds since Sunday at Midnight. Has a start and end. If this parameter is passed in along with the ranges parameter, ranges will take precedence.
     * 
     */
    public Output<List<WirelessSsidsSchedulesRangesInSecond>> rangesInSeconds() {
        return this.rangesInSeconds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WirelessSsidsSchedules(String name) {
        this(name, WirelessSsidsSchedulesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WirelessSsidsSchedules(String name, WirelessSsidsSchedulesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WirelessSsidsSchedules(String name, WirelessSsidsSchedulesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/wirelessSsidsSchedules:WirelessSsidsSchedules", name, args == null ? WirelessSsidsSchedulesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WirelessSsidsSchedules(String name, Output<String> id, @Nullable WirelessSsidsSchedulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/wirelessSsidsSchedules:WirelessSsidsSchedules", name, state, makeResourceOptions(options, id));
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
    public static WirelessSsidsSchedules get(String name, Output<String> id, @Nullable WirelessSsidsSchedulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WirelessSsidsSchedules(name, id, state, options);
    }
}