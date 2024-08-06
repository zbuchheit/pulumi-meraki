// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.administered.LicensingSubscriptionSubscriptionsBindArgs;
import com.pulumi.meraki.administered.inputs.LicensingSubscriptionSubscriptionsBindState;
import com.pulumi.meraki.administered.outputs.LicensingSubscriptionSubscriptionsBindItem;
import com.pulumi.meraki.administered.outputs.LicensingSubscriptionSubscriptionsBindParameters;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
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
 * import com.pulumi.meraki.administered.LicensingSubscriptionSubscriptionsBind;
 * import com.pulumi.meraki.administered.LicensingSubscriptionSubscriptionsBindArgs;
 * import com.pulumi.meraki.administered.inputs.LicensingSubscriptionSubscriptionsBindParametersArgs;
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
 *         var example = new LicensingSubscriptionSubscriptionsBind("example", LicensingSubscriptionSubscriptionsBindArgs.builder()
 *             .subscriptionId("string")
 *             .validate(false)
 *             .parameters(LicensingSubscriptionSubscriptionsBindParametersArgs.builder()
 *                 .network_ids(                
 *                     "L_1234",
 *                     "N_5678")
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiAdministeredLicensingSubscriptionSubscriptionsBindExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:administered/licensingSubscriptionSubscriptionsBind:LicensingSubscriptionSubscriptionsBind")
public class LicensingSubscriptionSubscriptionsBind extends com.pulumi.resources.CustomResource {
    @Export(name="item", refs={LicensingSubscriptionSubscriptionsBindItem.class}, tree="[0]")
    private Output<LicensingSubscriptionSubscriptionsBindItem> item;

    public Output<LicensingSubscriptionSubscriptionsBindItem> item() {
        return this.item;
    }
    @Export(name="parameters", refs={LicensingSubscriptionSubscriptionsBindParameters.class}, tree="[0]")
    private Output<LicensingSubscriptionSubscriptionsBindParameters> parameters;

    public Output<LicensingSubscriptionSubscriptionsBindParameters> parameters() {
        return this.parameters;
    }
    /**
     * subscriptionId path parameter. Subscription ID
     * 
     */
    @Export(name="subscriptionId", refs={String.class}, tree="[0]")
    private Output<String> subscriptionId;

    /**
     * @return subscriptionId path parameter. Subscription ID
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * validate query parameter. Check if the provided networks can be bound to the subscription. Returns any licensing problems and does not commit the results.
     * 
     */
    @Export(name="validate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> validate;

    /**
     * @return validate query parameter. Check if the provided networks can be bound to the subscription. Returns any licensing problems and does not commit the results.
     * 
     */
    public Output<Optional<Boolean>> validate() {
        return Codegen.optional(this.validate);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LicensingSubscriptionSubscriptionsBind(String name) {
        this(name, LicensingSubscriptionSubscriptionsBindArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LicensingSubscriptionSubscriptionsBind(String name, LicensingSubscriptionSubscriptionsBindArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LicensingSubscriptionSubscriptionsBind(String name, LicensingSubscriptionSubscriptionsBindArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:administered/licensingSubscriptionSubscriptionsBind:LicensingSubscriptionSubscriptionsBind", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private LicensingSubscriptionSubscriptionsBind(String name, Output<String> id, @Nullable LicensingSubscriptionSubscriptionsBindState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:administered/licensingSubscriptionSubscriptionsBind:LicensingSubscriptionSubscriptionsBind", name, state, makeResourceOptions(options, id));
    }

    private static LicensingSubscriptionSubscriptionsBindArgs makeArgs(LicensingSubscriptionSubscriptionsBindArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LicensingSubscriptionSubscriptionsBindArgs.Empty : args;
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
    public static LicensingSubscriptionSubscriptionsBind get(String name, Output<String> id, @Nullable LicensingSubscriptionSubscriptionsBindState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LicensingSubscriptionSubscriptionsBind(name, id, state, options);
    }
}
