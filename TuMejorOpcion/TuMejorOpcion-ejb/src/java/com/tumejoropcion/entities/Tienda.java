/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tumejoropcion.entities;

/**
 *
 * @author estudiante
 */
public class Tienda

{
    
    //--Atributos--
    
    private String nombre;
    
    //--Constructor--
    
    public Tienda ()
    {
        
    }
    
    public Tienda (String nombre)
    {
        this.nombre  = nombre;
    }
    
    //--getters/setters--
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }
}
