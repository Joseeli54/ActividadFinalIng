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
    public void register_Client(String nombre, String apellido, String cedula) {
            InterfazDAO bd = new ImpDAOJson();
            try {
                if(!verify_Clients(Integer.parseInt(cedula)))
                    bd.setClientEmpresa(nombre,apellido, cedula);
                else
                    System.out.println("El usuario es un duplicado");
            } catch (IOException ex) {
                Logger.getLogger(LogicaNegocioEmpresa1.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    @Override
    public boolean verify_Clients(int id) {
        boolean Logica = false;
        InterfazDAO bd = new ImpDAOJson();
        Cliente client;
        try {
            client = bd.getOneClientEmpresa(id);
            
            if(client != null){
             Logica = true;
            }
          
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocioEmpresa1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      return Logica;
    }

    @Override
    public void Consulta_client(int id) {
        System.out.println("Procesando...");
        Cliente client;
        InterfazDAO bd = new ImpDAOJson();
        try {
            client = bd.getOneClientEmpresa(id);
            if(client != null)
            System.out.println(client.toString());
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocioEmpresa1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
