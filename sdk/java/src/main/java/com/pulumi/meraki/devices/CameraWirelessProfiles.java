// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.devices.CameraWirelessProfilesArgs;
import com.pulumi.meraki.devices.inputs.CameraWirelessProfilesState;
import com.pulumi.meraki.devices.outputs.CameraWirelessProfilesIds;
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
 * import com.pulumi.meraki.devices.CameraWirelessProfiles;
 * import com.pulumi.meraki.devices.CameraWirelessProfilesArgs;
 * import com.pulumi.meraki.devices.inputs.CameraWirelessProfilesIdsArgs;
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
 *         var example = new CameraWirelessProfiles("example", CameraWirelessProfilesArgs.builder()
 *             .ids(CameraWirelessProfilesIdsArgs.builder()
 *                 .backup("1")
 *                 .primary("3")
 *                 .secondary("2")
 *                 .build())
 *             .serial("string")
 *             .build());
 * 
 *         ctx.export("merakiDevicesCameraWirelessProfilesExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:devices/cameraWirelessProfiles:CameraWirelessProfiles example &#34;serial&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:devices/cameraWirelessProfiles:CameraWirelessProfiles")
public class CameraWirelessProfiles extends com.pulumi.resources.CustomResource {
    /**
     * The ids of the wireless profile to assign to the given camera
     * 
     */
    @Export(name="ids", refs={CameraWirelessProfilesIds.class}, tree="[0]")
    private Output<CameraWirelessProfilesIds> ids;

    /**
     * @return The ids of the wireless profile to assign to the given camera
     * 
     */
    public Output<CameraWirelessProfilesIds> ids() {
        return this.ids;
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
    public CameraWirelessProfiles(String name) {
        this(name, CameraWirelessProfilesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CameraWirelessProfiles(String name, CameraWirelessProfilesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CameraWirelessProfiles(String name, CameraWirelessProfilesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/cameraWirelessProfiles:CameraWirelessProfiles", name, args == null ? CameraWirelessProfilesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CameraWirelessProfiles(String name, Output<String> id, @Nullable CameraWirelessProfilesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/cameraWirelessProfiles:CameraWirelessProfiles", name, state, makeResourceOptions(options, id));
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
    public static CameraWirelessProfiles get(String name, Output<String> id, @Nullable CameraWirelessProfilesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CameraWirelessProfiles(name, id, state, options);
    }
}
