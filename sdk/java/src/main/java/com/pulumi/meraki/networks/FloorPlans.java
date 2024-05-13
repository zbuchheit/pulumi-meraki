// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.FloorPlansArgs;
import com.pulumi.meraki.networks.inputs.FloorPlansState;
import com.pulumi.meraki.networks.outputs.FloorPlansBottomLeftCorner;
import com.pulumi.meraki.networks.outputs.FloorPlansBottomRightCorner;
import com.pulumi.meraki.networks.outputs.FloorPlansCenter;
import com.pulumi.meraki.networks.outputs.FloorPlansDevice;
import com.pulumi.meraki.networks.outputs.FloorPlansTopLeftCorner;
import com.pulumi.meraki.networks.outputs.FloorPlansTopRightCorner;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/floorPlans:FloorPlans example &#34;floor_plan_id,network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/floorPlans:FloorPlans")
public class FloorPlans extends com.pulumi.resources.CustomResource {
    /**
     * The longitude and latitude of the bottom left corner of your floor plan.
     * 
     */
    @Export(name="bottomLeftCorner", refs={FloorPlansBottomLeftCorner.class}, tree="[0]")
    private Output<FloorPlansBottomLeftCorner> bottomLeftCorner;

    /**
     * @return The longitude and latitude of the bottom left corner of your floor plan.
     * 
     */
    public Output<FloorPlansBottomLeftCorner> bottomLeftCorner() {
        return this.bottomLeftCorner;
    }
    /**
     * The longitude and latitude of the bottom right corner of your floor plan.
     * 
     */
    @Export(name="bottomRightCorner", refs={FloorPlansBottomRightCorner.class}, tree="[0]")
    private Output<FloorPlansBottomRightCorner> bottomRightCorner;

    /**
     * @return The longitude and latitude of the bottom right corner of your floor plan.
     * 
     */
    public Output<FloorPlansBottomRightCorner> bottomRightCorner() {
        return this.bottomRightCorner;
    }
    /**
     * The longitude and latitude of the center of your floor plan. The &#39;center&#39; or two adjacent corners (e.g. &#39;topLeftCorner&#39; and &#39;bottomLeftCorner&#39;) must be specified. If &#39;center&#39; is specified, the floor plan is placed over that point with no rotation. If two adjacent corners are specified, the floor plan is rotated to line up with the two specified points. The aspect ratio of the floor plan&#39;s image is preserved regardless of which corners/center are specified. (This means if that more than two corners are specified, only two corners may be used to preserve the floor plan&#39;s aspect ratio.). No two points can have the same latitude, longitude pair.
     * 
     */
    @Export(name="center", refs={FloorPlansCenter.class}, tree="[0]")
    private Output<FloorPlansCenter> center;

    /**
     * @return The longitude and latitude of the center of your floor plan. The &#39;center&#39; or two adjacent corners (e.g. &#39;topLeftCorner&#39; and &#39;bottomLeftCorner&#39;) must be specified. If &#39;center&#39; is specified, the floor plan is placed over that point with no rotation. If two adjacent corners are specified, the floor plan is rotated to line up with the two specified points. The aspect ratio of the floor plan&#39;s image is preserved regardless of which corners/center are specified. (This means if that more than two corners are specified, only two corners may be used to preserve the floor plan&#39;s aspect ratio.). No two points can have the same latitude, longitude pair.
     * 
     */
    public Output<FloorPlansCenter> center() {
        return this.center;
    }
    /**
     * List of devices for the floorplan
     * 
     */
    @Export(name="devices", refs={List.class,FloorPlansDevice.class}, tree="[0,1]")
    private Output<List<FloorPlansDevice>> devices;

    /**
     * @return List of devices for the floorplan
     * 
     */
    public Output<List<FloorPlansDevice>> devices() {
        return this.devices;
    }
    /**
     * Floor plan ID
     * 
     */
    @Export(name="floorPlanId", refs={String.class}, tree="[0]")
    private Output<String> floorPlanId;

    /**
     * @return Floor plan ID
     * 
     */
    public Output<String> floorPlanId() {
        return this.floorPlanId;
    }
    /**
     * The height of your floor plan.
     * 
     */
    @Export(name="height", refs={Double.class}, tree="[0]")
    private Output<Double> height;

    /**
     * @return The height of your floor plan.
     * 
     */
    public Output<Double> height() {
        return this.height;
    }
    /**
     * The file contents (a base 64 encoded string) of your image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in.
     * 
     */
    @Export(name="imageContents", refs={String.class}, tree="[0]")
    private Output<String> imageContents;

    /**
     * @return The file contents (a base 64 encoded string) of your image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in.
     * 
     */
    public Output<String> imageContents() {
        return this.imageContents;
    }
    /**
     * The format type of the image.
     * 
     */
    @Export(name="imageExtension", refs={String.class}, tree="[0]")
    private Output<String> imageExtension;

    /**
     * @return The format type of the image.
     * 
     */
    public Output<String> imageExtension() {
        return this.imageExtension;
    }
    /**
     * The file contents (a base 64 encoded string) of your new image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in. If you upload a new image, and you do NOT specify any new geolocation fields (&#39;center, &#39;topLeftCorner&#39;, etc), the floor plan will be recentered with no rotation in order to maintain the aspect ratio of your new image.
     * 
     */
    @Export(name="imageMd5", refs={String.class}, tree="[0]")
    private Output<String> imageMd5;

    /**
     * @return The file contents (a base 64 encoded string) of your new image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in. If you upload a new image, and you do NOT specify any new geolocation fields (&#39;center, &#39;topLeftCorner&#39;, etc), the floor plan will be recentered with no rotation in order to maintain the aspect ratio of your new image.
     * 
     */
    public Output<String> imageMd5() {
        return this.imageMd5;
    }
    /**
     * The url link for the floor plan image.
     * 
     */
    @Export(name="imageUrl", refs={String.class}, tree="[0]")
    private Output<String> imageUrl;

    /**
     * @return The url link for the floor plan image.
     * 
     */
    public Output<String> imageUrl() {
        return this.imageUrl;
    }
    /**
     * The time the image url link will expire.
     * 
     */
    @Export(name="imageUrlExpiresAt", refs={String.class}, tree="[0]")
    private Output<String> imageUrlExpiresAt;

    /**
     * @return The time the image url link will expire.
     * 
     */
    public Output<String> imageUrlExpiresAt() {
        return this.imageUrlExpiresAt;
    }
    /**
     * The name of your floor plan.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of your floor plan.
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
     * The longitude and latitude of the top left corner of your floor plan.
     * 
     */
    @Export(name="topLeftCorner", refs={FloorPlansTopLeftCorner.class}, tree="[0]")
    private Output<FloorPlansTopLeftCorner> topLeftCorner;

    /**
     * @return The longitude and latitude of the top left corner of your floor plan.
     * 
     */
    public Output<FloorPlansTopLeftCorner> topLeftCorner() {
        return this.topLeftCorner;
    }
    /**
     * The longitude and latitude of the top right corner of your floor plan.
     * 
     */
    @Export(name="topRightCorner", refs={FloorPlansTopRightCorner.class}, tree="[0]")
    private Output<FloorPlansTopRightCorner> topRightCorner;

    /**
     * @return The longitude and latitude of the top right corner of your floor plan.
     * 
     */
    public Output<FloorPlansTopRightCorner> topRightCorner() {
        return this.topRightCorner;
    }
    /**
     * The width of your floor plan.
     * 
     */
    @Export(name="width", refs={Double.class}, tree="[0]")
    private Output<Double> width;

    /**
     * @return The width of your floor plan.
     * 
     */
    public Output<Double> width() {
        return this.width;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FloorPlans(String name) {
        this(name, FloorPlansArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FloorPlans(String name, FloorPlansArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FloorPlans(String name, FloorPlansArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/floorPlans:FloorPlans", name, args == null ? FloorPlansArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FloorPlans(String name, Output<String> id, @Nullable FloorPlansState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/floorPlans:FloorPlans", name, state, makeResourceOptions(options, id));
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
    public static FloorPlans get(String name, Output<String> id, @Nullable FloorPlansState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FloorPlans(name, id, state, options);
    }
}