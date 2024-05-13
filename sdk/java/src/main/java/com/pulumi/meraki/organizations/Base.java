// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.BaseArgs;
import com.pulumi.meraki.organizations.inputs.BaseState;
import com.pulumi.meraki.organizations.outputs.BaseApi;
import com.pulumi.meraki.organizations.outputs.BaseCloud;
import com.pulumi.meraki.organizations.outputs.BaseLicensing;
import com.pulumi.meraki.organizations.outputs.BaseManagement;
import java.lang.String;
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
 * import com.pulumi.meraki.organizations.base;
 * import com.pulumi.meraki.organizations.BaseArgs;
 * import com.pulumi.meraki.organizations.inputs.BaseManagementArgs;
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
 *         var example = new Base(&#34;example&#34;, BaseArgs.builder()        
 *             .management(BaseManagementArgs.builder()
 *                 .details(BaseManagementDetailArgs.builder()
 *                     .name(&#34;MSP ID&#34;)
 *                     .value(&#34;123456&#34;)
 *                     .build())
 *                 .build())
 *             .name(&#34;My organization&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;merakiOrganizationsExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:organizations/base:base example &#34;organization_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:organizations/base:base")
public class Base extends com.pulumi.resources.CustomResource {
    /**
     * API related settings
     * 
     */
    @Export(name="api", refs={BaseApi.class}, tree="[0]")
    private Output<BaseApi> api;

    /**
     * @return API related settings
     * 
     */
    public Output<BaseApi> api() {
        return this.api;
    }
    /**
     * Data for this organization
     * 
     */
    @Export(name="cloud", refs={BaseCloud.class}, tree="[0]")
    private Output<BaseCloud> cloud;

    /**
     * @return Data for this organization
     * 
     */
    public Output<BaseCloud> cloud() {
        return this.cloud;
    }
    /**
     * Licensing related settings
     * 
     */
    @Export(name="licensing", refs={BaseLicensing.class}, tree="[0]")
    private Output<BaseLicensing> licensing;

    /**
     * @return Licensing related settings
     * 
     */
    public Output<BaseLicensing> licensing() {
        return this.licensing;
    }
    /**
     * Information about the organization&#39;s management system
     * 
     */
    @Export(name="management", refs={BaseManagement.class}, tree="[0]")
    private Output<BaseManagement> management;

    /**
     * @return Information about the organization&#39;s management system
     * 
     */
    public Output<BaseManagement> management() {
        return this.management;
    }
    /**
     * Organization name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Organization name
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Organization URL
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return Organization URL
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
    public Base(String name, @Nullable BaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Base(String name, @Nullable BaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/base:base", name, args == null ? BaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Base(String name, Output<String> id, @Nullable BaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/base:base", name, state, makeResourceOptions(options, id));
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