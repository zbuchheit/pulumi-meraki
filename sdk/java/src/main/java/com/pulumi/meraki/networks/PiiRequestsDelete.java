// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.PiiRequestsDeleteArgs;
import com.pulumi.meraki.networks.inputs.PiiRequestsDeleteState;
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
 * import com.pulumi.meraki.networks.PiiRequestsDelete;
 * import com.pulumi.meraki.networks.PiiRequestsDeleteArgs;
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
 *         var example = new PiiRequestsDelete("example", PiiRequestsDeleteArgs.builder()
 *             .networkId("string")
 *             .requestId("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksPiiRequestsDeleteExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:networks/piiRequestsDelete:PiiRequestsDelete")
public class PiiRequestsDelete extends com.pulumi.resources.CustomResource {
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
     * requestId path parameter. Request ID
     * 
     */
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    /**
     * @return requestId path parameter. Request ID
     * 
     */
    public Output<String> requestId() {
        return this.requestId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PiiRequestsDelete(String name) {
        this(name, PiiRequestsDeleteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PiiRequestsDelete(String name, PiiRequestsDeleteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PiiRequestsDelete(String name, PiiRequestsDeleteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/piiRequestsDelete:PiiRequestsDelete", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private PiiRequestsDelete(String name, Output<String> id, @Nullable PiiRequestsDeleteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/piiRequestsDelete:PiiRequestsDelete", name, state, makeResourceOptions(options, id));
    }

    private static PiiRequestsDeleteArgs makeArgs(PiiRequestsDeleteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PiiRequestsDeleteArgs.Empty : args;
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
    public static PiiRequestsDelete get(String name, Output<String> id, @Nullable PiiRequestsDeleteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PiiRequestsDelete(name, id, state, options);
    }
}
