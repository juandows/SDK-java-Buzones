# Getting started

Buzones para envios de mensajes en Redyser

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

## How to Use

The following section explains how to use the APIBuzones library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *APIBuzonesLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

Clicking the ``` Add ``` button will open a dialog where you need to specify APIBuzones in ``` Group Id ``` and APIBuzonesLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=API%20Buzones-Java&workspaceName=APIBuzones&projectName=APIBuzonesLib&rootNamespace=com.example)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *APIBuzonesLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### 

API client can be initialized as following.

```java

APIBuzonesClient client = new APIBuzonesClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [MessagesController](#messages_controller)
* [GruposController](#grupos_controller)
* [BoxesController](#boxes_controller)
* [ApplicationsController](#applications_controller)

## <a name="messages_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.MessagesController") MessagesController

### Get singleton instance

The singleton instance of the ``` MessagesController ``` class can be accessed from the API Client.

```java
MessagesController messages = client.getMessages();
```

### <a name="get_unnammed_endpoint_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MessagesController.getUnnammedEndpointGetAsync") getUnnammedEndpointGetAsync

> *Tags:*  ``` Skips Authentication ``` 

> TODO: Add Description


```java
void getUnnammedEndpointGetAsync(final APICallBack<Object> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
messages.getUnnammedEndpointGetAsync(new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_applications_iris2_boxes_juande_mc_messages5a0d6278c1371500112e5dde_patch_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MessagesController.updateApplicationsIris2BoxesJuandeMcMessages5a0d6278c1371500112e5ddePatchAsync") updateApplicationsIris2BoxesJuandeMcMessages5a0d6278c1371500112e5ddePatchAsync

> *Tags:*  ``` Skips Authentication ``` 

> Modifica uno o variso de los campos: borrado, leido o consultado.


```java
void updateApplicationsIris2BoxesJuandeMcMessages5a0d6278c1371500112e5ddePatchAsync(
        final String token,
        final ModificarUnMensajeLeidoBorradoRequest body,
        final String contentType,
        final APICallBack<ModificarUnMensajeLeidoBorradoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiJ1c2VyLl9pZCIsInVzZXJuYW1lIjoidXNlci51c2VybmFtZSIsImFkbWluIjoidXNlci5hZG1pbiIsImlhdCI6MTUxMzg0NTg2MywiZXhwIjoxNTE0NDUwNjYzLCJpc3MiOiJyZWR5c2VyLmNvbSIsInN1YiI6InVzZXJJbmZvIn0.tZTpGJa9o0jsjxJNeuiREquYDiskr3dkfCDPpsewwk8";
    String bodyValue = "\n{\n\n    \"leido\": true,\n\n    \"borrado\": false\n\n}";
    ModificarUnMensajeLeidoBorradoRequest body = mapper.readValue(bodyValue,new TypeReference<ModificarUnMensajeLeidoBorradoRequest> (){});
    String contentType = "application/json";
    // Invoking the API call with sample inputs
    messages.updateApplicationsIris2BoxesJuandeMcMessages5a0d6278c1371500112e5ddePatchAsync(token, body, contentType, new APICallBack<ModificarUnMensajeLeidoBorradoResponse>() {
        public void onSuccess(HttpContext context, ModificarUnMensajeLeidoBorradoResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_applications_iris2_boxes_juande_mc_messages5a0d6278c1371500112e5dde_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MessagesController.getApplicationsIris2BoxesJuandeMcMessages5a0d6278c1371500112e5ddeGetAsync") getApplicationsIris2BoxesJuandeMcMessages5a0d6278c1371500112e5ddeGetAsync

> *Tags:*  ``` Skips Authentication ``` 

> Devuelve el mensaje (123456) del buzón (juande.mc) de la aplicación (iris2).


```java
void getApplicationsIris2BoxesJuandeMcMessages5a0d6278c1371500112e5ddeGetAsync(
        final String token,
        final APICallBack<LeerUnMensajeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiJ1c2VyLl9pZCIsInVzZXJuYW1lIjoidXNlci51c2VybmFtZSIsImFkbWluIjoidXNlci5hZG1pbiIsImlhdCI6MTUxMzg0NTg2MywiZXhwIjoxNTE0NDUwNjYzLCJpc3MiOiJyZWR5c2VyLmNvbSIsInN1YiI6InVzZXJJbmZvIn0.tZTpGJa9o0jsjxJNeuiREquYDiskr3dkfCDPpsewwk8";
// Invoking the API call with sample inputs
messages.getApplicationsIris2BoxesJuandeMcMessages5a0d6278c1371500112e5ddeGetAsync(token, new APICallBack<LeerUnMensajeResponse>() {
    public void onSuccess(HttpContext context, LeerUnMensajeResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_applications_iris2_boxes_juandemc_messages_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MessagesController.createApplicationsIris2BoxesJUANDEMCMessagesPostAsync") createApplicationsIris2BoxesJUANDEMCMessagesPostAsync

> *Tags:*  ``` Skips Authentication ``` 

> Crea un nuevo mensaje en el buzón (juande.mc) de la aplicación (iris2).


```java
void createApplicationsIris2BoxesJUANDEMCMessagesPostAsync(
        final String token,
        final CrearUnMensajeRequest body,
        final String contentType,
        final APICallBack<CrearUnMensajeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTg2MDM2NjF9.z_F1iok_-d4RTtjoGzUYFYC1V7DTtP339nofkaA_Y7Y";
    String bodyValue = "\n{\n\n    \"leido\": false,\n\n    \"borrado\": false,\n\n    \"data\":{\n\n        \"type\" : \"url\",\n\n        \"url\" : \"http://www.redyser.com\"\n\n    },\n\n    \"expireAt\": \"2018-03-12T08:05:57.982Z\"\n\n}";
    CrearUnMensajeRequest body = mapper.readValue(bodyValue,new TypeReference<CrearUnMensajeRequest> (){});
    String contentType = "application/json";
    // Invoking the API call with sample inputs
    messages.createApplicationsIris2BoxesJUANDEMCMessagesPostAsync(token, body, contentType, new APICallBack<CrearUnMensajeResponse>() {
        public void onSuccess(HttpContext context, CrearUnMensajeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_applications_iris2_boxes_juandemc_messages_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MessagesController.getApplicationsIris2BoxesJUANDEMCMessagesGetAsync") getApplicationsIris2BoxesJUANDEMCMessagesGetAsync

> *Tags:*  ``` Skips Authentication ``` 

> 
> Devuelve todos los mensajes del buzón (juande.mc) de la aplicación (iris2). Acepta parametros en la url:
> 
> 
> borrado: true/false
> 
> 
> leido: true/false
> 
> 
> fecha: mensajes desde esa fecha (ej.-2017-01-21)
> 
> 
> skip: se salta ese número de documentos
> 
> 
> limit: número documentos máximo que devolverá
> 
> 
> order: (fecha/-fecha), ordena por ese campo


```java
void getApplicationsIris2BoxesJUANDEMCMessagesGetAsync(
        final boolean borrado,
        final DateTime fecha,
        final int limit,
        final int skip,
        final String order,
        final String token,
        final String contentType,
        final APICallBack<LeerMensajesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| borrado |  ``` Required ```  | TODO: Add a parameter description |
| fecha |  ``` Required ```  | TODO: Add a parameter description |
| limit |  ``` Required ```  | TODO: Add a parameter description |
| skip |  ``` Required ```  | TODO: Add a parameter description |
| order |  ``` Required ```  | TODO: Add a parameter description |
| token |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
boolean borrado = false;
DateTime fecha = 2017-11-15;
int limit = 20;
int skip = 0;
String order = "-fecha";
String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTgwNzg2MjF9.P1Jry3Mu1g4xaHhUsE7cYtTkczeg5mup3E5uKPUP0Ps";
String contentType = "application/json";
// Invoking the API call with sample inputs
messages.getApplicationsIris2BoxesJUANDEMCMessagesGetAsync(borrado, fecha, limit, skip, order, token, contentType, new APICallBack<LeerMensajesResponse>() {
    public void onSuccess(HttpContext context, LeerMensajesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="grupos_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.GruposController") GruposController

### Get singleton instance

The singleton instance of the ``` GruposController ``` class can be accessed from the API Client.

```java
GruposController grupos = client.getGrupos();
```

### <a name="create_groups5a564715825d4f0e94946c1a_applications_iris2_messages_post2_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GruposController.createGroups5a564715825d4f0e94946c1aApplicationsIris2MessagesPost2Async") createGroups5a564715825d4f0e94946c1aApplicationsIris2MessagesPost2Async

> *Tags:*  ``` Skips Authentication ``` 

> Crea un nuevo mensaje en los buzones de los usuarios(group) de la aplicación (iris2).


```java
void createGroups5a564715825d4f0e94946c1aApplicationsIris2MessagesPost2Async(
        final String token,
        final CrearUnMensajeAlGrupoPorNombreRequest body,
        final String contentType,
        final APICallBack<CrearUnMensajeAlGrupoPorNombreResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTM2MTI1OTAsInN0ciI6InN0ciIsImludCI6MSwiaXNzIjoicmVkeXNlci5jb20iLCJib29sIjp0cnVlfQ.f3t0DAv5eqd47UBsnQ3e4AZvnup9vSlvZB-iBjvegIo";
    String bodyValue = "\n{\n\n  \"leido\": false,\n\n  \"borrado\": false,\n\n  \"data\":{\n\n    \"type\" : \"recogidas_pendientes\",\n\n    \"numero\" : 7\n\n  }\n\n}";
    CrearUnMensajeAlGrupoPorNombreRequest body = mapper.readValue(bodyValue,new TypeReference<CrearUnMensajeAlGrupoPorNombreRequest> (){});
    String contentType = "application/json";
    // Invoking the API call with sample inputs
    grupos.createGroups5a564715825d4f0e94946c1aApplicationsIris2MessagesPost2Async(token, body, contentType, new APICallBack<CrearUnMensajeAlGrupoPorNombreResponse>() {
        public void onSuccess(HttpContext context, CrearUnMensajeAlGrupoPorNombreResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_groups_applications_iris2_groupname_todos_patch_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GruposController.updateGroupsApplicationsIris2GroupnameTodosPatchAsync") updateGroupsApplicationsIris2GroupnameTodosPatchAsync

> *Tags:*  ``` Skips Authentication ``` 

> Modifica uno o variso de los campos.


```java
void updateGroupsApplicationsIris2GroupnameTodosPatchAsync(
        final String token,
        final ModificarUnGrupoPorNombreRequest body,
        final String contentType,
        final APICallBack<ModificarUnGrupoPorNombreResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";
    String bodyValue = "\n{\n\n    \"nombre\": \"Informática\",\n\n    \"aplicacion\": \"iris2\",\n\n    \"usuarios\": [\n\n        \"JUANDE.MC\",\n\n        \"SCORDOBA\"\n\n    ]\n\n}";
    ModificarUnGrupoPorNombreRequest body = mapper.readValue(bodyValue,new TypeReference<ModificarUnGrupoPorNombreRequest> (){});
    String contentType = "application/json";
    // Invoking the API call with sample inputs
    grupos.updateGroupsApplicationsIris2GroupnameTodosPatchAsync(token, body, contentType, new APICallBack<ModificarUnGrupoPorNombreResponse>() {
        public void onSuccess(HttpContext context, ModificarUnGrupoPorNombreResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_groups_applications_iris2_groupname_todos_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GruposController.getGroupsApplicationsIris2GroupnameTodosGetAsync") getGroupsApplicationsIris2GroupnameTodosGetAsync

> *Tags:*  ``` Skips Authentication ``` 

> Devuelve el grupo (123456).


```java
void getGroupsApplicationsIris2GroupnameTodosGetAsync(
        final String token,
        final APICallBack<LeerUnGrupoPorNombreResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";
// Invoking the API call with sample inputs
grupos.getGroupsApplicationsIris2GroupnameTodosGetAsync(token, new APICallBack<LeerUnGrupoPorNombreResponse>() {
    public void onSuccess(HttpContext context, LeerUnGrupoPorNombreResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_groups5a564715825d4f0e94946c1a_patch_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GruposController.updateGroups5a564715825d4f0e94946c1aPatchAsync") updateGroups5a564715825d4f0e94946c1aPatchAsync

> *Tags:*  ``` Skips Authentication ``` 

> Modifica uno o variso de los campos.


```java
void updateGroups5a564715825d4f0e94946c1aPatchAsync(
        final String token,
        final ModificarUnGrupoRequest body,
        final String contentType,
        final APICallBack<ModificarUnGrupoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";
    String bodyValue = "\n{\n\n    \"nombre\": \"Informática\",\n\n    \"aplicacion\": \"iris2\",\n\n    \"usuarios\": [\n\n        \"JUANDE.MC\",\n\n        \"SCORDOBA\"\n\n    ]\n\n}";
    ModificarUnGrupoRequest body = mapper.readValue(bodyValue,new TypeReference<ModificarUnGrupoRequest> (){});
    String contentType = "application/json";
    // Invoking the API call with sample inputs
    grupos.updateGroups5a564715825d4f0e94946c1aPatchAsync(token, body, contentType, new APICallBack<ModificarUnGrupoResponse>() {
        public void onSuccess(HttpContext context, ModificarUnGrupoResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_groups_applications_iris2_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GruposController.getGroupsApplicationsIris2GetAsync") getGroupsApplicationsIris2GetAsync

> *Tags:*  ``` Skips Authentication ``` 

> 
> Devuelve todos los grupos de la aplicación. Acepta parametros en la url:
> 
> 
> skip: se salta ese número de documentos
> 
> 
> limit: número documentos máximo que devolverá


```java
void getGroupsApplicationsIris2GetAsync(
        final boolean borrado,
        final DateTime fecha,
        final int limit,
        final int skip,
        final String token,
        final String contentType,
        final APICallBack<LeerGruposDeUnaAplicacionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| borrado |  ``` Required ```  | TODO: Add a parameter description |
| fecha |  ``` Required ```  | TODO: Add a parameter description |
| limit |  ``` Required ```  | TODO: Add a parameter description |
| skip |  ``` Required ```  | TODO: Add a parameter description |
| token |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
boolean borrado = false;
DateTime fecha = 2017-11-15;
int limit = 20;
int skip = 0;
String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";
String contentType = "application/json";
// Invoking the API call with sample inputs
grupos.getGroupsApplicationsIris2GetAsync(borrado, fecha, limit, skip, token, contentType, new APICallBack<LeerGruposDeUnaAplicacionResponse>() {
    public void onSuccess(HttpContext context, LeerGruposDeUnaAplicacionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_groups5a564715825d4f0e94946c1a_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GruposController.getGroups5a564715825d4f0e94946c1aGetAsync") getGroups5a564715825d4f0e94946c1aGetAsync

> *Tags:*  ``` Skips Authentication ``` 

> Devuelve el grupo (123456).


```java
void getGroups5a564715825d4f0e94946c1aGetAsync(
        final String token,
        final APICallBack<LeerUnGrupoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";
// Invoking the API call with sample inputs
grupos.getGroups5a564715825d4f0e94946c1aGetAsync(token, new APICallBack<LeerUnGrupoResponse>() {
    public void onSuccess(HttpContext context, LeerUnGrupoResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_groups_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GruposController.createGroupsPostAsync") createGroupsPostAsync

> *Tags:*  ``` Skips Authentication ``` 

> Crea un nuevo grupo.


```java
void createGroupsPostAsync(
        final String token,
        final CrearUnGrupoRequest body,
        final String contentType,
        final APICallBack<CrearUnGrupoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTc5Mzk5NDd9.-pLDemUYmYPpjG5CZ7VI7UUBcC8mC_KAbEyNpzHsTMw";
    String bodyValue = "\n{\n\n    \"nombre\": \"Informática\",\n\n    \"aplicacion\": \"iris2\",\n\n    \"usuarios\":[\"JUANDE.MC\", \"SCORDOBA\"]\n\n}";
    CrearUnGrupoRequest body = mapper.readValue(bodyValue,new TypeReference<CrearUnGrupoRequest> (){});
    String contentType = "application/json";
    // Invoking the API call with sample inputs
    grupos.createGroupsPostAsync(token, body, contentType, new APICallBack<CrearUnGrupoResponse>() {
        public void onSuccess(HttpContext context, CrearUnGrupoResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_groups_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.GruposController.getGroupsGetAsync") getGroupsGetAsync

> *Tags:*  ``` Skips Authentication ``` 

> 
> Devuelve todos los grupos. Acepta parametros en la url:
> 
> 
> skip: se salta ese número de documentos
> 
> 
> limit: número documentos máximo que devolverá


```java
void getGroupsGetAsync(
        final boolean borrado,
        final DateTime fecha,
        final int limit,
        final int skip,
        final String token,
        final String contentType,
        final APICallBack<LeerGruposResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| borrado |  ``` Required ```  | TODO: Add a parameter description |
| fecha |  ``` Required ```  | TODO: Add a parameter description |
| limit |  ``` Required ```  | TODO: Add a parameter description |
| skip |  ``` Required ```  | TODO: Add a parameter description |
| token |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
boolean borrado = false;
DateTime fecha = 2017-11-15;
int limit = 20;
int skip = 0;
String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTU2NzUxNTJ9.94eDQR7Rn8sUblFCaGzoEC1XxbS8XGYtFhgGzslrzKU";
String contentType = "application/json";
// Invoking the API call with sample inputs
grupos.getGroupsGetAsync(borrado, fecha, limit, skip, token, contentType, new APICallBack<LeerGruposResponse>() {
    public void onSuccess(HttpContext context, LeerGruposResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="boxes_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.BoxesController") BoxesController

### Get singleton instance

The singleton instance of the ``` BoxesController ``` class can be accessed from the API Client.

```java
BoxesController boxes = client.getBoxes();
```

### <a name="get_applications_iris2_boxes_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.BoxesController.getApplicationsIris2BoxesGetAsync") getApplicationsIris2BoxesGetAsync

> *Tags:*  ``` Skips Authentication ``` 

> Devuelve todos los buzones que tienen mensajes de la aplicación (iris2).


```java
void getApplicationsIris2BoxesGetAsync(
        final String token,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTc5Mzk5NDd9.-pLDemUYmYPpjG5CZ7VI7UUBcC8mC_KAbEyNpzHsTMw";
// Invoking the API call with sample inputs
boxes.getApplicationsIris2BoxesGetAsync(token, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="applications_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.ApplicationsController") ApplicationsController

### Get singleton instance

The singleton instance of the ``` ApplicationsController ``` class can be accessed from the API Client.

```java
ApplicationsController applications = client.getApplications();
```

### <a name="create_applications_iris2_messages_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ApplicationsController.createApplicationsIris2MessagesPostAsync") createApplicationsIris2MessagesPostAsync

> *Tags:*  ``` Skips Authentication ``` 

> Crea un nuevo mensaje en los buzones de los usuarios(group) de la aplicación (iris2).


```java
void createApplicationsIris2MessagesPostAsync(
        final String token,
        final CrearUnMensajeAAplicaciNRequest body,
        final String contentType,
        final APICallBack<CrearUnMensajeAAplicaciNResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTc5Mzk5NDd9.-pLDemUYmYPpjG5CZ7VI7UUBcC8mC_KAbEyNpzHsTMw";
    String bodyValue = "\n{\n\n  \"leido\": false,\n\n  \"borrado\": false,\n\n  \"data\":{\n\n    \"type\" : \"recogidas_pendientes\",\n\n    \"numero\" : 7\n\n  }\n\n}";
    CrearUnMensajeAAplicaciNRequest body = mapper.readValue(bodyValue,new TypeReference<CrearUnMensajeAAplicaciNRequest> (){});
    String contentType = "application/json";
    // Invoking the API call with sample inputs
    applications.createApplicationsIris2MessagesPostAsync(token, body, contentType, new APICallBack<CrearUnMensajeAAplicaciNResponse>() {
        public void onSuccess(HttpContext context, CrearUnMensajeAAplicaciNResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_applications_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ApplicationsController.getApplicationsGetAsync") getApplicationsGetAsync

> *Tags:*  ``` Skips Authentication ``` 

> Devuelve todas las aplicaciones que tienen mensajes.


```java
void getApplicationsGetAsync(
        final String token,
        final APICallBack<LeerAplicacionesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| token |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTY4NzUwMDN9.2Eo8_bhTyLVywxi4P2zTSQ86WLXwCMdneJdmygeClaw";
// Invoking the API call with sample inputs
applications.getApplicationsGetAsync(token, new APICallBack<LeerAplicacionesResponse>() {
    public void onSuccess(HttpContext context, LeerAplicacionesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



