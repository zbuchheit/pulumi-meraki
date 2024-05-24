// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SensorAlertsProfilesArgs;
import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesState;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesCondition;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesRecipients;
import com.pulumi.meraki.networks.outputs.SensorAlertsProfilesSchedule;
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
 * import com.pulumi.meraki.networks.SensorAlertsProfiles;
 * import com.pulumi.meraki.networks.SensorAlertsProfilesArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdApparentPowerArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdCurrentArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdDoorArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdFrequencyArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdHumidityArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdIndoorAirQualityArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdNoiseArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdNoiseAmbientArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdPm25Args;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdPowerFactorArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdRealPowerArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdTemperatureArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdTvocArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdUpstreamPowerArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdVoltageArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesConditionThresholdWaterArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesRecipientsArgs;
 * import com.pulumi.meraki.networks.inputs.SensorAlertsProfilesScheduleArgs;
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
 *         var example = new SensorAlertsProfiles("example", SensorAlertsProfilesArgs.builder()
 *             .conditions(SensorAlertsProfilesConditionArgs.builder()
 *                 .direction("above")
 *                 .duration(60)
 *                 .metric("temperature")
 *                 .threshold(SensorAlertsProfilesConditionThresholdArgs.builder()
 *                     .apparentPower(SensorAlertsProfilesConditionThresholdApparentPowerArgs.builder()
 *                         .draw(17.2)
 *                         .build())
 *                     .current(SensorAlertsProfilesConditionThresholdCurrentArgs.builder()
 *                         .draw(0.14)
 *                         .build())
 *                     .door(SensorAlertsProfilesConditionThresholdDoorArgs.builder()
 *                         .open(true)
 *                         .build())
 *                     .frequency(SensorAlertsProfilesConditionThresholdFrequencyArgs.builder()
 *                         .level(58.8)
 *                         .build())
 *                     .humidity(SensorAlertsProfilesConditionThresholdHumidityArgs.builder()
 *                         .quality("inadequate")
 *                         .relativePercentage(65)
 *                         .build())
 *                     .indoorAirQuality(SensorAlertsProfilesConditionThresholdIndoorAirQualityArgs.builder()
 *                         .quality("fair")
 *                         .score(80)
 *                         .build())
 *                     .noise(SensorAlertsProfilesConditionThresholdNoiseArgs.builder()
 *                         .ambient(SensorAlertsProfilesConditionThresholdNoiseAmbientArgs.builder()
 *                             .level(120)
 *                             .quality("poor")
 *                             .build())
 *                         .build())
 *                     .pm25(SensorAlertsProfilesConditionThresholdPm25Args.builder()
 *                         .concentration(90)
 *                         .quality("fair")
 *                         .build())
 *                     .powerFactor(SensorAlertsProfilesConditionThresholdPowerFactorArgs.builder()
 *                         .percentage(81)
 *                         .build())
 *                     .realPower(SensorAlertsProfilesConditionThresholdRealPowerArgs.builder()
 *                         .draw(14.1)
 *                         .build())
 *                     .temperature(SensorAlertsProfilesConditionThresholdTemperatureArgs.builder()
 *                         .celsius(20.5)
 *                         .fahrenheit(70)
 *                         .quality("good")
 *                         .build())
 *                     .tvoc(SensorAlertsProfilesConditionThresholdTvocArgs.builder()
 *                         .concentration(400)
 *                         .quality("poor")
 *                         .build())
 *                     .upstreamPower(SensorAlertsProfilesConditionThresholdUpstreamPowerArgs.builder()
 *                         .outageDetected(true)
 *                         .build())
 *                     .voltage(SensorAlertsProfilesConditionThresholdVoltageArgs.builder()
 *                         .level(119.5)
 *                         .build())
 *                     .water(SensorAlertsProfilesConditionThresholdWaterArgs.builder()
 *                         .present(true)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .name("My Sensor Alert Profile")
 *             .networkId("string")
 *             .recipients(SensorAlertsProfilesRecipientsArgs.builder()
 *                 .emails("miles{@literal @}meraki.com")
 *                 .http_server_ids("aHR0cHM6Ly93d3cuZXhhbXBsZS5jb20vd2ViaG9va3M=")
 *                 .sms_numbers("+15555555555")
 *                 .build())
 *             .schedule(SensorAlertsProfilesScheduleArgs.builder()
 *                 .id("5")
 *                 .build())
 *             .serials(            
 *                 "Q234-ABCD-0001",
 *                 "Q234-ABCD-0002",
 *                 "Q234-ABCD-0003")
 *             .build());
 * 
 *         ctx.export("merakiNetworksSensorAlertsProfilesExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/sensorAlertsProfiles:SensorAlertsProfiles example &#34;id,network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/sensorAlertsProfiles:SensorAlertsProfiles")
public class SensorAlertsProfiles extends com.pulumi.resources.CustomResource {
    /**
     * List of conditions that will cause the profile to send an alert.
     * 
     */
    @Export(name="conditions", refs={List.class,SensorAlertsProfilesCondition.class}, tree="[0,1]")
    private Output<List<SensorAlertsProfilesCondition>> conditions;

    /**
     * @return List of conditions that will cause the profile to send an alert.
     * 
     */
    public Output<List<SensorAlertsProfilesCondition>> conditions() {
        return this.conditions;
    }
    /**
     * Name of the sensor alert profile.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the sensor alert profile.
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
     * ID of the sensor alert profile.
     * 
     */
    @Export(name="profileId", refs={String.class}, tree="[0]")
    private Output<String> profileId;

    /**
     * @return ID of the sensor alert profile.
     * 
     */
    public Output<String> profileId() {
        return this.profileId;
    }
    /**
     * List of recipients that will receive the alert.
     * 
     */
    @Export(name="recipients", refs={SensorAlertsProfilesRecipients.class}, tree="[0]")
    private Output<SensorAlertsProfilesRecipients> recipients;

    /**
     * @return List of recipients that will receive the alert.
     * 
     */
    public Output<SensorAlertsProfilesRecipients> recipients() {
        return this.recipients;
    }
    /**
     * The sensor schedule to use with the alert profile.
     * 
     */
    @Export(name="schedule", refs={SensorAlertsProfilesSchedule.class}, tree="[0]")
    private Output<SensorAlertsProfilesSchedule> schedule;

    /**
     * @return The sensor schedule to use with the alert profile.
     * 
     */
    public Output<SensorAlertsProfilesSchedule> schedule() {
        return this.schedule;
    }
    /**
     * List of device serials assigned to this sensor alert profile.
     * 
     */
    @Export(name="serials", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> serials;

    /**
     * @return List of device serials assigned to this sensor alert profile.
     * 
     */
    public Output<List<String>> serials() {
        return this.serials;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SensorAlertsProfiles(String name) {
        this(name, SensorAlertsProfilesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SensorAlertsProfiles(String name, SensorAlertsProfilesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SensorAlertsProfiles(String name, SensorAlertsProfilesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/sensorAlertsProfiles:SensorAlertsProfiles", name, args == null ? SensorAlertsProfilesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SensorAlertsProfiles(String name, Output<String> id, @Nullable SensorAlertsProfilesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/sensorAlertsProfiles:SensorAlertsProfiles", name, state, makeResourceOptions(options, id));
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
    public static SensorAlertsProfiles get(String name, Output<String> id, @Nullable SensorAlertsProfilesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SensorAlertsProfiles(name, id, state, options);
    }
}
