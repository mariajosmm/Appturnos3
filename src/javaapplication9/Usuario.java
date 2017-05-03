/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author sena
 */
public class Usuario {
    
    private Turnos turno0;
    private String id;
    private String nombre;
    private String ciudad;
    private String contraseña;
    
    public void setTurno0(Turnos turno0P)
    {
    this.turno0=turno0P;
     }
    public Turnos getTurno0 ()
    {
        return this.turno0;
    }
       
    public void setId(String idP)
    {
    this.id=idP;
     }
    public String getId ()
    {
        return this.id;
    }
    
    
    public void setNombre(String nombreP)
    {
    this.nombre=nombreP;
     }
    public String getNombre ()
    {
        return this.nombre;
    }
    
    
    public void setCiudad(String ciudadP)
    {
    this.ciudad=ciudadP;
     }
    public String getCiudad ()
    {
        return this.ciudad;
    }
    
    
    public void setContraseña(String contraseñaP)
    {
    this.contraseña=contraseñaP;
     }
    public String getContraseña ()
    {
        return this.contraseña;
    }
    
    public void seleccionarTurno(){
        
    }
}
