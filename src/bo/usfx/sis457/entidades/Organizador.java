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
public class Organizador extends Participante{
    protected String Cargo;
    protected String Comision;

    public Organizador(String Cargo, String Comision, String Nombre, String Apellidos, String Documento) {
        super(Nombre, Documento, Apellidos);
        this.Cargo = Cargo;
        this.Comision = Comision;
    }

    @Override

    public int getId() {
        return id;
    }

   

    

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getComision() {
        return Comision;
    }

    public void setComision(String Comision) {
        this.Comision = Comision;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    
    
    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String getDocumento() {
        return Documento;
    }

    @Override
    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    @Override
    public String getApellidos() {
        return Apellidos;
    }

    @Override
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    

    @Override
    public void getTipoPersona() {
        System.out.println("Organizador");
    }
     @Override
    public String toString(){
        return"Organizador{" 
                +"id="+this.id
                + ", Nombre=" + this.Nombre 
                + ", Apellidos=" + this.Apellidos 
                + ", documento=" + this.Documento 
                + ", cargo=" +this.Cargo
                
                + ", Comision=" +this.Comision 
                +'}';
    }
}
