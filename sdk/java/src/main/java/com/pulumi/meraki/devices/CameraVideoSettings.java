// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.devices.CameraVideoSettingsArgs;
import com.pulumi.meraki.devices.inputs.CameraVideoSettingsState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.meraki.devices.CameraVideoSettings;
 * import com.pulumi.meraki.devices.CameraVideoSettingsArgs;
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
 *         var example = new CameraVideoSettings("example", CameraVideoSettingsArgs.builder()
 *             .externalRtspEnabled(true)
 *             .serial("string")
 *             .build());
 * 
 *         ctx.export("merakiDevicesCameraVideoSettingsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:devices/cameraVideoSettings:CameraVideoSettings example &#34;serial&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:devices/cameraVideoSettings:CameraVideoSettings")
public class CameraVideoSettings extends com.pulumi.resources.CustomResource {
    /**
     * Boolean indicating if external rtsp stream is exposed
     * 
     */
    @Export(name="externalRtspEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> externalRtspEnabled;

    /**
     * @return Boolean indicating if external rtsp stream is exposed
     * 
     */
    public Output<Boolean> externalRtspEnabled() {
        return this.externalRtspEnabled;
    }
    /**
     * External rstp url. Will only be returned if external rtsp stream is exposed
     * 
     */
    @Export(name="rtspUrl", refs={String.class}, tree="[0]")
    private Output<String> rtspUrl;

    /**
     * @return External rstp url. Will only be returned if external rtsp stream is exposed
     * 
     */
    public Output<String> rtspUrl() {
        return this.rtspUrl;
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
    public CameraVideoSettings(String name) {
        this(name, CameraVideoSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CameraVideoSettings(String name, CameraVideoSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CameraVideoSettings(String name, CameraVideoSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/cameraVideoSettings:CameraVideoSettings", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private CameraVideoSettings(String name, Output<String> id, @Nullable CameraVideoSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/cameraVideoSettings:CameraVideoSettings", name, state, makeResourceOptions(options, id));
    }

    private static CameraVideoSettingsArgs makeArgs(CameraVideoSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CameraVideoSettingsArgs.Empty : args;
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
    public static CameraVideoSettings get(String name, Output<String> id, @Nullable CameraVideoSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CameraVideoSettings(name, id, state, options);
    }
}
