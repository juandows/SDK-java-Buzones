/*
 * APIBuzonesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class CrearUnGrupoResponseBuilder {
    //the instance to build
    private CrearUnGrupoResponse crearUnGrupoResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CrearUnGrupoResponseBuilder() {
        crearUnGrupoResponse = new CrearUnGrupoResponse();
    }

    public CrearUnGrupoResponseBuilder data(Data5 data) {
        crearUnGrupoResponse.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CrearUnGrupoResponse build() {
        return crearUnGrupoResponse;
    }
}