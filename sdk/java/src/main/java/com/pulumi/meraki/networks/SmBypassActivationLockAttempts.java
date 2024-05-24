// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SmBypassActivationLockAttemptsArgs;
import com.pulumi.meraki.networks.inputs.SmBypassActivationLockAttemptsState;
import com.pulumi.meraki.networks.outputs.SmBypassActivationLockAttemptsData;
import java.lang.String;
import java.util.List;
import java.util.Optional;
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
 * import com.pulumi.meraki.networks.SmBypassActivationLockAttempts;
 * import com.pulumi.meraki.networks.SmBypassActivationLockAttemptsArgs;
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
 *         var example = new SmBypassActivationLockAttempts("example", SmBypassActivationLockAttemptsArgs.builder()
 *             .ids(            
 *                 "1284392014819",
 *                 "2983092129865")
 *             .networkId("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksSmBypassActivationLockAttemptsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/smBypassActivationLockAttempts:SmBypassActivationLockAttempts example &#34;attempt_id,network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/smBypassActivationLockAttempts:SmBypassActivationLockAttempts")
public class SmBypassActivationLockAttempts extends com.pulumi.resources.CustomResource {
    /**
     * attemptId path parameter. Attempt ID
     * 
     */
    @Export(name="attemptId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> attemptId;

    /**
     * @return attemptId path parameter. Attempt ID
     * 
     */
    public Output<Optional<String>> attemptId() {
        return Codegen.optional(this.attemptId);
    }
    @Export(name="data", refs={SmBypassActivationLockAttemptsData.class}, tree="[0]")
    private Output<SmBypassActivationLockAttemptsData> data;

    public Output<SmBypassActivationLockAttemptsData> data() {
        return this.data;
    }
    /**
     * The ids of the devices to attempt activation lock bypass.
     * 
     */
    @Export(name="ids", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ids;

    /**
     * @return The ids of the devices to attempt activation lock bypass.
     * 
     */
    public Output<List<String>> ids() {
        return this.ids;
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
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmBypassActivationLockAttempts(String name) {
        this(name, SmBypassActivationLockAttemptsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmBypassActivationLockAttempts(String name, SmBypassActivationLockAttemptsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmBypassActivationLockAttempts(String name, SmBypassActivationLockAttemptsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smBypassActivationLockAttempts:SmBypassActivationLockAttempts", name, args == null ? SmBypassActivationLockAttemptsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SmBypassActivationLockAttempts(String name, Output<String> id, @Nullable SmBypassActivationLockAttemptsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smBypassActivationLockAttempts:SmBypassActivationLockAttempts", name, state, makeResourceOptions(options, id));
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
    public static SmBypassActivationLockAttempts get(String name, Output<String> id, @Nullable SmBypassActivationLockAttemptsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SmBypassActivationLockAttempts(name, id, state, options);
    }
}
