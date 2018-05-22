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
public class Competidor extends Participante{
    protected int NroLicencia;
    protected String CategoriaLicencia;

    public Competidor(int NroLicencia, String CategoriaLicencia, String Nombre, String Documento, String Apellidos) {
        super(Nombre, Documento, Apellidos);
        this.NroLicencia = NroLicencia;
        this.CategoriaLicencia = CategoriaLicencia;
    }

    @Override
    public int getId() {
        return id;
    }



   

    public int getNroLicencia() {
        return NroLicencia;
    }

    public void setNroLicencia(int NroLicencia) {
        this.NroLicencia = NroLicencia;
    }

    public String getCategoriaLicencia() {
        return CategoriaLicencia;
    }

    public void setCategoriaLicencia(String CategoriaLicencia) {
        this.CategoriaLicencia = CategoriaLicencia;
    }

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
        System.out.println("Competidor");
    }
    @Override
    public String toString(){
        return"Competidor{"
                +"id="+this.id
                + ", Nombre=" + this.Nombre 
                + ", Apellidos=" + this.Apellidos 
                + ", documento=" + this.Documento 
                + ", licencia=" +this.CategoriaLicencia
                + ", Numer licencia=" +this.NroLicencia 
                +'}';
    }


    
}
