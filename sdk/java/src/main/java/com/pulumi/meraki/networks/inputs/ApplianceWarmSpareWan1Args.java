// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceWarmSpareWan1Args extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceWarmSpareWan1Args Empty = new ApplianceWarmSpareWan1Args();

    @Import(name="ip")
    private @Nullable Output<String> ip;

    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private ApplianceWarmSpareWan1Args() {}

    private ApplianceWarmSpareWan1Args(ApplianceWarmSpareWan1Args $) {
        this.ip = $.ip;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceWarmSpareWan1Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceWarmSpareWan1Args $;

        public Builder() {
            $ = new ApplianceWarmSpareWan1Args();
        }

        public Builder(ApplianceWarmSpareWan1Args defaults) {
            $ = new ApplianceWarmSpareWan1Args(Objects.requireNonNull(defaults));
        }

        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        public ApplianceWarmSpareWan1Args build() {
            return $;
        }
    }

}
