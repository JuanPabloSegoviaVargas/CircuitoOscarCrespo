/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

/**
 *
 * @author pablo
 */
public abstract class Participante {
    protected static int Total = 0;
    int id;

    protected String Nombre;
    protected String Documento;
    protected String Apellidos;
    public abstract void getTipoPersona();

    public Participante(String Nombre, String Documento, String Apellidos) {
        this.Nombre = Nombre;
        Total++;
        this.id=Total;
        this.Documento = Documento;
        this.Apellidos = Apellidos;
    }

    public int getId() {
        return id;
    }

    
  
   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

}
