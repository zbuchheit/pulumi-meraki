// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("meraki");

/**
 * Cisco Meraki base URL, FQDN or IP. If not set, it uses the MERAKI_BASE_URL environment variable. Default is
 * (https://api.meraki.com/)
 */
export declare const merakiBaseUrl: string | undefined;
Object.defineProperty(exports, "merakiBaseUrl", {
    get() {
        return __config.get("merakiBaseUrl");
    },
    enumerable: true,
});

/**
 * Cisco Meraki merakiDashboardApiKey to authenticate. If not set, it uses the MERAKI_DASHBOARD_API_KEY environment
 * variable.
 */
export declare const merakiDashboardApiKey: string | undefined;
Object.defineProperty(exports, "merakiDashboardApiKey", {
    get() {
        return __config.get("merakiDashboardApiKey");
    },
    enumerable: true,
});

/**
 * Flag for Cisco Meraki to enable debugging. If not set, it uses the MERAKI_DEBUG environment variable defaults to
 * `false`.
 */
export declare const merakiDebug: string | undefined;
Object.defineProperty(exports, "merakiDebug", {
    get() {
        return __config.get("merakiDebug");
    },
    enumerable: true,
});

/**
 * Flag requests per second allowed for client. Default is (10)
 */
export declare const merakiRequestsPerSecond: number | undefined;
Object.defineProperty(exports, "merakiRequestsPerSecond", {
    get() {
        return __config.getObject<number>("merakiRequestsPerSecond");
    },
    enumerable: true,
});

