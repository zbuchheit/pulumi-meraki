// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.WirelessBluetoothSettingsArgs;
import com.pulumi.meraki.networks.inputs.WirelessBluetoothSettingsState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
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
 * import com.pulumi.meraki.networks.WirelessBluetoothSettings;
 * import com.pulumi.meraki.networks.WirelessBluetoothSettingsArgs;
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
 *         var example = new WirelessBluetoothSettings(&#34;example&#34;, WirelessBluetoothSettingsArgs.builder()        
 *             .advertisingEnabled(true)
 *             .major(1)
 *             .majorMinorAssignmentMode(&#34;Non-unique&#34;)
 *             .minor(1)
 *             .networkId(&#34;string&#34;)
 *             .scanningEnabled(true)
 *             .uuid(&#34;00000000-0000-0000-000-000000000000&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksWirelessBluetoothSettingsExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings")
public class WirelessBluetoothSettings extends com.pulumi.resources.CustomResource {
    /**
     * Whether APs will advertise beacons.
     * 
     */
    @Export(name="advertisingEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> advertisingEnabled;

    /**
     * @return Whether APs will advertise beacons.
     * 
     */
    public Output<Boolean> advertisingEnabled() {
        return this.advertisingEnabled;
    }
    /**
     * Whether ESL is enabled on this network.
     * 
     */
    @Export(name="eslEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> eslEnabled;

    /**
     * @return Whether ESL is enabled on this network.
     * 
     */
    public Output<Boolean> eslEnabled() {
        return this.eslEnabled;
    }
    /**
     * The major number to be used in the beacon identifier. Only valid in &#39;Non-unique&#39; mode.
     * 
     */
    @Export(name="major", refs={Integer.class}, tree="[0]")
    private Output<Integer> major;

    /**
     * @return The major number to be used in the beacon identifier. Only valid in &#39;Non-unique&#39; mode.
     * 
     */
    public Output<Integer> major() {
        return this.major;
    }
    /**
     * The way major and minor number should be assigned to nodes in the network. (&#39;Unique&#39;, &#39;Non-unique&#39;)
     * 
     */
    @Export(name="majorMinorAssignmentMode", refs={String.class}, tree="[0]")
    private Output<String> majorMinorAssignmentMode;

    /**
     * @return The way major and minor number should be assigned to nodes in the network. (&#39;Unique&#39;, &#39;Non-unique&#39;)
     * 
     */
    public Output<String> majorMinorAssignmentMode() {
        return this.majorMinorAssignmentMode;
    }
    /**
     * The minor number to be used in the beacon identifier. Only valid in &#39;Non-unique&#39; mode.
     * 
     */
    @Export(name="minor", refs={Integer.class}, tree="[0]")
    private Output<Integer> minor;

    /**
     * @return The minor number to be used in the beacon identifier. Only valid in &#39;Non-unique&#39; mode.
     * 
     */
    public Output<Integer> minor() {
        return this.minor;
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
     * Whether APs will scan for Bluetooth enabled clients.
     * 
     */
    @Export(name="scanningEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> scanningEnabled;

    /**
     * @return Whether APs will scan for Bluetooth enabled clients.
     * 
     */
    public Output<Boolean> scanningEnabled() {
        return this.scanningEnabled;
    }
    /**
     * The UUID to be used in the beacon identifier.
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return The UUID to be used in the beacon identifier.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WirelessBluetoothSettings(String name) {
        this(name, WirelessBluetoothSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WirelessBluetoothSettings(String name, WirelessBluetoothSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WirelessBluetoothSettings(String name, WirelessBluetoothSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings", name, args == null ? WirelessBluetoothSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WirelessBluetoothSettings(String name, Output<String> id, @Nullable WirelessBluetoothSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings", name, state, makeResourceOptions(options, id));
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
    public static WirelessBluetoothSettings get(String name, Output<String> id, @Nullable WirelessBluetoothSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WirelessBluetoothSettings(name, id, state, options);
    }
}
