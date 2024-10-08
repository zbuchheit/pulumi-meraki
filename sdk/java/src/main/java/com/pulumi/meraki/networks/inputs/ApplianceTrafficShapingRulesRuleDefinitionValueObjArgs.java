// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs Empty = new ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs();

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs() {}

    private ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs(ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs $;

        public Builder() {
            $ = new ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs();
        }

        public Builder(ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs defaults) {
            $ = new ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs build() {
            return $;
        }
    }

}
