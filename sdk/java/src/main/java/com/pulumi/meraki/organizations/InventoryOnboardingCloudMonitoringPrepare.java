// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.InventoryOnboardingCloudMonitoringPrepareArgs;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringPrepareState;
import com.pulumi.meraki.organizations.outputs.InventoryOnboardingCloudMonitoringPrepareItem;
import com.pulumi.meraki.organizations.outputs.InventoryOnboardingCloudMonitoringPrepareParameters;
import java.lang.String;
import java.util.List;
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
 * import com.pulumi.meraki.organizations.InventoryOnboardingCloudMonitoringPrepare;
 * import com.pulumi.meraki.organizations.InventoryOnboardingCloudMonitoringPrepareArgs;
 * import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringPrepareParametersArgs;
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
 *         var example = new InventoryOnboardingCloudMonitoringPrepare(&#34;example&#34;, InventoryOnboardingCloudMonitoringPrepareArgs.builder()        
 *             .organizationId(&#34;string&#34;)
 *             .parameters(InventoryOnboardingCloudMonitoringPrepareParametersArgs.builder()
 *                 .devices(InventoryOnboardingCloudMonitoringPrepareParametersDeviceArgs.builder()
 *                     .sudi(&#34;&#34;&#34;
 *           &#34;-----BEGIN CERTIFICATE-----
 *         MIIDyTCCArGgAwIBAgIKBBNXOVCGU1YztjANBgkqhkiG9w0BAQsFADAnMQ4wDAYD
 *         VQQKEwVDaXNjbzEVMBMGA1UEAxMMQUNUMiBTVURJIENBMB4XDTIxMDUzMTEzNTUx
 *         NVoXDTI5MDUxNDIwMjU0MVowbTEpMCcGA1UEBRMgUElEOkM5MjAwTC0yNFAtNEcg
 *         U046SkFFMjUyMjBSMksxDjAMBgNVBAoTBUNpc2NvMRgwFgYDVQQLEw9BQ1QtMiBM
 *         aXRlIFNVREkxFjAUBgNVBAMTDUM5MjAwTC0yNFAtNEcwggEiMA0GCSqGSIb3DQEB
 *         AQUAA4IBDwAwggEKAoIBAQDaUPxW76gT5MdoEAt+UrDFiYA9RYh2iHicDViBEyow
 *         TR1TuP36bHh13X3vtGiDsCD88Ci2TZIqd/EDkkc7v9ipUUYVVH+YDrPt2Aukb1PH
 *         D6K0R+KhgEzRo5x54TlU6oWvjUpwNZUwwdhMWIQaUVkMyZBYNy0jGPLO8jwZhyBg
 *         1Fneybr9pwedGbLrAaz+gdEikB8B4a/fvPjVfL5Ngb4QRjFqWuE+X3nLc0kHedep
 *         6nfgpUNXMlStVm5nIXKP6OjmzfCHPYh9L2Ehs1TrSk1ser9Ofx0ZMVL/jBZR2EIj
 *         OZ8tH6KlX2/B2pbSPIO6kD5c4UA8Cf1SbDJCwJ/kI9ihAgMBAAGjgbAwga0wDgYD
 *         VR0PAQH/BAQDAgXgMAwGA1UdEwEB/wQCMAAwHwYDVR0jBBgwFoAUSNjx8cJw1Vu7
 *         fHMJk6+4uDAD+H8wTQYDVR0RBEYwRKBCBgkrBgEEAQkVAgOgNRMzQ2hpcElEPVVV
 *         VUNNaElGcUVFMklFUUVBQWNBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE9MB0GA1Ud
 *         DgQWBBRdhMkFD/z5hokaQeLbaRsp4hkvbzANBgkqhkiG9w0BAQsFAAOCAQEAMtuh
 *         YpBz4xEZ7YdJsLpw67Q0TTJGnTBRpzAeY1urYDoDz8TSx556XG7z3IRzuED5KVSp
 *         OwmH/iZ+tDfYQ3W3ElWTW93871DkuW4WQIfbnoHg/F7bF0DKYVkD3rpZjyz3NhzH
 *         d7cjTdJXQ85bTAOXDuxKH3qewrXxxOGXgh3I6NUq0UwMTWh84lND7Jl+ZAQkYNS2
 *         iHanTZFQBk3ML0NUb7fKDYGRTZRqwQ/upIO4S6LV1cxH/6V0qbMy3sCSHZoMLrW3
 *         0m3M6yKpe5+VZzHZwmWdUf3Ot+zKjhveK5/YNsMIASdvtvymxUizq2Hr1hvR/kPc
 *         p1vuyWxipU8JfzOh/A==
 *         -----END CERTIFICATE-----
 *         &#34;
 *                     &#34;&#34;&#34;)
 *                     .tunnel(InventoryOnboardingCloudMonitoringPrepareParametersDeviceTunnelArgs.builder()
 *                         .certificateName(&#34;DeviceSUDI&#34;)
 *                         .localInterface(1)
 *                         .loopbackNumber(1000)
 *                         .name(&#34;MERAKI&#34;)
 *                         .build())
 *                     .user(InventoryOnboardingCloudMonitoringPrepareParametersDeviceUserArgs.builder()
 *                         .username(&#34;Meraki&#34;)
 *                         .build())
 *                     .vty(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyArgs.builder()
 *                         .accessList(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs.builder()
 *                             .vtyIn(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs.builder()
 *                                 .name(&#34;MERAKI_IN&#34;)
 *                                 .build())
 *                             .vtyOut(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyOutArgs.builder()
 *                                 .name(&#34;MERAKI_OUT&#34;)
 *                                 .build())
 *                             .build())
 *                         .authentication(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs.builder()
 *                             .group(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationGroupArgs.builder()
 *                                 .name(&#34;&#34;)
 *                                 .build())
 *                             .build())
 *                         .authorization(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationArgs.builder()
 *                             .group(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGroupArgs.builder()
 *                                 .name(&#34;MERAKI&#34;)
 *                                 .build())
 *                             .build())
 *                         .endLineNumber(17)
 *                         .rotaryNumber(50)
 *                         .startLineNumber(16)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;merakiOrganizationsInventoryOnboardingCloudMonitoringPrepareExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:organizations/inventoryOnboardingCloudMonitoringPrepare:InventoryOnboardingCloudMonitoringPrepare")
public class InventoryOnboardingCloudMonitoringPrepare extends com.pulumi.resources.CustomResource {
    /**
     * Array of ResponseOrganizationsCreateOrganizationInventoryOnboardingCloudMonitoringPrepare
     * 
     */
    @Export(name="items", refs={List.class,InventoryOnboardingCloudMonitoringPrepareItem.class}, tree="[0,1]")
    private Output<List<InventoryOnboardingCloudMonitoringPrepareItem>> items;

    /**
     * @return Array of ResponseOrganizationsCreateOrganizationInventoryOnboardingCloudMonitoringPrepare
     * 
     */
    public Output<List<InventoryOnboardingCloudMonitoringPrepareItem>> items() {
        return this.items;
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
    @Export(name="parameters", refs={InventoryOnboardingCloudMonitoringPrepareParameters.class}, tree="[0]")
    private Output<InventoryOnboardingCloudMonitoringPrepareParameters> parameters;

    public Output<InventoryOnboardingCloudMonitoringPrepareParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InventoryOnboardingCloudMonitoringPrepare(String name) {
        this(name, InventoryOnboardingCloudMonitoringPrepareArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InventoryOnboardingCloudMonitoringPrepare(String name, InventoryOnboardingCloudMonitoringPrepareArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InventoryOnboardingCloudMonitoringPrepare(String name, InventoryOnboardingCloudMonitoringPrepareArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/inventoryOnboardingCloudMonitoringPrepare:InventoryOnboardingCloudMonitoringPrepare", name, args == null ? InventoryOnboardingCloudMonitoringPrepareArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InventoryOnboardingCloudMonitoringPrepare(String name, Output<String> id, @Nullable InventoryOnboardingCloudMonitoringPrepareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/inventoryOnboardingCloudMonitoringPrepare:InventoryOnboardingCloudMonitoringPrepare", name, state, makeResourceOptions(options, id));
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
    public static InventoryOnboardingCloudMonitoringPrepare get(String name, Output<String> id, @Nullable InventoryOnboardingCloudMonitoringPrepareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InventoryOnboardingCloudMonitoringPrepare(name, id, state, options);
    }
}