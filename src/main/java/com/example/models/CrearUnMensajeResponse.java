/*
 * APIBuzonesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CrearUnMensajeResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5742614216111190632L;
    private Data5 data;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public Data5 getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (Data5 value) { 
        this.data = value;
    }
 
}
 