// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.devices.LiveToolsPingDeviceArgs;
import com.pulumi.meraki.devices.inputs.LiveToolsPingDeviceState;
import com.pulumi.meraki.devices.outputs.LiveToolsPingDeviceItem;
import com.pulumi.meraki.devices.outputs.LiveToolsPingDeviceParameters;
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
 * import com.pulumi.meraki.devices.LiveToolsPingDevice;
 * import com.pulumi.meraki.devices.LiveToolsPingDeviceArgs;
 * import com.pulumi.meraki.devices.inputs.LiveToolsPingDeviceParametersArgs;
 * import com.pulumi.meraki.devices.inputs.LiveToolsPingDeviceParametersCallbackArgs;
 * import com.pulumi.meraki.devices.inputs.LiveToolsPingDeviceParametersCallbackHttpServerArgs;
 * import com.pulumi.meraki.devices.inputs.LiveToolsPingDeviceParametersCallbackPayloadTemplateArgs;
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
 *         var example = new LiveToolsPingDevice("example", LiveToolsPingDeviceArgs.builder()
 *             .serial("string")
 *             .parameters(LiveToolsPingDeviceParametersArgs.builder()
 *                 .callback(LiveToolsPingDeviceParametersCallbackArgs.builder()
 *                     .httpServer(LiveToolsPingDeviceParametersCallbackHttpServerArgs.builder()
 *                         .id("aHR0cHM6Ly93d3cuZXhhbXBsZS5jb20vd2ViaG9va3M=")
 *                         .build())
 *                     .payloadTemplate(LiveToolsPingDeviceParametersCallbackPayloadTemplateArgs.builder()
 *                         .id("wpt_2100")
 *                         .build())
 *                     .sharedSecret("secret")
 *                     .url("https://webhook.site/28efa24e-f830-4d9f-a12b-fbb9e5035031")
 *                     .build())
 *                 .count(3)
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiDevicesLiveToolsPingDeviceExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:devices/liveToolsPingDevice:LiveToolsPingDevice example &#34;id,serial&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:devices/liveToolsPingDevice:LiveToolsPingDevice")
public class LiveToolsPingDevice extends com.pulumi.resources.CustomResource {
    @Export(name="item", refs={LiveToolsPingDeviceItem.class}, tree="[0]")
    private Output<LiveToolsPingDeviceItem> item;

    public Output<LiveToolsPingDeviceItem> item() {
        return this.item;
    }
    @Export(name="parameters", refs={LiveToolsPingDeviceParameters.class}, tree="[0]")
    private Output<LiveToolsPingDeviceParameters> parameters;

    public Output<LiveToolsPingDeviceParameters> parameters() {
        return this.parameters;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LiveToolsPingDevice(String name) {
        this(name, LiveToolsPingDeviceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LiveToolsPingDevice(String name, LiveToolsPingDeviceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LiveToolsPingDevice(String name, LiveToolsPingDeviceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/liveToolsPingDevice:LiveToolsPingDevice", name, args == null ? LiveToolsPingDeviceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LiveToolsPingDevice(String name, Output<String> id, @Nullable LiveToolsPingDeviceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/liveToolsPingDevice:LiveToolsPingDevice", name, state, makeResourceOptions(options, id));
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
    public static LiveToolsPingDevice get(String name, Output<String> id, @Nullable LiveToolsPingDeviceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LiveToolsPingDevice(name, id, state, options);
    }
}
