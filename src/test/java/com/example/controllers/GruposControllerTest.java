/*
 * APIBuzonesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.models.*;
import com.example.exceptions.*;
import com.example.APIHelper;
import com.example.DateTimeHelper;
import com.example.Configuration;
import com.example.testing.TestHelper;
import com.example.controllers.GruposController;

import com.fasterxml.jackson.core.type.TypeReference;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class GruposControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static GruposController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getGrupos();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Crea un nuevo mensaje en los buzones de los usuarios(group) de la aplicación (iris2).
     * @throws Throwable
     */
    @Test
    public void testCrearUnMensajeAlGrupoPorNombre1() throws Throwable {
        // Parameters for the API call
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTM2MTI1OTAsInN0ciI6InN0ciIsImludCI6MSwiaXNzIjoicmVkeXNlci5jb20iLCJib29sIjp0cnVlfQ.f3t0DAv5eqd47UBsnQ3e4AZvnup9vSlvZB-iBjvegIo";
        CrearUnMensajeAlGrupoPorNombreRequest body = APIHelper.deserialize("
{

  \"leido\": false,

  \"borrado\": false,

  \"data\":{

    \"type\" : \"recogidas_pendientes\",

    \"numero\" : 7

  }

}", new TypeReference<CrearUnMensajeAlGrupoPorNombreRequest>(){});
        String contentType = "application/json";

        // Set callback and perform API call
        CrearUnMensajeAlGrupoPorNombreResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.createGroups5a564715825d4f0e94946c1aApplicationsIris2MessagesPost2(token, body, contentType);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "\n{\n\n\n\"data\":\n\n        {\n\n            \"id\": \"123456\",\n\n            \"leido\": false,\n\n            \"borrado\": false,\n\n            \"fecha\": \"2017-10-20T15:59:45.000Z\",\n\n            \"data\": {\n\n                \"type\": \"incidencias_pregunta\",\n\n                \"referencia\": \"123456789\"\n\n            }\n\n        }\n\n}\n", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * Modifica uno o variso de los campos.
     * @throws Throwable
     */
    @Test
    public void testModificarUnGrupoPorNombre1() throws Throwable {
        // Parameters for the API call
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";
        ModificarUnGrupoPorNombreRequest body = APIHelper.deserialize("
{

    \"nombre\": \"Informática\",

    \"aplicacion\": \"iris2\",

    \"usuarios\": [

        \"JUANDE.MC\",

        \"SCORDOBA\"

    ]

}", new TypeReference<ModificarUnGrupoPorNombreRequest>(){});
        String contentType = "application/json";

        // Set callback and perform API call
        ModificarUnGrupoPorNombreResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.updateGroupsApplicationsIris2GroupnameTodosPatch(token, body, contentType);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "\n{\n\n    \"data\": {\n\n        \"id\": \"123456\",\n\n        \"leido\": true,\n\n        \"borrado\": false,\n\n        \"fecha\": \"2017-10-20T15:59:45.000Z\",\n\n        \"data\": {\n\n            \"type\": \"incidencias_pregunta\",\n\n            \"referencia\": \"123456789\"\n\n        }\n\n    }\n\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * Devuelve el grupo (123456).
     * @throws Throwable
     */
    @Test
    public void testLeerUnGrupoPorNombre1() throws Throwable {
        // Parameters for the API call
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";

        // Set callback and perform API call
        LeerUnGrupoPorNombreResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getGroupsApplicationsIris2GroupnameTodosGet(token);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "\n{\n\n    \"data\":{\n\n        \"id\": \"123456\",\n\n    \"leido\": false,\n\n    \"borrado\": false,\n\n    \"fecha\": \"2017-10-20T15:59:45.000Z\",\n\n    \"data\": {\n\n        \"type\": \"incidencias_pregunta\",\n\n        \"referencia\": \"123456789\"\n\n    }\n\n    }\n\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * Modifica uno o variso de los campos.
     * @throws Throwable
     */
    @Test
    public void testModificarUnGrupo1() throws Throwable {
        // Parameters for the API call
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";
        ModificarUnGrupoRequest body = APIHelper.deserialize("
{

    \"nombre\": \"Informática\",

    \"aplicacion\": \"iris2\",

    \"usuarios\": [

        \"JUANDE.MC\",

        \"SCORDOBA\"

    ]

}", new TypeReference<ModificarUnGrupoRequest>(){});
        String contentType = "application/json";

        // Set callback and perform API call
        ModificarUnGrupoResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.updateGroups5a564715825d4f0e94946c1aPatch(token, body, contentType);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "\n{\n\n    \"data\": {\n\n        \"id\": \"123456\",\n\n        \"leido\": true,\n\n        \"borrado\": false,\n\n        \"fecha\": \"2017-10-20T15:59:45.000Z\",\n\n        \"data\": {\n\n            \"type\": \"incidencias_pregunta\",\n\n            \"referencia\": \"123456789\"\n\n        }\n\n    }\n\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * 
Devuelve todos los grupos de la aplicación. Acepta parametros en la url:


skip: se salta ese número de documentos


limit: número documentos máximo que devolverá
     * @throws Throwable
     */
    @Test
    public void testLeerGruposDeUnaAplicacion1() throws Throwable {
        // Parameters for the API call
        boolean borrado = false;
        DateTime fecha = DateTimeHelper.fromRfc8601DateTime("2017-11-15");
        int limit = 20;
        int skip = 0;
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";
        String contentType = "application/json";

        // Set callback and perform API call
        LeerGruposDeUnaAplicacionResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getGroupsApplicationsIris2Get(borrado, fecha, limit, skip, token, contentType);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "\n{\n\n    \"data\": [\n\n        {\n\n            \"id\": \"123456\",\n\n            \"leido\": false,\n\n            \"borrado\": false,\n\n            \"fecha\": \"2017-10-20T15:59:45.000Z\",\n\n            \"data\": {\n\n                \"type\": \"incidencias_pregunta\",\n\n                \"referencia\": \"123456789\"\n\n            }\n\n        },\n\n        {\n\n            \"id\": \"123457\",\n\n            \"leido\": false,\n\n            \"borrado\": false,\n\n            \"fecha\": \"2017-10-20T16:59:45.000Z\",\n\n            \"data\": {\n\n                \"type\": \"incidencias_pregunta\",\n\n                \"referencia\": \"123456789\"\n\n            }\n\n        }\n\n    ]\n\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * Devuelve el grupo (123456).
     * @throws Throwable
     */
    @Test
    public void testLeerUnGrupo1() throws Throwable {
        // Parameters for the API call
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";

        // Set callback and perform API call
        LeerUnGrupoResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getGroups5a564715825d4f0e94946c1aGet(token);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "\n{\n\n    \"data\":{\n\n        \"id\": \"123456\",\n\n    \"leido\": false,\n\n    \"borrado\": false,\n\n    \"fecha\": \"2017-10-20T15:59:45.000Z\",\n\n    \"data\": {\n\n        \"type\": \"incidencias_pregunta\",\n\n        \"referencia\": \"123456789\"\n\n    }\n\n    }\n\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * Crea un nuevo grupo.
     * @throws Throwable
     */
    @Test
    public void testCrearUnGrupo1() throws Throwable {
        // Parameters for the API call
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTc5Mzk5NDd9.-pLDemUYmYPpjG5CZ7VI7UUBcC8mC_KAbEyNpzHsTMw";
        CrearUnGrupoRequest body = APIHelper.deserialize("
{

    \"nombre\": \"Informática\",

    \"aplicacion\": \"iris2\",

    \"usuarios\":[\"JUANDE.MC\", \"SCORDOBA\"]

}", new TypeReference<CrearUnGrupoRequest>(){});
        String contentType = "application/json";

        // Set callback and perform API call
        CrearUnGrupoResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.createGroupsPost(token, body, contentType);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "\n{\n\n\n\"data\":\n\n        {\n\n            \"id\": \"123456\",\n\n            \"leido\": false,\n\n            \"borrado\": false,\n\n            \"fecha\": \"2017-10-20T15:59:45.000Z\",\n\n            \"data\": {\n\n                \"type\": \"incidencias_pregunta\",\n\n                \"referencia\": \"123456789\"\n\n            }\n\n        }\n\n}\n", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * 
Devuelve todos los grupos. Acepta parametros en la url:


skip: se salta ese número de documentos


limit: número documentos máximo que devolverá
     * @throws Throwable
     */
    @Test
    public void testLeerGrupos1() throws Throwable {
        // Parameters for the API call
        boolean borrado = false;
        DateTime fecha = DateTimeHelper.fromRfc8601DateTime("2017-11-15");
        int limit = 20;
        int skip = 0;
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";
        String contentType = "application/json";

        // Set callback and perform API call
        LeerGruposResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getGroupsGet(borrado, fecha, limit, skip, token, contentType);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "\n{\n\n    \"data\": [\n\n        {\n\n            \"id\": \"123456\",\n\n            \"leido\": false,\n\n            \"borrado\": false,\n\n            \"fecha\": \"2017-10-20T15:59:45.000Z\",\n\n            \"data\": {\n\n                \"type\": \"incidencias_pregunta\",\n\n                \"referencia\": \"123456789\"\n\n            }\n\n        },\n\n        {\n\n            \"id\": \"123457\",\n\n            \"leido\": false,\n\n            \"borrado\": false,\n\n            \"fecha\": \"2017-10-20T16:59:45.000Z\",\n\n            \"data\": {\n\n                \"type\": \"incidencias_pregunta\",\n\n                \"referencia\": \"123456789\"\n\n            }\n\n        }\n\n    ]\n\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}
