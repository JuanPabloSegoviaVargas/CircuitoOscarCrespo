/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457;

import bo.usfx.sis457.entidades.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author pablo
 */
public class OscarCrespo {
    public static ArrayList<Organizador> organizador;
    public static ArrayList<Competidor> competidor;
    public static ArrayList<Vehiculo> vehiculo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        organizador = new ArrayList<>();
        competidor = new ArrayList<>();
        vehiculo= new ArrayList<>();
        competidor.add(new Piloto("Certificado",545,"B","pablo","segovia","14176648"));
        competidor.add(new Navegante("Mecanico",284,"C","Luis","Arce","8656905"));
        organizador.add(new Organizador("organizador","comision","carlos","Vargas","1410264"));
        vehiculo.add(new Vehiculo("Bartolomeo JSimpson","Nelson Monti",78,"Ferrari","Enzo","cilindrada",2,1,4,10));
        
         menu();
           
    }
        
      
    
    public static void menu(){
        Scanner entradaTeclado;
        int opcion;

        limpiarConsola();
        System.out.println("+==================================================");
        System.out.println("| Programa: Circuito Oscar Crespo                  ");
        System.out.println("| 1) Gestión de Participantes                      ");
        System.out.println("| 2) Gestión de Competidores                       ");
        System.out.println("| 3) Gestión de Organizadores                      ");
        System.out.println("| 4) Gestión de Vehiculos                          ");
        System.out.println("| 0) Salir                                         ");
        System.out.println("+==================================================");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.nextInt();
        switch(opcion){
            case 1:
                GestionParticipantes();
                break;
            case 2:
                GestionCompetidores();
                break;
            case 3:
                GestionOrganizadores();
                break;
            case 4:
                GestionVehiculos();
                break;
            default:
                System.out.println("Salio del programa");
        }
    }
        public static void GestionParticipantes(){ 
            limpiarConsola();
            int opc;
            System.out.println("+==================================================+");
            System.out.println("| Listado de Participantes                         |");
            System.out.println("+==================================================+");
            System.out.println("+==================================================+");
            System.out.println("|    1: Listado de Participantes                   |");
            System.out.println("|    2: Volver al menu                             |");
            System.out.println("+==================================================+");
            Scanner entradaTeclado = new Scanner(System.in);
            opc=entradaTeclado.nextInt();
            
            switch(opc){
                case 1:
                    int i=0;
                    for(Participante participante: competidor){
                        if(participante instanceof Competidor){
                        i++;
                        System.out.println(i + ": " + participante);
                        }   
                    }
                    for( Participante participante: organizador ){
                        if(participante instanceof Organizador){
                            i++;
                            System.out.println(i+ ": "+participante);
                        }
                    }
                case 2: 
                    menu();
                    break;
                    
            }
        }
        public static void GestionCompetidores(){
            limpiarConsola();
            int opc;
            System.out.println("+==================================================+");
            System.out.println("| Gestion Competidores                             |");
            System.out.println("+==================================================+");
            System.out.println("+==================================================+");
            System.out.println("|    1: Listado de Competidores                    |");
            System.out.println("|    2: Anadir Competidor                          |");
            System.out.println("|    3: Modificar Competidor                       |");
            System.out.println("|    4: Eliminar Competidor                        |");
            System.out.println("|    0: Volver al menu                             |");
            System.out.println("+==================================================+");
            Scanner entradaTeclado = new Scanner(System.in);
            opc=entradaTeclado.nextInt();
            
            switch(opc){
                case 1:
                    listarCompetidores();
                    volverMenu();
                    GestionCompetidores();
                    break;
                case 2:
                    anadirCompetidor();
                    volverMenu();
                    GestionCompetidores();
                    break;
                case 3:
                    modificarCompetidor();
                    volverMenu();
                    GestionCompetidores();
                    break;
                case 4:
                    eliminarCompetidor();
                    volverMenu();
                    GestionCompetidores();
                    break;
                default: menu();
            }
            
        }
        public static void GestionOrganizadores(){
            limpiarConsola();
            int opc;
            System.out.println("+==================================================+");
            System.out.println("| Gestion Organizazdores                           |");
            System.out.println("+==================================================+");
            System.out.println("+==================================================+");
            System.out.println("|    1: Listado de ORganizadores                   |");
            System.out.println("|    2: Anadir Organizador                         |");
            System.out.println("|    3: Modificar Organizador                      |");
            System.out.println("|    4: Eliminar Organizador                       |");
            System.out.println("|    0: Volver al menu                             |");
            System.out.println("+==================================================+");
            Scanner entradaTeclado = new Scanner(System.in);
            opc=entradaTeclado.nextInt();
            
            switch(opc){
                case 1:
                    listarOrganizadores();
                    volverMenu();
                    GestionOrganizadores();
                    break;
                case 2:
                    anadirOrganizador();
                    volverMenu();
                    GestionOrganizadores();
                    break;
                case 3:
                    modificarOrganizador();
                    volverMenu();
                    GestionOrganizadores();
                    break;
                case 4:
                    eliminarOrganizador();
                    volverMenu();
                    GestionOrganizadores();
                    break;
                default: menu();
            }
        }
        public static void GestionVehiculos(){
            limpiarConsola();
            int opc;
            System.out.println("+==================================================+");
            System.out.println("| Gestion Vehiculos                                |");
            System.out.println("+==================================================+");
            System.out.println("+==================================================+");
            System.out.println("|    1: Listado de Vehiculos                       |");
            System.out.println("|    2: Anadir vehiculo                            |");
            System.out.println("|    3: Modificar vehiculo                         |");
            System.out.println("|    4: Eliminar Vehiculo                          |");
            System.out.println("|    5: Velocidad Vehiculo                         |");
            System.out.println("|    6: GeoPosicion Vehiculo                       |");
            System.out.println("|    0: Volver al menu                             |");
            System.out.println("+==================================================+");
            Scanner entradaTeclado = new Scanner(System.in);
            opc=entradaTeclado.nextInt();
            
            switch(opc){
                case 1:
                    listarVehiculo();
                    volverMenu();
                    GestionVehiculos();
                    break;
                case 2:
                    anadirVehiculo();
                    volverMenu();
                    GestionVehiculos();
                    break;
                case 3:
                    modificarVehiculo();
                    volverMenu();
                    GestionVehiculos();
                    break;
                case 4:
                    eliminarVehiculo();
                    volverMenu();
                    GestionVehiculos();
                    break;
                case 5:
                    velocidadPromedio();
                    volverMenu();
                    GestionVehiculos();
                case 6:
                    geoposicion();
                    volverMenu();
                    GestionVehiculos();
                default: menu();
            }
        }
        //Competidores
        public static void listarCompetidores(){
            limpiarConsola();
            System.out.println("+==================================================+");
            System.out.println("| Listado de Competidores                          |");
            System.out.println("+==================================================+");
            int i = 0;
            for (Competidor participante: competidor) {
                i++;
                System.out.println(i + ": " + participante);
            }
            if (i == 0) {
                System.out.println("No existen registros");
            }
        }
        public static void anadirCompetidor() {
            String nombre;
            String apellidos;
            String documento;
            String catLic;
            String certificadoMecanica;
            String certificadoAfiliacion;
            int licencia;
            BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
            limpiarConsola();
            try{
                System.out.println("+==================================================+");
                System.out.println("| Añadir Competidor                                |");
                System.out.println("+==================================================+");
                System.out.println("Introduzca el Nombre del competidor");
                nombre = entradaTeclado.readLine();
                System.out.println("Introduzca Apellidos de competidor");
                apellidos = entradaTeclado.readLine();
                System.out.println("Introduzca Carnet de identidad");
                documento=entradaTeclado.readLine();
                System.out.println("Introduzca Nro de Licencia");
                licencia=Integer.parseInt(entradaTeclado.readLine());
                System.out.println("Introduzca la Categoria de la licencia");
                catLic=entradaTeclado.readLine();
                int opcion;
                System.out.print("1: Piloto \n2: Navegante \n elija opcion \n: ");
                opcion = Integer.parseInt(entradaTeclado.readLine());
                switch(opcion){
                    case 1:
                        System.out.print("Introduzca Certificado de afiliacion: ");
                        certificadoAfiliacion = entradaTeclado.readLine();
                        competidor.add(new Piloto(certificadoAfiliacion,licencia,catLic,nombre,apellidos,documento));
                        break;
                    
                    case 2:
                        System.out.print("Introduzca Certificado de Mecanica: ");
                        certificadoMecanica = entradaTeclado.readLine();
                        competidor.add(new Navegante(certificadoMecanica,licencia,catLic,nombre,apellidos,documento));
                        break;
                    }
                    System.out.println("Registro de Docente completado!");
            }catch(Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        public static void modificarCompetidor(){
        String doc;
        //Competidor participante = null;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Competidor                             |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el documento del Competidor a Modificar: ");
            doc = entradaTeclado.readLine();
            for (Competidor participante: competidor) {
                if (participante.getDocumento().equals(doc)) {
                    System.out.print("Modificar el Carnet de Identidad '" + participante.getDocumento()+ "': ");
                    participante.setDocumento(entradaTeclado.readLine());
                    System.out.print("Modificar el Nombre '" + participante.getNombre() + "': ");
                    participante.setNombre(entradaTeclado.readLine());
                    System.out.print("Modificar el apellido '" + participante.getApellidos()+"':");
                    participante.setApellidos(entradaTeclado.readLine());
                    System.out.print("Modificar nro de licencia '" + participante.getNroLicencia()+ "': ");
                    participante.setNroLicencia(Integer.parseInt(entradaTeclado.readLine()));
                    System.out.print("Modificar categoria de la licencia "+participante.getCategoriaLicencia()+"': ");
                    participante.setCategoriaLicencia(entradaTeclado.readLine());
                    
                }
           
            }   
           
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        }
        public static void eliminarCompetidor(){
            
            BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
            limpiarConsola();
            System.out.println("+==================================================+");
            System.out.println("| Borrar Competidor                                |");
            System.out.println("+==================================================+");
            try {
                System.out.print("Introduzca el ID del Competidor a Borrar: ");
                int id;
                id = buscarCompetidor(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                competidor.remove(id);
                System.out.println("Registro de COMPETIDOR borrado!");
            } else {
                System.out.println("El Registro de COMPETIDOR no existe!");
            }  
            } catch(Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        //Organizadores
        public static void listarOrganizadores(){
            limpiarConsola();
            System.out.println("+==================================================+");
            System.out.println("| Listado de Organizadores                         |");
            System.out.println("+==================================================+");
            int i = 0;
            for (Organizador participante: organizador) {
                i++;
                System.out.println(i + ": " + participante);
            }
            if (i == 0) {
                System.out.println("No existen registros");
            }
        }
        public static void anadirOrganizador(){
            String nombre;
            String apellidos;
            String documento;
            String cargo;
            String comision;
            
            
            BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
            limpiarConsola();
            try{
                System.out.println("+==================================================+");
                System.out.println("| Añadir Competidor                                |");
                System.out.println("+==================================================+");
                System.out.println("Introduzca el Nombre del competidor");
                nombre = entradaTeclado.readLine();
                System.out.println("Introduzca Apellidos de competidor");
                apellidos = entradaTeclado.readLine();
                System.out.println("Introduzca Carnet de identidad");
                documento=entradaTeclado.readLine();
                System.out.println("Introduzca comision del organizador");
                comision=entradaTeclado.readLine();                 
                System.out.println("Introduzca el cargo del organizador");
                cargo=entradaTeclado.readLine();
                System.out.println("Registro de Docente completado!");
                organizador.add(new Organizador(cargo,comision,nombre,apellidos,documento));
            }catch(Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        public static void modificarOrganizador(){
            String doc;
        
            BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
            limpiarConsola();
            System.out.println("+==================================================+");
            System.out.println("| Modificar Organizador                            |");
            System.out.println("+==================================================+");
            try {
                System.out.print("Introduzca el documento del Organizador a Modificar: ");
                doc = entradaTeclado.readLine();
                for (Organizador participante: organizador) {
                    if (participante.getDocumento().equals(doc)) {
                        System.out.print("Modificar el Carnet de Identidad '" + participante.getDocumento()+ "': ");
                        participante.setDocumento(entradaTeclado.readLine());
                        System.out.print("Modificar el Nombre '" + participante.getNombre() + "': ");
                        participante.setNombre(entradaTeclado.readLine());
                        System.out.print("Modificar el apellido '" + participante.getApellidos()+"':");
                        participante.setApellidos(entradaTeclado.readLine());
                        System.out.print("Modificar cargo '" + participante.getCargo()+ "': ");
                        participante.setCargo(entradaTeclado.readLine());
                        System.out.print("Modificar Comision "+participante.getComision()+"': ");
                        participante.setComision(entradaTeclado.readLine());
                    
                    }
           
                }   
           
            } catch(Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        public static void eliminarOrganizador(){
            BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
            limpiarConsola();
            System.out.println("+==================================================+");
            System.out.println("| Borrar Competidor                                |");
            System.out.println("+==================================================+");
            try {
                System.out.print("Introduzca el ID del Competidor a Borrar: ");
                int id;
                id = buscarOrganizador(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                organizador.remove(id);
                System.out.println("Registro de ORGANIZADOR borrado!");
            } else {
                System.out.println("El Registro de ORGANIZADOR no existe!");
            }  
            } catch(Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        //vehiculos
        public static void listarVehiculo(){
            limpiarConsola();
            System.out.println("+==================================================+");
            System.out.println("| Listado de Organizadores                         |");
            System.out.println("+==================================================+");
            int i = 0;
            for (Vehiculo automovil: vehiculo) {
                i++;
                System.out.println(i + ": " + automovil);
            }
            if (i == 0) {
                System.out.println("No existen registros");
            }
        }
        public static void anadirVehiculo(){
            String nombre;
            String navegante;
            
            String marca;
            String modelo;
            String cilindrada;
            int numero;
            double latitud,longitud;
            float distancia,tiempo;
            
            
            BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
            limpiarConsola();
            try{
                System.out.println("+==================================================+");
                System.out.println("| Añadir Vehiculo                               |");
                System.out.println("+==================================================+");
                System.out.println("Introduzca el Nombre y apellido del piloto");
                nombre = entradaTeclado.readLine();
                System.out.println("Introduzca el nombre del navegante");
                navegante = entradaTeclado.readLine();
                System.out.println("Introduzca marca del Automovil");
                marca=entradaTeclado.readLine();
                System.out.println("Introduzca Modelod el Automovil");
                modelo=entradaTeclado.readLine();                 
                System.out.println("Introduzca cilindrada");
                cilindrada=entradaTeclado.readLine();
                System.out.println("introduzca el numero del vehiculo");
                numero=Integer.parseInt(entradaTeclado.readLine());
                System.out.println("Introduzca la distancia recorrida");
                distancia=Float.parseFloat(entradaTeclado.readLine());
                System.out.println("Introduzca tiempo de carrera ");
                tiempo=Float.parseFloat(entradaTeclado.readLine());
                System.out.println("Introduzca la Latitud");
                latitud=Double.parseDouble(entradaTeclado.readLine());
                System.out.println("Introduzca la Longitud");
                longitud=Double.parseDouble(entradaTeclado.readLine());
                System.out.println("Registro de Vehiculo completado!");
                
                vehiculo.add(new Vehiculo(nombre,navegante,numero,marca,modelo,cilindrada,distancia,latitud,longitud,tiempo));
            }catch(Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        public static void modificarVehiculo(){
            int num;
        
            BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
            limpiarConsola();
            System.out.println("+==================================================+");
            System.out.println("| Modificar Vehiculo                               |");
            System.out.println("+==================================================+");
            try {
                System.out.print("Introduzca el NUMERO del VEHICULO a Modificar: ");
                num = Integer.parseInt(entradaTeclado.readLine());
                for (Vehiculo participante: vehiculo) {
                    if (participante.getNumero()== num) {
                        System.out.print("Modificar Numero del vehiculo '" + participante.getNumero()+ "': ");
                        participante.setNumero(Integer.parseInt(entradaTeclado.readLine()));
                        System.out.print("Modificar el Nombre del piloto '" + participante.getPilotoABordo()+ "': ");
                        participante.setPilotoABordo(entradaTeclado.readLine());
                        System.out.print("Modificar el nombre del navegante '" + participante.getNavegante()+"':");
                        participante.setNavegante(entradaTeclado.readLine());
                        System.out.print("Modificar marca '" + participante.getMarca()+ "': ");
                        participante.setMarca(entradaTeclado.readLine());
                        System.out.print("Modificar Modelo "+participante.getModelo()+"': ");
                        participante.setModelo(entradaTeclado.readLine());
                        System.out.print("Modificar Cilindrada "+participante.getCilindrada()+"': ");
                        participante.setCilindrada(entradaTeclado.readLine());
                        System.out.print("Modificar Distancia recorrida "+participante.getDistanciaRecorrida()+"': ");
                        participante.setDistanciaRecorrida(Float.parseFloat(entradaTeclado.readLine()));
                        System.out.print("Modificar Latitud "+participante.getLatitud()+"': ");
                        participante.setLatitud(Double.parseDouble(entradaTeclado.readLine()));
                        System.out.print("Modificar Longitud "+participante.getLongitud()+"': ");
                        participante.setLongitud(Double.parseDouble(entradaTeclado.readLine())); 
                        System.out.println("Modificacion exitosa");
                    }
           
                }   
           
            } catch(Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        public static void eliminarVehiculo(){
            BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
            limpiarConsola();
            System.out.println("+==================================================+");
            System.out.println("| Borrar Vehiculo                                  |");
            System.out.println("+==================================================+");
            try {
                System.out.print("Introduzca el ID del VEHICULO a Borrar: ");
                int id;
                id = buscarVehiculo(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                vehiculo.remove(id);
                System.out.println("Registro de VEHICULO borrado!");
            } else {
                System.out.println("El Registro de VEHICULO no existe!");
            }  
            } catch(Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        public static void velocidadPromedio(){
            limpiarConsola();
            int num;
            float velocidad;
            BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("+==================================================+");
            System.out.println("| Velocida de Vehiculo                             |");
            System.out.println("+==================================================+");
            try {
                System.out.print("Introduzca el NUMERO del VEHICULO : ");
                num = Integer.parseInt(entradaTeclado.readLine());
                for (Vehiculo participante: vehiculo) {
                    if (participante.getNumero()== num) {
                       participante.getVelocidadPromedio();
                    }
                    
           
                }   
           
            } catch(Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        public static void geoposicion(){
            limpiarConsola();
            int num;
           
            BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("+==================================================+");
            System.out.println("| Geoposicion de Vehiculo                          |");
            System.out.println("+==================================================+");
            try {
                System.out.print("Introduzca el NUMERO del VEHICULO : ");
                num = Integer.parseInt(entradaTeclado.readLine());
                for (Vehiculo participante: vehiculo) {
                    if (participante.getNumero()== num) {
                       participante.getGeoPosicion();
                    }
                    
           
                }   
           
            } catch(Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        //funciones auxiliares
        public static void volverMenu() {
            String opcion;
            Scanner entradaTeclado = new Scanner(System.in);
            while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
                if (opcion.equals("M")) {
                    break;
                }
            }
        }
        public static int buscarCompetidor(int id) {
            boolean existe = false;
            int i = 0;
            for (Participante persona: competidor) {
                if (persona.getId() == id) {
                    existe = true;
                    break;
                }
                i++;
            }
            return existe?i:-1;
        }
        public static int buscarOrganizador(int id){
            boolean existe = false;
            int i = 0;
            for (Participante persona: organizador) {
                if (persona.getId() == id) {
                    existe = true;
                    break;
                }
                i++;
            }
            return existe?i:-1;
        }
        public static int buscarVehiculo(int id){
            boolean existe = false;
            int i = 0;
            for (Vehiculo persona: vehiculo) {
                if (persona.getId() == id) {
                    existe = true;
                    break;
                }
                i++;
            }
            return existe?i:-1;
        }
        public static void limpiarConsola() {
          System.out.print("\033[H\033[2J");
            System.out.flush();
        }
}
