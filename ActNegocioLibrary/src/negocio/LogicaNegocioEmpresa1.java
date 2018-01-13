/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Elias Barrientos
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;


public class LogicaNegocioEmpresa1 extends LogicaNegocio {
    
    @Override
    public void register_Client(String nombre, String apellido, String cedula) { //Registra el usuario que quiera pertenecer
            InterfazDAO bd = new ImpDAOJson(); //Creo la interfaz e instancio la clase ImpDAOJson
            try {
                if(!verify_Clients(Integer.parseInt(cedula))) //Si no hay ningun duplicado
                    bd.setClientEmpresa(nombre,apellido, cedula); //Se crea el usuario
                else
                    System.out.println("El usuario es un duplicado"); //Sino se manda un aviso de error
            } catch (IOException ex) {
                Logger.getLogger(LogicaNegocioEmpresa1.class.getName()).log(Level.SEVERE, null, ex); 
                // Si hay problemas se manda una excepcion
            }
        
    }

    @Override
    public boolean verify_Clients(int id) { // Clase booleana que verifica si el usuario es duplicado
        boolean Logica = false; //Variable logica
        InterfazDAO bd = new ImpDAOJson(); //Se hace lo mismo que en el metodo register
        Cliente client; //se crea un cliente
        try {
            client = bd.getOneClientEmpresa(id);
            
            if(client != null){
             Logica = true;  //Si encuentra un usuario el booleano es true
            }
          
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocioEmpresa1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      return Logica;
    }

    @Override
    public void Consulta_client(int id) { //Se busca el cliente perteneciente al id que se coloco
        System.out.println("Procesando...");
        Cliente client; //Usuario nulo
        InterfazDAO bd = new ImpDAOJson();
        try {
            client = bd.getOneClientEmpresa(id); //Si no devuelve nulo la base de datos
            if(client != null)
            System.out.println(client.toString()); // Se imprime el usuario
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocioEmpresa1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
