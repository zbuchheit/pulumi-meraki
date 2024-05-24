// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.devices.SensorRelationshipsArgs;
import com.pulumi.meraki.devices.inputs.SensorRelationshipsState;
import com.pulumi.meraki.devices.outputs.SensorRelationshipsLivestream;
import com.pulumi.meraki.devices.outputs.SensorRelationshipsLivestreamRequest;
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
 * import com.pulumi.meraki.devices.SensorRelationships;
 * import com.pulumi.meraki.devices.SensorRelationshipsArgs;
 * import com.pulumi.meraki.devices.inputs.SensorRelationshipsLivestreamArgs;
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
 *         var example = new SensorRelationships("example", SensorRelationshipsArgs.builder()
 *             .livestream(SensorRelationshipsLivestreamArgs.builder()
 *                 .related_devices(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .build())
 *             .serial("string")
 *             .build());
 * 
 *         ctx.export("merakiDevicesSensorRelationshipsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:devices/sensorRelationships:SensorRelationships example &#34;serial&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:devices/sensorRelationships:SensorRelationships")
public class SensorRelationships extends com.pulumi.resources.CustomResource {
    /**
     * A role defined between an MT sensor and an MV camera that adds the camera&#39;s livestream to the sensor&#39;s details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
     * 
     */
    @Export(name="livestream", refs={SensorRelationshipsLivestream.class}, tree="[0]")
    private Output<SensorRelationshipsLivestream> livestream;

    /**
     * @return A role defined between an MT sensor and an MV camera that adds the camera&#39;s livestream to the sensor&#39;s details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
     * 
     */
    public Output<SensorRelationshipsLivestream> livestream() {
        return this.livestream;
    }
    /**
     * A role defined between an MT sensor and an MV camera that adds the camera&#39;s r.Livestream to the sensor&#39;s details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
     * 
     */
    @Export(name="livestreamRequests", refs={List.class,SensorRelationshipsLivestreamRequest.class}, tree="[0,1]")
    private Output<List<SensorRelationshipsLivestreamRequest>> livestreamRequests;

    /**
     * @return A role defined between an MT sensor and an MV camera that adds the camera&#39;s r.Livestream to the sensor&#39;s details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
     * 
     */
    public Output<List<SensorRelationshipsLivestreamRequest>> livestreamRequests() {
        return this.livestreamRequests;
    }
    /**
     * serial path parameter.
     * 
     */
    @Export(name="serial", refs={String.class}, tree="[0]")
    private Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SensorRelationships(String name) {
        this(name, SensorRelationshipsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SensorRelationships(String name, SensorRelationshipsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SensorRelationships(String name, SensorRelationshipsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/sensorRelationships:SensorRelationships", name, args == null ? SensorRelationshipsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SensorRelationships(String name, Output<String> id, @Nullable SensorRelationshipsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/sensorRelationships:SensorRelationships", name, state, makeResourceOptions(options, id));
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
    public static SensorRelationships get(String name, Output<String> id, @Nullable SensorRelationshipsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SensorRelationships(name, id, state, options);
    }
}
