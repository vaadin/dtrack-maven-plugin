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

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.vaadin.dtrack.ApiCallback;
import com.vaadin.dtrack.ApiClient;
import com.vaadin.dtrack.ApiException;
import com.vaadin.dtrack.ApiResponse;
import com.vaadin.dtrack.Configuration;
import com.vaadin.dtrack.Pair;
import com.vaadin.dtrack.ProgressRequestBody;
import com.vaadin.dtrack.ProgressResponseBody;

public class CweApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public CweApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CweApi(ApiClient apiClient) {
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
     * Build call for getCwe
     * @param cweId The CWE ID of the CWE to retrieve (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCweCall(Integer cweId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/cwe/{cweId}"
            .replaceAll("\\{" + "cweId" + "\\}", apiClient.escapeString(cweId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call getCweValidateBeforeCall(Integer cweId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'cweId' is set
        if (cweId == null) {
            throw new ApiException("Missing the required parameter 'cweId' when calling getCwe(Async)");
        }
        
        com.squareup.okhttp.Call call = getCweCall(cweId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a specific CWE
     * 
     * @param cweId The CWE ID of the CWE to retrieve (required)
     * @return Cwe
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Cwe getCwe(Integer cweId) throws ApiException {
        ApiResponse<Cwe> resp = getCweWithHttpInfo(cweId);
        return resp.getData();
    }

    /**
     * Returns a specific CWE
     * 
     * @param cweId The CWE ID of the CWE to retrieve (required)
     * @return ApiResponse&lt;Cwe&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Cwe> getCweWithHttpInfo(Integer cweId) throws ApiException {
        com.squareup.okhttp.Call call = getCweValidateBeforeCall(cweId, null, null);
        Type localVarReturnType = new TypeToken<Cwe>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a specific CWE (asynchronously)
     * 
     * @param cweId The CWE ID of the CWE to retrieve (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCweAsync(Integer cweId, final ApiCallback<Cwe> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCweValidateBeforeCall(cweId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Cwe>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCwes
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCwesCall(String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/cwe";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pageNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageNumber", pageNumber));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (sortName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortName", sortName));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call getCwesValidateBeforeCall(String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getCwesCall(pageNumber, pageSize, offset, limit, sortName, sortOrder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a list of all CWEs
     * 
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @return List&lt;Cwe&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Cwe> getCwes(String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder) throws ApiException {
        ApiResponse<List<Cwe>> resp = getCwesWithHttpInfo(pageNumber, pageSize, offset, limit, sortName, sortOrder);
        return resp.getData();
    }

    /**
     * Returns a list of all CWEs
     * 
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @return ApiResponse&lt;List&lt;Cwe&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Cwe>> getCwesWithHttpInfo(String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder) throws ApiException {
        com.squareup.okhttp.Call call = getCwesValidateBeforeCall(pageNumber, pageSize, offset, limit, sortName, sortOrder, null, null);
        Type localVarReturnType = new TypeToken<List<Cwe>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of all CWEs (asynchronously)
     * 
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCwesAsync(String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder, final ApiCallback<List<Cwe>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCwesValidateBeforeCall(pageNumber, pageSize, offset, limit, sortName, sortOrder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Cwe>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
