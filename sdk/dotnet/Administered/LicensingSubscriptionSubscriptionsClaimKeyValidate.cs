// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered
{
    /// <summary>
    /// ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
    /// already existed previously.
    /// </summary>
    [MerakiResourceType("meraki:administered/licensingSubscriptionSubscriptionsClaimKeyValidate:LicensingSubscriptionSubscriptionsClaimKeyValidate")]
    public partial class LicensingSubscriptionSubscriptionsClaimKeyValidate : global::Pulumi.CustomResource
    {
        [Output("item")]
        public Output<Outputs.LicensingSubscriptionSubscriptionsClaimKeyValidateItem> Item { get; private set; } = null!;

        [Output("parameters")]
        public Output<Outputs.LicensingSubscriptionSubscriptionsClaimKeyValidateParameters> Parameters { get; private set; } = null!;


        /// <summary>
        /// Create a LicensingSubscriptionSubscriptionsClaimKeyValidate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LicensingSubscriptionSubscriptionsClaimKeyValidate(string name, LicensingSubscriptionSubscriptionsClaimKeyValidateArgs args, CustomResourceOptions? options = null)
            : base("meraki:administered/licensingSubscriptionSubscriptionsClaimKeyValidate:LicensingSubscriptionSubscriptionsClaimKeyValidate", name, args ?? new LicensingSubscriptionSubscriptionsClaimKeyValidateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LicensingSubscriptionSubscriptionsClaimKeyValidate(string name, Input<string> id, LicensingSubscriptionSubscriptionsClaimKeyValidateState? state = null, CustomResourceOptions? options = null)
            : base("meraki:administered/licensingSubscriptionSubscriptionsClaimKeyValidate:LicensingSubscriptionSubscriptionsClaimKeyValidate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LicensingSubscriptionSubscriptionsClaimKeyValidate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LicensingSubscriptionSubscriptionsClaimKeyValidate Get(string name, Input<string> id, LicensingSubscriptionSubscriptionsClaimKeyValidateState? state = null, CustomResourceOptions? options = null)
        {
            return new LicensingSubscriptionSubscriptionsClaimKeyValidate(name, id, state, options);
        }
    }

    public sealed class LicensingSubscriptionSubscriptionsClaimKeyValidateArgs : global::Pulumi.ResourceArgs
    {
        [Input("parameters", required: true)]
        public Input<Inputs.LicensingSubscriptionSubscriptionsClaimKeyValidateParametersArgs> Parameters { get; set; } = null!;

        public LicensingSubscriptionSubscriptionsClaimKeyValidateArgs()
        {
        }
        public static new LicensingSubscriptionSubscriptionsClaimKeyValidateArgs Empty => new LicensingSubscriptionSubscriptionsClaimKeyValidateArgs();
    }

    public sealed class LicensingSubscriptionSubscriptionsClaimKeyValidateState : global::Pulumi.ResourceArgs
    {
        [Input("item")]
        public Input<Inputs.LicensingSubscriptionSubscriptionsClaimKeyValidateItemGetArgs>? Item { get; set; }

        [Input("parameters")]
        public Input<Inputs.LicensingSubscriptionSubscriptionsClaimKeyValidateParametersGetArgs>? Parameters { get; set; }

        public LicensingSubscriptionSubscriptionsClaimKeyValidateState()
        {
        }
        public static new LicensingSubscriptionSubscriptionsClaimKeyValidateState Empty => new LicensingSubscriptionSubscriptionsClaimKeyValidateState();
    }
}
