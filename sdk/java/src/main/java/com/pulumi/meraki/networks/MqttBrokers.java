// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.MqttBrokersArgs;
import com.pulumi.meraki.networks.inputs.MqttBrokersState;
import com.pulumi.meraki.networks.outputs.MqttBrokersItem;
import com.pulumi.meraki.networks.outputs.MqttBrokersParameters;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.meraki.networks.MqttBrokers;
 * import com.pulumi.meraki.networks.MqttBrokersArgs;
 * import com.pulumi.meraki.networks.inputs.MqttBrokersParametersArgs;
 * import com.pulumi.meraki.networks.inputs.MqttBrokersParametersAuthenticationArgs;
 * import com.pulumi.meraki.networks.inputs.MqttBrokersParametersSecurityArgs;
 * import com.pulumi.meraki.networks.inputs.MqttBrokersParametersSecurityTlsArgs;
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
 *         var example = new MqttBrokers(&#34;example&#34;, MqttBrokersArgs.builder()        
 *             .networkId(&#34;string&#34;)
 *             .parameters(MqttBrokersParametersArgs.builder()
 *                 .authentication(MqttBrokersParametersAuthenticationArgs.builder()
 *                     .password(&#34;*****&#34;)
 *                     .username(&#34;milesmeraki&#34;)
 *                     .build())
 *                 .host(&#34;1.2.3.4&#34;)
 *                 .name(&#34;MQTT_Broker_1&#34;)
 *                 .port(443)
 *                 .security(MqttBrokersParametersSecurityArgs.builder()
 *                     .mode(&#34;tls&#34;)
 *                     .tls(MqttBrokersParametersSecurityTlsArgs.builder()
 *                         .caCertificate(&#34;*****&#34;)
 *                         .verifyHostnames(true)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksMqttBrokersExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:networks/mqttBrokers:MqttBrokers")
public class MqttBrokers extends com.pulumi.resources.CustomResource {
    @Export(name="item", refs={MqttBrokersItem.class}, tree="[0]")
    private Output<MqttBrokersItem> item;

    public Output<MqttBrokersItem> item() {
        return this.item;
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
    @Export(name="parameters", refs={MqttBrokersParameters.class}, tree="[0]")
    private Output<MqttBrokersParameters> parameters;

    public Output<MqttBrokersParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MqttBrokers(String name) {
        this(name, MqttBrokersArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MqttBrokers(String name, MqttBrokersArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MqttBrokers(String name, MqttBrokersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/mqttBrokers:MqttBrokers", name, args == null ? MqttBrokersArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MqttBrokers(String name, Output<String> id, @Nullable MqttBrokersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/mqttBrokers:MqttBrokers", name, state, makeResourceOptions(options, id));
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
    public static MqttBrokers get(String name, Output<String> id, @Nullable MqttBrokersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MqttBrokers(name, id, state, options);
    }
}