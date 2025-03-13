/*
 * OWASP Dependency-Track
 * REST API of OWASP Dependency-Track
 *
 * OpenAPI spec version: 4.12.6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vaadin.dtrack.api;

import com.vaadin.dtrack.ApiCallback;
import com.vaadin.dtrack.ApiClient;
import com.vaadin.dtrack.ApiException;
import com.vaadin.dtrack.ApiResponse;
import com.vaadin.dtrack.Configuration;
import com.vaadin.dtrack.Pair;
import com.vaadin.dtrack.ProgressRequestBody;
import com.vaadin.dtrack.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BadgeApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public BadgeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BadgeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for getProjectPolicyViolationsBadge
     * @param uuid The UUID of the project to retrieve a badge for (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProjectPolicyViolationsBadgeCall(UUID uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/badge/violations/project/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/svg+xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "ApiKeyQueryAuth", "BearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProjectPolicyViolationsBadgeValidateBeforeCall(UUID uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getProjectPolicyViolationsBadge(Async)");
        }
        
        com.squareup.okhttp.Call call = getProjectPolicyViolationsBadgeCall(uuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a policy violations badge for a specific project
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to retrieve a badge for (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getProjectPolicyViolationsBadge(UUID uuid) throws ApiException {
        ApiResponse<String> resp = getProjectPolicyViolationsBadgeWithHttpInfo(uuid);
        return resp.getData();
    }

    /**
     * Returns a policy violations badge for a specific project
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to retrieve a badge for (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getProjectPolicyViolationsBadgeWithHttpInfo(UUID uuid) throws ApiException {
        com.squareup.okhttp.Call call = getProjectPolicyViolationsBadgeValidateBeforeCall(uuid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a policy violations badge for a specific project (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to retrieve a badge for (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProjectPolicyViolationsBadgeAsync(UUID uuid, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getProjectPolicyViolationsBadgeValidateBeforeCall(uuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProjectPolicyViolationsBadge1
     * @param name The name of the project to query on (required)
     * @param version The version of the project to query on (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProjectPolicyViolationsBadge1Call(String name, String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/badge/violations/project/{name}/{version}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/svg+xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "ApiKeyQueryAuth", "BearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProjectPolicyViolationsBadge1ValidateBeforeCall(String name, String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getProjectPolicyViolationsBadge1(Async)");
        }
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getProjectPolicyViolationsBadge1(Async)");
        }
        
        com.squareup.okhttp.Call call = getProjectPolicyViolationsBadge1Call(name, version, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a policy violations badge for a specific project
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param name The name of the project to query on (required)
     * @param version The version of the project to query on (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getProjectPolicyViolationsBadge1(String name, String version) throws ApiException {
        ApiResponse<String> resp = getProjectPolicyViolationsBadge1WithHttpInfo(name, version);
        return resp.getData();
    }

    /**
     * Returns a policy violations badge for a specific project
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param name The name of the project to query on (required)
     * @param version The version of the project to query on (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getProjectPolicyViolationsBadge1WithHttpInfo(String name, String version) throws ApiException {
        com.squareup.okhttp.Call call = getProjectPolicyViolationsBadge1ValidateBeforeCall(name, version, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a policy violations badge for a specific project (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param name The name of the project to query on (required)
     * @param version The version of the project to query on (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProjectPolicyViolationsBadge1Async(String name, String version, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getProjectPolicyViolationsBadge1ValidateBeforeCall(name, version, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProjectVulnerabilitiesBadge
     * @param uuid The UUID of the project to retrieve metrics for (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProjectVulnerabilitiesBadgeCall(UUID uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/badge/vulns/project/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/svg+xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "ApiKeyQueryAuth", "BearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProjectVulnerabilitiesBadgeValidateBeforeCall(UUID uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getProjectVulnerabilitiesBadge(Async)");
        }
        
        com.squareup.okhttp.Call call = getProjectVulnerabilitiesBadgeCall(uuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns current metrics for a specific project
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to retrieve metrics for (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getProjectVulnerabilitiesBadge(UUID uuid) throws ApiException {
        ApiResponse<String> resp = getProjectVulnerabilitiesBadgeWithHttpInfo(uuid);
        return resp.getData();
    }

    /**
     * Returns current metrics for a specific project
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to retrieve metrics for (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getProjectVulnerabilitiesBadgeWithHttpInfo(UUID uuid) throws ApiException {
        com.squareup.okhttp.Call call = getProjectVulnerabilitiesBadgeValidateBeforeCall(uuid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns current metrics for a specific project (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to retrieve metrics for (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProjectVulnerabilitiesBadgeAsync(UUID uuid, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getProjectVulnerabilitiesBadgeValidateBeforeCall(uuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProjectVulnerabilitiesBadge1
     * @param name The name of the project to query on (required)
     * @param version The version of the project to query on (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProjectVulnerabilitiesBadge1Call(String name, String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/badge/vulns/project/{name}/{version}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/svg+xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "ApiKeyQueryAuth", "BearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProjectVulnerabilitiesBadge1ValidateBeforeCall(String name, String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getProjectVulnerabilitiesBadge1(Async)");
        }
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getProjectVulnerabilitiesBadge1(Async)");
        }
        
        com.squareup.okhttp.Call call = getProjectVulnerabilitiesBadge1Call(name, version, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns current metrics for a specific project
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param name The name of the project to query on (required)
     * @param version The version of the project to query on (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getProjectVulnerabilitiesBadge1(String name, String version) throws ApiException {
        ApiResponse<String> resp = getProjectVulnerabilitiesBadge1WithHttpInfo(name, version);
        return resp.getData();
    }

    /**
     * Returns current metrics for a specific project
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param name The name of the project to query on (required)
     * @param version The version of the project to query on (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getProjectVulnerabilitiesBadge1WithHttpInfo(String name, String version) throws ApiException {
        com.squareup.okhttp.Call call = getProjectVulnerabilitiesBadge1ValidateBeforeCall(name, version, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns current metrics for a specific project (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_BADGES&lt;/strong&gt;&lt;/p&gt;
     * @param name The name of the project to query on (required)
     * @param version The version of the project to query on (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProjectVulnerabilitiesBadge1Async(String name, String version, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getProjectVulnerabilitiesBadge1ValidateBeforeCall(name, version, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
