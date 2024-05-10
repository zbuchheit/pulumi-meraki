// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BaseCloudRegionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BaseCloudRegionArgs Empty = new BaseCloudRegionArgs();

    /**
     * Name of region
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of region
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private BaseCloudRegionArgs() {}

    private BaseCloudRegionArgs(BaseCloudRegionArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaseCloudRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaseCloudRegionArgs $;

        public Builder() {
            $ = new BaseCloudRegionArgs();
        }

        public Builder(BaseCloudRegionArgs defaults) {
            $ = new BaseCloudRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of region
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of region
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BaseCloudRegionArgs build() {
            return $;
        }
    }

}
