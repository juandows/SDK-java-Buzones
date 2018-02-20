/*
 * APIBuzonesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class ModificarUnMensajeLeidoBorradoRequestBuilder {
    //the instance to build
    private ModificarUnMensajeLeidoBorradoRequest modificarUnMensajeLeidoBorradoRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ModificarUnMensajeLeidoBorradoRequestBuilder() {
        modificarUnMensajeLeidoBorradoRequest = new ModificarUnMensajeLeidoBorradoRequest();
    }

    public ModificarUnMensajeLeidoBorradoRequestBuilder leido(boolean leido) {
        modificarUnMensajeLeidoBorradoRequest.setLeido(leido);
        return this;
    }

    public ModificarUnMensajeLeidoBorradoRequestBuilder borrado(boolean borrado) {
        modificarUnMensajeLeidoBorradoRequest.setBorrado(borrado);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ModificarUnMensajeLeidoBorradoRequest build() {
        return modificarUnMensajeLeidoBorradoRequest;
    }
}