// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.ApplianceSecurityIntrusionArgs;
import com.pulumi.meraki.organizations.inputs.ApplianceSecurityIntrusionState;
import com.pulumi.meraki.organizations.outputs.ApplianceSecurityIntrusionAllowedRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.meraki.organizations.ApplianceSecurityIntrusion;
 * import com.pulumi.meraki.organizations.ApplianceSecurityIntrusionArgs;
 * import com.pulumi.meraki.organizations.inputs.ApplianceSecurityIntrusionAllowedRuleArgs;
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
 *         var example = new ApplianceSecurityIntrusion(&#34;example&#34;, ApplianceSecurityIntrusionArgs.builder()        
 *             .allowedRules(ApplianceSecurityIntrusionAllowedRuleArgs.builder()
 *                 .message(&#34;SQL sa login failed&#34;)
 *                 .rule_id(&#34;meraki:intrusion/snort/GID/01/SID/688&#34;)
 *                 .build())
 *             .organizationId(&#34;string&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;merakiOrganizationsApplianceSecurityIntrusionExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:organizations/applianceSecurityIntrusion:ApplianceSecurityIntrusion example &#34;organization_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:organizations/applianceSecurityIntrusion:ApplianceSecurityIntrusion")
public class ApplianceSecurityIntrusion extends com.pulumi.resources.CustomResource {
    /**
     * Sets a list of specific SNORT signatures to allow
     * 
     */
    @Export(name="allowedRules", refs={List.class,ApplianceSecurityIntrusionAllowedRule.class}, tree="[0,1]")
    private Output<List<ApplianceSecurityIntrusionAllowedRule>> allowedRules;

    /**
     * @return Sets a list of specific SNORT signatures to allow
     * 
     */
    public Output<List<ApplianceSecurityIntrusionAllowedRule>> allowedRules() {
        return this.allowedRules;
    }
    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplianceSecurityIntrusion(String name) {
        this(name, ApplianceSecurityIntrusionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceSecurityIntrusion(String name, ApplianceSecurityIntrusionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceSecurityIntrusion(String name, ApplianceSecurityIntrusionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/applianceSecurityIntrusion:ApplianceSecurityIntrusion", name, args == null ? ApplianceSecurityIntrusionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplianceSecurityIntrusion(String name, Output<String> id, @Nullable ApplianceSecurityIntrusionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/applianceSecurityIntrusion:ApplianceSecurityIntrusion", name, state, makeResourceOptions(options, id));
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
    public static ApplianceSecurityIntrusion get(String name, Output<String> id, @Nullable ApplianceSecurityIntrusionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceSecurityIntrusion(name, id, state, options);
    }
}
