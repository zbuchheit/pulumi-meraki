// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.BaseArgs;
import com.pulumi.meraki.networks.inputs.BaseState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
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
 * import com.pulumi.meraki.networks.base;
 * import com.pulumi.meraki.networks.BaseArgs;
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
 *         var example = new Base("example", BaseArgs.builder()
 *             .name("Main Office")
 *             .notes("Additional description of the network")
 *             .organizationId("string")
 *             .productTypes(            
 *                 "appliance",
 *                 "switch",
 *                 "wireless")
 *             .tags(            
 *                 "tag1",
 *                 "tag2")
 *             .timeZone("America/Los_Angeles")
 *             .build());
 * 
 *         ctx.export("merakiNetworksExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/base:base example &#34;network_id,organization_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/base:base")
public class Base extends com.pulumi.resources.CustomResource {
    /**
     * Enrollment string for the network
     * 
     */
    @Export(name="enrollmentString", refs={String.class}, tree="[0]")
    private Output<String> enrollmentString;

    /**
     * @return Enrollment string for the network
     * 
     */
    public Output<String> enrollmentString() {
        return this.enrollmentString;
    }
    /**
     * If the network is bound to a config template
     * 
     */
    @Export(name="isBoundToConfigTemplate", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isBoundToConfigTemplate;

    /**
     * @return If the network is bound to a config template
     * 
     */
    public Output<Boolean> isBoundToConfigTemplate() {
        return this.isBoundToConfigTemplate;
    }
    /**
     * Network name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Network name
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Notes for the network
     * 
     */
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output<String> notes;

    /**
     * @return Notes for the network
     * 
     */
    public Output<String> notes() {
        return this.notes;
    }
    /**
     * Organization ID
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * List of the product types that the network supports
     * 
     */
    @Export(name="productTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> productTypes;

    /**
     * @return List of the product types that the network supports
     * 
     */
    public Output<List<String>> productTypes() {
        return this.productTypes;
    }
    /**
     * Network tags
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    /**
     * @return Network tags
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }
    /**
     * Timezone of the network
     * 
     */
    @Export(name="timeZone", refs={String.class}, tree="[0]")
    private Output<String> timeZone;

    /**
     * @return Timezone of the network
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }
    /**
     * URL to the network Dashboard UI
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return URL to the network Dashboard UI
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Base(String name) {
        this(name, BaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Base(String name, BaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Base(String name, BaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/base:base", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private Base(String name, Output<String> id, @Nullable BaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/base:base", name, state, makeResourceOptions(options, id));
    }

    private static BaseArgs makeArgs(BaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BaseArgs.Empty : args;
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
    public static Base get(String name, Output<String> id, @Nullable BaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Base(name, id, state, options);
    }
}
