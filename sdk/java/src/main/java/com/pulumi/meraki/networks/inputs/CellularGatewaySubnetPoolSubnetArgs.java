// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CellularGatewaySubnetPoolSubnetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CellularGatewaySubnetPoolSubnetArgs Empty = new CellularGatewaySubnetPoolSubnetArgs();

    @Import(name="applianceIp")
    private @Nullable Output<String> applianceIp;

    public Optional<Output<String>> applianceIp() {
        return Optional.ofNullable(this.applianceIp);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="serial")
    private @Nullable Output<String> serial;

    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private CellularGatewaySubnetPoolSubnetArgs() {}

    private CellularGatewaySubnetPoolSubnetArgs(CellularGatewaySubnetPoolSubnetArgs $) {
        this.applianceIp = $.applianceIp;
        this.name = $.name;
        this.serial = $.serial;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellularGatewaySubnetPoolSubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellularGatewaySubnetPoolSubnetArgs $;

        public Builder() {
            $ = new CellularGatewaySubnetPoolSubnetArgs();
        }

        public Builder(CellularGatewaySubnetPoolSubnetArgs defaults) {
            $ = new CellularGatewaySubnetPoolSubnetArgs(Objects.requireNonNull(defaults));
        }

        public Builder applianceIp(@Nullable Output<String> applianceIp) {
            $.applianceIp = applianceIp;
            return this;
        }

        public Builder applianceIp(String applianceIp) {
            return applianceIp(Output.of(applianceIp));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        public CellularGatewaySubnetPoolSubnetArgs build() {
            return $;
        }
    }

}