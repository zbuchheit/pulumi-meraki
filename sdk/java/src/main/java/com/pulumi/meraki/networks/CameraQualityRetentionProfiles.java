// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.CameraQualityRetentionProfilesArgs;
import com.pulumi.meraki.networks.inputs.CameraQualityRetentionProfilesState;
import com.pulumi.meraki.networks.outputs.CameraQualityRetentionProfilesVideoSettings;
import java.lang.Boolean;
import java.lang.Integer;
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
 * import com.pulumi.meraki.networks.CameraQualityRetentionProfiles;
 * import com.pulumi.meraki.networks.CameraQualityRetentionProfilesArgs;
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
 *         var example = new CameraQualityRetentionProfiles(&#34;example&#34;, CameraQualityRetentionProfilesArgs.builder()        
 *             .name(&#34;Sample quality retention profile&#34;)
 *             .networkId(&#34;string&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksCameraQualityRetentionProfilesExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/cameraQualityRetentionProfiles:CameraQualityRetentionProfiles example &#34;network_id,quality_retention_profile_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/cameraQualityRetentionProfiles:CameraQualityRetentionProfiles")
public class CameraQualityRetentionProfiles extends com.pulumi.resources.CustomResource {
    /**
     * Whether or not to record audio. Can be either true or false. Defaults to false.
     * 
     */
    @Export(name="audioRecordingEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> audioRecordingEnabled;

    /**
     * @return Whether or not to record audio. Can be either true or false. Defaults to false.
     * 
     */
    public Output<Boolean> audioRecordingEnabled() {
        return this.audioRecordingEnabled;
    }
    /**
     * Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
     * 
     */
    @Export(name="cloudArchiveEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> cloudArchiveEnabled;

    /**
     * @return Create redundant video backup using Cloud Archive. Can be either true or false. Defaults to false.
     * 
     */
    public Output<Boolean> cloudArchiveEnabled() {
        return this.cloudArchiveEnabled;
    }
    /**
     * The maximum number of days for which the data will be stored, or &#39;null&#39; to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
     * 
     */
    @Export(name="maxRetentionDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxRetentionDays;

    /**
     * @return The maximum number of days for which the data will be stored, or &#39;null&#39; to keep data until storage space runs out. If the former, it can be one of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 30, 60, 90] days.
     * 
     */
    public Output<Integer> maxRetentionDays() {
        return this.maxRetentionDays;
    }
    /**
     * Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     * 
     */
    @Export(name="motionBasedRetentionEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> motionBasedRetentionEnabled;

    /**
     * @return Deletes footage older than 3 days in which no motion was detected. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     * 
     */
    public Output<Boolean> motionBasedRetentionEnabled() {
        return this.motionBasedRetentionEnabled;
    }
    /**
     * The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
     * 
     */
    @Export(name="motionDetectorVersion", refs={Integer.class}, tree="[0]")
    private Output<Integer> motionDetectorVersion;

    /**
     * @return The version of the motion detector that will be used by the camera. Only applies to Gen 2 cameras. Defaults to v2.
     * 
     */
    public Output<Integer> motionDetectorVersion() {
        return this.motionDetectorVersion;
    }
    /**
     * The name of the new profile. Must be unique. This parameter is required.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the new profile. Must be unique. This parameter is required.
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
     * qualityRetentionProfileId path parameter. Quality retention profile ID
     * 
     */
    @Export(name="qualityRetentionProfileId", refs={String.class}, tree="[0]")
    private Output<String> qualityRetentionProfileId;

    /**
     * @return qualityRetentionProfileId path parameter. Quality retention profile ID
     * 
     */
    public Output<String> qualityRetentionProfileId() {
        return this.qualityRetentionProfileId;
    }
    /**
     * Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     * 
     */
    @Export(name="restrictedBandwidthModeEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> restrictedBandwidthModeEnabled;

    /**
     * @return Disable features that require additional bandwidth such as Motion Recap. Can be either true or false. Defaults to false. This setting does not apply to MV2 cameras.
     * 
     */
    public Output<Boolean> restrictedBandwidthModeEnabled() {
        return this.restrictedBandwidthModeEnabled;
    }
    /**
     * Schedule for which this camera will record video, or &#39;null&#39; to always record.
     * 
     */
    @Export(name="scheduleId", refs={String.class}, tree="[0]")
    private Output<String> scheduleId;

    /**
     * @return Schedule for which this camera will record video, or &#39;null&#39; to always record.
     * 
     */
    public Output<String> scheduleId() {
        return this.scheduleId;
    }
    /**
     * Video quality and resolution settings for all the camera models.
     * 
     */
    @Export(name="videoSettings", refs={CameraQualityRetentionProfilesVideoSettings.class}, tree="[0]")
    private Output<CameraQualityRetentionProfilesVideoSettings> videoSettings;

    /**
     * @return Video quality and resolution settings for all the camera models.
     * 
     */
    public Output<CameraQualityRetentionProfilesVideoSettings> videoSettings() {
        return this.videoSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CameraQualityRetentionProfiles(String name) {
        this(name, CameraQualityRetentionProfilesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CameraQualityRetentionProfiles(String name, CameraQualityRetentionProfilesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CameraQualityRetentionProfiles(String name, CameraQualityRetentionProfilesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/cameraQualityRetentionProfiles:CameraQualityRetentionProfiles", name, args == null ? CameraQualityRetentionProfilesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CameraQualityRetentionProfiles(String name, Output<String> id, @Nullable CameraQualityRetentionProfilesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/cameraQualityRetentionProfiles:CameraQualityRetentionProfiles", name, state, makeResourceOptions(options, id));
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
    public static CameraQualityRetentionProfiles get(String name, Output<String> id, @Nullable CameraQualityRetentionProfilesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CameraQualityRetentionProfiles(name, id, state, options);
    }
}
