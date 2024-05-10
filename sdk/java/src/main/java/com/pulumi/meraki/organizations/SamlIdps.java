// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.SamlIdpsArgs;
import com.pulumi.meraki.organizations.inputs.SamlIdpsState;
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
 * import com.pulumi.meraki.organizations.SamlIdps;
 * import com.pulumi.meraki.organizations.SamlIdpsArgs;
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
 *         var example = new SamlIdps(&#34;example&#34;, SamlIdpsArgs.builder()        
 *             .organizationId(&#34;string&#34;)
 *             .sloLogoutUrl(&#34;https://somewhere.com&#34;)
 *             .x509certSha1Fingerprint(&#34;00:11:22:33:44:55:66:77:88:99:00:11:22:33:44:55:66:77:88:99&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;merakiOrganizationsSamlIdpsExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:organizations/samlIdps:SamlIdps example &#34;idp_id,organization_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:organizations/samlIdps:SamlIdps")
public class SamlIdps extends com.pulumi.resources.CustomResource {
    /**
     * URL that is consuming SAML Identity Provider (IdP)
     * 
     */
    @Export(name="consumerUrl", refs={String.class}, tree="[0]")
    private Output<String> consumerUrl;

    /**
     * @return URL that is consuming SAML Identity Provider (IdP)
     * 
     */
    public Output<String> consumerUrl() {
        return this.consumerUrl;
    }
    /**
     * ID associated with the SAML Identity Provider (IdP)
     * 
     */
    @Export(name="idpId", refs={String.class}, tree="[0]")
    private Output<String> idpId;

    /**
     * @return ID associated with the SAML Identity Provider (IdP)
     * 
     */
    public Output<String> idpId() {
        return this.idpId;
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
     * Dashboard will redirect users to this URL when they sign out.
     * 
     */
    @Export(name="sloLogoutUrl", refs={String.class}, tree="[0]")
    private Output<String> sloLogoutUrl;

    /**
     * @return Dashboard will redirect users to this URL when they sign out.
     * 
     */
    public Output<String> sloLogoutUrl() {
        return this.sloLogoutUrl;
    }
    /**
     * Fingerprint (SHA1) of the SAML certificate provided by your Identity Provider (IdP). This will be used for encryption / validation.
     * 
     */
    @Export(name="x509certSha1Fingerprint", refs={String.class}, tree="[0]")
    private Output<String> x509certSha1Fingerprint;

    /**
     * @return Fingerprint (SHA1) of the SAML certificate provided by your Identity Provider (IdP). This will be used for encryption / validation.
     * 
     */
    public Output<String> x509certSha1Fingerprint() {
        return this.x509certSha1Fingerprint;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SamlIdps(String name) {
        this(name, SamlIdpsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SamlIdps(String name, SamlIdpsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SamlIdps(String name, SamlIdpsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/samlIdps:SamlIdps", name, args == null ? SamlIdpsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SamlIdps(String name, Output<String> id, @Nullable SamlIdpsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/samlIdps:SamlIdps", name, state, makeResourceOptions(options, id));
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
    public static SamlIdps get(String name, Output<String> id, @Nullable SamlIdpsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SamlIdps(name, id, state, options);
    }
}
