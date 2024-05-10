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
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:organizations/loginSecurity:LoginSecurity example "organization_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:organizations/loginSecurity:LoginSecurity")]
    public partial class LoginSecurity : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Number of consecutive failed login attempts after which users' accounts will be locked.
        /// </summary>
        [Output("accountLockoutAttempts")]
        public Output<int> AccountLockoutAttempts { get; private set; } = null!;

        /// <summary>
        /// Details for indicating whether organization will restrict access to API (but not Dashboard) to certain IP addresses.
        /// </summary>
        [Output("apiAuthentication")]
        public Output<Outputs.LoginSecurityApiAuthentication> ApiAuthentication { get; private set; } = null!;

        /// <summary>
        /// Boolean indicating whether users' Dashboard accounts will be locked out after a specified number of consecutive failed login attempts.
        /// </summary>
        [Output("enforceAccountLockout")]
        public Output<bool> EnforceAccountLockout { get; private set; } = null!;

        /// <summary>
        /// Boolean indicating whether users, when setting a new password, are forced to choose a new password that is different from any past passwords.
        /// </summary>
        [Output("enforceDifferentPasswords")]
        public Output<bool> EnforceDifferentPasswords { get; private set; } = null!;

        /// <summary>
        /// Boolean indicating whether users will be logged out after being idle for the specified number of minutes.
        /// </summary>
        [Output("enforceIdleTimeout")]
        public Output<bool> EnforceIdleTimeout { get; private set; } = null!;

        /// <summary>
        /// Boolean indicating whether organization will restrict access to Dashboard (including the API) from certain IP addresses.
        /// </summary>
        [Output("enforceLoginIpRanges")]
        public Output<bool> EnforceLoginIpRanges { get; private set; } = null!;

        /// <summary>
        /// Boolean indicating whether users are forced to change their password every X number of days.
        /// </summary>
        [Output("enforcePasswordExpiration")]
        public Output<bool> EnforcePasswordExpiration { get; private set; } = null!;

        /// <summary>
        /// Boolean indicating whether users will be forced to choose strong passwords for their accounts. Strong passwords are at least 8 characters that contain 3 of the following: number, uppercase letter, lowercase letter, and symbol
        /// </summary>
        [Output("enforceStrongPasswords")]
        public Output<bool> EnforceStrongPasswords { get; private set; } = null!;

        /// <summary>
        /// Boolean indicating whether users in this organization will be required to use an extra verification code when logging in to Dashboard. This code will be sent to their mobile phone via SMS, or can be generated by the authenticator application.
        /// </summary>
        [Output("enforceTwoFactorAuth")]
        public Output<bool> EnforceTwoFactorAuth { get; private set; } = null!;

        /// <summary>
        /// Number of minutes users can remain idle before being logged out of their accounts.
        /// </summary>
        [Output("idleTimeoutMinutes")]
        public Output<int> IdleTimeoutMinutes { get; private set; } = null!;

        /// <summary>
        /// List of acceptable IP ranges. Entries can be single IP addresses, IP address ranges, and CIDR subnets.
        /// </summary>
        [Output("loginIpRanges")]
        public Output<ImmutableArray<string>> LoginIpRanges { get; private set; } = null!;

        /// <summary>
        /// Number of recent passwords that new password must be distinct from.
        /// </summary>
        [Output("numDifferentPasswords")]
        public Output<int> NumDifferentPasswords { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// Number of days after which users will be forced to change their password.
        /// </summary>
        [Output("passwordExpirationDays")]
        public Output<int> PasswordExpirationDays { get; private set; } = null!;


        /// <summary>
        /// Create a LoginSecurity resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoginSecurity(string name, LoginSecurityArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/loginSecurity:LoginSecurity", name, args ?? new LoginSecurityArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoginSecurity(string name, Input<string> id, LoginSecurityState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/loginSecurity:LoginSecurity", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LoginSecurity resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoginSecurity Get(string name, Input<string> id, LoginSecurityState? state = null, CustomResourceOptions? options = null)
        {
            return new LoginSecurity(name, id, state, options);
        }
    }

    public sealed class LoginSecurityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of consecutive failed login attempts after which users' accounts will be locked.
        /// </summary>
        [Input("accountLockoutAttempts")]
        public Input<int>? AccountLockoutAttempts { get; set; }

        /// <summary>
        /// Details for indicating whether organization will restrict access to API (but not Dashboard) to certain IP addresses.
        /// </summary>
        [Input("apiAuthentication")]
        public Input<Inputs.LoginSecurityApiAuthenticationArgs>? ApiAuthentication { get; set; }

        /// <summary>
        /// Boolean indicating whether users' Dashboard accounts will be locked out after a specified number of consecutive failed login attempts.
        /// </summary>
        [Input("enforceAccountLockout")]
        public Input<bool>? EnforceAccountLockout { get; set; }

        /// <summary>
        /// Boolean indicating whether users, when setting a new password, are forced to choose a new password that is different from any past passwords.
        /// </summary>
        [Input("enforceDifferentPasswords")]
        public Input<bool>? EnforceDifferentPasswords { get; set; }

        /// <summary>
        /// Boolean indicating whether users will be logged out after being idle for the specified number of minutes.
        /// </summary>
        [Input("enforceIdleTimeout")]
        public Input<bool>? EnforceIdleTimeout { get; set; }

        /// <summary>
        /// Boolean indicating whether organization will restrict access to Dashboard (including the API) from certain IP addresses.
        /// </summary>
        [Input("enforceLoginIpRanges")]
        public Input<bool>? EnforceLoginIpRanges { get; set; }

        /// <summary>
        /// Boolean indicating whether users are forced to change their password every X number of days.
        /// </summary>
        [Input("enforcePasswordExpiration")]
        public Input<bool>? EnforcePasswordExpiration { get; set; }

        /// <summary>
        /// Boolean indicating whether users will be forced to choose strong passwords for their accounts. Strong passwords are at least 8 characters that contain 3 of the following: number, uppercase letter, lowercase letter, and symbol
        /// </summary>
        [Input("enforceStrongPasswords")]
        public Input<bool>? EnforceStrongPasswords { get; set; }

        /// <summary>
        /// Boolean indicating whether users in this organization will be required to use an extra verification code when logging in to Dashboard. This code will be sent to their mobile phone via SMS, or can be generated by the authenticator application.
        /// </summary>
        [Input("enforceTwoFactorAuth")]
        public Input<bool>? EnforceTwoFactorAuth { get; set; }

        /// <summary>
        /// Number of minutes users can remain idle before being logged out of their accounts.
        /// </summary>
        [Input("idleTimeoutMinutes")]
        public Input<int>? IdleTimeoutMinutes { get; set; }

        [Input("loginIpRanges")]
        private InputList<string>? _loginIpRanges;

        /// <summary>
        /// List of acceptable IP ranges. Entries can be single IP addresses, IP address ranges, and CIDR subnets.
        /// </summary>
        public InputList<string> LoginIpRanges
        {
            get => _loginIpRanges ?? (_loginIpRanges = new InputList<string>());
            set => _loginIpRanges = value;
        }

        /// <summary>
        /// Number of recent passwords that new password must be distinct from.
        /// </summary>
        [Input("numDifferentPasswords")]
        public Input<int>? NumDifferentPasswords { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// Number of days after which users will be forced to change their password.
        /// </summary>
        [Input("passwordExpirationDays")]
        public Input<int>? PasswordExpirationDays { get; set; }

        public LoginSecurityArgs()
        {
        }
        public static new LoginSecurityArgs Empty => new LoginSecurityArgs();
    }

    public sealed class LoginSecurityState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of consecutive failed login attempts after which users' accounts will be locked.
        /// </summary>
        [Input("accountLockoutAttempts")]
        public Input<int>? AccountLockoutAttempts { get; set; }

        /// <summary>
        /// Details for indicating whether organization will restrict access to API (but not Dashboard) to certain IP addresses.
        /// </summary>
        [Input("apiAuthentication")]
        public Input<Inputs.LoginSecurityApiAuthenticationGetArgs>? ApiAuthentication { get; set; }

        /// <summary>
        /// Boolean indicating whether users' Dashboard accounts will be locked out after a specified number of consecutive failed login attempts.
        /// </summary>
        [Input("enforceAccountLockout")]
        public Input<bool>? EnforceAccountLockout { get; set; }

        /// <summary>
        /// Boolean indicating whether users, when setting a new password, are forced to choose a new password that is different from any past passwords.
        /// </summary>
        [Input("enforceDifferentPasswords")]
        public Input<bool>? EnforceDifferentPasswords { get; set; }

        /// <summary>
        /// Boolean indicating whether users will be logged out after being idle for the specified number of minutes.
        /// </summary>
        [Input("enforceIdleTimeout")]
        public Input<bool>? EnforceIdleTimeout { get; set; }

        /// <summary>
        /// Boolean indicating whether organization will restrict access to Dashboard (including the API) from certain IP addresses.
        /// </summary>
        [Input("enforceLoginIpRanges")]
        public Input<bool>? EnforceLoginIpRanges { get; set; }

        /// <summary>
        /// Boolean indicating whether users are forced to change their password every X number of days.
        /// </summary>
        [Input("enforcePasswordExpiration")]
        public Input<bool>? EnforcePasswordExpiration { get; set; }

        /// <summary>
        /// Boolean indicating whether users will be forced to choose strong passwords for their accounts. Strong passwords are at least 8 characters that contain 3 of the following: number, uppercase letter, lowercase letter, and symbol
        /// </summary>
        [Input("enforceStrongPasswords")]
        public Input<bool>? EnforceStrongPasswords { get; set; }

        /// <summary>
        /// Boolean indicating whether users in this organization will be required to use an extra verification code when logging in to Dashboard. This code will be sent to their mobile phone via SMS, or can be generated by the authenticator application.
        /// </summary>
        [Input("enforceTwoFactorAuth")]
        public Input<bool>? EnforceTwoFactorAuth { get; set; }

        /// <summary>
        /// Number of minutes users can remain idle before being logged out of their accounts.
        /// </summary>
        [Input("idleTimeoutMinutes")]
        public Input<int>? IdleTimeoutMinutes { get; set; }

        [Input("loginIpRanges")]
        private InputList<string>? _loginIpRanges;

        /// <summary>
        /// List of acceptable IP ranges. Entries can be single IP addresses, IP address ranges, and CIDR subnets.
        /// </summary>
        public InputList<string> LoginIpRanges
        {
            get => _loginIpRanges ?? (_loginIpRanges = new InputList<string>());
            set => _loginIpRanges = value;
        }

        /// <summary>
        /// Number of recent passwords that new password must be distinct from.
        /// </summary>
        [Input("numDifferentPasswords")]
        public Input<int>? NumDifferentPasswords { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// Number of days after which users will be forced to change their password.
        /// </summary>
        [Input("passwordExpirationDays")]
        public Input<int>? PasswordExpirationDays { get; set; }

        public LoginSecurityState()
        {
        }
        public static new LoginSecurityState Empty => new LoginSecurityState();
    }
}
