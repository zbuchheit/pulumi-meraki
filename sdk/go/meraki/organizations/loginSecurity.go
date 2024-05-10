// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ## Import
//
// ```sh
// $ pulumi import meraki:organizations/loginSecurity:LoginSecurity example "organization_id"
// ```
type LoginSecurity struct {
	pulumi.CustomResourceState

	// Number of consecutive failed login attempts after which users' accounts will be locked.
	AccountLockoutAttempts pulumi.IntOutput `pulumi:"accountLockoutAttempts"`
	// Details for indicating whether organization will restrict access to API (but not Dashboard) to certain IP addresses.
	ApiAuthentication LoginSecurityApiAuthenticationOutput `pulumi:"apiAuthentication"`
	// Boolean indicating whether users' Dashboard accounts will be locked out after a specified number of consecutive failed login attempts.
	EnforceAccountLockout pulumi.BoolOutput `pulumi:"enforceAccountLockout"`
	// Boolean indicating whether users, when setting a new password, are forced to choose a new password that is different from any past passwords.
	EnforceDifferentPasswords pulumi.BoolOutput `pulumi:"enforceDifferentPasswords"`
	// Boolean indicating whether users will be logged out after being idle for the specified number of minutes.
	EnforceIdleTimeout pulumi.BoolOutput `pulumi:"enforceIdleTimeout"`
	// Boolean indicating whether organization will restrict access to Dashboard (including the API) from certain IP addresses.
	EnforceLoginIpRanges pulumi.BoolOutput `pulumi:"enforceLoginIpRanges"`
	// Boolean indicating whether users are forced to change their password every X number of days.
	EnforcePasswordExpiration pulumi.BoolOutput `pulumi:"enforcePasswordExpiration"`
	// Boolean indicating whether users will be forced to choose strong passwords for their accounts. Strong passwords are at least 8 characters that contain 3 of the following: number, uppercase letter, lowercase letter, and symbol
	EnforceStrongPasswords pulumi.BoolOutput `pulumi:"enforceStrongPasswords"`
	// Boolean indicating whether users in this organization will be required to use an extra verification code when logging in to Dashboard. This code will be sent to their mobile phone via SMS, or can be generated by the authenticator application.
	EnforceTwoFactorAuth pulumi.BoolOutput `pulumi:"enforceTwoFactorAuth"`
	// Number of minutes users can remain idle before being logged out of their accounts.
	IdleTimeoutMinutes pulumi.IntOutput `pulumi:"idleTimeoutMinutes"`
	// List of acceptable IP ranges. Entries can be single IP addresses, IP address ranges, and CIDR subnets.
	LoginIpRanges pulumi.StringArrayOutput `pulumi:"loginIpRanges"`
	// Number of recent passwords that new password must be distinct from.
	NumDifferentPasswords pulumi.IntOutput `pulumi:"numDifferentPasswords"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// Number of days after which users will be forced to change their password.
	PasswordExpirationDays pulumi.IntOutput `pulumi:"passwordExpirationDays"`
}

// NewLoginSecurity registers a new resource with the given unique name, arguments, and options.
func NewLoginSecurity(ctx *pulumi.Context,
	name string, args *LoginSecurityArgs, opts ...pulumi.ResourceOption) (*LoginSecurity, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoginSecurity
	err := ctx.RegisterResource("meraki:organizations/loginSecurity:LoginSecurity", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoginSecurity gets an existing LoginSecurity resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoginSecurity(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoginSecurityState, opts ...pulumi.ResourceOption) (*LoginSecurity, error) {
	var resource LoginSecurity
	err := ctx.ReadResource("meraki:organizations/loginSecurity:LoginSecurity", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoginSecurity resources.
type loginSecurityState struct {
	// Number of consecutive failed login attempts after which users' accounts will be locked.
	AccountLockoutAttempts *int `pulumi:"accountLockoutAttempts"`
	// Details for indicating whether organization will restrict access to API (but not Dashboard) to certain IP addresses.
	ApiAuthentication *LoginSecurityApiAuthentication `pulumi:"apiAuthentication"`
	// Boolean indicating whether users' Dashboard accounts will be locked out after a specified number of consecutive failed login attempts.
	EnforceAccountLockout *bool `pulumi:"enforceAccountLockout"`
	// Boolean indicating whether users, when setting a new password, are forced to choose a new password that is different from any past passwords.
	EnforceDifferentPasswords *bool `pulumi:"enforceDifferentPasswords"`
	// Boolean indicating whether users will be logged out after being idle for the specified number of minutes.
	EnforceIdleTimeout *bool `pulumi:"enforceIdleTimeout"`
	// Boolean indicating whether organization will restrict access to Dashboard (including the API) from certain IP addresses.
	EnforceLoginIpRanges *bool `pulumi:"enforceLoginIpRanges"`
	// Boolean indicating whether users are forced to change their password every X number of days.
	EnforcePasswordExpiration *bool `pulumi:"enforcePasswordExpiration"`
	// Boolean indicating whether users will be forced to choose strong passwords for their accounts. Strong passwords are at least 8 characters that contain 3 of the following: number, uppercase letter, lowercase letter, and symbol
	EnforceStrongPasswords *bool `pulumi:"enforceStrongPasswords"`
	// Boolean indicating whether users in this organization will be required to use an extra verification code when logging in to Dashboard. This code will be sent to their mobile phone via SMS, or can be generated by the authenticator application.
	EnforceTwoFactorAuth *bool `pulumi:"enforceTwoFactorAuth"`
	// Number of minutes users can remain idle before being logged out of their accounts.
	IdleTimeoutMinutes *int `pulumi:"idleTimeoutMinutes"`
	// List of acceptable IP ranges. Entries can be single IP addresses, IP address ranges, and CIDR subnets.
	LoginIpRanges []string `pulumi:"loginIpRanges"`
	// Number of recent passwords that new password must be distinct from.
	NumDifferentPasswords *int `pulumi:"numDifferentPasswords"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
	// Number of days after which users will be forced to change their password.
	PasswordExpirationDays *int `pulumi:"passwordExpirationDays"`
}

type LoginSecurityState struct {
	// Number of consecutive failed login attempts after which users' accounts will be locked.
	AccountLockoutAttempts pulumi.IntPtrInput
	// Details for indicating whether organization will restrict access to API (but not Dashboard) to certain IP addresses.
	ApiAuthentication LoginSecurityApiAuthenticationPtrInput
	// Boolean indicating whether users' Dashboard accounts will be locked out after a specified number of consecutive failed login attempts.
	EnforceAccountLockout pulumi.BoolPtrInput
	// Boolean indicating whether users, when setting a new password, are forced to choose a new password that is different from any past passwords.
	EnforceDifferentPasswords pulumi.BoolPtrInput
	// Boolean indicating whether users will be logged out after being idle for the specified number of minutes.
	EnforceIdleTimeout pulumi.BoolPtrInput
	// Boolean indicating whether organization will restrict access to Dashboard (including the API) from certain IP addresses.
	EnforceLoginIpRanges pulumi.BoolPtrInput
	// Boolean indicating whether users are forced to change their password every X number of days.
	EnforcePasswordExpiration pulumi.BoolPtrInput
	// Boolean indicating whether users will be forced to choose strong passwords for their accounts. Strong passwords are at least 8 characters that contain 3 of the following: number, uppercase letter, lowercase letter, and symbol
	EnforceStrongPasswords pulumi.BoolPtrInput
	// Boolean indicating whether users in this organization will be required to use an extra verification code when logging in to Dashboard. This code will be sent to their mobile phone via SMS, or can be generated by the authenticator application.
	EnforceTwoFactorAuth pulumi.BoolPtrInput
	// Number of minutes users can remain idle before being logged out of their accounts.
	IdleTimeoutMinutes pulumi.IntPtrInput
	// List of acceptable IP ranges. Entries can be single IP addresses, IP address ranges, and CIDR subnets.
	LoginIpRanges pulumi.StringArrayInput
	// Number of recent passwords that new password must be distinct from.
	NumDifferentPasswords pulumi.IntPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
	// Number of days after which users will be forced to change their password.
	PasswordExpirationDays pulumi.IntPtrInput
}

func (LoginSecurityState) ElementType() reflect.Type {
	return reflect.TypeOf((*loginSecurityState)(nil)).Elem()
}

type loginSecurityArgs struct {
	// Number of consecutive failed login attempts after which users' accounts will be locked.
	AccountLockoutAttempts *int `pulumi:"accountLockoutAttempts"`
	// Details for indicating whether organization will restrict access to API (but not Dashboard) to certain IP addresses.
	ApiAuthentication *LoginSecurityApiAuthentication `pulumi:"apiAuthentication"`
	// Boolean indicating whether users' Dashboard accounts will be locked out after a specified number of consecutive failed login attempts.
	EnforceAccountLockout *bool `pulumi:"enforceAccountLockout"`
	// Boolean indicating whether users, when setting a new password, are forced to choose a new password that is different from any past passwords.
	EnforceDifferentPasswords *bool `pulumi:"enforceDifferentPasswords"`
	// Boolean indicating whether users will be logged out after being idle for the specified number of minutes.
	EnforceIdleTimeout *bool `pulumi:"enforceIdleTimeout"`
	// Boolean indicating whether organization will restrict access to Dashboard (including the API) from certain IP addresses.
	EnforceLoginIpRanges *bool `pulumi:"enforceLoginIpRanges"`
	// Boolean indicating whether users are forced to change their password every X number of days.
	EnforcePasswordExpiration *bool `pulumi:"enforcePasswordExpiration"`
	// Boolean indicating whether users will be forced to choose strong passwords for their accounts. Strong passwords are at least 8 characters that contain 3 of the following: number, uppercase letter, lowercase letter, and symbol
	EnforceStrongPasswords *bool `pulumi:"enforceStrongPasswords"`
	// Boolean indicating whether users in this organization will be required to use an extra verification code when logging in to Dashboard. This code will be sent to their mobile phone via SMS, or can be generated by the authenticator application.
	EnforceTwoFactorAuth *bool `pulumi:"enforceTwoFactorAuth"`
	// Number of minutes users can remain idle before being logged out of their accounts.
	IdleTimeoutMinutes *int `pulumi:"idleTimeoutMinutes"`
	// List of acceptable IP ranges. Entries can be single IP addresses, IP address ranges, and CIDR subnets.
	LoginIpRanges []string `pulumi:"loginIpRanges"`
	// Number of recent passwords that new password must be distinct from.
	NumDifferentPasswords *int `pulumi:"numDifferentPasswords"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// Number of days after which users will be forced to change their password.
	PasswordExpirationDays *int `pulumi:"passwordExpirationDays"`
}

// The set of arguments for constructing a LoginSecurity resource.
type LoginSecurityArgs struct {
	// Number of consecutive failed login attempts after which users' accounts will be locked.
	AccountLockoutAttempts pulumi.IntPtrInput
	// Details for indicating whether organization will restrict access to API (but not Dashboard) to certain IP addresses.
	ApiAuthentication LoginSecurityApiAuthenticationPtrInput
	// Boolean indicating whether users' Dashboard accounts will be locked out after a specified number of consecutive failed login attempts.
	EnforceAccountLockout pulumi.BoolPtrInput
	// Boolean indicating whether users, when setting a new password, are forced to choose a new password that is different from any past passwords.
	EnforceDifferentPasswords pulumi.BoolPtrInput
	// Boolean indicating whether users will be logged out after being idle for the specified number of minutes.
	EnforceIdleTimeout pulumi.BoolPtrInput
	// Boolean indicating whether organization will restrict access to Dashboard (including the API) from certain IP addresses.
	EnforceLoginIpRanges pulumi.BoolPtrInput
	// Boolean indicating whether users are forced to change their password every X number of days.
	EnforcePasswordExpiration pulumi.BoolPtrInput
	// Boolean indicating whether users will be forced to choose strong passwords for their accounts. Strong passwords are at least 8 characters that contain 3 of the following: number, uppercase letter, lowercase letter, and symbol
	EnforceStrongPasswords pulumi.BoolPtrInput
	// Boolean indicating whether users in this organization will be required to use an extra verification code when logging in to Dashboard. This code will be sent to their mobile phone via SMS, or can be generated by the authenticator application.
	EnforceTwoFactorAuth pulumi.BoolPtrInput
	// Number of minutes users can remain idle before being logged out of their accounts.
	IdleTimeoutMinutes pulumi.IntPtrInput
	// List of acceptable IP ranges. Entries can be single IP addresses, IP address ranges, and CIDR subnets.
	LoginIpRanges pulumi.StringArrayInput
	// Number of recent passwords that new password must be distinct from.
	NumDifferentPasswords pulumi.IntPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
	// Number of days after which users will be forced to change their password.
	PasswordExpirationDays pulumi.IntPtrInput
}

func (LoginSecurityArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loginSecurityArgs)(nil)).Elem()
}

type LoginSecurityInput interface {
	pulumi.Input

	ToLoginSecurityOutput() LoginSecurityOutput
	ToLoginSecurityOutputWithContext(ctx context.Context) LoginSecurityOutput
}

func (*LoginSecurity) ElementType() reflect.Type {
	return reflect.TypeOf((**LoginSecurity)(nil)).Elem()
}

func (i *LoginSecurity) ToLoginSecurityOutput() LoginSecurityOutput {
	return i.ToLoginSecurityOutputWithContext(context.Background())
}

func (i *LoginSecurity) ToLoginSecurityOutputWithContext(ctx context.Context) LoginSecurityOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoginSecurityOutput)
}

// LoginSecurityArrayInput is an input type that accepts LoginSecurityArray and LoginSecurityArrayOutput values.
// You can construct a concrete instance of `LoginSecurityArrayInput` via:
//
//	LoginSecurityArray{ LoginSecurityArgs{...} }
type LoginSecurityArrayInput interface {
	pulumi.Input

	ToLoginSecurityArrayOutput() LoginSecurityArrayOutput
	ToLoginSecurityArrayOutputWithContext(context.Context) LoginSecurityArrayOutput
}

type LoginSecurityArray []LoginSecurityInput

func (LoginSecurityArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoginSecurity)(nil)).Elem()
}

func (i LoginSecurityArray) ToLoginSecurityArrayOutput() LoginSecurityArrayOutput {
	return i.ToLoginSecurityArrayOutputWithContext(context.Background())
}

func (i LoginSecurityArray) ToLoginSecurityArrayOutputWithContext(ctx context.Context) LoginSecurityArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoginSecurityArrayOutput)
}

// LoginSecurityMapInput is an input type that accepts LoginSecurityMap and LoginSecurityMapOutput values.
// You can construct a concrete instance of `LoginSecurityMapInput` via:
//
//	LoginSecurityMap{ "key": LoginSecurityArgs{...} }
type LoginSecurityMapInput interface {
	pulumi.Input

	ToLoginSecurityMapOutput() LoginSecurityMapOutput
	ToLoginSecurityMapOutputWithContext(context.Context) LoginSecurityMapOutput
}

type LoginSecurityMap map[string]LoginSecurityInput

func (LoginSecurityMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoginSecurity)(nil)).Elem()
}

func (i LoginSecurityMap) ToLoginSecurityMapOutput() LoginSecurityMapOutput {
	return i.ToLoginSecurityMapOutputWithContext(context.Background())
}

func (i LoginSecurityMap) ToLoginSecurityMapOutputWithContext(ctx context.Context) LoginSecurityMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoginSecurityMapOutput)
}

type LoginSecurityOutput struct{ *pulumi.OutputState }

func (LoginSecurityOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoginSecurity)(nil)).Elem()
}

func (o LoginSecurityOutput) ToLoginSecurityOutput() LoginSecurityOutput {
	return o
}

func (o LoginSecurityOutput) ToLoginSecurityOutputWithContext(ctx context.Context) LoginSecurityOutput {
	return o
}

// Number of consecutive failed login attempts after which users' accounts will be locked.
func (o LoginSecurityOutput) AccountLockoutAttempts() pulumi.IntOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.IntOutput { return v.AccountLockoutAttempts }).(pulumi.IntOutput)
}

// Details for indicating whether organization will restrict access to API (but not Dashboard) to certain IP addresses.
func (o LoginSecurityOutput) ApiAuthentication() LoginSecurityApiAuthenticationOutput {
	return o.ApplyT(func(v *LoginSecurity) LoginSecurityApiAuthenticationOutput { return v.ApiAuthentication }).(LoginSecurityApiAuthenticationOutput)
}

// Boolean indicating whether users' Dashboard accounts will be locked out after a specified number of consecutive failed login attempts.
func (o LoginSecurityOutput) EnforceAccountLockout() pulumi.BoolOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.BoolOutput { return v.EnforceAccountLockout }).(pulumi.BoolOutput)
}

// Boolean indicating whether users, when setting a new password, are forced to choose a new password that is different from any past passwords.
func (o LoginSecurityOutput) EnforceDifferentPasswords() pulumi.BoolOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.BoolOutput { return v.EnforceDifferentPasswords }).(pulumi.BoolOutput)
}

// Boolean indicating whether users will be logged out after being idle for the specified number of minutes.
func (o LoginSecurityOutput) EnforceIdleTimeout() pulumi.BoolOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.BoolOutput { return v.EnforceIdleTimeout }).(pulumi.BoolOutput)
}

// Boolean indicating whether organization will restrict access to Dashboard (including the API) from certain IP addresses.
func (o LoginSecurityOutput) EnforceLoginIpRanges() pulumi.BoolOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.BoolOutput { return v.EnforceLoginIpRanges }).(pulumi.BoolOutput)
}

// Boolean indicating whether users are forced to change their password every X number of days.
func (o LoginSecurityOutput) EnforcePasswordExpiration() pulumi.BoolOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.BoolOutput { return v.EnforcePasswordExpiration }).(pulumi.BoolOutput)
}

// Boolean indicating whether users will be forced to choose strong passwords for their accounts. Strong passwords are at least 8 characters that contain 3 of the following: number, uppercase letter, lowercase letter, and symbol
func (o LoginSecurityOutput) EnforceStrongPasswords() pulumi.BoolOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.BoolOutput { return v.EnforceStrongPasswords }).(pulumi.BoolOutput)
}

// Boolean indicating whether users in this organization will be required to use an extra verification code when logging in to Dashboard. This code will be sent to their mobile phone via SMS, or can be generated by the authenticator application.
func (o LoginSecurityOutput) EnforceTwoFactorAuth() pulumi.BoolOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.BoolOutput { return v.EnforceTwoFactorAuth }).(pulumi.BoolOutput)
}

// Number of minutes users can remain idle before being logged out of their accounts.
func (o LoginSecurityOutput) IdleTimeoutMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.IntOutput { return v.IdleTimeoutMinutes }).(pulumi.IntOutput)
}

// List of acceptable IP ranges. Entries can be single IP addresses, IP address ranges, and CIDR subnets.
func (o LoginSecurityOutput) LoginIpRanges() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.StringArrayOutput { return v.LoginIpRanges }).(pulumi.StringArrayOutput)
}

// Number of recent passwords that new password must be distinct from.
func (o LoginSecurityOutput) NumDifferentPasswords() pulumi.IntOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.IntOutput { return v.NumDifferentPasswords }).(pulumi.IntOutput)
}

// organizationId path parameter. Organization ID
func (o LoginSecurityOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// Number of days after which users will be forced to change their password.
func (o LoginSecurityOutput) PasswordExpirationDays() pulumi.IntOutput {
	return o.ApplyT(func(v *LoginSecurity) pulumi.IntOutput { return v.PasswordExpirationDays }).(pulumi.IntOutput)
}

type LoginSecurityArrayOutput struct{ *pulumi.OutputState }

func (LoginSecurityArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoginSecurity)(nil)).Elem()
}

func (o LoginSecurityArrayOutput) ToLoginSecurityArrayOutput() LoginSecurityArrayOutput {
	return o
}

func (o LoginSecurityArrayOutput) ToLoginSecurityArrayOutputWithContext(ctx context.Context) LoginSecurityArrayOutput {
	return o
}

func (o LoginSecurityArrayOutput) Index(i pulumi.IntInput) LoginSecurityOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoginSecurity {
		return vs[0].([]*LoginSecurity)[vs[1].(int)]
	}).(LoginSecurityOutput)
}

type LoginSecurityMapOutput struct{ *pulumi.OutputState }

func (LoginSecurityMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoginSecurity)(nil)).Elem()
}

func (o LoginSecurityMapOutput) ToLoginSecurityMapOutput() LoginSecurityMapOutput {
	return o
}

func (o LoginSecurityMapOutput) ToLoginSecurityMapOutputWithContext(ctx context.Context) LoginSecurityMapOutput {
	return o
}

func (o LoginSecurityMapOutput) MapIndex(k pulumi.StringInput) LoginSecurityOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoginSecurity {
		return vs[0].(map[string]*LoginSecurity)[vs[1].(string)]
	}).(LoginSecurityOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoginSecurityInput)(nil)).Elem(), &LoginSecurity{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoginSecurityArrayInput)(nil)).Elem(), LoginSecurityArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoginSecurityMapInput)(nil)).Elem(), LoginSecurityMap{})
	pulumi.RegisterOutputType(LoginSecurityOutput{})
	pulumi.RegisterOutputType(LoginSecurityArrayOutput{})
	pulumi.RegisterOutputType(LoginSecurityMapOutput{})
}
