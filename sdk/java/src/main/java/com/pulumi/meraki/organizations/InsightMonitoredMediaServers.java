// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.InsightMonitoredMediaServersArgs;
import com.pulumi.meraki.organizations.inputs.InsightMonitoredMediaServersState;
import java.lang.Boolean;
import java.lang.String;
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
 * import com.pulumi.meraki.organizations.InsightMonitoredMediaServers;
 * import com.pulumi.meraki.organizations.InsightMonitoredMediaServersArgs;
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
 *         var example = new InsightMonitoredMediaServers("example", InsightMonitoredMediaServersArgs.builder()
 *             .address("123.123.123.1")
 *             .bestEffortMonitoringEnabled(true)
 *             .name("Sample VoIP Provider")
 *             .organizationId("string")
 *             .build());
 * 
 *         ctx.export("merakiOrganizationsInsightMonitoredMediaServersExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:organizations/insightMonitoredMediaServers:InsightMonitoredMediaServers example &#34;monitored_media_server_id,organization_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:organizations/insightMonitoredMediaServers:InsightMonitoredMediaServers")
public class InsightMonitoredMediaServers extends com.pulumi.resources.CustomResource {
    /**
     * The IP address (IPv4 only) or hostname of the media server to monitor
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return The IP address (IPv4 only) or hostname of the media server to monitor
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * Indicates that if the media server doesn&#39;t respond to ICMP pings, the nearest hop will be used in its stead
     * 
     */
    @Export(name="bestEffortMonitoringEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> bestEffortMonitoringEnabled;

    /**
     * @return Indicates that if the media server doesn&#39;t respond to ICMP pings, the nearest hop will be used in its stead
     * 
     */
    public Output<Boolean> bestEffortMonitoringEnabled() {
        return this.bestEffortMonitoringEnabled;
    }
    /**
     * monitoredMediaServerId path parameter. Monitored media server ID
     * 
     */
    @Export(name="monitoredMediaServerId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> monitoredMediaServerId;

    /**
     * @return monitoredMediaServerId path parameter. Monitored media server ID
     * 
     */
    public Output<Optional<String>> monitoredMediaServerId() {
        return Codegen.optional(this.monitoredMediaServerId);
    }
    /**
     * The name of the VoIP provider
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the VoIP provider
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InsightMonitoredMediaServers(String name) {
        this(name, InsightMonitoredMediaServersArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InsightMonitoredMediaServers(String name, InsightMonitoredMediaServersArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InsightMonitoredMediaServers(String name, InsightMonitoredMediaServersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/insightMonitoredMediaServers:InsightMonitoredMediaServers", name, args == null ? InsightMonitoredMediaServersArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InsightMonitoredMediaServers(String name, Output<String> id, @Nullable InsightMonitoredMediaServersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/insightMonitoredMediaServers:InsightMonitoredMediaServers", name, state, makeResourceOptions(options, id));
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
    public static InsightMonitoredMediaServers get(String name, Output<String> id, @Nullable InsightMonitoredMediaServersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InsightMonitoredMediaServers(name, id, state, options);
    }
}
