// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.CameraCustomAnalyticsArtifactsArgs;
import com.pulumi.meraki.organizations.inputs.CameraCustomAnalyticsArtifactsState;
import com.pulumi.meraki.organizations.outputs.CameraCustomAnalyticsArtifactsStatus;
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
 * import com.pulumi.meraki.organizations.CameraCustomAnalyticsArtifacts;
 * import com.pulumi.meraki.organizations.CameraCustomAnalyticsArtifactsArgs;
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
 *         var example = new CameraCustomAnalyticsArtifacts("example", CameraCustomAnalyticsArtifactsArgs.builder()
 *             .name("example")
 *             .organizationId("string")
 *             .build());
 * 
 *         ctx.export("merakiOrganizationsCameraCustomAnalyticsArtifactsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:organizations/cameraCustomAnalyticsArtifacts:CameraCustomAnalyticsArtifacts example &#34;artifact_id,organization_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:organizations/cameraCustomAnalyticsArtifacts:CameraCustomAnalyticsArtifacts")
public class CameraCustomAnalyticsArtifacts extends com.pulumi.resources.CustomResource {
    /**
     * Custom analytics artifact ID
     * 
     */
    @Export(name="artifactId", refs={String.class}, tree="[0]")
    private Output<String> artifactId;

    /**
     * @return Custom analytics artifact ID
     * 
     */
    public Output<String> artifactId() {
        return this.artifactId;
    }
    /**
     * Custom analytics artifact name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Custom analytics artifact name
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Custom analytics artifact status
     * 
     */
    @Export(name="status", refs={CameraCustomAnalyticsArtifactsStatus.class}, tree="[0]")
    private Output<CameraCustomAnalyticsArtifactsStatus> status;

    /**
     * @return Custom analytics artifact status
     * 
     */
    public Output<CameraCustomAnalyticsArtifactsStatus> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CameraCustomAnalyticsArtifacts(String name) {
        this(name, CameraCustomAnalyticsArtifactsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CameraCustomAnalyticsArtifacts(String name, CameraCustomAnalyticsArtifactsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CameraCustomAnalyticsArtifacts(String name, CameraCustomAnalyticsArtifactsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/cameraCustomAnalyticsArtifacts:CameraCustomAnalyticsArtifacts", name, args == null ? CameraCustomAnalyticsArtifactsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CameraCustomAnalyticsArtifacts(String name, Output<String> id, @Nullable CameraCustomAnalyticsArtifactsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/cameraCustomAnalyticsArtifacts:CameraCustomAnalyticsArtifacts", name, state, makeResourceOptions(options, id));
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
    public static CameraCustomAnalyticsArtifacts get(String name, Output<String> id, @Nullable CameraCustomAnalyticsArtifactsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CameraCustomAnalyticsArtifacts(name, id, state, options);
    }
}
