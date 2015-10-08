/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.resourceflattening;

import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;
import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import java.util.List;
import java.util.Map;
import fixtures.resourceflattening.models.ResourceCollection;
import fixtures.resourceflattening.models.Error;
import fixtures.resourceflattening.models.CloudError;
import fixtures.resourceflattening.models.Resource;
import fixtures.resourceflattening.models.FlattenedProduct;

/**
 * Initializes a new instance of the AutoRestResourceFlatteningTestService class.
 */
public class AutoRestResourceFlatteningTestServiceImpl extends ServiceClient implements AutoRestResourceFlatteningTestService {
    private AutoRestResourceFlatteningTestServiceService service;
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    private ServiceClientCredentials credentials;

    /**
     * Gets The management credentials for Azure.
     *
     * @return the credentials value.
     */
    public ServiceClientCredentials getCredentials() {
        return this.credentials;
    }

    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout for Long Running Operations.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int getLongRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout for Long Running Operations.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    public void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     */
    public AutoRestResourceFlatteningTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestResourceFlatteningTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param restAdapterBuilder the builder for building up a {@link RestAdapter}
     */
    public AutoRestResourceFlatteningTestServiceImpl(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        if (this.credentials != null)
        {
            this.credentials.applyCredentialsFilter(this);
        }
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
        service = restAdapter.create(AutoRestResourceFlatteningTestServiceService.class);
    }

    /**
     * Put External Resource as an Array
     *
     * @param resourceArray External Resource as an Array to put
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putArray(List<Resource> resourceArray) throws ServiceException {
        try {
            ServiceResponse<Void> response = putArrayDelegate(service.putArray(resourceArray, this.getAcceptLanguage()), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putArrayDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put External Resource as an Array
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putArrayAsync(List<Resource> resourceArray, final ServiceCallback<Void> serviceCallback) {
        service.putArrayAsync(resourceArray, this.getAcceptLanguage(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putArrayDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putArrayDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get External Resource as an Array
     *
     * @return the List&lt;FlattenedProduct&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public List<FlattenedProduct> getArray() throws ServiceException {
        try {
            ServiceResponse<List<FlattenedProduct>> response = getArrayDelegate(service.getArray(this.getAcceptLanguage()), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<List<FlattenedProduct>> response = getArrayDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get External Resource as an Array
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getArrayAsync(final ServiceCallback<List<FlattenedProduct>> serviceCallback) {
        service.getArrayAsync(this.getAcceptLanguage(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getArrayDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<List<FlattenedProduct>> getArrayDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<List<FlattenedProduct>>()
                .register(200, new TypeToken<List<FlattenedProduct>>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put External Resource as a Dictionary
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putDictionary(Map<String, FlattenedProduct> resourceDictionary) throws ServiceException {
        try {
            ServiceResponse<Void> response = putDictionaryDelegate(service.putDictionary(resourceDictionary, this.getAcceptLanguage()), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putDictionaryDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put External Resource as a Dictionary
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary, final ServiceCallback<Void> serviceCallback) {
        service.putDictionaryAsync(resourceDictionary, this.getAcceptLanguage(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putDictionaryDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putDictionaryDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get External Resource as a Dictionary
     *
     * @return the Map&lt;String, FlattenedProduct&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Map<String, FlattenedProduct> getDictionary() throws ServiceException {
        try {
            ServiceResponse<Map<String, FlattenedProduct>> response = getDictionaryDelegate(service.getDictionary(this.getAcceptLanguage()), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Map<String, FlattenedProduct>> response = getDictionaryDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get External Resource as a Dictionary
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getDictionaryAsync(final ServiceCallback<Map<String, FlattenedProduct>> serviceCallback) {
        service.getDictionaryAsync(this.getAcceptLanguage(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getDictionaryDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Map<String, FlattenedProduct>> getDictionaryDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Map<String, FlattenedProduct>>()
                .register(200, new TypeToken<Map<String, FlattenedProduct>>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put External Resource as a ResourceCollection
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putResourceCollection(ResourceCollection resourceComplexObject) throws ServiceException {
        try {
            ServiceResponse<Void> response = putResourceCollectionDelegate(service.putResourceCollection(resourceComplexObject, this.getAcceptLanguage()), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putResourceCollectionDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put External Resource as a ResourceCollection
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putResourceCollectionAsync(ResourceCollection resourceComplexObject, final ServiceCallback<Void> serviceCallback) {
        service.putResourceCollectionAsync(resourceComplexObject, this.getAcceptLanguage(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putResourceCollectionDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putResourceCollectionDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get External Resource as a ResourceCollection
     *
     * @return the ResourceCollection object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ResourceCollection getResourceCollection() throws ServiceException {
        try {
            ServiceResponse<ResourceCollection> response = getResourceCollectionDelegate(service.getResourceCollection(this.getAcceptLanguage()), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<ResourceCollection> response = getResourceCollectionDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get External Resource as a ResourceCollection
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getResourceCollectionAsync(final ServiceCallback<ResourceCollection> serviceCallback) {
        service.getResourceCollectionAsync(this.getAcceptLanguage(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getResourceCollectionDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<ResourceCollection> getResourceCollectionDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<ResourceCollection>()
                .register(200, new TypeToken<ResourceCollection>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, error);
    }

}