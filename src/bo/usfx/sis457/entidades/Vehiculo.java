/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.interfaces.CaracteristicasCompetencia;
import bo.usfx.sis457.interfaces.CaracteristicasOcupantes;

/**
 *
 * @author pablo
 */
public class Vehiculo implements CaracteristicasCompetencia  {
    protected static int Total = 0;
    int id;
    protected int Numero;
    protected String Marca;
    protected String Modelo;
    protected String Cilindrada;
    protected float DistanciaRecorrida;
    protected double Latitud;
    protected double Longitud;
    protected  String PilotoABordo;
    protected  String Navegante;
    protected float tiempo;

    public String getPilotoABordo() {
        return PilotoABordo;
    }

    public void setPilotoABordo(String PilotoABordo) {
        this.PilotoABordo = PilotoABordo;
    }

    public String getNavegante() {
        return Navegante;
    }

    public void setNavegante(String Navegante) {
        this.Navegante = Navegante;
    }

    public Vehiculo(String nombre,String nombreN,int Numero, String Marca, String Modelo, String Cilindrada, float DistanciaRecorrida, double Latitud, double Longitud,float tiempo) {
        this.Numero = Numero;
        Total++;
        this.PilotoABordo=nombre;
        this.Navegante=nombreN;
        this.id=Total;
        this.tiempo=tiempo;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Cilindrada = Cilindrada;
        this.DistanciaRecorrida = DistanciaRecorrida;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }



    public int getId() {
        return id;
    }

   

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(String Cilindrada) {
        this.Cilindrada = Cilindrada;
    }

    public float getDistanciaRecorrida() {
        return DistanciaRecorrida;
    }

    public void setDistanciaRecorrida(float DistanciaRecorrida) {
        this.DistanciaRecorrida = DistanciaRecorrida;
    }

    public double getLatitud() {
        return Latitud;
    }

    public void setLatitud(double Latitud) {
        this.Latitud = Latitud;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }
    
    
    
   
     @Override
    public String toString(){
        return"Vehiculo{"
                + "id="+this.id
                + ", Piloto=" + this.PilotoABordo
                + ", navegante"+ this.Navegante
                + ", Numero=" + this.Numero 
                + ", Marca=" + this.Marca 
                + ", modelo=" + this.Modelo 
                + ", cilindrada=" +this.Cilindrada
                + ", Distancia recorrida=" +this.DistanciaRecorrida 
                + ", Latitud="+this.Latitud
                + ", Longitud=" +this.Longitud
                + ", Tiempo="+this.tiempo
                
                +'}';
    }

    @Override
    public void getVelocidadPromedio() {
        float velocidad = this.DistanciaRecorrida/this.tiempo;
        System.out.println("velocidad promedio= "+velocidad);
    }

    @Override
    public void getGeoPosicion() {
        System.out.println("Geoposicion= "+this.Latitud+","+this.Longitud);
    }
    
}
