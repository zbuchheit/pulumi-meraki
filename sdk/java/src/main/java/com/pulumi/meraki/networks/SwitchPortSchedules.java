// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SwitchPortSchedulesArgs;
import com.pulumi.meraki.networks.inputs.SwitchPortSchedulesState;
import com.pulumi.meraki.networks.outputs.SwitchPortSchedulesPortSchedule;
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
 * import com.pulumi.meraki.networks.SwitchPortSchedules;
 * import com.pulumi.meraki.networks.SwitchPortSchedulesArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchPortSchedulesPortScheduleArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchPortSchedulesPortScheduleFridayArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchPortSchedulesPortScheduleMondayArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchPortSchedulesPortScheduleSaturdayArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchPortSchedulesPortScheduleSundayArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchPortSchedulesPortScheduleThursdayArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchPortSchedulesPortScheduleTuesdayArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchPortSchedulesPortScheduleWednesdayArgs;
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
 *         var example = new SwitchPortSchedules("example", SwitchPortSchedulesArgs.builder()
 *             .name("Weekdays schedule")
 *             .networkId("string")
 *             .portSchedule(SwitchPortSchedulesPortScheduleArgs.builder()
 *                 .friday(SwitchPortSchedulesPortScheduleFridayArgs.builder()
 *                     .active(true)
 *                     .from("9:00")
 *                     .to("17:00")
 *                     .build())
 *                 .monday(SwitchPortSchedulesPortScheduleMondayArgs.builder()
 *                     .active(true)
 *                     .from("9:00")
 *                     .to("17:00")
 *                     .build())
 *                 .saturday(SwitchPortSchedulesPortScheduleSaturdayArgs.builder()
 *                     .active(false)
 *                     .from("0:00")
 *                     .to("24:00")
 *                     .build())
 *                 .sunday(SwitchPortSchedulesPortScheduleSundayArgs.builder()
 *                     .active(false)
 *                     .from("0:00")
 *                     .to("24:00")
 *                     .build())
 *                 .thursday(SwitchPortSchedulesPortScheduleThursdayArgs.builder()
 *                     .active(true)
 *                     .from("9:00")
 *                     .to("17:00")
 *                     .build())
 *                 .tuesday(SwitchPortSchedulesPortScheduleTuesdayArgs.builder()
 *                     .active(true)
 *                     .from("9:00")
 *                     .to("17:00")
 *                     .build())
 *                 .wednesday(SwitchPortSchedulesPortScheduleWednesdayArgs.builder()
 *                     .active(true)
 *                     .from("9:00")
 *                     .to("17:00")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiNetworksSwitchPortSchedulesExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/switchPortSchedules:SwitchPortSchedules example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/switchPortSchedules:SwitchPortSchedules")
public class SwitchPortSchedules extends com.pulumi.resources.CustomResource {
    /**
     * The name for your port schedule. Required
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for your port schedule. Required
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
     * The schedule for switch port scheduling. Schedules are applied to days of the week.
     * When it&#39;s empty, default schedule with all days of a week are configured.
     * Any unspecified day in the schedule is added as a default schedule configuration of the day.
     * 
     */
    @Export(name="portSchedule", refs={SwitchPortSchedulesPortSchedule.class}, tree="[0]")
    private Output<SwitchPortSchedulesPortSchedule> portSchedule;

    /**
     * @return The schedule for switch port scheduling. Schedules are applied to days of the week.
     * When it&#39;s empty, default schedule with all days of a week are configured.
     * Any unspecified day in the schedule is added as a default schedule configuration of the day.
     * 
     */
    public Output<SwitchPortSchedulesPortSchedule> portSchedule() {
        return this.portSchedule;
    }
    /**
     * portScheduleId path parameter. Port schedule ID
     * 
     */
    @Export(name="portScheduleId", refs={String.class}, tree="[0]")
    private Output<String> portScheduleId;

    /**
     * @return portScheduleId path parameter. Port schedule ID
     * 
     */
    public Output<String> portScheduleId() {
        return this.portScheduleId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SwitchPortSchedules(String name) {
        this(name, SwitchPortSchedulesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SwitchPortSchedules(String name, SwitchPortSchedulesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SwitchPortSchedules(String name, SwitchPortSchedulesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchPortSchedules:SwitchPortSchedules", name, args == null ? SwitchPortSchedulesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SwitchPortSchedules(String name, Output<String> id, @Nullable SwitchPortSchedulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchPortSchedules:SwitchPortSchedules", name, state, makeResourceOptions(options, id));
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
    public static SwitchPortSchedules get(String name, Output<String> id, @Nullable SwitchPortSchedulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SwitchPortSchedules(name, id, state, options);
    }
}
