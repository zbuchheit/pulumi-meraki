// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SmDevicesCheckinArgs;
import com.pulumi.meraki.networks.inputs.SmDevicesCheckinState;
import com.pulumi.meraki.networks.outputs.SmDevicesCheckinItem;
import com.pulumi.meraki.networks.outputs.SmDevicesCheckinParameters;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.meraki.networks.SmDevicesCheckin;
 * import com.pulumi.meraki.networks.SmDevicesCheckinArgs;
 * import com.pulumi.meraki.networks.inputs.SmDevicesCheckinParametersArgs;
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
 *         var example = new SmDevicesCheckin(&#34;example&#34;, SmDevicesCheckinArgs.builder()        
 *             .networkId(&#34;string&#34;)
 *             .parameters(SmDevicesCheckinParametersArgs.builder()
 *                 .ids(                
 *                     &#34;1284392014819&#34;,
 *                     &#34;2983092129865&#34;)
 *                 .scope(                
 *                     &#34;withAny&#34;,
 *                     &#34;tag1&#34;,
 *                     &#34;tag2&#34;)
 *                 .serials(                
 *                     &#34;XY0XX0Y0X0&#34;,
 *                     &#34;A01B01CD00E&#34;,
 *                     &#34;X02YZ1ZYZX&#34;)
 *                 .wifi_macs(&#34;00:11:22:33:44:55&#34;)
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksSmDevicesCheckinExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:networks/smDevicesCheckin:SmDevicesCheckin")
public class SmDevicesCheckin extends com.pulumi.resources.CustomResource {
    @Export(name="item", refs={SmDevicesCheckinItem.class}, tree="[0]")
    private Output<SmDevicesCheckinItem> item;

    public Output<SmDevicesCheckinItem> item() {
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
    @Export(name="parameters", refs={SmDevicesCheckinParameters.class}, tree="[0]")
    private Output<SmDevicesCheckinParameters> parameters;

    public Output<SmDevicesCheckinParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmDevicesCheckin(String name) {
        this(name, SmDevicesCheckinArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmDevicesCheckin(String name, SmDevicesCheckinArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmDevicesCheckin(String name, SmDevicesCheckinArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smDevicesCheckin:SmDevicesCheckin", name, args == null ? SmDevicesCheckinArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SmDevicesCheckin(String name, Output<String> id, @Nullable SmDevicesCheckinState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smDevicesCheckin:SmDevicesCheckin", name, state, makeResourceOptions(options, id));
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
    public static SmDevicesCheckin get(String name, Output<String> id, @Nullable SmDevicesCheckinState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SmDevicesCheckin(name, id, state, options);
    }
}