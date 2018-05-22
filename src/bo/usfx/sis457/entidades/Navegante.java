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
public class Navegante extends Competidor{
    protected String CertificadoMecanica;

    public Navegante(String CertificadoMecanica, int NroLicencia, String CategoriaLicencia, String Nombre, String Apellidos, String Documento) {
        super(NroLicencia, CategoriaLicencia, Nombre, Documento, Apellidos);
        this.CertificadoMecanica = CertificadoMecanica;
    }

    

    public String getCertificadoMecanica() {
        return CertificadoMecanica;
    }

    public void setCertificadoMecanica(String CertificadoMecanica) {
        this.CertificadoMecanica = CertificadoMecanica;
    }

    
        @Override
    public String toString(){
        return"Navegante{"
                +"id="+this.id
                + ", Nombre=" + this.Nombre 
                + ", Apellidos=" + this.Apellidos 
                + ", documento=" + this.Documento 
                + ", licencia=" +this.CategoriaLicencia
                + ", Numer licencia=" +this.NroLicencia 
                + ",Certificado de mecanica="+this.CertificadoMecanica
                +'}';
    } 
}
