/*
 * APIBuzonesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ModificarUnMensajeLeidoBorradoRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5705376593404717727L;
    private boolean leido;
    private boolean borrado;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("leido")
    public boolean getLeido ( ) { 
        return this.leido;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("leido")
    public void setLeido (boolean value) { 
        this.leido = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("borrado")
    public boolean getBorrado ( ) { 
        return this.borrado;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("borrado")
    public void setBorrado (boolean value) { 
        this.borrado = value;
    }
 
}
 