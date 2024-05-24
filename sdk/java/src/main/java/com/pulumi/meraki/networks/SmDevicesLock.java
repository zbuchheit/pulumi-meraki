// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SmDevicesLockArgs;
import com.pulumi.meraki.networks.inputs.SmDevicesLockState;
import com.pulumi.meraki.networks.outputs.SmDevicesLockItem;
import com.pulumi.meraki.networks.outputs.SmDevicesLockParameters;
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
 * import com.pulumi.meraki.networks.SmDevicesLock;
 * import com.pulumi.meraki.networks.SmDevicesLockArgs;
 * import com.pulumi.meraki.networks.inputs.SmDevicesLockParametersArgs;
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
 *         var example = new SmDevicesLock("example", SmDevicesLockArgs.builder()
 *             .networkId("string")
 *             .parameters(SmDevicesLockParametersArgs.builder()
 *                 .ids(                
 *                     "1284392014819",
 *                     "2983092129865")
 *                 .pin(123456)
 *                 .scope(                
 *                     "withAny",
 *                     "tag1",
 *                     "tag2")
 *                 .serials(                
 *                     "XY0XX0Y0X0",
 *                     "A01B01CD00E",
 *                     "X02YZ1ZYZX")
 *                 .wifi_macs("00:11:22:33:44:55")
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiNetworksSmDevicesLockExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:networks/smDevicesLock:SmDevicesLock")
public class SmDevicesLock extends com.pulumi.resources.CustomResource {
    @Export(name="item", refs={SmDevicesLockItem.class}, tree="[0]")
    private Output<SmDevicesLockItem> item;

    public Output<SmDevicesLockItem> item() {
        return this.item;
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
    @Export(name="parameters", refs={SmDevicesLockParameters.class}, tree="[0]")
    private Output<SmDevicesLockParameters> parameters;

    public Output<SmDevicesLockParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmDevicesLock(String name) {
        this(name, SmDevicesLockArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmDevicesLock(String name, SmDevicesLockArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmDevicesLock(String name, SmDevicesLockArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smDevicesLock:SmDevicesLock", name, args == null ? SmDevicesLockArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SmDevicesLock(String name, Output<String> id, @Nullable SmDevicesLockState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smDevicesLock:SmDevicesLock", name, state, makeResourceOptions(options, id));
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
    public static SmDevicesLock get(String name, Output<String> id, @Nullable SmDevicesLockState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SmDevicesLock(name, id, state, options);
    }
}
