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
public class Piloto extends Competidor{
    protected String CertificadoAfiliacion;

    public Piloto(String CertificadoAfiliacion, int NroLicencia, String CategoriaLicencia, String Nombre, String Apellidos, String Documento) {
        super(NroLicencia, CategoriaLicencia, Nombre, Documento, Apellidos);
        this.CertificadoAfiliacion = CertificadoAfiliacion;
    }

    

    public String getCertificadoAfiliacion() {
        return CertificadoAfiliacion;
    }

    public void setCertificadoAfiliacion(String CertificadoAfiliacion) {
        this.CertificadoAfiliacion = CertificadoAfiliacion;
    }
     @Override
    public String toString(){
        return"Piloto{"
                +"id="+this.id
                + ", Nombre=" + this.Nombre 
                + ", Apellidos=" + this.Apellidos 
                + ", documento=" + this.Documento 
                + ", licencia=" +this.CategoriaLicencia
                + ", Numer licencia=" +this.NroLicencia 
                + ",Certificado de afiliaciom="+this.CertificadoAfiliacion
                +'}';
    }
    
}
