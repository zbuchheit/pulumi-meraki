// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/applianceTrafficShapingRules:ApplianceTrafficShapingRules example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/applianceTrafficShapingRules:ApplianceTrafficShapingRules")]
    public partial class ApplianceTrafficShapingRules : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
        /// </summary>
        [Output("defaultRulesEnabled")]
        public Output<bool> DefaultRulesEnabled { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// An array of traffic shaping rules. Rules are applied in the order that
        /// they are specified in. An empty list (or null) means no rules. Note that
        /// you are allowed a maximum of 8 rules.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.ApplianceTrafficShapingRulesRule>> Rules { get; private set; } = null!;


        /// <summary>
        /// Create a ApplianceTrafficShapingRules resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApplianceTrafficShapingRules(string name, ApplianceTrafficShapingRulesArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/applianceTrafficShapingRules:ApplianceTrafficShapingRules", name, args ?? new ApplianceTrafficShapingRulesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApplianceTrafficShapingRules(string name, Input<string> id, ApplianceTrafficShapingRulesState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/applianceTrafficShapingRules:ApplianceTrafficShapingRules", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-meraki",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ApplianceTrafficShapingRules resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApplianceTrafficShapingRules Get(string name, Input<string> id, ApplianceTrafficShapingRulesState? state = null, CustomResourceOptions? options = null)
        {
            return new ApplianceTrafficShapingRules(name, id, state, options);
        }
    }

    public sealed class ApplianceTrafficShapingRulesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
        /// </summary>
        [Input("defaultRulesEnabled")]
        public Input<bool>? DefaultRulesEnabled { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        [Input("rules")]
        private InputList<Inputs.ApplianceTrafficShapingRulesRuleArgs>? _rules;

        /// <summary>
        /// An array of traffic shaping rules. Rules are applied in the order that
        /// they are specified in. An empty list (or null) means no rules. Note that
        /// you are allowed a maximum of 8 rules.
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingRulesRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.ApplianceTrafficShapingRulesRuleArgs>());
            set => _rules = value;
        }

        public ApplianceTrafficShapingRulesArgs()
        {
        }
        public static new ApplianceTrafficShapingRulesArgs Empty => new ApplianceTrafficShapingRulesArgs();
    }

    public sealed class ApplianceTrafficShapingRulesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
        /// </summary>
        [Input("defaultRulesEnabled")]
        public Input<bool>? DefaultRulesEnabled { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        [Input("rules")]
        private InputList<Inputs.ApplianceTrafficShapingRulesRuleGetArgs>? _rules;

        /// <summary>
        /// An array of traffic shaping rules. Rules are applied in the order that
        /// they are specified in. An empty list (or null) means no rules. Note that
        /// you are allowed a maximum of 8 rules.
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingRulesRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.ApplianceTrafficShapingRulesRuleGetArgs>());
            set => _rules = value;
        }

        public ApplianceTrafficShapingRulesState()
        {
        }
        public static new ApplianceTrafficShapingRulesState Empty => new ApplianceTrafficShapingRulesState();
    }
}
