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
public class Turnos {
    private String idTurno;
    private String opcionTurno;
    private String numero;
       
    
    public void setIdTurno(String idTurnoP)
    {
    this.idTurno=idTurnoP;
     }
    public String getIdTurno ()
    {
        return this.idTurno;
    }
    
    
     public void setOpcionTurno(String opcionTurnoP)
    {
    this.opcionTurno=opcionTurnoP;
     }
    public String getOpcionTurno ()
    {
        return this.opcionTurno;
    }
    
    
     public void setNumero(String numeroP)
    {
    this.numero=numeroP;
     }
    public String getNumero ()
    {
        return this.numero;
    }
    
    public void brindarAtencion(){
        
    }
}
