/*
 * APIBuzonesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.example.*;
import com.example.models.*;
import com.example.exceptions.*;
import com.example.http.client.HttpClient;
import com.example.http.client.HttpContext;
import com.example.http.request.HttpRequest;
import com.example.http.response.HttpResponse;
import com.example.http.response.HttpStringResponse;
import com.example.http.client.APICallBack;
import com.example.controllers.syncwrapper.APICallBackCatcher;

public class ApplicationsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static ApplicationsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ApplicationsController class 
     */
    public static ApplicationsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new ApplicationsController();
            }
        }
        return instance;
    }

    /**
     * Crea un nuevo mensaje en los buzones de los usuarios(group) de la aplicación (iris2).
     * @param    token    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @param    contentType    Required parameter: Example: 
     * @return    Returns the CrearUnMensajeAAplicaciNResponse response from the API call 
     */
    public CrearUnMensajeAAplicaciNResponse createApplicationsIris2MessagesPost(
                final String token,
                final CrearUnMensajeAAplicaciNRequest body,
                final String contentType
    ) throws Throwable {
        APICallBackCatcher<CrearUnMensajeAAplicaciNResponse> callback = new APICallBackCatcher<CrearUnMensajeAAplicaciNResponse>();
        createApplicationsIris2MessagesPostAsync(token, body, contentType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Crea un nuevo mensaje en los buzones de los usuarios(group) de la aplicación (iris2).
     * @param    token    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @param    contentType    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createApplicationsIris2MessagesPostAsync(
                final String token,
                final CrearUnMensajeAAplicaciNRequest body,
                final String contentType,
                final APICallBack<CrearUnMensajeAAplicaciNResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/applications/iris2/messages");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5594434454963465112L;
            {
                    put( "token", token );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5134945889320733631L;
            {
                    put( "Content-Type", contentType );
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            CrearUnMensajeAAplicaciNResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CrearUnMensajeAAplicaciNResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Devuelve todas las aplicaciones que tienen mensajes.
     * @param    token    Required parameter: Example: 
     * @return    Returns the LeerAplicacionesResponse response from the API call 
     */
    public LeerAplicacionesResponse getApplicationsGet(
                final String token
    ) throws Throwable {
        APICallBackCatcher<LeerAplicacionesResponse> callback = new APICallBackCatcher<LeerAplicacionesResponse>();
        getApplicationsGetAsync(token, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Devuelve todas las aplicaciones que tienen mensajes.
     * @param    token    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getApplicationsGetAsync(
                final String token,
                final APICallBack<LeerAplicacionesResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/applications");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4924166375823645765L;
            {
                    put( "token", token );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5655637709813796484L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            LeerAplicacionesResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<LeerAplicacionesResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}