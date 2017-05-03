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
public class Empresa {
    private String idEmpresa;
    private String nombreEmpresa;
    private String ciudadEmpresa;
    private String direccion;
    
    public void setIdEmpresa (String idEmpresaP)
   {
       this.idEmpresa=idEmpresaP;
   }
           
    public String getIdEmpresa()
    {
        return this.idEmpresa;
    }
    
    
     public void setNombreEmpresa (String nombreEmpresaP)
   {
       this.nombreEmpresa=nombreEmpresaP;
   }
           
    public String getNombreEmpresa()
    {
        return this.nombreEmpresa;
    }
    
    
     public void setCiudadEmpresa (String ciudadEmpresaP)
   {
       this.ciudadEmpresa=ciudadEmpresaP;
   }
           
    public String getCiudadEmpresa()
    {
        return this.ciudadEmpresa;
            }
    
     public void setDireccion (String direccionP)
   {
       this.direccion=direccionP;
   }
           
    public String getDireccion()
    {
        return this.direccion;
    }
    
    public void brindarServicio (){
        
    }
    
}
