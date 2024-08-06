// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.ProviderArgs;
import com.pulumi.meraki.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the meraki package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:meraki")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * Cisco Meraki base URL, FQDN or IP. If not set, it uses the MERAKI_BASE_URL environment variable. Default is
     * (https://api.meraki.com/)
     * 
     */
    @Export(name="merakiBaseUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> merakiBaseUrl;

    /**
     * @return Cisco Meraki base URL, FQDN or IP. If not set, it uses the MERAKI_BASE_URL environment variable. Default is
     * (https://api.meraki.com/)
     * 
     */
    public Output<Optional<String>> merakiBaseUrl() {
        return Codegen.optional(this.merakiBaseUrl);
    }
    /**
     * Cisco Meraki meraki_dashboard_api_key to authenticate. If not set, it uses the MERAKI_DASHBOARD_API_KEY environment
     * variable.
     * 
     */
    @Export(name="merakiDashboardApiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> merakiDashboardApiKey;

    /**
     * @return Cisco Meraki meraki_dashboard_api_key to authenticate. If not set, it uses the MERAKI_DASHBOARD_API_KEY environment
     * variable.
     * 
     */
    public Output<Optional<String>> merakiDashboardApiKey() {
        return Codegen.optional(this.merakiDashboardApiKey);
    }
    /**
     * Flag for Cisco Meraki to enable debugging. If not set, it uses the MERAKI_DEBUG environment variable defaults to
     * `false`.
     * 
     */
    @Export(name="merakiDebug", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> merakiDebug;

    /**
     * @return Flag for Cisco Meraki to enable debugging. If not set, it uses the MERAKI_DEBUG environment variable defaults to
     * `false`.
     * 
     */
    public Output<Optional<String>> merakiDebug() {
        return Codegen.optional(this.merakiDebug);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private static ProviderArgs makeArgs(@Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProviderArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "merakiDashboardApiKey"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
