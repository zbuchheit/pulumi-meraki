// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetApiRequestsItemResult
    {
        /// <summary>
        /// Database ID for the admin user who made the API request.
        /// </summary>
        public readonly string AdminId;
        /// <summary>
        /// The host which the API request was directed at.
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// HTTP method used in the API request.
        /// </summary>
        public readonly string Method;
        /// <summary>
        /// Operation ID for the endpoint.
        /// </summary>
        public readonly string OperationId;
        /// <summary>
        /// The API request path.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// The query string sent with the API request.
        /// </summary>
        public readonly string QueryString;
        /// <summary>
        /// API request response code.
        /// </summary>
        public readonly int ResponseCode;
        /// <summary>
        /// Public IP address from which the API request was made.
        /// </summary>
        public readonly string SourceIp;
        /// <summary>
        /// Timestamp, in iso8601 format, indicating when the API request was made.
        /// </summary>
        public readonly string Ts;
        /// <summary>
        /// The API request user agent.
        /// </summary>
        public readonly string UserAgent;
        /// <summary>
        /// API version of the endpoint.
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetApiRequestsItemResult(
            string adminId,

            string host,

            string method,

            string operationId,

            string path,

            string queryString,

            int responseCode,

            string sourceIp,

            string ts,

            string userAgent,

            int version)
        {
            AdminId = adminId;
            Host = host;
            Method = method;
            OperationId = operationId;
            Path = path;
            QueryString = queryString;
            ResponseCode = responseCode;
            SourceIp = sourceIp;
            Ts = ts;
            UserAgent = userAgent;
            Version = version;
        }
    }
}