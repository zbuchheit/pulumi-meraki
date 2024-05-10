// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Meraki = Pulumi.Meraki;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Meraki.Organizations.Snmp("example", new()
    ///     {
    ///         OrganizationId = "string",
    ///         PeerIps = new[]
    ///         {
    ///             "123.123.123.1",
    ///         },
    ///         V2cEnabled = false,
    ///         V3AuthMode = "SHA",
    ///         V3AuthPass = "password",
    ///         V3Enabled = true,
    ///         V3PrivMode = "AES128",
    ///         V3PrivPass = "password",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiOrganizationsSnmpExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:organizations/snmp:Snmp example "organization_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:organizations/snmp:Snmp")]
    public partial class Snmp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The hostname of the SNMP server.
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// The list of IPv4 addresses that are allowed to access the SNMP server.
        /// </summary>
        [Output("peerIps")]
        public Output<ImmutableArray<string>> PeerIps { get; private set; } = null!;

        /// <summary>
        /// The port of the SNMP server.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// The community string for SNMP version 2c, if enabled.
        /// </summary>
        [Output("v2CommunityString")]
        public Output<string> V2CommunityString { get; private set; } = null!;

        /// <summary>
        /// Boolean indicating whether SNMP version 2c is enabled for the organization.
        /// </summary>
        [Output("v2cEnabled")]
        public Output<bool> V2cEnabled { get; private set; } = null!;

        /// <summary>
        /// The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
        /// </summary>
        [Output("v3AuthMode")]
        public Output<string> V3AuthMode { get; private set; } = null!;

        /// <summary>
        /// The SNMP version 3 authentication password. Must be at least 8 characters if specified.
        /// </summary>
        [Output("v3AuthPass")]
        public Output<string> V3AuthPass { get; private set; } = null!;

        /// <summary>
        /// Boolean indicating whether SNMP version 3 is enabled for the organization.
        /// </summary>
        [Output("v3Enabled")]
        public Output<bool> V3Enabled { get; private set; } = null!;

        /// <summary>
        /// The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
        /// </summary>
        [Output("v3PrivMode")]
        public Output<string> V3PrivMode { get; private set; } = null!;

        /// <summary>
        /// The SNMP version 3 privacy password. Must be at least 8 characters if specified.
        /// </summary>
        [Output("v3PrivPass")]
        public Output<string> V3PrivPass { get; private set; } = null!;

        /// <summary>
        /// The user for SNMP version 3, if enabled.
        /// </summary>
        [Output("v3User")]
        public Output<string> V3User { get; private set; } = null!;


        /// <summary>
        /// Create a Snmp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Snmp(string name, SnmpArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/snmp:Snmp", name, args ?? new SnmpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Snmp(string name, Input<string> id, SnmpState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/snmp:Snmp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Snmp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Snmp Get(string name, Input<string> id, SnmpState? state = null, CustomResourceOptions? options = null)
        {
            return new Snmp(name, id, state, options);
        }
    }

    public sealed class SnmpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        [Input("peerIps")]
        private InputList<string>? _peerIps;

        /// <summary>
        /// The list of IPv4 addresses that are allowed to access the SNMP server.
        /// </summary>
        public InputList<string> PeerIps
        {
            get => _peerIps ?? (_peerIps = new InputList<string>());
            set => _peerIps = value;
        }

        /// <summary>
        /// Boolean indicating whether SNMP version 2c is enabled for the organization.
        /// </summary>
        [Input("v2cEnabled")]
        public Input<bool>? V2cEnabled { get; set; }

        /// <summary>
        /// The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
        /// </summary>
        [Input("v3AuthMode")]
        public Input<string>? V3AuthMode { get; set; }

        /// <summary>
        /// The SNMP version 3 authentication password. Must be at least 8 characters if specified.
        /// </summary>
        [Input("v3AuthPass")]
        public Input<string>? V3AuthPass { get; set; }

        /// <summary>
        /// Boolean indicating whether SNMP version 3 is enabled for the organization.
        /// </summary>
        [Input("v3Enabled")]
        public Input<bool>? V3Enabled { get; set; }

        /// <summary>
        /// The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
        /// </summary>
        [Input("v3PrivMode")]
        public Input<string>? V3PrivMode { get; set; }

        /// <summary>
        /// The SNMP version 3 privacy password. Must be at least 8 characters if specified.
        /// </summary>
        [Input("v3PrivPass")]
        public Input<string>? V3PrivPass { get; set; }

        public SnmpArgs()
        {
        }
        public static new SnmpArgs Empty => new SnmpArgs();
    }

    public sealed class SnmpState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The hostname of the SNMP server.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        [Input("peerIps")]
        private InputList<string>? _peerIps;

        /// <summary>
        /// The list of IPv4 addresses that are allowed to access the SNMP server.
        /// </summary>
        public InputList<string> PeerIps
        {
            get => _peerIps ?? (_peerIps = new InputList<string>());
            set => _peerIps = value;
        }

        /// <summary>
        /// The port of the SNMP server.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The community string for SNMP version 2c, if enabled.
        /// </summary>
        [Input("v2CommunityString")]
        public Input<string>? V2CommunityString { get; set; }

        /// <summary>
        /// Boolean indicating whether SNMP version 2c is enabled for the organization.
        /// </summary>
        [Input("v2cEnabled")]
        public Input<bool>? V2cEnabled { get; set; }

        /// <summary>
        /// The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
        /// </summary>
        [Input("v3AuthMode")]
        public Input<string>? V3AuthMode { get; set; }

        /// <summary>
        /// The SNMP version 3 authentication password. Must be at least 8 characters if specified.
        /// </summary>
        [Input("v3AuthPass")]
        public Input<string>? V3AuthPass { get; set; }

        /// <summary>
        /// Boolean indicating whether SNMP version 3 is enabled for the organization.
        /// </summary>
        [Input("v3Enabled")]
        public Input<bool>? V3Enabled { get; set; }

        /// <summary>
        /// The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
        /// </summary>
        [Input("v3PrivMode")]
        public Input<string>? V3PrivMode { get; set; }

        /// <summary>
        /// The SNMP version 3 privacy password. Must be at least 8 characters if specified.
        /// </summary>
        [Input("v3PrivPass")]
        public Input<string>? V3PrivPass { get; set; }

        /// <summary>
        /// The user for SNMP version 3, if enabled.
        /// </summary>
        [Input("v3User")]
        public Input<string>? V3User { get; set; }

        public SnmpState()
        {
        }
        public static new SnmpState Empty => new SnmpState();
    }
}
