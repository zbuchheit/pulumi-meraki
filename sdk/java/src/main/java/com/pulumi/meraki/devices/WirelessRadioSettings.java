// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.devices.WirelessRadioSettingsArgs;
import com.pulumi.meraki.devices.inputs.WirelessRadioSettingsState;
import com.pulumi.meraki.devices.outputs.WirelessRadioSettingsFiveGhzSettings;
import com.pulumi.meraki.devices.outputs.WirelessRadioSettingsTwoFourGhzSettings;
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
 * import com.pulumi.meraki.devices.WirelessRadioSettings;
 * import com.pulumi.meraki.devices.WirelessRadioSettingsArgs;
 * import com.pulumi.meraki.devices.inputs.WirelessRadioSettingsFiveGhzSettingsArgs;
 * import com.pulumi.meraki.devices.inputs.WirelessRadioSettingsTwoFourGhzSettingsArgs;
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
 *         var example = new WirelessRadioSettings(&#34;example&#34;, WirelessRadioSettingsArgs.builder()        
 *             .fiveGhzSettings(WirelessRadioSettingsFiveGhzSettingsArgs.builder()
 *                 .channel(149)
 *                 .channel_width(20)
 *                 .target_power(15)
 *                 .build())
 *             .rfProfileId(&#34;1234&#34;)
 *             .serial(&#34;string&#34;)
 *             .twoFourGhzSettings(WirelessRadioSettingsTwoFourGhzSettingsArgs.builder()
 *                 .channel(11)
 *                 .target_power(21)
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;merakiDevicesWirelessRadioSettingsExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:devices/wirelessRadioSettings:WirelessRadioSettings example &#34;serial&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:devices/wirelessRadioSettings:WirelessRadioSettings")
public class WirelessRadioSettings extends com.pulumi.resources.CustomResource {
    /**
     * Manual radio settings for 5 GHz.
     * 
     */
    @Export(name="fiveGhzSettings", refs={WirelessRadioSettingsFiveGhzSettings.class}, tree="[0]")
    private Output<WirelessRadioSettingsFiveGhzSettings> fiveGhzSettings;

    /**
     * @return Manual radio settings for 5 GHz.
     * 
     */
    public Output<WirelessRadioSettingsFiveGhzSettings> fiveGhzSettings() {
        return this.fiveGhzSettings;
    }
    /**
     * The ID of an RF profile to assign to the device. If the value of this parameter is null, the appropriate basic RF profile (indoor or outdoor) will be assigned to the device. Assigning an RF profile will clear ALL manually configured overrides on the device (channel width, channel, power).
     * 
     */
    @Export(name="rfProfileId", refs={String.class}, tree="[0]")
    private Output<String> rfProfileId;

    /**
     * @return The ID of an RF profile to assign to the device. If the value of this parameter is null, the appropriate basic RF profile (indoor or outdoor) will be assigned to the device. Assigning an RF profile will clear ALL manually configured overrides on the device (channel width, channel, power).
     * 
     */
    public Output<String> rfProfileId() {
        return this.rfProfileId;
    }
    /**
     * serial path parameter.
     * 
     */
    @Export(name="serial", refs={String.class}, tree="[0]")
    private Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }
    /**
     * Manual radio settings for 2.4 GHz.
     * 
     */
    @Export(name="twoFourGhzSettings", refs={WirelessRadioSettingsTwoFourGhzSettings.class}, tree="[0]")
    private Output<WirelessRadioSettingsTwoFourGhzSettings> twoFourGhzSettings;

    /**
     * @return Manual radio settings for 2.4 GHz.
     * 
     */
    public Output<WirelessRadioSettingsTwoFourGhzSettings> twoFourGhzSettings() {
        return this.twoFourGhzSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WirelessRadioSettings(String name) {
        this(name, WirelessRadioSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WirelessRadioSettings(String name, WirelessRadioSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WirelessRadioSettings(String name, WirelessRadioSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/wirelessRadioSettings:WirelessRadioSettings", name, args == null ? WirelessRadioSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WirelessRadioSettings(String name, Output<String> id, @Nullable WirelessRadioSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/wirelessRadioSettings:WirelessRadioSettings", name, state, makeResourceOptions(options, id));
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
    public static WirelessRadioSettings get(String name, Output<String> id, @Nullable WirelessRadioSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WirelessRadioSettings(name, id, state, options);
    }
}