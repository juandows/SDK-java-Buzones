/*
 * APIBuzonesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class LeerGruposDeUnaAplicacionResponseBuilder {
    //the instance to build
    private LeerGruposDeUnaAplicacionResponse leerGruposDeUnaAplicacionResponse;

    /**
     * Default constructor to initialize the instance
     */
    public LeerGruposDeUnaAplicacionResponseBuilder() {
        leerGruposDeUnaAplicacionResponse = new LeerGruposDeUnaAplicacionResponse();
    }

    public LeerGruposDeUnaAplicacionResponseBuilder data(List<Data5> data) {
        leerGruposDeUnaAplicacionResponse.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public LeerGruposDeUnaAplicacionResponse build() {
        return leerGruposDeUnaAplicacionResponse;
    }
}