// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.devices.ApplianceRadioSettingsArgs;
import com.pulumi.meraki.devices.inputs.ApplianceRadioSettingsState;
import com.pulumi.meraki.devices.outputs.ApplianceRadioSettingsFiveGhzSettings;
import com.pulumi.meraki.devices.outputs.ApplianceRadioSettingsTwoFourGhzSettings;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.meraki.devices.ApplianceRadioSettings;
 * import com.pulumi.meraki.devices.ApplianceRadioSettingsArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceRadioSettingsFiveGhzSettingsArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceRadioSettingsTwoFourGhzSettingsArgs;
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
 *         var example = new ApplianceRadioSettings("example", ApplianceRadioSettingsArgs.builder()
 *             .fiveGhzSettings(ApplianceRadioSettingsFiveGhzSettingsArgs.builder()
 *                 .channel(149)
 *                 .channel_width("20")
 *                 .target_power(15)
 *                 .build())
 *             .rfProfileId("1234")
 *             .serial("string")
 *             .twoFourGhzSettings(ApplianceRadioSettingsTwoFourGhzSettingsArgs.builder()
 *                 .channel(11)
 *                 .target_power(21)
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiDevicesApplianceRadioSettingsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:devices/applianceRadioSettings:ApplianceRadioSettings example &#34;serial&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:devices/applianceRadioSettings:ApplianceRadioSettings")
public class ApplianceRadioSettings extends com.pulumi.resources.CustomResource {
    /**
     * Manual radio settings for 5 GHz
     * 
     */
    @Export(name="fiveGhzSettings", refs={ApplianceRadioSettingsFiveGhzSettings.class}, tree="[0]")
    private Output<ApplianceRadioSettingsFiveGhzSettings> fiveGhzSettings;

    /**
     * @return Manual radio settings for 5 GHz
     * 
     */
    public Output<ApplianceRadioSettingsFiveGhzSettings> fiveGhzSettings() {
        return this.fiveGhzSettings;
    }
    /**
     * RF Profile ID
     * 
     */
    @Export(name="rfProfileId", refs={String.class}, tree="[0]")
    private Output<String> rfProfileId;

    /**
     * @return RF Profile ID
     * 
     */
    public Output<String> rfProfileId() {
        return this.rfProfileId;
    }
    /**
     * The device serial
     * 
     */
    @Export(name="serial", refs={String.class}, tree="[0]")
    private Output<String> serial;

    /**
     * @return The device serial
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }
    /**
     * Manual radio settings for 2.4 GHz
     * 
     */
    @Export(name="twoFourGhzSettings", refs={ApplianceRadioSettingsTwoFourGhzSettings.class}, tree="[0]")
    private Output<ApplianceRadioSettingsTwoFourGhzSettings> twoFourGhzSettings;

    /**
     * @return Manual radio settings for 2.4 GHz
     * 
     */
    public Output<ApplianceRadioSettingsTwoFourGhzSettings> twoFourGhzSettings() {
        return this.twoFourGhzSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplianceRadioSettings(String name) {
        this(name, ApplianceRadioSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceRadioSettings(String name, ApplianceRadioSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceRadioSettings(String name, ApplianceRadioSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/applianceRadioSettings:ApplianceRadioSettings", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private ApplianceRadioSettings(String name, Output<String> id, @Nullable ApplianceRadioSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/applianceRadioSettings:ApplianceRadioSettings", name, state, makeResourceOptions(options, id));
    }

    private static ApplianceRadioSettingsArgs makeArgs(ApplianceRadioSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ApplianceRadioSettingsArgs.Empty : args;
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
    public static ApplianceRadioSettings get(String name, Output<String> id, @Nullable ApplianceRadioSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceRadioSettings(name, id, state, options);
    }
}
