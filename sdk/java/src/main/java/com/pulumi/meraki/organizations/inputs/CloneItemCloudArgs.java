// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.CloneItemCloudRegionArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloneItemCloudArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloneItemCloudArgs Empty = new CloneItemCloudArgs();

    /**
     * Region info
     * 
     */
    @Import(name="region")
    private @Nullable Output<CloneItemCloudRegionArgs> region;

    /**
     * @return Region info
     * 
     */
    public Optional<Output<CloneItemCloudRegionArgs>> region() {
        return Optional.ofNullable(this.region);
    }

    private CloneItemCloudArgs() {}

    private CloneItemCloudArgs(CloneItemCloudArgs $) {
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloneItemCloudArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloneItemCloudArgs $;

        public Builder() {
            $ = new CloneItemCloudArgs();
        }

        public Builder(CloneItemCloudArgs defaults) {
            $ = new CloneItemCloudArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param region Region info
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<CloneItemCloudRegionArgs> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region info
         * 
         * @return builder
         * 
         */
        public Builder region(CloneItemCloudRegionArgs region) {
            return region(Output.of(region));
        }

        public CloneItemCloudArgs build() {
            return $;
        }
    }

}
